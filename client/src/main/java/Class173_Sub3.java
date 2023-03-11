import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class173_Sub3 extends Class173 {

	@OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
	private final int anInt5717;

	@OriginalMember(owner = "client!rm", name = "x", descriptor = "I")
	private final int anInt5723;

	@OriginalMember(owner = "client!rm", name = "w", descriptor = "I")
	private final int anInt5722;

	@OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
	private final int anInt5719;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(IIIIIII)V")
	public Class173_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5717 = arg3;
		this.anInt5723 = arg1;
		this.anInt5722 = arg0;
		this.anInt5719 = arg2;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V")
	@Override
	public void method6250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5722 >> 12;
		@Pc(17) int local17 = this.anInt5719 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt5723 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt5717 * arg0 >> 12;
		Static119.method2377(local10, local31, local17, super.anInt6998, super.anInt6996, local24);
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(III)V")
	@Override
	public void method6251(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5722 * arg0 >> 12;
		@Pc(23) int local23 = this.anInt5719 * arg0 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt5723 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt5717 >> 12;
		Static181.method3372(super.anInt6998, local37, local30, super.anInt6996, local10, local23, super.anInt6997);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6248(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5722 >> 12;
		@Pc(17) int local17 = this.anInt5719 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt5723 * arg0 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt5717 >> 12;
		Static57.method1622(local31, local17, local24, super.anInt6997, local10);
	}
}
