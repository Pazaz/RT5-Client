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

	@OriginalMember(owner = "client!jaggl/opengl", name = "<init>", descriptor = "(Lclient!jaggl/context;)V")
	public opengl(@OriginalArg(0) context arg0) {
		this.a = arg0;
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBindTexture", descriptor = "(II)V")
	public native void glBindTexture(@OriginalArg(0) int target, @OriginalArg(1) int texture);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glProgramLocalParameter4fvARB1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glProgramLocalParameter4fvARB1(@OriginalArg(0) int target, @OriginalArg(1) int index, @OriginalArg(2) Object params, @OriginalArg(3) int paramsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glInterleavedArrays0", descriptor = "(IILjava/lang/Object;I)V")
	private native void glInterleavedArrays0(@OriginalArg(0) int format, @OriginalArg(1) int stride, @OriginalArg(2) Object pointer, @OriginalArg(3) int pointerOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBufferSubDataARB0", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glBufferSubDataARB0(@OriginalArg(0) int target, @OriginalArg(1) int offset, @OriginalArg(2) int size, @OriginalArg(3) Object data, @OriginalArg(4) int dataOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glReadPixels0", descriptor = "(IIIIIILjava/lang/Object;I)V")
	private native void glReadPixels0(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int format, @OriginalArg(5) int type, @OriginalArg(6) Object pixels, @OriginalArg(7) int pixelsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glShaderSourceARB", descriptor = "(II[Ljava/lang/String;[II)V")
	public void glShaderSourceARB(@OriginalArg(0) int shaderObj, @OriginalArg(1) int count, @OriginalArg(2) String[] string, @OriginalArg(3) int[] length, @OriginalArg(4) int lengthOffset) {
		this.glShaderSourceARB0(shaderObj, count, string, length, lengthOffset);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glFogf", descriptor = "(IF)V")
	public native void glFogf(@OriginalArg(0) int pname, @OriginalArg(1) float param);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glUseProgramObjectARB", descriptor = "(I)V")
	public native void glUseProgramObjectARB(@OriginalArg(0) int programObj);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetIntegerv", descriptor = "(I[II)V")
	public void glGetIntegerv(@OriginalArg(0) int pname, @OriginalArg(1) int[] data, @OriginalArg(2) int dataOffset) {
		this.glGetIntegerv1(pname, data, dataOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexCoord2i", descriptor = "(II)V")
	private native void glTexCoord2i(@OriginalArg(0) int s, @OriginalArg(1) int t);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glReadPixels1", descriptor = "(IIIIIILjava/lang/Object;I)V")
	private native void glReadPixels1(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int format, @OriginalArg(5) int type, @OriginalArg(6) Object pixels, @OriginalArg(7) int pixelsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenFramebuffersEXT", descriptor = "(I[II)V")
	public void glGenFramebuffersEXT(@OriginalArg(0) int n, @OriginalArg(1) int[] framebuffers, @OriginalArg(2) int framebuffersOffset) {
		this.glGenFramebuffersEXT1(n, framebuffers, framebuffersOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexGenfv", descriptor = "(II[FI)V")
	public void glTexGenfv(@OriginalArg(0) int coord, @OriginalArg(1) int pname, @OriginalArg(2) float[] params, @OriginalArg(3) int paramsOffset) {
		this.glTexGenfv1(coord, pname, params, paramsOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glNormal3fv0", descriptor = "(Ljava/lang/Object;I)V")
	private native void glNormal3fv0(@OriginalArg(0) Object v, @OriginalArg(1) int vOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPushAttrib", descriptor = "(I)V")
	public native void glPushAttrib(@OriginalArg(0) int mask);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glRenderbufferStorageMultisampleEXT", descriptor = "(IIIII)V")
	private native void glRenderbufferStorageMultisampleEXT(@OriginalArg(0) int target, @OriginalArg(1) int samples, @OriginalArg(2) int internalformat, @OriginalArg(3) int width, @OriginalArg(4) int height);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexCoordPointer0", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glTexCoordPointer0(@OriginalArg(0) int size, @OriginalArg(1) int type, @OriginalArg(2) int stride, @OriginalArg(3) Object pointer, @OriginalArg(4) int pointerOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glMultMatrixf0", descriptor = "(Ljava/lang/Object;I)V")
	private native void glMultMatrixf0(@OriginalArg(0) Object m, @OriginalArg(1) int mOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenProgramsARB", descriptor = "(I[II)V")
	public void glGenProgramsARB(@OriginalArg(0) int n, @OriginalArg(1) int[] programs, @OriginalArg(2) int programsOffset) {
		this.glGenProgramsARB1(n, programs, programsOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glFogi", descriptor = "(II)V")
	public native void glFogi(@OriginalArg(0) int pname, @OriginalArg(1) int param);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPixelTransferf", descriptor = "(IF)V")
	public native void glPixelTransferf(@OriginalArg(0) int pname, @OriginalArg(1) float param);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexCoordPointer", descriptor = "(IIIJ)V")
	public native void glTexCoordPointer(@OriginalArg(0) int size, @OriginalArg(1) int type, @OriginalArg(2) int stride, @OriginalArg(3) long pointer);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glInterleavedArrays", descriptor = "(IIJ)V")
	private native void glInterleavedArrays(@OriginalArg(0) int format, @OriginalArg(1) int stride, @OriginalArg(2) long pointer);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glCreateProgramObjectARB", descriptor = "()I")
	public native int glCreateProgramObjectARB();

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetInfoLogARB1", descriptor = "(IILjava/lang/Object;I[BI)V")
	private native void glGetInfoLogARB1(@OriginalArg(0) int obj, @OriginalArg(1) int maxLength, @OriginalArg(2) Object length, @OriginalArg(3) int lengthOffset, @OriginalArg(4) byte[] infoLog, @OriginalArg(5) int infoLogOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexImage1D", descriptor = "(IIIIIIILjava/nio/Buffer;)V")
	public void glTexImage1D(@OriginalArg(0) int target, @OriginalArg(1) int level, @OriginalArg(2) int internalformat, @OriginalArg(3) int width, @OriginalArg(4) int border, @OriginalArg(5) int format, @OriginalArg(6) int type, @OriginalArg(7) Buffer pixels) {
		if (isDirect(pixels)) {
			this.glTexImage1D0(target, level, internalformat, width, border, format, type, pixels, getDirectBufferByteOffset(pixels));
		} else {
			this.glTexImage1D1(target, level, internalformat, width, border, format, type, getArray(pixels), getIndirectBufferByteOffset(pixels));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glInterleavedArrays1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glInterleavedArrays1(@OriginalArg(0) int format, @OriginalArg(1) int stride, @OriginalArg(2) Object pointer, @OriginalArg(3) int pointerOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColorMaterial", descriptor = "(II)V")
	public native void glColorMaterial(@OriginalArg(0) int face, @OriginalArg(1) int mode);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glClear", descriptor = "(I)V")
	public native void glClear(@OriginalArg(0) int mask);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteRenderbuffersEXT", descriptor = "(I[II)V")
	public void glDeleteRenderbuffersEXT(@OriginalArg(0) int n, @OriginalArg(1) int[] renderbuffers, @OriginalArg(2) int renderbuffersOffset) {
		this.glDeleteRenderbuffersEXT1(n, renderbuffers, renderbuffersOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetUniformLocation", descriptor = "(ILjava/lang/String;)I")
	public native int glGetUniformLocation(@OriginalArg(0) int program, @OriginalArg(1) String name);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glFramebufferTexture2DEXT", descriptor = "(IIIII)V")
	public native void glFramebufferTexture2DEXT(@OriginalArg(0) int target, @OriginalArg(1) int attachment, @OriginalArg(2) int textarget, @OriginalArg(3) int texture, @OriginalArg(4) int level);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexImage3D0", descriptor = "(IIIIIIIIILjava/lang/Object;I)V")
	private native void glTexImage3D0(@OriginalArg(0) int target, @OriginalArg(1) int level, @OriginalArg(2) int internalformat, @OriginalArg(3) int width, @OriginalArg(4) int height, @OriginalArg(5) int depth, @OriginalArg(6) int border, @OriginalArg(7) int format, @OriginalArg(8) int type, @OriginalArg(9) Object pixels, @OriginalArg(10) int pixelsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "isExtensionAvailable", descriptor = "(Ljava/lang/String;)Z")
	public boolean isExtensionAvailable(@OriginalArg(0) String arg0) {
		return this.a.isExtensionAvailable(arg0);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glMultMatrixf", descriptor = "([FI)V")
	public void glMultMatrixf(@OriginalArg(0) float[] m, @OriginalArg(1) int mOffset) {
		this.glMultMatrixf1(m, mOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBindRenderbufferEXT", descriptor = "(II)V")
	public native void glBindRenderbufferEXT(@OriginalArg(0) int target, @OriginalArg(1) int renderbuffer);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColorPointer", descriptor = "(IIIJ)V")
	public native void glColorPointer(@OriginalArg(0) int size, @OriginalArg(1) int type, @OriginalArg(2) int stride, @OriginalArg(3) long pointer);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteProgramsARB1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glDeleteProgramsARB1(@OriginalArg(0) int n, @OriginalArg(1) Object programs, @OriginalArg(2) int programsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glShadeModel", descriptor = "(I)V")
	public native void glShadeModel(@OriginalArg(0) int mode);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColor4ub", descriptor = "(BBBB)V")
	public native void glColor4ub(@OriginalArg(0) byte red, @OriginalArg(1) byte green, @OriginalArg(2) byte blue, @OriginalArg(3) byte alpha);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetObjectParameterivARB1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glGetObjectParameterivARB1(@OriginalArg(0) int obj, @OriginalArg(1) int pname, @OriginalArg(2) Object params, @OriginalArg(3) int paramsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glUniform2fARB", descriptor = "(IFF)V")
	private native void glUniform2fARB(@OriginalArg(0) int location, @OriginalArg(1) float v0, @OriginalArg(2) float v1);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetString", descriptor = "(I)Ljava/lang/String;")
	public native String glGetString(@OriginalArg(0) int name);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDrawBuffersARB1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glDrawBuffersARB1(@OriginalArg(0) int n, @OriginalArg(1) Object bufs, @OriginalArg(2) int bufsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDrawElements1", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glDrawElements1(@OriginalArg(0) int mode, @OriginalArg(1) int count, @OriginalArg(2) int type, @OriginalArg(3) Object indices, @OriginalArg(4) int indicesOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glEndList", descriptor = "()V")
	public native void glEndList();

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexCoordPointer", descriptor = "(IIILjava/nio/Buffer;)V")
	public void glTexCoordPointer(@OriginalArg(0) int size, @OriginalArg(1) int type, @OriginalArg(2) int stride, @OriginalArg(3) Buffer pointer) {
		if (isDirect(pointer)) {
			this.glTexCoordPointer0(size, type, stride, pointer, getDirectBufferByteOffset(pointer));
		} else {
			this.glTexCoordPointer1(size, type, stride, getArray(pointer), getIndirectBufferByteOffset(pointer));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteProgramsARB", descriptor = "(I[II)V")
	public void glDeleteProgramsARB(@OriginalArg(0) int n, @OriginalArg(1) int[] programs, @OriginalArg(2) int programsOffset) {
		this.glDeleteProgramsARB1(n, programs, programsOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexImage3D1", descriptor = "(IIIIIIIIILjava/lang/Object;I)V")
	private native void glTexImage3D1(@OriginalArg(0) int target, @OriginalArg(1) int level, @OriginalArg(2) int internalformat, @OriginalArg(3) int width, @OriginalArg(4) int height, @OriginalArg(5) int depth, @OriginalArg(6) int border, @OriginalArg(7) int format, @OriginalArg(8) int type, @OriginalArg(9) Object pixels, @OriginalArg(10) int pixelsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColor4us", descriptor = "(SSSS)V")
	private native void glColor4us(@OriginalArg(0) short red, @OriginalArg(1) short green, @OriginalArg(2) short blue, @OriginalArg(3) short alpha);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glCallList", descriptor = "(I)V")
	public native void glCallList(@OriginalArg(0) int list);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDrawElements", descriptor = "(IIIJ)V")
	public native void glDrawElements(@OriginalArg(0) int mode, @OriginalArg(1) int count, @OriginalArg(2) int type, @OriginalArg(3) long indices);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteRenderbuffersEXT1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glDeleteRenderbuffersEXT1(@OriginalArg(0) int n, @OriginalArg(1) Object renderbuffers, @OriginalArg(2) int renderbuffersOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetObjectParameterivARB", descriptor = "(II[II)V")
	public void glGetObjectParameterivARB(@OriginalArg(0) int obj, @OriginalArg(1) int pname, @OriginalArg(2) int[] params, @OriginalArg(3) int paramsOffset) {
		this.glGetObjectParameterivARB1(obj, pname, params, paramsOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glCreateShaderObjectARB", descriptor = "(I)I")
	public native int glCreateShaderObjectARB(@OriginalArg(0) int shaderType);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColor4f", descriptor = "(FFFF)V")
	private native void glColor4f(@OriginalArg(0) float red, @OriginalArg(1) float green, @OriginalArg(2) float blue, @OriginalArg(3) float alpha);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glNormal3f", descriptor = "(FFF)V")
	public native void glNormal3f(@OriginalArg(0) float nx, @OriginalArg(1) float ny, @OriginalArg(2) float nz);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetInfoLogARB", descriptor = "(II[II[BI)V")
	public void glGetInfoLogARB(@OriginalArg(0) int obj, @OriginalArg(1) int maxLength, @OriginalArg(2) int[] length, @OriginalArg(3) int lengthOffset, @OriginalArg(4) byte[] infoLog, @OriginalArg(5) int infoLogOffset) {
		this.glGetInfoLogARB1(obj, maxLength, length, lengthOffset, infoLog, infoLogOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glLoadMatrixf1", descriptor = "(Ljava/lang/Object;I)V")
	private native void glLoadMatrixf1(@OriginalArg(0) Object m, @OriginalArg(1) int mOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexParameterf", descriptor = "(IIF)V")
	private native void glTexParameterf(@OriginalArg(0) int target, @OriginalArg(1) int pname, @OriginalArg(2) float param);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexEnvf", descriptor = "(IIF)V")
	public native void glTexEnvf(@OriginalArg(0) int target, @OriginalArg(1) int pname, @OriginalArg(2) float param);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glUniform1fARB", descriptor = "(IF)V")
	private native void glUniform1fARB(@OriginalArg(0) int location, @OriginalArg(1) float v0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexGeni", descriptor = "(III)V")
	public native void glTexGeni(@OriginalArg(0) int coord, @OriginalArg(1) int pname, @OriginalArg(2) int param);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBlendFunc", descriptor = "(II)V")
	public native void glBlendFunc(@OriginalArg(0) int sfactor, @OriginalArg(1) int dfactor);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexImage2D1", descriptor = "(IIIIIIIILjava/lang/Object;I)V")
	private native void glTexImage2D1(@OriginalArg(0) int target, @OriginalArg(1) int level, @OriginalArg(2) int internalformat, @OriginalArg(3) int width, @OriginalArg(4) int height, @OriginalArg(5) int border, @OriginalArg(6) int format, @OriginalArg(7) int type, @OriginalArg(8) Object pixels, @OriginalArg(9) int pixelsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBufferSubDataARB1", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glBufferSubDataARB1(@OriginalArg(0) int target, @OriginalArg(1) int offset, @OriginalArg(2) int size, @OriginalArg(3) Object data, @OriginalArg(4) int dataOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glLightModelfv", descriptor = "(I[FI)V")
	public void glLightModelfv(@OriginalArg(0) int pname, @OriginalArg(1) float[] params, @OriginalArg(2) int paramsOffset) {
		this.glLightModelfv1(pname, params, paramsOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexImage2D", descriptor = "(IIIIIIIILjava/nio/Buffer;)V")
	public void glTexImage2D(@OriginalArg(0) int target, @OriginalArg(1) int level, @OriginalArg(2) int internalformat, @OriginalArg(3) int width, @OriginalArg(4) int height, @OriginalArg(5) int border, @OriginalArg(6) int format, @OriginalArg(7) int type, @OriginalArg(8) Buffer pixels) {
		if (isDirect(pixels)) {
			this.glTexImage2D0(target, level, internalformat, width, height, border, format, type, pixels, getDirectBufferByteOffset(pixels));
		} else {
			this.glTexImage2D1(target, level, internalformat, width, height, border, format, type, getArray(pixels), getIndirectBufferByteOffset(pixels));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glVertexPointer0", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glVertexPointer0(@OriginalArg(0) int size, @OriginalArg(1) int type, @OriginalArg(2) int stride, @OriginalArg(3) Object pointer, @OriginalArg(4) int pointerOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetFloatv1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glGetFloatv1(@OriginalArg(0) int pname, @OriginalArg(1) Object data, @OriginalArg(2) int dataOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColorMask", descriptor = "(ZZZZ)V")
	public native void glColorMask(@OriginalArg(0) boolean red, @OriginalArg(1) boolean green, @OriginalArg(2) boolean blue, @OriginalArg(3) boolean alpha);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColor3f", descriptor = "(FFF)V")
	public native void glColor3f(@OriginalArg(0) float red, @OriginalArg(1) float green, @OriginalArg(2) float blue);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBlitFramebufferEXT", descriptor = "(IIIIIIIIII)V")
	private native void glBlitFramebufferEXT(@OriginalArg(0) int srcX0, @OriginalArg(1) int srcY0, @OriginalArg(2) int srcX1, @OriginalArg(3) int srcY1, @OriginalArg(4) int dstX0, @OriginalArg(5) int dstY0, @OriginalArg(6) int dstX1, @OriginalArg(7) int dstY1, @OriginalArg(8) int mask, @OriginalArg(9) int filter);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenTextures1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glGenTextures1(@OriginalArg(0) int n, @OriginalArg(1) Object textures, @OriginalArg(2) int texturesOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDisableClientState", descriptor = "(I)V")
	public native void glDisableClientState(@OriginalArg(0) int array);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glReadBuffer", descriptor = "(I)V")
	public native void glReadBuffer(@OriginalArg(0) int src);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glFlush", descriptor = "()V")
	public native void glFlush();

	@OriginalMember(owner = "client!jaggl/opengl", name = "glCopyPixels", descriptor = "(IIIII)V")
	public native void glCopyPixels(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int type);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glLightModelfv1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glLightModelfv1(@OriginalArg(0) int pname, @OriginalArg(1) Object params, @OriginalArg(2) int paramsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glMaterialfv1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glMaterialfv1(@OriginalArg(0) int face, @OriginalArg(1) int pname, @OriginalArg(2) Object params, @OriginalArg(3) int paramsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexEnvi", descriptor = "(III)V")
	public native void glTexEnvi(@OriginalArg(0) int target, @OriginalArg(1) int pname, @OriginalArg(2) int param);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glVertexPointer1", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glVertexPointer1(@OriginalArg(0) int size, @OriginalArg(1) int type, @OriginalArg(2) int stride, @OriginalArg(3) Object pointer, @OriginalArg(4) int pointerOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBindFramebufferEXT", descriptor = "(II)V")
	public native void glBindFramebufferEXT(@OriginalArg(0) int target, @OriginalArg(1) int framebuffer);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDrawPixels1", descriptor = "(IIIILjava/lang/Object;I)V")
	private native void glDrawPixels1(@OriginalArg(0) int width, @OriginalArg(1) int height, @OriginalArg(2) int format, @OriginalArg(3) int type, @OriginalArg(4) Object pixels, @OriginalArg(5) int pixelsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexSubImage2D0", descriptor = "(IIIIIIIILjava/lang/Object;I)V")
	private native void glTexSubImage2D0(@OriginalArg(0) int target, @OriginalArg(1) int level, @OriginalArg(2) int xoffset, @OriginalArg(3) int yoffset, @OriginalArg(4) int width, @OriginalArg(5) int height, @OriginalArg(6) int format, @OriginalArg(7) int type, @OriginalArg(8) Object pixels, @OriginalArg(9) int pixelsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColorPointer1", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glColorPointer1(@OriginalArg(0) int size, @OriginalArg(1) int type, @OriginalArg(2) int stride, @OriginalArg(3) Object pointer, @OriginalArg(4) int pointerOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glLinkProgramARB", descriptor = "(I)V")
	public native void glLinkProgramARB(@OriginalArg(0) int programObj);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glVertexPointer", descriptor = "(IIILjava/nio/Buffer;)V")
	public void glVertexPointer(@OriginalArg(0) int size, @OriginalArg(1) int type, @OriginalArg(2) int stride, @OriginalArg(3) Buffer pointer) {
		if (isDirect(pointer)) {
			this.glVertexPointer0(size, type, stride, pointer, getDirectBufferByteOffset(pointer));
		} else {
			this.glVertexPointer1(size, type, stride, getArray(pointer), getIndirectBufferByteOffset(pointer));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDrawElements0", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glDrawElements0(@OriginalArg(0) int mode, @OriginalArg(1) int count, @OriginalArg(2) int type, @OriginalArg(3) Object indices, @OriginalArg(4) int indicesOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glLightfv1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glLightfv1(@OriginalArg(0) int light, @OriginalArg(1) int pname, @OriginalArg(2) Object params, @OriginalArg(3) int paramsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenerateMipmapEXT", descriptor = "(I)V")
	public native void glGenerateMipmapEXT(@OriginalArg(0) int target);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glProgramStringARB", descriptor = "(IIILjava/lang/String;)V")
	public native void glProgramStringARB(@OriginalArg(0) int target, @OriginalArg(1) int format, @OriginalArg(2) int len, @OriginalArg(3) String string);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexCoord2f", descriptor = "(FF)V")
	public native void glTexCoord2f(@OriginalArg(0) float s, @OriginalArg(1) float t);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glNormalPointer1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glNormalPointer1(@OriginalArg(0) int type, @OriginalArg(1) int stride, @OriginalArg(2) Object pointer, @OriginalArg(3) int pointerOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glFramebufferTexture3DEXT", descriptor = "(IIIIII)V")
	public native void glFramebufferTexture3DEXT(@OriginalArg(0) int target, @OriginalArg(1) int attachment, @OriginalArg(2) int textarget, @OriginalArg(3) int texture, @OriginalArg(4) int level, @OriginalArg(5) int zoffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexImage2D0", descriptor = "(IIIIIIIILjava/lang/Object;I)V")
	private native void glTexImage2D0(@OriginalArg(0) int target, @OriginalArg(1) int level, @OriginalArg(2) int internalformat, @OriginalArg(3) int width, @OriginalArg(4) int height, @OriginalArg(5) int border, @OriginalArg(6) int format, @OriginalArg(7) int type, @OriginalArg(8) Object pixels, @OriginalArg(9) int pixelsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBufferDataARB1", descriptor = "(IILjava/lang/Object;II)V")
	private native void glBufferDataARB1(@OriginalArg(0) int target, @OriginalArg(1) int size, @OriginalArg(2) Object data, @OriginalArg(3) int dataOffset, @OriginalArg(4) int usage);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetIntegerv1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glGetIntegerv1(@OriginalArg(0) int pname, @OriginalArg(1) Object data, @OriginalArg(2) int dataOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glViewport", descriptor = "(IIII)V")
	public native void glViewport(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPopAttrib", descriptor = "()V")
	public native void glPopAttrib();

	@OriginalMember(owner = "client!jaggl/opengl", name = "glMultiTexCoord2i", descriptor = "(III)V")
	private native void glMultiTexCoord2i(@OriginalArg(0) int target, @OriginalArg(1) int s, @OriginalArg(2) int t);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPixelZoom", descriptor = "(FF)V")
	private native void glPixelZoom(@OriginalArg(0) float xfactor, @OriginalArg(1) float yfactor);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexCoord3f", descriptor = "(FFF)V")
	private native void glTexCoord3f(@OriginalArg(0) float s, @OriginalArg(1) float t, @OriginalArg(2) float r);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteBuffersARB1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glDeleteBuffersARB1(@OriginalArg(0) int n, @OriginalArg(1) Object buffers, @OriginalArg(2) int buffersOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glLineWidth", descriptor = "(F)V")
	public native void glLineWidth(@OriginalArg(0) float width);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPopMatrix", descriptor = "()V")
	public native void glPopMatrix();

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenTextures", descriptor = "(I[II)V")
	public void glGenTextures(@OriginalArg(0) int n, @OriginalArg(1) int[] textures, @OriginalArg(2) int texturesOffset) {
		this.glGenTextures1(n, textures, texturesOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenLists", descriptor = "(I)I")
	public native int glGenLists(@OriginalArg(0) int range);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glNewList", descriptor = "(II)V")
	public native void glNewList(@OriginalArg(0) int list, @OriginalArg(1) int mode);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glEnd", descriptor = "()V")
	public native void glEnd();

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDepthMask", descriptor = "(Z)V")
	public native void glDepthMask(@OriginalArg(0) boolean flag);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexImage1D0", descriptor = "(IIIIIIILjava/lang/Object;I)V")
	private native void glTexImage1D0(@OriginalArg(0) int target, @OriginalArg(1) int level, @OriginalArg(2) int internalformat, @OriginalArg(3) int width, @OriginalArg(4) int border, @OriginalArg(5) int format, @OriginalArg(6) int type, @OriginalArg(7) Object pixels, @OriginalArg(8) int pixelsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexParameteri", descriptor = "(III)V")
	public native void glTexParameteri(@OriginalArg(0) int target, @OriginalArg(1) int pname, @OriginalArg(2) int param);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glEnableClientState", descriptor = "(I)V")
	public native void glEnableClientState(@OriginalArg(0) int array);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPolygonMode", descriptor = "(II)V")
	public native void glPolygonMode(@OriginalArg(0) int face, @OriginalArg(1) int mode);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexImage3D", descriptor = "(IIIIIIIIILjava/nio/Buffer;)V")
	public void glTexImage3D(@OriginalArg(0) int target, @OriginalArg(1) int level, @OriginalArg(2) int internalformat, @OriginalArg(3) int width, @OriginalArg(4) int height, @OriginalArg(5) int depth, @OriginalArg(6) int border, @OriginalArg(7) int format, @OriginalArg(8) int type, @OriginalArg(9) Buffer pixels) {
		if (isDirect(pixels)) {
			this.glTexImage3D0(target, level, internalformat, width, height, depth, border, format, type, pixels, getDirectBufferByteOffset(pixels));
		} else {
			this.glTexImage3D1(target, level, internalformat, width, height, depth, border, format, type, getArray(pixels), getIndirectBufferByteOffset(pixels));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glHint", descriptor = "(II)V")
	public native void glHint(@OriginalArg(0) int target, @OriginalArg(1) int mode);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexImage1D1", descriptor = "(IIIIIIILjava/lang/Object;I)V")
	private native void glTexImage1D1(@OriginalArg(0) int target, @OriginalArg(1) int level, @OriginalArg(2) int internalformat, @OriginalArg(3) int width, @OriginalArg(4) int border, @OriginalArg(5) int format, @OriginalArg(6) int type, @OriginalArg(7) Object pixels, @OriginalArg(8) int pixelsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBindProgramARB", descriptor = "(II)V")
	public native void glBindProgramARB(@OriginalArg(0) int target, @OriginalArg(1) int program);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteLists", descriptor = "(II)V")
	public native void glDeleteLists(@OriginalArg(0) int list, @OriginalArg(1) int range);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexSubImage2D", descriptor = "(IIIIIIIILjava/nio/Buffer;)V")
	public void glTexSubImage2D(@OriginalArg(0) int target, @OriginalArg(1) int level, @OriginalArg(2) int xoffset, @OriginalArg(3) int yoffset, @OriginalArg(4) int width, @OriginalArg(5) int height, @OriginalArg(6) int format, @OriginalArg(7) int type, @OriginalArg(8) Buffer pixels) {
		if (isDirect(pixels)) {
			this.glTexSubImage2D0(target, level, xoffset, yoffset, width, height, format, type, pixels, getDirectBufferByteOffset(pixels));
		} else {
			this.glTexSubImage2D1(target, level, xoffset, yoffset, width, height, format, type, getArray(pixels), getIndirectBufferByteOffset(pixels));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDetachObjectARB", descriptor = "(II)V")
	public native void glDetachObjectARB(@OriginalArg(0) int containerObj, @OriginalArg(1) int attachedObj);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glNormalPointer", descriptor = "(IIJ)V")
	public native void glNormalPointer(@OriginalArg(0) int type, @OriginalArg(1) int stride, @OriginalArg(2) long pointer);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glProgramLocalParameter4fvARB0", descriptor = "(IILjava/lang/Object;I)V")
	private native void glProgramLocalParameter4fvARB0(@OriginalArg(0) int target, @OriginalArg(1) int index, @OriginalArg(2) Object params, @OriginalArg(3) int paramsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexSubImage2D1", descriptor = "(IIIIIIIILjava/lang/Object;I)V")
	private native void glTexSubImage2D1(@OriginalArg(0) int target, @OriginalArg(1) int level, @OriginalArg(2) int xoffset, @OriginalArg(3) int yoffset, @OriginalArg(4) int width, @OriginalArg(5) int height, @OriginalArg(6) int format, @OriginalArg(7) int type, @OriginalArg(8) Object pixels, @OriginalArg(9) int pixelsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColorPointer0", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glColorPointer0(@OriginalArg(0) int size, @OriginalArg(1) int type, @OriginalArg(2) int stride, @OriginalArg(3) Object pointer, @OriginalArg(4) int pointerOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetFloatv", descriptor = "(I[FI)V")
	public void glGetFloatv(@OriginalArg(0) int pname, @OriginalArg(1) float[] data, @OriginalArg(2) int dataOffset) {
		this.glGetFloatv1(pname, data, dataOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glLightfv", descriptor = "(II[FI)V")
	public void glLightfv(@OriginalArg(0) int light, @OriginalArg(1) int pname, @OriginalArg(2) float[] params, @OriginalArg(3) int paramsOffset) {
		this.glLightfv1(light, pname, params, paramsOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDrawBuffer", descriptor = "(I)V")
	public native void glDrawBuffer(@OriginalArg(0) int buf);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glCopyTexSubImage2D", descriptor = "(IIIIIIII)V")
	public native void glCopyTexSubImage2D(@OriginalArg(0) int target, @OriginalArg(1) int level, @OriginalArg(2) int xoffset, @OriginalArg(3) int yoffset, @OriginalArg(4) int x, @OriginalArg(5) int y, @OriginalArg(6) int width, @OriginalArg(7) int height);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenFramebuffersEXT1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glGenFramebuffersEXT1(@OriginalArg(0) int n, @OriginalArg(1) Object framebuffers, @OriginalArg(2) int framebuffersOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glClientActiveTexture", descriptor = "(I)V")
	private native void glClientActiveTexture(@OriginalArg(0) int texture);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDisable", descriptor = "(I)V")
	public native void glDisable(@OriginalArg(0) int cap);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glCompileShaderARB", descriptor = "(I)V")
	public native void glCompileShaderARB(@OriginalArg(0) int shaderObj);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glVertex2i", descriptor = "(II)V")
	public native void glVertex2i(@OriginalArg(0) int x, @OriginalArg(1) int y);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glVertex2f", descriptor = "(FF)V")
	public native void glVertex2f(@OriginalArg(0) float x, @OriginalArg(1) float y);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexGenfv1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glTexGenfv1(@OriginalArg(0) int coord, @OriginalArg(1) int pname, @OriginalArg(2) Object params, @OriginalArg(3) int paramsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glMultiTexCoord2f", descriptor = "(IFF)V")
	public native void glMultiTexCoord2f(@OriginalArg(0) int target, @OriginalArg(1) float s, @OriginalArg(2) float t);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glFogfv", descriptor = "(I[FI)V")
	public void glFogfv(@OriginalArg(0) int pname, @OriginalArg(1) float[] params, @OriginalArg(2) int paramsOffset) {
		this.glFogfv1(pname, params, paramsOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glScalef", descriptor = "(FFF)V")
	public native void glScalef(@OriginalArg(0) float x, @OriginalArg(1) float y, @OriginalArg(2) float z);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glProgramLocalParameter4fARB", descriptor = "(IIFFFF)V")
	public native void glProgramLocalParameter4fARB(@OriginalArg(0) int target, @OriginalArg(1) int index, @OriginalArg(2) float x, @OriginalArg(3) float y, @OriginalArg(4) float z, @OriginalArg(5) float w);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glClearDepth", descriptor = "(F)V")
	public native void glClearDepth(@OriginalArg(0) float depth);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glScissor", descriptor = "(IIII)V")
	public native void glScissor(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glLoadMatrixf", descriptor = "([FI)V")
	public void glLoadMatrixf(@OriginalArg(0) float[] m, @OriginalArg(1) int mOffset) {
		this.glLoadMatrixf1(m, mOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteTextures1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glDeleteTextures1(@OriginalArg(0) int n, @OriginalArg(1) Object textures, @OriginalArg(2) int texturesOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteTextures", descriptor = "(I[II)V")
	public void glDeleteTextures(@OriginalArg(0) int n, @OriginalArg(1) int[] textures, @OriginalArg(2) int texturesOffset) {
		this.glDeleteTextures1(n, textures, texturesOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glFogfv1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glFogfv1(@OriginalArg(0) int pname, @OriginalArg(1) Object params, @OriginalArg(2) int paramsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColorPointer", descriptor = "(IIILjava/nio/Buffer;)V")
	public void glColorPointer(@OriginalArg(0) int size, @OriginalArg(1) int type, @OriginalArg(2) int stride, @OriginalArg(3) Buffer pointer) {
		if (isDirect(pointer)) {
			this.glColorPointer0(size, type, stride, pointer, getDirectBufferByteOffset(pointer));
		} else {
			this.glColorPointer1(size, type, stride, getArray(pointer), getIndirectBufferByteOffset(pointer));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glCullFace", descriptor = "(I)V")
	public native void glCullFace(@OriginalArg(0) int mode);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexCoordPointer1", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glTexCoordPointer1(@OriginalArg(0) int size, @OriginalArg(1) int type, @OriginalArg(2) int stride, @OriginalArg(3) Object pointer, @OriginalArg(4) int pointerOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glUniform3fARB", descriptor = "(IFFF)V")
	public native void glUniform3fARB(@OriginalArg(0) int location, @OriginalArg(1) float v0, @OriginalArg(2) float v1, @OriginalArg(3) float v2);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glProgramLocalParameter4fvARB", descriptor = "(II[FI)V")
	public void glProgramLocalParameter4fvARB(@OriginalArg(0) int target, @OriginalArg(1) int index, @OriginalArg(2) float[] params, @OriginalArg(3) int paramsOffset) {
		this.glProgramLocalParameter4fvARB1(target, index, params, paramsOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexEnvfv", descriptor = "(II[FI)V")
	public void glTexEnvfv(@OriginalArg(0) int target, @OriginalArg(1) int pname, @OriginalArg(2) float[] params, @OriginalArg(3) int paramsOffset) {
		this.glTexEnvfv1(target, pname, params, paramsOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glFrustum", descriptor = "(DDDDDD)V")
	private native void glFrustum(@OriginalArg(0) double left, @OriginalArg(1) double right, @OriginalArg(2) double bottom, @OriginalArg(3) double top, @OriginalArg(4) double zNear, @OriginalArg(5) double zFar);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetError", descriptor = "()I")
	private native int glGetError();

	@OriginalMember(owner = "client!jaggl/opengl", name = "glEnable", descriptor = "(I)V")
	public native void glEnable(@OriginalArg(0) int cap);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteObjectARB", descriptor = "(I)V")
	public native void glDeleteObjectARB(@OriginalArg(0) int obj);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glMatrixMode", descriptor = "(I)V")
	public native void glMatrixMode(@OriginalArg(0) int mode);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glLightf", descriptor = "(IIF)V")
	public native void glLightf(@OriginalArg(0) int light, @OriginalArg(1) int pname, @OriginalArg(2) float param);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPixelStorei", descriptor = "(II)V")
	public native void glPixelStorei(@OriginalArg(0) int pname, @OriginalArg(1) int param);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glActiveTexture", descriptor = "(I)V")
	public native void glActiveTexture(@OriginalArg(0) int texture);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBufferSubDataARB", descriptor = "(IIILjava/nio/Buffer;)V")
	public void glBufferSubDataARB(@OriginalArg(0) int target, @OriginalArg(1) int offset, @OriginalArg(2) int size, @OriginalArg(3) Buffer data) {
		if (isDirect(data)) {
			this.glBufferSubDataARB0(target, offset, size, data, getDirectBufferByteOffset(data));
		} else {
			this.glBufferSubDataARB1(target, offset, size, getArray(data), getIndirectBufferByteOffset(data));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTranslatef", descriptor = "(FFF)V")
	public native void glTranslatef(@OriginalArg(0) float x, @OriginalArg(1) float y, @OriginalArg(2) float z);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glCopyTexImage2D", descriptor = "(IIIIIIII)V")
	public native void glCopyTexImage2D(@OriginalArg(0) int target, @OriginalArg(1) int level, @OriginalArg(2) int internalformat, @OriginalArg(3) int x, @OriginalArg(4) int y, @OriginalArg(5) int width, @OriginalArg(6) int height, @OriginalArg(7) int border);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPushMatrix", descriptor = "()V")
	public native void glPushMatrix();

	@OriginalMember(owner = "client!jaggl/opengl", name = "glNormalPointer", descriptor = "(IILjava/nio/Buffer;)V")
	public void glNormalPointer(@OriginalArg(0) int type, @OriginalArg(1) int stride, @OriginalArg(2) Buffer pointer) {
		if (isDirect(pointer)) {
			this.glNormalPointer0(type, stride, pointer, getDirectBufferByteOffset(pointer));
		} else {
			this.glNormalPointer1(type, stride, getArray(pointer), getIndirectBufferByteOffset(pointer));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteFramebuffersEXT1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glDeleteFramebuffersEXT1(@OriginalArg(0) int n, @OriginalArg(1) Object framebuffers, @OriginalArg(2) int framebuffersOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDrawElements", descriptor = "(IIILjava/nio/Buffer;)V")
	public void glDrawElements(@OriginalArg(0) int mode, @OriginalArg(1) int count, @OriginalArg(2) int type, @OriginalArg(3) Buffer indices) {
		if (isDirect(indices)) {
			this.glDrawElements0(mode, count, type, indices, getDirectBufferByteOffset(indices));
		} else {
			this.glDrawElements1(mode, count, type, getArray(indices), getIndirectBufferByteOffset(indices));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glUniform1iARB", descriptor = "(II)V")
	public native void glUniform1iARB(@OriginalArg(0) int location, @OriginalArg(1) int v0);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetFloatv0", descriptor = "(ILjava/lang/Object;I)V")
	private native void glGetFloatv0(@OriginalArg(0) int pname, @OriginalArg(1) Object data, @OriginalArg(2) int dataOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBegin", descriptor = "(I)V")
	public native void glBegin(@OriginalArg(0) int mode);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glVertexPointer", descriptor = "(IIIJ)V")
	public native void glVertexPointer(@OriginalArg(0) int size, @OriginalArg(1) int type, @OriginalArg(2) int stride, @OriginalArg(3) long pointer);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteFramebuffersEXT", descriptor = "(I[II)V")
	public void glDeleteFramebuffersEXT(@OriginalArg(0) int n, @OriginalArg(1) int[] framebuffers, @OriginalArg(2) int framebuffersOffset) {
		this.glDeleteFramebuffersEXT1(n, framebuffers, framebuffersOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glAttachObjectARB", descriptor = "(II)V")
	public native void glAttachObjectARB(@OriginalArg(0) int containerObj, @OriginalArg(1) int obj);

	@OriginalMember(owner = "client!jaggl/opengl", name = "setSwapInterval", descriptor = "(I)V")
	public void setSwapInterval(@OriginalArg(0) int arg0) {
		this.a.setSwapInterval(arg0);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDrawArrays", descriptor = "(III)V")
	public native void glDrawArrays(@OriginalArg(0) int mode, @OriginalArg(1) int first, @OriginalArg(2) int count);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glRenderbufferStorageEXT", descriptor = "(IIII)V")
	public native void glRenderbufferStorageEXT(@OriginalArg(0) int target, @OriginalArg(1) int internalformat, @OriginalArg(2) int width, @OriginalArg(3) int height);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColor4fv1", descriptor = "(Ljava/lang/Object;I)V")
	private native void glColor4fv1(@OriginalArg(0) Object v, @OriginalArg(1) int vOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBufferDataARB0", descriptor = "(IILjava/lang/Object;II)V")
	private native void glBufferDataARB0(@OriginalArg(0) int target, @OriginalArg(1) int size, @OriginalArg(2) Object data, @OriginalArg(3) int dataOffset, @OriginalArg(4) int usage);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetProgramivARB1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glGetProgramivARB1(@OriginalArg(0) int target, @OriginalArg(1) int pname, @OriginalArg(2) Object params, @OriginalArg(3) int paramsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glNormalPointer0", descriptor = "(IILjava/lang/Object;I)V")
	private native void glNormalPointer0(@OriginalArg(0) int type, @OriginalArg(1) int stride, @OriginalArg(2) Object pointer, @OriginalArg(3) int pointerOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDepthFunc", descriptor = "(I)V")
	public native void glDepthFunc(@OriginalArg(0) int func);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glRasterPos2i", descriptor = "(II)V")
	public native void glRasterPos2i(@OriginalArg(0) int x, @OriginalArg(1) int y);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glOrtho", descriptor = "(DDDDDD)V")
	public native void glOrtho(@OriginalArg(0) double left, @OriginalArg(1) double right, @OriginalArg(2) double bottom, @OriginalArg(3) double top, @OriginalArg(4) double zNear, @OriginalArg(5) double zFar);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBufferDataARB", descriptor = "(IILjava/nio/Buffer;I)V")
	public void glBufferDataARB(@OriginalArg(0) int target, @OriginalArg(1) int size, @OriginalArg(2) Buffer data, @OriginalArg(3) int usage) {
		if (isDirect(data)) {
			this.glBufferDataARB0(target, size, data, usage, getDirectBufferByteOffset(data));
		} else {
			this.glBufferDataARB1(target, size, getArray(data), usage, getIndirectBufferByteOffset(data));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenProgramsARB1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glGenProgramsARB1(@OriginalArg(0) int n, @OriginalArg(1) Object programs, @OriginalArg(2) int programsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenRenderbuffersEXT", descriptor = "(I[II)V")
	public void glGenRenderbuffersEXT(@OriginalArg(0) int n, @OriginalArg(1) int[] renderbuffers, @OriginalArg(2) int renderbuffersOffset) {
		this.glGenRenderbuffersEXT1(n, renderbuffers, renderbuffersOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glAlphaFunc", descriptor = "(IF)V")
	public native void glAlphaFunc(@OriginalArg(0) int func, @OriginalArg(1) float ref);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glMultMatrixf1", descriptor = "(Ljava/lang/Object;I)V")
	private native void glMultMatrixf1(@OriginalArg(0) Object m, @OriginalArg(1) int mOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenBuffersARB", descriptor = "(I[II)V")
	public void glGenBuffersARB(@OriginalArg(0) int n, @OriginalArg(1) int[] buffers, @OriginalArg(2) int buffersOffset) {
		this.glGenBuffersARB1(n, buffers, buffersOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glCheckFramebufferStatusEXT", descriptor = "(I)I")
	public native int glCheckFramebufferStatusEXT(@OriginalArg(0) int target);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBindBufferARB", descriptor = "(II)V")
	public native void glBindBufferARB(@OriginalArg(0) int target, @OriginalArg(1) int buffer);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glColor3ub", descriptor = "(BBB)V")
	private native void glColor3ub(@OriginalArg(0) byte red, @OriginalArg(1) byte green, @OriginalArg(2) byte blue);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDrawPixels0", descriptor = "(IIIILjava/lang/Object;I)V")
	private native void glDrawPixels0(@OriginalArg(0) int width, @OriginalArg(1) int height, @OriginalArg(2) int format, @OriginalArg(3) int type, @OriginalArg(4) Object pixels, @OriginalArg(5) int pixelsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glDeleteBuffersARB", descriptor = "(I[II)V")
	public void glDeleteBuffersARB(@OriginalArg(0) int n, @OriginalArg(1) int[] buffers, @OriginalArg(2) int buffersOffset) {
		this.glDeleteBuffersARB1(n, buffers, buffersOffset * 4);
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glTexEnvfv1", descriptor = "(IILjava/lang/Object;I)V")
	private native void glTexEnvfv1(@OriginalArg(0) int target, @OriginalArg(1) int pname, @OriginalArg(2) Object params, @OriginalArg(3) int paramsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPointParameterfARB", descriptor = "(IF)V")
	private native void glPointParameterfARB(@OriginalArg(0) int pname, @OriginalArg(1) float param);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPointSize", descriptor = "(F)V")
	private native void glPointSize(@OriginalArg(0) float size);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glLoadIdentity", descriptor = "()V")
	public native void glLoadIdentity();

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBlendFuncSeparateEXT", descriptor = "(IIII)V")
	private native void glBlendFuncSeparateEXT(@OriginalArg(0) int sfactorRGB, @OriginalArg(1) int dfactorRGB, @OriginalArg(2) int sfactorAlpha, @OriginalArg(3) int dfactorAlpha);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glReadPixels", descriptor = "(IIIIIILjava/nio/Buffer;)V")
	public void glReadPixels(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int width, @OriginalArg(3) int height, @OriginalArg(4) int format, @OriginalArg(5) int type, @OriginalArg(6) Buffer pixels) {
		if (isDirect(pixels)) {
			this.glReadPixels0(x, y, width, height, format, type, pixels, getDirectBufferByteOffset(pixels));
		} else {
			this.glReadPixels1(x, y, width, height, format, type, getArray(pixels), getIndirectBufferByteOffset(pixels));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glUniform4fARB", descriptor = "(IFFFF)V")
	private native void glUniform4fARB(@OriginalArg(0) int location, @OriginalArg(1) float v0, @OriginalArg(2) float v1, @OriginalArg(3) float v2, @OriginalArg(4) float v3);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glPointParameterfvARB1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glPointParameterfvARB1(@OriginalArg(0) int pname, @OriginalArg(1) Object params, @OriginalArg(2) int paramsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glShaderSourceARB0", descriptor = "(IILjava/lang/Object;[II)V")
	private native void glShaderSourceARB0(@OriginalArg(0) int shaderObj, @OriginalArg(1) int count, @OriginalArg(2) Object string, @OriginalArg(3) int[] length, @OriginalArg(4) int lengthOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glCopyTexSubImage3D", descriptor = "(IIIIIIIII)V")
	private native void glCopyTexSubImage3D(@OriginalArg(0) int target, @OriginalArg(1) int level, @OriginalArg(2) int xoffset, @OriginalArg(3) int yoffset, @OriginalArg(4) int zoffset, @OriginalArg(5) int x, @OriginalArg(6) int y, @OriginalArg(7) int width, @OriginalArg(8) int height);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glNormal3fv1", descriptor = "(Ljava/lang/Object;I)V")
	private native void glNormal3fv1(@OriginalArg(0) Object v, @OriginalArg(1) int vOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glProgramLocalParameter4fvARB", descriptor = "(IILjava/nio/FloatBuffer;)V")
	public void glProgramLocalParameter4fvARB(@OriginalArg(0) int target, @OriginalArg(1) int index, @OriginalArg(2) FloatBuffer params) {
		if (isDirect(params)) {
			this.glProgramLocalParameter4fvARB0(target, index, params, getDirectBufferByteOffset(params));
		} else {
			this.glProgramLocalParameter4fvARB1(target, index, getArray(params), getIndirectBufferByteOffset(params));
		}
	}

	@OriginalMember(owner = "client!jaggl/opengl", name = "glClearColor", descriptor = "(FFFF)V")
	public native void glClearColor(@OriginalArg(0) float red, @OriginalArg(1) float green, @OriginalArg(2) float blue, @OriginalArg(3) float alpha);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenBuffersARB1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glGenBuffersARB1(@OriginalArg(0) int n, @OriginalArg(1) Object buffers, @OriginalArg(2) int buffersOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGenRenderbuffersEXT1", descriptor = "(ILjava/lang/Object;I)V")
	private native void glGenRenderbuffersEXT1(@OriginalArg(0) int n, @OriginalArg(1) Object renderbuffers, @OriginalArg(2) int renderbuffersOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glBlendEquation", descriptor = "(I)V")
	public native void glBlendEquation(@OriginalArg(0) int mode);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glGetTexLevelParameteriv1", descriptor = "(IIILjava/lang/Object;I)V")
	private native void glGetTexLevelParameteriv1(@OriginalArg(0) int target, @OriginalArg(1) int level, @OriginalArg(2) int pname, @OriginalArg(3) Object params, @OriginalArg(4) int paramsOffset);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glFramebufferRenderbufferEXT", descriptor = "(IIII)V")
	public native void glFramebufferRenderbufferEXT(@OriginalArg(0) int target, @OriginalArg(1) int attachment, @OriginalArg(2) int renderbuffertarget, @OriginalArg(3) int renderbuffer);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glVertex3f", descriptor = "(FFF)V")
	private native void glVertex3f(@OriginalArg(0) float x, @OriginalArg(1) float y, @OriginalArg(2) float z);

	@OriginalMember(owner = "client!jaggl/opengl", name = "glRotatef", descriptor = "(FFFF)V")
	public native void glRotatef(@OriginalArg(0) float angle, @OriginalArg(1) float x, @OriginalArg(2) float y, @OriginalArg(3) float z);
}
