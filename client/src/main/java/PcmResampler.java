import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class PcmResampler {

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
	private int anInt7209;

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
	private int anInt7210;

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(II)V")
	public PcmResampler(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static295.method5099(arg1, arg0);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anInt7209 = local20;
			this.anInt7210 = local16;
			this.anIntArrayArray61 = new int[local20][14];
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray61[local33];
				@Pc(48) double local48 = (double) local33 / (double) local20 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local48 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				@Pc(77) double local77 = (double) local16 / (double) local20;
				while (local66 > local56) {
					@Pc(87) double local87 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(89) double local89 = local77;
					if (local87 < -1.0E-4D || local87 > 1.0E-4D) {
						local89 = local77 * (Math.sin(local87) / local87);
					}
					local89 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local89 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)I")
	public int method6445(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray61 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt7210 / (long) this.anInt7209);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(B[B)[B")
	public byte[] method6446(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray61 != null) {
			@Pc(28) int local28 = (int) ((long) arg0.length * (long) this.anInt7210 / (long) this.anInt7209) + 14;
			@Pc(31) int[] local31 = new int[local28];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
				@Pc(43) byte local43 = arg0[local37];
				@Pc(48) int[] local48 = this.anIntArrayArray61[local35];
				for (@Pc(50) int local50 = 0; local50 < 14; local50++) {
					local31[local33 + local50] += local48[local50] * local43;
				}
				local35 += this.anInt7210;
				@Pc(81) int local81 = local35 / this.anInt7209;
				local33 += local81;
				local35 -= local81 * this.anInt7209;
			}
			arg0 = new byte[local28];
			for (@Pc(102) int local102 = 0; local102 < local28; local102++) {
				@Pc(112) int local112 = local31[local102] + 32768 >> 16;
				if (local112 < -128) {
					arg0[local102] = -128;
				} else if (local112 > 127) {
					arg0[local102] = 127;
				} else {
					arg0[local102] = (byte) local112;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZI)I")
	public int method6447(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray61 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt7210 / (long) this.anInt7209) + 6;
		}
		return arg0;
	}
}
