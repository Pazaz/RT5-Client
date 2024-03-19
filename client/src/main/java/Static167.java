import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static167 {

	@OriginalMember(owner = "client!la", name = "b", descriptor = "I")
	public static int anInt4035;

	@OriginalMember(owner = "client!la", name = "d", descriptor = "[I")
	public static int[] anIntArray284;

	@OriginalMember(owner = "client!la", name = "k", descriptor = "I")
	public static int anInt4041 = 0;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "I")
	public static final int anInt4042 = -1;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)I")
	public static int method3464() {
		return ((Static340.anInt7187 == 0 ? 0 : 1) << 21) + ((Static90.aBoolean156 ? 1 : 0) << 19) + (Static226.anInt5071 << 17) + ((Static307.aBoolean465 ? 1 : 0) << 15) + ((Static265.aBoolean396 ? 1 : 0) << 13) + ((Static102.anInt2545 & 0x3) << 11) + ((Static190.aBoolean378 ? 1 : 0) << 10) + ((Static166.aBoolean285 ? 1 : 0) << 9) + ((Static289.aBoolean360 ? 1 : 0) << 6) + ((Static218.aBoolean342 ? 1 : 0) << 5) + (Static216.anInt4909 & 0x7) + ((Static109.aBoolean182 ? 1 : 0) << 3) + ((Static146.aBoolean257 ? 1 : 0) << 4) + ((Static288.aBoolean423 ? 1 : 0) << 8) + ((Static200.aBoolean321 ? 1 : 0) << 16) + ((Static84.anInt2246 == 0 ? 0 : 1) << 20) + ((Static183.anInt4317 == 0 ? 0 : 1) << 22) + (Static293.method5173() << 23) + (Static271.anInt5700 << 25) + ((Static122.aBoolean202 ? 1 : 0) << 27) + (Static4.anInt207 << 28);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method3465(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static199.aClass202_1);
		arg0.addMouseMotionListener(Static199.aClass202_1);
		arg0.addFocusListener(Static199.aClass202_1);
	}
}
