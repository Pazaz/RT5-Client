import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "Lclient!jb;")
	public static Class96 aClass96_1;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "[I")
	public static final int[] anIntArray104 = new int[1000];

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "Z")
	public static boolean aBoolean117 = false;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BII)I")
	public static int method1399(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(41) int local41 = (arg0 & 0x7F) * 96 >> 7;
			if (local41 < 2) {
				local41 = 2;
			} else if (local41 > 126) {
				local41 = 126;
			}
			return local41 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IZIII)Z")
	public static boolean method1400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static62.aByteArrayArrayArray3[0][arg0][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static62.aByteArrayArrayArray3[arg2][arg0][arg1] & 0x10) == 0) {
			return Static61.method1432(arg0, arg1, arg2) == arg3;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILclient!qj;ZLclient!qj;)V")
	public static void method1401(@OriginalArg(1) Class162 arg0, @OriginalArg(3) Class162 arg1) {
		Static78.aBoolean142 = true;
		Static280.aClass162_206 = arg1;
		Static123.aClass162_111 = arg0;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method1402(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static16.method452(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static275.method2314(local7);
			local7 = Static342.method6043(local7, ":", "%3a");
			local7 = Static342.method6043(local7, "@", "%40");
			local7 = Static342.method6043(local7, "&", "%26");
			local7 = Static342.method6043(local7, "#", "%23");
			if (Static122.aClass199_7.anApplet1 != null) {
				@Pc(101) Class145 local101 = Static122.aClass199_7.method5466(new URL(Static122.aClass199_7.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static200.anInt4584 + "&u=" + Static274.aLong179 + "&v1=" + Static313.aString243 + "&v2=" + Static313.aString249 + "&e=" + local7));
				while (local101.anInt5065 == 0) {
					Static295.method5212(1L);
				}
				if (local101.anInt5065 == 1) {
					@Pc(120) DataInputStream local120 = (DataInputStream) local101.anObject6;
					local120.read();
					local120.close();
				}
			}
		} catch (@Pc(127) Exception local127) {
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIII)V")
	public static void method1403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(38) int local38 = local13 * (1 - local29) + local21;
		@Pc(46) int local46 = local17 - (local29 - 1) * local25;
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(62) int local62 = local21 * 3;
		@Pc(70) int local70 = local25 * ((arg1 << 1) - 3);
		@Pc(84) int local84 = local54;
		@Pc(102) int local102;
		@Pc(111) int local111;
		if (arg3 >= Static180.anInt4240 && Static197.anInt4520 >= arg3) {
			local102 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg4 + arg2);
			local111 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg4 - arg2);
			Static12.method349(local102, Static87.anIntArrayArray9[arg3], arg0, local111);
		}
		@Pc(127) int local127 = (arg1 - 1) * local50;
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local46 += local84;
					local38 += local62;
					local84 += local54;
					local7++;
					local62 += local54;
				}
			}
			if (local46 < 0) {
				local38 += local62;
				local46 += local84;
				local7++;
				local84 += local54;
				local62 += local54;
			}
			local38 += -local127;
			local46 += -local70;
			local9--;
			local70 -= local50;
			local127 -= local50;
			local102 = arg3 - local9;
			local111 = arg3 + local9;
			if (local111 >= Static180.anInt4240 && local102 <= Static197.anInt4520) {
				@Pc(225) int local225 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg4 + local7);
				@Pc(234) int local234 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg4 - local7);
				if (Static180.anInt4240 <= local102) {
					Static12.method349(local225, Static87.anIntArrayArray9[local102], arg0, local234);
				}
				if (local111 <= Static197.anInt4520) {
					Static12.method349(local225, Static87.anIntArrayArray9[local111], arg0, local234);
				}
			}
		}
	}
}
