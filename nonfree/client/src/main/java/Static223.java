import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!gu", name = "O", descriptor = "Lclient!uf;")
	public static final Class370 aClass370_9 = new Class370();

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B[Lclient!ns;Lclient!tca;)Lclient!rda;")
	public static Class317 method9088(@OriginalArg(1) Class265[] arg0, @OriginalArg(2) Class19_Sub1_Sub2 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong213 <= 0L) {
				return null;
			}
		}
		if (-86 <= -113) {
			return null;
		}
		@Pc(50) long local50 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(52) int local52 = 0; local52 < arg0.length; local52++) {
			OpenGL.glAttachObjectARB(local50, arg0[local52].aLong213);
		}
		OpenGL.glLinkProgramARB(local50);
		OpenGL.glGetObjectParameterivARB(local50, OpenGL.GL_LINK_STATUS, Static440.anIntArray529, 0);
		if (Static440.anIntArray529[0] == 0) {
			if (Static440.anIntArray529[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local50, OpenGL.GL_INFO_LOG_LENGTH, Static440.anIntArray529, 1);
			if (Static440.anIntArray529[1] > 1) {
				@Pc(110) byte[] local110 = new byte[Static440.anIntArray529[1]];
				OpenGL.glGetInfoLogARB(local50, Static440.anIntArray529[1], Static440.anIntArray529, 0, local110, 0);
				System.out.println(new String(local110));
			}
			if (Static440.anIntArray529[0] == 0) {
				for (@Pc(131) int local131 = 0; local131 < arg0.length; local131++) {
					OpenGL.glDetachObjectARB(local50, arg0[local131].aLong213);
				}
				OpenGL.glDeleteObjectARB(local50);
				return null;
			}
		}
		return new Class317(arg1, local50, arg0);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIII)V")
	public static void method9094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) Class2_Sub2_Sub2 local22 = Static440.method5963(18, (long) arg0 << 32 | (long) arg2);
		local22.method202();
		local22.anInt197 = arg3;
		local22.anInt195 = arg1;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZLclient!qf;)Lclient!pba;")
	public static Class286 method9095(@OriginalArg(1) Class8_Sub2_Sub1 arg0) {
		@Pc(7) Class286 local7;
		if (Static620.aClass286_3 == null) {
			local7 = new Class286();
		} else {
			local7 = Static620.aClass286_3;
			Static620.aClass286_3 = Static620.aClass286_3.aClass286_1;
			local7.aClass286_1 = null;
			Static181.anInt3006--;
		}
		local7.aClass8_Sub2_Sub1_1 = arg0;
		return local7;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(ZI)I")
	public static int method9100(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!ka;IIILclient!ke;I)V")
	public static void method9103(@OriginalArg(0) Class114 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class205 arg4) {
		if (arg0 != null) {
			arg4.method4629(arg0.fa(), arg0.HA(), arg2, arg3, arg0.G(), arg0.na(), arg1, arg0.EA(), arg0.V(), arg0.RA());
		}
	}
}
