import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class73_Sub2 extends Class73 {

	@OriginalMember(owner = "client!eaa", name = "y", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!eaa", name = "l", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!eaa", name = "H", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!eaa", name = "q", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!eaa", name = "A", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!eaa", name = "r", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!eaa", name = "m", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!eaa", name = "I", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!eaa", name = "E", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!eaa", name = "t", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!eaa", name = "F", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "()V")
	public Class73_Sub2() {
		this.method7133();
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(III)V")
	@Override
	public void method7134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat58 += (float) arg1;
		this.aFloat62 += (float) arg2;
		this.aFloat60 += (float) arg0;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "([I)V")
	@Override
	public void method7126(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat60;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat58;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat62;
		arg0[0] = (int) (this.aFloat56 * local27 + this.aFloat57 * local19 + local11 * this.aFloat59);
		arg0[1] = (int) (local27 * this.aFloat54 + this.aFloat52 * local19 + this.aFloat55 * local11);
		arg0[2] = (int) (this.aFloat61 * local27 + local11 * this.aFloat53 + this.aFloat51 * local19);
	}

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "(I)V")
	@Override
	public void method7132(@OriginalArg(0) int arg0) {
		this.aFloat61 = 1.0F;
		this.aFloat59 = this.aFloat52 = Class120.aFloatArray80[arg0 & 0x3FFF];
		this.aFloat57 = Class120.aFloatArray79[arg0 & 0x3FFF];
		this.aFloat53 = this.aFloat60 = this.aFloat51 = this.aFloat58 = this.aFloat56 = this.aFloat54 = this.aFloat62 = 0.0F;
		this.aFloat55 = -this.aFloat57;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III)V")
	@Override
	public void method7125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat57 = this.aFloat56 = this.aFloat55 = this.aFloat54 = this.aFloat53 = this.aFloat51 = 0.0F;
		this.aFloat62 = (float) arg2;
		this.aFloat59 = this.aFloat52 = this.aFloat61 = 1.0F;
		this.aFloat58 = (float) arg1;
		this.aFloat60 = (float) arg0;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg2 - this.aFloat62);
		@Pc(17) int local17 = (int) ((float) arg1 - this.aFloat58);
		@Pc(24) int local24 = (int) ((float) arg0 - this.aFloat60);
		arg3[2] = (int) (this.aFloat53 * (float) local24 + (float) local17 * this.aFloat51 + (float) local6 * this.aFloat61);
		arg3[1] = (int) (this.aFloat54 * (float) local6 + this.aFloat55 * (float) local24 + this.aFloat52 * (float) local17);
		arg3[0] = (int) ((float) local6 * this.aFloat56 + this.aFloat59 * (float) local24 + this.aFloat57 * (float) local17);
	}

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)V")
	@Override
	public void method7130(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class120.aFloatArray80[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class120.aFloatArray79[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat57;
		@Pc(21) float local21 = this.aFloat52;
		@Pc(24) float local24 = this.aFloat51;
		@Pc(27) float local27 = this.aFloat58;
		this.aFloat57 = local18 * local9 - this.aFloat56 * local15;
		this.aFloat56 = local15 * local18 + local9 * this.aFloat56;
		this.aFloat52 = local9 * local21 - this.aFloat54 * local15;
		this.aFloat54 = this.aFloat54 * local9 + local21 * local15;
		this.aFloat51 = local9 * local24 - this.aFloat61 * local15;
		this.aFloat61 = local9 * this.aFloat61 + local15 * local24;
		this.aFloat58 = local9 * local27 - this.aFloat62 * local15;
		this.aFloat62 = local9 * this.aFloat62 + local15 * local27;
	}

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat55 * (float) arg1 + this.aFloat59 * (float) arg0 + (float) arg2 * this.aFloat53 + this.aFloat60);
		arg3[1] = (int) (this.aFloat51 * (float) arg2 + this.aFloat57 * (float) arg0 + (float) arg1 * this.aFloat52 + this.aFloat58);
		arg3[2] = (int) ((float) arg2 * this.aFloat61 + (float) arg0 * this.aFloat56 + (float) arg1 * this.aFloat54 + this.aFloat62);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class120.aFloatArray80[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class120.aFloatArray79[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class120.aFloatArray80[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class120.aFloatArray79[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class120.aFloatArray80[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class120.aFloatArray79[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat55 = local9 * local39;
		this.aFloat51 = local39 * local27 + local21 * local43;
		this.aFloat54 = -local15;
		this.aFloat61 = local9 * local21;
		this.aFloat53 = -local27 * local33 + local21 * local47;
		this.aFloat56 = local9 * local27;
		this.aFloat52 = local9 * local33;
		this.aFloat57 = local39 * -local21 + local43 * local27;
		this.aFloat59 = local21 * local33 + local47 * local27;
		this.aFloat62 = -((float) arg2 * this.aFloat61) - (float) arg1 * this.aFloat54 + (float) -arg0 * this.aFloat56;
		this.aFloat60 = -(this.aFloat53 * (float) arg2) - this.aFloat55 * (float) arg1 + this.aFloat59 * (float) -arg0;
		this.aFloat58 = -((float) arg1 * this.aFloat52) + this.aFloat57 * (float) -arg0 - (float) arg2 * this.aFloat51;
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat52 * (float) arg1 + this.aFloat57 * (float) arg0 + (float) arg2 * this.aFloat51);
		arg3[0] = (int) ((float) arg0 * this.aFloat59 + (float) arg1 * this.aFloat55 + this.aFloat53 * (float) arg2);
		arg3[2] = (int) ((float) arg2 * this.aFloat61 + this.aFloat54 * (float) arg1 + (float) arg0 * this.aFloat56);
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "()Lclient!tt;")
	@Override
	public Class73 method7129() {
		@Pc(7) Class73_Sub2 local7 = new Class73_Sub2();
		local7.aFloat62 = this.aFloat62;
		local7.aFloat53 = this.aFloat53;
		local7.aFloat52 = this.aFloat52;
		local7.aFloat51 = this.aFloat51;
		local7.aFloat61 = this.aFloat61;
		local7.aFloat60 = this.aFloat60;
		local7.aFloat58 = this.aFloat58;
		local7.aFloat55 = this.aFloat55;
		local7.aFloat54 = this.aFloat54;
		local7.aFloat59 = this.aFloat59;
		local7.aFloat56 = this.aFloat56;
		local7.aFloat57 = this.aFloat57;
		return local7;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "()V")
	@Override
	public void method7133() {
		this.aFloat59 = this.aFloat52 = this.aFloat61 = 1.0F;
		this.aFloat57 = this.aFloat56 = this.aFloat55 = this.aFloat54 = this.aFloat53 = this.aFloat51 = this.aFloat60 = this.aFloat58 = this.aFloat62 = 0.0F;
	}

	@OriginalMember(owner = "client!eaa", name = "g", descriptor = "(I)V")
	@Override
	public void method7131(@OriginalArg(0) int arg0) {
		this.aFloat52 = 1.0F;
		this.aFloat59 = this.aFloat61 = Class120.aFloatArray80[arg0 & 0x3FFF];
		this.aFloat53 = Class120.aFloatArray79[arg0 & 0x3FFF];
		this.aFloat55 = this.aFloat60 = this.aFloat57 = this.aFloat51 = this.aFloat58 = this.aFloat54 = this.aFloat62 = 0.0F;
		this.aFloat56 = -this.aFloat53;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
	@Override
	public void method7136(@OriginalArg(0) int arg0) {
		this.aFloat59 = 1.0F;
		this.aFloat52 = this.aFloat61 = Class120.aFloatArray80[arg0 & 0x3FFF];
		this.aFloat54 = Class120.aFloatArray79[arg0 & 0x3FFF];
		this.aFloat51 = -this.aFloat54;
		this.aFloat55 = this.aFloat53 = this.aFloat60 = this.aFloat57 = this.aFloat58 = this.aFloat56 = this.aFloat62 = 0.0F;
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V")
	@Override
	public void method7139(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class120.aFloatArray80[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class120.aFloatArray79[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat59;
		@Pc(21) float local21 = this.aFloat55;
		@Pc(24) float local24 = this.aFloat53;
		@Pc(27) float local27 = this.aFloat60;
		this.aFloat59 = local9 * local18 - local15 * this.aFloat57;
		this.aFloat55 = local9 * local21 - this.aFloat52 * local15;
		this.aFloat57 = this.aFloat57 * local9 + local15 * local18;
		this.aFloat52 = this.aFloat52 * local9 + local15 * local21;
		this.aFloat53 = local24 * local9 - this.aFloat51 * local15;
		this.aFloat51 = local15 * local24 + local9 * this.aFloat51;
		this.aFloat60 = local9 * local27 - this.aFloat58 * local15;
		this.aFloat58 = this.aFloat58 * local9 + local15 * local27;
	}

	@OriginalMember(owner = "client!eaa", name = "f", descriptor = "(I)V")
	@Override
	public void method7127(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class120.aFloatArray80[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class120.aFloatArray79[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat59;
		@Pc(21) float local21 = this.aFloat55;
		@Pc(24) float local24 = this.aFloat53;
		this.aFloat59 = local18 * local9 + local15 * this.aFloat56;
		@Pc(37) float local37 = this.aFloat60;
		this.aFloat56 = local9 * this.aFloat56 - local18 * local15;
		this.aFloat55 = local15 * this.aFloat54 + local21 * local9;
		this.aFloat54 = this.aFloat54 * local9 - local21 * local15;
		this.aFloat53 = local9 * local24 + local15 * this.aFloat61;
		this.aFloat60 = local37 * local9 + local15 * this.aFloat62;
		this.aFloat61 = local9 * this.aFloat61 - local24 * local15;
		this.aFloat62 = local9 * this.aFloat62 - local37 * local15;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!tt;)V")
	@Override
	public void method7128(@OriginalArg(0) Class73 arg0) {
		@Pc(6) Class73_Sub2 local6 = (Class73_Sub2) arg0;
		this.aFloat56 = local6.aFloat56;
		this.aFloat53 = local6.aFloat53;
		this.aFloat52 = local6.aFloat52;
		this.aFloat54 = local6.aFloat54;
		this.aFloat57 = local6.aFloat57;
		this.aFloat62 = local6.aFloat62;
		this.aFloat59 = local6.aFloat59;
		this.aFloat55 = local6.aFloat55;
		this.aFloat61 = local6.aFloat61;
		this.aFloat58 = local6.aFloat58;
		this.aFloat51 = local6.aFloat51;
		this.aFloat60 = local6.aFloat60;
	}
}
