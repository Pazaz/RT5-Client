import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!go", name = "P", descriptor = "[I")
	public static int[] anIntArray163;

	@OriginalMember(owner = "client!go", name = "Y", descriptor = "[I")
	public static int[] anIntArray166;

	@OriginalMember(owner = "client!go", name = "bb", descriptor = "[I")
	public static int[] anIntArray167;

	@OriginalMember(owner = "client!go", name = "R", descriptor = "I")
	public static int anInt2545 = 2;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "(B)V")
	public static void method2127() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static230.aBooleanArray16[local3] = true;
		}
	}

	@OriginalMember(owner = "client!go", name = "e", descriptor = "(I)Z")
	public static boolean method2128() {
		try {
			return Static202.method4039();
		} catch (@Pc(14) IOException local14) {
			Static224.method4551();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(59) String local59 = "T2 - " + Static305.anInt6393 + "," + Static87.anInt2328 + "," + Static346.anInt7304 + " - " + Static200.anInt4591 + "," + (Static149.anInt3667 + Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0]) + "," + (Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0] + Static96.anInt2446) + " - ";
			for (@Pc(61) int local61 = 0; local61 < Static200.anInt4591 && local61 < 50; local61++) {
				local59 = local59 + Static299.aClass1_Sub16_Sub2_3.aByteArray86[local61] + ",";
			}
			Static58.method1402(local59, local19);
			Static54.method1385();
			return true;
		}
	}
}
