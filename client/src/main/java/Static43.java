import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!db", name = "d", descriptor = "[I")
	public static final int[] anIntArray92 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString52 = "Take";

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Lclient!ro;")
	public static Class177 aClass177_2 = null;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "I")
	public static int anInt1459 = 0;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!db", name = "C", descriptor = "I")
	public static int anInt1466 = 0;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "Lclient!we;")
	public static final Class215 aClass215_20 = new Class215(4);

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method1261() {
		@Pc(12) int[] local12 = new int[Static124.anInt3120];
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static124.anInt3120; local16++) {
			@Pc(22) Class36 local22 = Static165.method3446(local16);
			if (local22.anInt1257 >= 0 || local22.anInt1235 >= 0) {
				local12[local14++] = local16;
			}
		}
		Static218.anIntArray365 = new int[local14];
		for (@Pc(46) int local46 = 0; local46 < local14; local46++) {
			Static218.anIntArray365[local46] = local12[local46];
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	public static void method1262() {
		@Pc(5) Class215 local5 = Static84.aClass215_35;
		synchronized (Static84.aClass215_35) {
			Static84.aClass215_35.method6052();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
	public static void method1264(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1_Sub10 local8 = Static122.method2624(9, arg0);
		local8.method2536();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIZIZI)V")
	public static void method1265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg3) {
			Static236.method4501();
		}
		if (Static112.aFrame1 != null && (arg2 != 3 || Static144.anInt3575 != arg0 || arg4 != Static17.anInt652)) {
			Static36.method876(Static184.aClass199_12, Static112.aFrame1);
			Static112.aFrame1 = null;
		}
		if (arg2 == 3 && Static112.aFrame1 == null) {
			Static112.aFrame1 = Static203.method694(arg0, arg4, Static184.aClass199_12, 0);
			if (Static112.aFrame1 != null) {
				Static17.anInt652 = arg4;
				Static144.anInt3575 = arg0;
				Static263.method4776(Static184.aClass199_12);
			}
		}
		if (arg2 == 3 && Static112.aFrame1 == null) {
			method1265(-1, arg1, Static146.anInt3619, true, -1);
			return;
		}
		@Pc(67) Container local67;
		@Pc(89) Insets local89;
		if (Static112.aFrame1 != null) {
			Static264.anInt5603 = arg0;
			local67 = Static112.aFrame1;
			Static222.anInt5038 = arg4;
		} else if (Static252.aFrame2 == null) {
			local67 = Static184.aClass199_12.anApplet1;
			Static264.anInt5603 = local67.getSize().width;
			Static222.anInt5038 = local67.getSize().height;
		} else {
			local89 = Static252.aFrame2.getInsets();
			@Pc(97) int local97 = local89.right + local89.left;
			Static264.anInt5603 = Static252.aFrame2.getSize().width - local97;
			Static222.anInt5038 = Static252.aFrame2.getSize().height - local89.top - local89.bottom;
			local67 = Static252.aFrame2;
		}
		@Pc(133) int local133;
		if (arg2 == 1) {
			Static107.anInt2674 = 765;
			Static350.anInt7318 = 503;
			Static108.anInt2685 = (Static264.anInt5603 - 765) / 2;
			Static88.anInt2337 = 0;
		} else if (Static207.anInt4798 < 96 && Static130.anInt6754 == 0) {
			local133 = Static264.anInt5603 > 1024 ? 1024 : Static264.anInt5603;
			@Pc(140) int local140 = Static222.anInt5038 <= 768 ? Static222.anInt5038 : 768;
			Static107.anInt2674 = local133;
			Static108.anInt2685 = (Static264.anInt5603 - local133) / 2;
			Static88.anInt2337 = 0;
			Static350.anInt7318 = local140;
		} else {
			Static108.anInt2685 = 0;
			Static107.anInt2674 = Static264.anInt5603;
			Static350.anInt7318 = Static222.anInt5038;
			Static88.anInt2337 = 0;
		}
		if (Static312.anInt6002 != 0) {
			@Pc(193) boolean local193;
			if (Static107.anInt2674 < 1024 && Static350.anInt7318 < 768) {
				local193 = true;
			} else {
				local193 = false;
			}
		}
		if (arg3) {
			Static338.method6024(Static130.anInt6754);
		} else {
			Static86.aCanvas2.setSize(Static107.anInt2674, Static350.anInt7318);
			if (Static221.aClass40_6 != null) {
				Static221.aClass40_6.method2765();
			}
			if (Static252.aFrame2 == local67) {
				local89 = Static252.aFrame2.getInsets();
				Static86.aCanvas2.setLocation(Static108.anInt2685 + local89.left, Static88.anInt2337 + local89.top);
			} else {
				Static86.aCanvas2.setLocation(Static108.anInt2685, Static88.anInt2337);
			}
		}
		if (arg2 >= 2) {
			Static137.aBoolean238 = true;
		} else {
			Static137.aBoolean238 = false;
		}
		if (Static295.anInt6177 != -1) {
			Static53.method1384(true);
		}
		if (Static31.aClass42_1 != null && (Static214.anInt4865 == 30 || Static214.anInt4865 == 25)) {
			Static112.method2382();
		}
		for (local133 = 0; local133 < 100; local133++) {
			Static230.aBooleanArray16[local133] = true;
		}
		Static243.aBoolean376 = true;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(II)I")
	public static int method1266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static350.anIntArrayArray58 == null ? 0 : Static350.anIntArrayArray58[arg0][arg1] >>> 21 & 0x7F8;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIILclient!qj;)Lclient!as;")
	public static Class1_Sub1_Sub3 method1272(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class162 arg2) {
		@Pc(14) Class1_Sub16 local14 = new Class1_Sub16(arg2.method4636(arg0, arg1));
		@Pc(48) Class1_Sub1_Sub3 local48 = new Class1_Sub1_Sub3(arg0, local14.method5776(), local14.method5776(), local14.method5730(), local14.method5730(), local14.method5761() == 1, local14.method5761());
		@Pc(52) int local52 = local14.method5761();
		for (@Pc(54) int local54 = 0; local54 < local52; local54++) {
			local48.aClass130_2.method3760(new Class1_Sub7(local14.method5761(), local14.method5749(), local14.method5749(), local14.method5749(), local14.method5749(), local14.method5749(), local14.method5749(), local14.method5749(), local14.method5749()));
		}
		local48.method414();
		return local48;
	}
}
