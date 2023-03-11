import jaggl.opengl;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class42_Sub1_Sub1 extends Class42_Sub1 {

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_8;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "Lclient!qd;")
	private final Class8_Sub3 aClass8_Sub3_1;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!bf;I)V")
	public Class42_Sub1_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass19_Sub1_8 = arg0;
		this.aClass8_Sub3_1 = new Class8_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)I")
	public int method1609() {
		return this.aClass8_Sub3_1.anInt5167;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)Lclient!qd;")
	@Override
	public Class8_Sub3 method2428() {
		return this.aClass8_Sub3_1;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(FLclient!qd;BLclient!qd;)V")
	public void method1610(@OriginalArg(0) float arg0, @OriginalArg(1) Class8_Sub3 arg1, @OriginalArg(3) Class8_Sub3 arg2) {
		@Pc(3) opengl local3 = this.aClass19_Sub1_8.anOpengl1;
		@Pc(7) Class228 local7 = this.aClass19_Sub1_8.aClass228_1;
		if (this.aClass19_Sub1_8.aClass8_Sub1_2.anInt3684 != arg2.anInt5167 || arg2.anInt5167 != this.aClass19_Sub1_8.aClass8_Sub1_2.anInt3685) {
			this.aClass19_Sub1_8.aClass8_Sub1_2 = new Class8_Sub1(this.aClass19_Sub1_8, 3553, 6408, arg2.anInt5167, arg2.anInt5167);
		}
		if (this.aClass19_Sub1_8.aClass8_Sub1_3.anInt3684 != arg1.anInt5167 || arg1.anInt5167 != this.aClass19_Sub1_8.aClass8_Sub1_3.anInt3685) {
			this.aClass19_Sub1_8.aClass8_Sub1_3 = new Class8_Sub1(this.aClass19_Sub1_8, 3553, 6408, arg1.anInt5167, arg1.anInt5167);
		}
		this.aClass19_Sub1_8.method2851(Static55.anIntArray103);
		this.aClass19_Sub1_8.method2898();
		this.aClass19_Sub1_8.method808(local7);
		this.aClass19_Sub1_8.method806();
		local3.glMatrixMode(GL.GL_PROJECTION);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glMatrixMode(GL.GL_MODELVIEW);
		local3.glLoadIdentity();
		local3.glPushAttrib(GL.GL_VIEWPORT_BIT);
		local3.glViewport(0, 0, this.aClass8_Sub3_1.anInt5167, this.aClass8_Sub3_1.anInt5167);
		this.aClass19_Sub1_8.method786(false);
		this.aClass19_Sub1_8.method782(false);
		this.aClass19_Sub1_8.method813(false);
		this.aClass19_Sub1_8.method817(false);
		this.aClass19_Sub1_8.method784();
		this.aClass19_Sub1_8.method832(1);
		this.aClass19_Sub1_8.method804(0.0F, 0.0F, 0.0F, arg0);
		this.aClass19_Sub1_8.method794(34165, 34165);
		this.aClass19_Sub1_8.method832(0);
		this.aClass19_Sub1_8.method792(0);
		for (@Pc(167) int local167 = 0; local167 < 6; local167++) {
			@Pc(176) int local176 = local167 + 34069;
			local7.method5801(arg2, local176);
			this.aClass19_Sub1_8.aClass8_Sub1_2.method3636(0, 0, arg2.anInt5167, arg2.anInt5167);
			local7.method5801(arg1, local176);
			this.aClass19_Sub1_8.aClass8_Sub1_3.method3636(0, 0, arg1.anInt5167, arg1.anInt5167);
			local7.method5801(this.aClass8_Sub3_1, local176);
			this.aClass19_Sub1_8.method832(1);
			this.aClass19_Sub1_8.method848(this.aClass19_Sub1_8.aClass8_Sub1_3);
			this.aClass19_Sub1_8.method832(0);
			this.aClass19_Sub1_8.method848(this.aClass19_Sub1_8.aClass8_Sub1_2);
			local3.glBegin(GL.GL_QUADS);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, 0.0F);
			local3.glVertex2f(0.0F, 0.0F);
			local3.glTexCoord2f(1.0F, 0.0F);
			local3.glMultiTexCoord2f(GL.GL_TEXTURE1, 1.0F, 0.0F);
			local3.glVertex2f(1.0F, 0.0F);
			local3.glTexCoord2f(1.0F, 1.0F);
			local3.glMultiTexCoord2f(GL.GL_TEXTURE1, 1.0F, 1.0F);
			local3.glVertex2f(1.0F, 1.0F);
			local3.glTexCoord2f(0.0F, 1.0F);
			local3.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, 1.0F);
			local3.glVertex2f(0.0F, 1.0F);
			local3.glEnd();
			this.aClass19_Sub1_8.method832(1);
			this.aClass19_Sub1_8.method848(null);
			this.aClass19_Sub1_8.method832(0);
			this.aClass19_Sub1_8.method848(null);
		}
		this.aClass19_Sub1_8.method832(1);
		this.aClass19_Sub1_8.method794(8448, 8448);
		this.aClass19_Sub1_8.method832(0);
		local7.method5798(0);
		local3.glPopAttrib();
		this.aClass19_Sub1_8.method830(local7);
		this.aClass19_Sub1_8.method2895(Static55.anIntArray103[0], Static55.anIntArray103[1], Static55.anIntArray103[2], Static55.anIntArray103[3]);
		this.aClass8_Sub3_1.method6159();
	}
}
