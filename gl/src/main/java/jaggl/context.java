package jaggl;

import java.awt.Component;
import java.util.HashSet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!jaggl/context")
public final class context {

	@OriginalMember(owner = "gl!jaggl/context", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "gl!jaggl/context", name = "extensionsString", descriptor = "Ljava/util/HashSet;")
	private HashSet extensionsString;

	@OriginalMember(owner = "gl!jaggl/context", name = "gl", descriptor = "Lgl!jaggl/opengl;")
	private opengl gl;

	@OriginalMember(owner = "gl!jaggl/context", name = "createContext", descriptor = "()Z")
	private native boolean createContext();

	@OriginalMember(owner = "gl!jaggl/context", name = "releaseContext", descriptor = "()Z")
	private native boolean releaseContext();

	@OriginalMember(owner = "gl!jaggl/context", name = "destroy", descriptor = "()Z")
	private native boolean destroy();

	@OriginalMember(owner = "gl!jaggl/context", name = "swapBuffers", descriptor = "()Z")
	private native boolean swapBuffers();

	@OriginalMember(owner = "gl!jaggl/context", name = "getLastError", descriptor = "()I")
	private native int getLastError();

	@OriginalMember(owner = "gl!jaggl/context", name = "setSwapInterval", descriptor = "(I)V")
	private native void setSwapInterval(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!jaggl/context", name = "getExtensionsString", descriptor = "()Ljava/lang/String;")
	private native String getExtensionsString();

	@OriginalMember(owner = "gl!jaggl/context", name = "getAlphaBits", descriptor = "()I")
	private native int getAlphaBits();

	@OriginalMember(owner = "gl!jaggl/context", name = "init", descriptor = "(Lgl!jaggl/opengl;)V")
	private native void init(@OriginalArg(0) opengl arg0);

	@OriginalMember(owner = "gl!jaggl/context", name = "choosePixelFormat1", descriptor = "(Ljava/awt/Component;II)Z")
	public native boolean choosePixelFormat1(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!jaggl/context", name = "makeCurrent1", descriptor = "()Z")
	private native boolean makeCurrent1();
}
