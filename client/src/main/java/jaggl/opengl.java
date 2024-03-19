package jaggl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.security.InvalidParameterException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaggl/opengl")
public final class opengl {

	@OriginalMember(owner = "client!jaggl/opengl", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!jaggl/opengl", name = "a", descriptor = "Lclient!jaggl/context;")
	private final context a;

	@OriginalMember(owner = "client!jaggl/opengl", name = "getIndirectBufferByteOffset", descriptor = "(Ljava/nio/Buffer;)I")
	private static int getIndirectBufferByteOffset(@OriginalArg(0) Buffer arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(6) int local6 = arg0.position();
		if (arg0 instanceof ByteBuffer) {
			return ((ByteBuffer) arg0).arrayOffset() + local6;
		} else if (arg0 instanceof FloatBuffer) {
			return (((FloatBuffer) arg0).arrayOffset() + local6) * 4;
		} else if (arg0 instanceof IntBuffer) {
			return (((IntBuffer) arg0).arrayOffset() + local6) * 4;
		} else if (arg0 instanceof ShortBuffer) {
			return (((ShortBuffer) arg0).arrayOffset() + local6) * 2;
		} else if (arg0 instanceof DoubleBuffer) {
			return (((DoubleBuffer) arg0).arrayOffset() + local6) * 8;
		} else if (arg0 instanceof LongBuffer) {
			return (((LongBuffer) arg0).arrayOffset() + local6) * 8;
		} else if (arg0 instanceof CharBuffer) {
			return (((CharBuffer) arg0).arrayOffset() + local6) * 2;
		} else {
			throw new RuntimeException("Unknown buffer type " + arg0.getClass().getName());
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "getArray", descriptor = "(Ljava/nio/Buffer;)Ljava/lang/Object;")
	private static Object getArray(@OriginalArg(0) Buffer arg0) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof ByteBuffer) {
			return ((ByteBuffer) arg0).array();
		} else if (arg0 instanceof FloatBuffer) {
			return ((FloatBuffer) arg0).array();
		} else if (arg0 instanceof IntBuffer) {
			return ((IntBuffer) arg0).array();
		} else if (arg0 instanceof ShortBuffer) {
			return ((ShortBuffer) arg0).array();
		} else if (arg0 instanceof DoubleBuffer) {
			return ((DoubleBuffer) arg0).array();
		} else if (arg0 instanceof LongBuffer) {
			return ((LongBuffer) arg0).array();
		} else if (arg0 instanceof CharBuffer) {
			return ((CharBuffer) arg0).array();
		} else {
			throw new InvalidParameterException("Buffer " + arg0.getClass() + " is invalid");
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "getDirectBufferByteOffset", descriptor = "(Ljava/nio/Buffer;)I")
	private static int getDirectBufferByteOffset(@OriginalArg(0) Buffer arg0) {
		if (arg0 == null) {
			return 0;
		} else if (arg0 instanceof ByteBuffer) {
			return arg0.position();
		} else if (arg0 instanceof FloatBuffer) {
			return arg0.position() * 4;
		} else if (arg0 instanceof IntBuffer) {
			return arg0.position() * 4;
		} else if (arg0 instanceof ShortBuffer) {
			return arg0.position() * 2;
		} else if (arg0 instanceof DoubleBuffer) {
			return arg0.position() * 8;
		} else if (arg0 instanceof LongBuffer) {
			return arg0.position() * 8;
		} else if (arg0 instanceof CharBuffer) {
			return arg0.position() * 2;
		} else {
			throw new InvalidParameterException("Buffer " + arg0.getClass() + " is invalid");
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "isDirect", descriptor = "(Ljava/nio/Buffer;)Z")
	private static boolean isDirect(@OriginalArg(0) Buffer arg0) {
		if (arg0 == null) {
			return true;
		} else if (arg0 instanceof ByteBuffer) {
			return ((ByteBuffer) arg0).isDirect();
		} else if (arg0 instanceof FloatBuffer) {
			return ((FloatBuffer) arg0).isDirect();
		} else if (arg0 instanceof DoubleBuffer) {
			return ((DoubleBuffer) arg0).isDirect();
		} else if (arg0 instanceof CharBuffer) {
			return ((CharBuffer) arg0).isDirect();
		} else if (arg0 instanceof ShortBuffer) {
			return ((ShortBuffer) arg0).isDirect();
		} else if (arg0 instanceof IntBuffer) {
			return ((IntBuffer) arg0).isDirect();
		} else if (arg0 instanceof LongBuffer) {
			return ((LongBuffer) arg0).isDirect();
		} else {
			throw new InvalidParameterException("Buffer " + arg0.getClass() + " is invalid");
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "<init>", descriptor = "(Lclient!jaggl/context;)V")
	public opengl(@OriginalArg(0) context arg0) {
		this.a = arg0;
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glLoadMatrixf", descriptor = "([FI)V")
	public void glLoadMatrixf(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		this.glLoadMatrixf1(arg0, arg1 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glEnable", descriptor = "(I)V")
	public native void glEnable(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBindRenderbufferEXT", descriptor = "(II)V")
	public native void glBindRenderbufferEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glVertexPointer", descriptor = "(IIILjava/nio/Buffer;)V")
	public void glVertexPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Buffer arg3) {
		if (isDirect(arg3)) {
			this.glVertexPointer0(arg0, arg1, arg2, arg3, getDirectBufferByteOffset(arg3));
		} else {
			this.glVertexPointer1(arg0, arg1, arg2, getArray(arg3), getIndirectBufferByteOffset(arg3));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glMultMatrixf", descriptor = "(Ljava/nio/FloatBuffer;)V")
	private void glMultMatrixf(@OriginalArg(0) FloatBuffer arg0) {
		if (isDirect(arg0)) {
			this.glMultMatrixf0(arg0, getDirectBufferByteOffset(arg0));
		} else {
			this.glMultMatrixf1(getArray(arg0), getIndirectBufferByteOffset(arg0));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glMultMatrixf0", descriptor = "(Ljava/lang/Object;I)V")
	private native void glMultMatrixf0(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetIntegerv1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glGetIntegerv1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glRenderbufferStorageEXT", descriptor = "(IIII)V")
	public native void glRenderbufferStorageEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glCompileShaderARB", descriptor = "(I)V")
	public native void glCompileShaderARB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColor4ub", descriptor = "(BBBB)V")
	public native void glColor4ub(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBufferSubDataARB0", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glBufferSubDataARB0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenBuffersARB", descriptor = "(I[II)V")
	public void glGenBuffersARB(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		this.glGenBuffersARB1(arg0, arg1, arg2 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glScalef", descriptor = "(FFF)V")
	public native void glScalef(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glNormalPointer0", descriptor = "(IILjava/lang/Object;I)V")
	private native void glNormalPointer0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPixelTransferf", descriptor = "(IF)V")
	public native void glPixelTransferf(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetProgramivARB1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glGetProgramivARB1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexSubImage2D0", descriptor = "(IIIIIIIILjava/lang/Object;I)V")
	private native void glTexSubImage2D0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Object arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDrawPixels", descriptor = "(IIII[BI)V")
	private void glDrawPixels(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5) {
		this.glDrawPixels1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glLoadMatrixf1", descriptor = "(Ljava/lang/Object;I)V")
	private native void glLoadMatrixf1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glFogi", descriptor = "(II)V")
	public native void glFogi(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glEndList", descriptor = "()V")
	public native void glEndList();

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteRenderbuffersEXT", descriptor = "(I[II)V")
	public void glDeleteRenderbuffersEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		this.glDeleteRenderbuffersEXT1(arg0, arg1, arg2 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDrawArrays", descriptor = "(III)V")
	public native void glDrawArrays(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBufferSubDataARB1", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glBufferSubDataARB1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glRotatef", descriptor = "(FFFF)V")
	public native void glRotatef(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glClientActiveTexture", descriptor = "(I)V")
	private native void glClientActiveTexture(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glMultiTexCoord2i", descriptor = "(III)V")
	private native void glMultiTexCoord2i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexGenfv", descriptor = "(II[FI)V")
	public void glTexGenfv(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3) {
		this.glTexGenfv1(arg0, arg1, arg2, arg3 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColorPointer", descriptor = "(III[BI)V")
	private void glColorPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		this.glColorPointer1(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDisableClientState", descriptor = "(I)V")
	public native void glDisableClientState(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColorPointer1", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glColorPointer1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexSubImage2D", descriptor = "(IIIIIIIILjava/nio/Buffer;)V")
	public void glTexSubImage2D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Buffer arg8) {
		if (isDirect(arg8)) {
			this.glTexSubImage2D0(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, getDirectBufferByteOffset(arg8));
		} else {
			this.glTexSubImage2D1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, getArray(arg8), getIndirectBufferByteOffset(arg8));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetInfoLogARB", descriptor = "(II[II[BI)V")
	public void glGetInfoLogARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5) {
		this.glGetInfoLogARB1(arg0, arg1, arg2, arg3, arg4, arg5 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexImage2D1", descriptor = "(IIIIIIIILjava/lang/Object;I)V")
	private native void glTexImage2D1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Object arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPopAttrib", descriptor = "()V")
	public native void glPopAttrib();

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDrawBuffer", descriptor = "(I)V")
	public native void glDrawBuffer(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glViewport", descriptor = "(IIII)V")
	public native void glViewport(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glOrtho", descriptor = "(DDDDDD)V")
	public native void glOrtho(@OriginalArg(0) double arg0, @OriginalArg(1) double arg1, @OriginalArg(2) double arg2, @OriginalArg(3) double arg3, @OriginalArg(4) double arg4, @OriginalArg(5) double arg5);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glProgramStringARB", descriptor = "(IIILjava/lang/String;)V")
	public native void glProgramStringARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenTextures1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glGenTextures1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "isExtensionAvailable", descriptor = "(Ljava/lang/String;)Z")
	public boolean isExtensionAvailable(@OriginalArg(0) String arg0) {
		return this.a.isExtensionAvailable(arg0);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexImage1D1", descriptor = "(IIIIIIILjava/lang/Object;I)V")
	private native void glTexImage1D1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Object arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glMultMatrixf1", descriptor = "(Ljava/lang/Object;I)V")
	private native void glMultMatrixf1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glAttachObjectARB", descriptor = "(II)V")
	public native void glAttachObjectARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glNewList", descriptor = "(II)V")
	public native void glNewList(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glAlphaFunc", descriptor = "(IF)V")
	public native void glAlphaFunc(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glUniform4fARB", descriptor = "(IFFFF)V")
	private native void glUniform4fARB(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glFramebufferTexture2DEXT", descriptor = "(IIIII)V")
	public native void glFramebufferTexture2DEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glReadBuffer", descriptor = "(I)V")
	public native void glReadBuffer(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glVertex2i", descriptor = "(II)V")
	public native void glVertex2i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glProgramLocalParameter4fARB", descriptor = "(IIFFFF)V")
	public native void glProgramLocalParameter4fARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBlendFunc", descriptor = "(II)V")
	public native void glBlendFunc(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenBuffersARB1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glGenBuffersARB1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glReadPixels", descriptor = "(IIIIIILjava/nio/Buffer;)V")
	public void glReadPixels(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Buffer arg6) {
		if (isDirect(arg6)) {
			this.glReadPixels0(arg0, arg1, arg2, arg3, arg4, arg5, arg6, getDirectBufferByteOffset(arg6));
		} else {
			this.glReadPixels1(arg0, arg1, arg2, arg3, arg4, arg5, getArray(arg6), getIndirectBufferByteOffset(arg6));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glVertex2f", descriptor = "(FF)V")
	public native void glVertex2f(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glMaterialfv", descriptor = "(II[FI)V")
	private void glMaterialfv(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3) {
		this.glMaterialfv1(arg0, arg1, arg2, arg3 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDisable", descriptor = "(I)V")
	public native void glDisable(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glFogfv1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glFogfv1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glMatrixMode", descriptor = "(I)V")
	public native void glMatrixMode(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glInterleavedArrays", descriptor = "(IIJ)V")
	private native void glInterleavedArrays(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glVertexPointer", descriptor = "(IIIJ)V")
	public native void glVertexPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexCoord2i", descriptor = "(II)V")
	private native void glTexCoord2i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glFramebufferTexture3DEXT", descriptor = "(IIIIII)V")
	public native void glFramebufferTexture3DEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glEnableClientState", descriptor = "(I)V")
	public native void glEnableClientState(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glVertex3f", descriptor = "(FFF)V")
	private native void glVertex3f(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexEnvfv", descriptor = "(II[FI)V")
	public void glTexEnvfv(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3) {
		this.glTexEnvfv1(arg0, arg1, arg2, arg3 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetObjectParameterivARB", descriptor = "(II[II)V")
	public void glGetObjectParameterivARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		this.glGetObjectParameterivARB1(arg0, arg1, arg2, arg3 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColorPointer", descriptor = "(IIILjava/nio/Buffer;)V")
	public void glColorPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Buffer arg3) {
		if (isDirect(arg3)) {
			this.glColorPointer0(arg0, arg1, arg2, arg3, getDirectBufferByteOffset(arg3));
		} else {
			this.glColorPointer1(arg0, arg1, arg2, getArray(arg3), getIndirectBufferByteOffset(arg3));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColor4f", descriptor = "(FFFF)V")
	private native void glColor4f(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glFlush", descriptor = "()V")
	public native void glFlush();

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexImage2D", descriptor = "(IIIIIIIILjava/nio/Buffer;)V")
	public void glTexImage2D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Buffer arg8) {
		if (isDirect(arg8)) {
			this.glTexImage2D0(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, getDirectBufferByteOffset(arg8));
		} else {
			this.glTexImage2D1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, getArray(arg8), getIndirectBufferByteOffset(arg8));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBindTexture", descriptor = "(II)V")
	public native void glBindTexture(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetBooleanv1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glGetBooleanv1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glNormal3fv", descriptor = "([FI)V")
	private void glNormal3fv(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		this.glNormal3fv1(arg0, arg1 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexEnvf", descriptor = "(IIF)V")
	public native void glTexEnvf(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenProgramsARB", descriptor = "(I[II)V")
	public void glGenProgramsARB(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		this.glGenProgramsARB1(arg0, arg1, arg2 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBufferDataARB1", descriptor = "(IILjava/lang/Object;II)V")
	private native void glBufferDataARB1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteProgramsARB", descriptor = "(I[II)V")
	public void glDeleteProgramsARB(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		this.glDeleteProgramsARB1(arg0, arg1, arg2 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glInterleavedArrays", descriptor = "(IILjava/nio/Buffer;)V")
	private void glInterleavedArrays(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		if (isDirect(arg2)) {
			this.glInterleavedArrays0(arg0, arg1, arg2, getDirectBufferByteOffset(arg2));
		} else {
			this.glInterleavedArrays1(arg0, arg1, getArray(arg2), getIndirectBufferByteOffset(arg2));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glHint", descriptor = "(II)V")
	public native void glHint(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenFramebuffersEXT", descriptor = "(I[II)V")
	public void glGenFramebuffersEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		this.glGenFramebuffersEXT1(arg0, arg1, arg2 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetFloatv1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glGetFloatv1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDrawElements", descriptor = "(IIILjava/nio/Buffer;)V")
	public void glDrawElements(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Buffer arg3) {
		if (isDirect(arg3)) {
			this.glDrawElements0(arg0, arg1, arg2, arg3, getDirectBufferByteOffset(arg3));
		} else {
			this.glDrawElements1(arg0, arg1, arg2, getArray(arg3), getIndirectBufferByteOffset(arg3));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDrawPixels1", descriptor = "(IIIILjava/lang/Object;I)V")
	private native void glDrawPixels1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexGenfv1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glTexGenfv1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glInterleavedArrays0", descriptor = "(IILjava/lang/Object;I)V")
	private native void glInterleavedArrays0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBindBufferARB", descriptor = "(II)V")
	public native void glBindBufferARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glUniform3fARB", descriptor = "(IFFF)V")
	public native void glUniform3fARB(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexImage3D", descriptor = "(IIIIIIIII[BI)V")
	private void glTexImage3D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) int arg10) {
		this.glTexImage3D1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteBuffersARB", descriptor = "(I[II)V")
	public void glDeleteBuffersARB(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		this.glDeleteBuffersARB1(arg0, arg1, arg2 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetString", descriptor = "(I)Ljava/lang/String;")
	public native String glGetString(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexImage3D1", descriptor = "(IIIIIIIIILjava/lang/Object;I)V")
	private native void glTexImage3D1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Object arg9, @OriginalArg(10) int arg10);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glUniform2fARB", descriptor = "(IFF)V")
	private native void glUniform2fARB(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetInfoLogARB1", descriptor = "(IILjava/lang/Object;I[BI)V")
	private native void glGetInfoLogARB1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glCopyTexImage2D", descriptor = "(IIIIIIII)V")
	public native void glCopyTexImage2D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexSubImage2D1", descriptor = "(IIIIIIIILjava/lang/Object;I)V")
	private native void glTexSubImage2D1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Object arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColorPointer0", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glColorPointer0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetFloatv0", descriptor = "(ILjava/lang/Object;I)V")
	private native void glGetFloatv0(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glCopyPixels", descriptor = "(IIIII)V")
	public native void glCopyPixels(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glNormalPointer1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glNormalPointer1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexParameterf", descriptor = "(IIF)V")
	private native void glTexParameterf(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glLightModelfv1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glLightModelfv1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPointParameterfARB", descriptor = "(IF)V")
	private native void glPointParameterfARB(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDepthFunc", descriptor = "(I)V")
	public native void glDepthFunc(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteTextures", descriptor = "(I[II)V")
	public void glDeleteTextures(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		this.glDeleteTextures1(arg0, arg1, arg2 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glCheckFramebufferStatusEXT", descriptor = "(I)I")
	public native int glCheckFramebufferStatusEXT(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexCoordPointer", descriptor = "(IIIJ)V")
	public native void glTexCoordPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBufferDataARB0", descriptor = "(IILjava/lang/Object;II)V")
	private native void glBufferDataARB0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glProgramLocalParameter4fvARB0", descriptor = "(IILjava/lang/Object;I)V")
	private native void glProgramLocalParameter4fvARB0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColorMask", descriptor = "(ZZZZ)V")
	public native void glColorMask(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBlendFuncSeparateEXT", descriptor = "(IIII)V")
	private native void glBlendFuncSeparateEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexGeni", descriptor = "(III)V")
	public native void glTexGeni(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteObjectARB", descriptor = "(I)V")
	public native void glDeleteObjectARB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColor4fv", descriptor = "([FI)V")
	private void glColor4fv(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		this.glColor4fv1(arg0, arg1 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glNormalPointer", descriptor = "(IILjava/nio/Buffer;)V")
	public void glNormalPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		if (isDirect(arg2)) {
			this.glNormalPointer0(arg0, arg1, arg2, getDirectBufferByteOffset(arg2));
		} else {
			this.glNormalPointer1(arg0, arg1, getArray(arg2), getIndirectBufferByteOffset(arg2));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPointParameterfvARB", descriptor = "(I[FI)V")
	private void glPointParameterfvARB(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		this.glPointParameterfvARB1(arg0, arg1, arg2 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glVertexPointer1", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glVertexPointer1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColor3ub", descriptor = "(BBB)V")
	private native void glColor3ub(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glLightModelfv", descriptor = "(I[FI)V")
	public void glLightModelfv(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		this.glLightModelfv1(arg0, arg1, arg2 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPolygonMode", descriptor = "(II)V")
	public native void glPolygonMode(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glShaderSourceARB0", descriptor = "(IILjava/lang/Object;[II)V")
	private native void glShaderSourceARB0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColor3f", descriptor = "(FFF)V")
	public native void glColor3f(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glUniform1iARB", descriptor = "(II)V")
	public native void glUniform1iARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPointParameterfvARB1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glPointParameterfvARB1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glProgramLocalParameter4fvARB", descriptor = "(II[FI)V")
	public void glProgramLocalParameter4fvARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3) {
		this.glProgramLocalParameter4fvARB1(arg0, arg1, arg2, arg3 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTranslatef", descriptor = "(FFF)V")
	public native void glTranslatef(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glMultiTexCoord2f", descriptor = "(IFF)V")
	public native void glMultiTexCoord2f(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPushAttrib", descriptor = "(I)V")
	public native void glPushAttrib(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexSubImage2D", descriptor = "(IIIIIIII[BI)V")
	private void glTexSubImage2D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8, @OriginalArg(9) int arg9) {
		this.glTexSubImage2D1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glInterleavedArrays", descriptor = "(II[BI)V")
	private void glInterleavedArrays(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		this.glInterleavedArrays1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDrawElements0", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glDrawElements0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetUniformLocation", descriptor = "(ILjava/lang/String;)I")
	public native int glGetUniformLocation(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenLists", descriptor = "(I)I")
	public native int glGenLists(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBindProgramARB", descriptor = "(II)V")
	public native void glBindProgramARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glVertexPointer", descriptor = "(III[BI)V")
	private void glVertexPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		this.glVertexPointer1(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glFrustum", descriptor = "(DDDDDD)V")
	private native void glFrustum(@OriginalArg(0) double arg0, @OriginalArg(1) double arg1, @OriginalArg(2) double arg2, @OriginalArg(3) double arg3, @OriginalArg(4) double arg4, @OriginalArg(5) double arg5);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexCoordPointer0", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glTexCoordPointer0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glUseProgramObjectARB", descriptor = "(I)V")
	public native void glUseProgramObjectARB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteTextures1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glDeleteTextures1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glLineWidth", descriptor = "(F)V")
	public native void glLineWidth(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glNormal3f", descriptor = "(FFF)V")
	public native void glNormal3f(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenRenderbuffersEXT", descriptor = "(I[II)V")
	public void glGenRenderbuffersEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		this.glGenRenderbuffersEXT1(arg0, arg1, arg2 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexImage2D0", descriptor = "(IIIIIIIILjava/lang/Object;I)V")
	private native void glTexImage2D0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Object arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glCullFace", descriptor = "(I)V")
	public native void glCullFace(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDrawElements", descriptor = "(III[BI)V")
	private void glDrawElements(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		this.glDrawElements1(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBufferSubDataARB", descriptor = "(III[BI)V")
	private void glBufferSubDataARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		this.glBufferSubDataARB1(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glCopyTexSubImage3D", descriptor = "(IIIIIIIII)V")
	private native void glCopyTexSubImage3D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDrawElements", descriptor = "(IIIJ)V")
	public native void glDrawElements(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDrawPixels0", descriptor = "(IIIILjava/lang/Object;I)V")
	private native void glDrawPixels0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glCreateShaderObjectARB", descriptor = "(I)I")
	public native int glCreateShaderObjectARB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteRenderbuffersEXT1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glDeleteRenderbuffersEXT1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBufferDataARB", descriptor = "(IILjava/nio/Buffer;I)V")
	public void glBufferDataARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3) {
		if (isDirect(arg2)) {
			this.glBufferDataARB0(arg0, arg1, arg2, arg3, getDirectBufferByteOffset(arg2));
		} else {
			this.glBufferDataARB1(arg0, arg1, getArray(arg2), arg3, getIndirectBufferByteOffset(arg2));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexCoordPointer", descriptor = "(III[BI)V")
	private void glTexCoordPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		this.glTexCoordPointer1(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexCoord2f", descriptor = "(FF)V")
	public native void glTexCoord2f(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glLoadIdentity", descriptor = "()V")
	public native void glLoadIdentity();

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteProgramsARB1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glDeleteProgramsARB1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetTexLevelParameteriv", descriptor = "(III[II)V")
	private void glGetTexLevelParameteriv(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		this.glGetTexLevelParameteriv1(arg0, arg1, arg2, arg3, arg4 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glScissor", descriptor = "(IIII)V")
	public native void glScissor(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glLinkProgramARB", descriptor = "(I)V")
	public native void glLinkProgramARB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glCopyTexSubImage2D", descriptor = "(IIIIIIII)V")
	public native void glCopyTexSubImage2D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexCoordPointer1", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glTexCoordPointer1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glVertexPointer0", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glVertexPointer0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPointSize", descriptor = "(F)V")
	private native void glPointSize(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBufferDataARB", descriptor = "(II[BII)V")
	private void glBufferDataARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.glBufferDataARB1(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexImage3D", descriptor = "(IIIIIIIIILjava/nio/Buffer;)V")
	public void glTexImage3D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Buffer arg9) {
		if (isDirect(arg9)) {
			this.glTexImage3D0(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, getDirectBufferByteOffset(arg9));
		} else {
			this.glTexImage3D1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, getArray(arg9), getIndirectBufferByteOffset(arg9));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenTextures", descriptor = "(I[II)V")
	public void glGenTextures(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		this.glGenTextures1(arg0, arg1, arg2 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetError", descriptor = "()I")
	private native int glGetError();

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexCoord3f", descriptor = "(FFF)V")
	private native void glTexCoord3f(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glClear", descriptor = "(I)V")
	public native void glClear(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexEnvfv1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glTexEnvfv1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDrawPixels", descriptor = "(IIIILjava/nio/Buffer;)V")
	private void glDrawPixels(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Buffer arg4) {
		if (isDirect(arg4)) {
			this.glDrawPixels0(arg0, arg1, arg2, arg3, arg4, getDirectBufferByteOffset(arg4));
		} else {
			this.glDrawPixels1(arg0, arg1, arg2, arg3, getArray(arg4), getIndirectBufferByteOffset(arg4));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexImage1D0", descriptor = "(IIIIIIILjava/lang/Object;I)V")
	private native void glTexImage1D0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Object arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glNormalPointer", descriptor = "(II[BI)V")
	private void glNormalPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		this.glNormalPointer1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glMultMatrixf", descriptor = "([FI)V")
	public void glMultMatrixf(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		this.glMultMatrixf1(arg0, arg1 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColorPointer", descriptor = "(IIIJ)V")
	public native void glColorPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glProgramLocalParameter4fvARB1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glProgramLocalParameter4fvARB1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glNormal3fv0", descriptor = "(Ljava/lang/Object;I)V")
	private native void glNormal3fv0(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glNormalPointer", descriptor = "(IIJ)V")
	public native void glNormalPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glReadPixels", descriptor = "(IIIIII[BI)V")
	private void glReadPixels(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		this.glReadPixels1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteFramebuffersEXT", descriptor = "(I[II)V")
	public void glDeleteFramebuffersEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		this.glDeleteFramebuffersEXT1(arg0, arg1, arg2 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteLists", descriptor = "(II)V")
	public native void glDeleteLists(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetFloatv", descriptor = "(I[FI)V")
	public void glGetFloatv(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		this.glGetFloatv1(arg0, arg1, arg2 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glFramebufferRenderbufferEXT", descriptor = "(IIII)V")
	public native void glFramebufferRenderbufferEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDetachObjectARB", descriptor = "(II)V")
	public native void glDetachObjectARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPixelStorei", descriptor = "(II)V")
	public native void glPixelStorei(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetProgramivARB", descriptor = "(II[II)V")
	private void glGetProgramivARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		this.glGetProgramivARB1(arg0, arg1, arg2, arg3 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glClearColor", descriptor = "(FFFF)V")
	public native void glClearColor(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPopMatrix", descriptor = "()V")
	public native void glPopMatrix();

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenProgramsARB1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glGenProgramsARB1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetBooleanv", descriptor = "(I[ZI)V")
	private void glGetBooleanv(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) int arg2) {
		this.glGetBooleanv1(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexImage3D0", descriptor = "(IIIIIIIIILjava/lang/Object;I)V")
	private native void glTexImage3D0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Object arg9, @OriginalArg(10) int arg10);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexImage2D", descriptor = "(IIIIIIII[BI)V")
	private void glTexImage2D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8, @OriginalArg(9) int arg9) {
		this.glTexImage2D1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDrawElements1", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glDrawElements1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBindFramebufferEXT", descriptor = "(II)V")
	public native void glBindFramebufferEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glFogf", descriptor = "(IF)V")
	public native void glFogf(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenerateMipmapEXT", descriptor = "(I)V")
	public native void glGenerateMipmapEXT(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDepthMask", descriptor = "(Z)V")
	public native void glDepthMask(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteBuffersARB1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glDeleteBuffersARB1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glEnd", descriptor = "()V")
	public native void glEnd();

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBegin", descriptor = "(I)V")
	public native void glBegin(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glReadPixels0", descriptor = "(IIIIIILjava/lang/Object;I)V")
	private native void glReadPixels0(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Object arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glFogfv", descriptor = "(I[FI)V")
	public void glFogfv(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		this.glFogfv1(arg0, arg1, arg2 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glActiveTexture", descriptor = "(I)V")
	public native void glActiveTexture(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBufferSubDataARB", descriptor = "(IIILjava/nio/Buffer;)V")
	public void glBufferSubDataARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Buffer arg3) {
		if (isDirect(arg3)) {
			this.glBufferSubDataARB0(arg0, arg1, arg2, arg3, getDirectBufferByteOffset(arg3));
		} else {
			this.glBufferSubDataARB1(arg0, arg1, arg2, getArray(arg3), getIndirectBufferByteOffset(arg3));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBlendEquation", descriptor = "(I)V")
	public native void glBlendEquation(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "setSwapInterval", descriptor = "(I)V")
	public void setSwapInterval(@OriginalArg(0) int arg0) {
		this.a.setSwapInterval(arg0);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glLightf", descriptor = "(IIF)V")
	public native void glLightf(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glShaderSourceARB", descriptor = "(II[Ljava/lang/String;[II)V")
	public void glShaderSourceARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		this.glShaderSourceARB0(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexImage1D", descriptor = "(IIIIIII[BI)V")
	private void glTexImage1D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) int arg8) {
		this.glTexImage1D1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glCallList", descriptor = "(I)V")
	public native void glCallList(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPixelZoom", descriptor = "(FF)V")
	private native void glPixelZoom(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glRasterPos2i", descriptor = "(II)V")
	public native void glRasterPos2i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glUniform1fARB", descriptor = "(IF)V")
	private native void glUniform1fARB(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetObjectParameterivARB1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glGetObjectParameterivARB1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glMaterialfv1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glMaterialfv1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexCoordPointer", descriptor = "(IIILjava/nio/Buffer;)V")
	public void glTexCoordPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Buffer arg3) {
		if (isDirect(arg3)) {
			this.glTexCoordPointer0(arg0, arg1, arg2, arg3, getDirectBufferByteOffset(arg3));
		} else {
			this.glTexCoordPointer1(arg0, arg1, arg2, getArray(arg3), getIndirectBufferByteOffset(arg3));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexParameteri", descriptor = "(III)V")
	public native void glTexParameteri(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColorMaterial", descriptor = "(II)V")
	public native void glColorMaterial(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexImage1D", descriptor = "(IIIIIIILjava/nio/Buffer;)V")
	public void glTexImage1D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Buffer arg7) {
		if (isDirect(arg7)) {
			this.glTexImage1D0(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, getDirectBufferByteOffset(arg7));
		} else {
			this.glTexImage1D1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, getArray(arg7), getIndirectBufferByteOffset(arg7));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetIntegerv", descriptor = "(I[II)V")
	public void glGetIntegerv(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		this.glGetIntegerv1(arg0, arg1, arg2 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColor4us", descriptor = "(SSSS)V")
	private native void glColor4us(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1, @OriginalArg(2) short arg2, @OriginalArg(3) short arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glProgramLocalParameter4fvARB", descriptor = "(IILjava/nio/FloatBuffer;)V")
	public void glProgramLocalParameter4fvARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) FloatBuffer arg2) {
		if (isDirect(arg2)) {
			this.glProgramLocalParameter4fvARB0(arg0, arg1, arg2, getDirectBufferByteOffset(arg2));
		} else {
			this.glProgramLocalParameter4fvARB1(arg0, arg1, getArray(arg2), getIndirectBufferByteOffset(arg2));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glCreateProgramObjectARB", descriptor = "()I")
	public native int glCreateProgramObjectARB();

	@OriginalMember(owner = "client!jaggl/opengl", name = "glNormal3fv", descriptor = "(Ljava/nio/FloatBuffer;)V")
	private void glNormal3fv(@OriginalArg(0) FloatBuffer arg0) {
		if (isDirect(arg0)) {
			this.glNormal3fv0(arg0, getDirectBufferByteOffset(arg0));
		} else {
			this.glNormal3fv1(getArray(arg0), getIndirectBufferByteOffset(arg0));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteFramebuffersEXT1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glDeleteFramebuffersEXT1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColor4fv1", descriptor = "(Ljava/lang/Object;I)V")
	private native void glColor4fv1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glReadPixels1", descriptor = "(IIIIIILjava/lang/Object;I)V")
	private native void glReadPixels1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Object arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetTexLevelParameteriv1", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glGetTexLevelParameteriv1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexEnvi", descriptor = "(III)V")
	public native void glTexEnvi(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glLightfv1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glLightfv1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glLightfv", descriptor = "(II[FI)V")
	public void glLightfv(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3) {
		this.glLightfv1(arg0, arg1, arg2, arg3 * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glShadeModel", descriptor = "(I)V")
	public native void glShadeModel(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glNormal3fv1", descriptor = "(Ljava/lang/Object;I)V")
	private native void glNormal3fv1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenFramebuffersEXT1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glGenFramebuffersEXT1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetFloatv", descriptor = "(ILjava/nio/FloatBuffer;)V")
	private void glGetFloatv(@OriginalArg(0) int arg0, @OriginalArg(1) FloatBuffer arg1) {
		if (isDirect(arg1)) {
			this.glGetFloatv0(arg0, arg1, getDirectBufferByteOffset(arg1));
		} else {
			this.glGetFloatv1(arg0, getArray(arg1), getIndirectBufferByteOffset(arg1));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPushMatrix", descriptor = "()V")
	public native void glPushMatrix();

	@OriginalMember(owner = "client!jaggl/opengl", name = "glInterleavedArrays1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glInterleavedArrays1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glClearDepth", descriptor = "(F)V")
	public native void glClearDepth(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenRenderbuffersEXT1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glGenRenderbuffersEXT1(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2);
}
