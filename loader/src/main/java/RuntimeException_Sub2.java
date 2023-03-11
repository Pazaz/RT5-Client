import java.applet.Applet;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!e")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "I")
	public static int anInt7269;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/lang/String;")
	private String aString71;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;ILjava/lang/Throwable;)V")
	public static void method6501(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(6) String local6 = "";
			if (arg2 != null) {
				local6 = method6505(arg2);
			}
			if (arg1 != null) {
				if (arg2 != null) {
					local6 = local6 + " | ";
				}
				local6 = local6 + arg1;
			}
			method6504(local6);
			local6 = method6503(":", local6, "%3a");
			local6 = method6503("@", local6, "%40");
			local6 = method6503("&", local6, "%26");
			local6 = method6503("#", local6, "%23");
			@Pc(92) URL local92 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt7269 + "&v1=" + Class259.aString76 + "&v2=" + Class259.aString82 + "&e=" + local6);
			@Pc(98) DataInputStream local98 = new DataInputStream(local92.openStream());
			local98.read();
			local98.close();
		} catch (@Pc(105) Exception local105) {
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method6503(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg1.indexOf(arg0); local5 != -1; local5 = arg1.indexOf(arg0, local5 + arg2.length())) {
			arg1 = arg1.substring(0, local5) + arg2 + arg1.substring(arg0.length() + local5);
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method6504(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method6503("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method6505(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			arg0 = local7.aThrowable2;
			local20 = local7.aString71 + " | ";
		} else {
			local20 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(57) String local57 = local33.toString();
		@Pc(65) BufferedReader local65 = new BufferedReader(new StringReader(local57));
		@Pc(68) String local68 = local65.readLine();
		while (true) {
			@Pc(71) String local71 = local65.readLine();
			if (local71 == null) {
				return local20 + "| " + local68;
			}
			@Pc(78) int local78 = local71.indexOf(40);
			@Pc(85) int local85 = local71.indexOf(41, local78 + 1);
			@Pc(94) String local94;
			if (local78 == -1) {
				local94 = local71;
			} else {
				local94 = local71.substring(0, local78);
			}
			local94 = local94.trim();
			local94 = local94.substring(local94.lastIndexOf(32) + 1);
			local94 = local94.substring(local94.lastIndexOf(9) + 1);
			local20 = local20 + local94;
			if (local78 != -1 && local85 != -1) {
				@Pc(140) int local140 = local71.indexOf(".java:", local78);
				if (local140 >= 0) {
					local20 = local20 + local71.substring(local140 + 5, local85);
				}
			}
			local20 = local20 + ' ';
		}
	}
}
