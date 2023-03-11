import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class173_Sub4 extends Class173 {

	@OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
	private final int anInt7016;

	@OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
	private final int anInt7003;

	@OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
	private final int anInt7015;

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
	private final int anInt7004;

	@OriginalMember(owner = "client!vo", name = "v", descriptor = "I")
	private final int anInt7010;

	@OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
	private final int anInt7009;

	@OriginalMember(owner = "client!vo", name = "s", descriptor = "I")
	private final int anInt7007;

	@OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
	private final int anInt7002;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class173_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt7016 = arg5;
		this.anInt7003 = arg0;
		this.anInt7015 = arg6;
		this.anInt7004 = arg4;
		this.anInt7010 = arg1;
		this.anInt7009 = arg7;
		this.anInt7007 = arg3;
		this.anInt7002 = arg2;
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(III)V")
	@Override
	public void method6251(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(III)V")
	@Override
	public void method6250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg1 * this.anInt7003 >> 12;
		@Pc(24) int local24 = this.anInt7010 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt7002 * arg1 >> 12;
		@Pc(38) int local38 = this.anInt7007 * arg0 >> 12;
		@Pc(45) int local45 = arg1 * this.anInt7004 >> 12;
		@Pc(52) int local52 = this.anInt7016 * arg0 >> 12;
		@Pc(59) int local59 = arg1 * this.anInt7015 >> 12;
		@Pc(66) int local66 = this.anInt7009 * arg0 >> 12;
		Static30.method943(local38, local24, super.anInt6996, local31, local52, local17, local45, local59, local66);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6248(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
