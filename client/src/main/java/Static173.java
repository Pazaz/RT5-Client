import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!fga", name = "t", descriptor = "[I")
	public static int[] anIntArray252;

	@OriginalMember(owner = "client!fga", name = "o", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_30 = new Class345(82, 3);

	@OriginalMember(owner = "client!fga", name = "v", descriptor = "I")
	public static int anInt2913 = -1;

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(Z)V")
	public static void method2690() {
		if (Static719.aClass56_5 != null) {
			Static719.aClass56_5.method3586();
		}
		if (Static559.aClass56_3 != null) {
			Static559.aClass56_3.method3586();
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!qha;I[Lclient!mfa;)Lclient!iha;")
	public static Class179 method2691(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(2) Class240[] arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] == null || arg1[local5].aLong189 <= 0L) {
				return null;
			}
		}
		@Pc(33) long local33 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(35) int local35 = 0; local35 < arg1.length; local35++) {
			OpenGL.glAttachObjectARB(local33, arg1[local35].aLong189);
		}
		OpenGL.glLinkProgramARB(local33);
		OpenGL.glGetObjectParameterivARB(local33, OpenGL.GL_LINK_STATUS, Static147.anIntArray226, 0);
		if (Static147.anIntArray226[0] == 0) {
			if (Static147.anIntArray226[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local33, OpenGL.GL_INFO_LOG_LENGTH, Static147.anIntArray226, 1);
			if (Static147.anIntArray226[1] > 1) {
				@Pc(91) byte[] local91 = new byte[Static147.anIntArray226[1]];
				OpenGL.glGetInfoLogARB(local33, Static147.anIntArray226[1], Static147.anIntArray226, 0, local91, 0);
				System.out.println(new String(local91));
			}
			if (Static147.anIntArray226[0] == 0) {
				for (@Pc(112) int local112 = 0; local112 < arg1.length; local112++) {
					OpenGL.glDetachObjectARB(local33, arg1[local112].aLong189);
				}
				OpenGL.glDeleteObjectARB(local33);
				return null;
			}
		}
		return new Class179(arg0, local33, arg1);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(III)V")
	public static void method2692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class291 local7 = Static334.aClass291ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static109.method2068(local7.aClass8_Sub2_Sub4_1);
		Static109.method2068(local7.aClass8_Sub2_Sub4_2);
		if (local7.aClass8_Sub2_Sub4_1 != null) {
			local7.aClass8_Sub2_Sub4_1 = null;
		}
		if (local7.aClass8_Sub2_Sub4_2 != null) {
			local7.aClass8_Sub2_Sub4_2 = null;
		}
	}
}
