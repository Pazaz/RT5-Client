import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class103_Sub2 extends Class103 {

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
	private final int anInt3807;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
	private final int anInt3805;

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
	private final int anInt3812;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
	private final int anInt3810;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIII)V")
	public Class103_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt3807 = arg1;
		this.anInt3805 = arg0;
		this.anInt3812 = arg3;
		this.anInt3810 = arg2;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V")
	@Override
	public void method5652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt3805 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt3810 >> 12;
		@Pc(24) int local24 = this.anInt3807 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt3812 * arg0 >> 12;
		Static264.method4781(super.anInt6629, local10, local17, local24, local31);
	}
}
