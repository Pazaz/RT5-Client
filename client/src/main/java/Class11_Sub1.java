import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!da", name = "n", descriptor = "F")
	public float aFloat5;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "F")
	public float aFloat6;

	@OriginalMember(owner = "client!da", name = "p", descriptor = "F")
	public float aFloat7;

	@OriginalMember(owner = "client!da", name = "q", descriptor = "F")
	public float aFloat8;

	@OriginalMember(owner = "client!da", name = "r", descriptor = "F")
	public float aFloat9;

	@OriginalMember(owner = "client!da", name = "s", descriptor = "F")
	public float aFloat10;

	@OriginalMember(owner = "client!da", name = "t", descriptor = "F")
	public float aFloat11;

	@OriginalMember(owner = "client!da", name = "u", descriptor = "F")
	public float aFloat12;

	@OriginalMember(owner = "client!da", name = "v", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!da", name = "w", descriptor = "F")
	public float aFloat14;

	@OriginalMember(owner = "client!da", name = "x", descriptor = "F")
	public float aFloat15;

	@OriginalMember(owner = "client!da", name = "z", descriptor = "F")
	public float aFloat16;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	public Class11_Sub1() {
		this.method5504();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	@Override
	public void method5490(@OriginalArg(0) int arg0) {
		this.aFloat9 = 1.0F;
		this.aFloat12 = this.aFloat7 = Class109.aFloatArray16[arg0 & 0x3FFF];
		this.aFloat6 = Class109.aFloatArray17[arg0 & 0x3FFF];
		this.aFloat10 = -this.aFloat6;
		this.aFloat5 = this.aFloat16 = this.aFloat13 = this.aFloat8 = this.aFloat11 = this.aFloat14 = this.aFloat15 = 0.0F;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
	@Override
	public void method5492(@OriginalArg(0) int arg0) {
		this.aFloat7 = 1.0F;
		this.aFloat12 = this.aFloat9 = Class109.aFloatArray16[arg0 & 0x3FFF];
		this.aFloat5 = Class109.aFloatArray17[arg0 & 0x3FFF];
		this.aFloat11 = -this.aFloat5;
		this.aFloat10 = this.aFloat16 = this.aFloat6 = this.aFloat13 = this.aFloat8 = this.aFloat14 = this.aFloat15 = 0.0F;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class109.aFloatArray16[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class109.aFloatArray17[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class109.aFloatArray16[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class109.aFloatArray17[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class109.aFloatArray16[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class109.aFloatArray17[arg5 & 0x3FFF];
		@Pc(39) float local39 = local29 * local11;
		@Pc(43) float local43 = local35 * local11;
		this.aFloat7 = local5 * local29;
		this.aFloat13 = local35 * local23 + local17 * local39;
		this.aFloat10 = local5 * local35;
		this.aFloat5 = local43 * local17 + -local23 * local29;
		this.aFloat14 = -local11;
		this.aFloat12 = local17 * local29 + local43 * local23;
		this.aFloat11 = local23 * local5;
		this.aFloat6 = local35 * -local17 + local23 * local39;
		this.aFloat9 = local17 * local5;
		this.aFloat16 = -((float) arg1 * this.aFloat10) + (float) -arg0 * this.aFloat12 - (float) arg2 * this.aFloat5;
		this.aFloat8 = -(this.aFloat7 * (float) arg1) + (float) -arg0 * this.aFloat6 - this.aFloat13 * (float) arg2;
		this.aFloat15 = -((float) arg2 * this.aFloat9) + this.aFloat11 * (float) -arg0 - this.aFloat14 * (float) arg1;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()Lclient!da;")
	public Class11_Sub1 method1257() {
		@Pc(3) Class11_Sub1 local3 = new Class11_Sub1();
		local3.aFloat7 = this.aFloat7;
		local3.aFloat16 = this.aFloat16;
		local3.aFloat5 = this.aFloat5;
		local3.aFloat8 = this.aFloat8;
		local3.aFloat9 = this.aFloat9;
		local3.aFloat15 = this.aFloat15;
		local3.aFloat6 = this.aFloat6;
		local3.aFloat14 = this.aFloat14;
		local3.aFloat13 = this.aFloat13;
		local3.aFloat12 = this.aFloat12;
		local3.aFloat11 = this.aFloat11;
		local3.aFloat10 = this.aFloat10;
		return local3;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
	@Override
	public void method5489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat8 += arg1;
		this.aFloat16 += arg0;
		this.aFloat15 += arg2;
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
	@Override
	public void method5507(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class109.aFloatArray16[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class109.aFloatArray17[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat12;
		@Pc(17) float local17 = this.aFloat10;
		@Pc(20) float local20 = this.aFloat5;
		@Pc(23) float local23 = this.aFloat16;
		this.aFloat12 = this.aFloat11 * local11 + local14 * local5;
		this.aFloat10 = local5 * local17 + this.aFloat14 * local11;
		this.aFloat11 = local5 * this.aFloat11 - local14 * local11;
		this.aFloat5 = local20 * local5 + local11 * this.aFloat9;
		this.aFloat14 = local5 * this.aFloat14 - local17 * local11;
		this.aFloat9 = local5 * this.aFloat9 - local20 * local11;
		this.aFloat16 = local23 * local5 + this.aFloat15 * local11;
		this.aFloat15 = local5 * this.aFloat15 - local11 * local23;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(B)[F")
	public float[] method1258() {
		Static42.aFloatArray3[10] = this.aFloat9;
		Static42.aFloatArray3[5] = this.aFloat7;
		Static42.aFloatArray3[0] = this.aFloat12;
		Static42.aFloatArray3[13] = this.aFloat8;
		Static42.aFloatArray3[9] = this.aFloat13;
		Static42.aFloatArray3[1] = this.aFloat6;
		Static42.aFloatArray3[8] = this.aFloat5;
		Static42.aFloatArray3[4] = this.aFloat10;
		Static42.aFloatArray3[14] = this.aFloat15;
		Static42.aFloatArray3[6] = this.aFloat14;
		Static42.aFloatArray3[12] = this.aFloat16;
		Static42.aFloatArray3[2] = this.aFloat11;
		return Static42.aFloatArray3;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V")
	@Override
	public void method5496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat16 = arg0;
		this.aFloat6 = this.aFloat11 = this.aFloat10 = this.aFloat14 = this.aFloat5 = this.aFloat13 = 0.0F;
		this.aFloat8 = arg1;
		this.aFloat12 = this.aFloat7 = this.aFloat9 = 1.0F;
		this.aFloat15 = arg2;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!ao;)V")
	public void method1259(@OriginalArg(1) Class11 arg0) {
		@Pc(2) Class11_Sub1 local2 = (Class11_Sub1) arg0;
		this.aFloat12 = local2.aFloat12;
		this.aFloat10 = local2.aFloat6;
		this.aFloat5 = local2.aFloat11;
		this.aFloat6 = local2.aFloat10;
		this.aFloat11 = local2.aFloat5;
		this.aFloat13 = local2.aFloat14;
		this.aFloat7 = local2.aFloat7;
		this.aFloat9 = local2.aFloat9;
		this.aFloat16 = -(this.aFloat12 * local2.aFloat16 + this.aFloat10 * local2.aFloat8 + local2.aFloat15 * this.aFloat5);
		this.aFloat14 = local2.aFloat13;
		this.aFloat8 = -(local2.aFloat8 * this.aFloat7 + this.aFloat6 * local2.aFloat16 + local2.aFloat15 * this.aFloat13);
		this.aFloat15 = -(local2.aFloat8 * this.aFloat14 + this.aFloat11 * local2.aFloat16 + local2.aFloat15 * this.aFloat9);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([I)V")
	@Override
	public void method5505(@OriginalArg(0) int[] arg0) {
		@Pc(7) float local7 = (float) arg0[0] - this.aFloat16;
		@Pc(16) float local16 = (float) arg0[1] - this.aFloat8;
		@Pc(24) float local24 = (float) arg0[2] - this.aFloat15;
		arg0[1] = (int) (this.aFloat14 * local24 + this.aFloat10 * local7 + this.aFloat7 * local16);
		arg0[2] = (int) (local24 * this.aFloat9 + local7 * this.aFloat5 + this.aFloat13 * local16);
		arg0[0] = (int) (local16 * this.aFloat6 + local7 * this.aFloat12 + this.aFloat11 * local24);
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
	@Override
	public void method5493(@OriginalArg(0) int arg0) {
		this.aFloat12 = 1.0F;
		this.aFloat7 = this.aFloat9 = Class109.aFloatArray16[arg0 & 0x3FFF];
		this.aFloat14 = Class109.aFloatArray17[arg0 & 0x3FFF];
		this.aFloat13 = -this.aFloat14;
		this.aFloat10 = this.aFloat5 = this.aFloat16 = this.aFloat6 = this.aFloat8 = this.aFloat11 = this.aFloat15 = 0.0F;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
	@Override
	public void method5504() {
		this.aFloat12 = this.aFloat7 = this.aFloat9 = 1.0F;
		this.aFloat6 = this.aFloat11 = this.aFloat10 = this.aFloat14 = this.aFloat5 = this.aFloat13 = this.aFloat16 = this.aFloat8 = this.aFloat15 = 0.0F;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ao;)V")
	@Override
	public void method5495(@OriginalArg(0) Class11 arg0) {
		@Pc(2) Class11_Sub1 local2 = (Class11_Sub1) arg0;
		this.aFloat13 = local2.aFloat13;
		this.aFloat10 = local2.aFloat10;
		this.aFloat12 = local2.aFloat12;
		this.aFloat6 = local2.aFloat6;
		this.aFloat14 = local2.aFloat14;
		this.aFloat16 = local2.aFloat16;
		this.aFloat8 = local2.aFloat8;
		this.aFloat9 = local2.aFloat9;
		this.aFloat7 = local2.aFloat7;
		this.aFloat11 = local2.aFloat11;
		this.aFloat5 = local2.aFloat5;
		this.aFloat15 = local2.aFloat15;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat9 + (float) arg1 * this.aFloat14 + (float) arg0 * this.aFloat11 + this.aFloat15);
		arg3[0] = (int) (this.aFloat16 + (float) arg2 * this.aFloat5 + this.aFloat12 * (float) arg0 + this.aFloat10 * (float) arg1);
		arg3[1] = (int) (this.aFloat8 + this.aFloat13 * (float) arg2 + (float) arg1 * this.aFloat7 + (float) arg0 * this.aFloat6);
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
	@Override
	public void method5494(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class109.aFloatArray16[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class109.aFloatArray17[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat6;
		@Pc(17) float local17 = this.aFloat7;
		@Pc(20) float local20 = this.aFloat13;
		this.aFloat6 = local5 * local14 - this.aFloat11 * local11;
		@Pc(34) float local34 = this.aFloat8;
		this.aFloat7 = local5 * local17 - this.aFloat14 * local11;
		this.aFloat11 = local11 * local14 + local5 * this.aFloat11;
		this.aFloat14 = local5 * this.aFloat14 + local17 * local11;
		this.aFloat13 = local20 * local5 - this.aFloat9 * local11;
		this.aFloat9 = local5 * this.aFloat9 + local11 * local20;
		this.aFloat8 = local34 * local5 - local11 * this.aFloat15;
		this.aFloat15 = this.aFloat15 * local5 + local11 * local34;
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(I)[F")
	public float[] method1260() {
		Static42.aFloatArray3[0] = this.aFloat12;
		Static42.aFloatArray3[12] = 0.0F;
		Static42.aFloatArray3[13] = 0.0F;
		Static42.aFloatArray3[1] = this.aFloat6;
		Static42.aFloatArray3[8] = this.aFloat5;
		Static42.aFloatArray3[14] = 0.0F;
		Static42.aFloatArray3[4] = this.aFloat10;
		Static42.aFloatArray3[10] = this.aFloat9;
		Static42.aFloatArray3[9] = this.aFloat13;
		Static42.aFloatArray3[6] = this.aFloat14;
		Static42.aFloatArray3[2] = this.aFloat11;
		Static42.aFloatArray3[5] = this.aFloat7;
		return Static42.aFloatArray3;
	}
}
