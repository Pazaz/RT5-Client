import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!pr", name = "s", descriptor = "Lclient!ur;")
	public static BitmapFont aClass130_4;

	@OriginalMember(owner = "client!pr", name = "o", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_109 = new LocalizedString("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!pr", name = "G", descriptor = "Z")
	public static boolean javaScript = false;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4651(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			local10 = (local10 << 5) - (local10 - arg0.charAt(local20));
		}
		return local10;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZZLclient!cu;Z)V")
	public static void method4655(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub7 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt1370;
		@Pc(12) int local12 = (int) arg1.key;
		arg1.unlink();
		if (arg2) {
			Static162.method2979(local8);
		}
		Static138.method2580(local8);
		@Pc(27) Class161 local27 = InterfaceList.getComponent(local12);
		if (local27 != null) {
			InterfaceList.redraw(local27);
		}
		Static227.method3989();
		if (!arg0 && Static139.anInt2595 != -1) {
			Static392.method6460(Static139.anInt2595, 1);
		}
		@Pc(49) Class137 local49 = new Class137(Static329.aClass4_130);
		for (@Pc(54) Class2_Sub7 local54 = (Class2_Sub7) local49.method3561(); local54 != null; local54 = (Class2_Sub7) local49.method3560()) {
			if (!local54.isLinked()) {
				local54 = (Class2_Sub7) local49.method3561();
				if (local54 == null) {
					return;
				}
			}
			if (local54.anInt1373 == 3) {
				@Pc(76) int local76 = (int) local54.key;
				if (local76 >>> 16 == local8) {
					method4655(arg0, local54, true);
				}
			}
		}
	}
}
