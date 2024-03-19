import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class103_Sub4 extends Class103 {

	@OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
	private final int anInt6637;

	@OriginalMember(owner = "client!uq", name = "u", descriptor = "I")
	private final int anInt6644;

	@OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
	private final int anInt6642;

	@OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
	private final int anInt6643;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(IIIIIII)V")
	public Class103_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6637 = arg0;
		this.anInt6644 = arg1;
		this.anInt6642 = arg3;
		this.anInt6643 = arg2;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt6637 * arg1 >> 12;
		@Pc(21) int local21 = this.anInt6643 * arg1 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt6644 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt6642 >> 12;
		Static213.method1623(local10, local35, local21, super.anInt6633, local28);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)V")
	@Override
	public void method5652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt6637 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt6643 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt6644 >> 12;
		@Pc(34) int local34 = this.anInt6642 * arg1 >> 12;
		Static104.method2153(super.anInt6627, super.anInt6633, local24, local34, local17, local10, super.anInt6629);
	}
}
