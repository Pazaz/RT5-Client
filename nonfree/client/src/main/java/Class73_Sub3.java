import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class73_Sub3 extends Class73 {

	@OriginalMember(owner = "client!qr", name = "C", descriptor = "F")
	public float aFloat150;

	@OriginalMember(owner = "client!qr", name = "F", descriptor = "F")
	public float aFloat151;

	@OriginalMember(owner = "client!qr", name = "u", descriptor = "F")
	public float aFloat152;

	@OriginalMember(owner = "client!qr", name = "E", descriptor = "F")
	public float aFloat153;

	@OriginalMember(owner = "client!qr", name = "z", descriptor = "F")
	public float aFloat154;

	@OriginalMember(owner = "client!qr", name = "r", descriptor = "F")
	public float aFloat155;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "F")
	public float aFloat156;

	@OriginalMember(owner = "client!qr", name = "o", descriptor = "F")
	public float aFloat157;

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "F")
	public float aFloat158;

	@OriginalMember(owner = "client!qr", name = "A", descriptor = "F")
	public float aFloat159;

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "F")
	public float aFloat160;

	@OriginalMember(owner = "client!qr", name = "G", descriptor = "F")
	public float aFloat161;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
	public Class73_Sub3() {
		this.method7133();
	}

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "(I)V")
	@Override
	public void method7127(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Applet_Sub1.aFloatArray14[arg0 & 0x3FFF];
		@Pc(15) float local15 = Applet_Sub1.aFloatArray15[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat153;
		@Pc(21) float local21 = this.aFloat157;
		@Pc(24) float local24 = this.aFloat160;
		this.aFloat153 = local15 * this.aFloat155 + local9 * local18;
		@Pc(37) float local37 = this.aFloat152;
		this.aFloat155 = local9 * this.aFloat155 - local15 * local18;
		this.aFloat157 = this.aFloat151 * local15 + local21 * local9;
		this.aFloat151 = local9 * this.aFloat151 - local15 * local21;
		this.aFloat160 = this.aFloat154 * local15 + local9 * local24;
		this.aFloat152 = this.aFloat159 * local15 + local9 * local37;
		this.aFloat154 = this.aFloat154 * local9 - local24 * local15;
		this.aFloat159 = local9 * this.aFloat159 - local15 * local37;
	}

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat152 + this.aFloat160 * (float) arg2 + (float) arg0 * this.aFloat153 + this.aFloat157 * (float) arg1);
		arg3[2] = (int) (this.aFloat159 + this.aFloat154 * (float) arg2 + (float) arg0 * this.aFloat155 + this.aFloat151 * (float) arg1);
		arg3[1] = (int) (this.aFloat161 * (float) arg0 + (float) arg1 * this.aFloat156 + (float) arg2 * this.aFloat150 + this.aFloat158);
	}

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "(I)V")
	public void method7141() {
		this.aFloat155 = -this.aFloat155;
		this.aFloat154 = -this.aFloat154;
		this.aFloat150 = -this.aFloat150;
		this.aFloat161 = -this.aFloat161;
		this.aFloat158 = -this.aFloat158;
		this.aFloat151 = -this.aFloat151;
		this.aFloat156 = -this.aFloat156;
		this.aFloat159 = -this.aFloat159;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BLclient!tt;)V")
	public void method7142(@OriginalArg(1) Class73 arg0) {
		@Pc(6) Class73_Sub3 local6 = (Class73_Sub3) arg0;
		this.aFloat160 = local6.aFloat155;
		this.aFloat153 = local6.aFloat153;
		this.aFloat157 = local6.aFloat161;
		this.aFloat156 = local6.aFloat156;
		this.aFloat161 = local6.aFloat157;
		this.aFloat150 = local6.aFloat151;
		this.aFloat155 = local6.aFloat160;
		this.aFloat152 = -(this.aFloat160 * local6.aFloat159 + this.aFloat153 * local6.aFloat152 + local6.aFloat158 * this.aFloat157);
		this.aFloat151 = local6.aFloat150;
		this.aFloat154 = local6.aFloat154;
		this.aFloat158 = -(local6.aFloat159 * this.aFloat150 + local6.aFloat152 * this.aFloat161 + this.aFloat156 * local6.aFloat158);
		this.aFloat159 = -(local6.aFloat152 * this.aFloat155 + local6.aFloat158 * this.aFloat151 + this.aFloat154 * local6.aFloat159);
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "()Lclient!tt;")
	@Override
	public Class73 method7129() {
		@Pc(7) Class73_Sub3 local7 = new Class73_Sub3();
		local7.aFloat158 = this.aFloat158;
		local7.aFloat156 = this.aFloat156;
		local7.aFloat151 = this.aFloat151;
		local7.aFloat155 = this.aFloat155;
		local7.aFloat161 = this.aFloat161;
		local7.aFloat160 = this.aFloat160;
		local7.aFloat157 = this.aFloat157;
		local7.aFloat154 = this.aFloat154;
		local7.aFloat150 = this.aFloat150;
		local7.aFloat152 = this.aFloat152;
		local7.aFloat159 = this.aFloat159;
		local7.aFloat153 = this.aFloat153;
		return local7;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat158);
		@Pc(13) int local13 = (int) ((float) arg0 - this.aFloat152);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat159);
		arg3[1] = (int) ((float) local24 * this.aFloat151 + (float) local6 * this.aFloat156 + this.aFloat157 * (float) local13);
		arg3[2] = (int) ((float) local13 * this.aFloat160 + this.aFloat150 * (float) local6 + this.aFloat154 * (float) local24);
		arg3[0] = (int) ((float) local24 * this.aFloat155 + (float) local6 * this.aFloat161 + (float) local13 * this.aFloat153);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "()V")
	@Override
	public void method7133() {
		this.aFloat153 = this.aFloat156 = this.aFloat154 = 1.0F;
		this.aFloat161 = this.aFloat155 = this.aFloat157 = this.aFloat151 = this.aFloat160 = this.aFloat150 = this.aFloat152 = this.aFloat158 = this.aFloat159 = 0.0F;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "([I)V")
	@Override
	public void method7126(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat152;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat158;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat159;
		arg0[0] = (int) (this.aFloat161 * local20 + this.aFloat153 * local12 + local29 * this.aFloat155);
		arg0[1] = (int) (this.aFloat151 * local29 + this.aFloat157 * local12 + this.aFloat156 * local20);
		arg0[2] = (int) (local29 * this.aFloat154 + local20 * this.aFloat150 + this.aFloat160 * local12);
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
	@Override
	public void method7139(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Applet_Sub1.aFloatArray14[arg0 & 0x3FFF];
		@Pc(15) float local15 = Applet_Sub1.aFloatArray15[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat153;
		@Pc(21) float local21 = this.aFloat157;
		@Pc(24) float local24 = this.aFloat160;
		this.aFloat153 = local18 * local9 - local15 * this.aFloat161;
		@Pc(38) float local38 = this.aFloat152;
		this.aFloat157 = local21 * local9 - this.aFloat156 * local15;
		this.aFloat161 = local18 * local15 + this.aFloat161 * local9;
		this.aFloat156 = local21 * local15 + local9 * this.aFloat156;
		this.aFloat160 = local24 * local9 - local15 * this.aFloat150;
		this.aFloat150 = local9 * this.aFloat150 + local24 * local15;
		this.aFloat152 = local38 * local9 - local15 * this.aFloat158;
		this.aFloat158 = local9 * this.aFloat158 + local15 * local38;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(FFFF[FB)V")
	public void method7143(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float[] arg4) {
		arg4[0] = arg3 * this.aFloat153 + this.aFloat157 * arg2 + this.aFloat160 * arg0;
		arg4[1] = this.aFloat161 * arg3 + arg2 * this.aFloat156 + this.aFloat150 * arg0;
		@Pc(74) float local74;
		@Pc(90) float local90;
		@Pc(82) float local82;
		@Pc(66) float local66;
		if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local66 = -arg1 / arg3;
			local82 = local66 * this.aFloat155 + this.aFloat159;
			local90 = this.aFloat158 + local66 * this.aFloat161;
			local74 = this.aFloat152 + this.aFloat153 * local66;
		} else if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local66 = -arg1 / arg2;
			local90 = this.aFloat156 * local66 + this.aFloat158;
			local82 = this.aFloat159 + local66 * this.aFloat151;
			local74 = this.aFloat157 * local66 + this.aFloat152;
		} else {
			local66 = -arg1 / arg0;
			local74 = local66 * this.aFloat160 + this.aFloat152;
			local82 = this.aFloat154 * local66 + this.aFloat159;
			local90 = this.aFloat158 + this.aFloat150 * local66;
		}
		arg4[2] = arg0 * this.aFloat154 + this.aFloat155 * arg3 + this.aFloat151 * arg2;
		arg4[3] = -(arg4[1] * local90 + local74 * arg4[0] + local82 * arg4[2]);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Applet_Sub1.aFloatArray14[arg3 & 0x3FFF];
		@Pc(15) float local15 = Applet_Sub1.aFloatArray15[arg3 & 0x3FFF];
		@Pc(21) float local21 = Applet_Sub1.aFloatArray14[arg4 & 0x3FFF];
		@Pc(27) float local27 = Applet_Sub1.aFloatArray15[arg4 & 0x3FFF];
		@Pc(33) float local33 = Applet_Sub1.aFloatArray14[arg5 & 0x3FFF];
		@Pc(39) float local39 = Applet_Sub1.aFloatArray15[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat151 = -local15;
		this.aFloat150 = local27 * local39 + local21 * local43;
		this.aFloat161 = local27 * local43 + -local21 * local39;
		this.aFloat155 = local27 * local9;
		this.aFloat160 = local47 * local21 + -local27 * local33;
		this.aFloat157 = local9 * local39;
		this.aFloat154 = local21 * local9;
		this.aFloat156 = local9 * local33;
		this.aFloat153 = local27 * local47 + local21 * local33;
		this.aFloat158 = -(this.aFloat150 * (float) arg2) + this.aFloat161 * (float) -arg0 - this.aFloat156 * (float) arg1;
		this.aFloat152 = (float) -arg0 * this.aFloat153 - (float) arg1 * this.aFloat157 - this.aFloat160 * (float) arg2;
		this.aFloat159 = -((float) arg2 * this.aFloat154) + this.aFloat155 * (float) -arg0 - (float) arg1 * this.aFloat151;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BIFIIFF)V")
	public void method7144(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		if (arg2 == 0) {
			this.aFloat154 = 1.0F;
			this.aFloat153 = (float) arg0;
			this.aFloat161 = this.aFloat155 = this.aFloat157 = this.aFloat151 = this.aFloat160 = this.aFloat150 = 0.0F;
			this.aFloat156 = (float) arg3;
		} else {
			@Pc(10) float local10 = Applet_Sub1.aFloatArray14[arg2 & 0x3FFF];
			@Pc(16) float local16 = Applet_Sub1.aFloatArray15[arg2 & 0x3FFF];
			this.aFloat156 = local10 * (float) arg3;
			this.aFloat153 = (float) arg0 * local10;
			this.aFloat161 = (float) arg0 * local16;
			this.aFloat155 = this.aFloat151 = this.aFloat160 = this.aFloat150 = 0.0F;
			this.aFloat157 = -local16 * (float) arg3;
			this.aFloat154 = 1.0F;
		}
		this.aFloat159 = arg4;
		this.aFloat158 = arg5;
		this.aFloat152 = arg1;
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(III)V")
	@Override
	public void method7134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat159 += (float) arg2;
		this.aFloat152 += (float) arg0;
		this.aFloat158 += (float) arg1;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)[F")
	public float[] method7145() {
		Static614.aFloatArray67[0] = this.aFloat153;
		Static614.aFloatArray67[2] = this.aFloat155;
		Static614.aFloatArray67[13] = 0.0F;
		Static614.aFloatArray67[1] = this.aFloat161;
		Static614.aFloatArray67[14] = 0.0F;
		Static614.aFloatArray67[6] = this.aFloat151;
		Static614.aFloatArray67[4] = this.aFloat157;
		Static614.aFloatArray67[10] = this.aFloat154;
		Static614.aFloatArray67[12] = 0.0F;
		Static614.aFloatArray67[9] = this.aFloat150;
		Static614.aFloatArray67[8] = this.aFloat160;
		Static614.aFloatArray67[5] = this.aFloat156;
		return Static614.aFloatArray67;
	}

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "(I)V")
	@Override
	public void method7132(@OriginalArg(0) int arg0) {
		this.aFloat154 = 1.0F;
		this.aFloat153 = this.aFloat156 = Applet_Sub1.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat161 = Applet_Sub1.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat160 = this.aFloat152 = this.aFloat150 = this.aFloat158 = this.aFloat155 = this.aFloat151 = this.aFloat159 = 0.0F;
		this.aFloat157 = -this.aFloat161;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
	@Override
	public void method7136(@OriginalArg(0) int arg0) {
		this.aFloat153 = 1.0F;
		this.aFloat156 = this.aFloat154 = Applet_Sub1.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat151 = Applet_Sub1.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat150 = -this.aFloat151;
		this.aFloat157 = this.aFloat160 = this.aFloat152 = this.aFloat161 = this.aFloat158 = this.aFloat155 = this.aFloat159 = 0.0F;
	}

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)V")
	@Override
	public void method7130(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Applet_Sub1.aFloatArray14[arg0 & 0x3FFF];
		@Pc(15) float local15 = Applet_Sub1.aFloatArray15[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat161;
		@Pc(21) float local21 = this.aFloat156;
		@Pc(24) float local24 = this.aFloat150;
		this.aFloat161 = local18 * local9 - local15 * this.aFloat155;
		@Pc(37) float local37 = this.aFloat158;
		this.aFloat155 = local9 * this.aFloat155 + local18 * local15;
		this.aFloat156 = local21 * local9 - this.aFloat151 * local15;
		this.aFloat150 = local24 * local9 - local15 * this.aFloat154;
		this.aFloat151 = this.aFloat151 * local9 + local15 * local21;
		this.aFloat154 = local9 * this.aFloat154 + local15 * local24;
		this.aFloat158 = local9 * local37 - this.aFloat159 * local15;
		this.aFloat159 = this.aFloat159 * local9 + local15 * local37;
	}

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "(I)[F")
	public float[] method7146() {
		Static614.aFloatArray67[12] = this.aFloat152;
		Static614.aFloatArray67[0] = this.aFloat153;
		Static614.aFloatArray67[5] = this.aFloat156;
		Static614.aFloatArray67[1] = this.aFloat161;
		Static614.aFloatArray67[2] = this.aFloat155;
		Static614.aFloatArray67[8] = this.aFloat160;
		Static614.aFloatArray67[10] = this.aFloat154;
		Static614.aFloatArray67[4] = this.aFloat157;
		Static614.aFloatArray67[9] = this.aFloat150;
		Static614.aFloatArray67[14] = this.aFloat159;
		Static614.aFloatArray67[13] = this.aFloat158;
		Static614.aFloatArray67[6] = this.aFloat151;
		return Static614.aFloatArray67;
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg0 * this.aFloat155 + this.aFloat151 * (float) arg1 + this.aFloat154 * (float) arg2);
		arg3[0] = (int) (this.aFloat160 * (float) arg2 + (float) arg0 * this.aFloat153 + (float) arg1 * this.aFloat157);
		arg3[1] = (int) ((float) arg1 * this.aFloat156 + this.aFloat161 * (float) arg0 + this.aFloat150 * (float) arg2);
	}

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "(I)V")
	@Override
	public void method7131(@OriginalArg(0) int arg0) {
		this.aFloat156 = 1.0F;
		this.aFloat153 = this.aFloat154 = Applet_Sub1.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat160 = Applet_Sub1.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat157 = this.aFloat152 = this.aFloat161 = this.aFloat150 = this.aFloat158 = this.aFloat151 = this.aFloat159 = 0.0F;
		this.aFloat155 = -this.aFloat160;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)V")
	@Override
	public void method7125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat159 = (float) arg2;
		this.aFloat161 = this.aFloat155 = this.aFloat157 = this.aFloat151 = this.aFloat160 = this.aFloat150 = 0.0F;
		this.aFloat158 = (float) arg1;
		this.aFloat153 = this.aFloat156 = this.aFloat154 = 1.0F;
		this.aFloat152 = (float) arg0;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!tt;)V")
	@Override
	public void method7128(@OriginalArg(0) Class73 arg0) {
		@Pc(6) Class73_Sub3 local6 = (Class73_Sub3) arg0;
		this.aFloat155 = local6.aFloat155;
		this.aFloat160 = local6.aFloat160;
		this.aFloat158 = local6.aFloat158;
		this.aFloat154 = local6.aFloat154;
		this.aFloat161 = local6.aFloat161;
		this.aFloat152 = local6.aFloat152;
		this.aFloat151 = local6.aFloat151;
		this.aFloat150 = local6.aFloat150;
		this.aFloat157 = local6.aFloat157;
		this.aFloat159 = local6.aFloat159;
		this.aFloat156 = local6.aFloat156;
		this.aFloat153 = local6.aFloat153;
	}
}
