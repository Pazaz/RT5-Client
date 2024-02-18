import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!ou", name = "y", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray36;

	@OriginalMember(owner = "client!ou", name = "v", descriptor = "[I")
	private static int[] anIntArray580;

	@OriginalMember(owner = "client!ou", name = "m", descriptor = "Lclient!hda;")
	private static Class158 aClass158_11;

	@OriginalMember(owner = "client!ou", name = "i", descriptor = "[J")
	private static long[] aLongArray15;

	@OriginalMember(owner = "client!ou", name = "H", descriptor = "Lclient!an;")
	private static Class21 aClass21_1;

	@OriginalMember(owner = "client!ou", name = "z", descriptor = "Lclient!rfa;")
	private static Class2_Sub47 aClass2_Sub47_2;

	@OriginalMember(owner = "client!ou", name = "G", descriptor = "Lclient!hi;")
	private static Class164 aClass164_7;

	@OriginalMember(owner = "client!ou", name = "k", descriptor = "Lclient!hda;")
	private static Class158 aClass158_12;

	@OriginalMember(owner = "client!ou", name = "B", descriptor = "[J")
	private static final long[] aLongArray14 = new long[1000];

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "[I")
	private static final int[] anIntArray578 = new int[1000];

	@OriginalMember(owner = "client!ou", name = "D", descriptor = "I")
	private static int anInt7139 = 0;

	@OriginalMember(owner = "client!ou", name = "t", descriptor = "[Lclient!gf;")
	private static final Class143[] aClass143Array1 = new Class143[50];

	@OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
	private static int anInt7140 = 0;

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "[I")
	private static final int[] anIntArray579 = new int[3];

	@OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
	private static int anInt7142 = 0;

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray37 = new String[1000];

	@OriginalMember(owner = "client!ou", name = "w", descriptor = "[[I")
	private static final int[][] anIntArrayArray177 = new int[5][5000];

	@OriginalMember(owner = "client!ou", name = "C", descriptor = "I")
	private static int anInt7152 = 0;

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "[I")
	private static final int[] anIntArray581 = new int[5];

	@OriginalMember(owner = "client!ou", name = "E", descriptor = "Lclient!dla;")
	public static final Class82 aClass82_156 = new Class82(4);

	@OriginalMember(owner = "client!ou", name = "q", descriptor = "Z")
	public static boolean aBoolean538 = false;

	@OriginalMember(owner = "client!ou", name = "o", descriptor = "I")
	private static int anInt7153 = 0;

	@OriginalMember(owner = "client!ou", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString76 = null;

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)I")
	private static int method6411(@OriginalArg(0) int arg0) {
		@Pc(4) Class341 local4 = Static648.aClass17_1.method263(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c113");
		}
		@Pc(29) Integer local29 = aClass164_7.method3495(Static392.aClass377_4.anInt9720 << 16 | local4.anInt8745, local4.anInt8746, local4.anInt8742);
		return local29 == null ? 0 : local29;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)I")
	private static int method6412(@OriginalArg(0) int arg0) {
		@Pc(4) Class341 local4 = Static648.aClass17_1.method263(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c112");
		}
		@Pc(24) Integer local24 = aClass164_7.method3490(Static392.aClass377_4.anInt9720 << 16 | arg0);
		if (local24 == null) {
			return local4.aChar7 == 'i' || local4.aChar7 == '1' ? 0 : -1;
		} else {
			return local24;
		}
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)J")
	private static long method6413(@OriginalArg(0) int arg0) {
		@Pc(9) Long local9 = aClass164_7.method3478(Static392.aClass377_4.anInt9720 << 16 | arg0);
		return local9 == null ? -1L : local9;
	}

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "(I)V")
	public static void method6414(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static571.method7566(arg0)) {
			return;
		}
		@Pc(14) Class158[] local14 = Static453.aClass158ArrayArray2[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(21) Class158 local21 = local14[local16];
			if (local21.anObjectArray13 != null) {
				@Pc(28) Class2_Sub42 local28 = new Class2_Sub42();
				local28.aClass158_14 = local21;
				local28.anObjectArray36 = local21.anObjectArray13;
				method6422(local28, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(Lclient!hda;)V")
	private static void method6415(@OriginalArg(0) Class158 arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(71) Class158[] local71;
		if (arg0.anInt3741 == -1) {
			@Pc(119) int local119 = arg0.anInt3812 >>> 16;
			@Pc(123) Class158[] local123 = Static148.aClass158ArrayArray1[local119];
			if (local123 == null) {
				local71 = Static453.aClass158ArrayArray2[local119];
				@Pc(132) int local132 = local71.length;
				local123 = Static148.aClass158ArrayArray1[local119] = new Class158[local132];
				Static734.method7691(local71, 0, local123, 0, local71.length);
			}
			@Pc(148) int local148;
			for (local148 = 0; local148 < local123.length && local123[local148] != arg0; local148++) {
			}
			if (local148 >= local123.length) {
				return;
			}
			Static734.method7691(local123, local148 + 1, local123, local148, local123.length - local148 - 1);
			local123[local123.length - 1] = arg0;
			return;
		}
		@Pc(12) Class158 local12 = Static145.method2412(arg0.anInt3743);
		if (local12 == null) {
			return;
		}
		if (local12.aClass158Array1 == local12.aClass158Array2) {
			local12.aClass158Array1 = new Class158[local12.aClass158Array2.length];
			local12.aClass158Array1[local12.aClass158Array1.length - 1] = arg0;
			Static734.method7691(local12.aClass158Array2, 0, local12.aClass158Array1, 0, arg0.anInt3741);
			Static734.method7691(local12.aClass158Array2, arg0.anInt3741 + 1, local12.aClass158Array1, arg0.anInt3741, local12.aClass158Array2.length - arg0.anInt3741 - 1);
			return;
		}
		@Pc(68) int local68 = 0;
		local71 = local12.aClass158Array1;
		while (local68 < local71.length && local71[local68] != arg0) {
			local68++;
		}
		if (local68 >= local71.length) {
			return;
		}
		Static734.method7691(local71, local68 + 1, local71, local68, local71.length - local68 - 1);
		local71[local12.aClass158Array1.length - 1] = arg0;
		return;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IZ)V")
	private static void method6416(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(220) Class158 local220;
		@Pc(27) int local27;
		@Pc(21) int local21;
		@Pc(38) Class158 local38;
		@Pc(72) int local72;
		@Pc(303) Class158 local303;
		@Pc(15) int local15;
		@Pc(248) Class158 local248;
		if (arg0 < 300) {
			if (arg0 == 150) {
				anInt7142 -= 3;
				local15 = anIntArray578[anInt7142];
				local21 = anIntArray578[anInt7142 + 1];
				local27 = anIntArray578[anInt7142 + 2];
				if (local21 == 0) {
					throw new RuntimeException();
				}
				local38 = Static145.method2412(local15);
				if (local38.aClass158Array2 == null) {
					local38.aClass158Array2 = new Class158[local27 + 1];
					local38.aClass158Array1 = local38.aClass158Array2;
				}
				if (local38.aClass158Array2.length <= local27) {
					@Pc(70) Class158[] local70;
					if (local38.aClass158Array2 == local38.aClass158Array1) {
						local70 = new Class158[local27 + 1];
						for (local72 = 0; local72 < local38.aClass158Array2.length; local72++) {
							local70[local72] = local38.aClass158Array2[local72];
						}
						local38.aClass158Array2 = local38.aClass158Array1 = local70;
					} else {
						local70 = new Class158[local27 + 1];
						@Pc(104) Class158[] local104 = new Class158[local27 + 1];
						for (@Pc(106) int local106 = 0; local106 < local38.aClass158Array2.length; local106++) {
							local70[local106] = local38.aClass158Array2[local106];
							local104[local106] = local38.aClass158Array1[local106];
						}
						local38.aClass158Array2 = local70;
						local38.aClass158Array1 = local104;
					}
				}
				if (local27 > 0 && local38.aClass158Array2[local27 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local27 - 1));
				}
				@Pc(166) Class158 local166 = new Class158();
				local166.anInt3820 = local21;
				local166.anInt3743 = local166.anInt3812 = local38.anInt3812;
				local166.anInt3741 = local27;
				local38.aClass158Array2[local27] = local166;
				if (local38.aClass158Array1 != local38.aClass158Array2) {
					local38.aClass158Array1[local27] = local166;
				}
				if (arg1) {
					aClass158_12 = local166;
				} else {
					aClass158_11 = local166;
				}
				Static178.method2729(local38);
				return;
			}
			if (arg0 == 151) {
				local220 = arg1 ? aClass158_12 : aClass158_11;
				if (local220.anInt3741 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local248 = Static145.method2412(local220.anInt3812);
				local248.aClass158Array2[local220.anInt3741] = null;
				Static178.method2729(local248);
				return;
			}
			if (arg0 == 152) {
				local220 = Static145.method2412(anIntArray578[--anInt7142]);
				local220.aClass158Array2 = null;
				local220.aClass158Array1 = null;
				Static178.method2729(local220);
				return;
			}
			if (arg0 == 200) {
				anInt7142 -= 2;
				local15 = anIntArray578[anInt7142];
				local21 = anIntArray578[anInt7142 + 1];
				local303 = Static15.method186(local21, local15);
				if (local303 != null && local21 != -1) {
					anIntArray578[anInt7142++] = 1;
					if (arg1) {
						aClass158_12 = local303;
						return;
					}
					aClass158_11 = local303;
					return;
				}
				anIntArray578[anInt7142++] = 0;
				return;
			}
			if (arg0 == 201) {
				local15 = anIntArray578[--anInt7142];
				local248 = Static145.method2412(local15);
				if (local248 != null) {
					anIntArray578[anInt7142++] = 1;
					if (arg1) {
						aClass158_12 = local248;
						return;
					}
					aClass158_11 = local248;
					return;
				}
				anIntArray578[anInt7142++] = 0;
				return;
			}
			if (arg0 == 202 || arg0 == 204) {
				if (arg0 == 202) {
					local21 = anIntArray578[--anInt7142];
					local220 = Static145.method2412(local21);
				} else {
					local220 = arg1 ? aClass158_12 : aClass158_11;
				}
				method6415(local220);
				return;
			}
			if (arg0 == 203 || arg0 == 205) {
				if (arg0 == 203) {
					local21 = anIntArray578[--anInt7142];
					local220 = Static145.method2412(local21);
				} else {
					local220 = arg1 ? aClass158_12 : aClass158_11;
				}
				method6417(local220);
				return;
			}
		} else {
			@Pc(506) int local506;
			@Pc(575) boolean local575;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt7142 -= 2;
					local15 = anIntArray578[anInt7142];
					local21 = anIntArray578[anInt7142 + 1];
					if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass201_1 == null) {
						return;
					}
					for (local27 = 0; local27 < Static698.anIntArray831.length; local27++) {
						if (Static698.anIntArray831[local27] == local15) {
							Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass201_1.method4548(local21, Static68.aClass215_3, local27);
							return;
						}
					}
					for (local506 = 0; local506 < Static540.anIntArray594.length; local506++) {
						if (Static540.anIntArray594[local506] == local15) {
							Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass201_1.method4548(local21, Static68.aClass215_3, local506);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt7142 -= 2;
					local15 = anIntArray578[anInt7142];
					local21 = anIntArray578[anInt7142 + 1];
					if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass201_1 == null) {
						return;
					}
					Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass201_1.method4549(local15, local21);
					return;
				}
				if (arg0 == 410) {
					local575 = anIntArray578[--anInt7142] != 0;
					if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass201_1 == null) {
						return;
					}
					Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass201_1.method4547(local575);
					return;
				}
				if (arg0 == 411) {
					anInt7142 -= 2;
					local15 = anIntArray578[anInt7142];
					local21 = anIntArray578[anInt7142 + 1];
					if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass201_1 == null) {
						return;
					}
					Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass201_1.method4551(local21, local15, Static419.aClass112_1);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1791) String local1791;
				@Pc(1394) String local1394;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local220 = Static145.method2412(anIntArray578[--anInt7142]);
					} else {
						local220 = arg1 ? aClass158_12 : aClass158_11;
					}
					if (arg0 == 1100) {
						anInt7142 -= 2;
						local220.anInt3809 = anIntArray578[anInt7142];
						if (local220.anInt3809 > local220.anInt3769 - local220.anInt3802) {
							local220.anInt3809 = local220.anInt3769 - local220.anInt3802;
						}
						if (local220.anInt3809 < 0) {
							local220.anInt3809 = 0;
						}
						local220.anInt3768 = anIntArray578[anInt7142 + 1];
						if (local220.anInt3768 > local220.anInt3742 - local220.anInt3746) {
							local220.anInt3768 = local220.anInt3742 - local220.anInt3746;
						}
						if (local220.anInt3768 < 0) {
							local220.anInt3768 = 0;
						}
						Static178.method2729(local220);
						if (local220.anInt3741 == -1) {
							Static435.method5862(local220.anInt3812);
						}
						return;
					}
					if (arg0 == 1101) {
						local220.anInt3779 = anIntArray578[--anInt7142];
						Static178.method2729(local220);
						if (local220.anInt3741 == -1) {
							Static633.method9425(local220.anInt3812);
						}
						return;
					}
					if (arg0 == 1102) {
						local220.aBoolean294 = anIntArray578[--anInt7142] == 1;
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1103) {
						local220.anInt3780 = anIntArray578[--anInt7142];
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1104) {
						local220.anInt3778 = anIntArray578[--anInt7142];
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1105) {
						local21 = anIntArray578[--anInt7142];
						if (local220.anInt3810 != local21) {
							local220.anInt3810 = local21;
							Static178.method2729(local220);
						}
						if (local220.anInt3741 == -1) {
							Static236.method3450(local220.anInt3812);
						}
						return;
					}
					if (arg0 == 1106) {
						local220.anInt3765 = anIntArray578[--anInt7142];
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1107) {
						local220.aBoolean301 = anIntArray578[--anInt7142] == 1;
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1108) {
						local220.anInt3823 = 1;
						local220.anInt3831 = anIntArray578[--anInt7142];
						Static178.method2729(local220);
						if (local220.anInt3741 == -1) {
							Static96.method8819(local220.anInt3812);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt7142 -= 6;
						local220.anInt3736 = anIntArray578[anInt7142];
						local220.anInt3804 = anIntArray578[anInt7142 + 1];
						local220.anInt3807 = anIntArray578[anInt7142 + 2];
						local220.anInt3811 = anIntArray578[anInt7142 + 3];
						local220.anInt3737 = anIntArray578[anInt7142 + 4];
						local220.anInt3793 = anIntArray578[anInt7142 + 5];
						Static178.method2729(local220);
						if (local220.anInt3741 == -1) {
							Static77.method1558(local220.anInt3812);
							Static580.method7651(local220.anInt3812);
						}
						return;
					}
					if (arg0 == 1110) {
						local21 = anIntArray578[--anInt7142];
						if (local21 != local220.anInt3789) {
							if (local21 == -1) {
								local220.aClass152_6 = null;
							} else {
								if (local220.aClass152_6 == null) {
									local220.aClass152_6 = new Class152_Sub1();
								}
								local220.aClass152_6.method9113(true, local21);
							}
							local220.anInt3789 = local21;
							Static178.method2729(local220);
						}
						if (local220.anInt3741 == -1) {
							Static62.method1423(local220.anInt3812);
						}
						return;
					}
					if (arg0 == 1111) {
						local220.aBoolean285 = anIntArray578[--anInt7142] == 1;
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1112) {
						local1394 = aStringArray37[--anInt7139];
						if (!local1394.equals(local220.aString44)) {
							local220.aString44 = local1394;
							Static178.method2729(local220);
						}
						if (local220.anInt3741 == -1) {
							Static611.method8227(local220.anInt3812);
						}
						return;
					}
					if (arg0 == 1113) {
						local220.anInt3781 = anIntArray578[--anInt7142];
						Static178.method2729(local220);
						if (local220.anInt3741 == -1) {
							Static273.method3959(local220.anInt3812);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt7142 -= 3;
						local220.anInt3818 = anIntArray578[anInt7142];
						local220.anInt3814 = anIntArray578[anInt7142 + 1];
						local220.anInt3748 = anIntArray578[anInt7142 + 2];
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1115) {
						local220.aBoolean286 = anIntArray578[--anInt7142] == 1;
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1116) {
						local220.anInt3773 = anIntArray578[--anInt7142];
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1117) {
						local220.anInt3798 = anIntArray578[--anInt7142];
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1118) {
						local220.aBoolean291 = anIntArray578[--anInt7142] == 1;
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1119) {
						local220.aBoolean293 = anIntArray578[--anInt7142] == 1;
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1120) {
						anInt7142 -= 2;
						local220.anInt3769 = anIntArray578[anInt7142];
						local220.anInt3742 = anIntArray578[anInt7142 + 1];
						Static178.method2729(local220);
						if (local220.anInt3820 == 0) {
							Static134.method8956(local220, false);
						}
						return;
					}
					if (arg0 == 1122) {
						local220.aBoolean292 = anIntArray578[--anInt7142] == 1;
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1123) {
						local220.anInt3793 = anIntArray578[--anInt7142];
						Static178.method2729(local220);
						if (local220.anInt3741 == -1) {
							Static77.method1558(local220.anInt3812);
						}
						return;
					}
					if (arg0 == 1124) {
						local21 = anIntArray578[--anInt7142];
						local220.aBoolean287 = local21 == 1;
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1125) {
						anInt7142 -= 2;
						local220.anInt3755 = anIntArray578[anInt7142];
						local220.anInt3799 = anIntArray578[anInt7142 + 1];
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1126) {
						local220.anInt3788 = anIntArray578[--anInt7142];
						Static178.method2729(local220);
						return;
					}
					@Pc(1756) Class296 local1756;
					if (arg0 == 1127) {
						anInt7142 -= 2;
						local21 = anIntArray578[anInt7142];
						local27 = anIntArray578[anInt7142 + 1];
						local1756 = Static386.aClass49_2.method1161(local21);
						if (local27 != local1756.anInt7509) {
							local220.method3385(local21, local27);
							return;
						}
						local220.method3402(local21);
						return;
					}
					if (arg0 == 1128) {
						local21 = anIntArray578[--anInt7142];
						local1791 = aStringArray37[--anInt7139];
						local1756 = Static386.aClass49_2.method1161(local21);
						if (!local1756.aString89.equals(local1791)) {
							local220.method3396(local1791, local21);
							return;
						}
						local220.method3402(local21);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local21 = anIntArray578[--anInt7142];
						if ((local220.anInt3820 == 5 || arg0 != 1129) && (local220.anInt3820 == 4 || arg0 != 1130)) {
							if (local220.anInt3745 != local21) {
								local220.anInt3745 = local21;
								Static178.method2729(local220);
							}
							if (local220.anInt3741 == -1) {
								Static80.method1583(local220.anInt3812);
							}
							return;
						}
						return;
					}
					@Pc(1899) short local1899;
					@Pc(1892) short local1892;
					if (arg0 == 1131) {
						anInt7142 -= 3;
						local21 = anIntArray578[anInt7142];
						local1892 = (short) anIntArray578[anInt7142 + 1];
						local1899 = (short) anIntArray578[anInt7142 + 2];
						if (local21 >= 0 && local21 < 5) {
							local220.method3406(local1899, local21, local1892);
							Static178.method2729(local220);
							if (local220.anInt3741 == -1) {
								Static321.method4619(local220.anInt3812, local21);
							}
							return;
						}
						return;
					}
					if (arg0 == 1132) {
						anInt7142 -= 3;
						local21 = anIntArray578[anInt7142];
						local1892 = (short) anIntArray578[anInt7142 + 1];
						local1899 = (short) anIntArray578[anInt7142 + 2];
						if (local21 >= 0 && local21 < 5) {
							local220.method3388(local1892, local21, local1899);
							Static178.method2729(local220);
							if (local220.anInt3741 == -1) {
								Static693.method9013(local220.anInt3812, local21);
							}
							return;
						}
						return;
					}
					if (arg0 == 1133) {
						local220.aBoolean299 = anIntArray578[--anInt7142] == 1;
						Static178.method2729(local220);
						if (local220.anInt3741 == -1) {
							Static682.method8926(local220.anInt3812);
						}
						return;
					}
					if (arg0 == 1134) {
						anInt7142 -= 2;
						local21 = anIntArray578[anInt7142];
						local27 = anIntArray578[anInt7142 + 1];
						local1756 = Static386.aClass49_2.method1161(local21);
						if (local27 != local1756.anInt7509) {
							local220.method3385(local21, local27);
							return;
						}
						local220.method3402(local21);
						return;
					}
					if (arg0 == 1135) {
						local220.aBoolean295 = anIntArray578[--anInt7142] == 1;
						Static178.method2729(local220);
						if (local220.anInt3741 == -1) {
							Static71.method1523(local220.anInt3812);
						}
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local220 = Static145.method2412(anIntArray578[--anInt7142]);
					} else {
						local220 = arg1 ? aClass158_12 : aClass158_11;
					}
					Static178.method2729(local220);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt7142 -= 2;
						local21 = anIntArray578[anInt7142];
						local27 = anIntArray578[anInt7142 + 1];
						if (local220.anInt3741 == -1) {
							Static329.method1631(local220.anInt3812);
							Static77.method1558(local220.anInt3812);
							Static580.method7651(local220.anInt3812);
						}
						if (local21 == -1) {
							local220.anInt3823 = 1;
							local220.anInt3831 = -1;
							local220.anInt3760 = -1;
							return;
						}
						local220.anInt3760 = local21;
						local220.anInt3817 = local27;
						if (arg0 == 1208 || arg0 == 1209) {
							local220.aBoolean288 = true;
						} else {
							local220.aBoolean288 = false;
						}
						@Pc(2236) Class382 local2236 = Static419.aClass112_1.method2486(local21);
						local220.anInt3807 = local2236.anInt10107;
						local220.anInt3811 = local2236.anInt10096;
						local220.anInt3737 = local2236.anInt10094;
						local220.anInt3736 = local2236.anInt10126;
						local220.anInt3804 = local2236.anInt10099;
						local220.anInt3793 = local2236.anInt10098;
						if (arg0 == 1205 || arg0 == 1209) {
							local220.anInt3757 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local220.anInt3757 = 1;
						} else {
							local220.anInt3757 = 2;
						}
						if (local220.anInt3800 > 0) {
							local220.anInt3793 = local220.anInt3793 * 32 / local220.anInt3800;
							return;
						}
						if (local220.anInt3744 > 0) {
							local220.anInt3793 = local220.anInt3793 * 32 / local220.anInt3744;
						}
						return;
					}
					if (arg0 == 1201) {
						local220.anInt3823 = 2;
						local220.anInt3831 = anIntArray578[--anInt7142];
						if (local220.anInt3741 == -1) {
							Static96.method8819(local220.anInt3812);
						}
						return;
					}
					if (arg0 == 1202) {
						local220.anInt3823 = 3;
						local220.anInt3831 = -1;
						if (local220.anInt3741 == -1) {
							Static96.method8819(local220.anInt3812);
						}
						return;
					}
					if (arg0 == 1203) {
						local220.anInt3823 = 6;
						local220.anInt3831 = anIntArray578[--anInt7142];
						if (local220.anInt3741 == -1) {
							Static96.method8819(local220.anInt3812);
						}
						return;
					}
					if (arg0 == 1204) {
						local220.anInt3823 = 5;
						local220.anInt3831 = anIntArray578[--anInt7142];
						if (local220.anInt3741 == -1) {
							Static96.method8819(local220.anInt3812);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt7142 -= 4;
						local220.anInt3824 = anIntArray578[anInt7142];
						local220.anInt3763 = anIntArray578[anInt7142 + 1];
						local220.anInt3796 = anIntArray578[anInt7142 + 2];
						local220.anInt3782 = anIntArray578[anInt7142 + 3];
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1207) {
						anInt7142 -= 2;
						local220.anInt3815 = anIntArray578[anInt7142];
						local220.anInt3786 = anIntArray578[anInt7142 + 1];
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1210) {
						anInt7142 -= 4;
						local220.anInt3831 = anIntArray578[anInt7142];
						local220.anInt3738 = anIntArray578[anInt7142 + 1];
						if (anIntArray578[anInt7142 + 2] == 1) {
							local220.anInt3823 = 9;
						} else {
							local220.anInt3823 = 8;
						}
						if (anIntArray578[anInt7142 + 3] == 1) {
							local220.aBoolean288 = true;
						} else {
							local220.aBoolean288 = false;
						}
						if (local220.anInt3741 == -1) {
							Static96.method8819(local220.anInt3812);
						}
						return;
					}
					if (arg0 == 1211) {
						local220.anInt3823 = 5;
						local220.anInt3831 = Static312.anInt5000;
						local220.anInt3738 = 0;
						if (local220.anInt3741 == -1) {
							Static96.method8819(local220.anInt3812);
						}
						return;
					}
				} else {
					@Pc(2978) int local2978;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local220 = Static145.method2412(anIntArray578[--anInt7142]);
						} else {
							local220 = arg1 ? aClass158_12 : aClass158_11;
						}
						if (arg0 == 1300) {
							local21 = anIntArray578[--anInt7142] - 1;
							if (local21 >= 0 && local21 <= 9) {
								local220.method3391(aStringArray37[--anInt7139], local21);
								return;
							}
							anInt7139--;
							return;
						}
						if (arg0 == 1301) {
							anInt7142 -= 2;
							local21 = anIntArray578[anInt7142];
							local27 = anIntArray578[anInt7142 + 1];
							if (local21 == -1 && local27 == -1) {
								local220.aClass158_6 = null;
								return;
							}
							local220.aClass158_6 = Static15.method186(local27, local21);
							return;
						}
						if (arg0 == 1302) {
							local21 = anIntArray578[--anInt7142];
							if (local21 != Static351.anInt5719 && local21 != Static137.anInt2510 && local21 != Static237.anInt6524) {
								return;
							}
							local220.anInt3830 = local21;
							return;
						}
						if (arg0 == 1303) {
							local220.anInt3754 = anIntArray578[--anInt7142];
							return;
						}
						if (arg0 == 1304) {
							local220.anInt3797 = anIntArray578[--anInt7142];
							return;
						}
						if (arg0 == 1305) {
							local220.aString41 = aStringArray37[--anInt7139];
							return;
						}
						if (arg0 == 1306) {
							local220.aString43 = aStringArray37[--anInt7139];
							return;
						}
						if (arg0 == 1307) {
							local220.aStringArray17 = null;
							return;
						}
						if (arg0 == 1308) {
							local220.anInt3819 = anIntArray578[--anInt7142];
							local220.anInt3749 = anIntArray578[--anInt7142];
							return;
						}
						if (arg0 == 1309) {
							local21 = anIntArray578[--anInt7142];
							local27 = anIntArray578[--anInt7142];
							if (local27 >= 1 && local27 <= 10) {
								local220.method3397(local27 - 1, local21);
							}
							return;
						}
						if (arg0 == 1310) {
							local220.aString42 = aStringArray37[--anInt7139];
							return;
						}
						if (arg0 == 1311) {
							local220.anInt3776 = anIntArray578[--anInt7142];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt7142 -= 3;
								local21 = anIntArray578[anInt7142] - 1;
								local27 = anIntArray578[anInt7142 + 1];
								local506 = anIntArray578[anInt7142 + 2];
								if (local21 < 0 || local21 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt7142 -= 2;
								local21 = 10;
								local27 = anIntArray578[anInt7142];
								local506 = anIntArray578[anInt7142 + 1];
							}
							if (local220.aByteArray37 == null) {
								if (local27 == 0) {
									return;
								}
								local220.aByteArray37 = new byte[11];
								local220.aByteArray36 = new byte[11];
								local220.anIntArray293 = new int[11];
							}
							local220.aByteArray37[local21] = (byte) local27;
							if (local27 == 0) {
								local220.aBoolean296 = false;
								for (local2978 = 0; local2978 < local220.aByteArray37.length; local2978++) {
									if (local220.aByteArray37[local2978] != 0) {
										local220.aBoolean296 = true;
										break;
									}
								}
							} else {
								local220.aBoolean296 = true;
							}
							local220.aByteArray36[local21] = (byte) local506;
							return;
						}
						if (arg0 == 1314) {
							local220.anInt3783 = anIntArray578[--anInt7142];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local220 = Static145.method2412(anIntArray578[--anInt7142]);
						} else {
							local220 = arg1 ? aClass158_12 : aClass158_11;
						}
						if (arg0 == 1499) {
							local220.method3399();
							return;
						}
						local1394 = aStringArray37[--anInt7139];
						@Pc(3077) int[] local3077 = null;
						if (local1394.length() > 0 && local1394.charAt(local1394.length() - 1) == 'Y') {
							local506 = anIntArray578[--anInt7142];
							if (local506 > 0) {
								local3077 = new int[local506];
								while (local506-- > 0) {
									local3077[local506] = anIntArray578[--anInt7142];
								}
							}
							local1394 = local1394.substring(0, local1394.length() - 1);
						}
						@Pc(3131) Object[] local3131 = new Object[local1394.length() + 1];
						for (local2978 = local3131.length - 1; local2978 >= 1; local2978--) {
							if (local1394.charAt(local2978 - 1) == 's') {
								local3131[local2978] = aStringArray37[--anInt7139];
							} else if (local1394.charAt(local2978 - 1) == '§') {
								local3131[local2978] = Long.valueOf(aLongArray14[--anInt7152]);
							} else {
								local3131[local2978] = Integer.valueOf(anIntArray578[--anInt7142]);
							}
						}
						local72 = anIntArray578[--anInt7142];
						if (local72 == -1) {
							local3131 = null;
						} else {
							local3131[0] = Integer.valueOf(local72);
						}
						if (arg0 == 1400) {
							local220.anObjectArray17 = local3131;
						} else if (arg0 == 1401) {
							local220.anObjectArray32 = local3131;
						} else if (arg0 == 1402) {
							local220.anObjectArray1 = local3131;
						} else if (arg0 == 1403) {
							local220.anObjectArray4 = local3131;
						} else if (arg0 == 1404) {
							local220.anObjectArray26 = local3131;
						} else if (arg0 == 1405) {
							local220.anObjectArray30 = local3131;
						} else if (arg0 == 1406) {
							local220.anObjectArray16 = local3131;
						} else if (arg0 == 1407) {
							local220.anObjectArray25 = local3131;
							local220.anIntArray300 = local3077;
						} else if (arg0 == 1408) {
							local220.anObjectArray3 = local3131;
						} else if (arg0 == 1409) {
							local220.anObjectArray15 = local3131;
						} else if (arg0 == 1410) {
							local220.anObjectArray5 = local3131;
						} else if (arg0 == 1411) {
							local220.anObjectArray24 = local3131;
						} else if (arg0 == 1412) {
							local220.anObjectArray28 = local3131;
						} else if (arg0 == 1414) {
							local220.anObjectArray8 = local3131;
							local220.anIntArray299 = local3077;
						} else if (arg0 == 1415) {
							local220.anObjectArray21 = local3131;
							local220.anIntArray295 = local3077;
						} else if (arg0 == 1416) {
							local220.anObjectArray14 = local3131;
						} else if (arg0 == 1417) {
							local220.anObjectArray11 = local3131;
						} else if (arg0 == 1418) {
							local220.anObjectArray7 = local3131;
						} else if (arg0 == 1419) {
							local220.anObjectArray22 = local3131;
						} else if (arg0 == 1420) {
							local220.anObjectArray29 = local3131;
						} else if (arg0 == 1421) {
							local220.anObjectArray27 = local3131;
						} else if (arg0 == 1422) {
							local220.anObjectArray34 = local3131;
						} else if (arg0 == 1423) {
							local220.anObjectArray20 = local3131;
						} else if (arg0 == 1424) {
							local220.anObjectArray6 = local3131;
						} else if (arg0 == 1425) {
							local220.anObjectArray9 = local3131;
						} else if (arg0 == 1426) {
							local220.anObjectArray31 = local3131;
						} else if (arg0 == 1427) {
							local220.anObjectArray19 = local3131;
						} else if (arg0 == 1428) {
							local220.anObjectArray2 = local3131;
							local220.anIntArray298 = local3077;
						} else if (arg0 == 1429) {
							local220.anObjectArray18 = local3131;
							local220.anIntArray296 = local3077;
						} else if (arg0 == 1430) {
							local220.anObjectArray10 = local3131;
						} else if (arg0 == 1431) {
							local220.anObjectArray23 = local3131;
						} else if (arg0 == 1432) {
							local220.anObjectArray12 = local3131;
						} else if (arg0 == 1433) {
							local220.anObjectArray33 = local3131;
						}
						local220.aBoolean297 = true;
						return;
					} else if (arg0 < 1600) {
						local220 = arg1 ? aClass158_12 : aClass158_11;
						if (arg0 == 1500) {
							anIntArray578[anInt7142++] = local220.anInt3735;
							return;
						}
						if (arg0 == 1501) {
							anIntArray578[anInt7142++] = local220.anInt3784;
							return;
						}
						if (arg0 == 1502) {
							anIntArray578[anInt7142++] = local220.anInt3802;
							return;
						}
						if (arg0 == 1503) {
							anIntArray578[anInt7142++] = local220.anInt3746;
							return;
						}
						if (arg0 == 1504) {
							anIntArray578[anInt7142++] = local220.aBoolean284 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray578[anInt7142++] = local220.anInt3743;
							return;
						}
						if (arg0 == 1506) {
							local248 = Static556.method7299(local220);
							anIntArray578[anInt7142++] = local248 == null ? -1 : local248.anInt3812;
							return;
						}
						if (arg0 == 1507) {
							anIntArray578[anInt7142++] = local220.anInt3779;
							return;
						}
					} else {
						@Pc(3848) Class296 local3848;
						if (arg0 < 1700) {
							local220 = arg1 ? aClass158_12 : aClass158_11;
							if (arg0 == 1600) {
								anIntArray578[anInt7142++] = local220.anInt3809;
								return;
							}
							if (arg0 == 1601) {
								anIntArray578[anInt7142++] = local220.anInt3768;
								return;
							}
							if (arg0 == 1602) {
								aStringArray37[anInt7139++] = local220.aString44;
								return;
							}
							if (arg0 == 1603) {
								anIntArray578[anInt7142++] = local220.anInt3769;
								return;
							}
							if (arg0 == 1604) {
								anIntArray578[anInt7142++] = local220.anInt3742;
								return;
							}
							if (arg0 == 1605) {
								anIntArray578[anInt7142++] = local220.anInt3793;
								return;
							}
							if (arg0 == 1606) {
								anIntArray578[anInt7142++] = local220.anInt3807;
								return;
							}
							if (arg0 == 1607) {
								anIntArray578[anInt7142++] = local220.anInt3737;
								return;
							}
							if (arg0 == 1608) {
								anIntArray578[anInt7142++] = local220.anInt3811;
								return;
							}
							if (arg0 == 1609) {
								anIntArray578[anInt7142++] = local220.anInt3780;
								return;
							}
							if (arg0 == 1610) {
								anIntArray578[anInt7142++] = local220.anInt3736;
								return;
							}
							if (arg0 == 1611) {
								anIntArray578[anInt7142++] = local220.anInt3804;
								return;
							}
							if (arg0 == 1612) {
								anIntArray578[anInt7142++] = local220.anInt3810;
								return;
							}
							if (arg0 == 1613) {
								local21 = anIntArray578[--anInt7142];
								local3848 = Static386.aClass49_2.method1161(local21);
								if (local3848.method6672()) {
									aStringArray37[anInt7139++] = local220.method3389(local3848.aString89, local21);
									return;
								}
								anIntArray578[anInt7142++] = local220.method3404(local3848.anInt7509, local21);
								return;
							}
							if (arg0 == 1614) {
								anIntArray578[anInt7142++] = local220.anInt3765;
								return;
							}
							if (arg0 == 2614) {
								anIntArray578[anInt7142++] = local220.anInt3823 == 1 ? local220.anInt3831 : -1;
								return;
							}
							if (arg0 == 1618) {
								anIntArray578[anInt7142++] = local220.anInt3781;
								return;
							}
						} else if (arg0 < 1800) {
							local220 = arg1 ? aClass158_12 : aClass158_11;
							if (arg0 == 1700) {
								anIntArray578[anInt7142++] = local220.anInt3760;
								return;
							}
							if (arg0 == 1701) {
								if (local220.anInt3760 != -1) {
									anIntArray578[anInt7142++] = local220.anInt3817;
									return;
								}
								anIntArray578[anInt7142++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray578[anInt7142++] = local220.anInt3741;
								return;
							}
						} else if (arg0 < 1900) {
							local220 = arg1 ? aClass158_12 : aClass158_11;
							if (arg0 == 1800) {
								anIntArray578[anInt7142++] = Static84.method1661(local220).method6216();
								return;
							}
							if (arg0 == 1801) {
								local21 = anIntArray578[--anInt7142];
								local21--;
								if (local220.aStringArray17 != null && local21 < local220.aStringArray17.length && local220.aStringArray17[local21] != null) {
									aStringArray37[anInt7139++] = local220.aStringArray17[local21];
									return;
								}
								aStringArray37[anInt7139++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local220.aString41 == null) {
									aStringArray37[anInt7139++] = "";
									return;
								}
								aStringArray37[anInt7139++] = local220.aString41;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local220 = Static145.method2412(anIntArray578[--anInt7142]);
								arg0 -= 1000;
							} else {
								local220 = arg1 ? aClass158_12 : aClass158_11;
							}
							if (anInt7153 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local220.anObjectArray19 == null) {
									return;
								}
								@Pc(4169) Class2_Sub42 local4169 = new Class2_Sub42();
								local4169.aClass158_14 = local220;
								local4169.anObjectArray36 = local220.anObjectArray19;
								local4169.anInt7220 = anInt7153 + 1;
								Static521.aClass339_44.method7711(local4169);
								return;
							}
						} else if (arg0 < 2600) {
							local220 = Static145.method2412(anIntArray578[--anInt7142]);
							if (arg0 == 2500) {
								anIntArray578[anInt7142++] = local220.anInt3735;
								return;
							}
							if (arg0 == 2501) {
								anIntArray578[anInt7142++] = local220.anInt3784;
								return;
							}
							if (arg0 == 2502) {
								anIntArray578[anInt7142++] = local220.anInt3802;
								return;
							}
							if (arg0 == 2503) {
								anIntArray578[anInt7142++] = local220.anInt3746;
								return;
							}
							if (arg0 == 2504) {
								anIntArray578[anInt7142++] = local220.aBoolean284 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray578[anInt7142++] = local220.anInt3743;
								return;
							}
							if (arg0 == 2506) {
								local248 = Static556.method7299(local220);
								anIntArray578[anInt7142++] = local248 == null ? -1 : local248.anInt3812;
								return;
							}
							if (arg0 == 2507) {
								anIntArray578[anInt7142++] = local220.anInt3779;
								return;
							}
						} else if (arg0 < 2700) {
							local220 = Static145.method2412(anIntArray578[--anInt7142]);
							if (arg0 == 2600) {
								anIntArray578[anInt7142++] = local220.anInt3809;
								return;
							}
							if (arg0 == 2601) {
								anIntArray578[anInt7142++] = local220.anInt3768;
								return;
							}
							if (arg0 == 2602) {
								aStringArray37[anInt7139++] = local220.aString44;
								return;
							}
							if (arg0 == 2603) {
								anIntArray578[anInt7142++] = local220.anInt3769;
								return;
							}
							if (arg0 == 2604) {
								anIntArray578[anInt7142++] = local220.anInt3742;
								return;
							}
							if (arg0 == 2605) {
								anIntArray578[anInt7142++] = local220.anInt3793;
								return;
							}
							if (arg0 == 2606) {
								anIntArray578[anInt7142++] = local220.anInt3807;
								return;
							}
							if (arg0 == 2607) {
								anIntArray578[anInt7142++] = local220.anInt3737;
								return;
							}
							if (arg0 == 2608) {
								anIntArray578[anInt7142++] = local220.anInt3811;
								return;
							}
							if (arg0 == 2609) {
								anIntArray578[anInt7142++] = local220.anInt3780;
								return;
							}
							if (arg0 == 2610) {
								anIntArray578[anInt7142++] = local220.anInt3736;
								return;
							}
							if (arg0 == 2611) {
								anIntArray578[anInt7142++] = local220.anInt3804;
								return;
							}
							if (arg0 == 2612) {
								anIntArray578[anInt7142++] = local220.anInt3810;
								return;
							}
							if (arg0 == 2613) {
								anIntArray578[anInt7142++] = local220.anInt3765;
								return;
							}
							if (arg0 == 2614) {
								anIntArray578[anInt7142++] = local220.anInt3823 == 1 ? local220.anInt3831 : -1;
								return;
							}
							if (arg0 == 2617) {
								anIntArray578[anInt7142++] = local220.anInt3781;
								return;
							}
						} else {
							@Pc(4760) Class2_Sub4 local4760;
							@Pc(4653) Class2_Sub4 local4653;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local220 = Static145.method2412(anIntArray578[--anInt7142]);
									anIntArray578[anInt7142++] = local220.anInt3760;
									return;
								}
								if (arg0 == 2701) {
									local220 = Static145.method2412(anIntArray578[--anInt7142]);
									if (local220.anInt3760 != -1) {
										anIntArray578[anInt7142++] = local220.anInt3817;
										return;
									}
									anIntArray578[anInt7142++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local15 = anIntArray578[--anInt7142];
									local4653 = (Class2_Sub4) Static548.aClass28_40.method738((long) local15);
									if (local4653 != null) {
										anIntArray578[anInt7142++] = 1;
										return;
									}
									anIntArray578[anInt7142++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local220 = Static145.method2412(anIntArray578[--anInt7142]);
									if (local220.aClass158Array2 == null) {
										anIntArray578[anInt7142++] = 0;
										return;
									}
									local21 = local220.aClass158Array2.length;
									for (local27 = 0; local27 < local220.aClass158Array2.length; local27++) {
										if (local220.aClass158Array2[local27] == null) {
											local21 = local27;
											break;
										}
									}
									anIntArray578[anInt7142++] = local21;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt7142 -= 2;
									local15 = anIntArray578[anInt7142];
									local21 = anIntArray578[anInt7142 + 1];
									local4760 = (Class2_Sub4) Static548.aClass28_40.method738((long) local15);
									if (local4760 != null && local4760.anInt147 == local21) {
										anIntArray578[anInt7142++] = 1;
										return;
									}
									anIntArray578[anInt7142++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local220 = Static145.method2412(anIntArray578[--anInt7142]);
								if (arg0 == 2800) {
									anIntArray578[anInt7142++] = Static84.method1661(local220).method6216();
									return;
								}
								if (arg0 == 2801) {
									local21 = anIntArray578[--anInt7142];
									local21--;
									if (local220.aStringArray17 != null && local21 < local220.aStringArray17.length && local220.aStringArray17[local21] != null) {
										aStringArray37[anInt7139++] = local220.aStringArray17[local21];
										return;
									}
									aStringArray37[anInt7139++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local220.aString41 == null) {
										aStringArray37[anInt7139++] = "";
										return;
									}
									aStringArray37[anInt7139++] = local220.aString41;
									return;
								}
							} else {
								@Pc(5005) Class2_Sub19 local5005;
								@Pc(4911) String local4911;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local4911 = aStringArray37[--anInt7139];
										Static695.method9265(local4911);
										return;
									}
									if (arg0 == 3101) {
										anInt7142 -= 2;
										Static550.method7260(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2, anIntArray578[anInt7142 + 1], anIntArray578[anInt7142]);
										return;
									}
									if (arg0 == 3103) {
										Static77.method1557();
										return;
									}
									if (arg0 == 3104) {
										local4911 = aStringArray37[--anInt7139];
										local21 = 0;
										if (Static467.method6350(local4911)) {
											local21 = Static647.method8473(local4911);
										}
										@Pc(4974) Class2_Sub19 local4974 = Static293.method4335(Static330.aClass345_66, Static405.aClass153_2.aIsaacRandom_1);
										local4974.aPacketBit_1.p4(local21);
										Static405.aClass153_2.method3275(local4974);
										return;
									}
									if (arg0 == 3105) {
										local4911 = aStringArray37[--anInt7139];
										local5005 = Static293.method4335(Static276.aClass345_56, Static405.aClass153_2.aIsaacRandom_1);
										local5005.aPacketBit_1.p1(local4911.length() + 1);
										local5005.aPacketBit_1.pjstr(local4911);
										Static405.aClass153_2.method3275(local5005);
										return;
									}
									if (arg0 == 3106) {
										local4911 = aStringArray37[--anInt7139];
										local5005 = Static293.method4335(Static137.aClass345_28, Static405.aClass153_2.aIsaacRandom_1);
										local5005.aPacketBit_1.p1(local4911.length() + 1);
										local5005.aPacketBit_1.pjstr(local4911);
										Static405.aClass153_2.method3275(local5005);
										return;
									}
									if (arg0 == 3107) {
										local15 = anIntArray578[--anInt7142];
										local1394 = aStringArray37[--anInt7139];
										Static242.method3504(local1394, local15);
										return;
									}
									if (arg0 == 3108) {
										anInt7142 -= 3;
										local15 = anIntArray578[anInt7142];
										local21 = anIntArray578[anInt7142 + 1];
										local27 = anIntArray578[anInt7142 + 2];
										local38 = Static145.method2412(local27);
										Static597.method7824(local21, local38, local15);
										return;
									}
									if (arg0 == 3109) {
										anInt7142 -= 2;
										local15 = anIntArray578[anInt7142];
										local21 = anIntArray578[anInt7142 + 1];
										local303 = arg1 ? aClass158_12 : aClass158_11;
										Static597.method7824(local21, local303, local15);
										return;
									}
									if (arg0 == 3110) {
										local15 = anIntArray578[--anInt7142];
										local5005 = Static293.method4335(Static209.aClass345_37, Static405.aClass153_2.aIsaacRandom_1);
										local5005.aPacketBit_1.p2(local15);
										Static405.aClass153_2.method3275(local5005);
										return;
									}
									if (arg0 == 3111) {
										anInt7142 -= 2;
										local15 = anIntArray578[anInt7142];
										local21 = anIntArray578[anInt7142 + 1];
										local4760 = (Class2_Sub4) Static548.aClass28_40.method738((long) local15);
										if (local4760 != null) {
											Static449.method6115(true, local4760.anInt147 != local21, local4760);
										}
										Static163.method8850(3, local21, local15, true);
										return;
									}
									if (arg0 == 3112) {
										anInt7142--;
										local15 = anIntArray578[anInt7142];
										local4653 = (Class2_Sub4) Static548.aClass28_40.method738((long) local15);
										if (local4653 != null && local4653.anInt146 == 3) {
											Static449.method6115(true, true, local4653);
										}
										return;
									}
									if (arg0 == 3113) {
										Static57.method1231(aStringArray37[--anInt7139]);
										return;
									}
									if (arg0 == 3114) {
										anInt7142 -= 2;
										local15 = anIntArray578[anInt7142];
										local21 = anIntArray578[anInt7142 + 1];
										local1791 = aStringArray37[--anInt7139];
										Static44.method1072(local1791, "", local21, "", "", local15);
										return;
									}
									if (arg0 == 3115) {
										anInt7142 -= 11;
										@Pc(5320) Class403[] local5320 = Static33.method882();
										@Pc(5323) Class103[] local5323 = Static313.method4544();
										Static124.method2216(anIntArray578[anInt7142 + 7], anIntArray578[anInt7142 + 2], anIntArray578[anInt7142 + 9], anIntArray578[anInt7142 + 4], local5323[anIntArray578[anInt7142 + 1]], anIntArray578[anInt7142 + 5], anIntArray578[anInt7142 + 8], anIntArray578[anInt7142 + 6], anIntArray578[anInt7142 + 3], local5320[anIntArray578[anInt7142]], anIntArray578[anInt7142 + 10]);
										return;
									}
									if (arg0 == 3116) {
										local15 = anIntArray578[--anInt7142];
										local5005 = Static293.method4335(Static436.aClass345_44, Static405.aClass153_2.aIsaacRandom_1);
										local5005.aPacketBit_1.p2(local15);
										Static405.aClass153_2.method3275(local5005);
										return;
									}
									if (arg0 == 3117) {
										local4911 = aStringArray37[--anInt7139];
										local5005 = Static293.method4335(Static357.aClass345_82, Static405.aClass153_2.aIsaacRandom_1);
										local5005.aPacketBit_1.p1(local4911.length() + 1);
										local5005.aPacketBit_1.pjstr(local4911);
										Static405.aClass153_2.method3275(local5005);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt7142 -= 3;
										Static161.method2586(256, anIntArray578[anInt7142 + 2], anIntArray578[anInt7142], anIntArray578[anInt7142 + 1], 255);
										return;
									}
									if (arg0 == 3201) {
										Static63.method1427(255, anIntArray578[--anInt7142], 50);
										return;
									}
									if (arg0 == 3202) {
										anInt7142 -= 2;
										Static482.method6481(255, anIntArray578[anInt7142], anIntArray578[anInt7142 + 1]);
										return;
									}
									if (arg0 == 3203) {
										anInt7142 -= 4;
										Static161.method2586(256, anIntArray578[anInt7142 + 2], anIntArray578[anInt7142], anIntArray578[anInt7142 + 1], anIntArray578[anInt7142 + 3]);
										return;
									}
									if (arg0 == 3204) {
										anInt7142 -= 3;
										Static63.method1427(anIntArray578[anInt7142 + 1], anIntArray578[anInt7142], anIntArray578[anInt7142 + 2]);
										return;
									}
									if (arg0 == 3205) {
										anInt7142 -= 3;
										Static482.method6481(anIntArray578[anInt7142 + 2], anIntArray578[anInt7142], anIntArray578[anInt7142 + 1]);
										return;
									}
									if (arg0 == 3206) {
										anInt7142 -= 4;
										Static186.method2818(anIntArray578[anInt7142], anIntArray578[anInt7142 + 1], 256, anIntArray578[anInt7142 + 2], anIntArray578[anInt7142 + 3], false);
										return;
									}
									if (arg0 == 3207) {
										anInt7142 -= 4;
										Static186.method2818(anIntArray578[anInt7142], anIntArray578[anInt7142 + 1], 256, anIntArray578[anInt7142 + 2], anIntArray578[anInt7142 + 3], true);
										return;
									}
									if (arg0 == 3208) {
										anInt7142 -= 5;
										Static161.method2586(anIntArray578[anInt7142 + 4], anIntArray578[anInt7142 + 2], anIntArray578[anInt7142], anIntArray578[anInt7142 + 1], anIntArray578[anInt7142 + 3]);
										return;
									}
									if (arg0 == 3209) {
										anInt7142 -= 5;
										Static186.method2818(anIntArray578[anInt7142], anIntArray578[anInt7142 + 1], anIntArray578[anInt7142 + 4], anIntArray578[anInt7142 + 2], anIntArray578[anInt7142 + 3], false);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray578[anInt7142++] = Static333.anInt5455;
										return;
									}
									if (arg0 == 3301) {
										anInt7142 -= 2;
										local15 = anIntArray578[anInt7142];
										local21 = anIntArray578[anInt7142 + 1];
										anIntArray578[anInt7142++] = Static597.method7822(local15, local21, false);
										return;
									}
									if (arg0 == 3302) {
										anInt7142 -= 2;
										local15 = anIntArray578[anInt7142];
										local21 = anIntArray578[anInt7142 + 1];
										anIntArray578[anInt7142++] = Static536.method7169(local21, false, local15);
										return;
									}
									if (arg0 == 3303) {
										anInt7142 -= 2;
										local15 = anIntArray578[anInt7142];
										local21 = anIntArray578[anInt7142 + 1];
										anIntArray578[anInt7142++] = Static67.method6099(local21, local15, false);
										return;
									}
									if (arg0 == 3304) {
										local15 = anIntArray578[--anInt7142];
										anIntArray578[anInt7142++] = Static503.aClass335_1.method7657(local15).anInt2072;
										return;
									}
									if (arg0 == 3305) {
										local15 = anIntArray578[--anInt7142];
										anIntArray578[anInt7142++] = Static581.anIntArray688[local15];
										return;
									}
									if (arg0 == 3306) {
										local15 = anIntArray578[--anInt7142];
										anIntArray578[anInt7142++] = Static498.anIntArray604[local15];
										return;
									}
									if (arg0 == 3307) {
										local15 = anIntArray578[--anInt7142];
										anIntArray578[anInt7142++] = Static237.anIntArray518[local15];
										return;
									}
									if (arg0 == 3308) {
										@Pc(5929) byte local5929 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144;
										local21 = (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10690 >> 9) + Static691.anInt10367;
										local27 = (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10694 >> 9) + Static116.anInt2270;
										anIntArray578[anInt7142++] = (local5929 << 28) + (local21 << 14) + local27;
										return;
									}
									if (arg0 == 3309) {
										local15 = anIntArray578[--anInt7142];
										anIntArray578[anInt7142++] = local15 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local15 = anIntArray578[--anInt7142];
										anIntArray578[anInt7142++] = local15 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local15 = anIntArray578[--anInt7142];
										anIntArray578[anInt7142++] = local15 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray578[anInt7142++] = Static174.aBoolean249 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt7142 -= 2;
										local15 = anIntArray578[anInt7142];
										local21 = anIntArray578[anInt7142 + 1];
										anIntArray578[anInt7142++] = Static597.method7822(local15, local21, true);
										return;
									}
									if (arg0 == 3314) {
										anInt7142 -= 2;
										local15 = anIntArray578[anInt7142];
										local21 = anIntArray578[anInt7142 + 1];
										anIntArray578[anInt7142++] = Static536.method7169(local21, true, local15);
										return;
									}
									if (arg0 == 3315) {
										anInt7142 -= 2;
										local15 = anIntArray578[anInt7142];
										local21 = anIntArray578[anInt7142 + 1];
										anIntArray578[anInt7142++] = Static67.method6099(local21, local15, true);
										return;
									}
									if (arg0 == 3316) {
										if (Static608.anInt9290 >= 2) {
											anIntArray578[anInt7142++] = Static608.anInt9290;
											return;
										}
										anIntArray578[anInt7142++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray578[anInt7142++] = Static249.anInt4008;
										return;
									}
									if (arg0 == 3318) {
										anIntArray578[anInt7142++] = Static344.aClass229_1.anInt5856;
										return;
									}
									if (arg0 == 3321) {
										anIntArray578[anInt7142++] = Static703.anInt10571;
										return;
									}
									if (arg0 == 3322) {
										anIntArray578[anInt7142++] = Static494.anInt7404;
										return;
									}
									if (arg0 == 3323) {
										if (Static38.anInt928 >= 5 && Static38.anInt928 <= 9) {
											anIntArray578[anInt7142++] = 1;
											return;
										}
										anIntArray578[anInt7142++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static38.anInt928 >= 5 && Static38.anInt928 <= 9) {
											anIntArray578[anInt7142++] = Static38.anInt928;
											return;
										}
										anIntArray578[anInt7142++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray578[anInt7142++] = Static126.aBoolean200 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray578[anInt7142++] = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt1444;
										return;
									}
									if (arg0 == 3327) {
										anIntArray578[anInt7142++] = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass201_1 != null && Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass201_1.aBoolean385 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray578[anInt7142++] = Static617.aBoolean724 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local15 = anIntArray578[--anInt7142];
										anIntArray578[anInt7142++] = Static46.method1082(local15);
										return;
									}
									if (arg0 == 3331) {
										anInt7142 -= 2;
										local15 = anIntArray578[anInt7142];
										local21 = anIntArray578[anInt7142 + 1];
										anIntArray578[anInt7142++] = Static390.method5494(false, local21, local15);
										return;
									}
									if (arg0 == 3332) {
										anInt7142 -= 2;
										local15 = anIntArray578[anInt7142];
										local21 = anIntArray578[anInt7142 + 1];
										anIntArray578[anInt7142++] = Static390.method5494(true, local21, local15);
										return;
									}
									if (arg0 == 3333) {
										anIntArray578[anInt7142++] = Static696.method9034();
										return;
									}
									if (arg0 == 3335) {
										anIntArray578[anInt7142++] = Static51.anInt1052;
										return;
									}
									if (arg0 == 3336) {
										anInt7142 -= 4;
										local15 = anIntArray578[anInt7142];
										local21 = anIntArray578[anInt7142 + 1];
										local27 = anIntArray578[anInt7142 + 2];
										local506 = anIntArray578[anInt7142 + 3];
										local15 += local21 << 14;
										local15 += local27 << 28;
										local15 += local506;
										anIntArray578[anInt7142++] = local15;
										return;
									}
									if (arg0 == 3337) {
										anIntArray578[anInt7142++] = Static323.anInt5121;
										return;
									}
									if (arg0 == 3338) {
										anIntArray578[anInt7142++] = Static65.method1470();
										return;
									}
									if (arg0 == 3339) {
										anIntArray578[anInt7142++] = 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray578[anInt7142++] = Static91.aBoolean750 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray578[anInt7142++] = Static29.aBoolean61 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray578[anInt7142++] = Static189.aClass120_1.method8853();
										return;
									}
									if (arg0 == 3343) {
										anIntArray578[anInt7142++] = Static189.aClass120_1.method8854();
										return;
									}
									if (arg0 == 3344) {
										aStringArray37[anInt7139++] = Static130.method2281();
										return;
									}
									if (arg0 == 3345) {
										aStringArray37[anInt7139++] = Static690.method8998();
										return;
									}
									if (arg0 == 3346) {
										anIntArray578[anInt7142++] = Static338.method4995();
										return;
									}
									if (arg0 == 3347) {
										anIntArray578[anInt7142++] = Static470.anInt7112;
										return;
									}
									if (arg0 == 3349) {
										anIntArray578[anInt7142++] = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass126_7.method2673(16383) >> 3;
										return;
									}
									if (arg0 == 3350) {
										local4911 = aStringArray37[--anInt7139];
										if (Static416.aString71 != null && Static416.aString71.equalsIgnoreCase(local4911)) {
											anIntArray578[anInt7142++] = 1;
											return;
										}
										anIntArray578[anInt7142++] = 0;
										return;
									}
									if (arg0 == 3351) {
										anIntArray578[anInt7142++] = Static189.aClass120_1.method8842() ? 1 : 0;
										anIntArray578[anInt7142++] = Static189.aClass120_1.method8847() ? 1 : 0;
										anIntArray578[anInt7142++] = Static189.aClass120_1.method8843() ? 1 : 0;
										return;
									}
								} else {
									@Pc(7345) String local7345;
									if (arg0 < 3500) {
										@Pc(6822) Class53 local6822;
										if (arg0 == 3400) {
											anInt7142 -= 2;
											local15 = anIntArray578[anInt7142];
											local21 = anIntArray578[anInt7142 + 1];
											local6822 = Static619.aClass387_2.method8925(local15);
											aStringArray37[anInt7139++] = local6822.method1229(local21);
											return;
										}
										@Pc(6868) Class53 local6868;
										if (arg0 == 3408) {
											anInt7142 -= 4;
											local15 = anIntArray578[anInt7142];
											local21 = anIntArray578[anInt7142 + 1];
											local27 = anIntArray578[anInt7142 + 2];
											local506 = anIntArray578[anInt7142 + 3];
											local6868 = Static619.aClass387_2.method8925(local27);
											if (local6868.aChar2 == local15 && local6868.aChar1 == local21) {
												if (local21 == 115) {
													aStringArray37[anInt7139++] = local6868.method1229(local506);
													return;
												}
												anIntArray578[anInt7142++] = local6868.method1227(local506);
												return;
											}
											throw new RuntimeException("C3408-1 " + local27 + "-" + local506);
										}
										@Pc(6963) Class53 local6963;
										if (arg0 == 3409) {
											anInt7142 -= 3;
											local15 = anIntArray578[anInt7142];
											local21 = anIntArray578[anInt7142 + 1];
											local27 = anIntArray578[anInt7142 + 2];
											if (local21 == -1) {
												throw new RuntimeException("C3409-2");
											}
											local6963 = Static619.aClass387_2.method8925(local21);
											if (local6963.aChar1 != local15) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray578[anInt7142++] = local6963.method1233(local27) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local15 = anIntArray578[--anInt7142];
											local1394 = aStringArray37[--anInt7139];
											if (local15 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local6822 = Static619.aClass387_2.method8925(local15);
											if (local6822.aChar1 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray578[anInt7142++] = local6822.method1221(local1394) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local15 = anIntArray578[--anInt7142];
											@Pc(7072) Class53 local7072 = Static619.aClass387_2.method8925(local15);
											anIntArray578[anInt7142++] = local7072.method1228();
											return;
										}
										if (arg0 == 3412) {
											anInt7142 -= 3;
											local15 = anIntArray578[anInt7142];
											local21 = anIntArray578[anInt7142 + 1];
											local27 = anIntArray578[anInt7142 + 2];
											if (local21 == -1) {
												throw new RuntimeException();
											}
											local6963 = Static619.aClass387_2.method8925(local21);
											if (local6963.aChar1 != local15) {
												throw new RuntimeException();
											}
											@Pc(7133) Class2_Sub40 local7133 = local6963.method1223(local27);
											local72 = 0;
											if (local7133 != null) {
												local72 = local7133.anIntArray531.length;
											}
											anIntArray578[anInt7142++] = local72;
											return;
										}
										if (arg0 == 3413) {
											local15 = anIntArray578[--anInt7142];
											local1394 = aStringArray37[--anInt7139];
											if (local15 == -1) {
												throw new RuntimeException();
											}
											local6822 = Static619.aClass387_2.method8925(local15);
											if (local6822.aChar1 != 's') {
												throw new RuntimeException();
											}
											@Pc(7196) Class2_Sub26 local7196 = local6822.method1237(local1394);
											local2978 = 0;
											if (local7196 != null) {
												local2978 = local7196.anIntArray318.length;
											}
											anIntArray578[anInt7142++] = local2978;
											return;
										}
										if (arg0 == 3414) {
											anInt7142 -= 5;
											local15 = anIntArray578[anInt7142];
											local21 = anIntArray578[anInt7142 + 1];
											local27 = anIntArray578[anInt7142 + 2];
											local506 = anIntArray578[anInt7142 + 3];
											local2978 = anIntArray578[anInt7142 + 4];
											if (local27 == -1) {
												throw new RuntimeException();
											}
											@Pc(7261) Class53 local7261 = Static619.aClass387_2.method8925(local27);
											if (local7261.aChar2 != local21) {
												throw new RuntimeException();
											}
											if (local7261.aChar1 != local15) {
												throw new RuntimeException();
											}
											@Pc(7284) Class2_Sub40 local7284 = local7261.method1223(local506);
											if (local2978 >= 0 && local7284 != null && local7284.anIntArray531.length > local2978) {
												anIntArray578[anInt7142++] = local7284.anIntArray531[local2978];
												return;
											}
											throw new RuntimeException();
										}
										if (arg0 == 3415) {
											anInt7142 -= 3;
											local15 = anIntArray578[anInt7142];
											local21 = anIntArray578[anInt7142 + 1];
											local27 = anIntArray578[anInt7142 + 2];
											local7345 = aStringArray37[--anInt7139];
											if (local21 == -1) {
												throw new RuntimeException();
											}
											local6868 = Static619.aClass387_2.method8925(local21);
											if (local6868.aChar2 != local15) {
												throw new RuntimeException();
											}
											if (local6868.aChar1 != 's') {
												throw new RuntimeException();
											}
											@Pc(7381) Class2_Sub26 local7381 = local6868.method1237(local7345);
											if (local27 >= 0 && local7381 != null && local7381.anIntArray318.length > local27) {
												anIntArray578[anInt7142++] = local7381.anIntArray318[local27];
												return;
											}
											throw new RuntimeException();
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static251.anInt4036 == 0) {
												anIntArray578[anInt7142++] = -2;
												return;
											}
											if (Static251.anInt4036 == 1) {
												anIntArray578[anInt7142++] = -1;
												return;
											}
											anIntArray578[anInt7142++] = Static327.anInt5392;
											return;
										}
										if (arg0 == 3601) {
											local15 = anIntArray578[--anInt7142];
											if (Static251.anInt4036 == 2 && local15 < Static327.anInt5392) {
												aStringArray37[anInt7139++] = Static330.aStringArray25[local15];
												if (Static572.aStringArray42[local15] != null) {
													aStringArray37[anInt7139++] = Static572.aStringArray42[local15];
													return;
												}
												aStringArray37[anInt7139++] = "";
												return;
											}
											aStringArray37[anInt7139++] = "";
											aStringArray37[anInt7139++] = "";
											return;
										}
										if (arg0 == 3602) {
											local15 = anIntArray578[--anInt7142];
											if (Static251.anInt4036 == 2 && local15 < Static327.anInt5392) {
												anIntArray578[anInt7142++] = Static371.anIntArray455[local15];
												return;
											}
											anIntArray578[anInt7142++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local15 = anIntArray578[--anInt7142];
											if (Static251.anInt4036 == 2 && local15 < Static327.anInt5392) {
												anIntArray578[anInt7142++] = Static715.anIntArray881[local15];
												return;
											}
											anIntArray578[anInt7142++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local4911 = aStringArray37[--anInt7139];
											local21 = anIntArray578[--anInt7142];
											Static430.method5819(local4911, local21);
											return;
										}
										if (arg0 == 3605) {
											local4911 = aStringArray37[--anInt7139];
											Static706.method9225(local4911);
											return;
										}
										if (arg0 == 3606) {
											local4911 = aStringArray37[--anInt7139];
											Static545.method7242(local4911);
											return;
										}
										if (arg0 == 3607) {
											local4911 = aStringArray37[--anInt7139];
											Static231.method3382(false, local4911);
											return;
										}
										if (arg0 == 3608) {
											local4911 = aStringArray37[--anInt7139];
											Static726.method9463(local4911);
											return;
										}
										if (arg0 == 3609) {
											local4911 = aStringArray37[--anInt7139];
											if (local4911.startsWith("<img=0>") || local4911.startsWith("<img=1>")) {
												local4911 = local4911.substring(7);
											}
											anIntArray578[anInt7142++] = Static362.method5241(0, local4911) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local15 = anIntArray578[--anInt7142];
											if (Static251.anInt4036 == 2 && local15 < Static327.anInt5392) {
												aStringArray37[anInt7139++] = Static419.aStringArray33[local15];
												return;
											}
											aStringArray37[anInt7139++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static723.aString129 != null) {
												aStringArray37[anInt7139++] = Static682.method8923(Static723.aString129);
												return;
											}
											aStringArray37[anInt7139++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static723.aString129 != null) {
												anIntArray578[anInt7142++] = Static706.anInt10633;
												return;
											}
											anIntArray578[anInt7142++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local15 = anIntArray578[--anInt7142];
											if (Static723.aString129 != null && local15 < Static706.anInt10633) {
												aStringArray37[anInt7139++] = Static87.aClass241Array1[local15].aString67;
												return;
											}
											aStringArray37[anInt7139++] = "";
											return;
										}
										if (arg0 == 3614) {
											local15 = anIntArray578[--anInt7142];
											if (Static723.aString129 != null && local15 < Static706.anInt10633) {
												anIntArray578[anInt7142++] = Static87.aClass241Array1[local15].anInt6148;
												return;
											}
											anIntArray578[anInt7142++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local15 = anIntArray578[--anInt7142];
											if (Static723.aString129 != null && local15 < Static706.anInt10633) {
												anIntArray578[anInt7142++] = Static87.aClass241Array1[local15].aByte99;
												return;
											}
											anIntArray578[anInt7142++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray578[anInt7142++] = Static673.aByte140;
											return;
										}
										if (arg0 == 3617) {
											local4911 = aStringArray37[--anInt7139];
											Static128.method7754(local4911);
											return;
										}
										if (arg0 == 3618) {
											anIntArray578[anInt7142++] = Static682.aByte142;
											return;
										}
										if (arg0 == 3619) {
											local4911 = aStringArray37[--anInt7139];
											Static698.method9124(local4911);
											return;
										}
										if (arg0 == 3620) {
											Static396.method5551();
											return;
										}
										if (arg0 == 3621) {
											if (Static251.anInt4036 == 0) {
												anIntArray578[anInt7142++] = -1;
												return;
											}
											anIntArray578[anInt7142++] = Static436.anInt3849;
											return;
										}
										if (arg0 == 3622) {
											local15 = anIntArray578[--anInt7142];
											if (Static251.anInt4036 != 0 && local15 < Static436.anInt3849) {
												aStringArray37[anInt7139++] = Static632.aStringArray44[local15];
												if (Static10.aStringArray1[local15] != null) {
													aStringArray37[anInt7139++] = Static10.aStringArray1[local15];
													return;
												}
												aStringArray37[anInt7139++] = "";
												return;
											}
											aStringArray37[anInt7139++] = "";
											aStringArray37[anInt7139++] = "";
											return;
										}
										if (arg0 == 3623) {
											local4911 = aStringArray37[--anInt7139];
											if (local4911.startsWith("<img=0>") || local4911.startsWith("<img=1>")) {
												local4911 = local4911.substring(7);
											}
											anIntArray578[anInt7142++] = Static71.method1524(local4911) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local15 = anIntArray578[--anInt7142];
											if (Static87.aClass241Array1 != null && local15 < Static706.anInt10633 && Static87.aClass241Array1[local15].aString66.equalsIgnoreCase(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9)) {
												anIntArray578[anInt7142++] = 1;
												return;
											}
											anIntArray578[anInt7142++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static158.aString28 != null) {
												aStringArray37[anInt7139++] = Static158.aString28;
												return;
											}
											aStringArray37[anInt7139++] = "";
											return;
										}
										if (arg0 == 3626) {
											local15 = anIntArray578[--anInt7142];
											if (Static723.aString129 != null && local15 < Static706.anInt10633) {
												aStringArray37[anInt7139++] = Static87.aClass241Array1[local15].aString65;
												return;
											}
											aStringArray37[anInt7139++] = "";
											return;
										}
										if (arg0 == 3627) {
											local15 = anIntArray578[--anInt7142];
											if (Static251.anInt4036 == 2 && local15 >= 0 && local15 < Static327.anInt5392) {
												anIntArray578[anInt7142++] = Static623.aBooleanArray30[local15] ? 1 : 0;
												return;
											}
											anIntArray578[anInt7142++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local4911 = aStringArray37[--anInt7139];
											if (local4911.startsWith("<img=0>") || local4911.startsWith("<img=1>")) {
												local4911 = local4911.substring(7);
											}
											anIntArray578[anInt7142++] = Static664.method8658(local4911);
											return;
										}
										if (arg0 == 3629) {
											anIntArray578[anInt7142++] = Static584.anInt8634;
											return;
										}
										if (arg0 == 3630) {
											local4911 = aStringArray37[--anInt7139];
											Static231.method3382(true, local4911);
											return;
										}
										if (arg0 == 3631) {
											local15 = anIntArray578[--anInt7142];
											anIntArray578[anInt7142++] = Static65.aBooleanArray2[local15] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local15 = anIntArray578[--anInt7142];
											if (Static723.aString129 != null && local15 < Static706.anInt10633) {
												aStringArray37[anInt7139++] = Static87.aClass241Array1[local15].aString66;
												return;
											}
											aStringArray37[anInt7139++] = "";
											return;
										}
										if (arg0 == 3633) {
											local15 = anIntArray578[--anInt7142];
											if (Static251.anInt4036 != 0 && local15 < Static436.anInt3849) {
												aStringArray37[anInt7139++] = Static446.aStringArray35[local15];
												return;
											}
											aStringArray37[anInt7139++] = "";
											return;
										}
										if (arg0 == 3634) {
											local15 = anIntArray578[--anInt7142];
											if (Static251.anInt4036 == 2 && local15 < Static327.anInt5392) {
												anIntArray578[anInt7142++] = Static429.aBooleanArray21[local15] ? 1 : 0;
												return;
											}
											anIntArray578[anInt7142++] = 0;
											return;
										}
									} else if (arg0 < 3800) {
										if (arg0 == 3700) {
											if (Static91.aClass164_9 != null) {
												anIntArray578[anInt7142++] = 1;
												aClass164_7 = Static91.aClass164_9;
												return;
											}
											anIntArray578[anInt7142++] = 0;
											return;
										}
										if (arg0 == 3701) {
											if (Static128.aClass164_8 != null) {
												anIntArray578[anInt7142++] = 1;
												aClass164_7 = Static128.aClass164_8;
												return;
											}
											anIntArray578[anInt7142++] = 0;
											return;
										}
										if (arg0 == 3702) {
											aStringArray37[anInt7139++] = aClass164_7.aString45;
											return;
										}
										if (arg0 == 3703) {
											anIntArray578[anInt7142++] = aClass164_7.aBoolean307 ? 1 : 0;
											return;
										}
										if (arg0 == 3704) {
											anIntArray578[anInt7142++] = aClass164_7.aByte68;
											return;
										}
										if (arg0 == 3705) {
											anIntArray578[anInt7142++] = aClass164_7.aByte67;
											return;
										}
										if (arg0 == 3706) {
											anIntArray578[anInt7142++] = aClass164_7.aByte66;
											return;
										}
										if (arg0 == 3707) {
											anIntArray578[anInt7142++] = aClass164_7.aByte65;
											return;
										}
										if (arg0 == 3709) {
											anIntArray578[anInt7142++] = aClass164_7.anInt3939;
											return;
										}
										if (arg0 == 3710) {
											local15 = anIntArray578[--anInt7142];
											aStringArray37[anInt7139++] = aClass164_7.aStringArray18[local15];
											return;
										}
										if (arg0 == 3711) {
											local15 = anIntArray578[--anInt7142];
											anIntArray578[anInt7142++] = aClass164_7.aByteArray40[local15];
											return;
										}
										if (arg0 == 3712) {
											anIntArray578[anInt7142++] = aClass164_7.anInt3941;
											return;
										}
										if (arg0 == 3713) {
											local15 = anIntArray578[--anInt7142];
											aStringArray37[anInt7139++] = aClass164_7.aStringArray19[local15];
											return;
										}
										if (arg0 == 3714) {
											anInt7142 -= 3;
											local15 = anIntArray578[anInt7142];
											local21 = anIntArray578[anInt7142 + 1];
											local27 = anIntArray578[anInt7142 + 2];
											anIntArray578[anInt7142++] = aClass164_7.method3497(local21, local27, local15);
											return;
										}
										if (arg0 == 3715) {
											anIntArray578[anInt7142++] = aClass164_7.anInt3956;
											return;
										}
										if (arg0 == 3716) {
											anIntArray578[anInt7142++] = aClass164_7.anInt3947;
											return;
										}
										if (arg0 == 3717) {
											anIntArray578[anInt7142++] = aClass164_7.method3479(aStringArray37[--anInt7139]);
											return;
										}
										if (arg0 == 3718) {
											anIntArray578[anInt7142 - 1] = aClass164_7.method3487()[anIntArray578[anInt7142 - 1]];
											return;
										}
										if (arg0 == 3719) {
											Static180.method2775(anIntArray578[--anInt7142]);
											return;
										}
										if (arg0 == 3720) {
											local15 = anIntArray578[--anInt7142];
											anIntArray578[anInt7142++] = aClass164_7.anIntArray308[local15];
											return;
										}
										if (arg0 == 3750) {
											if (Static674.aClass2_Sub47_3 != null) {
												anIntArray578[anInt7142++] = 1;
												aClass2_Sub47_2 = Static674.aClass2_Sub47_3;
												return;
											}
											anIntArray578[anInt7142++] = 0;
											return;
										}
										if (arg0 == 3751) {
											if (Static45.aClass2_Sub47_1 != null) {
												anIntArray578[anInt7142++] = 1;
												aClass2_Sub47_2 = Static45.aClass2_Sub47_1;
												return;
											}
											anIntArray578[anInt7142++] = 0;
											return;
										}
										if (arg0 == 3752) {
											aStringArray37[anInt7139++] = aClass2_Sub47_2.aString101;
											return;
										}
										if (arg0 == 3753) {
											anIntArray578[anInt7142++] = aClass2_Sub47_2.aByte127;
											return;
										}
										if (arg0 == 3754) {
											anIntArray578[anInt7142++] = aClass2_Sub47_2.aByte128;
											return;
										}
										if (arg0 == 3755) {
											anIntArray578[anInt7142++] = aClass2_Sub47_2.anInt8286;
											return;
										}
										if (arg0 == 3756) {
											local15 = anIntArray578[--anInt7142];
											aStringArray37[anInt7139++] = aClass2_Sub47_2.aClass34Array1[local15].aString2;
											return;
										}
										if (arg0 == 3757) {
											local15 = anIntArray578[--anInt7142];
											anIntArray578[anInt7142++] = aClass2_Sub47_2.aClass34Array1[local15].aByte9;
											return;
										}
										if (arg0 == 3758) {
											local15 = anIntArray578[--anInt7142];
											anIntArray578[anInt7142++] = aClass2_Sub47_2.aClass34Array1[local15].anInt783;
											return;
										}
										if (arg0 == 3759) {
											local15 = anIntArray578[--anInt7142];
											Static525.method7886(aClass2_Sub47_2 == Static45.aClass2_Sub47_1, local15);
											return;
										}
										if (arg0 == 3760) {
											anIntArray578[anInt7142++] = aClass2_Sub47_2.method7278(aStringArray37[--anInt7139]);
											return;
										}
										if (arg0 == 3761) {
											anIntArray578[anInt7142 - 1] = aClass2_Sub47_2.method7272()[anIntArray578[anInt7142 - 1]];
											return;
										}
										if (arg0 == 3790) {
											anIntArray578[anInt7142++] = Static279.anObjectArray35 == null ? 0 : 1;
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local15 = anIntArray578[--anInt7142];
											anIntArray578[anInt7142++] = Static105.aClass171Array1[local15].method3547();
											return;
										}
										if (arg0 == 3904) {
											local15 = anIntArray578[--anInt7142];
											anIntArray578[anInt7142++] = Static105.aClass171Array1[local15].anInt4033;
											return;
										}
										if (arg0 == 3905) {
											local15 = anIntArray578[--anInt7142];
											anIntArray578[anInt7142++] = Static105.aClass171Array1[local15].anInt4040;
											return;
										}
										if (arg0 == 3906) {
											local15 = anIntArray578[--anInt7142];
											anIntArray578[anInt7142++] = Static105.aClass171Array1[local15].anInt4034;
											return;
										}
										if (arg0 == 3907) {
											local15 = anIntArray578[--anInt7142];
											anIntArray578[anInt7142++] = Static105.aClass171Array1[local15].anInt4035;
											return;
										}
										if (arg0 == 3908) {
											local15 = anIntArray578[--anInt7142];
											anIntArray578[anInt7142++] = Static105.aClass171Array1[local15].anInt4032;
											return;
										}
										if (arg0 == 3910) {
											local15 = anIntArray578[--anInt7142];
											local21 = Static105.aClass171Array1[local15].method3548();
											anIntArray578[anInt7142++] = local21 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local15 = anIntArray578[--anInt7142];
											local21 = Static105.aClass171Array1[local15].method3548();
											anIntArray578[anInt7142++] = local21 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local15 = anIntArray578[--anInt7142];
											local21 = Static105.aClass171Array1[local15].method3548();
											anIntArray578[anInt7142++] = local21 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local15 = anIntArray578[--anInt7142];
											local21 = Static105.aClass171Array1[local15].method3548();
											anIntArray578[anInt7142++] = local21 == 1 ? 1 : 0;
											return;
										}
									} else {
										@Pc(9705) long local9705;
										if (arg0 < 4100) {
											if (arg0 == 4000) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												anIntArray578[anInt7142++] = local15 + local21;
												return;
											}
											if (arg0 == 4001) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												anIntArray578[anInt7142++] = local15 - local21;
												return;
											}
											if (arg0 == 4002) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												anIntArray578[anInt7142++] = local15 * local21;
												return;
											}
											if (arg0 == 4003) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												anIntArray578[anInt7142++] = local15 / local21;
												return;
											}
											if (arg0 == 4004) {
												local15 = anIntArray578[--anInt7142];
												anIntArray578[anInt7142++] = (int) (Math.random() * (double) local15);
												return;
											}
											if (arg0 == 4005) {
												local15 = anIntArray578[--anInt7142];
												anIntArray578[anInt7142++] = (int) (Math.random() * (double) (local15 + 1));
												return;
											}
											if (arg0 == 4006) {
												anInt7142 -= 5;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												local27 = anIntArray578[anInt7142 + 2];
												local506 = anIntArray578[anInt7142 + 3];
												local2978 = anIntArray578[anInt7142 + 4];
												anIntArray578[anInt7142++] = local15 + (local21 - local15) * (local2978 - local27) / (local506 - local27);
												return;
											}
											@Pc(9712) long local9712;
											if (arg0 == 4007) {
												anInt7142 -= 2;
												local9705 = (long) anIntArray578[anInt7142];
												local9712 = (long) anIntArray578[anInt7142 + 1];
												anIntArray578[anInt7142++] = (int) (local9705 + local9705 * local9712 / 100L);
												return;
											}
											if (arg0 == 4008) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												anIntArray578[anInt7142++] = local15 | 0x1 << local21;
												return;
											}
											if (arg0 == 4009) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												anIntArray578[anInt7142++] = local15 & -(0x1 << local21) - 1;
												return;
											}
											if (arg0 == 4010) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												anIntArray578[anInt7142++] = (local15 & 0x1 << local21) == 0 ? 0 : 1;
												return;
											}
											if (arg0 == 4011) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												anIntArray578[anInt7142++] = local15 % local21;
												return;
											}
											if (arg0 == 4012) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												if (local15 == 0) {
													anIntArray578[anInt7142++] = 0;
													return;
												}
												anIntArray578[anInt7142++] = (int) Math.pow((double) local15, (double) local21);
												return;
											}
											if (arg0 == 4013) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												if (local15 == 0) {
													anIntArray578[anInt7142++] = 0;
													return;
												}
												if (local21 == 0) {
													anIntArray578[anInt7142++] = Integer.MAX_VALUE;
													return;
												}
												anIntArray578[anInt7142++] = (int) Math.pow((double) local15, 1.0D / (double) local21);
												return;
											}
											if (arg0 == 4014) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												anIntArray578[anInt7142++] = local15 & local21;
												return;
											}
											if (arg0 == 4015) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												anIntArray578[anInt7142++] = local15 | local21;
												return;
											}
											if (arg0 == 4016) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												anIntArray578[anInt7142++] = local15 < local21 ? local15 : local21;
												return;
											}
											if (arg0 == 4017) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												anIntArray578[anInt7142++] = local15 > local21 ? local15 : local21;
												return;
											}
											if (arg0 == 4018) {
												anInt7142 -= 3;
												local9705 = (long) anIntArray578[anInt7142];
												local9712 = (long) anIntArray578[anInt7142 + 1];
												@Pc(10099) long local10099 = (long) anIntArray578[anInt7142 + 2];
												anIntArray578[anInt7142++] = (int) (local9705 * local10099 / local9712);
												return;
											}
											if (arg0 == 4019) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												if (local15 > 700 || local21 > 700) {
													anIntArray578[anInt7142++] = 256;
												}
												@Pc(10162) double local10162 = (Math.random() * (double) (local21 + local15) + 800.0D - (double) local15) / 100.0D;
												anIntArray578[anInt7142++] = (int) (Math.pow(2.0D, local10162) + 0.5D);
												return;
											}
											if (arg0 == 4020) {
												local15 = anIntArray578[--anInt7142];
												anIntArray578[anInt7142++] = Static323.anIntArray389[Static105.method2043(local15) & 0xFFFF];
												return;
											}
										} else if (arg0 < 4200) {
											if (arg0 == 4100) {
												local4911 = aStringArray37[--anInt7139];
												local21 = anIntArray578[--anInt7142];
												aStringArray37[anInt7139++] = local4911 + local21;
												return;
											}
											if (arg0 == 4101) {
												anInt7139 -= 2;
												local4911 = aStringArray37[anInt7139];
												local1394 = aStringArray37[anInt7139 + 1];
												aStringArray37[anInt7139++] = local4911 + local1394;
												return;
											}
											if (arg0 == 4102) {
												local4911 = aStringArray37[--anInt7139];
												local21 = anIntArray578[--anInt7142];
												aStringArray37[anInt7139++] = local4911 + Static593.method7780(true, local21);
												return;
											}
											if (arg0 == 4103) {
												local4911 = aStringArray37[--anInt7139];
												aStringArray37[anInt7139++] = local4911.toLowerCase();
												return;
											}
											if (arg0 == 4104) {
												aStringArray37[anInt7139++] = Static522.method6994(Static51.anInt1052, Static38.method1003(anIntArray578[--anInt7142]));
												return;
											}
											if (arg0 == 4105) {
												anInt7139 -= 2;
												local4911 = aStringArray37[anInt7139];
												local1394 = aStringArray37[anInt7139 + 1];
												if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass201_1 != null && Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass201_1.aBoolean385) {
													aStringArray37[anInt7139++] = local1394;
													return;
												}
												aStringArray37[anInt7139++] = local4911;
												return;
											}
											if (arg0 == 4106) {
												local15 = anIntArray578[--anInt7142];
												aStringArray37[anInt7139++] = Integer.toString(local15);
												return;
											}
											if (arg0 == 4107) {
												anInt7139 -= 2;
												anIntArray578[anInt7142++] = Static540.method6538(aStringArray37[anInt7139 + 1], Static51.anInt1052, aStringArray37[anInt7139]);
												return;
											}
											@Pc(10482) Class381 local10482;
											if (arg0 == 4108) {
												local4911 = aStringArray37[--anInt7139];
												anInt7142 -= 2;
												local21 = anIntArray578[anInt7142];
												local27 = anIntArray578[anInt7142 + 1];
												local10482 = Static74.method1535(local27, Static697.aClass330_123);
												anIntArray578[anInt7142++] = local10482.method8739(local4911, Static679.aClass23Array14, local21);
												return;
											}
											if (arg0 == 4109) {
												local4911 = aStringArray37[--anInt7139];
												anInt7142 -= 2;
												local21 = anIntArray578[anInt7142];
												local27 = anIntArray578[anInt7142 + 1];
												local10482 = Static74.method1535(local27, Static697.aClass330_123);
												anIntArray578[anInt7142++] = local10482.method8741(Static679.aClass23Array14, local4911, local21);
												return;
											}
											if (arg0 == 4110) {
												anInt7139 -= 2;
												local4911 = aStringArray37[anInt7139];
												local1394 = aStringArray37[anInt7139 + 1];
												if (anIntArray578[--anInt7142] == 1) {
													aStringArray37[anInt7139++] = local4911;
													return;
												}
												aStringArray37[anInt7139++] = local1394;
												return;
											}
											if (arg0 == 4111) {
												local4911 = aStringArray37[--anInt7139];
												aStringArray37[anInt7139++] = Static130.method2280(local4911);
												return;
											}
											if (arg0 == 4112) {
												local4911 = aStringArray37[--anInt7139];
												local21 = anIntArray578[--anInt7142];
												if (local21 == -1) {
													throw new RuntimeException("null char");
												}
												aStringArray37[anInt7139++] = local4911 + (char) local21;
												return;
											}
											if (arg0 == 4113) {
												local15 = anIntArray578[--anInt7142];
												anIntArray578[anInt7142++] = method6423((char) local15);
												return;
											}
											if (arg0 == 4114) {
												local15 = anIntArray578[--anInt7142];
												anIntArray578[anInt7142++] = Static596.method7815((char) local15) ? 1 : 0;
												return;
											}
											if (arg0 == 4115) {
												local15 = anIntArray578[--anInt7142];
												anIntArray578[anInt7142++] = Static245.method8628((char) local15) ? 1 : 0;
												return;
											}
											if (arg0 == 4116) {
												local15 = anIntArray578[--anInt7142];
												anIntArray578[anInt7142++] = Static277.method4043((char) local15) ? 1 : 0;
												return;
											}
											if (arg0 == 4117) {
												local4911 = aStringArray37[--anInt7139];
												if (local4911 != null) {
													anIntArray578[anInt7142++] = local4911.length();
													return;
												}
												anIntArray578[anInt7142++] = 0;
												return;
											}
											if (arg0 == 4118) {
												local4911 = aStringArray37[--anInt7139];
												anInt7142 -= 2;
												local21 = anIntArray578[anInt7142];
												local27 = anIntArray578[anInt7142 + 1];
												aStringArray37[anInt7139++] = local4911.substring(local21, local27);
												return;
											}
											if (arg0 == 4119) {
												local4911 = aStringArray37[--anInt7139];
												@Pc(10848) StringBuffer local10848 = new StringBuffer(local4911.length());
												@Pc(10850) boolean local10850 = false;
												for (local506 = 0; local506 < local4911.length(); local506++) {
													@Pc(10857) char local10857 = local4911.charAt(local506);
													if (local10857 == '<') {
														local10850 = true;
													} else if (local10857 == '>') {
														local10850 = false;
													} else if (!local10850) {
														local10848.append(local10857);
													}
												}
												aStringArray37[anInt7139++] = local10848.toString();
												return;
											}
											if (arg0 == 4120) {
												local4911 = aStringArray37[--anInt7139];
												anInt7142 -= 2;
												local21 = anIntArray578[anInt7142];
												local27 = anIntArray578[anInt7142 + 1];
												anIntArray578[anInt7142++] = local4911.indexOf(local21, local27);
												return;
											}
											if (arg0 == 4121) {
												anInt7139 -= 2;
												local4911 = aStringArray37[anInt7139];
												local1394 = aStringArray37[anInt7139 + 1];
												local27 = anIntArray578[--anInt7142];
												anIntArray578[anInt7142++] = local4911.indexOf(local1394, local27);
												return;
											}
											if (arg0 == 4122) {
												local15 = anIntArray578[--anInt7142];
												anIntArray578[anInt7142++] = Character.toLowerCase((char) local15);
												return;
											}
											if (arg0 == 4123) {
												local15 = anIntArray578[--anInt7142];
												anIntArray578[anInt7142++] = Character.toUpperCase((char) local15);
												return;
											}
											if (arg0 == 4124) {
												local575 = anIntArray578[--anInt7142] != 0;
												local21 = anIntArray578[--anInt7142];
												aStringArray37[anInt7139++] = Static573.method7571(Static51.anInt1052, local575, (long) local21, 0);
												return;
											}
											if (arg0 == 4125) {
												local4911 = aStringArray37[--anInt7139];
												local21 = anIntArray578[--anInt7142];
												@Pc(11077) Class381 local11077 = Static74.method1535(local21, Static697.aClass330_123);
												anIntArray578[anInt7142++] = local11077.method8742(Static679.aClass23Array14, local4911);
												return;
											}
											if (arg0 == 4126) {
												aStringArray37[anInt7139++] = Static647.method8474((long) anIntArray578[--anInt7142] * 60000L, Static51.anInt1052) + " UTC";
												return;
											}
											if (arg0 == 4127) {
												local9705 = aLongArray14[--anInt7152];
												aStringArray37[anInt7139++] = local9705 == -1L ? "" : Long.toString(local9705, 36).toUpperCase();
												return;
											}
										} else if (arg0 < 4300) {
											if (arg0 == 4200) {
												local15 = anIntArray578[--anInt7142];
												aStringArray37[anInt7139++] = Static419.aClass112_1.method2486(local15).aString118;
												return;
											}
											@Pc(11206) Class382 local11206;
											if (arg0 == 4201) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												local11206 = Static419.aClass112_1.method2486(local15);
												if (local21 >= 1 && local21 <= 5 && local11206.aStringArray46[local21 - 1] != null) {
													aStringArray37[anInt7139++] = local11206.aStringArray46[local21 - 1];
													return;
												}
												aStringArray37[anInt7139++] = "";
												return;
											}
											if (arg0 == 4202) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												local11206 = Static419.aClass112_1.method2486(local15);
												if (local21 >= 1 && local21 <= 5 && local11206.aStringArray45[local21 - 1] != null) {
													aStringArray37[anInt7139++] = local11206.aStringArray45[local21 - 1];
													return;
												}
												aStringArray37[anInt7139++] = "";
												return;
											}
											if (arg0 == 4203) {
												local15 = anIntArray578[--anInt7142];
												anIntArray578[anInt7142++] = Static419.aClass112_1.method2486(local15).anInt10142;
												return;
											}
											if (arg0 == 4204) {
												local15 = anIntArray578[--anInt7142];
												anIntArray578[anInt7142++] = Static419.aClass112_1.method2486(local15).anInt10115 == 1 ? 1 : 0;
												return;
											}
											@Pc(11380) Class382 local11380;
											if (arg0 == 4205) {
												local15 = anIntArray578[--anInt7142];
												local11380 = Static419.aClass112_1.method2486(local15);
												if (local11380.anInt10087 == -1 && local11380.anInt10110 >= 0) {
													anIntArray578[anInt7142++] = local11380.anInt10110;
													return;
												}
												anIntArray578[anInt7142++] = local15;
												return;
											}
											if (arg0 == 4206) {
												local15 = anIntArray578[--anInt7142];
												local11380 = Static419.aClass112_1.method2486(local15);
												if (local11380.anInt10087 >= 0 && local11380.anInt10110 >= 0) {
													anIntArray578[anInt7142++] = local11380.anInt10110;
													return;
												}
												anIntArray578[anInt7142++] = local15;
												return;
											}
											if (arg0 == 4207) {
												local15 = anIntArray578[--anInt7142];
												anIntArray578[anInt7142++] = Static419.aClass112_1.method2486(local15).aBoolean770 ? 1 : 0;
												return;
											}
											if (arg0 == 4208) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												local3848 = Static386.aClass49_2.method1161(local21);
												if (local3848.method6672()) {
													aStringArray37[anInt7139++] = Static419.aClass112_1.method2486(local15).method8800(local3848.aString89, local21);
													return;
												}
												anIntArray578[anInt7142++] = Static419.aClass112_1.method2486(local15).method8794(local21, local3848.anInt7509);
												return;
											}
											if (arg0 == 4209) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1] - 1;
												local11206 = Static419.aClass112_1.method2486(local15);
												if (local11206.anInt10122 == local21) {
													anIntArray578[anInt7142++] = local11206.anInt10089;
													return;
												}
												if (local11206.anInt10093 == local21) {
													anIntArray578[anInt7142++] = local11206.anInt10091;
													return;
												}
												anIntArray578[anInt7142++] = -1;
												return;
											}
											if (arg0 == 4210) {
												local4911 = aStringArray37[--anInt7139];
												local21 = anIntArray578[--anInt7142];
												Static331.method4924(local21 == 1, local4911);
												anIntArray578[anInt7142++] = Static606.anInt8947;
												return;
											}
											if (arg0 == 4211) {
												if (Static256.aShortArray63 != null && Static143.anInt4054 < Static606.anInt8947) {
													anIntArray578[anInt7142++] = Static256.aShortArray63[Static143.anInt4054++] & 0xFFFF;
													return;
												}
												anIntArray578[anInt7142++] = -1;
												return;
											}
											if (arg0 == 4212) {
												Static143.anInt4054 = 0;
												return;
											}
											if (arg0 == 4213) {
												local15 = anIntArray578[--anInt7142];
												anIntArray578[anInt7142++] = Static419.aClass112_1.method2486(local15).anInt10103;
												return;
											}
											if (arg0 == 4214) {
												local4911 = aStringArray37[--anInt7139];
												anInt7142 -= 3;
												local21 = anIntArray578[anInt7142];
												local27 = anIntArray578[anInt7142 + 1];
												local506 = anIntArray578[anInt7142 + 2];
												Static263.method3855(local21 == 1, local506, local27, local4911);
												anIntArray578[anInt7142++] = Static606.anInt8947;
												return;
											}
											if (arg0 == 4215) {
												anInt7139 -= 2;
												anInt7142 -= 2;
												local4911 = aStringArray37[anInt7139];
												local21 = anIntArray578[anInt7142];
												local27 = anIntArray578[anInt7142 + 1];
												local7345 = aStringArray37[anInt7139 + 1];
												Static715.method9347(local4911, local27, local7345, 8, local21 == 1);
												anIntArray578[anInt7142++] = Static606.anInt8947;
												return;
											}
										} else if (arg0 < 4400) {
											if (arg0 == 4300) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												local3848 = Static386.aClass49_2.method1161(local21);
												if (local3848.method6672()) {
													aStringArray37[anInt7139++] = Static690.aClass308_2.method7092(local15).method5991(local3848.aString89, local21);
													return;
												}
												anIntArray578[anInt7142++] = Static690.aClass308_2.method7092(local15).method5995(local21, local3848.anInt7509);
												return;
											}
										} else if (arg0 < 4500) {
											if (arg0 == 4400) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												local3848 = Static386.aClass49_2.method1161(local21);
												if (local3848.method6672()) {
													aStringArray37[anInt7139++] = Static354.aClass142_4.method3063(local15, 46).method1297(local3848.aString89, local21);
													return;
												}
												anIntArray578[anInt7142++] = Static354.aClass142_4.method3063(local15, 59).method1316(local3848.anInt7509, local21);
												return;
											}
										} else if (arg0 < 4600) {
											if (arg0 == 4500) {
												anInt7142 -= 2;
												local15 = anIntArray578[anInt7142];
												local21 = anIntArray578[anInt7142 + 1];
												local3848 = Static386.aClass49_2.method1161(local21);
												if (local3848.method6672()) {
													aStringArray37[anInt7139++] = Static652.aClass214_1.method5038(local15).method91(local21, local3848.aString89);
													return;
												}
												anIntArray578[anInt7142++] = Static652.aClass214_1.method5038(local15).method89(local3848.anInt7509, local21);
												return;
											}
										} else if (arg0 < 4700) {
											if (arg0 == 4600) {
												local15 = anIntArray578[--anInt7142];
												@Pc(12037) Class289 local12037 = Static574.aClass310_2.method7118(local15);
												if (local12037.anIntArray587 != null && local12037.anIntArray587.length > 0) {
													local27 = 0;
													local506 = local12037.anIntArray589[0];
													for (local2978 = 1; local2978 < local12037.anIntArray587.length; local2978++) {
														if (local12037.anIntArray589[local2978] > local506) {
															local27 = local2978;
															local506 = local12037.anIntArray589[local2978];
														}
													}
													anIntArray578[anInt7142++] = local12037.anIntArray587[local27];
													return;
												}
												anIntArray578[anInt7142++] = local12037.anInt7232;
												return;
											}
										} else if (arg0 < 4800) {
											if (arg0 == 4700) {
												anIntArray578[anInt7142++] = Static587.aBoolean663 ? 1 : 0;
												return;
											}
											if (arg0 == 4701) {
												local4911 = aStringArray37[--anInt7139];
												if (Static283.anInt4574 == 7 && !Static242.method3500()) {
													if (local4911.length() > 20) {
														Static486.aByte115 = -4;
														return;
													}
													Static486.aByte115 = -1;
													local5005 = Static293.method4335(Static429.aClass345_81, Static405.aClass153_1.aIsaacRandom_1);
													local5005.aPacketBit_1.p1(0);
													local27 = local5005.aPacketBit_1.pos;
													local5005.aPacketBit_1.pjstr(local4911);
													local5005.aPacketBit_1.psize1(local5005.aPacketBit_1.pos - local27);
													Static405.aClass153_1.method3275(local5005);
													return;
												}
												Static486.aByte115 = -5;
												return;
											}
											if (arg0 == 4702) {
												anIntArray578[anInt7142++] = Static486.aByte115;
												if (Static486.aByte115 != -1) {
													Static486.aByte115 = -6;
												}
												return;
											}
										}
									}
								}
							}
						}
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local220 = Static145.method2412(anIntArray578[--anInt7142]);
				} else {
					local220 = arg1 ? aClass158_12 : aClass158_11;
				}
				if (arg0 == 1000) {
					anInt7142 -= 4;
					local220.anInt3826 = anIntArray578[anInt7142];
					local220.anInt3808 = anIntArray578[anInt7142 + 1];
					local21 = anIntArray578[anInt7142 + 2];
					if (local21 < 0) {
						local21 = 0;
					} else if (local21 > 5) {
						local21 = 5;
					}
					local27 = anIntArray578[anInt7142 + 3];
					if (local27 < 0) {
						local27 = 0;
					} else if (local27 > 5) {
						local27 = 5;
					}
					local220.aByte61 = (byte) local21;
					local220.aByte64 = (byte) local27;
					Static178.method2729(local220);
					Static44.method1073(local220);
					if (local220.anInt3741 == -1) {
						Static415.method5698(local220.anInt3812);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt7142 -= 4;
					local220.anInt3744 = anIntArray578[anInt7142];
					local220.anInt3762 = anIntArray578[anInt7142 + 1];
					local220.anInt3800 = 0;
					local220.anInt3825 = 0;
					local21 = anIntArray578[anInt7142 + 2];
					if (local21 < 0) {
						local21 = 0;
					} else if (local21 > 4) {
						local21 = 4;
					}
					local27 = anIntArray578[anInt7142 + 3];
					if (local27 < 0) {
						local27 = 0;
					} else if (local27 > 4) {
						local27 = 4;
					}
					local220.aByte63 = (byte) local21;
					local220.aByte62 = (byte) local27;
					Static178.method2729(local220);
					Static44.method1073(local220);
					if (local220.anInt3820 == 0) {
						Static134.method8956(local220, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(834) boolean local834 = anIntArray578[--anInt7142] == 1;
					if (local220.aBoolean284 != local834) {
						local220.aBoolean284 = local834;
						Static178.method2729(local220);
					}
					if (local220.anInt3741 == -1) {
						Static550.method7265(local220.anInt3812);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt7142 -= 2;
					local220.anInt3795 = anIntArray578[anInt7142];
					local220.anInt3750 = anIntArray578[anInt7142 + 1];
					Static178.method2729(local220);
					Static44.method1073(local220);
					if (local220.anInt3820 == 0) {
						Static134.method8956(local220, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local220.aBoolean300 = anIntArray578[--anInt7142] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!hda;)V")
	private static void method6417(@OriginalArg(0) Class158 arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(69) Class158[] local69;
		if (arg0.anInt3741 == -1) {
			@Pc(106) int local106 = arg0.anInt3812 >>> 16;
			@Pc(110) Class158[] local110 = Static148.aClass158ArrayArray1[local106];
			if (local110 == null) {
				local69 = Static453.aClass158ArrayArray2[local106];
				@Pc(119) int local119 = local69.length;
				local110 = Static148.aClass158ArrayArray1[local106] = new Class158[local119];
				Static734.method7691(local69, 0, local110, 0, local69.length);
			}
			@Pc(135) int local135;
			for (local135 = 0; local135 < local110.length && local110[local135] != arg0; local135++) {
			}
			if (local135 >= local110.length) {
				return;
			}
			Static734.method7691(local110, 0, local110, 1, local135);
			local110[0] = arg0;
			return;
		}
		@Pc(12) Class158 local12 = Static145.method2412(arg0.anInt3743);
		if (local12 == null) {
			return;
		}
		if (local12.aClass158Array1 == local12.aClass158Array2) {
			local12.aClass158Array1 = new Class158[local12.aClass158Array2.length];
			local12.aClass158Array1[0] = arg0;
			Static734.method7691(local12.aClass158Array2, 0, local12.aClass158Array1, 1, arg0.anInt3741);
			Static734.method7691(local12.aClass158Array2, arg0.anInt3741 + 1, local12.aClass158Array1, arg0.anInt3741 + 1, local12.aClass158Array2.length - arg0.anInt3741 - 1);
			return;
		}
		@Pc(66) int local66 = 0;
		local69 = local12.aClass158Array1;
		while (local66 < local69.length && local69[local66] != arg0) {
			local66++;
		}
		if (local66 >= local69.length) {
			return;
		}
		Static734.method7691(local69, 0, local69, 1, local66);
		local69[0] = arg0;
		return;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(IZ)V")
	public static void method6418() {
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!fj;I)V")
	private static void method6419(@OriginalArg(0) Class2_Sub2_Sub10 arg0, @OriginalArg(1) int arg1) {
		anInt7142 = 0;
		anInt7139 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray254;
		@Pc(11) int[] local11 = arg0.anIntArray255;
		@Pc(13) byte local13 = -1;
		anInt7140 = 0;
		@Pc(706) int local706;
		try {
			@Pc(17) int local17 = 0;
			label381: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(34) int local34 = local8[local5];
				if (aBoolean538 && (aString76 == null || arg0.aString31 != null && arg0.aString31.indexOf(aString76) != -1)) {
					System.out.println(arg0.aString31 + ": " + local34);
				}
				if (local34 >= 150) {
					@Pc(1436) boolean local1436;
					if (local11[local5] == 1) {
						local1436 = true;
					} else {
						local1436 = false;
					}
					if (local34 >= 150 && local34 < 5000) {
						method6416(local34, local1436);
					} else if (local34 >= 5000 && local34 < 10000) {
						method6421(local34, local1436);
					} else {
						throw new IllegalStateException("Command: " + local34);
					}
				} else if (local34 == 0) {
					anIntArray578[anInt7142++] = local11[local5];
				} else {
					@Pc(96) int local96;
					if (local34 == 1) {
						local96 = local11[local5];
						anIntArray578[anInt7142++] = Static34.aClass304_1.anIntArray621[local96];
					} else if (local34 == 2) {
						local96 = local11[local5];
						Static34.aClass304_1.method6866(local96, anIntArray578[--anInt7142]);
					} else if (local34 == 3) {
						aStringArray37[anInt7139++] = arg0.aStringArray14[local5];
					} else if (local34 == 6) {
						local5 += local11[local5];
					} else if (local34 == 7) {
						anInt7142 -= 2;
						if (anIntArray578[anInt7142] != anIntArray578[anInt7142 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 8) {
						anInt7142 -= 2;
						if (anIntArray578[anInt7142] == anIntArray578[anInt7142 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 9) {
						anInt7142 -= 2;
						if (anIntArray578[anInt7142] < anIntArray578[anInt7142 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 10) {
						anInt7142 -= 2;
						if (anIntArray578[anInt7142] > anIntArray578[anInt7142 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 21) {
						if (anInt7140 == 0) {
							return;
						}
						@Pc(270) Class143 local270 = aClass143Array1[--anInt7140];
						arg0 = local270.aClass2_Sub2_Sub10_1;
						local8 = arg0.anIntArray254;
						local11 = arg0.anIntArray255;
						local5 = local270.anInt3391;
						anIntArray580 = local270.anIntArray276;
						aStringArray36 = local270.aStringArray16;
						aLongArray15 = local270.aLongArray5;
					} else if (local34 == 25) {
						local96 = local11[local5];
						anIntArray578[anInt7142++] = Static34.aClass304_1.method6864(local96);
					} else if (local34 == 27) {
						local96 = local11[local5];
						Static34.aClass304_1.method6868(anIntArray578[--anInt7142], local96);
					} else if (local34 == 31) {
						anInt7142 -= 2;
						if (anIntArray578[anInt7142] <= anIntArray578[anInt7142 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 32) {
						anInt7142 -= 2;
						if (anIntArray578[anInt7142] >= anIntArray578[anInt7142 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 33) {
						anIntArray578[anInt7142++] = anIntArray580[local11[local5]];
					} else if (local34 == 34) {
						anIntArray580[local11[local5]] = anIntArray578[--anInt7142];
					} else if (local34 == 35) {
						aStringArray37[anInt7139++] = aStringArray36[local11[local5]];
					} else if (local34 == 36) {
						aStringArray36[local11[local5]] = aStringArray37[--anInt7139];
					} else {
						@Pc(465) String local465;
						if (local34 == 37) {
							local96 = local11[local5];
							anInt7139 -= local96;
							local465 = Static142.method2381(local96, anInt7139, aStringArray37);
							aStringArray37[anInt7139++] = local465;
						} else if (local34 == 38) {
							anInt7142--;
						} else if (local34 == 39) {
							anInt7139--;
						} else if (local34 == 40) {
							local96 = local11[local5];
							@Pc(503) Class2_Sub2_Sub10 local503 = Static488.method6525(local96);
							if (local503 == null) {
								throw new RuntimeException();
							}
							@Pc(514) int[] local514 = new int[local503.anInt2948];
							@Pc(518) String[] local518 = new String[local503.anInt2950];
							@Pc(522) long[] local522 = new long[local503.anInt2949];
							for (@Pc(524) int local524 = 0; local524 < local503.anInt2951; local524++) {
								local514[local524] = anIntArray578[anInt7142 + local524 - local503.anInt2951];
							}
							for (@Pc(543) int local543 = 0; local543 < local503.anInt2953; local543++) {
								local518[local543] = aStringArray37[anInt7139 + local543 - local503.anInt2953];
							}
							for (@Pc(562) int local562 = 0; local562 < local503.anInt2954; local562++) {
								local522[local562] = aLongArray14[anInt7152 + local562 - local503.anInt2954];
							}
							anInt7142 -= local503.anInt2951;
							anInt7139 -= local503.anInt2953;
							anInt7152 -= local503.anInt2954;
							@Pc(598) Class143 local598 = new Class143();
							local598.aClass2_Sub2_Sub10_1 = arg0;
							local598.anInt3391 = local5;
							local598.anIntArray276 = anIntArray580;
							local598.aStringArray16 = aStringArray36;
							local598.aLongArray5 = aLongArray15;
							if (anInt7140 >= aClass143Array1.length) {
								throw new RuntimeException();
							}
							aClass143Array1[anInt7140++] = local598;
							arg0 = local503;
							local8 = local503.anIntArray254;
							local11 = local503.anIntArray255;
							local5 = -1;
							anIntArray580 = local514;
							aStringArray36 = local518;
							aLongArray15 = local522;
						} else if (local34 == 42) {
							anIntArray578[anInt7142++] = Static511.anIntArray614[local11[local5]];
						} else if (local34 == 43) {
							local96 = local11[local5];
							Static511.anIntArray614[local96] = anIntArray578[--anInt7142];
							Static135.method7239(local96);
							Static624.aBoolean727 |= Static118.aBooleanArray4[local96];
						} else if (local34 == 44) {
							local96 = local11[local5] >> 16;
							local706 = local11[local5] & 0xFFFF;
							@Pc(714) int local714 = anIntArray578[--anInt7142];
							if (local714 >= 0 && local714 <= 5000) {
								anIntArray581[local96] = local714;
								@Pc(732) byte local732 = -1;
								if (local706 == 105) {
									local732 = 0;
								}
								@Pc(739) int local739 = 0;
								while (true) {
									if (local739 >= local714) {
										continue label381;
									}
									anIntArrayArray177[local96][local739] = local732;
									local739++;
								}
							}
							throw new RuntimeException();
						} else if (local34 == 45) {
							local96 = local11[local5];
							local706 = anIntArray578[--anInt7142];
							if (local706 < 0 || local706 >= anIntArray581[local96]) {
								throw new RuntimeException();
							}
							anIntArray578[anInt7142++] = anIntArrayArray177[local96][local706];
						} else if (local34 == 46) {
							local96 = local11[local5];
							anInt7142 -= 2;
							local706 = anIntArray578[anInt7142];
							if (local706 < 0 || local706 >= anIntArray581[local96]) {
								throw new RuntimeException();
							}
							anIntArrayArray177[local96][local706] = anIntArray578[anInt7142 + 1];
						} else if (local34 == 47) {
							@Pc(843) String local843 = Static37.aStringArray4[local11[local5]];
							if (local843 == null) {
								local843 = "null";
							}
							aStringArray37[anInt7139++] = local843;
						} else if (local34 == 48) {
							local96 = local11[local5];
							Static37.aStringArray4[local96] = aStringArray37[--anInt7139];
							Static85.method9262(local96);
						} else if (local34 == 51) {
							@Pc(889) Class28 local889 = arg0.aClass28Array1[local11[local5]];
							@Pc(902) Class2_Sub38 local902 = (Class2_Sub38) local889.method738((long) anIntArray578[--anInt7142]);
							if (local902 != null) {
								local5 += local902.anInt6379;
							}
						} else if (local34 == 54) {
							aLongArray14[anInt7152++] = arg0.aLongArray4[local5];
						} else if (local34 == 55) {
							anInt7152--;
						} else if (local34 == 66) {
							aLongArray14[anInt7152++] = aLongArray15[local11[local5]];
						} else if (local34 == 67) {
							aLongArray15[local11[local5]] = aLongArray14[--anInt7152];
						} else if (local34 == 68) {
							anInt7152 -= 2;
							if (aLongArray14[anInt7152] != aLongArray14[anInt7152 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 69) {
							anInt7152 -= 2;
							if (aLongArray14[anInt7152] == aLongArray14[anInt7152 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 70) {
							anInt7152 -= 2;
							if (aLongArray14[anInt7152] < aLongArray14[anInt7152 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 71) {
							anInt7152 -= 2;
							if (aLongArray14[anInt7152] > aLongArray14[anInt7152 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 72) {
							anInt7152 -= 2;
							if (aLongArray14[anInt7152] <= aLongArray14[anInt7152 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 73) {
							anInt7152 -= 2;
							if (aLongArray14[anInt7152] >= aLongArray14[anInt7152 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 86) {
							if (anIntArray578[--anInt7142] == 1) {
								local5 += local11[local5];
							}
						} else if (local34 == 87) {
							if (anIntArray578[--anInt7142] == 0) {
								local5 += local11[local5];
							}
						} else if (local34 == 106) {
							local96 = local11[local5];
							@Pc(1178) Integer local1178 = (Integer) Static279.anObjectArray35[local96];
							if (local1178 == null) {
								@Pc(1185) Class122 local1185 = Static628.aClass342_5.method7785(local96);
								if (local1185.aChar3 == 'i' || local1185.aChar3 == '1') {
									anIntArray578[anInt7142++] = 0;
								} else {
									anIntArray578[anInt7142++] = -1;
								}
							} else {
								anIntArray578[anInt7142++] = local1178;
							}
						} else if (local34 == 107) {
							local96 = local11[local5];
							@Pc(1236) Class122 local1236 = Static628.aClass342_5.method7785(local96);
							if (local1236.aChar3 != '\u0001') {
								anIntArray578[anInt7142++] = 0;
							}
							@Pc(1256) Integer local1256 = (Integer) Static279.anObjectArray35[local1236.anInt2816];
							if (local1256 == null) {
								anIntArray578[anInt7142++] = 0;
							} else {
								@Pc(1284) int local1284 = local1236.anInt2817 == 31 ? -1 : (0x1 << local1236.anInt2817 + 1) - 1;
								anIntArray578[anInt7142++] = (local1256 & local1284) >>> local1236.anInt2812;
							}
						} else if (local34 == 108) {
							local96 = local11[local5];
							@Pc(1311) Long local1311 = (Long) Static279.anObjectArray35[local96];
							if (local1311 == null) {
								aLongArray14[anInt7152++] = -1L;
							} else {
								aLongArray14[anInt7152++] = local1311;
							}
						} else if (local34 == 109) {
							local96 = local11[local5];
							local465 = (String) Static279.anObjectArray35[local96];
							if (local465 == null) {
								aStringArray37[anInt7139++] = "";
							} else {
								aStringArray37[anInt7139++] = local465;
							}
						} else if (local34 == 112) {
							anIntArray578[anInt7142++] = method6412(local11[local5]);
						} else if (local34 == 113) {
							anIntArray578[anInt7142++] = method6411(local11[local5]);
						} else if (local34 == 114) {
							aLongArray14[anInt7152++] = method6413(local11[local5]);
						} else if (local34 == 115) {
							aStringArray37[anInt7139++] = method6425(local11[local5]);
						}
					}
				}
			}
		} catch (@Pc(1479) Exception local1479) {
			@Pc(1484) StringBuffer local1484 = new StringBuffer(30);
			local1484.append("CS2: ").append(arg0.aLong328).append(" ");
			for (local706 = anInt7140 - 1; local706 >= 0; local706--) {
				local1484.append("v: ").append(aClass143Array1[local706].aClass2_Sub2_Sub10_1.aLong328).append(" ");
			}
			local1484.append("op: ").append(local13);
			Static240.method3496(local1479, local1484.toString());
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!pd;)V")
	public static void method6420(@OriginalArg(0) Class2_Sub42 arg0) {
		method6422(arg0, 200000);
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(IZ)V")
	private static void method6421(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(109) int local109;
		@Pc(375) int local375;
		@Pc(95) String local95;
		@Pc(192) int local192;
		@Pc(1578) boolean local1578;
		@Pc(834) int local834;
		@Pc(115) int local115;
		@Pc(198) String local198;
		@Pc(101) String local101;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray578[anInt7142++] = Static133.anInt2458;
				return;
			}
			@Pc(57) Class153 local57;
			@Pc(63) Class2_Sub19 local63;
			if (arg0 == 5001) {
				anInt7142 -= 3;
				Static133.anInt2458 = anIntArray578[anInt7142];
				Static726.aClass280_7 = Static189.method2864(anIntArray578[anInt7142 + 1]);
				if (Static726.aClass280_7 == null) {
					Static726.aClass280_7 = Static137.aClass280_4;
				}
				Static87.anInt1806 = anIntArray578[anInt7142 + 2];
				local57 = Static668.method8701();
				local63 = Static293.method4335(Static98.aClass345_20, local57.aIsaacRandom_1);
				local63.aPacketBit_1.p1(Static133.anInt2458);
				local63.aPacketBit_1.p1(Static726.aClass280_7.anInt7039);
				local63.aPacketBit_1.p1(Static87.anInt1806);
				local57.method3275(local63);
				return;
			}
			if (arg0 == 5002) {
				anInt7139 -= 2;
				local95 = aStringArray37[anInt7139];
				local101 = aStringArray37[anInt7139 + 1];
				anInt7142 -= 2;
				local109 = anIntArray578[anInt7142];
				local115 = anIntArray578[anInt7142 + 1];
				if (local101 == null) {
					local101 = "";
				}
				if (local101.length() > 80) {
					local101 = local101.substring(0, 80);
				}
				@Pc(135) Class153 local135 = Static668.method8701();
				@Pc(141) Class2_Sub19 local141 = Static293.method4335(Static245.aClass345_114, local135.aIsaacRandom_1);
				local141.aPacketBit_1.p1(Static231.method3379(local95) + Static231.method3379(local101) + 2);
				local141.aPacketBit_1.pjstr(local95);
				local141.aPacketBit_1.p1(local109 - 1);
				local141.aPacketBit_1.p1(local115);
				local141.aPacketBit_1.pjstr(local101);
				local135.method3275(local141);
				return;
			}
			@Pc(196) Class283 local196;
			if (arg0 == 5003) {
				local192 = anIntArray578[--anInt7142];
				local196 = Static8.method122(local192);
				local198 = "";
				if (local196 != null && local196.aString78 != null) {
					local198 = local196.aString78;
				}
				aStringArray37[anInt7139++] = local198;
				return;
			}
			if (arg0 == 5004) {
				local192 = anIntArray578[--anInt7142];
				local196 = Static8.method122(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt7166;
				}
				anIntArray578[anInt7142++] = local109;
				return;
			}
			if (arg0 == 5005) {
				if (Static726.aClass280_7 == null) {
					anIntArray578[anInt7142++] = -1;
					return;
				}
				anIntArray578[anInt7142++] = Static726.aClass280_7.anInt7039;
				return;
			}
			@Pc(295) Class2_Sub19 local295;
			@Pc(289) Class153 local289;
			if (arg0 == 5006) {
				local192 = anIntArray578[--anInt7142];
				local289 = Static668.method8701();
				local295 = Static293.method4335(Static356.aClass345_67, local289.aIsaacRandom_1);
				local295.aPacketBit_1.p1(local192);
				local289.method3275(local295);
				return;
			}
			if (arg0 == 5008) {
				local95 = aStringArray37[--anInt7139];
				method6426(local95, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt7139 -= 2;
				local95 = aStringArray37[anInt7139];
				local101 = aStringArray37[anInt7139 + 1];
				if (Static608.anInt9290 != 0 || (!Static389.aBoolean459 || Static34.aBoolean62) && !Static617.aBoolean724) {
					@Pc(360) Class153 local360 = Static668.method8701();
					@Pc(366) Class2_Sub19 local366 = Static293.method4335(Static243.aClass345_52, local360.aIsaacRandom_1);
					local366.aPacketBit_1.p2(0);
					local375 = local366.aPacketBit_1.pos;
					local366.aPacketBit_1.pjstr(local95);
					Static523.method3446(local366.aPacketBit_1, local101);
					local366.aPacketBit_1.psize2(local366.aPacketBit_1.pos - local375);
					local360.method3275(local366);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local192 = anIntArray578[--anInt7142];
				local196 = Static8.method122(local192);
				local198 = "";
				if (local196 != null && local196.aString81 != null) {
					local198 = local196.aString81;
				}
				aStringArray37[anInt7139++] = local198;
				return;
			}
			if (arg0 == 5011) {
				local192 = anIntArray578[--anInt7142];
				local196 = Static8.method122(local192);
				local198 = "";
				if (local196 != null && local196.aString79 != null) {
					local198 = local196.aString79;
				}
				aStringArray37[anInt7139++] = local198;
				return;
			}
			if (arg0 == 5012) {
				local192 = anIntArray578[--anInt7142];
				local196 = Static8.method122(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt7167;
				}
				anIntArray578[anInt7142++] = local109;
				return;
			}
			if (arg0 == 5015) {
				if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 == null || Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString8 == null) {
					local95 = "";
				} else {
					local95 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.method1424(false);
				}
				aStringArray37[anInt7139++] = local95;
				return;
			}
			if (arg0 == 5016) {
				anIntArray578[anInt7142++] = Static87.anInt1806;
				return;
			}
			if (arg0 == 5017) {
				anIntArray578[anInt7142++] = Static402.method5578();
				return;
			}
			if (arg0 == 5018) {
				local192 = anIntArray578[--anInt7142];
				local196 = Static8.method122(local192);
				local109 = 0;
				if (local196 != null) {
					local109 = local196.anInt7171;
				}
				anIntArray578[anInt7142++] = local109;
				return;
			}
			if (arg0 == 5019) {
				local192 = anIntArray578[--anInt7142];
				local196 = Static8.method122(local192);
				local198 = "";
				if (local196 != null && local196.aString80 != null) {
					local198 = local196.aString80;
				}
				aStringArray37[anInt7139++] = local198;
				return;
			}
			if (arg0 == 5020) {
				if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 == null || Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString8 == null) {
					local95 = "";
				} else {
					local95 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.method1422();
				}
				aStringArray37[anInt7139++] = local95;
				return;
			}
			if (arg0 == 5023) {
				local192 = anIntArray578[--anInt7142];
				local196 = Static8.method122(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt7163;
				}
				anIntArray578[anInt7142++] = local109;
				return;
			}
			if (arg0 == 5024) {
				local192 = anIntArray578[--anInt7142];
				local196 = Static8.method122(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt7164;
				}
				anIntArray578[anInt7142++] = local109;
				return;
			}
			if (arg0 == 5025) {
				local192 = anIntArray578[--anInt7142];
				local196 = Static8.method122(local192);
				local198 = "";
				if (local196 != null && local196.aString77 != null) {
					local198 = local196.aString77;
				}
				aStringArray37[anInt7139++] = local198;
				return;
			}
			if (arg0 == 5050) {
				local192 = anIntArray578[--anInt7142];
				aStringArray37[anInt7139++] = Static68.aClass151_3.method3234(local192).aString4;
				return;
			}
			@Pc(793) Class2_Sub2_Sub3 local793;
			if (arg0 == 5051) {
				local192 = anIntArray578[--anInt7142];
				local793 = Static68.aClass151_3.method3234(local192);
				if (local793.anIntArray93 == null) {
					anIntArray578[anInt7142++] = 0;
					return;
				}
				anIntArray578[anInt7142++] = local793.anIntArray93.length;
				return;
			}
			if (arg0 == 5052) {
				anInt7142 -= 2;
				local192 = anIntArray578[anInt7142];
				local834 = anIntArray578[anInt7142 + 1];
				@Pc(839) Class2_Sub2_Sub3 local839 = Static68.aClass151_3.method3234(local192);
				local115 = local839.anIntArray93[local834];
				anIntArray578[anInt7142++] = local115;
				return;
			}
			if (arg0 == 5053) {
				local192 = anIntArray578[--anInt7142];
				local793 = Static68.aClass151_3.method3234(local192);
				if (local793.anIntArray94 == null) {
					anIntArray578[anInt7142++] = 0;
					return;
				}
				anIntArray578[anInt7142++] = local793.anIntArray94.length;
				return;
			}
			if (arg0 == 5054) {
				anInt7142 -= 2;
				local192 = anIntArray578[anInt7142];
				local834 = anIntArray578[anInt7142 + 1];
				anIntArray578[anInt7142++] = Static68.aClass151_3.method3234(local192).anIntArray94[local834];
				return;
			}
			if (arg0 == 5055) {
				local192 = anIntArray578[--anInt7142];
				aStringArray37[anInt7139++] = Static288.aClass139_2.method2950(local192).method3906();
				return;
			}
			if (arg0 == 5056) {
				local192 = anIntArray578[--anInt7142];
				@Pc(966) Class2_Sub2_Sub12 local966 = Static288.aClass139_2.method2950(local192);
				if (local966.anIntArray333 == null) {
					anIntArray578[anInt7142++] = 0;
					return;
				}
				anIntArray578[anInt7142++] = local966.anIntArray333.length;
				return;
			}
			if (arg0 == 5057) {
				anInt7142 -= 2;
				local192 = anIntArray578[anInt7142];
				local834 = anIntArray578[anInt7142 + 1];
				anIntArray578[anInt7142++] = Static288.aClass139_2.method2950(local192).anIntArray333[local834];
				return;
			}
			if (arg0 == 5058) {
				aClass21_1 = new Class21();
				aClass21_1.anInt521 = anIntArray578[--anInt7142];
				aClass21_1.aClass2_Sub2_Sub12_1 = Static288.aClass139_2.method2950(aClass21_1.anInt521);
				aClass21_1.anIntArray29 = new int[aClass21_1.aClass2_Sub2_Sub12_1.method3901()];
				return;
			}
			if (arg0 == 5059) {
				local57 = Static668.method8701();
				local63 = Static293.method4335(Static456.aClass345_85, local57.aIsaacRandom_1);
				local63.aPacketBit_1.p1(0);
				local109 = local63.aPacketBit_1.pos;
				local63.aPacketBit_1.p1(0);
				local63.aPacketBit_1.p2(aClass21_1.anInt521);
				aClass21_1.aClass2_Sub2_Sub12_1.method3904(local63.aPacketBit_1, aClass21_1.anIntArray29);
				local63.aPacketBit_1.psize1(local63.aPacketBit_1.pos - local109);
				local57.method3275(local63);
				return;
			}
			if (arg0 == 5060) {
				local95 = aStringArray37[--anInt7139];
				local289 = Static668.method8701();
				local295 = Static293.method4335(Static234.aClass345_46, local289.aIsaacRandom_1);
				local295.aPacketBit_1.p1(0);
				local115 = local295.aPacketBit_1.pos;
				local295.aPacketBit_1.pjstr(local95);
				local295.aPacketBit_1.p2(aClass21_1.anInt521);
				aClass21_1.aClass2_Sub2_Sub12_1.method3904(local295.aPacketBit_1, aClass21_1.anIntArray29);
				local295.aPacketBit_1.psize1(local295.aPacketBit_1.pos - local115);
				local289.method3275(local295);
				return;
			}
			if (arg0 == 5061) {
				local57 = Static668.method8701();
				local63 = Static293.method4335(Static456.aClass345_85, local57.aIsaacRandom_1);
				local63.aPacketBit_1.p1(0);
				local109 = local63.aPacketBit_1.pos;
				local63.aPacketBit_1.p1(1);
				local63.aPacketBit_1.p2(aClass21_1.anInt521);
				aClass21_1.aClass2_Sub2_Sub12_1.method3904(local63.aPacketBit_1, aClass21_1.anIntArray29);
				local63.aPacketBit_1.psize1(local63.aPacketBit_1.pos - local109);
				local57.method3275(local63);
				return;
			}
			if (arg0 == 5062) {
				anInt7142 -= 2;
				local192 = anIntArray578[anInt7142];
				local834 = anIntArray578[anInt7142 + 1];
				anIntArray578[anInt7142++] = Static68.aClass151_3.method3234(local192).aCharArray2[local834];
				return;
			}
			if (arg0 == 5063) {
				anInt7142 -= 2;
				local192 = anIntArray578[anInt7142];
				local834 = anIntArray578[anInt7142 + 1];
				anIntArray578[anInt7142++] = Static68.aClass151_3.method3234(local192).aCharArray3[local834];
				return;
			}
			if (arg0 == 5064) {
				anInt7142 -= 2;
				local192 = anIntArray578[anInt7142];
				local834 = anIntArray578[anInt7142 + 1];
				if (local834 == -1) {
					anIntArray578[anInt7142++] = -1;
					return;
				}
				anIntArray578[anInt7142++] = Static68.aClass151_3.method3234(local192).method1185((char) local834);
				return;
			}
			if (arg0 == 5065) {
				anInt7142 -= 2;
				local192 = anIntArray578[anInt7142];
				local834 = anIntArray578[anInt7142 + 1];
				if (local834 == -1) {
					anIntArray578[anInt7142++] = -1;
					return;
				}
				anIntArray578[anInt7142++] = Static68.aClass151_3.method3234(local192).method1184((char) local834);
				return;
			}
			if (arg0 == 5066) {
				local192 = anIntArray578[--anInt7142];
				anIntArray578[anInt7142++] = Static288.aClass139_2.method2950(local192).method3901();
				return;
			}
			if (arg0 == 5067) {
				anInt7142 -= 2;
				local192 = anIntArray578[anInt7142];
				local834 = anIntArray578[anInt7142 + 1];
				local109 = Static288.aClass139_2.method2950(local192).method3898(local834).anInt4575;
				anIntArray578[anInt7142++] = local109;
				return;
			}
			if (arg0 == 5068) {
				anInt7142 -= 2;
				local192 = anIntArray578[anInt7142];
				local834 = anIntArray578[anInt7142 + 1];
				aClass21_1.anIntArray29[local192] = local834;
				return;
			}
			if (arg0 == 5069) {
				anInt7142 -= 2;
				local192 = anIntArray578[anInt7142];
				local834 = anIntArray578[anInt7142 + 1];
				aClass21_1.anIntArray29[local192] = local834;
				return;
			}
			if (arg0 == 5070) {
				anInt7142 -= 3;
				local192 = anIntArray578[anInt7142];
				local834 = anIntArray578[anInt7142 + 1];
				local109 = anIntArray578[anInt7142 + 2];
				@Pc(1526) Class2_Sub2_Sub12 local1526 = Static288.aClass139_2.method2950(local192);
				if (local1526.method3898(local834).anInt4575 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray578[anInt7142++] = local1526.method3900(local834, local109);
				return;
			}
			if (arg0 == 5071) {
				local95 = aStringArray37[--anInt7139];
				local1578 = anIntArray578[--anInt7142] == 1;
				Static494.method6599(local95, local1578);
				anIntArray578[anInt7142++] = Static606.anInt8947;
				return;
			}
			if (arg0 == 5072) {
				if (Static256.aShortArray63 != null && Static143.anInt4054 < Static606.anInt8947) {
					anIntArray578[anInt7142++] = Static256.aShortArray63[Static143.anInt4054++] & 0xFFFF;
					return;
				}
				anIntArray578[anInt7142++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static143.anInt4054 = 0;
				return;
			}
			if (arg0 == 5074) {
				local57 = Static668.method8701();
				local63 = Static293.method4335(Static456.aClass345_85, local57.aIsaacRandom_1);
				local63.aPacketBit_1.p1(0);
				local109 = local63.aPacketBit_1.pos;
				local63.aPacketBit_1.p1(2);
				local63.aPacketBit_1.p2(aClass21_1.anInt521);
				aClass21_1.aClass2_Sub2_Sub12_1.method3904(local63.aPacketBit_1, aClass21_1.anIntArray29);
				local63.aPacketBit_1.psize1(local63.aPacketBit_1.pos - local109);
				local57.method3275(local63);
				return;
			}
			if (arg0 == 5075) {
				local57 = Static668.method8701();
				local63 = Static293.method4335(Static456.aClass345_85, local57.aIsaacRandom_1);
				local63.aPacketBit_1.p1(0);
				local109 = local63.aPacketBit_1.pos;
				local63.aPacketBit_1.p1(3);
				local63.aPacketBit_1.p2(aClass21_1.anInt521);
				aClass21_1.aClass2_Sub2_Sub12_1.method3904(local63.aPacketBit_1, aClass21_1.anIntArray29);
				local63.aPacketBit_1.psize1(local63.aPacketBit_1.pos - local109);
				local57.method3275(local63);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static334.aClass319_1.method8479(86)) {
					anIntArray578[anInt7142++] = 1;
					return;
				}
				anIntArray578[anInt7142++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static334.aClass319_1.method8479(82)) {
					anIntArray578[anInt7142++] = 1;
					return;
				}
				anIntArray578[anInt7142++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static334.aClass319_1.method8479(81)) {
					anIntArray578[anInt7142++] = 1;
					return;
				}
				anIntArray578[anInt7142++] = 0;
				return;
			}
		} else {
			@Pc(2331) boolean local2331;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static2.method65(anIntArray578[--anInt7142]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray578[anInt7142++] = Static466.method6323();
					return;
				}
				if (arg0 == 5205) {
					Static60.method1293(anIntArray578[--anInt7142], false, -1, -1, -11493);
					return;
				}
				@Pc(1908) Class2_Sub2_Sub13 local1908;
				if (arg0 == 5206) {
					local192 = anIntArray578[--anInt7142];
					local1908 = Static30.method5078(local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					if (local1908 == null) {
						anIntArray578[anInt7142++] = -1;
						return;
					}
					anIntArray578[anInt7142++] = local1908.anInt4563;
					return;
				}
				@Pc(1942) Class2_Sub2_Sub13 local1942;
				if (arg0 == 5207) {
					local1942 = Static30.method5059(anIntArray578[--anInt7142]);
					if (local1942 != null && local1942.aString49 != null) {
						aStringArray37[anInt7139++] = local1942.aString49;
						return;
					}
					aStringArray37[anInt7139++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray578[anInt7142++] = Static329.anInt1750;
					anIntArray578[anInt7142++] = Static588.anInt8690;
					return;
				}
				if (arg0 == 5209) {
					anIntArray578[anInt7142++] = Static164.anInt2809 + Static30.anInt5655;
					anIntArray578[anInt7142++] = Static615.anInt9389 + Static30.anInt5648;
					return;
				}
				if (arg0 == 5210) {
					local192 = anIntArray578[--anInt7142];
					local1908 = Static30.method5059(local192);
					if (local1908 == null) {
						anIntArray578[anInt7142++] = 0;
						anIntArray578[anInt7142++] = 0;
						return;
					}
					anIntArray578[anInt7142++] = local1908.anInt4556 >> 14 & 0x3FFF;
					anIntArray578[anInt7142++] = local1908.anInt4556 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local192 = anIntArray578[--anInt7142];
					local1908 = Static30.method5059(local192);
					if (local1908 == null) {
						anIntArray578[anInt7142++] = 0;
						anIntArray578[anInt7142++] = 0;
						return;
					}
					anIntArray578[anInt7142++] = local1908.anInt4552 - local1908.anInt4560;
					anIntArray578[anInt7142++] = local1908.anInt4562 - local1908.anInt4559;
					return;
				}
				@Pc(2139) Class2_Sub20 local2139;
				if (arg0 == 5212) {
					local2139 = Static122.method2207();
					if (local2139 == null) {
						anIntArray578[anInt7142++] = -1;
						anIntArray578[anInt7142++] = -1;
						return;
					}
					anIntArray578[anInt7142++] = local2139.anInt3131;
					local834 = local2139.anInt3125 << 28 | local2139.anInt3129 + Static30.anInt5655 << 14 | local2139.anInt3124 + Static30.anInt5648;
					anIntArray578[anInt7142++] = local834;
					return;
				}
				if (arg0 == 5213) {
					local2139 = Static364.method5248();
					if (local2139 == null) {
						anIntArray578[anInt7142++] = -1;
						anIntArray578[anInt7142++] = -1;
						return;
					}
					anIntArray578[anInt7142++] = local2139.anInt3131;
					local834 = local2139.anInt3125 << 28 | local2139.anInt3129 + Static30.anInt5655 << 14 | local2139.anInt3124 + Static30.anInt5648;
					anIntArray578[anInt7142++] = local834;
					return;
				}
				@Pc(2289) boolean local2289;
				if (arg0 == 5214) {
					local192 = anIntArray578[--anInt7142];
					local1908 = Static186.method2819();
					if (local1908 != null) {
						local2289 = local1908.method4088(anIntArray579, local192 & 0x3FFF, local192 >> 28 & 0x3, local192 >> 14 & 0x3FFF);
						if (local2289) {
							Static106.method2048(anIntArray579[1], anIntArray579[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt7142 -= 2;
					local192 = anIntArray578[anInt7142];
					local834 = anIntArray578[anInt7142 + 1];
					@Pc(2329) Class192 local2329 = Static30.method5076(local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					local2331 = false;
					for (@Pc(2336) Class2_Sub2_Sub13 local2336 = (Class2_Sub2_Sub13) local2329.method4352(); local2336 != null; local2336 = (Class2_Sub2_Sub13) local2329.method4350()) {
						if (local2336.anInt4563 == local834) {
							local2331 = true;
							break;
						}
					}
					if (local2331) {
						anIntArray578[anInt7142++] = 1;
						return;
					}
					anIntArray578[anInt7142++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local192 = anIntArray578[--anInt7142];
					local1908 = Static30.method5059(local192);
					if (local1908 == null) {
						anIntArray578[anInt7142++] = -1;
						return;
					}
					anIntArray578[anInt7142++] = local1908.anInt4564;
					return;
				}
				if (arg0 == 5220) {
					anIntArray578[anInt7142++] = Static273.anInt4403 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local192 = anIntArray578[--anInt7142];
					Static106.method2048(local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1942 = Static186.method2819();
					if (local1942 != null) {
						local1578 = local1942.method4091(Static615.anInt9389 + Static30.anInt5648, Static164.anInt2809 + Static30.anInt5655, anIntArray579);
						if (local1578) {
							anIntArray578[anInt7142++] = anIntArray579[1];
							anIntArray578[anInt7142++] = anIntArray579[2];
							return;
						}
						anIntArray578[anInt7142++] = -1;
						anIntArray578[anInt7142++] = -1;
						return;
					}
					anIntArray578[anInt7142++] = -1;
					anIntArray578[anInt7142++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt7142 -= 2;
					local192 = anIntArray578[anInt7142];
					local834 = anIntArray578[anInt7142 + 1];
					Static60.method1293(local192, false, local834 & 0x3FFF, local834 >> 14 & 0x3FFF, -11493);
					return;
				}
				if (arg0 == 5224) {
					local192 = anIntArray578[--anInt7142];
					local1908 = Static186.method2819();
					if (local1908 != null) {
						local2289 = local1908.method4088(anIntArray579, local192 & 0x3FFF, local192 >> 28 & 0x3, local192 >> 14 & 0x3FFF);
						if (local2289) {
							anIntArray578[anInt7142++] = anIntArray579[1];
							anIntArray578[anInt7142++] = anIntArray579[2];
							return;
						}
						anIntArray578[anInt7142++] = -1;
						anIntArray578[anInt7142++] = -1;
						return;
					}
					anIntArray578[anInt7142++] = -1;
					anIntArray578[anInt7142++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local192 = anIntArray578[--anInt7142];
					local1908 = Static186.method2819();
					if (local1908 != null) {
						local2289 = local1908.method4091(local192 & 0x3FFF, local192 >> 14 & 0x3FFF, anIntArray579);
						if (local2289) {
							anIntArray578[anInt7142++] = anIntArray579[1];
							anIntArray578[anInt7142++] = anIntArray579[2];
							return;
						}
						anIntArray578[anInt7142++] = -1;
						anIntArray578[anInt7142++] = -1;
						return;
					}
					anIntArray578[anInt7142++] = -1;
					anIntArray578[anInt7142++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static688.method8975(anIntArray578[--anInt7142]);
					return;
				}
				if (arg0 == 5227) {
					anInt7142 -= 2;
					local192 = anIntArray578[anInt7142];
					local834 = anIntArray578[anInt7142 + 1];
					Static60.method1293(local192, true, local834 & 0x3FFF, local834 >> 14 & 0x3FFF, -11493);
					return;
				}
				if (arg0 == 5228) {
					Static178.aBoolean251 = anIntArray578[--anInt7142] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray578[anInt7142++] = Static178.aBoolean251 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local192 = anIntArray578[--anInt7142];
					Static170.method2653(local192);
					return;
				}
				@Pc(2867) Class2 local2867;
				if (arg0 == 5231) {
					anInt7142 -= 2;
					local192 = anIntArray578[anInt7142];
					local1578 = anIntArray578[anInt7142 + 1] == 1;
					if (Static232.aClass28_18 != null) {
						local2867 = Static232.aClass28_18.method738((long) local192);
						if (local2867 != null && !local1578) {
							local2867.method9457();
							return;
						}
						if (local2867 == null && local1578) {
							local2867 = new Class2();
							Static232.aClass28_18.method735((long) local192, local2867);
						}
					}
					return;
				}
				@Pc(2914) Class2 local2914;
				if (arg0 == 5232) {
					local192 = anIntArray578[--anInt7142];
					if (Static232.aClass28_18 != null) {
						local2914 = Static232.aClass28_18.method738((long) local192);
						anIntArray578[anInt7142++] = local2914 == null ? 0 : 1;
						return;
					}
					anIntArray578[anInt7142++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt7142 -= 2;
					local192 = anIntArray578[anInt7142];
					local1578 = anIntArray578[anInt7142 + 1] == 1;
					if (Static268.aClass28_22 != null) {
						local2867 = Static268.aClass28_22.method738((long) local192);
						if (local2867 != null && !local1578) {
							local2867.method9457();
							return;
						}
						if (local2867 == null && local1578) {
							local2867 = new Class2();
							Static268.aClass28_22.method735((long) local192, local2867);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local192 = anIntArray578[--anInt7142];
					if (Static268.aClass28_22 != null) {
						local2914 = Static268.aClass28_22.method738((long) local192);
						anIntArray578[anInt7142++] = local2914 == null ? 0 : 1;
						return;
					}
					anIntArray578[anInt7142++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray578[anInt7142++] = Static30.aClass2_Sub2_Sub13_3 == null ? -1 : Static30.aClass2_Sub2_Sub13_3.anInt4563;
					return;
				}
				if (arg0 == 5236) {
					anInt7142 -= 2;
					local192 = anIntArray578[anInt7142];
					local834 = anIntArray578[anInt7142 + 1];
					local109 = local834 >> 14 & 0x3FFF;
					local115 = local834 & 0x3FFF;
					local375 = Static687.method8957(local192, local115, local109);
					if (local375 < 0) {
						anIntArray578[anInt7142++] = -1;
						return;
					}
					anIntArray578[anInt7142++] = local375;
					return;
				}
				if (arg0 == 5237) {
					Static322.method9441();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt7142 -= 2;
					local192 = anIntArray578[anInt7142];
					local834 = anIntArray578[anInt7142 + 1];
					Static409.method5657(3, local192, false, local834);
					anIntArray578[anInt7142++] = Static316.aFrame8 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static316.aFrame8 != null) {
						Static409.method5657(Static400.aClass2_Sub34_28.aClass57_Sub1_1.method1485(), -1, false, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(3186) Class273[] local3186 = Static587.method7710();
					anIntArray578[anInt7142++] = local3186.length;
					return;
				}
				if (arg0 == 5303) {
					local192 = anIntArray578[--anInt7142];
					@Pc(3210) Class273[] local3210 = Static587.method7710();
					anIntArray578[anInt7142++] = local3210[local192].anInt6918;
					anIntArray578[anInt7142++] = local3210[local192].anInt6912;
					return;
				}
				if (arg0 == 5305) {
					local192 = Static328.anInt5427;
					local834 = Static110.anInt2189;
					local109 = -1;
					@Pc(3245) Class273[] local3245 = Static587.method7710();
					for (local375 = 0; local375 < local3245.length; local375++) {
						@Pc(3252) Class273 local3252 = local3245[local375];
						if (local3252.anInt6918 == local192 && local3252.anInt6912 == local834) {
							local109 = local375;
							break;
						}
					}
					anIntArray578[anInt7142++] = local109;
					return;
				}
				if (arg0 == 5306) {
					anIntArray578[anInt7142++] = Static36.method978(3);
					return;
				}
				if (arg0 == 5307) {
					local192 = anIntArray578[--anInt7142];
					if (local192 >= 1 && local192 <= 2) {
						Static409.method5657(local192, -1, false, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub1_1.method1485();
					return;
				}
				if (arg0 == 5309) {
					local192 = anIntArray578[--anInt7142];
					if (local192 >= 1 && local192 <= 2) {
						Static400.aClass2_Sub34_28.method5104(local192, Static400.aClass2_Sub34_28.aClass57_Sub1_1);
						Static400.aClass2_Sub34_28.method5104(local192, Static400.aClass2_Sub34_28.aClass57_Sub1_2);
						Static666.method8693(1);
						return;
					}
					return;
				}
			} else {
				@Pc(3561) int local3561;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt7139 -= 2;
						local95 = aStringArray37[anInt7139];
						local101 = aStringArray37[anInt7139 + 1];
						local109 = anIntArray578[--anInt7142];
						@Pc(3411) Class153 local3411 = Static668.method8701();
						@Pc(3417) Class2_Sub19 local3417 = Static293.method4335(Static563.aClass345_102, local3411.aIsaacRandom_1);
						local3417.aPacketBit_1.p1(Static231.method3379(local95) + Static231.method3379(local101) + 1);
						local3417.aPacketBit_1.pjstr(local95);
						local3417.aPacketBit_1.pjstr(local101);
						local3417.aPacketBit_1.p1(local109);
						local3411.method3275(local3417);
						return;
					}
					if (arg0 == 5401) {
						anInt7142 -= 2;
						Static637.aShortArray132[anIntArray578[anInt7142]] = (short) Static166.method2616(anIntArray578[anInt7142 + 1]);
						Static419.aClass112_1.method2482();
						Static419.aClass112_1.method2484();
						Static690.aClass308_2.method7091();
						Static469.method6362();
						return;
					}
					if (arg0 == 5405) {
						anInt7142 -= 2;
						local192 = anIntArray578[anInt7142];
						local834 = anIntArray578[anInt7142 + 1];
						if (local192 >= 0 && local192 < 2) {
							Static603.anIntArrayArrayArray18[local192] = new int[local834 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt7142 -= 7;
						local192 = anIntArray578[anInt7142];
						local834 = anIntArray578[anInt7142 + 1] << 1;
						local109 = anIntArray578[anInt7142 + 2];
						local115 = anIntArray578[anInt7142 + 3];
						local375 = anIntArray578[anInt7142 + 4];
						local3561 = anIntArray578[anInt7142 + 5];
						@Pc(3567) int local3567 = anIntArray578[anInt7142 + 6];
						if (local192 >= 0 && local192 < 2 && Static603.anIntArrayArrayArray18[local192] != null && local834 >= 0 && local834 < Static603.anIntArrayArrayArray18[local192].length) {
							Static603.anIntArrayArrayArray18[local192][local834] = new int[] { (local109 >> 14 & 0x3FFF) << 9, local115 << 2, (local109 & 0x3FFF) << 9, local3567 };
							Static603.anIntArrayArrayArray18[local192][local834 + 1] = new int[] { (local375 >> 14 & 0x3FFF) << 9, local3561 << 2, (local375 & 0x3FFF) << 9 };
						}
						return;
					}
					if (arg0 == 5407) {
						local192 = Static603.anIntArrayArrayArray18[anIntArray578[--anInt7142]].length >> 1;
						anIntArray578[anInt7142++] = local192;
						return;
					}
					if (arg0 == 5411) {
						if (Static316.aFrame8 != null) {
							Static409.method5657(Static400.aClass2_Sub34_28.aClass57_Sub1_1.method1485(), -1, false, -1);
						}
						if (Static353.aFrame10 != null) {
							Static266.method6777();
							System.exit(0);
							return;
						}
						local95 = Static360.aString59 == null ? Static659.method8605() : Static360.aString59;
						Static664.method8655(Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7915() == 1, local95, false, Static446.aClass390_6);
						return;
					}
					if (arg0 == 5419) {
						local95 = "";
						if (Static439.aClass270_4 != null) {
							if (Static439.aClass270_4.anObject13 == null) {
								local95 = Static419.method5756(Static439.aClass270_4.anInt6788);
							} else {
								local95 = (String) Static439.aClass270_4.anObject13;
							}
						}
						aStringArray37[anInt7139++] = local95;
						return;
					}
					if (arg0 == 5420) {
						anIntArray578[anInt7142++] = Static446.aClass390_6.aBoolean781 ? 0 : 1;
						return;
					}
					if (arg0 == 5421) {
						if (Static316.aFrame8 != null) {
							Static409.method5657(Static400.aClass2_Sub34_28.aClass57_Sub1_1.method1485(), -1, false, -1);
						}
						local95 = aStringArray37[--anInt7139];
						local1578 = anIntArray578[--anInt7142] == 1;
						local198 = Static659.method8605() + local95;
						Static664.method8655(Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7915() == 1, local198, local1578, Static446.aClass390_6);
						return;
					}
					if (arg0 == 5422) {
						anInt7139 -= 2;
						local95 = aStringArray37[anInt7139];
						local101 = aStringArray37[anInt7139 + 1];
						local109 = anIntArray578[--anInt7142];
						if (local95.length() > 0) {
							if (Static685.aStringArray47 == null) {
								Static685.aStringArray47 = new String[Static390.anIntArray476[Static392.aClass377_4.anInt9720]];
							}
							Static685.aStringArray47[local109] = local95;
						}
						if (local101.length() > 0) {
							if (Static377.aStringArray30 == null) {
								Static377.aStringArray30 = new String[Static390.anIntArray476[Static392.aClass377_4.anInt9720]];
							}
							Static377.aStringArray30[local109] = local101;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray37[--anInt7139]);
						return;
					}
					if (arg0 == 5424) {
						anInt7142 -= 11;
						Static719.anInt10504 = anIntArray578[anInt7142];
						Static514.anInt7677 = anIntArray578[anInt7142 + 1];
						Static183.anInt3022 = anIntArray578[anInt7142 + 2];
						Static405.anInt6255 = anIntArray578[anInt7142 + 3];
						Static63.anInt1474 = anIntArray578[anInt7142 + 4];
						Static282.anInt4417 = anIntArray578[anInt7142 + 5];
						Static337.anInt5561 = anIntArray578[anInt7142 + 6];
						Static176.anInt7532 = anIntArray578[anInt7142 + 7];
						Static282.anInt4419 = anIntArray578[anInt7142 + 8];
						Static563.anInt8455 = anIntArray578[anInt7142 + 9];
						Static634.anInt9510 = anIntArray578[anInt7142 + 10];
						Static721.aClass330_128.method7581(Static63.anInt1474);
						Static721.aClass330_128.method7581(Static282.anInt4417);
						Static721.aClass330_128.method7581(Static337.anInt5561);
						Static721.aClass330_128.method7581(Static176.anInt7532);
						Static721.aClass330_128.method7581(Static282.anInt4419);
						Static26.aClass23_5 = null;
						Static561.aClass23_34 = null;
						Static261.aClass23_18 = null;
						Static608.aClass23_41 = null;
						Static1.aClass23_42 = null;
						Static459.aClass23_31 = null;
						Static542.aClass23_33 = null;
						Static63.aClass23_8 = null;
						Static60.aBoolean87 = true;
						return;
					}
					if (arg0 == 5425) {
						Static329.method1649();
						Static60.aBoolean87 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt7142 -= 2;
						Class8_Sub2_Sub4_Sub1.lb = anIntArray578[anInt7142];
						Static39.anInt950 = anIntArray578[anInt7142 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt7142 -= 2;
						return;
					}
					if (arg0 == 5428) {
						anInt7142 -= 2;
						local192 = anIntArray578[anInt7142];
						local834 = anIntArray578[anInt7142 + 1];
						anIntArray578[anInt7142++] = Static251.method3549(local192, local834) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static231.method3381(false, false, aStringArray37[--anInt7139]);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static727.method97("accountcreated", Static166.anApplet1);
							return;
						} catch (@Pc(4148) Throwable local4148) {
							return;
						}
					}
					if (arg0 == 5431) {
						try {
							Static727.method97("accountcreatestarted", Static166.anApplet1);
							return;
						} catch (@Pc(4161) Throwable local4161) {
							return;
						}
					}
					if (arg0 == 5432) {
						local95 = "";
						if (Static175.aClipboard1 != null) {
							@Pc(4173) Transferable local4173 = Static175.aClipboard1.getContents((Object) null);
							if (local4173 != null) {
								try {
									local95 = (String) local4173.getTransferData(DataFlavor.stringFlavor);
									if (local95 == null) {
										local95 = "";
									}
								} catch (@Pc(4186) Exception local4186) {
								}
							}
						}
						aStringArray37[anInt7139++] = local95;
						return;
					}
					if (arg0 == 5433) {
						Static143.anInt4059 = anIntArray578[--anInt7142];
						return;
					}
					if (arg0 == 5435) {
						anIntArray578[anInt7142++] = Static98.aBoolean191 ? 1 : 0;
						return;
					}
					if (arg0 == 5436) {
						if (Static292.aClass2_Sub43_2.anInt7603 < 6) {
							anIntArray578[anInt7142++] = 0;
							return;
						}
						if (Static292.aClass2_Sub43_2.anInt7603 == 6 && Static292.aClass2_Sub43_2.anInt7607 < 10) {
							anIntArray578[anInt7142++] = 0;
							return;
						}
						anIntArray578[anInt7142++] = 1;
						return;
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt7142 -= 4;
						local192 = anIntArray578[anInt7142];
						local834 = anIntArray578[anInt7142 + 1];
						local109 = anIntArray578[anInt7142 + 2];
						local115 = anIntArray578[anInt7142 + 3];
						Static319.method4595((local192 >> 14 & 0x3FFF) - Static691.anInt10367, false, local109, local834 << 2, (local192 & 0x3FFF) - Static116.anInt2270, local115);
						return;
					}
					if (arg0 == 5501) {
						anInt7142 -= 4;
						local192 = anIntArray578[anInt7142];
						local834 = anIntArray578[anInt7142 + 1];
						local109 = anIntArray578[anInt7142 + 2];
						local115 = anIntArray578[anInt7142 + 3];
						Static638.method8397(local109, (local192 & 0x3FFF) - Static116.anInt2270, (local192 >> 14 & 0x3FFF) - Static691.anInt10367, local834 << 2, local115);
						return;
					}
					if (arg0 == 5502) {
						anInt7142 -= 6;
						local192 = anIntArray578[anInt7142];
						if (local192 >= 2) {
							throw new RuntimeException();
						}
						Static197.anInt3260 = local192;
						local834 = anIntArray578[anInt7142 + 1];
						if (local834 + 1 >= Static603.anIntArrayArrayArray18[Static197.anInt3260].length >> 1) {
							throw new RuntimeException();
						}
						Static303.anInt4868 = local834;
						Static260.anInt4244 = 0;
						Static71.anInt1581 = anIntArray578[anInt7142 + 2];
						Static410.anInt6322 = anIntArray578[anInt7142 + 3];
						local109 = anIntArray578[anInt7142 + 4];
						if (local109 >= 2) {
							throw new RuntimeException();
						}
						Static374.anInt5907 = local109;
						local115 = anIntArray578[anInt7142 + 5];
						if (local115 + 1 >= Static603.anIntArrayArrayArray18[Static374.anInt5907].length >> 1) {
							throw new RuntimeException();
						}
						Static591.anInt8739 = local115;
						Static511.anInt7645 = 3;
						Static693.anInt10383 = -1;
						Static692.anInt10376 = -1;
						return;
					}
					if (arg0 == 5503) {
						Static693.method9012();
						return;
					}
					if (arg0 == 5504) {
						anInt7142 -= 2;
						Static471.method6408(anIntArray578[anInt7142 + 1], anIntArray578[anInt7142]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray578[anInt7142++] = (int) Static479.aFloat123 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray578[anInt7142++] = (int) Static171.aFloat64 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static599.method7835();
						return;
					}
					if (arg0 == 5508) {
						Static494.method6596();
						return;
					}
					if (arg0 == 5509) {
						Static254.method3606();
						return;
					}
					if (arg0 == 5510) {
						Static470.method6386();
						return;
					}
					if (arg0 == 5511) {
						local192 = anIntArray578[--anInt7142];
						local834 = local192 >> 14 & 0x3FFF;
						local109 = local192 & 0x3FFF;
						local834 -= Static691.anInt10367;
						if (local834 < 0) {
							local834 = 0;
						} else if (local834 >= Static720.anInt10859) {
							local834 = Static720.anInt10859;
						}
						local109 -= Static116.anInt2270;
						if (local109 < 0) {
							local109 = 0;
						} else if (local109 >= Static501.anInt7568) {
							local109 = Static501.anInt7568;
						}
						Static433.anInt6262 = (local834 << 9) + 256;
						Static249.anInt4018 = (local109 << 9) + 256;
						Static511.anInt7645 = 4;
						Static693.anInt10383 = -1;
						Static692.anInt10376 = -1;
						return;
					}
					if (arg0 == 5512) {
						Static145.method2409();
						return;
					}
					if (arg0 == 5514) {
						Static582.anInt8630 = anIntArray578[--anInt7142];
						return;
					}
					if (arg0 == 5516) {
						anIntArray578[anInt7142++] = Static582.anInt8630;
						return;
					}
					if (arg0 == 5517) {
						local192 = anIntArray578[--anInt7142];
						if (local192 == -1) {
							local834 = local192 >> 14 & 0x3FFF;
							local109 = local192 & 0x3FFF;
							local834 -= Static691.anInt10367;
							if (local834 < 0) {
								local834 = 0;
							} else if (local834 >= Static720.anInt10859) {
								local834 = Static720.anInt10859;
							}
							local109 -= Static116.anInt2270;
							if (local109 < 0) {
								local109 = 0;
							} else if (local109 >= Static501.anInt7568) {
								local109 = Static501.anInt7568;
							}
							Static692.anInt10376 = (local834 << 9) + 256;
							Static693.anInt10383 = (local109 << 9) + 256;
							return;
						}
						Static692.anInt10376 = -1;
						Static693.anInt10383 = -1;
						return;
					}
					if (arg0 == 5547) {
						anIntArray578[anInt7142++] = Static511.anInt7645 == 1 ? 1 : 0;
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt7139 -= 2;
						local95 = aStringArray37[anInt7139];
						local101 = aStringArray37[anInt7139 + 1];
						local109 = anIntArray578[--anInt7142];
						Static57.method1232(local109, local101, local95);
						return;
					}
					if (arg0 == 5601) {
						Static66.method1488();
						return;
					}
					if (arg0 == 5602) {
						if (!Static242.method3500()) {
							Static707.method9227();
						}
						return;
					}
					if (arg0 == 5604) {
						anInt7139--;
						if (Static283.anInt4574 != 3) {
							return;
						}
						if (!Static242.method3500() && Static6.anInt95 == 0) {
							Static104.method2029(aStringArray37[anInt7139]);
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt7139 -= 2;
						anInt7142 -= 2;
						if (Static283.anInt4574 != 3) {
							return;
						}
						if (!Static242.method3500() && Static6.anInt95 == 0) {
							Static81.method1591(aStringArray37[anInt7139], anIntArray578[anInt7142], aStringArray37[anInt7139 + 1], anIntArray578[anInt7142 + 1] == 1);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static6.anInt95 == 0) {
							Static580.anInt8621 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray578[anInt7142++] = Static169.anInt2855;
						return;
					}
					if (arg0 == 5608) {
						anIntArray578[anInt7142++] = Static118.anInt2292;
						return;
					}
					if (arg0 == 5609) {
						anIntArray578[anInt7142++] = Static580.anInt8621;
						return;
					}
					if (arg0 == 5611) {
						anIntArray578[anInt7142++] = Static329.anInt1749;
						return;
					}
					if (arg0 == 5612) {
						local192 = anIntArray578[--anInt7142];
						Static674.method8789(local192);
						return;
					}
					if (arg0 == 5613) {
						anIntArray578[anInt7142++] = Static169.anInt2855;
						return;
					}
					if (arg0 == 5615) {
						anInt7139 -= 2;
						local95 = aStringArray37[anInt7139];
						local101 = aStringArray37[anInt7139 + 1];
						Static218.method3188(local101, local95);
						return;
					}
					if (arg0 == 5616) {
						Static233.method3409(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray578[anInt7142++] = Static284.anInt4583;
						return;
					}
					if (arg0 == 5618) {
						anInt7142--;
						return;
					}
					if (arg0 == 5619) {
						anInt7142--;
						return;
					}
					if (arg0 == 5620) {
						anIntArray578[anInt7142++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt7139 -= 2;
						anInt7142 -= 2;
						return;
					}
					if (arg0 == 5622) {
						return;
					}
					if (arg0 == 5623) {
						if (Static265.aByteArray44 != null) {
							anIntArray578[anInt7142++] = 1;
							return;
						}
						anIntArray578[anInt7142++] = 0;
						return;
					}
					if (arg0 == 5624) {
						anIntArray578[anInt7142++] = (int) (Static416.aLong208 >> 32);
						anIntArray578[anInt7142++] = (int) (Static416.aLong208 & 0xFFFFFFFFFFFFFFFFL);
						return;
					}
					if (arg0 == 5625) {
						anIntArray578[anInt7142++] = Static477.aBoolean543 ? 1 : 0;
						return;
					}
					if (arg0 == 5626) {
						Static477.aBoolean543 = true;
						Static358.method9190();
						return;
					}
					if (arg0 == 5627) {
						anIntArray578[anInt7142++] = Static78.anInt1626;
						anIntArray578[anInt7142++] = Static383.anInt6001;
						anIntArray578[anInt7142++] = Static673.anInt10079;
						Static78.anInt1626 = -2;
						Static383.anInt6001 = -1;
						Static673.anInt10079 = -1;
						return;
					}
					if (arg0 == 5628) {
						anIntArray578[anInt7142++] = Static242.method3500() ? 1 : 0;
						return;
					}
					if (arg0 == 5629) {
						anIntArray578[anInt7142++] = Static660.anInt9837;
						return;
					}
					if (arg0 == 5630) {
						Static56.method1220();
						return;
					}
					if (arg0 == 5631) {
						anInt7142 -= 2;
						local192 = anIntArray578[anInt7142];
						local834 = anIntArray578[anInt7142 + 1];
						Static151.method9291(local192, local834);
						return;
					}
					if (arg0 == 5632) {
						local192 = anIntArray578[--anInt7142];
						Static303.method4428(local192);
						return;
					}
					if (arg0 == 5633) {
						anIntArray578[anInt7142++] = Static356.anInt5780;
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local192 = anIntArray578[--anInt7142];
						Static400.aClass2_Sub34_28.method5104(local192, Static400.aClass2_Sub34_28.aClass57_Sub22_1);
						Static449.method6116();
						Static666.method8693(1);
						Static503.aBoolean578 = false;
						return;
					}
					@Pc(5337) boolean local5337;
					if (arg0 == 6002) {
						local5337 = anIntArray578[--anInt7142] == 1;
						Static400.aClass2_Sub34_28.method5104(local5337 ? 1 : 0, Static400.aClass2_Sub34_28.aClass57_Sub19_1);
						Static400.aClass2_Sub34_28.method5104(local5337 ? 1 : 0, Static400.aClass2_Sub34_28.aClass57_Sub19_2);
						Static449.method6116();
						Static77.method1561();
						Static666.method8693(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (arg0 == 6003) {
						local5337 = anIntArray578[--anInt7142] == 1;
						Static400.aClass2_Sub34_28.method5104(local5337 ? 2 : 1, Static400.aClass2_Sub34_28.aClass57_Sub4_1);
						Static400.aClass2_Sub34_28.method5104(local5337 ? 2 : 1, Static400.aClass2_Sub34_28.aClass57_Sub4_2);
						Static77.method1561();
						Static666.method8693(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (arg0 == 6005) {
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142] == 1 ? 1 : 0, Static400.aClass2_Sub34_28.aClass57_Sub6_1);
						Static449.method6116();
						Static666.method8693(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (arg0 == 6007) {
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142], Static400.aClass2_Sub34_28.aClass57_Sub27_1);
						Static666.method8693(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (arg0 == 6008) {
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142] == 1 ? 1 : 0, Static400.aClass2_Sub34_28.aClass57_Sub8_1);
						Static666.method8693(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (arg0 == 6010) {
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142] == 1 ? 1 : 0, Static400.aClass2_Sub34_28.aClass57_Sub7_1);
						Static666.method8693(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (arg0 == 6011) {
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142], Static400.aClass2_Sub34_28.aClass57_Sub12_1);
						Static449.method6116();
						Static666.method8693(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (arg0 == 6012) {
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142] == 1 ? 1 : 0, Static400.aClass2_Sub34_28.aClass57_Sub24_1);
						Static296.method4362();
						Static218.method3187();
						Static666.method8693(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (arg0 == 6014) {
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142] == 1 ? 2 : 0, Static400.aClass2_Sub34_28.aClass57_Sub26_1);
						Static449.method6116();
						Static666.method8693(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (arg0 == 6015) {
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142] == 1 ? 1 : 0, Static400.aClass2_Sub34_28.aClass57_Sub16_1);
						Static449.method6116();
						Static666.method8693(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (arg0 == 6016) {
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142], Static400.aClass2_Sub34_28.aClass57_Sub13_1);
						Static32.method880(Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7915(), false);
						Static666.method8693(1);
						return;
					}
					if (arg0 == 6017) {
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142] == 1 ? 1 : 0, Static400.aClass2_Sub34_28.aClass57_Sub17_1);
						Static150.method2455();
						Static666.method8693(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (arg0 == 6018) {
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142], Static400.aClass2_Sub34_28.aClass57_Sub25_3);
						Static666.method8693(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (arg0 == 6019) {
						local192 = anIntArray578[--anInt7142];
						local834 = Static400.aClass2_Sub34_28.aClass57_Sub25_2.method7208();
						if (local192 != local834) {
							if (Static109.method2070(Static283.anInt4574)) {
								if (local834 == 0 && Static588.anInt8692 != -1) {
									Static611.method8229(Static588.anInt8692, local192, Static398.aClass330_81);
									Static550.method7266();
									Static501.aBoolean575 = false;
								} else if (local192 == 0) {
									Static100.method1988();
									Static501.aBoolean575 = false;
								} else {
									Static126.method2226(local192);
								}
							}
							Static400.aClass2_Sub34_28.method5104(local192, Static400.aClass2_Sub34_28.aClass57_Sub25_2);
							Static666.method8693(1);
							Static503.aBoolean578 = false;
						}
						return;
					}
					if (arg0 == 6020) {
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142], Static400.aClass2_Sub34_28.aClass57_Sub25_1);
						Static666.method8693(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (arg0 == 6021) {
						local192 = Static400.aClass2_Sub34_28.aClass57_Sub4_1.method2143();
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142] == 1 ? 0 : local192, Static400.aClass2_Sub34_28.aClass57_Sub4_2);
						Static77.method1561();
						return;
					}
					if (arg0 == 6023) {
						local192 = anIntArray578[--anInt7142];
						Static400.aClass2_Sub34_28.method5104(local192, Static400.aClass2_Sub34_28.aClass57_Sub28_1);
						Static666.method8693(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (arg0 == 6024) {
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142], Static400.aClass2_Sub34_28.aClass57_Sub13_2);
						Static666.method8693(1);
						return;
					}
					if (arg0 == 6025) {
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142], Static400.aClass2_Sub34_28.aClass57_Sub5_1);
						Static666.method8693(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (arg0 == 6027) {
						local192 = anIntArray578[--anInt7142];
						if (local192 < 0 || local192 > 1) {
							local192 = 0;
						}
						Static249.method3537(local192 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142] == 0 ? 0 : 1, Static400.aClass2_Sub34_28.aClass57_Sub14_1);
						Static666.method8693(1);
						return;
					}
					if (arg0 == 6029) {
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142], Static400.aClass2_Sub34_28.aClass57_Sub27_1);
						Static666.method8693(1);
						return;
					}
					if (arg0 == 6030) {
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142] == 0 ? 0 : 1, Static400.aClass2_Sub34_28.aClass57_Sub23_1);
						Static666.method8693(1);
						Static449.method6116();
						return;
					}
					if (arg0 == 6031) {
						local192 = anIntArray578[--anInt7142];
						if (local192 < 0 || local192 > 5) {
							local192 = 2;
						}
						Static32.method880(local192, false);
						return;
					}
					if (arg0 == 6032) {
						anInt7142 -= 2;
						local192 = anIntArray578[anInt7142];
						local1578 = anIntArray578[anInt7142 + 1] == 1;
						Static400.aClass2_Sub34_28.method5104(local192, Static400.aClass2_Sub34_28.aClass57_Sub29_2);
						if (!local1578) {
							Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub15_1);
						}
						Static666.method8693(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (arg0 == 6033) {
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142], Static400.aClass2_Sub34_28.aClass57_Sub21_1);
						Static666.method8693(1);
						return;
					}
					if (arg0 == 6034) {
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142] == 1 ? 1 : 0, Static400.aClass2_Sub34_28.aClass57_Sub30_1);
						Static666.method8693(1);
						Static296.method4362();
						Static503.aBoolean578 = false;
						return;
					}
					if (arg0 == 6035) {
						local192 = Static400.aClass2_Sub34_28.aClass57_Sub19_1.method5960();
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142] == 1 ? 1 : local192, Static400.aClass2_Sub34_28.aClass57_Sub19_2);
						Static449.method6116();
						Static77.method1561();
						return;
					}
					if (arg0 == 6036) {
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142], Static400.aClass2_Sub34_28.aClass57_Sub18_1);
						Static666.method8693(1);
						Static284.aBoolean355 = true;
						return;
					}
					if (arg0 == 6037) {
						Static400.aClass2_Sub34_28.method5104(anIntArray578[--anInt7142], Static400.aClass2_Sub34_28.lb);
						Static666.method8693(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (arg0 == 6038) {
						local192 = anIntArray578[--anInt7142];
						local834 = Static400.aClass2_Sub34_28.aClass57_Sub25_4.method7208();
						if (local192 != local834 && Static588.anInt8692 == Static597.anInt8821) {
							if (!Static109.method2070(Static283.anInt4574)) {
								if (local834 == 0) {
									Static611.method8229(Static588.anInt8692, local192, Static398.aClass330_81);
									Static550.method7266();
									Static501.aBoolean575 = false;
								} else if (local192 == 0) {
									Static100.method1988();
									Static501.aBoolean575 = false;
								} else {
									Static126.method2226(local192);
								}
							}
							Static400.aClass2_Sub34_28.method5104(local192, Static400.aClass2_Sub34_28.aClass57_Sub25_4);
							Static666.method8693(1);
							Static503.aBoolean578 = false;
						}
						return;
					}
					if (arg0 == 6039) {
						local192 = anIntArray578[--anInt7142];
						if (local192 > 255 || local192 < 0) {
							local192 = 0;
						}
						if (local192 != Static400.aClass2_Sub34_28.aClass57_Sub11_1.method3603()) {
							Static400.aClass2_Sub34_28.method5104(local192, Static400.aClass2_Sub34_28.aClass57_Sub11_1);
							Static666.method8693(1);
							Static503.aBoolean578 = false;
						}
						return;
					}
					if (arg0 == 6040) {
						local192 = anIntArray578[--anInt7142];
						if (local192 != Static400.aClass2_Sub34_28.aClass57_Sub3_1.method2120()) {
							Static400.aClass2_Sub34_28.method5104(local192, Static400.aClass2_Sub34_28.aClass57_Sub3_1);
							Static666.method8693(1);
							Static503.aBoolean578 = false;
							Static498.method6646();
						}
						return;
					}
					if (arg0 == 6041) {
						local192 = anIntArray578[--anInt7142];
						if (local192 != Static400.aClass2_Sub34_28.aClass57_Sub2_1.method1989()) {
							Static400.aClass2_Sub34_28.method5104(local192, Static400.aClass2_Sub34_28.aClass57_Sub2_1);
							Static666.method8693(1);
							Static503.aBoolean578 = false;
						}
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub22_1.method6769();
						return;
					}
					if (arg0 == 6102) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub19_1.method5960() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub4_1.method2143() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub6_1.method2714() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub27_1.method7667();
						return;
					}
					if (arg0 == 6108) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub8_1.method3176() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub7_1.method2905() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub12_1.method4364();
						return;
					}
					if (arg0 == 6112) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub24_1.method7082() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub26_1.method7463() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub16_1.method5507() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub13_1.method4373();
						return;
					}
					if (arg0 == 6117) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub17_1.method5667() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub25_3.method7208();
						return;
					}
					if (arg0 == 6119) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub25_2.method7208();
						return;
					}
					if (arg0 == 6120) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub25_1.method7208();
						return;
					}
					if (arg0 == 6123) {
						anIntArray578[anInt7142++] = Static436.method3416();
						return;
					}
					if (arg0 == 6124) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub13_2.method4373();
						return;
					}
					if (arg0 == 6125) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub5_1.method2172();
						return;
					}
					if (arg0 == 6127) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub20_1.method6108() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub14_1.method5302() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub27_1.method7667();
						return;
					}
					if (arg0 == 6130) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub23_1.method7054() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7915();
						return;
					}
					if (arg0 == 6132) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub29_2.method7915();
						return;
					}
					if (arg0 == 6133) {
						anIntArray578[anInt7142++] = Static446.aClass390_6.aBoolean781 && !Static446.aClass390_6.aBoolean779 ? 1 : 0;
						return;
					}
					if (arg0 == 6135) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub21_1.method6360();
						return;
					}
					if (arg0 == 6136) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub30_1.method8356() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6138) {
						anIntArray578[anInt7142++] = Static363.method6235(200, Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7915());
						return;
					}
					if (arg0 == 6139) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub18_1.method5767();
						return;
					}
					if (arg0 == 6142) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.lb.method7208();
						return;
					}
					if (arg0 == 6143) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub25_4.method7208();
						return;
					}
					if (arg0 == 6144) {
						anIntArray578[anInt7142++] = Static3.aBoolean4 ? 1 : 0;
						return;
					}
					if (arg0 == 6145) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub11_1.method3603();
						return;
					}
					if (arg0 == 6146) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub3_1.method2120();
						return;
					}
					if (arg0 == 6147) {
						anIntArray578[anInt7142++] = Static292.aClass2_Sub43_2.anInt7610 < 512 || Static3.aBoolean4 || Static171.aBoolean245 ? 1 : 0;
						return;
					}
					if (arg0 == 6148) {
						anIntArray578[anInt7142++] = Static416.aBoolean472 ? 1 : 0;
						return;
					}
					if (arg0 == 6149) {
						anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub2_1.method1989();
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt7142 -= 2;
						Static640.aShort122 = (short) anIntArray578[anInt7142];
						if (Static640.aShort122 <= 0) {
							Static640.aShort122 = 256;
						}
						Static640.aShort121 = (short) anIntArray578[anInt7142 + 1];
						if (Static640.aShort121 <= 0) {
							Static640.aShort121 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt7142 -= 2;
						Static228.aShort45 = (short) anIntArray578[anInt7142];
						if (Static228.aShort45 <= 0) {
							Static228.aShort45 = 256;
						}
						Static502.aShort97 = (short) anIntArray578[anInt7142 + 1];
						if (Static502.aShort97 <= 0) {
							Static502.aShort97 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt7142 -= 4;
						Static25.aShort1 = (short) anIntArray578[anInt7142];
						if (Static25.aShort1 <= 0) {
							Static25.aShort1 = 1;
						}
						Static598.aShort120 = (short) anIntArray578[anInt7142 + 1];
						if (Static598.aShort120 <= 0) {
							Static598.aShort120 = 32767;
						} else if (Static598.aShort120 < Static25.aShort1) {
							Static598.aShort120 = Static25.aShort1;
						}
						Static552.aShort123 = (short) anIntArray578[anInt7142 + 2];
						if (Static552.aShort123 <= 0) {
							Static552.aShort123 = 1;
						}
						Static306.aShort59 = (short) anIntArray578[anInt7142 + 3];
						if (Static306.aShort59 <= 0) {
							Static306.aShort59 = 32767;
							return;
						}
						if (Static306.aShort59 < Static552.aShort123) {
							Static306.aShort59 = Static552.aShort123;
						}
						return;
					}
					if (arg0 == 6203) {
						Static498.method6643(0, false, 0, Static610.aClass158_16.anInt3746, Static610.aClass158_16.anInt3802);
						anIntArray578[anInt7142++] = Static242.anInt3971;
						anIntArray578[anInt7142++] = Static200.anInt3305;
						return;
					}
					if (arg0 == 6204) {
						anIntArray578[anInt7142++] = Static228.aShort45;
						anIntArray578[anInt7142++] = Static502.aShort97;
						return;
					}
					if (arg0 == 6205) {
						anIntArray578[anInt7142++] = Static640.aShort122;
						anIntArray578[anInt7142++] = Static640.aShort121;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray578[anInt7142++] = (int) (Static588.method7715() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray578[anInt7142++] = (int) (Static588.method7715() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt7142 -= 3;
						local192 = anIntArray578[anInt7142];
						local834 = anIntArray578[anInt7142 + 1];
						local109 = anIntArray578[anInt7142 + 2];
						@Pc(7384) long local7384 = Static40.method1026(local834, local109, local192);
						local3561 = Static68.method3585(local7384);
						if (local109 < 1970) {
							local3561--;
						}
						anIntArray578[anInt7142++] = local3561;
						return;
					}
					if (arg0 == 6303) {
						anIntArray578[anInt7142++] = Static614.method8242(Static588.method7715());
						return;
					}
					if (arg0 == 6304) {
						local192 = anIntArray578[--anInt7142];
						local1578 = true;
						if (local192 < 0) {
							local1578 = (local192 + 1) % 4 == 0;
						} else if (local192 < 1582) {
							local1578 = local192 % 4 == 0;
						} else if (local192 % 4 != 0) {
							local1578 = false;
						} else if (local192 % 100 != 0) {
							local1578 = true;
						} else if (local192 % 400 != 0) {
							local1578 = false;
						}
						anIntArray578[anInt7142++] = local1578 ? 1 : 0;
						return;
					}
					if (arg0 == 6305) {
						local192 = anIntArray578[--anInt7142];
						@Pc(7512) int[] local7512 = Static212.method3135(local192);
						Static734.method7695(local7512, 0, anIntArray578, anInt7142, 3);
						anInt7142 += 3;
						return;
					}
					if (arg0 == 6306) {
						local192 = anIntArray578[--anInt7142];
						anIntArray578[anInt7142++] = (int) (Static38.method1003(local192) / 60000L);
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray578[anInt7142++] = Static21.method8119() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray578[anInt7142++] = Static385.method5421() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static283.anInt4574 == 7 && !Static242.method3500() && Static6.anInt95 == 0) {
							if (Static149.aBoolean221) {
								anIntArray578[anInt7142++] = 0;
								return;
							}
							if (Static363.aLong219 > Static588.method7715() - 1000L) {
								anIntArray578[anInt7142++] = 1;
								return;
							}
							Static149.aBoolean221 = true;
							@Pc(7662) Class2_Sub19 local7662 = Static293.method4335(Static231.aClass345_41, Static405.aClass153_1.aIsaacRandom_1);
							local7662.aPacketBit_1.p4(Static379.anInt5968);
							Static405.aClass153_1.method3275(local7662);
							anIntArray578[anInt7142++] = 0;
							return;
						}
						anIntArray578[anInt7142++] = 1;
						return;
					}
					@Pc(7719) Class65 local7719;
					@Pc(7686) Class297_Sub1 local7686;
					if (arg0 == 6501) {
						local7686 = Static724.method9452();
						if (local7686 != null) {
							anIntArray578[anInt7142++] = local7686.anInt7569;
							anIntArray578[anInt7142++] = local7686.anInt7563;
							aStringArray37[anInt7139++] = local7686.aString91;
							local7719 = local7686.method6717();
							anIntArray578[anInt7142++] = local7719.anInt1610;
							aStringArray37[anInt7139++] = local7719.aString13;
							anIntArray578[anInt7142++] = local7686.anInt7561;
							anIntArray578[anInt7142++] = local7686.anInt7570;
							aStringArray37[anInt7139++] = local7686.aString90;
							return;
						}
						anIntArray578[anInt7142++] = -1;
						anIntArray578[anInt7142++] = 0;
						aStringArray37[anInt7139++] = "";
						anIntArray578[anInt7142++] = 0;
						aStringArray37[anInt7139++] = "";
						anIntArray578[anInt7142++] = 0;
						anIntArray578[anInt7142++] = 0;
						aStringArray37[anInt7139++] = "";
						return;
					}
					if (arg0 == 6502) {
						local7686 = Static557.method7333();
						if (local7686 != null) {
							anIntArray578[anInt7142++] = local7686.anInt7569;
							anIntArray578[anInt7142++] = local7686.anInt7563;
							aStringArray37[anInt7139++] = local7686.aString91;
							local7719 = local7686.method6717();
							anIntArray578[anInt7142++] = local7719.anInt1610;
							aStringArray37[anInt7139++] = local7719.aString13;
							anIntArray578[anInt7142++] = local7686.anInt7561;
							anIntArray578[anInt7142++] = local7686.anInt7570;
							aStringArray37[anInt7139++] = local7686.aString90;
							return;
						}
						anIntArray578[anInt7142++] = -1;
						anIntArray578[anInt7142++] = 0;
						aStringArray37[anInt7139++] = "";
						anIntArray578[anInt7142++] = 0;
						aStringArray37[anInt7139++] = "";
						anIntArray578[anInt7142++] = 0;
						anIntArray578[anInt7142++] = 0;
						aStringArray37[anInt7139++] = "";
						return;
					}
					if (arg0 == 6503) {
						local192 = anIntArray578[--anInt7142];
						local101 = aStringArray37[--anInt7139];
						if (Static283.anInt4574 == 7 && !Static242.method3500() && Static6.anInt95 == 0) {
							anIntArray578[anInt7142++] = Static430.method5817(local192, local101) ? 1 : 0;
							return;
						}
						anIntArray578[anInt7142++] = 0;
						return;
					}
					if (arg0 == 6506) {
						local192 = anIntArray578[--anInt7142];
						@Pc(8053) Class297_Sub1 local8053 = Static615.method8260(local192);
						if (local8053 != null) {
							anIntArray578[anInt7142++] = local8053.anInt7563;
							aStringArray37[anInt7139++] = local8053.aString91;
							@Pc(8077) Class65 local8077 = local8053.method6717();
							anIntArray578[anInt7142++] = local8077.anInt1610;
							aStringArray37[anInt7139++] = local8077.aString13;
							anIntArray578[anInt7142++] = local8053.anInt7561;
							anIntArray578[anInt7142++] = local8053.anInt7570;
							aStringArray37[anInt7139++] = local8053.aString90;
							return;
						}
						anIntArray578[anInt7142++] = -1;
						aStringArray37[anInt7139++] = "";
						anIntArray578[anInt7142++] = 0;
						aStringArray37[anInt7139++] = "";
						anIntArray578[anInt7142++] = 0;
						anIntArray578[anInt7142++] = 0;
						aStringArray37[anInt7139++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt7142 -= 4;
						local192 = anIntArray578[anInt7142];
						local1578 = anIntArray578[anInt7142 + 1] == 1;
						local109 = anIntArray578[anInt7142 + 2];
						local2331 = anIntArray578[anInt7142 + 3] == 1;
						Static210.method3119(local1578, local109, local192, local2331);
						return;
					}
					if (arg0 == 6508) {
						Static152.method9273();
						return;
					}
					if (arg0 == 6509) {
						if (Static283.anInt4574 != 7) {
							return;
						}
						Static60.aBoolean86 = anIntArray578[--anInt7142] == 1;
						return;
					}
					if (arg0 == 6510) {
						anIntArray578[anInt7142++] = Static715.anInt10805;
						return;
					}
				} else if (arg0 >= 6700) {
					if (arg0 < 6800 && Static598.aClass162_5 == Static225.aClass162_1) {
						if (arg0 == 6700) {
							local192 = Static548.aClass28_40.method739();
							if (Static377.anInt5930 != -1) {
								local192++;
							}
							anIntArray578[anInt7142++] = local192;
							return;
						}
						if (arg0 == 6701) {
							local192 = anIntArray578[--anInt7142];
							if (Static377.anInt5930 != -1) {
								if (local192 == 0) {
									anIntArray578[anInt7142++] = Static377.anInt5930;
									return;
								}
								local192--;
							}
							@Pc(8344) Class2_Sub4 local8344 = (Class2_Sub4) Static548.aClass28_40.method736();
							while (local192-- > 0) {
								local8344 = (Class2_Sub4) Static548.aClass28_40.method740();
							}
							anIntArray578[anInt7142++] = local8344.anInt147;
							return;
						}
						if (arg0 == 6702) {
							local192 = anIntArray578[--anInt7142];
							if (Static453.aClass158ArrayArray2[local192] == null) {
								aStringArray37[anInt7139++] = "";
								return;
							}
							local101 = Static453.aClass158ArrayArray2[local192][0].aString40;
							if (local101 == null) {
								aStringArray37[anInt7139++] = "";
								return;
							}
							aStringArray37[anInt7139++] = local101.substring(0, local101.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local192 = anIntArray578[--anInt7142];
							if (Static453.aClass158ArrayArray2[local192] == null) {
								anIntArray578[anInt7142++] = 0;
								return;
							}
							anIntArray578[anInt7142++] = Static453.aClass158ArrayArray2[local192].length;
							return;
						}
						if (arg0 == 6704) {
							anInt7142 -= 2;
							local192 = anIntArray578[anInt7142];
							local834 = anIntArray578[anInt7142 + 1];
							if (Static453.aClass158ArrayArray2[local192] == null) {
								aStringArray37[anInt7139++] = "";
								return;
							}
							local198 = Static453.aClass158ArrayArray2[local192][local834].aString40;
							if (local198 == null) {
								aStringArray37[anInt7139++] = "";
								return;
							}
							aStringArray37[anInt7139++] = local198;
							return;
						}
						if (arg0 == 6705) {
							anInt7142 -= 2;
							local192 = anIntArray578[anInt7142];
							local834 = anIntArray578[anInt7142 + 1];
							if (Static453.aClass158ArrayArray2[local192] == null) {
								anIntArray578[anInt7142++] = 0;
								return;
							}
							anIntArray578[anInt7142++] = Static453.aClass158ArrayArray2[local192][local834].anInt3774;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							anInt7142 -= 3;
							local192 = anIntArray578[anInt7142];
							local834 = anIntArray578[anInt7142 + 1];
							local109 = anIntArray578[anInt7142 + 2];
							Static120.method2193(local192 << 16 | local834, local109, "", 1);
							return;
						}
						if (arg0 == 6708) {
							anInt7142 -= 3;
							local192 = anIntArray578[anInt7142];
							local834 = anIntArray578[anInt7142 + 1];
							local109 = anIntArray578[anInt7142 + 2];
							Static120.method2193(local192 << 16 | local834, local109, "", 2);
							return;
						}
						if (arg0 == 6709) {
							anInt7142 -= 3;
							local192 = anIntArray578[anInt7142];
							local834 = anIntArray578[anInt7142 + 1];
							local109 = anIntArray578[anInt7142 + 2];
							Static120.method2193(local192 << 16 | local834, local109, "", 3);
							return;
						}
						if (arg0 == 6710) {
							anInt7142 -= 3;
							local192 = anIntArray578[anInt7142];
							local834 = anIntArray578[anInt7142 + 1];
							local109 = anIntArray578[anInt7142 + 2];
							Static120.method2193(local192 << 16 | local834, local109, "", 4);
							return;
						}
						if (arg0 == 6711) {
							anInt7142 -= 3;
							local192 = anIntArray578[anInt7142];
							local834 = anIntArray578[anInt7142 + 1];
							local109 = anIntArray578[anInt7142 + 2];
							Static120.method2193(local192 << 16 | local834, local109, "", 5);
							return;
						}
						if (arg0 == 6712) {
							anInt7142 -= 3;
							local192 = anIntArray578[anInt7142];
							local834 = anIntArray578[anInt7142 + 1];
							local109 = anIntArray578[anInt7142 + 2];
							Static120.method2193(local192 << 16 | local834, local109, "", 6);
							return;
						}
						if (arg0 == 6713) {
							anInt7142 -= 3;
							local192 = anIntArray578[anInt7142];
							local834 = anIntArray578[anInt7142 + 1];
							local109 = anIntArray578[anInt7142 + 2];
							Static120.method2193(local192 << 16 | local834, local109, "", 7);
							return;
						}
						if (arg0 == 6714) {
							anInt7142 -= 3;
							local192 = anIntArray578[anInt7142];
							local834 = anIntArray578[anInt7142 + 1];
							local109 = anIntArray578[anInt7142 + 2];
							Static120.method2193(local192 << 16 | local834, local109, "", 8);
							return;
						}
						if (arg0 == 6715) {
							anInt7142 -= 3;
							local192 = anIntArray578[anInt7142];
							local834 = anIntArray578[anInt7142 + 1];
							local109 = anIntArray578[anInt7142 + 2];
							Static120.method2193(local192 << 16 | local834, local109, "", 9);
							return;
						}
						if (arg0 == 6716) {
							anInt7142 -= 3;
							local192 = anIntArray578[anInt7142];
							local834 = anIntArray578[anInt7142 + 1];
							local109 = anIntArray578[anInt7142 + 2];
							Static120.method2193(local192 << 16 | local834, local109, "", 10);
							return;
						}
						if (arg0 == 6717) {
							anInt7142 -= 3;
							local192 = anIntArray578[anInt7142];
							local834 = anIntArray578[anInt7142 + 1];
							local109 = anIntArray578[anInt7142 + 2];
							@Pc(8940) Class158 local8940 = Static15.method186(local109, local192 << 16 | local834);
							Static470.method6384();
							@Pc(8945) Class2_Sub41 local8945 = Static84.method1661(local8940);
							Static389.method5476(local8945.method6216(), local8940, local8945.anInt6904);
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(8975) Class105 local8975;
						if (arg0 == 6800) {
							local192 = anIntArray578[--anInt7142];
							local8975 = Static577.aClass246_4.method5584(local192);
							if (local8975.aString25 == null) {
								aStringArray37[anInt7139++] = "";
								return;
							}
							aStringArray37[anInt7139++] = local8975.aString25;
							return;
						}
						if (arg0 == 6801) {
							local192 = anIntArray578[--anInt7142];
							local8975 = Static577.aClass246_4.method5584(local192);
							anIntArray578[anInt7142++] = local8975.anInt2596;
							return;
						}
						if (arg0 == 6802) {
							local192 = anIntArray578[--anInt7142];
							local8975 = Static577.aClass246_4.method5584(local192);
							anIntArray578[anInt7142++] = local8975.anInt2615;
							return;
						}
						if (arg0 == 6803) {
							local192 = anIntArray578[--anInt7142];
							local8975 = Static577.aClass246_4.method5584(local192);
							anIntArray578[anInt7142++] = local8975.anInt2597;
							return;
						}
						if (arg0 == 6804) {
							anInt7142 -= 2;
							local192 = anIntArray578[anInt7142];
							local834 = anIntArray578[anInt7142 + 1];
							@Pc(9098) Class296 local9098 = Static386.aClass49_2.method1161(local834);
							if (local9098.method6672()) {
								aStringArray37[anInt7139++] = Static577.aClass246_4.method5584(local192).method2426(local834, local9098.aString89);
								return;
							}
							anIntArray578[anInt7142++] = Static577.aClass246_4.method5584(local192).method2427(local9098.anInt7509, local834);
							return;
						}
					} else if (arg0 < 7000) {
						if (arg0 == 6900) {
							anIntArray578[anInt7142++] = Static389.aBoolean459 && !Static34.aBoolean62 ? 1 : 0;
							return;
						}
						if (arg0 == 6901) {
							anIntArray578[anInt7142++] = (int) (Static416.aLong207 / 60000L);
							anIntArray578[anInt7142++] = (int) ((Static416.aLong207 - Static588.method7715() - Static94.aLong70) / 60000L);
							anIntArray578[anInt7142++] = Static425.aBoolean482 ? 1 : 0;
							return;
						}
						if (arg0 == 6902) {
							anIntArray578[anInt7142++] = Static677.anInt10234;
							return;
						}
						if (arg0 == 6903) {
							anIntArray578[anInt7142++] = Static476.anInt7175;
							return;
						}
						if (arg0 == 6904) {
							anIntArray578[anInt7142++] = Static323.anInt5118;
							return;
						}
						if (arg0 == 6905) {
							local95 = "";
							if (Static439.aClass270_4 != null) {
								if (Static439.aClass270_4.anObject13 == null) {
									local95 = Static419.method5756(Static439.aClass270_4.anInt6788);
								} else {
									local95 = (String) Static439.aClass270_4.anObject13;
								}
							}
							aStringArray37[anInt7139++] = local95;
							return;
						}
						if (arg0 == 6906) {
							anIntArray578[anInt7142++] = Static335.anInt5462;
							return;
						}
						if (arg0 == 6907) {
							anIntArray578[anInt7142++] = Static626.anInt9473;
							return;
						}
						if (arg0 == 6908) {
							anIntArray578[anInt7142++] = Static636.anInt9527;
							return;
						}
						if (arg0 == 6909) {
							anIntArray578[anInt7142++] = Static420.aBoolean479 ? 1 : 0;
							return;
						}
						if (arg0 == 6910) {
							anIntArray578[anInt7142++] = Static106.anInt2153;
							return;
						}
						if (arg0 == 6911) {
							anIntArray578[anInt7142++] = Static639.anInt9571;
							return;
						}
						if (arg0 == 6912) {
							anIntArray578[anInt7142++] = Static438.anInt6640;
							return;
						}
						if (arg0 == 6913) {
							anIntArray578[anInt7142++] = Static435.anInt6594;
							return;
						}
						if (arg0 == 6914) {
							anIntArray578[anInt7142++] = Static684.aBoolean775 ? 1 : 0;
							return;
						}
						if (arg0 == 6915) {
							anIntArray578[anInt7142++] = Static134.anInt10326;
							return;
						}
					} else if (arg0 < 7100) {
						if (arg0 == 7000) {
							local192 = Static519.method6831();
							anIntArray578[anInt7142++] = Static165.anInt2810 = Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7915();
							anIntArray578[anInt7142++] = local192;
							Static449.method6116();
							Static666.method8693(1);
							Static503.aBoolean578 = false;
							return;
						}
						if (arg0 == 7001) {
							Static395.method9162();
							Static449.method6116();
							Static666.method8693(1);
							Static503.aBoolean578 = false;
							return;
						}
						if (arg0 == 7002) {
							Static133.method2316();
							Static449.method6116();
							Static666.method8693(1);
							Static503.aBoolean578 = false;
							return;
						}
						if (arg0 == 7003) {
							Static75.method6239();
							Static449.method6116();
							Static666.method8693(1);
							Static503.aBoolean578 = false;
							return;
						}
						if (arg0 == 7004) {
							Static468.method7643();
							Static449.method6116();
							Static666.method8693(1);
							Static503.aBoolean578 = false;
							return;
						}
						if (arg0 == 7005) {
							Static400.aClass2_Sub34_28.method5104(0, Static400.aClass2_Sub34_28.aClass57_Sub15_1);
							Static666.method8693(1);
							Static503.aBoolean578 = false;
							return;
						}
						if (arg0 == 7006) {
							if (Static165.anInt2810 == 2) {
								Static449.aBoolean511 = true;
								return;
							}
							if (Static165.anInt2810 == 1) {
								Static698.aBoolean792 = true;
								return;
							}
							if (Static165.anInt2810 == 3) {
								Static78.aBoolean139 = true;
							}
							return;
						}
						if (arg0 == 7007) {
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub15_1.method5320();
							return;
						}
					} else if (arg0 < 7200) {
						if (arg0 == 7100) {
							anInt7142 -= 2;
							local192 = anIntArray578[anInt7142];
							local834 = anIntArray578[anInt7142 + 1];
							if (local192 != -1) {
								if (local834 > 255) {
									local834 = 255;
								} else if (local834 < 0) {
									local834 = 0;
								}
								Static515.method6802(false, local192, local834);
							}
							return;
						}
						if (arg0 == 7101) {
							local192 = anIntArray578[--anInt7142];
							if (local192 != -1) {
								Static121.method2199(local192);
							}
							return;
						}
						if (arg0 == 7102) {
							local192 = anIntArray578[--anInt7142];
							if (local192 != -1) {
								Static695.method9267(local192);
							}
							return;
						}
						if (arg0 == 7103) {
							anIntArray578[anInt7142++] = Static183.method2796("jagtheora") ? 1 : 0;
							return;
						}
					} else if (arg0 < 7300) {
						if (arg0 == 7201) {
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub6_1.method2715() ? 1 : 0;
							return;
						}
						if (arg0 == 7202) {
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub7_1.method2906() ? 1 : 0;
							return;
						}
						if (arg0 == 7203) {
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub12_1.method4360() ? 1 : 0;
							return;
						}
						if (arg0 == 7204) {
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub26_1.method7464() ? 1 : 0;
							return;
						}
						if (arg0 == 7205) {
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub13_2.method4372() && Static163.aClass19_17.method8015() ? 1 : 0;
							return;
						}
						if (arg0 == 7206) {
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub28_1.method7837() ? 1 : 0;
							return;
						}
						if (arg0 == 7207) {
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub5_1.method2173() ? 1 : 0;
							return;
						}
						if (arg0 == 7208) {
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub20_1.method6107() && Static163.aClass19_17.method7936() ? 1 : 0;
							return;
						}
						if (arg0 == 7209) {
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub23_1.method7053() ? 1 : 0;
							return;
						}
						if (arg0 == 7210) {
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub30_1.method8355() ? 1 : 0;
							return;
						}
						if (arg0 == 7211) {
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub18_1.method5768() ? 1 : 0;
							return;
						}
						if (arg0 == 7212) {
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub16_1.method5504() ? 1 : 0;
							return;
						}
						if (arg0 == 7213) {
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub3_1.method2117() ? 1 : 0;
							return;
						}
						if (arg0 == 7214) {
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub29_2.method7917() ? 1 : 0;
							return;
						}
						if (arg0 == 7215) {
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub2_1.method1985() ? 1 : 0;
							return;
						}
					} else if (arg0 < 7400) {
						if (arg0 == 7301) {
							local192 = anIntArray578[--anInt7142];
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub6_1.method8352(local192);
							return;
						}
						if (arg0 == 7302) {
							local192 = anIntArray578[--anInt7142];
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub7_1.method8352(local192);
							return;
						}
						if (arg0 == 7303) {
							local192 = anIntArray578[--anInt7142];
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub12_1.method8352(local192);
							return;
						}
						if (arg0 == 7304) {
							local192 = anIntArray578[--anInt7142];
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub26_1.method8352(local192);
							return;
						}
						if (arg0 == 7305) {
							local192 = anIntArray578[--anInt7142];
							if (!Static163.aClass19_17.method8015()) {
								anIntArray578[anInt7142++] = 3;
								return;
							}
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub13_2.method8352(local192);
							return;
						}
						if (arg0 == 7306) {
							local192 = anIntArray578[--anInt7142];
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub28_1.method8352(local192);
							return;
						}
						if (arg0 == 7307) {
							local192 = anIntArray578[--anInt7142];
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub5_1.method8352(local192);
							return;
						}
						if (arg0 == 7308) {
							local192 = anIntArray578[--anInt7142];
							if (!Static163.aClass19_17.method7936()) {
								anIntArray578[anInt7142++] = 3;
								return;
							}
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub20_1.method8352(local192);
							return;
						}
						if (arg0 == 7309) {
							local192 = anIntArray578[--anInt7142];
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub23_1.method8352(local192);
							return;
						}
						if (arg0 == 7310) {
							local192 = anIntArray578[--anInt7142];
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub30_1.method8352(local192);
							return;
						}
						if (arg0 == 7311) {
							local192 = anIntArray578[--anInt7142];
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub18_1.method8352(local192);
							return;
						}
						if (arg0 == 7312) {
							local192 = anIntArray578[--anInt7142];
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub16_1.method8352(local192);
							return;
						}
						if (arg0 == 7313) {
							local192 = anIntArray578[--anInt7142];
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub3_1.method8352(local192);
							return;
						}
						if (arg0 == 7314) {
							local192 = anIntArray578[--anInt7142];
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub29_2.method8352(local192);
							return;
						}
						if (arg0 == 7315) {
							local192 = anIntArray578[--anInt7142];
							anIntArray578[anInt7142++] = Static400.aClass2_Sub34_28.aClass57_Sub2_1.method8352(local192);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!pd;I)V")
	private static void method6422(@OriginalArg(0) Class2_Sub42 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray36;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub2_Sub10 local12 = Static488.method6525(local8);
		if (local12 == null) {
			return;
		}
		anIntArray580 = new int[local12.anInt2948];
		@Pc(22) int local22 = 0;
		aStringArray36 = new String[local12.anInt2950];
		@Pc(28) int local28 = 0;
		aLongArray15 = new long[local12.anInt2949];
		@Pc(34) int local34 = 0;
		for (@Pc(36) int local36 = 1; local36 < local2.length; local36++) {
			if (local2[local36] instanceof Integer) {
				@Pc(48) int local48 = (Integer) local2[local36];
				if (local48 == -2147483647) {
					local48 = arg0.anInt7218;
				}
				if (local48 == -2147483646) {
					local48 = arg0.anInt7214;
				}
				if (local48 == -2147483645) {
					local48 = arg0.aClass158_14 == null ? -1 : arg0.aClass158_14.anInt3812;
				}
				if (local48 == -2147483644) {
					local48 = arg0.anInt7219;
				}
				if (local48 == -2147483643) {
					local48 = arg0.aClass158_14 == null ? -1 : arg0.aClass158_14.anInt3741;
				}
				if (local48 == -2147483642) {
					local48 = arg0.aClass158_13 == null ? -1 : arg0.aClass158_13.anInt3812;
				}
				if (local48 == -2147483641) {
					local48 = arg0.aClass158_13 == null ? -1 : arg0.aClass158_13.anInt3741;
				}
				if (local48 == -2147483640) {
					local48 = arg0.anInt7216;
				}
				if (local48 == -2147483639) {
					local48 = arg0.anInt7221;
				}
				anIntArray580[local22++] = local48;
			} else if (local2[local36] instanceof String) {
				@Pc(154) String local154 = (String) local2[local36];
				if (local154.equals("event_opbase")) {
					local154 = arg0.aString84;
				}
				aStringArray36[local28++] = local154;
			} else if (local2[local36] instanceof Long) {
				@Pc(180) long local180 = (Long) local2[local36];
				aLongArray15[local34++] = local180;
			}
		}
		anInt7153 = arg0.anInt7220;
		method6419(local12, arg1);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(C)I")
	private static int method6423(@OriginalArg(0) char arg0) {
		return Static604.method7905(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "(I)Ljava/lang/String;")
	private static String method6425(@OriginalArg(0) int arg0) {
		@Pc(9) String local9 = aClass164_7.method3484(Static392.aClass377_4.anInt9720 << 16 | arg0);
		return local9 == null ? "" : local9;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method6426(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static608.anInt9290 == 0 && (Static389.aBoolean459 && !Static34.aBoolean62 || Static617.aBoolean724)) {
			return;
		}
		@Pc(18) String local18 = arg0.toLowerCase();
		@Pc(20) byte local20 = 0;
		if (local18.startsWith(Static32.aClass32_47.method877(0))) {
			local20 = 0;
			arg0 = arg0.substring(Static32.aClass32_47.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_48.method877(0))) {
			local20 = 1;
			arg0 = arg0.substring(Static32.aClass32_48.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_49.method877(0))) {
			local20 = 2;
			arg0 = arg0.substring(Static32.aClass32_49.method877(0).length());
		} else if (local18.startsWith(Class32.lb.method877(0))) {
			local20 = 3;
			arg0 = arg0.substring(Class32.lb.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_50.method877(0))) {
			local20 = 4;
			arg0 = arg0.substring(Static32.aClass32_50.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_51.method877(0))) {
			local20 = 5;
			arg0 = arg0.substring(Static32.aClass32_51.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_52.method877(0))) {
			local20 = 6;
			arg0 = arg0.substring(Static32.aClass32_52.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_53.method877(0))) {
			local20 = 7;
			arg0 = arg0.substring(Static32.aClass32_53.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_54.method877(0))) {
			local20 = 8;
			arg0 = arg0.substring(Static32.aClass32_54.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_55.method877(0))) {
			local20 = 9;
			arg0 = arg0.substring(Static32.aClass32_55.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_56.method877(0))) {
			local20 = 10;
			arg0 = arg0.substring(Static32.aClass32_56.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_57.method877(0))) {
			local20 = 11;
			arg0 = arg0.substring(Static32.aClass32_57.method877(0).length());
		} else if (Static51.anInt1052 != 0) {
			if (local18.startsWith(Static32.aClass32_47.method877(Static51.anInt1052))) {
				local20 = 0;
				arg0 = arg0.substring(Static32.aClass32_47.method877(Static51.anInt1052).length());
			} else if (local18.startsWith(Static32.aClass32_48.method877(Static51.anInt1052))) {
				local20 = 1;
				arg0 = arg0.substring(Static32.aClass32_48.method877(Static51.anInt1052).length());
			} else if (local18.startsWith(Static32.aClass32_49.method877(Static51.anInt1052))) {
				local20 = 2;
				arg0 = arg0.substring(Static32.aClass32_49.method877(Static51.anInt1052).length());
			} else if (local18.startsWith(Class32.lb.method877(Static51.anInt1052))) {
				local20 = 3;
				arg0 = arg0.substring(Class32.lb.method877(Static51.anInt1052).length());
			} else if (local18.startsWith(Static32.aClass32_50.method877(Static51.anInt1052))) {
				local20 = 4;
				arg0 = arg0.substring(Static32.aClass32_50.method877(Static51.anInt1052).length());
			} else if (local18.startsWith(Static32.aClass32_51.method877(Static51.anInt1052))) {
				local20 = 5;
				arg0 = arg0.substring(Static32.aClass32_51.method877(Static51.anInt1052).length());
			} else if (local18.startsWith(Static32.aClass32_52.method877(Static51.anInt1052))) {
				local20 = 6;
				arg0 = arg0.substring(Static32.aClass32_52.method877(Static51.anInt1052).length());
			} else if (local18.startsWith(Static32.aClass32_53.method877(Static51.anInt1052))) {
				local20 = 7;
				arg0 = arg0.substring(Static32.aClass32_53.method877(Static51.anInt1052).length());
			} else if (local18.startsWith(Static32.aClass32_54.method877(Static51.anInt1052))) {
				local20 = 8;
				arg0 = arg0.substring(Static32.aClass32_54.method877(Static51.anInt1052).length());
			} else if (local18.startsWith(Static32.aClass32_55.method877(Static51.anInt1052))) {
				local20 = 9;
				arg0 = arg0.substring(Static32.aClass32_55.method877(Static51.anInt1052).length());
			} else if (local18.startsWith(Static32.aClass32_56.method877(Static51.anInt1052))) {
				local20 = 10;
				arg0 = arg0.substring(Static32.aClass32_56.method877(Static51.anInt1052).length());
			} else if (local18.startsWith(Static32.aClass32_57.method877(Static51.anInt1052))) {
				local20 = 11;
				arg0 = arg0.substring(Static32.aClass32_57.method877(Static51.anInt1052).length());
			}
		}
		local18 = arg0.toLowerCase();
		@Pc(460) byte local460 = 0;
		if (local18.startsWith(Static32.aClass32_58.method877(0))) {
			local460 = 1;
			arg0 = arg0.substring(Static32.aClass32_58.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_59.method877(0))) {
			local460 = 2;
			arg0 = arg0.substring(Static32.aClass32_59.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_60.method877(0))) {
			local460 = 3;
			arg0 = arg0.substring(Static32.aClass32_60.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_61.method877(0))) {
			local460 = 4;
			arg0 = arg0.substring(Static32.aClass32_61.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_62.method877(0))) {
			local460 = 5;
			arg0 = arg0.substring(Static32.aClass32_62.method877(0).length());
		} else if (Static51.anInt1052 != 0) {
			if (local18.startsWith(Static32.aClass32_58.method877(Static51.anInt1052))) {
				local460 = 1;
				arg0 = arg0.substring(Static32.aClass32_58.method877(Static51.anInt1052).length());
			} else if (local18.startsWith(Static32.aClass32_59.method877(Static51.anInt1052))) {
				local460 = 2;
				arg0 = arg0.substring(Static32.aClass32_59.method877(Static51.anInt1052).length());
			} else if (local18.startsWith(Static32.aClass32_60.method877(Static51.anInt1052))) {
				local460 = 3;
				arg0 = arg0.substring(Static32.aClass32_60.method877(Static51.anInt1052).length());
			} else if (local18.startsWith(Static32.aClass32_61.method877(Static51.anInt1052))) {
				local460 = 4;
				arg0 = arg0.substring(Static32.aClass32_61.method877(Static51.anInt1052).length());
			} else if (local18.startsWith(Static32.aClass32_62.method877(Static51.anInt1052))) {
				local460 = 5;
				arg0 = arg0.substring(Static32.aClass32_62.method877(Static51.anInt1052).length());
			}
		}
		@Pc(650) Class153 local650 = Static668.method8701();
		@Pc(656) Class2_Sub19 local656 = Static293.method4335(Static278.aClass345_57, local650.aIsaacRandom_1);
		local656.aPacketBit_1.p1(0);
		@Pc(665) int local665 = local656.aPacketBit_1.pos;
		local656.aPacketBit_1.p1(local20);
		local656.aPacketBit_1.p1(local460);
		Static523.method3446(local656.aPacketBit_1, arg0);
		local656.aPacketBit_1.psize1(local656.aPacketBit_1.pos - local665);
		local650.method3275(local656);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method6427(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub2_Sub10 local5 = Static537.method7189(Static42.aClass242_4, arg0, -1);
		if (local5 == null) {
			return;
		}
		anIntArray580 = new int[local5.anInt2948];
		aStringArray36 = new String[local5.anInt2950];
		aStringArray36[0] = arg1;
		anIntArray580[0] = arg2;
		method6419(local5, 200000);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "()V")
	public static void method6428() {
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!mia;II)V")
	public static void method6429(@OriginalArg(0) Class242 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub2_Sub10 local5 = Static537.method7189(arg0, arg1, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray580 = new int[local5.anInt2948];
		aStringArray36 = new String[local5.anInt2950];
		if (local5.aClass242_5 == Static5.aClass242_1 || local5.aClass242_5 == Static639.aClass242_13 || local5.aClass242_5 == Static280.aClass242_7) {
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = 0;
			if (Static210.aClass158_4 != null) {
				local35 = Static210.aClass158_4.anInt3735;
				local37 = Static210.aClass158_4.anInt3784;
			}
			anIntArray580[0] = Static189.aClass120_1.method8853() - local35;
			anIntArray580[1] = Static189.aClass120_1.method8854() - local37;
		}
		method6419(local5, 200000);
	}
}
