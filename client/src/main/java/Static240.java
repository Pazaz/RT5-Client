import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!hi", name = "F", descriptor = "I")
	public static int anInt3955;

	@OriginalMember(owner = "client!hi", name = "A", descriptor = "Lclient!it;")
	public static final Class184 aClass184_9 = new Class184(4, 1, 1, 1);

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BII)Z")
	public static boolean method3483(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void method3496(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(12) String local12 = "";
			if (arg0 != null) {
				local12 = Static446.method6093(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local12 = local12 + " | ";
				}
				local12 = local12 + arg1;
			}
			Static234.method3418(local12);
			local12 = Static232.method3395(local12, ":", "%3a");
			local12 = Static232.method3395(local12, "@", "%40");
			local12 = Static232.method3395(local12, "&", "%26");
			local12 = Static232.method3395(local12, "#", "%23");
			if (Static631.anApplet4 != null) {
				@Pc(131) Class270 local131 = Static284.aClass390_4.method8992(new URL(Static631.anApplet4.getCodeBase(), "clienterror.ws?c=" + Static373.anInt5905 + "&u=" + (Static515.aString96 == null ? String.valueOf(Static292.aLong163) : Static515.aString96) + "&v1=" + Static689.aString123 + "&v2=" + Static689.aString124 + "&e=" + local12));
				while (local131.anInt6789 == 0) {
					Static638.method8395(1L);
				}
				if (local131.anInt6789 == 1) {
					@Pc(148) DataInputStream local148 = (DataInputStream) local131.anObject13;
					local148.read();
					local148.close();
				}
			}
		} catch (@Pc(155) Exception local155) {
		}
	}
}
