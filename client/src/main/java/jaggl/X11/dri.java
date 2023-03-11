package jaggl.X11;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/X11/dri")
public final class dri {

	@OriginalMember(owner = "client!jaggl/X11/dri", name = "open", descriptor = "(Ljava/lang/String;)Z")
	private static native boolean open(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!jaggl/X11/dri", name = "close", descriptor = "()Z")
	private static native boolean close();
}
