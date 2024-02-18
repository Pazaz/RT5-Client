import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public final class Class138_Sub3 extends Class138 {

	@OriginalMember(owner = "client!il", name = "q", descriptor = "I")
	public final int anInt4427;

	@OriginalMember(owner = "client!il", name = "w", descriptor = "I")
	public final int anInt4428;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!wk;Lclient!ek;IIIIIIIII)V")
	public Class138_Sub3(@OriginalArg(0) Class403 arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt4427 = arg10;
		this.anInt4428 = arg9;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)Lclient!kda;")
	@Override
	public Class204 method5357() {
		return Static77.aClass204_1;
	}
}
