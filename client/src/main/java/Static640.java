import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static640 {

	@OriginalMember(owner = "client!uda", name = "H", descriptor = "S")
	public static short aShort121 = 205;

	@OriginalMember(owner = "client!uda", name = "B", descriptor = "S")
	public static short aShort122 = 256;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IZ)V")
	public static void method8435(@OriginalArg(1) boolean arg0) {
		Static19.method265(arg0, Static377.anInt5930, Static380.anInt5979, Static680.anInt10289);
	}

	@OriginalMember(owner = "client!uda", name = "i", descriptor = "(I)Lclient!wca;")
	public static Class396 method8436() {
		return Static321.method4620();
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method8437(@OriginalArg(1) int arg0) {
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
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(79) int local79;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local79 = 0; local79 < arg0; local79++) {
				if (local79 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(133) int local133;
		for (local79 = 0; local79 < arg0; local79++) {
			for (local133 = 0; local133 < arg0; local133++) {
				if (local133 >= local79) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(186) int local186;
		for (local133 = arg0 - 1; local133 >= 0; local133--) {
			for (local186 = 0; local186 < arg0; local186++) {
				if (local186 >= local133) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(242) int local242;
		for (local186 = arg0 - 1; local186 >= 0; local186--) {
			for (local242 = 0; local242 < arg0; local242++) {
				if (local242 <= local186 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(298) int local298;
		for (local242 = 0; local242 < arg0; local242++) {
			for (local298 = 0; local298 < arg0; local298++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local242 << 1 <= local298) {
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
		@Pc(372) int local372;
		for (local298 = 0; local298 < arg0; local298++) {
			for (local372 = arg0 - 1; local372 >= 0; local372--) {
				if (local372 <= local298 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(428) int local428;
		for (local372 = arg0 - 1; local372 >= 0; local372--) {
			for (local428 = arg0 - 1; local428 >= 0; local428--) {
				if (local428 >= local372 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(483) int local483;
		for (local428 = arg0 - 1; local428 >= 0; local428--) {
			for (local483 = arg0 - 1; local483 >= 0; local483--) {
				if (local428 >> 1 >= local483) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(538) int local538;
		for (local483 = arg0 - 1; local483 >= 0; local483--) {
			for (local538 = 0; local538 < arg0; local538++) {
				if (local483 << 1 <= local538) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(590) int local590;
		for (local538 = 0; local538 < arg0; local538++) {
			for (local590 = 0; local590 < arg0; local590++) {
				if (local590 <= local538 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(649) int local649;
		for (local590 = 0; local590 < arg0; local590++) {
			for (local649 = arg0 - 1; local649 >= 0; local649--) {
				if (local590 << 1 <= local649) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(702) int local702;
		for (local649 = arg0 - 1; local649 >= 0; local649--) {
			for (local702 = 0; local702 < arg0; local702++) {
				if (local649 >> 1 <= local702) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(758) int local758;
		for (local702 = 0; local702 < arg0; local702++) {
			for (local758 = 0; local758 < arg0; local758++) {
				if (local758 <= local702 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(813) int local813;
		for (local758 = 0; local758 < arg0; local758++) {
			for (local813 = arg0 - 1; local813 >= 0; local813--) {
				if (local758 >> 1 <= local813) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(869) int local869;
		for (local813 = arg0 - 1; local813 >= 0; local813--) {
			for (local869 = arg0 - 1; local869 >= 0; local869--) {
				if (local869 <= local813 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(923) int local923;
		for (local869 = arg0 - 1; local869 >= 0; local869--) {
			for (local923 = arg0 - 1; local923 >= 0; local923--) {
				if (local869 >> 1 <= local923) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(978) int local978;
		for (local923 = arg0 - 1; local923 >= 0; local923--) {
			for (local978 = 0; local978 < arg0; local978++) {
				if (local978 <= local923 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1026) int local1026;
		for (local978 = 0; local978 < arg0; local978++) {
			for (local1026 = 0; local1026 < arg0; local1026++) {
				if (local1026 >= local978 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1083) int local1083;
		for (local1026 = 0; local1026 < arg0; local1026++) {
			for (local1083 = arg0 - 1; local1083 >= 0; local1083--) {
				if (local1026 << 1 >= local1083) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1147) int local1147;
		for (local1083 = 0; local1083 < arg0; local1083++) {
			for (local1147 = 0; local1147 < arg0; local1147++) {
				if (local1147 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1200) int local1200;
		for (local1147 = 0; local1147 < arg0; local1147++) {
			for (local1200 = 0; local1200 < arg0; local1200++) {
				if (arg0 / 2 >= local1147) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1261) int local1261;
		for (local1200 = 0; local1200 < arg0; local1200++) {
			for (local1261 = 0; local1261 < arg0; local1261++) {
				if (arg0 / 2 <= local1261) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1310) int local1310;
		for (local1261 = 0; local1261 < arg0; local1261++) {
			for (local1310 = 0; local1310 < arg0; local1310++) {
				if (arg0 / 2 <= local1261) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1363) int local1363;
		for (local1310 = 0; local1310 < arg0; local1310++) {
			for (local1363 = 0; local1363 < arg0; local1363++) {
				if (local1310 - arg0 / 2 >= local1363) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1429) int local1429;
		for (local1363 = arg0 - 1; local1363 >= 0; local1363--) {
			for (local1429 = 0; local1429 < arg0; local1429++) {
				if (local1429 <= local1363 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1491) int local1491;
		for (local1429 = arg0 - 1; local1429 >= 0; local1429--) {
			for (local1491 = arg0 - 1; local1491 >= 0; local1491--) {
				if (local1491 <= local1429 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1553) int local1553;
		for (local1491 = 0; local1491 < arg0; local1491++) {
			for (local1553 = arg0 - 1; local1553 >= 0; local1553--) {
				if (local1491 - arg0 / 2 >= local1553) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1607) int local1607;
		for (local1553 = 0; local1553 < arg0; local1553++) {
			for (local1607 = 0; local1607 < arg0; local1607++) {
				if (local1553 - arg0 / 2 <= local1607) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1668) int local1668;
		for (local1607 = arg0 - 1; local1607 >= 0; local1607--) {
			for (local1668 = 0; local1668 < arg0; local1668++) {
				if (local1668 >= local1607 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1726) int local1726;
		for (local1668 = arg0 - 1; local1668 >= 0; local1668--) {
			for (local1726 = arg0 - 1; local1726 >= 0; local1726--) {
				if (local1726 >= local1668 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1726 = 0; local1726 < arg0; local1726++) {
			for (@Pc(1785) int local1785 = arg0 - 1; local1785 >= 0; local1785--) {
				if (local1785 >= local1726 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
