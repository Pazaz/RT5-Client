import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class103_Sub1 extends Class103 {

	@OriginalMember(owner = "client!jo", name = "v", descriptor = "I")
	private final int anInt3647;

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
	private final int anInt3642;

	@OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
	private final int anInt3643;

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
	private final int anInt3646;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(IIIIIII)V")
	public Class103_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3647 = arg3;
		this.anInt3642 = arg1;
		this.anInt3643 = arg2;
		this.anInt3646 = arg0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt3646 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt3643 * arg1 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt3642 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt3647 >> 12;
		Static134.method3034(local10, local28, super.anInt6633, local17, local35);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt3646 >> 12;
		@Pc(17) int local17 = this.anInt3643 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt3642 >> 12;
		@Pc(31) int local31 = this.anInt3647 * arg0 >> 12;
		Static223.method4328(local10, local17, super.anInt6629, local31, local24, super.anInt6627);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V")
	@Override
	public void method5652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt3646 >> 12;
		@Pc(17) int local17 = this.anInt3643 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt3642 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt3647 >> 12;
		Static220.method4292(local24, super.anInt6627, local17, super.anInt6633, super.anInt6629, local10, local31);
	}
}
