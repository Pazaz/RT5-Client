import jaggl.opengl;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class130_Sub1 extends Class130 {

	@OriginalMember(owner = "client!ko", name = "w", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_19;

	@OriginalMember(owner = "client!ko", name = "v", descriptor = "Lclient!ln;")
	private final Class8_Sub1_Sub1 aClass8_Sub1_Sub1_3;

	@OriginalMember(owner = "client!ko", name = "u", descriptor = "Z")
	private final boolean aBoolean228;

	@OriginalMember(owner = "client!ko", name = "x", descriptor = "Lclient!rj;")
	private final Class203 aClass203_3;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!bf;Lclient!vi;[Lclient!dk;Z)V")
	public Class130_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Class239 arg1, @OriginalArg(2) Class48[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass19_Sub1_19 = arg0;
		@Pc(9) opengl local9 = arg0.gl;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13;
		for (local13 = 0; local13 < 256; local13++) {
			@Pc(20) Class48 local20 = arg2[local13];
			if (local20.anInt1533 > local11) {
				local11 = local20.anInt1533;
			}
			if (local20.anInt1531 > local11) {
				local11 = local20.anInt1531;
			}
		}
		local13 = local11 * 16;
		@Pc(47) byte[] local47 = new byte[local13 * local13];
		@Pc(62) int local62;
		@Pc(65) int local65;
		@Pc(71) int local71;
		@Pc(77) int local77;
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			@Pc(56) Class48 local56 = arg2[local49];
			@Pc(59) byte[] local59 = local56.aByteArray21;
			local62 = local56.anInt1533;
			local65 = local56.anInt1531;
			local71 = local49 % 16 * local11;
			local77 = local49 / 16 * local11;
			@Pc(83) int local83 = local77 * local13 + local71;
			@Pc(85) int local85 = 0;
			for (@Pc(87) int local87 = 0; local87 < local62; local87++) {
				for (@Pc(92) int local92 = 0; local92 < local65; local92++) {
					local47[local83++] = (byte) (local59[local85++] == 0 ? 0 : -1);
				}
				local83 += local13 - local65;
			}
		}
		this.aClass8_Sub1_Sub1_3 = Static402.method3641(arg0, local47, local13, local13);
		this.aBoolean228 = true;
		this.aClass8_Sub1_Sub1_3.method6160(false);
		this.aClass203_3 = new Class203(arg0, 256);
		@Pc(292) float local292 = this.aClass8_Sub1_Sub1_3.aFloat42 / (float) this.aClass8_Sub1_Sub1_3.anInt3688;
		@Pc(301) float local301 = this.aClass8_Sub1_Sub1_3.aFloat43 / (float) this.aClass8_Sub1_Sub1_3.anInt3687;
		for (@Pc(303) int local303 = 0; local303 < 256; local303++) {
			@Pc(310) Class48 local310 = arg2[local303];
			local62 = local310.anInt1533;
			local65 = local310.anInt1531;
			local71 = local310.anInt1530;
			local77 = local310.anInt1535;
			@Pc(329) float local329 = (float) (local303 % 16 * local11);
			@Pc(336) float local336 = (float) (local303 / 16 * local11);
			@Pc(340) float local340 = local329 * local292;
			@Pc(344) float local344 = local336 * local301;
			@Pc(351) float local351 = (local329 + (float) local65) * local292;
			@Pc(358) float local358 = (local336 + (float) local62) * local301;
			this.aClass203_3.method5192(local303);
			local9.glBegin(GL.GL_QUADS);
			local9.glTexCoord2f(local340, this.aClass8_Sub1_Sub1_3.aFloat43 - local344);
			local9.glVertex2i(local77, local71);
			local9.glTexCoord2f(local340, this.aClass8_Sub1_Sub1_3.aFloat43 - local358);
			local9.glVertex2i(local77, local71 + local62);
			local9.glTexCoord2f(local351, this.aClass8_Sub1_Sub1_3.aFloat43 - local358);
			local9.glVertex2i(local77 + local65, local71 + local62);
			local9.glTexCoord2f(local351, this.aClass8_Sub1_Sub1_3.aFloat43 - local344);
			local9.glVertex2i(local77 + local65, local71);
			local9.glEnd();
			this.aClass203_3.method5191();
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(CIIIZLclient!kf;II)V")
	@Override
	protected void method5902(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class78 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class78_Sub2 local2 = (Class78_Sub2) arg5;
		@Pc(5) Class8_Sub1_Sub1 local5 = local2.aClass8_Sub1_Sub1_2;
		@Pc(9) opengl local9 = this.aClass19_Sub1_19.gl;
		this.aClass19_Sub1_19.method844();
		this.aClass19_Sub1_19.method848(this.aClass8_Sub1_Sub1_3);
		if (this.aBoolean228 || arg4) {
			this.aClass19_Sub1_19.method794(7681, 8448);
			this.aClass19_Sub1_19.method793(0, 34168, 768);
		}
		this.aClass19_Sub1_19.method832(1);
		this.aClass19_Sub1_19.method848(local5);
		this.aClass19_Sub1_19.method794(7681, 8448);
		this.aClass19_Sub1_19.method793(0, 34168, 768);
		local9.glTexGeni(GL.GL_S, GL.GL_TEXTURE_GEN_MODE, GL.GL_EYE_LINEAR);
		local9.glTexGeni(GL.GL_T, GL.GL_TEXTURE_GEN_MODE, GL.GL_EYE_LINEAR);
		@Pc(69) float local69 = local5.aFloat42 / (float) local5.anInt3688;
		@Pc(76) float local76 = local5.aFloat43 / (float) local5.anInt3687;
		local9.glTexGenfv(GL.GL_S, GL.GL_EYE_PLANE, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		local9.glTexGenfv(GL.GL_T, GL.GL_EYE_PLANE, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		local9.glEnable(GL.GL_TEXTURE_GEN_S);
		local9.glEnable(GL.GL_TEXTURE_GEN_T);
		local9.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local9.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass203_3.method5190(arg0);
		local9.glLoadIdentity();
		local9.glDisable(GL.GL_TEXTURE_GEN_S);
		local9.glDisable(GL.GL_TEXTURE_GEN_T);
		this.aClass19_Sub1_19.method793(0, 5890, 768);
		this.aClass19_Sub1_19.method794(8448, 8448);
		this.aClass19_Sub1_19.method848(null);
		this.aClass19_Sub1_19.method832(0);
		if (this.aBoolean228 || arg4) {
			this.aClass19_Sub1_19.method793(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(CIIIZ)V")
	@Override
	protected void method5892(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass19_Sub1_19.gl;
		this.aClass19_Sub1_19.method844();
		this.aClass19_Sub1_19.method848(this.aClass8_Sub1_Sub1_3);
		if (this.aBoolean228 || arg4) {
			this.aClass19_Sub1_19.method794(7681, 8448);
			this.aClass19_Sub1_19.method793(0, 34168, 768);
		}
		local3.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local3.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass203_3.method5190(arg0);
		local3.glLoadIdentity();
		if (this.aBoolean228 || arg4) {
			this.aClass19_Sub1_19.method793(0, 5890, 768);
		}
	}
}
