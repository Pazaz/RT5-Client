package jaggl.jogl_wrapper;

import jaggl.context;
import javax.media.opengl.GLContext;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!jaggl/jogl_wrapper/GLContextImpl")
public final class GLContextImpl extends GLContext {

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "context_valid", descriptor = "Z")
	private boolean context_valid;

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "context", descriptor = "Lgl!jaggl/context;")
	private context context;

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLContextImpl", name = "drawable", descriptor = "Lgl!jaggl/jogl_wrapper/GLDrawableImpl;")
	private GLDrawableImpl drawable;
}
