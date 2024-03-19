import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class1_Sub1_Sub20 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wh", name = "N", descriptor = "[I")
	private final int[] anIntArray588;

	@OriginalMember(owner = "client!wh", name = "A", descriptor = "[I")
	private final int[] anIntArray587;

	@OriginalMember(owner = "client!wh", name = "Q", descriptor = "Lclient!ak;")
	private final Class1_Sub2 aClass1_Sub2_3;

	@OriginalMember(owner = "client!wh", name = "F", descriptor = "Lclient!ak;")
	private final Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!wh", name = "G", descriptor = "Lclient!ak;")
	private final Class1_Sub2 aClass1_Sub2_2;

	@OriginalMember(owner = "client!wh", name = "O", descriptor = "[Lclient!ak;")
	private final Class1_Sub2[] aClass1_Sub2Array42;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
	private Class1_Sub1_Sub20() {
		this.anIntArray588 = new int[0];
		this.anIntArray587 = new int[0];
		this.aClass1_Sub2_3 = new Class1_Sub2_Sub5(0);
		this.aClass1_Sub2_3.anInt7266 = 1;
		this.aClass1_Sub2_1 = new Class1_Sub2_Sub5();
		this.aClass1_Sub2_1.anInt7266 = 1;
		this.aClass1_Sub2_2 = new Class1_Sub2_Sub5();
		this.aClass1_Sub2Array42 = new Class1_Sub2[] { this.aClass1_Sub2_1, this.aClass1_Sub2_2, this.aClass1_Sub2_3 };
		this.aClass1_Sub2_2.anInt7266 = 1;
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!il;)V")
	public Class1_Sub1_Sub20(@OriginalArg(0) Class1_Sub16 arg0) {
		@Pc(7) int local7 = arg0.method5761();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass1_Sub2Array42 = new Class1_Sub2[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub2 local26 = Static339.method6156(arg0);
			if (local26.method6075() >= 0) {
				local9++;
			}
			if (local26.method6073() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass1_Sub2Array41.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method5761();
			}
			this.aClass1_Sub2Array42[local20] = local26;
		}
		this.anIntArray587 = new int[local9];
		local9 = 0;
		this.anIntArray588 = new int[local11];
		local11 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class1_Sub2 local98 = this.aClass1_Sub2Array42[local91];
			local50 = local98.aClass1_Sub2Array41.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass1_Sub2Array41[local104] = this.aClass1_Sub2Array42[local14[local91][local104]];
			}
			@Pc(130) int local130 = local98.method6075();
			@Pc(134) int local134 = local98.method6073();
			if (local130 > 0) {
				this.anIntArray587[local9++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray588[local11++] = local134;
			}
			local14[local91] = null;
		}
		this.aClass1_Sub2_1 = this.aClass1_Sub2Array42[arg0.method5761()];
		this.aClass1_Sub2_2 = this.aClass1_Sub2Array42[arg0.method5761()];
		this.aClass1_Sub2_3 = this.aClass1_Sub2Array42[arg0.method5761()];
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!fl;ZDILclient!qj;B)[I")
	public int[] method6108(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class162 arg5) {
		Static66.aClass162_63 = arg5;
		Static95.anInterface4_3 = arg1;
		for (@Pc(17) int local17 = 0; local17 < this.aClass1_Sub2Array42.length; local17++) {
			this.aClass1_Sub2Array42[local17].method6080(arg0, arg4);
		}
		Static223.method4326(arg3);
		Static184.method5962(arg0, arg4);
		@Pc(47) int[] local47 = new int[arg0 * 4 * arg4];
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < arg0; local51++) {
			@Pc(69) int[] local69;
			@Pc(67) int[] local67;
			@Pc(65) int[] local65;
			@Pc(63) int[] local63;
			if (this.aClass1_Sub2_1.aBoolean515) {
				local63 = this.aClass1_Sub2_1.method6085(local51);
				local65 = local63;
				local67 = local63;
				local69 = local63;
			} else {
				@Pc(77) int[][] local77 = this.aClass1_Sub2_1.method6081(local51);
				local69 = local77[0];
				local65 = local77[2];
				local67 = local77[1];
			}
			if (arg2) {
				local49 = local51;
			}
			if (this.aClass1_Sub2_2.aBoolean515) {
				local63 = this.aClass1_Sub2_2.method6085(local51);
			} else {
				local63 = this.aClass1_Sub2_2.method6081(local51)[0];
			}
			for (@Pc(119) int local119 = arg4 - 1; local119 >= 0; local119--) {
				@Pc(127) int local127 = local69[local119] >> 4;
				if (local127 > 255) {
					local127 = 255;
				}
				if (local127 < 0) {
					local127 = 0;
				}
				@Pc(147) int local147 = local67[local119] >> 4;
				if (local147 > 255) {
					local147 = 255;
				}
				if (local147 < 0) {
					local147 = 0;
				}
				@Pc(165) int local165 = local65[local119] >> 4;
				if (local165 > 255) {
					local165 = 255;
				}
				local147 = Static18.anIntArray47[local147];
				local127 = Static18.anIntArray47[local127];
				if (local165 < 0) {
					local165 = 0;
				}
				local165 = Static18.anIntArray47[local165];
				@Pc(208) int local208;
				if (local127 == 0 && local147 == 0 && local165 == 0) {
					local208 = 0;
				} else {
					local208 = local63[local119] >> 4;
					if (local208 > 255) {
						local208 = 255;
					}
					if (local208 < 0) {
						local208 = 0;
					}
				}
				local47[local49++] = (local147 << 8) + (local127 << 16) + (local208 << 24) + local165;
				if (arg2) {
					local49 += arg4 - 1;
				}
			}
		}
		for (@Pc(268) int local268 = 0; local268 < this.aClass1_Sub2Array42.length; local268++) {
			this.aClass1_Sub2Array42[local268].method6079();
		}
		return local47;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!qj;IILclient!fl;IZ)[F")
	public float[] method6110(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		Static66.aClass162_63 = arg0;
		Static95.anInterface4_3 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub2Array42.length; local11++) {
			this.aClass1_Sub2Array42[local11].method6080(arg3, arg1);
		}
		Static184.method5962(arg3, arg1);
		@Pc(42) float[] local42 = new float[arg3 * 4 * arg1];
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < arg3; local51++) {
			@Pc(67) int[] local67;
			@Pc(65) int[] local65;
			@Pc(69) int[] local69;
			if (this.aClass1_Sub2_1.aBoolean515) {
				@Pc(63) int[] local63 = this.aClass1_Sub2_1.method6085(local51);
				local65 = local63;
				local67 = local63;
				local69 = local63;
			} else {
				@Pc(77) int[][] local77 = this.aClass1_Sub2_1.method6081(local51);
				local65 = local77[1];
				local69 = local77[2];
				local67 = local77[0];
			}
			@Pc(99) int[] local99;
			if (this.aClass1_Sub2_2.aBoolean515) {
				local99 = this.aClass1_Sub2_2.method6085(local51);
			} else {
				local99 = this.aClass1_Sub2_2.method6081(local51)[0];
			}
			if (arg4) {
				local49 = local51 << 2;
			}
			@Pc(125) int[] local125;
			if (this.aClass1_Sub2_3.aBoolean515) {
				local125 = this.aClass1_Sub2_3.method6085(local51);
			} else {
				local125 = this.aClass1_Sub2_3.method6081(local51)[0];
			}
			for (@Pc(139) int local139 = arg1 - 1; local139 >= 0; local139--) {
				@Pc(148) float local148 = (float) local99[local139] / 4096.0F;
				if (local148 < 0.0F) {
					local148 = 0.0F;
				} else if (local148 > 1.0F) {
					local148 = 1.0F;
				}
				@Pc(175) float local175 = ((float) local125[local139] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local42[local49++] = (float) local67[local139] * local175;
				local42[local49++] = (float) local65[local139] * local175;
				local42[local49++] = (float) local69[local139] * local175;
				local42[local49++] = local148;
				if (arg4) {
					local49 += (arg1 << 2) - 4;
				}
			}
		}
		for (@Pc(233) int local233 = 0; local233 < this.aClass1_Sub2Array42.length; local233++) {
			this.aClass1_Sub2Array42[local233].method6079();
		}
		return local42;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!fl;Lclient!qj;)Z")
	public boolean method6112(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) Class162 arg1) {
		@Pc(9) int local9;
		if (Static167.anInt4042 > 0) {
			for (local9 = 0; local9 < this.anIntArray587.length; local9++) {
				if (!arg1.method4626(this.anIntArray587[local9], Static167.anInt4042)) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray587.length; local9++) {
				if (!arg1.method4615(this.anIntArray587[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray588.length; local9++) {
			if (!arg0.method166(this.anIntArray588[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZIDILclient!qj;Lclient!fl;ZZ)[I")
	public int[] method6114(@OriginalArg(1) int arg0, @OriginalArg(2) double arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class162 arg3, @OriginalArg(5) Interface4 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6) {
		Static95.anInterface4_3 = arg4;
		Static66.aClass162_63 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub2Array42.length; local11++) {
			this.aClass1_Sub2Array42[local11].method6080(arg0, arg2);
		}
		Static223.method4326(arg1);
		Static184.method5962(arg0, arg2);
		@Pc(43) int[] local43 = new int[arg2 * arg0];
		@Pc(53) int local53;
		@Pc(49) int local49;
		@Pc(47) byte local47;
		if (arg6) {
			local47 = -1;
			local49 = -1;
			local53 = arg2 - 1;
		} else {
			local53 = 0;
			local49 = arg2;
			local47 = 1;
		}
		@Pc(63) int local63 = 0;
		for (@Pc(65) int local65 = 0; local65 < arg0; local65++) {
			if (arg5) {
				local63 = local65;
			}
			@Pc(83) int[] local83;
			@Pc(85) int[] local85;
			@Pc(87) int[] local87;
			if (this.aClass1_Sub2_1.aBoolean515) {
				@Pc(81) int[] local81 = this.aClass1_Sub2_1.method6085(local65);
				local83 = local81;
				local85 = local81;
				local87 = local81;
			} else {
				@Pc(95) int[][] local95 = this.aClass1_Sub2_1.method6081(local65);
				local85 = local95[1];
				local87 = local95[2];
				local83 = local95[0];
			}
			for (@Pc(109) int local109 = local53; local109 != local49; local109 += local47) {
				@Pc(117) int local117 = local83[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(132) int local132 = local85[local109] >> 4;
				if (local132 > 255) {
					local132 = 255;
				}
				if (local132 < 0) {
					local132 = 0;
				}
				@Pc(147) int local147 = local87[local109] >> 4;
				if (local147 > 255) {
					local147 = 255;
				}
				local132 = Static18.anIntArray47[local132];
				if (local147 < 0) {
					local147 = 0;
				}
				local117 = Static18.anIntArray47[local117];
				local147 = Static18.anIntArray47[local147];
				@Pc(178) int local178 = local147 + (local132 << 8) + (local117 << 16);
				if (local178 != 0) {
					local178 |= 0xFF000000;
				}
				local43[local63++] = local178;
				if (arg5) {
					local63 += arg2 - 1;
				}
			}
		}
		for (@Pc(217) int local217 = 0; local217 < this.aClass1_Sub2Array42.length; local217++) {
			this.aClass1_Sub2Array42[local217].method6079();
		}
		return local43;
	}
}
