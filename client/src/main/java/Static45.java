import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "Z")
	public static boolean aBoolean96;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
	public static int anInt1471 = 0;

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Ljava/lang/String;")
	public static final String aString53 = "cyan:";

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
	public static void method1275(@OriginalArg(1) int arg0) {
		Static151.anInt3698 = arg0;
		@Pc(16) Class215 local16 = Static104.aClass215_41;
		synchronized (Static104.aClass215_41) {
			Static104.aClass215_41.method6060();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method1277(@OriginalArg(0) int arg0) {
		@Pc(13) String local13 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local13.length() - 3; local18 > 0; local18 -= 3) {
			local13 = local13.substring(0, local18) + "," + local13.substring(local18);
		}
		if (local13.length() > 9) {
			return " <col=00ff80>" + local13.substring(0, local13.length() - 8) + Static68.aString69 + " (" + local13 + ")</col>";
		} else if (local13.length() > 6) {
			return " <col=ffffff>" + local13.substring(0, local13.length() - 4) + Static105.aString99 + " (" + local13 + ")</col>";
		} else {
			return " <col=ffff00>" + local13 + "</col>";
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method1278() {
		if (Static1.method54() != 2) {
			return;
		}
		@Pc(17) byte local17 = (byte) (Static135.anInt7217 - 4 & 0xFF);
		@Pc(21) int local21 = Static135.anInt7217 % Static25.anInt850;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			for (@Pc(27) int local27 = 0; local27 < Static219.anInt4987; local27++) {
				Static233.aByteArrayArrayArray13[local23][local21][local27] = local17;
			}
		}
		if (Static39.anInt1215 == 3) {
			return;
		}
		for (@Pc(59) int local59 = 0; local59 < 2; local59++) {
			Static77.anIntArray135[local59] = -1000000;
			Static245.anIntArray228[local59] = 1000000;
			Static249.anIntArray399[local59] = 0;
			Static205.anIntArray358[local59] = 1000000;
			Static73.anIntArray129[local59] = 0;
		}
		@Pc(129) int local129;
		if (Static303.anInt6342 != 1) {
			local129 = Static309.method5429(Static88.anInt2339, Static3.anInt92, Static39.anInt1215);
			if (local129 - Static138.anInt3429 >= 800 || (Static62.aByteArrayArrayArray3[Static39.anInt1215][Static3.anInt92 >> 7][Static88.anInt2339 >> 7] & 0x4) == 0) {
				return;
			}
			Static347.method5870(1, false, Static241.aClass154ArrayArrayArray2, Static88.anInt2339 >> 7, Static3.anInt92 >> 7);
			return;
		}
		if ((Static62.aByteArrayArrayArray3[Static39.anInt1215][Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027 >> 7][Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032 >> 7] & 0x4) != 0) {
			Static347.method5870(0, false, Static241.aClass154ArrayArrayArray2, Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032 >> 7, Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027 >> 7);
		}
		if (Static130.anInt6778 >= 2560) {
			return;
		}
		local129 = Static3.anInt92 >> 7;
		@Pc(133) int local133 = Static88.anInt2339 >> 7;
		@Pc(138) int local138 = Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027 >> 7;
		@Pc(143) int local143 = Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032 >> 7;
		@Pc(155) int local155;
		if (local129 >= local138) {
			local155 = local129 - local138;
		} else {
			local155 = local138 - local129;
		}
		@Pc(174) int local174;
		if (local133 < local143) {
			local174 = local143 - local133;
		} else {
			local174 = local133 - local143;
		}
		if ((local155 != 0 || local174 != 0) && local155 > (-Static25.anInt850) && local155 < Static25.anInt850 && local174 > -Static219.anInt4987 && local174 < Static219.anInt4987) {
			@Pc(258) int local258;
			@Pc(260) int local260;
			if (local155 <= local174) {
				local258 = local155 * 65536 / local174;
				local260 = 32768;
				while (local133 != local143) {
					if (local143 > local133) {
						local133++;
					} else if (local133 > local143) {
						local133--;
					}
					if ((Static62.aByteArrayArrayArray3[Static39.anInt1215][local129][local133] & 0x4) != 0) {
						Static347.method5870(1, false, Static241.aClass154ArrayArrayArray2, local133, local129);
						return;
					}
					local260 += local258;
					if (local260 >= 65536) {
						local260 -= 65536;
						if (local129 < local138) {
							local129++;
						} else if (local138 < local129) {
							local129--;
						}
						if ((Static62.aByteArrayArrayArray3[Static39.anInt1215][local129][local133] & 0x4) != 0) {
							Static347.method5870(1, false, Static241.aClass154ArrayArrayArray2, local133, local129);
							return;
						}
					}
				}
				return;
			}
			local258 = local174 * 65536 / local155;
			local260 = 32768;
			while (local129 != local138) {
				if (local129 < local138) {
					local129++;
				} else if (local138 < local129) {
					local129--;
				}
				if ((Static62.aByteArrayArrayArray3[Static39.anInt1215][local129][local133] & 0x4) != 0) {
					Static347.method5870(1, false, Static241.aClass154ArrayArrayArray2, local133, local129);
					return;
				}
				local260 += local258;
				if (local260 >= 65536) {
					local260 -= 65536;
					if (local133 < local143) {
						local133++;
					} else if (local133 > local143) {
						local133--;
					}
					if ((Static62.aByteArrayArrayArray3[Static39.anInt1215][local129][local133] & 0x4) != 0) {
						Static347.method5870(1, false, Static241.aClass154ArrayArrayArray2, local133, local129);
						return;
					}
				}
			}
			return;
		}
		Static58.method1402("RC: " + local129 + "," + local133 + " " + local138 + "," + local143 + " " + Static149.anInt3667 + "," + Static96.anInt2446, null);
		return;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)V")
	public static void method1279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class1_Sub14 local14 = (Class1_Sub14) Static143.aClass183_13.method5053((long) arg1);
		if (local14 == null) {
			local14 = new Class1_Sub14();
			Static143.aClass183_13.method5055((long) arg1, local14);
		}
		if (local14.anIntArray224.length <= arg2) {
			@Pc(45) int[] local45 = new int[arg2 + 1];
			@Pc(50) int[] local50 = new int[arg2 + 1];
			for (@Pc(52) int local52 = 0; local52 < local14.anIntArray224.length; local52++) {
				local45[local52] = local14.anIntArray224[local52];
				local50[local52] = local14.anIntArray226[local52];
			}
			for (@Pc(82) int local82 = local14.anIntArray224.length; local82 < arg2; local82++) {
				local45[local82] = -1;
				local50[local82] = 0;
			}
			local14.anIntArray226 = local50;
			local14.anIntArray224 = local45;
		}
		local14.anIntArray224[arg2] = arg3;
		local14.anIntArray226[arg2] = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIII)I")
	public static int method1280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg5 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(12) int local12 = arg2;
			arg2 = arg1;
			arg1 = local12;
		}
		if (local3 == 0) {
			return arg4;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 7 + 1 - arg4 - arg2;
		} else {
			return 7 + 1 - arg0 - arg1;
		}
	}
}
