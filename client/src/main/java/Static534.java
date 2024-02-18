import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "Lclient!sb;")
	public static Class330 aClass330_104;

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
	public static int anInt8111;

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "D")
	public static double aDouble21;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "[[B")
	public static final byte[][] aByteArrayArray29 = new byte[50][];

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIIIZI)V")
	public static void method7120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(17) int local17;
		if (Static571.method7566(arg0)) {
			local17 = 0;
			@Pc(58) int local58 = 0;
			@Pc(60) int local60 = 0;
			@Pc(62) int local62 = 0;
			@Pc(64) int local64 = 0;
			if (Static137.aBoolean210) {
				local62 = Static582.anInt8629;
				local64 = Static691.anInt10368;
				local17 = Static435.anInt6597;
				local58 = Static320.anInt5085;
				local60 = Static599.anInt8837;
				Static691.anInt10368 = 1;
			}
			if (Static148.aClass158ArrayArray1[arg0] == null) {
				Static71.method1522(-1, arg6, Static453.aClass158ArrayArray2[arg0], arg1, arg3, arg7, arg5, arg5 < 0, arg2, arg4);
			} else {
				Static71.method1522(-1, arg6, Static148.aClass158ArrayArray1[arg0], arg1, arg3, arg7, arg5, arg5 < 0, arg2, arg4);
			}
			if (Static137.aBoolean210) {
				if (arg5 >= 0 && Static691.anInt10368 == 2) {
					Static682.method8927(Static320.anInt5085, Static582.anInt8629, Static435.anInt6597, Static599.anInt8837);
				}
				Static320.anInt5085 = local58;
				Static582.anInt8629 = local62;
				Static435.anInt6597 = local17;
				Static691.anInt10368 = local64;
				Static599.anInt8837 = local60;
			}
		} else if (arg5 == -1) {
			for (local17 = 0; local17 < 100; local17++) {
				Static364.aBooleanArray18[local17] = true;
			}
		} else {
			Static364.aBooleanArray18[arg5] = true;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)V")
	public static void method7121() {
		Static473.aClass82_157.method2147(50);
		Static312.aClass82_106.method2147(50);
		Static449.aClass82_146.method2147(50);
		Static444.aClass82_145.method2147(50);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)V")
	public static void method7122(@OriginalArg(1) int arg0) {
		Static294.anInt4766 = arg0;
		@Pc(7) Class82 local7 = Static54.aClass82_25;
		synchronized (Static54.aClass82_25) {
			Static54.aClass82_25.method2157();
		}
		local7 = Static580.aClass82_186;
		synchronized (Static580.aClass82_186) {
			Static580.aClass82_186.method2157();
		}
	}
}
