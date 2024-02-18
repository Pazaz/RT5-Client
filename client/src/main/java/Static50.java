import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_90 = new Class345(85, 2);

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "Z")
	public static boolean aBoolean565 = true;

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "Z")
	public static boolean aBoolean566 = false;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!dv;I[I)Lclient!uea;")
	public static Class369 method6635(@OriginalArg(1) Class88 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) int[] local7 = null;
		@Pc(9) int[] local9 = null;
		@Pc(11) int[] local11 = null;
		@Pc(13) float[][] local13 = null;
		if (arg0.aByteArray28 != null) {
			@Pc(25) int local25 = arg0.anInt2377;
			@Pc(28) int[] local28 = new int[local25];
			@Pc(31) int[] local31 = new int[local25];
			@Pc(34) int[] local34 = new int[local25];
			@Pc(37) int[] local37 = new int[local25];
			@Pc(40) int[] local40 = new int[local25];
			@Pc(43) int[] local43 = new int[local25];
			for (@Pc(45) int local45 = 0; local45 < local25; local45++) {
				local28[local45] = Integer.MAX_VALUE;
				local31[local45] = -2147483647;
				local34[local45] = Integer.MAX_VALUE;
				local37[local45] = -2147483647;
				local40[local45] = Integer.MAX_VALUE;
				local43[local45] = -2147483647;
			}
			local11 = new int[local25];
			local13 = new float[local25][];
			@Pc(97) int local97;
			@Pc(158) int local158;
			for (@Pc(89) int local89 = 0; local89 < arg1; local89++) {
				local97 = arg2[local89];
				if (arg0.aByteArray28[local97] != -1) {
					@Pc(111) int local111 = arg0.aByteArray28[local97] & 0xFF;
					for (@Pc(113) int local113 = 0; local113 < 3; local113++) {
						@Pc(134) short local134;
						if (local113 == 0) {
							local134 = arg0.aShortArray27[local97];
						} else if (local113 == 1) {
							local134 = arg0.aShortArray24[local97];
						} else {
							local134 = arg0.aShortArray26[local97];
						}
						@Pc(153) int local153 = arg0.anIntArray213[local134];
						local158 = arg0.anIntArray205[local134];
						@Pc(163) int local163 = arg0.anIntArray204[local134];
						if (local153 < local28[local111]) {
							local28[local111] = local153;
						}
						if (local153 > local31[local111]) {
							local31[local111] = local153;
						}
						if (local34[local111] > local158) {
							local34[local111] = local158;
						}
						if (local158 > local37[local111]) {
							local37[local111] = local158;
						}
						if (local40[local111] > local163) {
							local40[local111] = local163;
						}
						if (local163 > local43[local111]) {
							local43[local111] = local163;
						}
					}
				}
			}
			local7 = new int[local25];
			local9 = new int[local25];
			for (local97 = 0; local97 < local25; local97++) {
				@Pc(268) byte local268 = arg0.aByteArray24[local97];
				if (local268 > 0) {
					local7[local97] = (local28[local97] + local31[local97]) / 2;
					local9[local97] = (local34[local97] + local37[local97]) / 2;
					local11[local97] = (local43[local97] + local40[local97]) / 2;
					@Pc(340) float local340;
					@Pc(326) float local326;
					@Pc(334) float local334;
					if (local268 == 1) {
						local158 = arg0.anIntArray211[local97];
						local326 = 64.0F / (float) arg0.anIntArray207[local97];
						if (local158 == 0) {
							local340 = 1.0F;
							local334 = 1.0F;
						} else if (local158 <= 0) {
							local334 = 1.0F;
							local340 = (float) -local158 / 1024.0F;
						} else {
							local340 = 1.0F;
							local334 = (float) local158 / 1024.0F;
						}
					} else if (local268 == 2) {
						local326 = 64.0F / (float) arg0.anIntArray207[local97];
						local334 = 64.0F / (float) arg0.anIntArray208[local97];
						local340 = 64.0F / (float) arg0.anIntArray211[local97];
					} else {
						local340 = (float) arg0.anIntArray211[local97] / 1024.0F;
						local326 = (float) arg0.anIntArray207[local97] / 1024.0F;
						local334 = (float) arg0.anIntArray208[local97] / 1024.0F;
					}
					local13[local97] = Static395.method9163(local340, local326, local334, arg0.aShortArray29[local97], arg0.aShortArray28[local97], arg0.aByteArray27[local97] & 0xFF, arg0.aShortArray21[local97]);
				}
			}
		}
		return new Class369(local7, local9, local11, local13);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!cg;B)V")
	public static void method6638(@OriginalArg(0) Class8_Sub2_Sub1_Sub2 arg0) {
		@Pc(8) Class152 local8 = arg0.aClass152_10;
		if (local8.method9109() && local8.method9112(1) && local8.method9102()) {
			if (arg0.aBoolean817) {
				local8.method9113(true, arg0.method9317().method6477());
				arg0.aBoolean817 = local8.method9109();
			}
			local8.method9099();
		}
		@Pc(75) Class152 local75;
		for (@Pc(50) int local50 = 0; local50 < arg0.aClass199Array3.length; local50++) {
			if (arg0.aClass199Array3[local50].anInt4930 != -1) {
				local75 = arg0.aClass199Array3[local50].aClass152_7;
				if (local75.method9106()) {
					@Pc(88) Class227 local88 = Static23.aClass128_1.method2694(arg0.aClass199Array3[local50].anInt4930);
					@Pc(92) Class69 local92 = local75.method9107();
					if (local88.aBoolean448) {
						if (local92.anInt1642 == 3) {
							if (arg0.anInt10762 > 0 && Static333.anInt5455 >= arg0.anInt10759 && arg0.anInt10755 < Static333.anInt5455) {
								local75.method9113(true, -1);
								arg0.aClass199Array3[local50].anInt4930 = -1;
								continue;
							}
						} else if (local92.anInt1642 == 1 && arg0.anInt10762 > 0 && arg0.anInt10759 <= Static333.anInt5455 && Static333.anInt5455 > arg0.anInt10755) {
							continue;
						}
					}
				}
				if (local75.method9112(1) && local75.method9102()) {
					local75.method9113(true, -1);
					arg0.aClass199Array3[local50].anInt4930 = -1;
				}
			}
		}
		local75 = arg0.aClass152_11;
		if (local75.method9109()) {
			label83: {
				@Pc(214) Class69 local214 = local75.method9107();
				if (local214.anInt1642 == 3) {
					if (arg0.anInt10762 > 0 && arg0.anInt10759 <= Static333.anInt5455 && Static333.anInt5455 > arg0.anInt10755) {
						arg0.anIntArray869 = null;
						local75.method9113(true, -1);
						break label83;
					}
				} else if (local214.anInt1642 == 1) {
					if (arg0.anInt10762 > 0 && Static333.anInt5455 >= arg0.anInt10759 && arg0.anInt10755 < Static333.anInt5455) {
						local75.method9091(1);
						break label83;
					}
					local75.method9091(0);
				}
				if (local75.method9112(1) && local75.method9102()) {
					arg0.anIntArray869 = null;
					local75.method9113(true, -1);
				}
			}
		}
		for (@Pc(313) int local313 = 0; local313 < arg0.aClass152_Sub2_Sub1Array3.length; local313++) {
			@Pc(320) Class152_Sub2_Sub1 local320 = arg0.aClass152_Sub2_Sub1Array3[local313];
			if (local320 != null) {
				if (local320.anInt10508 > 0) {
					local320.anInt10508--;
				} else if (local320.method9112(1) && local320.method9102()) {
					arg0.aClass152_Sub2_Sub1Array3[local313] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIB)V")
	public static void method6639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub2_Sub2 local8 = Static440.method5963(15, 0L);
		local8.method202();
		local8.anInt197 = arg1;
		local8.anInt195 = arg0;
	}
}
