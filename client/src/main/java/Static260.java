import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!os", name = "f", descriptor = "I")
	public static int anInt6717;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIII)V")
	public static void method6016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static249.method4149(arg2);
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg2 - arg4;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(22) int local22 = arg2;
		@Pc(29) int local29 = -arg2;
		@Pc(31) int local31 = local16;
		@Pc(34) int local34 = -local16;
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(61) int local61;
		@Pc(70) int local70;
		@Pc(78) int local78;
		@Pc(86) int local86;
		if (arg1 >= Static365.anInt6832 && arg1 <= Static161.anInt2954) {
			@Pc(52) int[] local52 = Static357.anIntArrayArray58[arg1];
			local61 = Static25.method861(Static28.anInt675, arg5 - arg2, Static82.anInt1837);
			local70 = Static25.method861(Static28.anInt675, arg5 + arg2, Static82.anInt1837);
			local78 = Static25.method861(Static28.anInt675, arg5 - local16, Static82.anInt1837);
			local86 = Static25.method861(Static28.anInt675, local16 + arg5, Static82.anInt1837);
			Static101.method2163(local78, local52, arg0, local61);
			Static101.method2163(local86, local52, arg3, local78);
			Static101.method2163(local70, local52, arg0, local86);
		}
		while (local22 > local12) {
			local36 += 2;
			local38 += 2;
			local29 += local36;
			local34 += local38;
			if (local34 >= 0 && local31 >= 1) {
				local31--;
				local34 -= local31 << 1;
				Static305.anIntArray386[local31] = local12;
			}
			local12++;
			@Pc(203) int local203;
			@Pc(212) int local212;
			@Pc(223) int[] local223;
			@Pc(152) int local152;
			if (local29 >= 0) {
				local22--;
				local29 -= local22 << 1;
				local152 = arg1 - local22;
				local61 = local22 + arg1;
				if (local61 >= Static365.anInt6832 && Static161.anInt2954 >= local152) {
					if (local16 > local22) {
						local70 = Static305.anIntArray386[local22];
						local78 = Static25.method861(Static28.anInt675, arg5 + local12, Static82.anInt1837);
						local86 = Static25.method861(Static28.anInt675, arg5 - local12, Static82.anInt1837);
						local203 = Static25.method861(Static28.anInt675, arg5 + local70, Static82.anInt1837);
						local212 = Static25.method861(Static28.anInt675, arg5 - local70, Static82.anInt1837);
						if (local61 <= Static161.anInt2954) {
							local223 = Static357.anIntArrayArray58[local61];
							Static101.method2163(local212, local223, arg0, local86);
							Static101.method2163(local203, local223, arg3, local212);
							Static101.method2163(local78, local223, arg0, local203);
						}
						if (Static365.anInt6832 <= local152) {
							local223 = Static357.anIntArrayArray58[local152];
							Static101.method2163(local212, local223, arg0, local86);
							Static101.method2163(local203, local223, arg3, local212);
							Static101.method2163(local78, local223, arg0, local203);
						}
					} else {
						local70 = Static25.method861(Static28.anInt675, local12 + arg5, Static82.anInt1837);
						local78 = Static25.method861(Static28.anInt675, arg5 - local12, Static82.anInt1837);
						if (local61 <= Static161.anInt2954) {
							Static101.method2163(local70, Static357.anIntArrayArray58[local61], arg0, local78);
						}
						if (Static365.anInt6832 <= local152) {
							Static101.method2163(local70, Static357.anIntArrayArray58[local152], arg0, local78);
						}
					}
				}
			}
			local152 = arg1 - local12;
			local61 = local12 + arg1;
			if (Static365.anInt6832 <= local61 && Static161.anInt2954 >= local152) {
				local70 = arg5 + local22;
				local78 = arg5 - local22;
				if (local70 >= Static28.anInt675 && Static82.anInt1837 >= local78) {
					local70 = Static25.method861(Static28.anInt675, local70, Static82.anInt1837);
					local78 = Static25.method861(Static28.anInt675, local78, Static82.anInt1837);
					if (local12 >= local16) {
						if (local61 <= Static161.anInt2954) {
							Static101.method2163(local70, Static357.anIntArrayArray58[local61], arg0, local78);
						}
						if (local152 >= Static365.anInt6832) {
							Static101.method2163(local70, Static357.anIntArrayArray58[local152], arg0, local78);
						}
					} else {
						local86 = local31 >= local12 ? local31 : Static305.anIntArray386[local12];
						local203 = Static25.method861(Static28.anInt675, arg5 + local86, Static82.anInt1837);
						local212 = Static25.method861(Static28.anInt675, arg5 - local86, Static82.anInt1837);
						if (local61 <= Static161.anInt2954) {
							local223 = Static357.anIntArrayArray58[local61];
							Static101.method2163(local212, local223, arg0, local78);
							Static101.method2163(local203, local223, arg3, local212);
							Static101.method2163(local70, local223, arg0, local203);
						}
						if (Static365.anInt6832 <= local152) {
							local223 = Static357.anIntArrayArray58[local152];
							Static101.method2163(local212, local223, arg0, local78);
							Static101.method2163(local203, local223, arg3, local212);
							Static101.method2163(local70, local223, arg0, local203);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method6018(@OriginalArg(0) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local22 >= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(77) int local77;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local77 = 0; local77 < arg0; local77++) {
				if (local77 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(124) int local124;
		for (local77 = 0; local77 < arg0; local77++) {
			for (local124 = 0; local124 < arg0; local124++) {
				if (local77 <= local124) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(163) int local163;
		for (local124 = arg0 - 1; local124 >= 0; local124--) {
			for (local163 = 0; local163 < arg0; local163++) {
				if (local124 <= local163) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(204) int local204;
		for (local163 = arg0 - 1; local163 >= 0; local163--) {
			for (local204 = 0; local204 < arg0; local204++) {
				if (local204 <= local163 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(250) int local250;
		for (local204 = 0; local204 < arg0; local204++) {
			for (local250 = 0; local250 < arg0; local250++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local204 << 1 <= local250) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(315) int local315;
		for (local250 = 0; local250 < arg0; local250++) {
			for (local315 = arg0 - 1; local315 >= 0; local315--) {
				if (local250 >> 1 >= local315) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(365) int local365;
		for (local315 = arg0 - 1; local315 >= 0; local315--) {
			for (local365 = arg0 - 1; local365 >= 0; local365--) {
				if (local365 >= local315 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(409) int local409;
		for (local365 = arg0 - 1; local365 >= 0; local365--) {
			for (local409 = arg0 - 1; local409 >= 0; local409--) {
				if (local409 <= local365 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(458) int local458;
		for (local409 = arg0 - 1; local409 >= 0; local409--) {
			for (local458 = 0; local458 < arg0; local458++) {
				if (local458 >= local409 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(500) int local500;
		for (local458 = 0; local458 < arg0; local458++) {
			for (local500 = 0; local500 < arg0; local500++) {
				if (local500 <= local458 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(545) int local545;
		for (local500 = 0; local500 < arg0; local500++) {
			for (local545 = arg0 - 1; local545 >= 0; local545--) {
				if (local545 >= local500 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(592) int local592;
		for (local545 = arg0 - 1; local545 >= 0; local545--) {
			for (local592 = 0; local592 < arg0; local592++) {
				if (local592 >= local545 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(637) int local637;
		for (local592 = 0; local592 < arg0; local592++) {
			for (local637 = 0; local637 < arg0; local637++) {
				if (local592 << 1 >= local637) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(686) int local686;
		for (local637 = 0; local637 < arg0; local637++) {
			for (local686 = arg0 - 1; local686 >= 0; local686--) {
				if (local686 >= local637 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(739) int local739;
		for (local686 = arg0 - 1; local686 >= 0; local686--) {
			for (local739 = arg0 - 1; local739 >= 0; local739--) {
				if (local739 <= local686 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(783) int local783;
		for (local739 = arg0 - 1; local739 >= 0; local739--) {
			for (local783 = arg0 - 1; local783 >= 0; local783--) {
				if (local739 >> 1 <= local783) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(828) int local828;
		for (local783 = arg0 - 1; local783 >= 0; local783--) {
			for (local828 = 0; local828 < arg0; local828++) {
				if (local783 << 1 >= local828) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(873) int local873;
		for (local828 = 0; local828 < arg0; local828++) {
			for (local873 = 0; local873 < arg0; local873++) {
				if (local828 >> 1 <= local873) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(929) int local929;
		for (local873 = 0; local873 < arg0; local873++) {
			for (local929 = arg0 - 1; local929 >= 0; local929--) {
				if (local929 <= local873 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(971) int local971;
		for (local929 = 0; local929 < arg0; local929++) {
			for (local971 = 0; local971 < arg0; local971++) {
				if (local971 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1018) int local1018;
		for (local971 = 0; local971 < arg0; local971++) {
			for (local1018 = 0; local1018 < arg0; local1018++) {
				if (local971 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1065) int local1065;
		for (local1018 = 0; local1018 < arg0; local1018++) {
			for (local1065 = 0; local1065 < arg0; local1065++) {
				if (arg0 / 2 <= local1065) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1108) int local1108;
		for (local1065 = 0; local1065 < arg0; local1065++) {
			for (local1108 = 0; local1108 < arg0; local1108++) {
				if (local1065 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1155) int local1155;
		for (local1108 = 0; local1108 < arg0; local1108++) {
			for (local1155 = 0; local1155 < arg0; local1155++) {
				if (local1155 <= local1108 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1203) int local1203;
		for (local1155 = arg0 - 1; local1155 >= 0; local1155--) {
			for (local1203 = 0; local1203 < arg0; local1203++) {
				if (local1155 - arg0 / 2 >= local1203) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1256) int local1256;
		for (local1203 = arg0 - 1; local1203 >= 0; local1203--) {
			for (local1256 = arg0 - 1; local1256 >= 0; local1256--) {
				if (local1256 <= local1203 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1302) int local1302;
		for (local1256 = 0; local1256 < arg0; local1256++) {
			for (local1302 = arg0 - 1; local1302 >= 0; local1302--) {
				if (local1302 <= local1256 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1350) int local1350;
		for (local1302 = 0; local1302 < arg0; local1302++) {
			for (local1350 = 0; local1350 < arg0; local1350++) {
				if (local1302 - arg0 / 2 <= local1350) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1402) int local1402;
		for (local1350 = arg0 - 1; local1350 >= 0; local1350--) {
			for (local1402 = 0; local1402 < arg0; local1402++) {
				if (local1402 >= local1350 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1450) int local1450;
		for (local1402 = arg0 - 1; local1402 >= 0; local1402--) {
			for (local1450 = arg0 - 1; local1450 >= 0; local1450--) {
				if (local1402 - arg0 / 2 <= local1450) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1450 = 0; local1450 < arg0; local1450++) {
			for (@Pc(1495) int local1495 = arg0 - 1; local1495 >= 0; local1495--) {
				if (local1495 >= local1450 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
