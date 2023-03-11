package jaggl;

import java.awt.Component;
import java.util.HashSet;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaggl/context")
public final class context {

	@OriginalMember(owner = "client!jaggl/context", name = "b", descriptor = "Lclient!jaggl/context;")
	private static context b = null;

	@OriginalMember(owner = "client!jaggl/context", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!jaggl/context", name = "c", descriptor = "Ljava/util/HashSet;")
	private HashSet c = null;

	@OriginalMember(owner = "client!jaggl/context", name = "a", descriptor = "Lclient!jaggl/opengl;")
	private final opengl a = new opengl(this);

	@OriginalMember(owner = "client!jaggl/context", name = "<init>", descriptor = "()V")
	public context() {
		this.init(this.a);
	}

	@OriginalMember(owner = "client!jaggl/context", name = "getLastError", descriptor = "()I")
	private native int getLastError();

	@OriginalMember(owner = "client!jaggl/context", name = "setSwapInterval", descriptor = "(I)V")
	public native void setSwapInterval(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/context", name = "makeCurrent1", descriptor = "()Z")
	private native boolean makeCurrent1();

	@OriginalMember(owner = "client!jaggl/context", name = "deleteContext", descriptor = "()Z")
	private native boolean deleteContext();

	@OriginalMember(owner = "client!jaggl/context", name = "destroy", descriptor = "()Z")
	public native boolean destroy();

	@OriginalMember(owner = "client!jaggl/context", name = "isExtensionAvailable", descriptor = "(Ljava/lang/String;)Z")
	public boolean isExtensionAvailable(@OriginalArg(0) String arg0) {
		if (this.c == null) {
			@Pc(17) String local17 = this.a.glGetString(GL.GL_EXTENSIONS) + " " + this.getExtensionsString();
			@Pc(21) String[] local21 = local17.split(" ");
			this.c = new HashSet(local21.length);
			for (@Pc(30) int local30 = 0; local30 < local21.length; local30++) {
				this.c.add(local21[local30]);
			}
		}
		return this.c.contains(arg0);
	}

	@OriginalMember(owner = "client!jaggl/context", name = "getAlphaBits", descriptor = "()I")
	private native int getAlphaBits();

	@OriginalMember(owner = "client!jaggl/context", name = "makeCurrent", descriptor = "()Z")
	public boolean makeCurrent() {
		this.c = null;
		@Pc(5) boolean local5 = this.makeCurrent1();
		if (local5) {
			b = this;
		}
		return local5;
	}

	@OriginalMember(owner = "client!jaggl/context", name = "swapBuffers", descriptor = "()Z")
	public native boolean swapBuffers();

	@OriginalMember(owner = "client!jaggl/context", name = "choosePixelFormat", descriptor = "(Ljava/awt/Component;II)Z")
	public boolean choosePixelFormat(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.choosePixelFormat1(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jaggl/context", name = "init", descriptor = "(Lclient!jaggl/opengl;)V")
	private native void init(@OriginalArg(0) opengl arg0);

	@OriginalMember(owner = "client!jaggl/context", name = "createContext", descriptor = "()Z")
	public native boolean createContext();

	@OriginalMember(owner = "client!jaggl/context", name = "choosePixelFormat1", descriptor = "(Ljava/awt/Component;II)Z")
	private native boolean choosePixelFormat1(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/context", name = "getExtensionsString", descriptor = "()Ljava/lang/String;")
	private native String getExtensionsString();

	@OriginalMember(owner = "client!jaggl/context", name = "releaseContext", descriptor = "()Z")
	public native boolean releaseContext();

	@OriginalMember(owner = "client!jaggl/context", name = "choosePixelFormat0", descriptor = "(Ljava/awt/Component;)Z")
	private native boolean choosePixelFormat0(@OriginalArg(0) Component arg0);

	@OriginalMember(owner = "client!jaggl/context", name = "getGL", descriptor = "()Lclient!jaggl/opengl;")
	public opengl getGL() {
		return this.a;
	}
}
