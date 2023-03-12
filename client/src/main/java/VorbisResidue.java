import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class VorbisResidue {

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
	private final int anInt5099 = Static267.readBits(16);

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
	private final int begin = Static267.readBits(24);

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
	private final int anInt5103 = Static267.readBits(24);

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
	private final int partitionSize = Static267.readBits(24) + 1;

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
	private final int classifications = Static267.readBits(6) + 1;

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
	private final int classBook = Static267.readBits(8);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "[I")
	private final int[] books;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V")
	public VorbisResidue() {
		@Pc(33) int[] local33 = new int[this.classifications];
		@Pc(38) int local38;
		for (@Pc(35) int local35 = 0; local35 < this.classifications; local35++) {
			local38 = 0;
			@Pc(41) int local41 = Static267.readBits(3);
			@Pc(47) boolean local47 = Static267.readBit() != 0;
			if (local47) {
				local38 = Static267.readBits(5);
			}
			local33[local35] = local38 << 3 | local41;
		}
		this.books = new int[this.classifications * 8];
		for (local38 = 0; local38 < this.classifications * 8; local38++) {
			this.books[local38] = (local33[local38 >> 3] & 0x1 << (local38 & 0x7)) == 0 ? -1 : Static267.readBits(8);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "([FIZ)V")
	public void synthesize(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = Static267.codebooks[this.classBook].dimensions;
		@Pc(25) int local25 = this.anInt5103 - this.begin;
		@Pc(30) int local30 = local25 / this.partitionSize;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = Static267.codebooks[this.classBook].decodeScalar();
					for (local51 = local19 - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.classifications;
						}
						local47 /= this.classifications;
					}
				}
				for (local47 = 0; local47 < local19; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.books[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.begin + local38 * this.partitionSize;
						@Pc(104) Class175 local104 = Static267.codebooks[local90];
						@Pc(113) int local113;
						if (this.anInt5099 == 0) {
							local113 = this.partitionSize / local104.dimensions;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.method4438();
								for (@Pc(121) int local121 = 0; local121 < local104.dimensions; local121++) {
									arg0[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.partitionSize) {
								@Pc(153) float[] local153 = local104.method4438();
								for (@Pc(155) int local155 = 0; local155 < local104.dimensions; local155++) {
									arg0[local100 + local113] += local153[local155];
									local113++;
								}
							}
						}
					}
					local38++;
					if (local38 >= local30) {
						break;
					}
				}
			}
		}
	}
}
