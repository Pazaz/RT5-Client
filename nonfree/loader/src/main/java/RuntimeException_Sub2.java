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

@OriginalClass("loader!f")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "I")
	public static int anInt10944;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/lang/String;")
	private String aString132;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
	private static String method9469(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(12) int local12 = arg0.indexOf(arg1); local12 != -1; local12 = arg0.indexOf(arg1, local12 + arg2.length())) {
			arg0 = arg0.substring(0, local12) + arg2 + arg0.substring(local12 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method9470(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			local17 = local7.aString132 + " | ";
			arg0 = local7.aThrowable2;
		} else {
			local17 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(59) String local59 = local34.toString();
		@Pc(67) BufferedReader local67 = new BufferedReader(new StringReader(local59));
		@Pc(70) String local70 = local67.readLine();
		while (true) {
			@Pc(73) String local73 = local67.readLine();
			if (local73 == null) {
				return local17 + "| " + local70;
			}
			@Pc(82) int local82 = local73.indexOf(40);
			@Pc(89) int local89 = local73.indexOf(41, local82 + 1);
			@Pc(96) String local96;
			if (local82 == -1) {
				local96 = local73;
			} else {
				local96 = local73.substring(0, local82);
			}
			local96 = local96.trim();
			local96 = local96.substring(local96.lastIndexOf(32) + 1);
			local96 = local96.substring(local96.lastIndexOf(9) + 1);
			local17 = local17 + local96;
			if (local82 != -1 && local89 != -1) {
				@Pc(143) int local143 = local73.indexOf(".java:", local82);
				if (local143 >= 0) {
					local17 = local17 + local73.substring(local143 + 5, local89);
				}
			}
			local17 = local17 + ' ';
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private static void method9471(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method9469(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!f;")
	private static RuntimeException_Sub2 method9472(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString132 = local8.aString132 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;Ljava/lang/Throwable;I)V")
	public static void method9473(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method9470(arg2);
			}
			if (arg0 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			method9471(local1);
			local1 = method9469(local1, ":", "%3a");
			local1 = method9469(local1, "@", "%40");
			local1 = method9469(local1, "&", "%26");
			local1 = method9469(local1, "#", "%23");
			@Pc(88) URL local88 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt10944 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(94) DataInputStream local94 = new DataInputStream(local88.openStream());
			local94.read();
			local94.close();
		} catch (@Pc(101) Exception local101) {
		}
	}

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString132 = arg1;
	}
}
