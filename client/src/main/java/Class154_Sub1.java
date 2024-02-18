import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class154_Sub1 extends Class154 {

	@OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
	private final int anInt3708;

	@OriginalMember(owner = "client!hba", name = "o", descriptor = "I")
	private final int anInt3710;

	@OriginalMember(owner = "client!hba", name = "t", descriptor = "I")
	private final int anInt3712;

	@OriginalMember(owner = "client!hba", name = "s", descriptor = "I")
	private final int anInt3706;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(IIIIIII)V")
	public Class154_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3708 = arg1;
		this.anInt3710 = arg0;
		this.anInt3712 = arg2;
		this.anInt3706 = arg3;
	}

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "(III)V")
	@Override
	public void method6775(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt3710 >> 12;
		@Pc(17) int local17 = this.anInt3712 * arg1 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt3708 >> 12;
		@Pc(36) int local36 = this.anInt3706 * arg0 >> 12;
		Static168.method2637(local36, super.anInt7655, super.anInt7656, local17, local29, local10);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(III)V")
	@Override
	public void method6776(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt3710 * arg1 >> 12;
		@Pc(22) int local22 = arg1 * this.anInt3712 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt3708 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt3706 >> 12;
		Static264.method9459(super.anInt7654, local22, super.anInt7655, local29, local36, local15, super.anInt7656);
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(III)V")
	@Override
	public void method6772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt3710 * arg0 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt3712 >> 12;
		@Pc(29) int local29 = this.anInt3708 * arg1 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt3706 >> 12;
		Static624.method8330(local22, local10, super.anInt7654, local36, local29);
	}
}
