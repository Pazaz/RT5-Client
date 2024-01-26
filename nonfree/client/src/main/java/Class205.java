import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class205 {

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
	private int anInt5124;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
	private int anInt5130;

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
	private int anInt5128;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
	private int anInt5132;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
	public int anInt5123;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
	public int anInt5126;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
	public int anInt5131;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
	public int anInt5125;

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
	public int anInt5134;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
	public int anInt5133;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt5124 = arg0;
		this.anInt5130 = arg2;
		this.anInt5128 = arg1;
		this.anInt5132 = arg3 * arg3;
		this.anInt5123 = this.anInt5124 + arg4;
		this.anInt5126 = arg5 + this.anInt5124;
		this.anInt5131 = this.anInt5130 + arg8;
		this.anInt5125 = arg9 + this.anInt5130;
		this.anInt5134 = this.anInt5128 + arg7;
		this.anInt5133 = arg6 + this.anInt5128;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt5130 = arg6;
		this.anInt5128 = arg2;
		this.anInt5132 = arg5 * arg5;
		this.anInt5124 = arg3;
		this.anInt5133 = arg0 + this.anInt5128;
		this.anInt5131 = arg1 + this.anInt5130;
		this.anInt5134 = this.anInt5128 + arg7;
		this.anInt5126 = arg9 + this.anInt5124;
		this.anInt5123 = arg8 + this.anInt5124;
		this.anInt5125 = arg4 + this.anInt5130;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBII)Z")
	public boolean method4631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt5123 > arg2 || this.anInt5126 < arg2) {
			return false;
		} else if (this.anInt5133 > arg0 || arg0 > this.anInt5134) {
			return false;
		} else if (arg1 >= this.anInt5131 && this.anInt5125 >= arg1) {
			@Pc(74) int local74 = arg2 - this.anInt5124;
			@Pc(79) int local79 = arg1 - this.anInt5130;
			return local79 * local79 + local74 * local74 < this.anInt5132;
		} else {
			return false;
		}
	}
}
