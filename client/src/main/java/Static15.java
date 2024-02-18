import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!aia", name = "n", descriptor = "Z")
	public static boolean aBoolean17 = false;

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(III)Lclient!hda;")
	public static Class158 method186(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) Class158 local21 = Static145.method2412(arg1);
		if (arg0 == -1) {
			return local21;
		} else if (local21 == null || local21.aClass158Array2 == null || arg0 >= local21.aClass158Array2.length) {
			return null;
		} else {
			return local21.aClass158Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(I[J[I)V")
	public static void method187(@OriginalArg(1) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static230.method3373(arg0.length - 1, arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IIBLclient!ke;III)Z")
	public static boolean method188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class205 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static18.aBoolean20 || !Static29.aBoolean60) {
			return false;
		} else if (Static432.anInt525 < 100) {
			return false;
		} else if (arg4 != arg1 || arg3 != arg0) {
			for (@Pc(72) int local72 = arg4; local72 <= arg1; local72++) {
				for (@Pc(75) int local75 = arg0; local75 <= arg3; local75++) {
					if (Static446.anIntArrayArrayArray9[arg5][local72][local75] == -Static675.anInt10155) {
						return false;
					}
				}
			}
			if (Static342.method4463(arg2)) {
				Static356.anInt5773++;
				return true;
			} else {
				return false;
			}
		} else if (!Static588.method7714(arg0, arg5, arg4)) {
			return false;
		} else if (Static342.method4463(arg2)) {
			Static356.anInt5773++;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(BLclient!ge;)Ljava/lang/String;")
	public static String method189(@OriginalArg(1) Packet arg0) {
		return Static387.method5441(arg0);
	}
}
