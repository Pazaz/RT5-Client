import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class224 {

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray143;

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
	private int anInt5812;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
	private int anInt5819;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(II)V")
	public Class224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(14) int local14 = Static317.method4579(arg1, arg0);
			@Pc(18) int local18 = arg0 / local14;
			@Pc(22) int local22 = arg1 / local14;
			this.anIntArrayArray143 = new int[local18][14];
			this.anInt5812 = local18;
			this.anInt5819 = local22;
			for (@Pc(35) int local35 = 0; local35 < local18; local35++) {
				@Pc(41) int[] local41 = this.anIntArrayArray143[local35];
				@Pc(49) double local49 = (double) local35 / (double) local18 + 6.0D;
				@Pc(57) int local57 = (int) Math.floor(local49 + 1.0D - 7.0D);
				if (local57 < 0) {
					local57 = 0;
				}
				@Pc(67) int local67 = (int) Math.ceil(local49 + 7.0D);
				if (local67 > 14) {
					local67 = 14;
				}
				@Pc(78) double local78 = (double) local22 / (double) local18;
				while (local57 < local67) {
					@Pc(86) double local86 = ((double) local57 - local49) * 3.141592653589793D;
					@Pc(88) double local88 = local78;
					if (local86 < -1.0E-4D || local86 > 1.0E-4D) {
						local88 = local78 * (Math.sin(local86) / local86);
					}
					local88 *= Math.cos(((double) local57 - local49) * 0.2243994752564138D) * 0.46D + 0.54D;
					local41[local57] = (int) Math.floor(local88 * 65536.0D + 0.5D);
					local57++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(II)I")
	public int method5231(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray143 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt5819 / (long) this.anInt5812) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)I")
	public int method5234(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray143 != null) {
			arg0 = (int) ((long) this.anInt5819 * (long) arg0 / (long) this.anInt5812);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I[B)[B")
	public byte[] method5235(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray143 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt5819 / (long) this.anInt5812) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) byte local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray143[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local24 + local41] += local39[local41] * local34;
				}
				local26 += this.anInt5819;
				@Pc(74) int local74 = local26 / this.anInt5812;
				local26 -= this.anInt5812 * local74;
				local24 += local74;
			}
			arg0 = new byte[local19];
			for (@Pc(97) int local97 = 0; local97 < local19; local97++) {
				@Pc(109) int local109 = local22[local97] + 32768 >> 16;
				if (local109 < -128) {
					arg0[local97] = -128;
				} else if (local109 > 127) {
					arg0[local97] = 127;
				} else {
					arg0[local97] = (byte) local109;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "([SI)[S")
	public short[] method5237(@OriginalArg(0) short[] arg0) {
		if (this.anIntArrayArray143 != null) {
			@Pc(23) int local23 = (int) ((long) this.anInt5819 * (long) arg0.length / (long) this.anInt5812) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) short local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray143[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local28 + local45] += local43[local45] * local38 >> 2;
				}
				local30 += this.anInt5819;
				@Pc(80) int local80 = local30 / this.anInt5812;
				local28 += local80;
				local30 -= this.anInt5812 * local80;
			}
			arg0 = new short[local23];
			for (@Pc(103) int local103 = 0; local103 < local23; local103++) {
				@Pc(115) int local115 = local26[local103] + 8192 >> 14;
				if (local115 < -32768) {
					arg0[local103] = -32768;
				} else if (local115 > 32767) {
					arg0[local103] = 32767;
				} else {
					arg0[local103] = (short) local115;
				}
			}
		}
		return arg0;
	}
}
