import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "[S")
	public static short[] aShortArray90;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "[B")
	public static final byte[] aByteArray69 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	public static int anInt5102 = 0;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString179 = "Face here";

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "[J")
	public static final long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)I")
	public static int method4360(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public static void method4361() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static200.anInt4599 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)Z")
	public static boolean method4363() {
		return Static312.anInt6002 != 0 || Static87.anInt2332 >= 2;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIII)V")
	public static void method4364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = (arg1 - 32) * arg1 / arg3;
		if (local11 < 8) {
			local11 = 8;
		}
		@Pc(30) int local30 = (arg1 - local11 - 32) * arg4 / (arg3 - arg1);
		Static256.aClass29Array11[0].method5845(arg0, arg2);
		Static256.aClass29Array11[1].method5845(arg0, arg2 + arg1 - 16);
		Static221.aClass40_6.method2745(16, arg1 - 32, arg0, arg2 + 16, Static83.anInt2193);
		Static221.aClass40_6.method2745(16, local11, arg0, local30 + arg2 + 16, Static24.anInt800);
		Static221.aClass40_6.method2797(local30 + arg2 + 16, Static323.anInt6640, arg0, local11);
		Static221.aClass40_6.method2797(arg2 + local30 + 16, Static323.anInt6640, arg0 + 1, local11);
		Static221.aClass40_6.method2769(arg0, Static323.anInt6640, 16, local30 + arg2 + 16);
		Static221.aClass40_6.method2769(arg0, Static323.anInt6640, 16, arg2 + local30 + 17);
		Static221.aClass40_6.method2797(arg2 + local30 + 16, Static142.anInt3531, arg0 + 15, local11);
		Static221.aClass40_6.method2797(arg2 + local30 + 17, Static142.anInt3531, arg0 + 14, local11 + -1);
		Static221.aClass40_6.method2769(arg0, Static142.anInt3531, 16, arg2 + local30 + local11 + 15);
		Static221.aClass40_6.method2769(arg0 + 1, Static142.anInt3531, 15, arg2 + local30 + local11 + 14);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!ta;III)V")
	public static void method4365(@OriginalArg(1) Class189 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class1_Sub20 local15 = (Class1_Sub20) Static268.aClass130_35.method3749(); local15 != null; local15 = (Class1_Sub20) Static268.aClass130_35.method3756()) {
			if (local15.anInt4002 == arg3 && arg1 * 128 == local15.anInt4018 && local15.anInt4012 == arg2 * 128 && arg0.anInt6205 == local15.aClass189_1.anInt6205) {
				if (local15.aClass1_Sub3_Sub2_3 != null) {
					Static127.aClass1_Sub3_Sub3_1.method3522(local15.aClass1_Sub3_Sub2_3);
					local15.aClass1_Sub3_Sub2_3 = null;
				}
				if (local15.aClass1_Sub3_Sub2_2 != null) {
					Static127.aClass1_Sub3_Sub3_1.method3522(local15.aClass1_Sub3_Sub2_2);
					local15.aClass1_Sub3_Sub2_2 = null;
				}
				local15.method6172();
				return;
			}
		}
	}
}
