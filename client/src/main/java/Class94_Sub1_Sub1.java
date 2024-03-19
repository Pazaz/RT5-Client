import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class94_Sub1_Sub1 extends Class94_Sub1 {

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "Lclient!ih;")
	private final Class40_Sub2 aClass40_Sub2_34;

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "Lclient!sg;")
	private final Class44_Sub3 aClass44_Sub3_1;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!ih;I)V")
	public Class94_Sub1_Sub1(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass40_Sub2_34 = arg0;
		this.aClass44_Sub3_1 = new Class44_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)Lclient!sg;")
	@Override
	public Class44_Sub3 method6048() {
		return this.aClass44_Sub3_1;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILclient!sg;Lclient!sg;F)V")
	public void method4860(@OriginalArg(1) Class44_Sub3 arg0, @OriginalArg(2) Class44_Sub3 arg1, @OriginalArg(3) float arg2) {
		@Pc(3) opengl local3 = this.aClass40_Sub2_34.anOpengl1;
		@Pc(7) Class114 local7 = this.aClass40_Sub2_34.aClass114_1;
		if (this.aClass40_Sub2_34.aClass44_Sub1_1.anInt4848 != arg0.anInt5999 || arg0.anInt5999 != this.aClass40_Sub2_34.aClass44_Sub1_1.anInt4847) {
			this.aClass40_Sub2_34.aClass44_Sub1_1 = new Class44_Sub1(this.aClass40_Sub2_34, 3553, 6408, arg0.anInt5999, arg0.anInt5999);
		}
		if (arg1.anInt5999 != this.aClass40_Sub2_34.aClass44_Sub1_3.anInt4848 || arg1.anInt5999 != this.aClass40_Sub2_34.aClass44_Sub1_3.anInt4847) {
			this.aClass40_Sub2_34.aClass44_Sub1_3 = new Class44_Sub1(this.aClass40_Sub2_34, 3553, 6408, arg1.anInt5999, arg1.anInt5999);
		}
		this.aClass40_Sub2_34.method2772(Static270.anIntArray427);
		this.aClass40_Sub2_34.method2788();
		this.aClass40_Sub2_34.method2848(local7);
		this.aClass40_Sub2_34.method2856();
		local3.glMatrixMode(5889);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glMatrixMode(5888);
		local3.glLoadIdentity();
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, this.aClass44_Sub3_1.anInt5999, this.aClass44_Sub3_1.anInt5999);
		this.aClass40_Sub2_34.method2873(false);
		this.aClass40_Sub2_34.method2860(false);
		this.aClass40_Sub2_34.method2828(false);
		this.aClass40_Sub2_34.method2880(false);
		this.aClass40_Sub2_34.method2857();
		this.aClass40_Sub2_34.method2815(1);
		this.aClass40_Sub2_34.method2843(0.0F, 0.0F, 0.0F, arg2);
		this.aClass40_Sub2_34.method2849(34165, 34165);
		this.aClass40_Sub2_34.method2815(0);
		this.aClass40_Sub2_34.method2877(0);
		for (@Pc(163) int local163 = 0; local163 < 6; local163++) {
			@Pc(170) int local170 = local163 + 34069;
			local7.method3422(arg0, local170);
			this.aClass40_Sub2_34.aClass44_Sub1_1.method4161(0, 0, arg0.anInt5999, arg0.anInt5999);
			local7.method3422(arg1, local170);
			this.aClass40_Sub2_34.aClass44_Sub1_3.method4161(0, 0, arg1.anInt5999, arg1.anInt5999);
			local7.method3422(this.aClass44_Sub3_1, local170);
			this.aClass40_Sub2_34.method2815(1);
			this.aClass40_Sub2_34.method2882(this.aClass40_Sub2_34.aClass44_Sub1_3);
			this.aClass40_Sub2_34.method2815(0);
			this.aClass40_Sub2_34.method2882(this.aClass40_Sub2_34.aClass44_Sub1_1);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			local3.glVertex2f(0.0F, 0.0F);
			local3.glTexCoord2f(1.0F, 0.0F);
			local3.glMultiTexCoord2f(33985, 1.0F, 0.0F);
			local3.glVertex2f(1.0F, 0.0F);
			local3.glTexCoord2f(1.0F, 1.0F);
			local3.glMultiTexCoord2f(33985, 1.0F, 1.0F);
			local3.glVertex2f(1.0F, 1.0F);
			local3.glTexCoord2f(0.0F, 1.0F);
			local3.glMultiTexCoord2f(33985, 0.0F, 1.0F);
			local3.glVertex2f(0.0F, 1.0F);
			local3.glEnd();
			this.aClass40_Sub2_34.method2815(1);
			this.aClass40_Sub2_34.method2882(null);
			this.aClass40_Sub2_34.method2815(0);
			this.aClass40_Sub2_34.method2882(null);
		}
		this.aClass40_Sub2_34.method2815(1);
		this.aClass40_Sub2_34.method2849(8448, 8448);
		this.aClass40_Sub2_34.method2815(0);
		local7.method3419(0);
		local3.glPopAttrib();
		this.aClass40_Sub2_34.method2874(local7);
		this.aClass40_Sub2_34.method2732(Static270.anIntArray427[0], Static270.anIntArray427[1], Static270.anIntArray427[2], Static270.anIntArray427[3]);
		this.aClass44_Sub3_1.method5453();
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)I")
	public int method4861() {
		return this.aClass44_Sub3_1.anInt5999;
	}
}
