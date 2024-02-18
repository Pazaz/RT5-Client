import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class Class138_Sub1 extends Class138 {

	@OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
	public final int anInt3182;

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
	public final int anInt3188;

	@OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
	public final int anInt3189;

	@OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
	public final int anInt3190;

	@OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
	public final int anInt3185;

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
	public final int anInt3183;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!wk;Lclient!ek;IIIIIIIIIIIII)V")
	public Class138_Sub1(@OriginalArg(0) Class403 arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt3182 = arg14;
		this.anInt3188 = arg9;
		this.anInt3189 = arg11;
		this.anInt3190 = arg10;
		this.anInt3185 = arg12;
		this.anInt3183 = arg13;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)Lclient!kda;")
	@Override
	public Class204 method5357() {
		return Static535.aClass204_11;
	}
}
