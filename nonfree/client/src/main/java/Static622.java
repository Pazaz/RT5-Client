import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static622 {

	@OriginalMember(owner = "client!tla", name = "A", descriptor = "I")
	public static int anInt7737 = 0;

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(II)I")
	public static int method6853(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(Ljava/lang/String;ILclient!qha;B)Lclient!cn;")
	public static Class71 method6854(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19_Sub3 arg2, @OriginalArg(3) byte arg3) {
		if (arg3 <= 97) {
			return null;
		}
		@Pc(11) int local11 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(arg1, local11);
		OpenGL.glProgramStringARB(arg1, OpenGL.GL_PROGRAM_FORMAT_ASCII_ARB, arg0);
		OpenGL.glGetIntegerv(OpenGL.GL_PROGRAM_ERROR_POSITION_ARB, Static166.anIntArray247, 0);
		if (Static166.anIntArray247[0] == -1) {
			OpenGL.glBindProgramARB(arg1, 0);
			return new Class71(arg2, arg1, local11);
		} else {
			OpenGL.glBindProgramARB(arg1, 0);
			return null;
		}
	}
}
