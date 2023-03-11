import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

import java.applet.Applet;

public class BrowserControl {

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
	public static Object call(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		// return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
		return null;
	}

}
