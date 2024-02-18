import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

// todo: use reflection so the methods can still function in a compatible JVM
public final class Static727 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;")
	public static Object method96(@OriginalArg(1) Applet arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Object[] arg2) throws Throwable {
		return null; // JSObject.getWindow(arg0).call(arg1, arg2);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)Ljava/lang/Object;")
	public static Object method97(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1) throws Throwable {
		return null; // JSObject.getWindow(arg1).call(arg0, (Object[]) null);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V")
	public static void method98(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1) throws Throwable {
		// JSObject.getWindow(arg1).eval(arg0);
	}
}
