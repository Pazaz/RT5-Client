import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "Z")
	public static boolean aBoolean236 = false;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IB)I")
	public static int method3025(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static295.method5220(arg0);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)V")
	public static void method3026(@OriginalArg(1) int arg0) {
		if (arg0 == Static152.anInt3744) {
			return;
		}
		Static25.anInt850 = Static219.anInt4987 = Static285.anIntArray457[arg0];
		Static221.aClass40_6.method2774(50, (int) ((double) Static25.anInt850 * 34.46D));
		Static243.anIntArrayArray35 = new int[Static25.anInt850][Static219.anInt4987];
		Static226.anIntArrayArrayArray10 = new int[4][Static25.anInt850 >> 3][Static219.anInt4987 >> 3];
		Static346.anIntArrayArray56 = new int[Static25.anInt850][Static219.anInt4987];
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			Static66.aClass22Array1[local42] = Static309.method5430(Static25.anInt850, Static219.anInt4987);
		}
		Static233.aByteArrayArrayArray13 = new byte[4][Static25.anInt850][Static219.anInt4987];
		Static221.method4303(Static219.anInt4987, Static25.anInt850);
		Static327.method5690(Static219.anInt4987 >> 3, Static25.anInt850 >> 3, Static221.aClass40_6);
		Static152.anInt3744 = arg0;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(II)[B")
	public static synchronized byte[] method3027(@OriginalArg(1) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static323.anInt6636 > 0) {
			local16 = Static176.aByteArrayArray37[--Static323.anInt6636];
			Static176.aByteArrayArray37[Static323.anInt6636] = null;
			return local16;
		} else if (arg0 == 5000 && Static265.anInt5625 > 0) {
			local16 = Static77.aByteArrayArray16[--Static265.anInt5625];
			Static77.aByteArrayArray16[Static265.anInt5625] = null;
			return local16;
		} else if (arg0 == 30000 && Static274.anInt5789 > 0) {
			local16 = Static32.aByteArrayArray55[--Static274.anInt5789];
			Static32.aByteArrayArray55[Static274.anInt5789] = null;
			return local16;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V")
	public static void method3028() {
		@Pc(5) Class215 local5 = Static285.aClass215_84;
		synchronized (Static285.aClass215_84) {
			Static285.aClass215_84.method6052();
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIZ)I")
	public static int method3029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (local7 + arg0) / arg1 - local7;
	}
}
