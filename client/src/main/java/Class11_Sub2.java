import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
	public int anInt6490;

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
	public int anInt6491;

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
	public int anInt6492;

	@OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
	public int anInt6493;

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
	public int anInt6494;

	@OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
	public int anInt6495;

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
	public int anInt6496;

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
	public int anInt6497;

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
	public int anInt6498;

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
	public int anInt6499;

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
	public int anInt6500;

	@OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
	public int anInt6501;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	public Class11_Sub2() {
		this.method5504();
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "()Lclient!ue;")
	public Class11_Sub2 method5509() {
		@Pc(3) Class11_Sub2 local3 = new Class11_Sub2();
		local3.anInt6492 = this.anInt6492;
		local3.anInt6490 = this.anInt6490;
		local3.anInt6493 = this.anInt6493;
		local3.anInt6501 = this.anInt6501;
		local3.anInt6500 = this.anInt6500;
		local3.anInt6491 = this.anInt6491;
		local3.anInt6497 = this.anInt6497;
		local3.anInt6499 = this.anInt6499;
		local3.anInt6498 = this.anInt6498;
		local3.anInt6496 = this.anInt6496;
		local3.anInt6495 = this.anInt6495;
		local3.anInt6494 = this.anInt6494;
		return local3;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt6501 + (this.anInt6492 * arg0 + this.anInt6490 * arg1 + this.anInt6493 * arg2 >> 15);
		arg3[1] = this.anInt6499 + (this.anInt6500 * arg0 + this.anInt6491 * arg1 + this.anInt6497 * arg2 >> 15);
		arg3[2] = this.anInt6494 + (this.anInt6498 * arg0 + this.anInt6496 * arg1 + this.anInt6495 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
	@Override
	public void method5493(@OriginalArg(0) int arg0) {
		this.anInt6492 = 32768;
		this.anInt6491 = this.anInt6495 = Class39.anIntArray87[arg0 & 0x3FFF];
		this.anInt6496 = Class39.anIntArray88[arg0 & 0x3FFF];
		this.anInt6497 = -this.anInt6496;
		this.anInt6490 = this.anInt6493 = this.anInt6501 = this.anInt6500 = this.anInt6499 = this.anInt6498 = this.anInt6494 = 0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	@Override
	public void method5490(@OriginalArg(0) int arg0) {
		this.anInt6495 = 32768;
		this.anInt6492 = this.anInt6491 = Class39.anIntArray87[arg0 & 0x3FFF];
		this.anInt6500 = Class39.anIntArray88[arg0 & 0x3FFF];
		this.anInt6490 = -this.anInt6500;
		this.anInt6493 = this.anInt6501 = this.anInt6497 = this.anInt6499 = this.anInt6498 = this.anInt6496 = this.anInt6494 = 0;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
	@Override
	public void method5492(@OriginalArg(0) int arg0) {
		this.anInt6491 = 32768;
		this.anInt6492 = this.anInt6495 = Class39.anIntArray87[arg0 & 0x3FFF];
		this.anInt6493 = Class39.anIntArray88[arg0 & 0x3FFF];
		this.anInt6498 = -this.anInt6493;
		this.anInt6490 = this.anInt6501 = this.anInt6500 = this.anInt6497 = this.anInt6499 = this.anInt6496 = this.anInt6494 = 0;
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)V")
	@Override
	public void method5507(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class39.anIntArray87[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class39.anIntArray88[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt6492;
		@Pc(17) int local17 = this.anInt6490;
		@Pc(20) int local20 = this.anInt6493;
		@Pc(23) int local23 = this.anInt6501;
		this.anInt6492 = local14 * local5 + this.anInt6498 * local11 >> 15;
		this.anInt6498 = this.anInt6498 * local5 - local14 * local11 >> 15;
		this.anInt6490 = local17 * local5 + this.anInt6496 * local11 >> 15;
		this.anInt6496 = this.anInt6496 * local5 - local17 * local11 >> 15;
		this.anInt6493 = local20 * local5 + this.anInt6495 * local11 >> 15;
		this.anInt6495 = this.anInt6495 * local5 - local20 * local11 >> 15;
		this.anInt6501 = local23 * local5 + this.anInt6494 * local11 >> 15;
		this.anInt6494 = this.anInt6494 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "()V")
	@Override
	public void method5504() {
		this.anInt6500 = this.anInt6498 = this.anInt6490 = this.anInt6496 = this.anInt6493 = this.anInt6497 = this.anInt6501 = this.anInt6499 = this.anInt6494 = 0;
		this.anInt6492 = this.anInt6491 = this.anInt6495 = 32768;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
	@Override
	public void method5489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6501 += arg0;
		this.anInt6499 += arg1;
		this.anInt6494 += arg2;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class39.anIntArray87[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class39.anIntArray88[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class39.anIntArray87[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class39.anIntArray88[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class39.anIntArray87[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class39.anIntArray88[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt6492 = local17 * local29 + local23 * local47 >> 15;
		this.anInt6500 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt6498 = local23 * local5 >> 15;
		this.anInt6490 = local5 * local35 >> 15;
		this.anInt6491 = local5 * local29 >> 15;
		this.anInt6496 = -local11;
		this.anInt6493 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt6497 = local23 * local35 + local17 * local41 >> 15;
		this.anInt6495 = local17 * local5 >> 15;
		this.anInt6501 = -arg0 * this.anInt6492 - arg1 * this.anInt6490 - arg2 * this.anInt6493 >> 15;
		this.anInt6499 = -arg0 * this.anInt6500 - arg1 * this.anInt6491 - arg2 * this.anInt6497 >> 15;
		this.anInt6494 = -arg0 * this.anInt6498 - arg1 * this.anInt6496 - arg2 * this.anInt6495 >> 15;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "([I)V")
	@Override
	public void method5505(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt6501;
		@Pc(13) int local13 = arg0[1] - this.anInt6499;
		@Pc(20) int local20 = arg0[2] - this.anInt6494;
		arg0[0] = this.anInt6492 * local6 + this.anInt6500 * local13 + this.anInt6498 * local20 >> 15;
		arg0[1] = this.anInt6490 * local6 + this.anInt6491 * local13 + this.anInt6496 * local20 >> 15;
		arg0[2] = this.anInt6493 * local6 + this.anInt6497 * local13 + this.anInt6495 * local20 >> 15;
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	@Override
	public void method5494(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class39.anIntArray87[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class39.anIntArray88[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt6500;
		@Pc(17) int local17 = this.anInt6491;
		@Pc(20) int local20 = this.anInt6497;
		@Pc(23) int local23 = this.anInt6499;
		this.anInt6500 = local14 * local5 - this.anInt6498 * local11 >> 15;
		this.anInt6498 = local14 * local11 + this.anInt6498 * local5 >> 15;
		this.anInt6491 = local17 * local5 - this.anInt6496 * local11 >> 15;
		this.anInt6496 = local17 * local11 + this.anInt6496 * local5 >> 15;
		this.anInt6497 = local20 * local5 - this.anInt6495 * local11 >> 15;
		this.anInt6495 = local20 * local11 + this.anInt6495 * local5 >> 15;
		this.anInt6499 = local23 * local5 - this.anInt6494 * local11 >> 15;
		this.anInt6494 = local23 * local11 + this.anInt6494 * local5 >> 15;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!ao;)V")
	@Override
	public void method5495(@OriginalArg(0) Class11 arg0) {
		@Pc(2) Class11_Sub2 local2 = (Class11_Sub2) arg0;
		this.anInt6492 = local2.anInt6492;
		this.anInt6490 = local2.anInt6490;
		this.anInt6493 = local2.anInt6493;
		this.anInt6501 = local2.anInt6501;
		this.anInt6500 = local2.anInt6500;
		this.anInt6491 = local2.anInt6491;
		this.anInt6497 = local2.anInt6497;
		this.anInt6499 = local2.anInt6499;
		this.anInt6498 = local2.anInt6498;
		this.anInt6496 = local2.anInt6496;
		this.anInt6495 = local2.anInt6495;
		this.anInt6494 = local2.anInt6494;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V")
	@Override
	public void method5496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6500 = this.anInt6498 = this.anInt6490 = this.anInt6496 = this.anInt6493 = this.anInt6497 = 0;
		this.anInt6492 = this.anInt6491 = this.anInt6495 = 32768;
		this.anInt6501 = arg0;
		this.anInt6499 = arg1;
		this.anInt6494 = arg2;
	}
}
