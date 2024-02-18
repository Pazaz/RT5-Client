import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "Lclient!gba;")
	public static Class139 aClass139_2;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "Z")
	public static boolean aBoolean356 = false;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_58 = new Class345(54, 6);

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "F")
	public static float aFloat83 = 0.0F;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
	public static int anInt4620 = 100;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
	public static int anInt4621 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public static void method4182() {
		if (Static316.aFrame8 != null) {
			return;
		}
		@Pc(17) int local17 = Static134.anInt10329;
		@Pc(19) int local19 = Static241.anInt3962;
		@Pc(27) int local27 = Static52.anInt1059 - local17 - Static680.anInt10289;
		@Pc(34) int local34 = Static54.anInt1084 - local19 - Static380.anInt5979;
		if (local17 <= 0 && local27 <= 0 && local19 <= 0 && local34 <= 0) {
			return;
		}
		try {
			@Pc(59) Container local59;
			if (Static353.aFrame10 != null) {
				local59 = Static353.aFrame10;
			} else if (Static166.anApplet1 == null) {
				local59 = Static149.anApplet_Sub1_1;
			} else {
				local59 = Static166.anApplet1;
			}
			@Pc(67) int local67 = 0;
			@Pc(69) int local69 = 0;
			if (local59 == Static353.aFrame10) {
				@Pc(75) Insets local75 = Static353.aFrame10.getInsets();
				local67 = local75.left;
				local69 = local75.top;
			}
			@Pc(84) Graphics local84 = local59.getGraphics();
			local84.setColor(Color.black);
			if (local17 > 0) {
				local84.fillRect(local67, local69, local17, Static54.anInt1084);
			}
			if (local19 > 0) {
				local84.fillRect(local67, local69, Static52.anInt1059, local19);
			}
			if (local27 > 0) {
				local84.fillRect(Static52.anInt1059 + local67 - local27, local69, local27, Static54.anInt1084);
			}
			if (local34 > 0) {
				local84.fillRect(local67, local69 + Static54.anInt1084 - local34, Static52.anInt1059, local34);
				return;
			}
		} catch (@Pc(144) Exception local144) {
			return;
		}
	}
}
