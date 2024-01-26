import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bca", name = "e", descriptor = "Lclient!qga;")
	public static Class304 aClass304_1;

	@OriginalMember(owner = "client!bca", name = "f", descriptor = "[Lclient!st;")
	public static Class23[] aClass23Array2;

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "Z")
	public static boolean aBoolean62 = false;

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(II[BLclient!tca;)Lclient!ns;")
	public static Class265 method884(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class19_Sub1_Sub2 arg2) {
		if (arg1 == null || arg1.length == 0) {
			return null;
		}
		@Pc(22) long local22 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceRawARB(local22, arg1);
		OpenGL.glCompileShaderARB(local22);
		OpenGL.glGetObjectParameterivARB(local22, OpenGL.GL_COMPILE_STATUS, Static332.anIntArray405, 0);
		if (Static332.anIntArray405[0] == 0) {
			if (Static332.anIntArray405[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local22, OpenGL.GL_INFO_LOG_LENGTH, Static332.anIntArray405, 1);
			if (Static332.anIntArray405[1] > 1) {
				@Pc(69) byte[] local69 = new byte[Static332.anIntArray405[1]];
				OpenGL.glGetInfoLogARB(local22, Static332.anIntArray405[1], Static332.anIntArray405, 0, local69, 0);
				System.out.println(new String(local69));
			}
			if (Static332.anIntArray405[0] == 0) {
				OpenGL.glDeleteObjectARB(local22);
				return null;
			}
		}
		return new Class265(arg2, local22, arg0);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIIZ[IIII)Z")
	public static boolean method885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (Static228.anInt3709 < arg1) {
			arg1 = Static228.anInt3709;
		}
		if (arg1 <= arg0) {
			return true;
		}
		arg2 += arg0 * arg4;
		@Pc(41) int local41 = arg1 - arg0 >> 2;
		arg5 += arg0 - 1;
		@Pc(74) int local74;
		@Pc(61) int local61;
		if (Static254.anInt4115 == 1) {
			Static432.anInt525 += local41;
			while (true) {
				local41--;
				if (local41 < 0) {
					local41 = arg1 - arg0 & 0x3;
					while (true) {
						local41--;
						if (local41 < 0) {
							return true;
						}
						arg5++;
						if (arg3[arg5] > arg2) {
							arg3[arg5] = arg2;
						}
						arg2 += arg4;
					}
				}
				local61 = arg5 + 1;
				if (arg2 < arg3[local61]) {
					arg3[local61] = arg2;
				}
				local74 = arg2 + arg4;
				local61++;
				if (local74 < arg3[local61]) {
					arg3[local61] = local74;
				}
				local74 += arg4;
				local61++;
				if (arg3[local61] > local74) {
					arg3[local61] = local74;
				}
				local74 += arg4;
				arg5 = local61 + 1;
				if (local74 < arg3[arg5]) {
					arg3[arg5] = local74;
				}
				arg2 = local74 + arg4;
			}
		} else {
			arg2 -= 38400;
			while (true) {
				local41--;
				if (local41 < 0) {
					local41 = arg1 - arg0 & 0x3;
					while (true) {
						local41--;
						if (local41 < 0) {
							return true;
						}
						@Pc(246) int local246 = ~arg2;
						arg5++;
						if (local246 > ~arg3[arg5]) {
							return false;
						}
						arg2 += arg4;
					}
				}
				local61 = arg5 + 1;
				if (arg2 < arg3[local61]) {
					return false;
				}
				local74 = arg2 + arg4;
				local61++;
				if (arg3[local61] > local74) {
					return false;
				}
				local74 += arg4;
				local61++;
				if (arg3[local61] > local74) {
					return false;
				}
				local74 += arg4;
				arg5 = local61 + 1;
				if (arg3[arg5] > local74) {
					return false;
				}
				arg2 = local74 + arg4;
			}
		}
	}
}
