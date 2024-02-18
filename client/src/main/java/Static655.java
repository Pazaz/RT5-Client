import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static655 {

	@OriginalMember(owner = "client!un", name = "K", descriptor = "[Lclient!gca;")
	public static Class140[] aClass140Array1;

	@OriginalMember(owner = "client!un", name = "I", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_237 = new Class225(18, 4);

	@OriginalMember(owner = "client!un", name = "t", descriptor = "I")
	public static int anInt9763 = -1;

	@OriginalMember(owner = "client!un", name = "z", descriptor = "I")
	public static int anInt9766 = 0;

	@OriginalMember(owner = "client!un", name = "u", descriptor = "Lclient!ul;")
	public static final Class377 aClass377_7 = new Class377("game4", "Game 4", 3);

	@OriginalMember(owner = "client!un", name = "B", descriptor = "I")
	public static int anInt9767 = 0;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!vq;ILjava/awt/Frame;)V")
	public static void method8562(@OriginalArg(0) Class390 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(10) Class270 local10 = arg0.method8989(arg1);
			while (local10.anInt6789 == 0) {
				Static638.method8395(10L);
			}
			if (local10.anInt6789 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static638.method8395(100L);
		}
	}
}
