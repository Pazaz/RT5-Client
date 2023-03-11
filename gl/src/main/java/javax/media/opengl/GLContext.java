package javax.media.opengl;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!javax/media/opengl/GLContext")
public abstract class GLContext {

	@OriginalMember(owner = "gl!javax/media/opengl/GLContext", name = "currentContext", descriptor = "Lgl!javax/media/opengl/GLContext;")
	private static GLContext currentContext;
}
