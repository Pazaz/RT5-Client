import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!mja", name = "g", descriptor = "I")
	public static int anInt6215 = 255;

	@OriginalMember(owner = "client!mja", name = "b", descriptor = "[I")
	public static final int[] anIntArray483 = new int[8];

	@OriginalMember(owner = "client!mja", name = "f", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIB)I")
	public static int method5571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(27) byte local27;
		if (arg1 > 20000) {
			local27 = 4;
			Static395.method9162();
		} else if (arg1 > 10000) {
			Static133.method2316();
			local27 = 3;
		} else if (arg1 <= 5000) {
			local27 = 1;
			Static468.method7643();
		} else {
			local27 = 2;
			Static75.method6239();
		}
		if (arg0 != Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7915()) {
			Static400.aClass2_Sub34_28.method5104(arg0, Static400.aClass2_Sub34_28.aClass57_Sub29_2);
			Static32.method880(arg0, false);
		}
		Static666.method8693(1);
		return local27;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(III)Z")
	public static boolean method5572(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static407.method5627(arg0, arg1) || Static475.method6443(arg0, arg1);
	}
}
