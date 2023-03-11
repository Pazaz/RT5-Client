package jaggl.jogl_wrapper;

import java.awt.Component;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLDrawable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!jaggl/jogl_wrapper/GLDrawableImpl")
public final class GLDrawableImpl implements GLDrawable {

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLDrawableImpl", name = "chosenCapabilities", descriptor = "Lgl!javax/media/opengl/GLCapabilities;")
	private GLCapabilities chosenCapabilities;

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLDrawableImpl", name = "context", descriptor = "Lgl!jaggl/jogl_wrapper/GLContextImpl;")
	private GLContextImpl context;

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLDrawableImpl", name = "component", descriptor = "Ljava/awt/Component;")
	private Component component;

	@OriginalMember(owner = "gl!jaggl/jogl_wrapper/GLDrawableImpl", name = "capabilities", descriptor = "Lgl!javax/media/opengl/GLCapabilities;")
	private GLCapabilities capabilities;
}
