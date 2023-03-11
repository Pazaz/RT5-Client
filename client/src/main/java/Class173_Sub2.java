import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class173_Sub2 extends Class173 {

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
	private final int anInt4853;

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
	private final int anInt4855;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
	private final int anInt4849;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
	private final int anInt4850;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIIII)V")
	public Class173_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4853 = arg1;
		this.anInt4855 = arg0;
		this.anInt4849 = arg2;
		this.anInt4850 = arg3;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
	@Override
	public void method6250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)V")
	@Override
	public void method6251(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4855 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt4849 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt4853 >> 12;
		@Pc(36) int local36 = this.anInt4850 * arg1 >> 12;
		Static312.method5311(local10, super.anInt6997, super.anInt6996, local29, local17, local36, super.anInt6998);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6248(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4855 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt4849 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt4853 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt4850 * arg0 >> 12;
		Static42.method5749(local31, local17, local10, local24, super.anInt6997);
	}
}
