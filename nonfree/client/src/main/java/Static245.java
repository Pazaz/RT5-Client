import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!hka", name = "j", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_114 = new Class345(80, -1);

	@OriginalMember(owner = "client!hka", name = "h", descriptor = "[I")
	public static final int[] anIntArray773 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(CI)Z")
	public static boolean method8628(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(Ljava/lang/String;Lclient!qha;II)Lclient!mfa;")
	public static Class240 method8629(@OriginalArg(0) String arg0, @OriginalArg(1) Class19_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, OpenGL.GL_COMPILE_STATUS, Static263.anIntArray327, 0);
		if (Static263.anIntArray327[0] == 0) {
			if (Static263.anIntArray327[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, OpenGL.GL_INFO_LOG_LENGTH, Static263.anIntArray327, 1);
			if (Static263.anIntArray327[1] > 1) {
				@Pc(50) byte[] local50 = new byte[Static263.anIntArray327[1]];
				OpenGL.glGetInfoLogARB(local6, Static263.anIntArray327[1], Static263.anIntArray327, 0, local50, 0);
				System.out.println(new String(local50));
			}
			if (Static263.anIntArray327[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class240(arg1, local6, arg2);
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "()V")
	public static void method8630() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static226.aClass46Array7.length; local3++) {
				if (Static226.aClass46Array7[local3].method1102()) {
					Static134.aLongArray20[local3] = Static226.aClass46Array7[local3].method1104();
				} else {
					synchronized (Static226.aClass46Array7[local3]) {
						Static226.aClass46Array7[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static226.aClass46Array7[Static226.aClass46Array7.length - 1].method1106();
				Static341.method5033(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static226.aClass46Array7.length - 1; local3++) {
						if (!Static226.aClass46Array7[local3].method1102()) {
							synchronized (Static226.aClass46Array7[local3]) {
								Static226.aClass46Array7[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(106) int local106 = 1; local106 < Static226.aClass46Array7.length - 2; local106++) {
							Static226.aClass46Array7[local106].method1106();
						}
						Static341.method5033(2);
						while (!Static226.aClass46Array7[0].method1102()) {
							synchronized (Static226.aClass46Array7[0]) {
								Static226.aClass46Array7[0].notify();
							}
							try {
								Static638.method8395(1L);
							} catch (@Pc(148) Exception local148) {
							}
						}
						Static226.aClass46Array7[0].method1106();
						return;
					}
					try {
						Static638.method8395(1L);
					} catch (@Pc(103) Exception local103) {
					}
				}
			}
			try {
				Static638.method8395(1L);
			} catch (@Pc(49) Exception local49) {
			}
		}
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(ZI)Z")
	public static boolean method8635(@OriginalArg(1) int arg0) {
		if (arg0 == 25 || arg0 == 5 || arg0 == 50 || arg0 == 6 || arg0 == 45 || arg0 == 1007) {
			return true;
		} else {
			return arg0 == 17;
		}
	}
}
