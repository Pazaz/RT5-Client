import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
	public static int anInt641;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString22 = "Select";

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "[I")
	public static final int[] anIntArray39 = new int[128];

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!nr;IILclient!ao;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method451(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static332.aClass40_8 = arg0;
		Static244.anInt2617 = arg1;
		Static192.aClass11_9 = arg3;
		Static46.aBoolean482 = Static332.aClass40_8.method2709() > 0;
		Static328.anInt6714 = arg4 >> 7;
		Static61.anInt1677 = arg6 >> 7;
		Static72.anInt1993 = arg4;
		Static277.anInt5859 = arg6;
		Static167.anInt4035 = arg5;
		Static76.anInt2086 = Static328.anInt6714 - Static292.anInt6117;
		if (Static76.anInt2086 < 0) {
			Static286.anInt6057 = -Static76.anInt2086;
			Static76.anInt2086 = 0;
		} else {
			Static286.anInt6057 = 0;
		}
		Static29.anInt6406 = Static61.anInt1677 - Static292.anInt6117;
		if (Static29.anInt6406 < 0) {
			Static224.anInt5350 = -Static29.anInt6406;
			Static29.anInt6406 = 0;
		} else {
			Static224.anInt5350 = 0;
		}
		Static53.anInt1599 = Static328.anInt6714 + Static292.anInt6117;
		if (Static53.anInt1599 > Static328.anInt6717) {
			Static53.anInt1599 = Static328.anInt6717;
		}
		Static130.anInt6803 = Static61.anInt1677 + Static292.anInt6117;
		if (Static130.anInt6803 > Static200.anInt4590) {
			Static130.anInt6803 = Static200.anInt4590;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static292.anInt6117 + Static292.anInt6117 + 2; local74++) {
			for (local77 = 0; local77 < Static292.anInt6117 + Static292.anInt6117 + 2; local77++) {
				local84 = Static328.anInt6714 + local74 - Static292.anInt6117;
				local90 = Static61.anInt1677 + local77 - Static292.anInt6117;
				if (local84 >= 0 && local90 >= 0 && local84 < Static328.anInt6717 && local90 < Static200.anInt4590) {
					@Pc(104) int local104 = local84 << 7;
					@Pc(108) int local108 = local90 << 7;
					@Pc(117) int local117 = Static336.aClass77Array3[3].method3986(local84, local90) - 1000;
					@Pc(137) int local137 = Static137.aClass77Array2 == null ? Static336.aClass77Array3[0].method3986(local84, local90) + 128 : Static137.aClass77Array2[0].method3986(local84, local90) + 128;
					Static161.aBooleanArrayArray5[local74][local77] = Static332.aClass40_8.method2753(local104, local117, local108, local104, local137, local108);
				} else {
					Static161.aBooleanArrayArray5[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static292.anInt6117 + Static292.anInt6117 + 1; local77++) {
			for (local84 = 0; local84 < Static292.anInt6117 + Static292.anInt6117 + 1; local84++) {
				Static100.aBooleanArrayArray7[local77][local84] = Static161.aBooleanArrayArray5[local77][local84] || Static161.aBooleanArrayArray5[local77 + 1][local84] || Static161.aBooleanArrayArray5[local77][local84 + 1] || Static161.aBooleanArrayArray5[local77 + 1][local84 + 1];
			}
		}
		Static99.anIntArray159 = arg8;
		Static61.anIntArray109 = arg9;
		Static305.anIntArray488 = arg10;
		Static347.anIntArray557 = arg11;
		Static180.anIntArray302 = arg12;
		Static108.method2250();
		Static248.method4597();
		for (@Pc(253) Class2_Sub3 local253 = (Class2_Sub3) Static216.aClass58_8.method1672(); local253 != null; local253 = (Class2_Sub3) Static216.aClass58_8.method1675()) {
			local253.method5802();
			Static117.method2576(local253);
		}
		if (Static46.aBoolean482) {
			for (local90 = 0; local90 < Static273.anInt5747; local90++) {
				Static68.aClass1_Sub9_Sub1Array1[local90].method3959(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static332.aClass40_8.method2731(0);
			if (Static110.aClass23_2 == null || Static110.aClass23_2 instanceof Class23_Sub2) {
				Static110.aClass23_2 = new Class23_Sub1();
			}
		} else if (Static110.aClass23_2 == null || Static110.aClass23_2 instanceof Class23_Sub1) {
			Static110.aClass23_2 = new Class23_Sub2();
		}
		Static110.aClass23_2.method1375(arg2);
		Static110.aClass23_2.method1381();
		if (Static134.aClass154ArrayArrayArray1 != null) {
			Static203.method693(true);
			Static110.aClass23_2.method1374(22);
			Static296.method5233(arg2, null, 0, (byte) 0, arg15, arg16);
			Static110.aClass23_2.method1381();
			Static110.aClass23_2.method1374(23);
			Static203.method693(false);
		}
		Static296.method5233(arg2, arg7, arg13, arg14, arg15, arg16);
		Static110.aClass23_2.method1381();
		Static110.aClass23_2.method1380();
		Static110.aClass23_2.method1381();
		if (arg2 > 1) {
			Static332.aClass40_8.method2727(0);
		}
		Static332.aClass40_8.method2761(0, null);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method452(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString242 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			@Pc(64) String local64 = local53.readLine();
			if (local64 == null) {
				return local10 + "| " + local56;
			}
			@Pc(70) int local70 = local64.indexOf(40);
			@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
			@Pc(86) String local86;
			if (local70 == -1) {
				local86 = local64;
			} else {
				local86 = local64.substring(0, local70);
			}
			local86 = local86.trim();
			local86 = local86.substring(local86.lastIndexOf(32) + 1);
			local86 = local86.substring(local86.lastIndexOf(9) + 1);
			local10 = local10 + local86;
			if (local70 != -1 && local77 != -1) {
				@Pc(129) int local129 = local64.indexOf(".java:", local70);
				if (local129 >= 0) {
					local10 = local10 + local64.substring(local129 + 5, local77);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
	public static void method453() {
		@Pc(5) Class215 local5 = Static84.aClass215_35;
		synchronized (Static84.aClass215_35) {
			Static84.aClass215_35.method6060();
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V")
	public static void method455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static266.anInt5654; local7++) {
			@Pc(13) Rectangle local13 = Class111.aRectangleArray2[local7];
			if (local13.width + local13.x > arg0 && local13.x < arg3 + arg0 && arg2 < local13.height + local13.y && arg1 + arg2 > local13.y) {
				Static230.aBooleanArray16[local7] = true;
			}
		}
	}
}
