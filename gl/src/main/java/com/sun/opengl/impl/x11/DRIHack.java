package com.sun.opengl.impl.x11;

import jaggl.X11.dri;
import java.security.AccessController;
import java.security.PrivilegedAction;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!com/sun/opengl/impl/x11/DRIHack")
public final class DRIHack {

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/DRIHack", name = "begin", descriptor = "()V")
	public static void begin() {
		AccessController.doPrivileged(new PrivilegedAction() {

			@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/DRIHack$1", name = "run", descriptor = "()Ljava/lang/Object;")
			@Override
			public Object run() {
				dri.bind();
				return null;
			}
		});
	}

	@OriginalMember(owner = "gl!com/sun/opengl/impl/x11/DRIHack", name = "end", descriptor = "()V")
	public static void end() {
		dri.close();
	}
}
