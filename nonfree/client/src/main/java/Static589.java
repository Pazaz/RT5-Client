import java.awt.Font;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static589 {

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)Z")
	public static boolean method7721() {
		try {
			@Pc(7) Class300 local7 = new Class300();
			@Pc(12) byte[] local12 = local7.method6762(Static27.aByteArray1);
			Static168.method2634(local12);
			return true;
		} catch (@Pc(28) Exception local28) {
			return false;
		}
	}
}
