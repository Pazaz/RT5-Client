import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class SynthSound {

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "[Lclient!ph;")
	private final SynthInstrument[] instruments = new SynthInstrument[10];

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
	private int start;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
	private int end;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!bt;)V")
	public SynthSound(@OriginalArg(0) Packet arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.g1();
			if (local12 != 0) {
				arg0.pos--;
				this.instruments[local7] = new SynthInstrument();
				this.instruments[local7].method4552(arg0);
			}
		}
		this.start = arg0.g2();
		this.end = arg0.g2();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!r;II)Lclient!wk;")
	public static SynthSound create(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.fetchFile(arg2, arg1);
		return local5 == null ? null : new SynthSound(new Packet(local5));
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "()[B")
	private byte[] getSamples() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.instruments[local3] != null && this.instruments[local3].anInt4960 + this.instruments[local3].anInt4963 > local1) {
				local1 = this.instruments[local3].anInt4960 + this.instruments[local3].anInt4963;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.instruments[local54] != null) {
				@Pc(70) int local70 = this.instruments[local54].anInt4960 * 22050 / 1000;
				@Pc(80) int local80 = this.instruments[local54].anInt4963 * 22050 / 1000;
				@Pc(92) int[] local92 = this.instruments[local54].method4550(local70, this.instruments[local54].anInt4960);
				for (@Pc(94) int local94 = 0; local94 < local70; local94++) {
					@Pc(107) int local107 = local52[local94 + local80] + (local92[local94] >> 8);
					if ((local107 + 128 & 0xFFFFFF00) != 0) {
						local107 = local107 >> 31 ^ 0x7F;
					}
					local52[local94 + local80] = (byte) local107;
				}
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "()Lclient!jn;")
	public PcmSound toPcmSound() {
		@Pc(2) byte[] local2 = this.getSamples();
		return new PcmSound(22050, local2, this.start * 22050 / 1000, this.end * 22050 / 1000);
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "()I")
	public int getStart() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.instruments[local3] != null && this.instruments[local3].anInt4963 / 20 < local1) {
				local1 = this.instruments[local3].anInt4963 / 20;
			}
		}
		if (this.start < this.end && this.start / 20 < local1) {
			local1 = this.start / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.instruments[local55] != null) {
				this.instruments[local55].anInt4963 -= local1 * 20;
			}
		}
		if (this.start < this.end) {
			this.start -= local1 * 20;
			this.end -= local1 * 20;
		}
		return local1;
	}
}
