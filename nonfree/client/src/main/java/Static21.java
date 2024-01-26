import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!am", name = "Xb", descriptor = "Ljava/lang/Class;")
	private static Class aClass23;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method8043(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static665.aClass19_15 = arg0;
		Static32.anInt772 = arg1;
		Static661.aBoolean457 = Static32.anInt772 > 1 && Static665.aClass19_15.method7979();
		Static52.anInt1066 = 9;
		Static340.anInt5586 = 0x1 << Static52.anInt1066;
		Static247.anInt3993 = Static340.anInt5586 >> 1;
		Math.sqrt((double) (Static247.anInt3993 * Static247.anInt3993 + Static247.anInt3993 * Static247.anInt3993));
		Static299.anInt4824 = 4;
		Static619.anInt1566 = arg2;
		Static662.anInt9843 = arg3;
		Static35.anInt813 = arg4;
		Static272.aClass13_1 = Static167.method2632();
		Static276.method3986();
		Static478.aClass291ArrayArrayArray3 = new Class291[4][Static619.anInt1566][Static662.anInt9843];
		Static706.aClass178Array3 = new Class178[4];
		if (arg5) {
			Static62.anIntArrayArray33 = new int[Static619.anInt1566][Static662.anInt9843];
			Static421.aByteArrayArray20 = new byte[Static619.anInt1566][Static662.anInt9843];
			Static272.aShortArrayArray5 = new short[Static619.anInt1566][Static662.anInt9843];
			Static420.aClass291ArrayArrayArray2 = new Class291[1][Static619.anInt1566][Static662.anInt9843];
			Static693.aClass178Array2 = new Class178[1];
		} else {
			Static62.anIntArrayArray33 = null;
			Static421.aByteArrayArray20 = null;
			Static272.aShortArrayArray5 = null;
			Static420.aClass291ArrayArrayArray2 = null;
			Static693.aClass178Array2 = null;
		}
		if (arg6) {
			Static161.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static265.aClass353Array1 = new Class353[65535];
			Static279.aBooleanArray11 = new boolean[65535];
			Static319.anInt5080 = 0;
		} else {
			Static161.aLongArrayArrayArray1 = null;
			Static265.aClass353Array1 = null;
			Static279.aBooleanArray11 = null;
			Static319.anInt5080 = 0;
		}
		Static379.method5355(false);
		Static576.aClass8_Sub2Array9 = new Class8_Sub2[2];
		Static398.aClass8_Sub2Array7 = new Class8_Sub2[2];
		Static468.aClass8_Sub2Array10 = new Class8_Sub2[2];
		Static48.aClass8_Sub2Array3 = new Class8_Sub2[10000];
		Static546.anInt8244 = 0;
		Static395.aClass8_Sub2Array11 = new Class8_Sub2[5000];
		Static645.anInt9611 = 0;
		Static679.aClass8_Sub2_Sub1Array1 = new Class8_Sub2_Sub1[5000];
		Static125.anInt2352 = 0;
		Static258.aBooleanArrayArray3 = new boolean[Static35.anInt813 + Static35.anInt813 + 1][Static35.anInt813 + Static35.anInt813 + 1];
		Static142.aBooleanArrayArray1 = new boolean[Static35.anInt813 + Static35.anInt813 + 2][Static35.anInt813 + Static35.anInt813 + 2];
		Static102.anIntArray184 = new int[Static35.anInt813 + Static35.anInt813 + 2];
		Static514.aClass213_2 = Static514.aClass213_3;
		if (Static661.aBoolean457) {
			Static433.aBooleanArrayArrayArray5 = new boolean[4][Static35.anInt813 + Static35.anInt813 + 1][Static35.anInt813 + Static35.anInt813 + 1];
			Static275.aBooleanArrayArrayArray4 = new boolean[4][][];
			if (Static226.aClass46Array7 != null) {
				Static227.method3354();
			}
			Static226.aClass46Array7 = new Class46[Static32.anInt772];
			Static665.aClass19_15.method7956(Static226.aClass46Array7.length + 1);
			Static665.aClass19_15.method8020(0);
			for (@Pc(214) int local214 = 0; local214 < Static226.aClass46Array7.length; local214++) {
				Static226.aClass46Array7[local214] = new Class46(local214 + 1, Static665.aClass19_15);
				(new Thread(Static226.aClass46Array7[local214], "wr" + local214)).start();
			}
			@Pc(253) byte local253;
			if (Static32.anInt772 == 2) {
				local253 = 4;
				Static549.anInt9424 = 2;
			} else if (Static32.anInt772 == 3) {
				local253 = 6;
				Static549.anInt9424 = 3;
			} else {
				local253 = 8;
				Static549.anInt9424 = 4;
			}
			Static684.aClass302Array1 = new Class302[local253];
			for (@Pc(273) int local273 = 0; local273 < local253; local273++) {
				Static684.aClass302Array1[local273] = new Class302(Static515.aStringArrayArray2[Static32.anInt772 - 2][local273]);
			}
		} else {
			Static549.anInt9424 = 1;
		}
		Static537.anIntArray633 = new int[Static549.anInt9424 - 1];
		Static621.anIntArray766 = new int[Static549.anInt9424 - 1];
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/io/File;Z)V")
	public static void method8048(@OriginalArg(1) File arg0) {
		if (Static210.anObject8 == null) {
			Static716.method9349();
		}
		try {
			@Pc(28) Class local28 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(54) Method local54 = local28.getDeclaredMethod("dumpHeap", aClass23 == null ? (aClass23 = Class19_Sub1.a("java.lang.String")) : aClass23, Boolean.TYPE);
			local54.invoke(Static210.anObject8, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(74) Exception local74) {
			System.out.println("HeapDump error:");
			local74.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!am", name = "f", descriptor = "(B)Z")
	public static boolean method8119() {
		if (Static98.aBoolean191) {
			try {
				Static727.method97("showVideoAd", Static166.anApplet1);
				return true;
			} catch (@Pc(15) Throwable local15) {
			}
		}
		return false;
	}
}
