import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!v", name = "d", descriptor = "B")
	public static byte aByte67;

	@OriginalMember(owner = "client!v", name = "h", descriptor = "Lclient!qj;")
	public static Class162 aClass162_227;

	@OriginalMember(owner = "client!v", name = "c", descriptor = "I")
	public static int anInt6648 = 0;

	@OriginalMember(owner = "client!v", name = "j", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray4 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!qj;)I")
	public static int method5656(@OriginalArg(1) Class162 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method4615(Static148.anInt3664)) {
			local10++;
		}
		if (arg0.method4615(Static319.anInt6576)) {
			local10++;
		}
		if (arg0.method4615(Static137.anInt3409)) {
			local10++;
		}
		if (arg0.method4615(Static83.anInt2189)) {
			local10++;
		}
		if (arg0.method4615(Static147.anInt3641)) {
			local10++;
		}
		if (arg0.method4615(Static57.anInt5676)) {
			local10++;
		}
		if (arg0.method4615(Static286.anInt6047)) {
			local10++;
		}
		if (arg0.method4615(Static150.anInt3680)) {
			local10++;
		}
		if (arg0.method4615(Static112.anInt2873)) {
			local10++;
		}
		if (arg0.method4615(Static326.anInt6667)) {
			local10++;
		}
		if (arg0.method4615(Static66.anInt1845)) {
			local10++;
		}
		if (arg0.method4615(Static168.anInt4067)) {
			local10++;
		}
		if (arg0.method4615(Static182.anInt4302)) {
			local10++;
		}
		if (arg0.method4615(Static104.anInt2582)) {
			local10++;
		}
		if (arg0.method4615(Static211.anInt3180)) {
			local10++;
		}
		return local10;
	}
}
