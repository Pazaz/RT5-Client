import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public final class Class2_Sub31 extends Node {

	@OriginalMember(owner = "client!qt", name = "K", descriptor = "I")
	public final int anInt5547;

	@OriginalMember(owner = "client!qt", name = "y", descriptor = "I")
	private final int anInt5536;

	@OriginalMember(owner = "client!qt", name = "F", descriptor = "I")
	public final int anInt5542;

	@OriginalMember(owner = "client!qt", name = "G", descriptor = "I")
	private final int anInt5543;

	@OriginalMember(owner = "client!qt", name = "s", descriptor = "I")
	private final int anInt5532;

	@OriginalMember(owner = "client!qt", name = "z", descriptor = "I")
	public final int anInt5537;

	@OriginalMember(owner = "client!qt", name = "t", descriptor = "I")
	private final int anInt5533;

	@OriginalMember(owner = "client!qt", name = "I", descriptor = "I")
	private final int anInt5545;

	@OriginalMember(owner = "client!qt", name = "w", descriptor = "I")
	public final int anInt5534;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class2_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5547 = arg6;
		this.anInt5536 = arg2;
		this.anInt5542 = arg7;
		this.anInt5543 = arg0;
		this.anInt5532 = arg1;
		this.anInt5537 = arg8;
		this.anInt5533 = arg3;
		this.anInt5545 = arg4;
		this.anInt5534 = arg5;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II[II)V")
	public void method5059(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[2] = this.anInt5547 + arg0 - this.anInt5536;
		arg1[1] = arg2 + this.anInt5534 - this.anInt5532;
		arg1[0] = 0;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIB)Z")
	public boolean method5060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= this.anInt5534 && arg1 <= this.anInt5542 && this.anInt5547 <= arg0 && arg0 <= this.anInt5537;
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(II[II)V")
	public void method5061(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[0] = this.anInt5543;
		arg1[2] = this.anInt5536 + arg2 - this.anInt5547;
		arg1[1] = this.anInt5532 + arg0 - this.anInt5534;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIB)Z")
	public boolean method5063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 == this.anInt5543 && arg2 >= this.anInt5532 && arg2 <= this.anInt5533 && arg1 >= this.anInt5536 && this.anInt5545 >= arg1;
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(IZI)Z")
	public boolean method5066(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt5532 <= arg1 && arg1 <= this.anInt5533 && arg0 >= this.anInt5536 && this.anInt5545 >= arg0;
	}
}
