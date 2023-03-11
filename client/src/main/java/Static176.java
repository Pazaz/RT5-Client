import jaggl.opengl;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "[I")
	private static final int[] anIntArray202 = new int[1];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!bf;ILjava/lang/String;)Lclient!kd;")
	public static Class122 method3326(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(2) String arg1) {
		@Pc(2) opengl local2 = arg0.anOpengl1;
		local2.glGenProgramsARB(1, anIntArray202, 0);
		@Pc(11) int local11 = anIntArray202[0];
		local2.glBindProgramARB(GL.GL_VERTEX_PROGRAM_ARB, local11);
		local2.glProgramStringARB(GL.GL_VERTEX_PROGRAM_ARB, GL.GL_PROGRAM_FORMAT_ASCII_ARB, arg1.length(), arg1);
		local2.glGetIntegerv(GL.GL_PROGRAM_ERROR_POSITION_ARB, anIntArray202, 0);
		if (anIntArray202[0] == -1) {
			local2.glBindProgramARB(GL.GL_VERTEX_PROGRAM_ARB, 0);
			return new Class122(arg0, 34336, local11);
		} else {
			local2.glBindProgramARB(GL.GL_VERTEX_PROGRAM_ARB, 0);
			return null;
		}
	}
}
