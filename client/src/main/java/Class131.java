import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class131 {

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "Lclient!eq;")
	private Class44_Sub1 aClass44_Sub1_5;

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "Lclient!wk;")
	private Class217 aClass217_1;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
	private int anInt4399 = -1;

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
	private int anInt4401 = 0;

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
	private int anInt4400 = -1;

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
	private int anInt4402 = 0;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "Lclient!mi;")
	private final Class130 aClass130_29 = new Class130();

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "Z")
	private boolean aBoolean310 = true;

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "[Lclient!eq;")
	private Class44_Sub1[] aClass44_Sub1Array1 = new Class44_Sub1[2];

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "Z")
	private boolean aBoolean309 = false;

	@OriginalMember(owner = "client!mm", name = "m", descriptor = "Z")
	private boolean aBoolean311 = true;

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
	private int anInt4404 = -1;

	@OriginalMember(owner = "client!mm", name = "o", descriptor = "Z")
	private boolean aBoolean312 = true;

	@OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
	private int anInt4403 = 0;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "Lclient!ih;")
	private final Class40_Sub2 aClass40_Sub2_25;

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "Lclient!kq;")
	private Class114 aClass114_2;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class131(@OriginalArg(0) Class40_Sub2 arg0) {
		this.aClass40_Sub2_25 = arg0;
		if (this.aClass40_Sub2_25.aBoolean214 && this.aClass40_Sub2_25.aBoolean215) {
			this.aClass114_2 = new Class114(this.aClass40_Sub2_25);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!vr;)V")
	public void method3784(@OriginalArg(0) Class1_Sub25 arg0) {
		this.method3785(arg0);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!vr;Z)V")
	private void method3785(@OriginalArg(0) Class1_Sub25 arg0) {
		arg0.method3929();
		arg0.aBoolean320 = false;
		arg0.method6172();
		this.method3789();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "()Z")
	private boolean method3786() {
		return this.aClass40_Sub2_25.method2820() == this.aClass114_2;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "()V")
	public void method3787() {
		if (!this.method3786()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass40_Sub2_25.anOpengl1;
		this.aClass40_Sub2_25.method2834();
		this.aClass40_Sub2_25.method2819(0);
		this.aClass40_Sub2_25.method2788();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class1_Sub25 local35;
		for (@Pc(27) Class1_Sub25 local27 = (Class1_Sub25) this.aClass130_29.method3749(); local27 != null; local27 = local35) {
			local35 = (Class1_Sub25) this.aClass130_29.method3756();
			@Pc(39) int local39 = local27.method3930();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method3935(local41, this.aClass44_Sub1Array1[local19], this.aClass44_Sub1_5);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass40_Sub2_25.method2874(this.aClass114_2);
					this.aClass40_Sub2_25.method2817(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt4399);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt4401, this.anInt4402);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt4401, this.anInt4402 + this.anInt4399);
					local7.glTexCoord2f((float) this.anInt4400, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt4401 + this.anInt4400, this.anInt4402 + this.anInt4399);
					local7.glTexCoord2f((float) this.anInt4400, (float) this.anInt4399);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt4401 + this.anInt4400, this.anInt4402);
					local7.glEnd();
				} else {
					this.aClass114_2.method3420(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt4399);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt4399);
					local7.glTexCoord2f((float) this.anInt4400, (float) this.anInt4399);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt4400, this.anInt4399);
					local7.glTexCoord2f((float) this.anInt4400, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt4400, 0);
					local7.glEnd();
				}
				local27.method3936(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(Lclient!vr;)Z")
	public boolean method3788(@OriginalArg(0) Class1_Sub25 arg0) {
		if (this.aClass114_2 != null) {
			if (arg0.method3928() || arg0.method3931()) {
				if (this.anInt4400 != -1 && this.anInt4399 != -1) {
					arg0.method3934(this.anInt4400, this.anInt4399);
				}
				arg0.aBoolean320 = true;
				this.aClass130_29.method3760(arg0);
				this.method3789();
				return true;
			}
			arg0.method3929();
		}
		return false;
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "()V")
	private void method3789() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class1_Sub25 local11 = (Class1_Sub25) this.aClass130_29.method3749(); local11 != null; local11 = (Class1_Sub25) this.aClass130_29.method3756()) {
			local16 = local11.method3932();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method3930();
			local5 |= local11.method3927();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt4404) {
			this.anInt4404 = local45;
			this.aBoolean312 = true;
		}
		local16 = this.anInt4403 > 2 ? 2 : this.anInt4403;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean310 = this.aBoolean312 = true;
		}
		if (local5 != this.aBoolean309) {
			this.aBoolean309 = local5;
			this.aBoolean311 = true;
		}
		this.anInt4403 = local3;
	}

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "()V")
	public void method3790() {
		if (this.aClass114_2 != null) {
			this.aClass114_2 = null;
			this.aClass44_Sub1Array1 = null;
			this.aClass217_1 = null;
			this.aClass44_Sub1_5 = null;
			this.aBoolean312 = true;
			this.aBoolean311 = true;
			this.aBoolean310 = true;
			if (!this.aClass130_29.method3757()) {
				for (@Pc(33) Class1 local33 = this.aClass130_29.method3749(); local33 != this.aClass130_29.aClass1_138; local33 = local33.aClass1_247) {
					((Class1_Sub25) local33).method3929();
				}
			}
		}
		this.anInt4400 = this.anInt4399 = -1;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)Z")
	public boolean method3791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass114_2 == null || this.aClass130_29.method3757()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt4400 != arg2 || this.anInt4399 != arg3) {
			this.anInt4400 = arg2;
			this.anInt4399 = arg3;
			for (@Pc(30) Class1 local30 = this.aClass130_29.method3749(); local30 != this.aClass130_29.aClass1_138; local30 = local30.aClass1_247) {
				((Class1_Sub25) local30).method3934(this.anInt4400, this.anInt4399);
			}
			this.aBoolean312 = true;
			this.aBoolean311 = true;
		}
		if (this.aBoolean311) {
			if (this.aClass217_1 != null) {
				this.aClass217_1.method6124();
				this.aClass217_1 = null;
			}
			if (this.aClass44_Sub1_5 != null) {
				this.aClass44_Sub1_5.method5451();
				this.aClass44_Sub1_5 = null;
			}
			if (this.aBoolean309) {
				this.aClass44_Sub1_5 = new Class44_Sub1(this.aClass40_Sub2_25, 34037, 6402, this.anInt4400, this.anInt4399);
			} else {
				this.aClass217_1 = new Class217(this.aClass40_Sub2_25, 6402, this.anInt4400, this.anInt4399);
			}
			this.aBoolean310 = true;
			this.aBoolean311 = false;
			local11 = true;
		}
		if (this.aBoolean312) {
			if (this.aClass44_Sub1Array1[0] != null) {
				this.aClass44_Sub1Array1[0].method5451();
				this.aClass44_Sub1Array1[0] = null;
			}
			if (this.aClass44_Sub1Array1[1] != null) {
				this.aClass44_Sub1Array1[1].method5451();
				this.aClass44_Sub1Array1[1] = null;
			}
			this.aClass44_Sub1Array1[0] = new Class44_Sub1(this.aClass40_Sub2_25, 34037, this.anInt4404, this.anInt4400, this.anInt4399);
			this.aClass44_Sub1Array1[1] = this.anInt4403 > 1 ? new Class44_Sub1(this.aClass40_Sub2_25, 34037, this.anInt4404, this.anInt4400, this.anInt4399) : null;
			this.aBoolean310 = true;
			this.aBoolean312 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass40_Sub2_25.method2820().method3418();
		this.aClass40_Sub2_25.method2848(this.aClass114_2);
		if (this.aBoolean310) {
			this.aClass114_2.method3419(0);
			this.aClass114_2.method3419(1);
			this.aClass114_2.method3419(8);
			if (this.aClass44_Sub1Array1[0] != null) {
				this.aClass114_2.method3426(0, this.aClass44_Sub1Array1[0]);
			}
			if (this.aClass44_Sub1Array1[1] != null) {
				this.aClass114_2.method3426(1, this.aClass44_Sub1Array1[1]);
			}
			if (this.aClass44_Sub1_5 != null) {
				this.aClass114_2.method3426(8, this.aClass44_Sub1_5);
			}
			if (this.aClass217_1 != null) {
				this.aClass114_2.method3421(this.aClass217_1);
			}
			this.aClass114_2.method3420(0);
			this.aBoolean310 = false;
			local11 = true;
		}
		if (!local11 || this.aClass114_2.method3424()) {
			this.anInt4401 = arg0;
			this.anInt4402 = arg1;
			this.aClass40_Sub2_25.method2817(-this.anInt4401, this.anInt4402 + this.anInt4399 - local194);
			return true;
		}
		this.aClass40_Sub2_25.method2874(this.aClass114_2);
		this.aBoolean312 = true;
		this.aBoolean311 = true;
		this.aBoolean310 = true;
		return false;
	}
}
