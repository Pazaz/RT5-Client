import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class103_Sub3 extends Class103 {

	@OriginalMember(owner = "client!mn", name = "t", descriptor = "I")
	private final int anInt4423;

	@OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
	private final int anInt4415;

	@OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
	private final int anInt4424;

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
	private final int anInt4416;

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
	private final int anInt4413;

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
	private final int anInt4419;

	@OriginalMember(owner = "client!mn", name = "w", descriptor = "I")
	private final int anInt4425;

	@OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
	private final int anInt4417;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class103_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt4423 = arg6;
		this.anInt4415 = arg2;
		this.anInt4424 = arg0;
		this.anInt4416 = arg4;
		this.anInt4413 = arg1;
		this.anInt4419 = arg3;
		this.anInt4425 = arg7;
		this.anInt4417 = arg5;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)V")
	@Override
	public void method5652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt4424 >> 12;
		@Pc(17) int local17 = this.anInt4413 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt4415 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt4419 * arg0 >> 12;
		@Pc(38) int local38 = this.anInt4416 * arg1 >> 12;
		@Pc(45) int local45 = this.anInt4417 * arg0 >> 12;
		@Pc(52) int local52 = this.anInt4423 * arg1 >> 12;
		@Pc(59) int local59 = arg0 * this.anInt4425 >> 12;
		Static38.method944(super.anInt6629, local31, local45, local38, local10, local17, local52, local59, local24);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
