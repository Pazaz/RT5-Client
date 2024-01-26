package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaggl/MapBuffer")
public final class MapBuffer extends NativeBuffer {

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "c", descriptor = "I")
	private int c;

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "(III)Z")
	public boolean a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.c != 0) {
			return false;
		}
		@Pc(9) long local9 = OpenGL.glMapBufferARB(arg0, arg2);
		if (local9 == 0L) {
			return false;
		} else {
			this.a(local9, arg1);
			this.c = arg0;
			return true;
		}
	}

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "()Z")
	public boolean a() {
		return this.c != 0;
	}

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "a", descriptor = "([BIII)V")
	@Override
	public void a(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.c == 0) {
			throw new RuntimeException();
		}
		super.a(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaggl/MapBuffer", name = "b", descriptor = "()Z")
	public boolean b() {
		@Pc(1) boolean local1 = true;
		if (this.c != 0) {
			local1 = OpenGL.glUnmapBufferARB(this.c);
			this.a(0L, 0);
			this.c = 0;
		}
		return local1;
	}
}
