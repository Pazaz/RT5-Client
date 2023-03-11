import jaggl.opengl;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "Lclient!ln;")
	private Class8_Sub1_Sub1 aClass8_Sub1_Sub1_4;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "Z")
	private boolean aBoolean484 = false;

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
	private int anInt7161 = 0;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
	private int anInt7159 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
	private int anInt7158 = 0;

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
	private int anInt7160 = 0;

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
	private int anInt7162 = 0;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_42;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "Lclient!ln;")
	private final Class8_Sub1_Sub1 aClass8_Sub1_Sub1_5;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!bf;IIII)V")
	public Class13_Sub2(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass19_Sub1_42 = arg0;
		this.aClass8_Sub1_Sub1_5 = Static402.method3642(arg1, arg2, arg3, arg4, arg0);
	}

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!bf;II[III)V")
	public Class13_Sub2(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass19_Sub1_42 = arg0;
		this.aClass8_Sub1_Sub1_5 = Static402.method3640(arg0, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method6397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) opengl local3 = this.aClass19_Sub1_42.anOpengl1;
		@Pc(7) int local7 = arg0 + arg2;
		@Pc(11) int local11 = arg1 + arg3;
		this.aClass8_Sub1_Sub1_5.method6160(false);
		this.aClass19_Sub1_42.method824();
		this.aClass19_Sub1_42.method848(this.aClass8_Sub1_Sub1_5);
		this.aClass19_Sub1_42.method779(1);
		this.aClass19_Sub1_42.method792(arg4);
		local3.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass8_Sub1_Sub1_5.aBoolean237 && !this.aBoolean484) {
			@Pc(66) float local66 = this.aClass8_Sub1_Sub1_5.aFloat43 * (float) arg3 / (float) this.aClass8_Sub1_Sub1_5.anInt3687;
			@Pc(78) float local78 = this.aClass8_Sub1_Sub1_5.aFloat42 * (float) arg2 / (float) this.aClass8_Sub1_Sub1_5.anInt3688;
			local3.glBegin(GL.GL_QUADS);
			local3.glTexCoord2f(0.0F, local66);
			local3.glVertex2i(arg0, arg1);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(arg0, local11);
			local3.glTexCoord2f(local78, 0.0F);
			local3.glVertex2i(local7, local11);
			local3.glTexCoord2f(local78, local66);
			local3.glVertex2i(local7, arg1);
			local3.glEnd();
			return;
		}
		local3.glPushMatrix();
		local3.glTranslatef((float) this.anInt7160, (float) this.anInt7162, 0.0F);
		@Pc(130) int local130 = this.method6399();
		@Pc(133) int local133 = this.method6384();
		@Pc(139) int local139 = arg1 + this.aClass8_Sub1_Sub1_5.anInt3687;
		local3.glBegin(GL.GL_QUADS);
		@Pc(144) int local144 = arg1;
		@Pc(153) int local153;
		while (local139 <= local11) {
			local153 = arg0 + this.aClass8_Sub1_Sub1_5.anInt3688;
			@Pc(155) int local155 = arg0;
			while (local153 <= local7) {
				local3.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat43);
				local3.glVertex2i(local155, local144);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2i(local155, local139);
				local3.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat42, 0.0F);
				local3.glVertex2i(local153, local139);
				local3.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat42, this.aClass8_Sub1_Sub1_5.aFloat43);
				local3.glVertex2i(local153, local144);
				local153 += local130;
				local155 += local130;
			}
			if (local155 < local7) {
				@Pc(224) float local224 = this.aClass8_Sub1_Sub1_5.aFloat42 * (float) (local7 - local155) / (float) this.aClass8_Sub1_Sub1_5.anInt3688;
				local3.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat43);
				local3.glVertex2i(local155, local144);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2i(local155, local139);
				local3.glTexCoord2f(local224, 0.0F);
				local3.glVertex2i(local7, local139);
				local3.glTexCoord2f(local224, this.aClass8_Sub1_Sub1_5.aFloat43);
				local3.glVertex2i(local7, local144);
			}
			local144 += local133;
			local139 += local133;
		}
		if (local144 < local11) {
			@Pc(290) float local290 = this.aClass8_Sub1_Sub1_5.aFloat43 * (float) (this.aClass8_Sub1_Sub1_5.anInt3687 + local144 - local11) / (float) this.aClass8_Sub1_Sub1_5.anInt3687;
			@Pc(296) int local296 = arg0 + this.aClass8_Sub1_Sub1_5.anInt3688;
			local153 = arg0;
			while (local296 <= local7) {
				local3.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat43);
				local3.glVertex2i(local153, local144);
				local3.glTexCoord2f(0.0F, local290);
				local3.glVertex2i(local153, local11);
				local3.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat42, local290);
				local3.glVertex2i(local296, local11);
				local3.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat42, this.aClass8_Sub1_Sub1_5.aFloat43);
				local3.glVertex2i(local296, local144);
				local296 += local130;
				local153 += local130;
			}
			if (local153 < local7) {
				@Pc(367) float local367 = this.aClass8_Sub1_Sub1_5.aFloat42 * (float) (local7 - local153) / (float) this.aClass8_Sub1_Sub1_5.anInt3688;
				local3.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat43);
				local3.glVertex2i(local153, local144);
				local3.glTexCoord2f(0.0F, local290);
				local3.glVertex2i(local153, local11);
				local3.glTexCoord2f(local367, local290);
				local3.glVertex2i(local7, local11);
				local3.glTexCoord2f(local367, this.aClass8_Sub1_Sub1_5.aFloat43);
				local3.glVertex2i(local7, local144);
			}
		}
		local3.glEnd();
		local3.glPopMatrix();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method6401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) opengl local3 = this.aClass19_Sub1_42.anOpengl1;
		this.aClass8_Sub1_Sub1_5.method6160(false);
		this.aClass19_Sub1_42.method824();
		this.aClass19_Sub1_42.method779(1);
		local3.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) int local35 = arg0 + this.anInt7160;
		@Pc(40) int local40 = arg1 + this.anInt7162;
		if (this.aClass8_Sub1_Sub1_4 == null) {
			this.aClass19_Sub1_42.method848(this.aClass8_Sub1_Sub1_5);
			this.aClass19_Sub1_42.method792(arg2);
			local3.glBegin(GL.GL_QUADS);
			local3.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat43);
			local3.glVertex2i(local35, local40);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(local35, local40 + this.aClass8_Sub1_Sub1_5.anInt3687);
			local3.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat42, 0.0F);
			local3.glVertex2i(local35 + this.aClass8_Sub1_Sub1_5.anInt3688, local40 + this.aClass8_Sub1_Sub1_5.anInt3687);
			local3.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat42, this.aClass8_Sub1_Sub1_5.aFloat43);
			local3.glVertex2i(local35 + this.aClass8_Sub1_Sub1_5.anInt3688, local40);
			local3.glEnd();
			return;
		}
		this.method6403(arg2);
		this.aClass8_Sub1_Sub1_4.method6160(false);
		local3.glBegin(GL.GL_QUADS);
		local3.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, this.aClass8_Sub1_Sub1_5.aFloat43);
		local3.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat43);
		local3.glVertex2i(local35, local40);
		local3.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, 0.0F);
		local3.glTexCoord2f(0.0F, 0.0F);
		local3.glVertex2i(local35, local40 + this.aClass8_Sub1_Sub1_5.anInt3687);
		local3.glMultiTexCoord2f(GL.GL_TEXTURE1, this.aClass8_Sub1_Sub1_5.aFloat42, 0.0F);
		local3.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat42, 0.0F);
		local3.glVertex2i(local35 + this.aClass8_Sub1_Sub1_5.anInt3688, local40 + this.aClass8_Sub1_Sub1_5.anInt3687);
		local3.glMultiTexCoord2f(GL.GL_TEXTURE1, this.aClass8_Sub1_Sub1_5.aFloat42, this.aClass8_Sub1_Sub1_5.aFloat43);
		local3.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat42, this.aClass8_Sub1_Sub1_5.aFloat43);
		local3.glVertex2i(local35 + this.aClass8_Sub1_Sub1_5.anInt3688, local40);
		local3.glEnd();
		this.method6402();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) opengl local3 = this.aClass19_Sub1_42.anOpengl1;
		this.aClass8_Sub1_Sub1_5.method6160(true);
		this.aClass19_Sub1_42.method824();
		this.aClass19_Sub1_42.method779(arg6);
		local3.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean484) {
			@Pc(40) float local40 = (float) arg2 / (float) this.method6399();
			@Pc(47) float local47 = (float) arg3 / (float) this.method6384();
			@Pc(56) float local56 = (float) arg0 + (float) this.anInt7160 * local40;
			@Pc(65) float local65 = (float) arg1 + (float) this.anInt7162 * local47;
			@Pc(74) float local74 = local56 + (float) this.aClass8_Sub1_Sub1_5.anInt3688 * local40;
			@Pc(83) float local83 = local65 + (float) this.aClass8_Sub1_Sub1_5.anInt3687 * local47;
			if (this.aClass8_Sub1_Sub1_4 == null) {
				this.aClass19_Sub1_42.method848(this.aClass8_Sub1_Sub1_5);
				this.aClass19_Sub1_42.method792(arg4);
				local3.glBegin(GL.GL_QUADS);
				local3.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat43);
				local3.glVertex2f(local56, local65);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2f(local56, local83);
				local3.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat42, 0.0F);
				local3.glVertex2f(local74, local83);
				local3.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat42, this.aClass8_Sub1_Sub1_5.aFloat43);
				local3.glVertex2f(local74, local65);
				local3.glEnd();
			} else {
				this.method6403(arg4);
				this.aClass8_Sub1_Sub1_4.method6160(true);
				local3.glBegin(GL.GL_QUADS);
				local3.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, this.aClass8_Sub1_Sub1_5.aFloat43);
				local3.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat43);
				local3.glVertex2f(local56, local65);
				local3.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, 0.0F);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2f(local56, local83);
				local3.glMultiTexCoord2f(GL.GL_TEXTURE1, this.aClass8_Sub1_Sub1_5.aFloat42, 0.0F);
				local3.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat42, 0.0F);
				local3.glVertex2f(local74, local83);
				local3.glMultiTexCoord2f(GL.GL_TEXTURE1, this.aClass8_Sub1_Sub1_5.aFloat42, this.aClass8_Sub1_Sub1_5.aFloat43);
				local3.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat42, this.aClass8_Sub1_Sub1_5.aFloat43);
				local3.glVertex2f(local74, local65);
				local3.glEnd();
				this.method6402();
			}
		} else if (this.aClass8_Sub1_Sub1_4 == null) {
			this.aClass19_Sub1_42.method848(this.aClass8_Sub1_Sub1_5);
			this.aClass19_Sub1_42.method792(arg4);
			local3.glBegin(GL.GL_QUADS);
			local3.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat43);
			local3.glVertex2i(arg0, arg1);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(arg0, arg1 + arg3);
			local3.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat42, 0.0F);
			local3.glVertex2i(arg0 + arg2, arg1 + arg3);
			local3.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat42, this.aClass8_Sub1_Sub1_5.aFloat43);
			local3.glVertex2i(arg0 + arg2, arg1);
			local3.glEnd();
		} else {
			this.method6403(arg4);
			this.aClass8_Sub1_Sub1_4.method6160(true);
			local3.glBegin(GL.GL_QUADS);
			local3.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, this.aClass8_Sub1_Sub1_5.aFloat43);
			local3.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat43);
			local3.glVertex2i(arg0, arg1);
			local3.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, 0.0F);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(arg0, arg1 + arg3);
			local3.glMultiTexCoord2f(GL.GL_TEXTURE1, this.aClass8_Sub1_Sub1_5.aFloat42, 0.0F);
			local3.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat42, 0.0F);
			local3.glVertex2i(arg0 + arg2, arg1 + arg3);
			local3.glMultiTexCoord2f(GL.GL_TEXTURE1, this.aClass8_Sub1_Sub1_5.aFloat42, this.aClass8_Sub1_Sub1_5.aFloat43);
			local3.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat42, this.aClass8_Sub1_Sub1_5.aFloat43);
			local3.glVertex2i(arg0 + arg2, arg1);
			local3.glEnd();
			this.method6402();
		}
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "()V")
	private void method6402() {
		this.aClass19_Sub1_42.method832(1);
		this.aClass19_Sub1_42.method848(null);
		this.aClass19_Sub1_42.method794(8448, 8448);
		this.aClass19_Sub1_42.method793(1, 34168, 768);
		this.aClass19_Sub1_42.method833(0, 5890);
		this.aClass19_Sub1_42.method832(0);
		this.aClass19_Sub1_42.method793(1, 34168, 768);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "()I")
	@Override
	public int method6382() {
		return this.aClass8_Sub1_Sub1_5.anInt3687;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected void method6394(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean484) {
			local6 = this.method6399();
			local10 = this.method6384();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt7162;
			@Pc(46) float local46 = local34 * (float) this.anInt7162;
			@Pc(52) float local52 = local16 * (float) this.anInt7160;
			@Pc(58) float local58 = local22 * (float) this.anInt7160;
			@Pc(65) float local65 = -local16 * (float) this.anInt7158;
			@Pc(72) float local72 = -local22 * (float) this.anInt7158;
			@Pc(79) float local79 = -local28 * (float) this.anInt7159;
			@Pc(86) float local86 = -local34 * (float) this.anInt7159;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + arg2 - arg0;
		local10 = arg3 + arg5 - arg1;
		@Pc(138) opengl local138 = this.aClass19_Sub1_42.anOpengl1;
		this.aClass8_Sub1_Sub1_5.method6160(true);
		this.aClass19_Sub1_42.method824();
		this.aClass19_Sub1_42.method848(this.aClass8_Sub1_Sub1_5);
		this.aClass19_Sub1_42.method779(1);
		this.aClass19_Sub1_42.method792(arg6);
		local138.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		local138.glBegin(GL.GL_QUADS);
		local138.glTexCoord2f(0.0F, this.aClass8_Sub1_Sub1_5.aFloat43);
		local138.glVertex2f(arg0, arg1);
		local138.glTexCoord2f(0.0F, 0.0F);
		local138.glVertex2f(arg4, arg5);
		local138.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat42, 0.0F);
		local138.glVertex2f(local6, local10);
		local138.glTexCoord2f(this.aClass8_Sub1_Sub1_5.aFloat42, this.aClass8_Sub1_Sub1_5.aFloat43);
		local138.glVertex2f(arg2, arg3);
		local138.glEnd();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	private void method6403(@OriginalArg(0) int arg0) {
		this.aClass19_Sub1_42.method832(1);
		this.aClass19_Sub1_42.method848(this.aClass8_Sub1_Sub1_5);
		this.aClass19_Sub1_42.method794(this.aClass19_Sub1_42.method777(arg0), 7681);
		this.aClass19_Sub1_42.method793(1, 34167, 768);
		this.aClass19_Sub1_42.method833(0, 34168);
		this.aClass19_Sub1_42.method832(0);
		this.aClass19_Sub1_42.method848(this.aClass8_Sub1_Sub1_4);
		this.aClass19_Sub1_42.method794(34479, 7681);
		this.aClass19_Sub1_42.method793(1, 34166, 768);
		if (this.anInt7161 == 0) {
			this.aClass19_Sub1_42.method804(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt7161 == 1) {
			this.aClass19_Sub1_42.method804(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt7161 == 2) {
			this.aClass19_Sub1_42.method804(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt7161 == 3) {
			this.aClass19_Sub1_42.method804(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "()I")
	@Override
	public int method6384() {
		return this.aClass8_Sub1_Sub1_5.anInt3687 + this.anInt7162 + this.anInt7159;
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "()I")
	@Override
	public int method6399() {
		return this.aClass8_Sub1_Sub1_5.anInt3688 + this.anInt7160 + this.anInt7158;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(FFFFFFLclient!kf;II)V")
	@Override
	protected void method6387(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class78 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class8_Sub1_Sub1 local3 = ((Class78_Sub2) arg6).aClass8_Sub1_Sub1_2;
		@Pc(10) float local10;
		@Pc(14) float local14;
		@Pc(26) float local26;
		@Pc(32) float local32;
		if (this.aBoolean484) {
			local10 = this.method6399();
			local14 = this.method6384();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			local26 = (arg3 - arg1) / local10;
			local32 = (arg4 - arg0) / local14;
			@Pc(38) float local38 = (arg5 - arg1) / local14;
			@Pc(44) float local44 = local32 * (float) this.anInt7162;
			@Pc(50) float local50 = local38 * (float) this.anInt7162;
			@Pc(56) float local56 = local20 * (float) this.anInt7160;
			@Pc(62) float local62 = local26 * (float) this.anInt7160;
			@Pc(69) float local69 = -local20 * (float) this.anInt7158;
			@Pc(76) float local76 = -local26 * (float) this.anInt7158;
			@Pc(83) float local83 = -local32 * (float) this.anInt7159;
			@Pc(90) float local90 = -local38 * (float) this.anInt7159;
			arg0 = arg0 + local56 + local44;
			arg1 = arg1 + local62 + local50;
			arg2 = arg2 + local69 + local44;
			arg3 = arg3 + local76 + local50;
			arg4 = arg4 + local56 + local83;
			arg5 = arg5 + local62 + local90;
		}
		local10 = arg4 + arg2 - arg0;
		local14 = arg3 + arg5 - arg1;
		@Pc(142) opengl local142 = this.aClass19_Sub1_42.anOpengl1;
		this.aClass8_Sub1_Sub1_5.method6160(true);
		this.aClass19_Sub1_42.method824();
		this.aClass19_Sub1_42.method848(this.aClass8_Sub1_Sub1_5);
		this.aClass19_Sub1_42.method792(0);
		this.aClass19_Sub1_42.method832(1);
		this.aClass19_Sub1_42.method848(local3);
		this.aClass19_Sub1_42.method794(7681, 8448);
		this.aClass19_Sub1_42.method793(0, 34168, 768);
		this.aClass19_Sub1_42.method779(1);
		local26 = local3.aFloat42 / (float) local3.anInt3688;
		local32 = local3.aFloat43 / (float) local3.anInt3687;
		local142.glBegin(GL.GL_QUADS);
		local142.glColor3f(1.0F, 1.0F, 1.0F);
		local142.glMultiTexCoord2f(GL.GL_TEXTURE0, 0.0F, this.aClass8_Sub1_Sub1_5.aFloat43);
		local142.glMultiTexCoord2f(GL.GL_TEXTURE1, local26 * (arg0 - (float) arg7), local3.aFloat43 - local32 * (arg1 - (float) arg8));
		local142.glVertex2f(arg0, arg1);
		local142.glMultiTexCoord2f(GL.GL_TEXTURE0, 0.0F, 0.0F);
		local142.glMultiTexCoord2f(GL.GL_TEXTURE1, local26 * (arg4 - (float) arg7), local3.aFloat43 - local32 * (arg5 - (float) arg8));
		local142.glVertex2f(arg4, arg5);
		local142.glMultiTexCoord2f(GL.GL_TEXTURE0, this.aClass8_Sub1_Sub1_5.aFloat42, 0.0F);
		local142.glMultiTexCoord2f(GL.GL_TEXTURE1, local26 * (local10 - (float) arg7), local3.aFloat43 - local32 * (local14 - (float) arg8));
		local142.glVertex2f(local10, local14);
		local142.glMultiTexCoord2f(GL.GL_TEXTURE0, this.aClass8_Sub1_Sub1_5.aFloat42, this.aClass8_Sub1_Sub1_5.aFloat43);
		local142.glMultiTexCoord2f(GL.GL_TEXTURE1, local26 * (arg2 - (float) arg7), local3.aFloat43 - local32 * (arg3 - (float) arg8));
		local142.glVertex2f(arg2, arg3);
		local142.glEnd();
		this.aClass19_Sub1_42.method793(0, 5890, 768);
		this.aClass19_Sub1_42.method792(1);
		this.aClass19_Sub1_42.method848(null);
		this.aClass19_Sub1_42.method832(0);
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "()I")
	@Override
	public int method6389() {
		return this.aClass8_Sub1_Sub1_5.anInt3688;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass8_Sub1_Sub1_5.method3636(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)V")
	@Override
	public void method6392(@OriginalArg(2) int arg0) {
		@Pc(3) opengl local3 = this.aClass19_Sub1_42.anOpengl1;
		local3.glPixelTransferf(GL.GL_RED_SCALE, 0.5F);
		local3.glPixelTransferf(GL.GL_RED_BIAS, 0.499F);
		local3.glPixelTransferf(GL.GL_GREEN_SCALE, 0.5F);
		local3.glPixelTransferf(GL.GL_GREEN_BIAS, 0.499F);
		local3.glPixelTransferf(GL.GL_BLUE_SCALE, 0.5F);
		local3.glPixelTransferf(GL.GL_BLUE_BIAS, 0.499F);
		this.aClass8_Sub1_Sub1_4 = Static402.method3642(0, 0, this.aClass8_Sub1_Sub1_5.anInt3688, this.aClass8_Sub1_Sub1_5.anInt3687, this.aClass19_Sub1_42);
		this.anInt7161 = arg0;
		local3.glPixelTransferf(GL.GL_RED_SCALE, 1.0F);
		local3.glPixelTransferf(GL.GL_RED_BIAS, 0.0F);
		local3.glPixelTransferf(GL.GL_GREEN_SCALE, 1.0F);
		local3.glPixelTransferf(GL.GL_GREEN_BIAS, 0.0F);
		local3.glPixelTransferf(GL.GL_BLUE_SCALE, 1.0F);
		local3.glPixelTransferf(GL.GL_BLUE_BIAS, 0.0F);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILclient!kf;II)V")
	@Override
	public void method6383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class78_Sub2 local2 = (Class78_Sub2) arg2;
		@Pc(5) Class8_Sub1_Sub1 local5 = local2.aClass8_Sub1_Sub1_2;
		this.aClass8_Sub1_Sub1_5.method6160(false);
		this.aClass19_Sub1_42.method824();
		this.aClass19_Sub1_42.method848(this.aClass8_Sub1_Sub1_5);
		this.aClass19_Sub1_42.method792(0);
		this.aClass19_Sub1_42.method832(1);
		this.aClass19_Sub1_42.method848(local5);
		this.aClass19_Sub1_42.method794(7681, 8448);
		this.aClass19_Sub1_42.method793(0, 34168, 768);
		this.aClass19_Sub1_42.method779(1);
		@Pc(49) int local49 = arg0 + this.anInt7160;
		@Pc(54) int local54 = arg1 + this.anInt7162;
		@Pc(60) int local60 = local49 + this.aClass8_Sub1_Sub1_5.anInt3688;
		@Pc(66) int local66 = local54 + this.aClass8_Sub1_Sub1_5.anInt3687;
		@Pc(73) float local73 = local5.aFloat42 / (float) local5.anInt3688;
		@Pc(80) float local80 = local5.aFloat43 / (float) local5.anInt3687;
		@Pc(87) float local87 = (float) (local49 - arg3) * local73;
		@Pc(94) float local94 = (float) (local60 - arg3) * local73;
		@Pc(104) float local104 = local5.aFloat43 - (float) (local54 - arg4) * local80;
		@Pc(114) float local114 = local5.aFloat43 - (float) (local66 - arg4) * local80;
		@Pc(118) opengl local118 = this.aClass19_Sub1_42.anOpengl1;
		local118.glBegin(GL.GL_QUADS);
		local118.glColor3f(1.0F, 1.0F, 1.0F);
		local118.glMultiTexCoord2f(GL.GL_TEXTURE0, 0.0F, this.aClass8_Sub1_Sub1_5.aFloat43);
		local118.glMultiTexCoord2f(GL.GL_TEXTURE1, local87, local104);
		local118.glVertex2i(local49, local54);
		local118.glMultiTexCoord2f(GL.GL_TEXTURE0, 0.0F, 0.0F);
		local118.glMultiTexCoord2f(GL.GL_TEXTURE1, local87, local114);
		local118.glVertex2i(local49, local54 + this.aClass8_Sub1_Sub1_5.anInt3687);
		local118.glMultiTexCoord2f(GL.GL_TEXTURE0, this.aClass8_Sub1_Sub1_5.aFloat42, 0.0F);
		local118.glMultiTexCoord2f(GL.GL_TEXTURE1, local94, local114);
		local118.glVertex2i(local49 + this.aClass8_Sub1_Sub1_5.anInt3688, local54 + this.aClass8_Sub1_Sub1_5.anInt3687);
		local118.glMultiTexCoord2f(GL.GL_TEXTURE0, this.aClass8_Sub1_Sub1_5.aFloat42, this.aClass8_Sub1_Sub1_5.aFloat43);
		local118.glMultiTexCoord2f(GL.GL_TEXTURE1, local94, local104);
		local118.glVertex2i(local49 + this.aClass8_Sub1_Sub1_5.anInt3688, local54);
		local118.glEnd();
		this.aClass19_Sub1_42.method793(0, 5890, 768);
		this.aClass19_Sub1_42.method792(1);
		this.aClass19_Sub1_42.method848(null);
		this.aClass19_Sub1_42.method832(0);
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(IIII)V")
	@Override
	public void method6391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7160 = arg0;
		this.anInt7162 = arg1;
		this.anInt7158 = arg2;
		this.anInt7159 = arg3;
		this.aBoolean484 = this.anInt7160 != 0 || this.anInt7162 != 0 || this.anInt7158 != 0 || this.anInt7159 != 0;
	}
}
