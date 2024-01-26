import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class154_Sub2 extends Class154 {

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
	private final int anInt5468;

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
	private final int anInt5465;

	@OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
	private final int anInt5467;

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
	private final int anInt5463;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIIIIII)V")
	public Class154_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5468 = arg2;
		this.anInt5465 = arg3;
		this.anInt5467 = arg0;
		this.anInt5463 = arg1;
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(III)V")
	@Override
	public void method6775(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V")
	@Override
	public void method6776(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt5467 * arg1 >> 12;
		@Pc(25) int local25 = this.anInt5468 * arg1 >> 12;
		@Pc(32) int local32 = this.anInt5463 * arg0 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt5465 >> 12;
		Static136.method2347(local32, super.anInt7656, local39, local18, super.anInt7655, super.anInt7654, local25);
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(III)V")
	@Override
	public void method6772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt5467 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt5468 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt5463 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt5465 >> 12;
		Static180.method2776(local31, super.anInt7654, local24, local17, local10);
	}
}
