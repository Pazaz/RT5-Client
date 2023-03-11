import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static399 {

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBI)Z")
	public static boolean method2452(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)Z")
	public static boolean method2453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x38000) != 0 | method2462(arg1, arg0) || method2465(arg1, arg0);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(III)Z")
	private static boolean method2454(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BII)Z")
	public static boolean method2455(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(BII)Z")
	public static boolean method2456(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0 | method2457(arg1, arg0) || method2472(arg0, arg1);
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(III)Z")
	public static boolean method2457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x4000) != 0;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method2480(arg1, arg0) || method2474(arg0, arg1);
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(III)Z")
	public static boolean method2459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(III)Z")
	public static boolean method2460(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "(III)Z")
	public static boolean method2461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method2477(arg1, arg0) | (arg1 & 0x20000) != 0 || method2472(arg1, arg0);
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(BII)Z")
	public static boolean method2462(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIB)Z")
	public static boolean method2463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(IIB)Z")
	public static boolean method2464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method2479(arg0, arg1) | (arg0 & 0x38000) != 0 || method2465(arg1, arg0);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZI)Z")
	public static boolean method2465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (method2462(arg0, arg1) | method2479(arg1, arg0) | method2473(arg0, arg1)) & method2460(arg1, arg0);
	}

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "(III)Z")
	public static boolean method2466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (method2482(arg1, arg0) | (arg0 & 0x1000) != 0 | method2454(arg1, arg0)) & method2452(arg0, arg1);
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(IIB)Z")
	public static boolean method2467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "(III)Z")
	public static boolean method2468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(IIZ)Z")
	public static boolean method2469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x38000) != 0 | method2473(arg0, arg1) || method2465(arg0, arg1);
	}

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "(III)Z")
	public static boolean method2470(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(IBI)Z")
	public static boolean method2471(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x30000) != 0 | method2459(arg1, arg0) || method2472(arg1, arg0) || method2475(arg0, arg1);
	}

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "(III)Z")
	public static boolean method2472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (method2463(arg0, arg1)) {
			return method2468(arg1, arg0) | (arg0 & 0x5800) != 0 | method2477(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (method2482(arg1, arg0) | method2454(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(IIB)Z")
	public static boolean method2473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(BII)Z")
	public static boolean method2474(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method2480(arg1, arg0) & method2476(arg1, arg0);
	}

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "(III)Z")
	public static boolean method2475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method2459(arg1, arg0) & method2470(arg1, arg0);
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(IIB)Z")
	public static boolean method2476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "(III)Z")
	public static boolean method2477(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(IBI)Z")
	public static boolean method2478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x8000) != 0 | method2482(arg0, arg1) || method2466(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && method2472(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(IZI)Z")
	public static boolean method2479(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(IIZ)Z")
	public static boolean method2480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "(III)Z")
	public static boolean method2481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method2468(arg1, arg0) || method2472(arg0, arg1);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZII)Z")
	public static boolean method2482(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}
}
