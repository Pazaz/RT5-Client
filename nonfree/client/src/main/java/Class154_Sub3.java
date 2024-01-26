import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Class154_Sub3 extends Class154 {

	@OriginalMember(owner = "client!pfa", name = "t", descriptor = "I")
	private final int anInt7300;

	@OriginalMember(owner = "client!pfa", name = "s", descriptor = "I")
	private final int anInt7302;

	@OriginalMember(owner = "client!pfa", name = "w", descriptor = "I")
	private final int anInt7301;

	@OriginalMember(owner = "client!pfa", name = "r", descriptor = "I")
	private final int anInt7295;

	@OriginalMember(owner = "client!pfa", name = "k", descriptor = "I")
	private final int anInt7299;

	@OriginalMember(owner = "client!pfa", name = "n", descriptor = "I")
	private final int anInt7297;

	@OriginalMember(owner = "client!pfa", name = "x", descriptor = "I")
	private final int anInt7294;

	@OriginalMember(owner = "client!pfa", name = "l", descriptor = "I")
	private final int anInt7293;

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class154_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt7300 = arg7;
		this.anInt7302 = arg5;
		this.anInt7301 = arg4;
		this.anInt7295 = arg6;
		this.anInt7299 = arg0;
		this.anInt7297 = arg3;
		this.anInt7294 = arg2;
		this.anInt7293 = arg1;
	}

	@OriginalMember(owner = "client!pfa", name = "c", descriptor = "(III)V")
	@Override
	public void method6775(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt7299 >> 12;
		@Pc(17) int local17 = this.anInt7293 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt7294 * arg1 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt7297 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt7301 >> 12;
		@Pc(50) int local50 = this.anInt7302 * arg0 >> 12;
		@Pc(57) int local57 = arg1 * this.anInt7295 >> 12;
		@Pc(64) int local64 = this.anInt7300 * arg0 >> 12;
		Static316.method7478(local10, local31, local50, super.anInt7655, local38, local64, local17, local57, local24);
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(III)V")
	@Override
	public void method6776(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(III)V")
	@Override
	public void method6772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
