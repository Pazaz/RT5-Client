import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static236 {

	@OriginalMember(owner = "client!nk", name = "Ec", descriptor = "I")
	public static int anInt4309;

	@OriginalMember(owner = "client!nk", name = "pc", descriptor = "I")
	public static int anInt4301 = -1;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!r;Lclient!r;Lclient!wm;I)V")
	public static void method4102(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) Class19 arg2) {
		Static52.aClass239_1 = Static101.method2165(Sprites.p11FullId, arg1);
		Static200.aClass130_3 = arg2.method2857(Static52.aClass239_1, Static396.method1688(arg0, Sprites.p11FullId));
		Static165.aClass239_3 = Static101.method2165(Sprites.p12FullId, arg1);
		Static276.aClass130_4 = arg2.method2857(Static165.aClass239_3, Static396.method1688(arg0, Sprites.p12FullId));
		Static113.aClass239_2 = Static101.method2165(Sprites.b12FullId, arg1);
		Static52.aClass130_1 = arg2.method2857(Static113.aClass239_2, Static396.method1688(arg0, Sprites.b12FullId));
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII)V")
	public static void method4104(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static359.aByteArrayArrayArray16 = new byte[4][arg0][arg1];
	}

}
