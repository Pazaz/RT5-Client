import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
	public static int anInt4232;

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
	public static int anInt4229 = 100;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIIZLclient!qj;)V")
	public static void method3629(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) Class162 arg2) {
		Static221.anInt5014 = arg1;
		Static135.aBoolean514 = false;
		Static176.anInt4160 = 0;
		Static288.anInt6077 = 10000;
		Static220.anInt4995 = arg0;
		Static344.anInt7239 = 1;
		Static254.aClass162_195 = arg2;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIII)V")
	public static void method3630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static150.aClass1_Sub16_Sub2_2.anInt6813 = 0;
		Static150.aClass1_Sub16_Sub2_2.method5771(20);
		Static150.aClass1_Sub16_Sub2_2.method5771(arg1);
		Static150.aClass1_Sub16_Sub2_2.method5771(arg3);
		Static150.aClass1_Sub16_Sub2_2.method5757(arg2);
		Static150.aClass1_Sub16_Sub2_2.method5757(arg0);
		Static45.anInt1471 = 0;
		Static155.anInt3855 = 0;
		Static277.anInt5863 = 1;
		Static152.anInt3743 = -3;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)V")
	public static void method3631() {
		Static27.aClass183_3.method5051();
		Static44.aClass179_2.method4929();
		Static165.aClass179_4.method4929();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method3632(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(37) StringBuffer local37 = new StringBuffer(local8 + local10);
		for (@Pc(39) int local39 = 0; local39 < local8; local39++) {
			@Pc(45) char local45 = arg0.charAt(local39);
			if (local45 == '<') {
				local37.append("<lt>");
			} else if (local45 == '>') {
				local37.append("<gt>");
			} else {
				local37.append(local45);
			}
		}
		return local37.toString();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLclient!mb;)V")
	public static void method3633(@OriginalArg(1) Class1_Sub22 arg0) {
		if (!Static204.aBoolean329) {
			arg0.method6172();
			Static237.anInt5285--;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)I")
	public static int method3634(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub14 local15 = (Class1_Sub14) Static143.aClass183_13.method5053((long) arg1);
		if (local15 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local15.anIntArray224.length) {
			return local15.anIntArray224[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(Z)V")
	public static void method3635() {
		Static133.method3026(Static226.anInt5071);
		@Pc(16) int local16 = (Static3.anInt92 >> 10) + (Static149.anInt3667 >> 3);
		@Pc(24) int local24 = (Static88.anInt2339 >> 10) + (Static96.anInt2446 >> 3);
		Static139.aByteArrayArray26 = new byte[18][];
		Static93.aByteArrayArray22 = new byte[18][];
		Static171.aByteArrayArray36 = new byte[18][];
		Static340.aByteArrayArray57 = new byte[18][];
		Static264.anIntArray414 = new int[18];
		Static102.anIntArray163 = new int[18];
		Static32.aByteArrayArray56 = new byte[18][];
		Static112.anIntArray204 = new int[18];
		Static114.anIntArray483 = new int[18];
		Static80.anIntArrayArray8 = new int[18][4];
		Static49.anIntArray98 = new int[18];
		Static304.anIntArray487 = new int[18];
		@Pc(71) int local71 = 0;
		@Pc(91) int local91;
		for (@Pc(80) int local80 = (local16 - (Static25.anInt850 >> 4)) / 8; local80 <= ((Static25.anInt850 >> 4) + local16) / 8; local80++) {
			for (local91 = (local24 - (Static219.anInt4987 >> 4)) / 8; local91 <= ((Static219.anInt4987 >> 4) + local24) / 8; local91++) {
				@Pc(99) int local99 = local91 + (local80 << 8);
				Static112.anIntArray204[local71] = local99;
				Static264.anIntArray414[local71] = Static50.aClass162_56.method4631("m" + local80 + "_" + local91);
				Static114.anIntArray483[local71] = Static50.aClass162_56.method4631("l" + local80 + "_" + local91);
				Static304.anIntArray487[local71] = Static50.aClass162_56.method4631("n" + local80 + "_" + local91);
				Static49.anIntArray98[local71] = Static50.aClass162_56.method4631("um" + local80 + "_" + local91);
				Static102.anIntArray163[local71] = Static50.aClass162_56.method4631("ul" + local80 + "_" + local91);
				if (Static304.anIntArray487[local71] == -1) {
					Static264.anIntArray414[local71] = -1;
					Static114.anIntArray483[local71] = -1;
					Static49.anIntArray98[local71] = -1;
					Static102.anIntArray163[local71] = -1;
				}
				local71++;
			}
		}
		for (local91 = local71; local91 < Static304.anIntArray487.length; local91++) {
			Static304.anIntArray487[local91] = -1;
			Static264.anIntArray414[local91] = -1;
			Static114.anIntArray483[local91] = -1;
			Static49.anIntArray98[local91] = -1;
			Static102.anIntArray163[local91] = -1;
		}
		Static191.method3801(true, local24, false, local16, 8, 0, 8);
	}
}
