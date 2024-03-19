import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static368 {

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZI)Z")
	public static boolean method5339(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (method5356(arg1, arg0)) {
			return (arg0 & 0x5800) != 0 | method5350(arg1, arg0) | method5343(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (method5358(arg1, arg0) | method5347(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)Z")
	public static boolean method5340(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method5365(arg0, arg1) & method5345(arg0, arg1);
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(III)Z")
	public static boolean method5341(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(III)Z")
	public static boolean method5342(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x38000) != 0 | method5364(arg1, arg0) || method5367(arg1, arg0);
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(III)Z")
	public static boolean method5343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "(III)Z")
	public static boolean method5344(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method5350(arg0, arg1) || method5339(arg1, arg0);
	}

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "(III)Z")
	public static boolean method5345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IBI)Z")
	public static boolean method5346(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x4000) != 0;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(IZI)Z")
	private static boolean method5347(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "(III)Z")
	public static boolean method5348(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method5365(arg1, arg0) || method5340(arg1, arg0);
	}

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "(III)Z")
	public static boolean method5349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "(III)Z")
	public static boolean method5350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x2080) != 0;
	}

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "(III)Z")
	public static boolean method5351(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (method5358(arg0, arg1) | (arg1 & 0x1000) != 0 | method5347(arg1, arg0)) & method5359(arg0, arg1);
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(IZI)Z")
	public static boolean method5352(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method5357(arg0, arg1) | (arg0 & 0x38000) != 0 || method5367(arg1, arg0);
	}

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "(III)Z")
	public static boolean method5353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "(III)Z")
	public static boolean method5354(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x8000) != 0 | method5358(arg1, arg0) || method5351(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && method5339(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BII)Z")
	public static boolean method5355(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return method5346(arg0, arg1) | (arg0 & 0x400) != 0 || method5339(arg0, arg1);
	}

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "(III)Z")
	public static boolean method5356(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIB)Z")
	public static boolean method5357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "(III)Z")
	public static boolean method5358(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!tl", name = "o", descriptor = "(III)Z")
	public static boolean method5359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(BII)Z")
	public static boolean method5360(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(IBI)Z")
	public static boolean method5361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method5363(arg1, arg0) | (arg1 & 0x38000) != 0 || method5367(arg0, arg1);
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(IBI)Z")
	public static boolean method5362(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method5343(arg1, arg0) | (arg1 & 0x20000) != 0 || method5339(arg1, arg0);
	}

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "(III)Z")
	public static boolean method5363(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "(III)Z")
	public static boolean method5364(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(BII)Z")
	public static boolean method5365(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!tl", name = "r", descriptor = "(III)Z")
	public static boolean method5366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x30000) != 0 | method5360(arg1, arg0) || method5339(arg1, arg0) || method5369(arg1, arg0);
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(IBI)Z")
	public static boolean method5367(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (method5363(arg1, arg0) | method5357(arg1, arg0) | method5364(arg0, arg1)) & method5349(arg1, arg0);
	}

	@OriginalMember(owner = "client!tl", name = "s", descriptor = "(III)Z")
	public static boolean method5368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!tl", name = "t", descriptor = "(III)Z")
	public static boolean method5369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method5360(arg0, arg1) & method5341(arg1, arg0);
	}
}
