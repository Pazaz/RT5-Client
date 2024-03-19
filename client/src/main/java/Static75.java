import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!f", name = "b", descriptor = "I")
	public static int anInt2064;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "I")
	public static int anInt2068 = 0;

	@OriginalMember(owner = "client!f", name = "l", descriptor = "I")
	public static int anInt2074 = -1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method1741(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(47) StringBuffer local47 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(51) long local51 = arg0;
				arg0 /= 37L;
				@Pc(65) char local65 = Static109.aCharArray11[(int) (local51 - arg0 * 37L)];
				if (local65 == '_') {
					@Pc(73) int local73 = local47.length() - 1;
					local47.setCharAt(local73, Character.toUpperCase(local47.charAt(local73)));
					local65 = ' ';
				}
				local47.append(local65);
			}
			local47.reverse();
			local47.setCharAt(0, Character.toUpperCase(local47.charAt(0)));
			return local47.toString();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Lclient!ji;")
	public static Class1_Sub1_Sub13 method1742(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub13 local10 = (Class1_Sub1_Sub13) Static107.aClass143_4.method4323((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static323.aClass162_226.method4636(arg0, 19);
		local10 = new Class1_Sub1_Sub13();
		if (local20 != null) {
			local10.method3131(new Class1_Sub16(local20));
		}
		Static107.aClass143_4.method4322(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IBI)B")
	public static byte method1743(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(II)[[[B")
	public static byte[][][] method1746(@OriginalArg(0) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local26 <= local22) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(69) int local69;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local69 = 0; local69 < arg0; local69++) {
				if (local69 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(116) int local116;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local116 = 0; local116 < arg0; local116++) {
				if (local116 >= local69) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(163) int local163;
		for (local116 = arg0 - 1; local116 >= 0; local116--) {
			for (local163 = 0; local163 < arg0; local163++) {
				if (local163 >= local116) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(205) int local205;
		for (local163 = arg0 - 1; local163 >= 0; local163--) {
			for (local205 = 0; local205 < arg0; local205++) {
				if (local163 >> 1 >= local205) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(247) int local247;
		for (local205 = 0; local205 < arg0; local205++) {
			for (local247 = 0; local247 < arg0; local247++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local205 << 1 <= local247) {
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
		@Pc(301) int local301;
		for (local247 = 0; local247 < arg0; local247++) {
			for (local301 = arg0 - 1; local301 >= 0; local301--) {
				if (local301 <= local247 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(351) int local351;
		for (local301 = arg0 - 1; local301 >= 0; local301--) {
			for (local351 = arg0 - 1; local351 >= 0; local351--) {
				if (local351 >= local301 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(396) int local396;
		for (local351 = arg0 - 1; local351 >= 0; local351--) {
			for (local396 = arg0 - 1; local396 >= 0; local396--) {
				if (local351 >> 1 >= local396) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(442) int local442;
		for (local396 = arg0 - 1; local396 >= 0; local396--) {
			for (local442 = 0; local442 < arg0; local442++) {
				if (local442 >= local396 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(491) int local491;
		for (local442 = 0; local442 < arg0; local442++) {
			for (local491 = 0; local491 < arg0; local491++) {
				if (local442 >> 1 >= local491) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(536) int local536;
		for (local491 = 0; local491 < arg0; local491++) {
			for (local536 = arg0 - 1; local536 >= 0; local536--) {
				if (local536 >= local491 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(583) int local583;
		for (local536 = arg0 - 1; local536 >= 0; local536--) {
			for (local583 = 0; local583 < arg0; local583++) {
				if (local583 >= local536 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(632) int local632;
		for (local583 = 0; local583 < arg0; local583++) {
			for (local632 = 0; local632 < arg0; local632++) {
				if (local632 <= local583 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(681) int local681;
		for (local632 = 0; local632 < arg0; local632++) {
			for (local681 = arg0 - 1; local681 >= 0; local681--) {
				if (local681 >= local632 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(731) int local731;
		for (local681 = arg0 - 1; local681 >= 0; local681--) {
			for (local731 = arg0 - 1; local731 >= 0; local731--) {
				if (local681 << 1 >= local731) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(782) int local782;
		for (local731 = arg0 - 1; local731 >= 0; local731--) {
			for (local782 = arg0 - 1; local782 >= 0; local782--) {
				if (local731 >> 1 <= local782) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(825) int local825;
		for (local782 = arg0 - 1; local782 >= 0; local782--) {
			for (local825 = 0; local825 < arg0; local825++) {
				if (local782 << 1 >= local825) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(870) int local870;
		for (local825 = 0; local825 < arg0; local825++) {
			for (local870 = 0; local870 < arg0; local870++) {
				if (local870 >= local825 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(919) int local919;
		for (local870 = 0; local870 < arg0; local870++) {
			for (local919 = arg0 - 1; local919 >= 0; local919--) {
				if (local919 <= local870 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(961) int local961;
		for (local919 = 0; local919 < arg0; local919++) {
			for (local961 = 0; local961 < arg0; local961++) {
				if (arg0 / 2 >= local961) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1012) int local1012;
		for (local961 = 0; local961 < arg0; local961++) {
			for (local1012 = 0; local1012 < arg0; local1012++) {
				if (local961 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1059) int local1059;
		for (local1012 = 0; local1012 < arg0; local1012++) {
			for (local1059 = 0; local1059 < arg0; local1059++) {
				if (arg0 / 2 <= local1059) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1106) int local1106;
		for (local1059 = 0; local1059 < arg0; local1059++) {
			for (local1106 = 0; local1106 < arg0; local1106++) {
				if (local1059 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1149) int local1149;
		for (local1106 = 0; local1106 < arg0; local1106++) {
			for (local1149 = 0; local1149 < arg0; local1149++) {
				if (local1106 - arg0 / 2 >= local1149) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1204) int local1204;
		for (local1149 = arg0 - 1; local1149 >= 0; local1149--) {
			for (local1204 = 0; local1204 < arg0; local1204++) {
				if (local1204 <= local1149 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1249) int local1249;
		for (local1204 = arg0 - 1; local1204 >= 0; local1204--) {
			for (local1249 = arg0 - 1; local1249 >= 0; local1249--) {
				if (local1204 - arg0 / 2 >= local1249) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1298) int local1298;
		for (local1249 = 0; local1249 < arg0; local1249++) {
			for (local1298 = arg0 - 1; local1298 >= 0; local1298--) {
				if (local1249 - arg0 / 2 >= local1298) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1345) int local1345;
		for (local1298 = 0; local1298 < arg0; local1298++) {
			for (local1345 = 0; local1345 < arg0; local1345++) {
				if (local1298 - arg0 / 2 <= local1345) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1397) int local1397;
		for (local1345 = arg0 - 1; local1345 >= 0; local1345--) {
			for (local1397 = 0; local1397 < arg0; local1397++) {
				if (local1345 - arg0 / 2 <= local1397) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1450) int local1450;
		for (local1397 = arg0 - 1; local1397 >= 0; local1397--) {
			for (local1450 = arg0 - 1; local1450 >= 0; local1450--) {
				if (local1450 >= local1397 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1450 = 0; local1450 < arg0; local1450++) {
			for (@Pc(1502) int local1502 = arg0 - 1; local1502 >= 0; local1502--) {
				if (local1450 - arg0 / 2 <= local1502) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
