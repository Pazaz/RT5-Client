package jagex3.jagmisc;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jagex3/jagmisc/jagmisc")
public final class jagmisc {

	@OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "ping0", descriptor = "(BBBBJ)I")
	private static native int ping0(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) long arg4);

	@OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "init", descriptor = "()Z")
	public static native boolean init();

	@OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "Quit0", descriptor = "()V")
	private static native void Quit0();

	@OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "nanoTime", descriptor = "()J")
	public static native long nanoTime();

	@OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "getTotalPhysicalMemory", descriptor = "()J")
	private static native long getTotalPhysicalMemory();

	@OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "getAvailablePhysicalMemory", descriptor = "()J")
	public static native long getAvailablePhysicalMemory();

	@OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "quit", descriptor = "()V")
	public static void quit() {
		Quit0();
	}

	@OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "ping", descriptor = "(BBBBJ)I")
	public static int ping(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) long arg4) throws Throwable {
		@Pc(6) int local6 = ping0(arg0, arg1, arg2, arg3, arg4);
		if (local6 < 0) {
			throw new Exception(String.valueOf(local6));
		}
		return local6;
	}

	@OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "<init>", descriptor = "()V")
	private jagmisc() {
	}
}
