import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "[I")
	private static final int[] anIntArray170 = new int[2];

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ih;ILjava/lang/String;)Lclient!ha;")
	public static Class80 method2194(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(2) String arg1) {
		@Pc(2) opengl local2 = arg0.anOpengl1;
		@Pc(6) int local6 = local2.glCreateShaderObjectARB(35632);
		local2.glShaderSourceARB(local6, 1, new String[] { arg1 }, new int[] { arg1.length() }, 0);
		local2.glCompileShaderARB(local6);
		local2.glGetObjectParameterivARB(local6, 35713, anIntArray170, 0);
		if (anIntArray170[0] == 0) {
			if (anIntArray170[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			local2.glGetObjectParameterivARB(local6, 35716, anIntArray170, 1);
			if (anIntArray170[1] > 1) {
				@Pc(60) byte[] local60 = new byte[anIntArray170[1]];
				local2.glGetInfoLogARB(local6, anIntArray170[1], anIntArray170, 0, local60, 0);
				System.out.println(new String(local60));
			}
			if (anIntArray170[0] == 0) {
				local2.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class80(arg0, local6, 35632);
	}
}
