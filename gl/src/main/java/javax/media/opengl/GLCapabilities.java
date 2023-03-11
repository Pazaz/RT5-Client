package javax.media.opengl;

import jaggl.jagglcaps;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!javax/media/opengl/GLCapabilities")
public final class GLCapabilities extends jagglcaps implements Cloneable {

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "clone", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (@Pc(3) CloneNotSupportedException local3) {
			throw new GLException(local3);
		}
	}
}
