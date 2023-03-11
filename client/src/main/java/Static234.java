import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!ni", name = "P", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[100];

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!ml;ILjava/lang/String;I)Lclient!cc;")
	public static PrivilegedRequest method4095(@OriginalArg(0) Signlink arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			return arg0.openUrl(arg2);
		}
		@Pc(79) PrivilegedRequest local79;
		if (arg1 == 2) {
			try {
				arg0.applet.getAppletContext().showDocument(new URL(arg0.applet.getCodeBase(), arg2), "_blank");
				local79 = new PrivilegedRequest();
				local79.status = 1;
				return local79;
			} catch (@Pc(85) Exception local85) {
				local79 = new PrivilegedRequest();
				local79.status = 2;
				return local79;
			}
		} else if (arg1 == 3) {
			try {
				BrowserControl.call(arg0.applet, "loggedout");
			} catch (@Pc(105) Throwable local105) {
			}
			try {
				arg0.applet.getAppletContext().showDocument(new URL(arg0.applet.getCodeBase(), arg2), "_top");
				local79 = new PrivilegedRequest();
				local79.status = 1;
				return local79;
			} catch (@Pc(127) Exception local127) {
				local79 = new PrivilegedRequest();
				local79.status = 2;
				return local79;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(CI)B")
	public static byte method4099(@OriginalArg(0) char arg0) {
		@Pc(28) byte local28;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local28 = (byte) arg0;
		} else if (arg0 == '€') {
			local28 = -128;
		} else if (arg0 == '‚') {
			local28 = -126;
		} else if (arg0 == 'ƒ') {
			local28 = -125;
		} else if (arg0 == '„') {
			local28 = -124;
		} else if (arg0 == '…') {
			local28 = -123;
		} else if (arg0 == '†') {
			local28 = -122;
		} else if (arg0 == '‡') {
			local28 = -121;
		} else if (arg0 == 'ˆ') {
			local28 = -120;
		} else if (arg0 == '‰') {
			local28 = -119;
		} else if (arg0 == 'Š') {
			local28 = -118;
		} else if (arg0 == '‹') {
			local28 = -117;
		} else if (arg0 == 'Œ') {
			local28 = -116;
		} else if (arg0 == 'Ž') {
			local28 = -114;
		} else if (arg0 == '‘') {
			local28 = -111;
		} else if (arg0 == '’') {
			local28 = -110;
		} else if (arg0 == '“') {
			local28 = -109;
		} else if (arg0 == '”') {
			local28 = -108;
		} else if (arg0 == '•') {
			local28 = -107;
		} else if (arg0 == '–') {
			local28 = -106;
		} else if (arg0 == '—') {
			local28 = -105;
		} else if (arg0 == '˜') {
			local28 = -104;
		} else if (arg0 == '™') {
			local28 = -103;
		} else if (arg0 == 'š') {
			local28 = -102;
		} else if (arg0 == '›') {
			local28 = -101;
		} else if (arg0 == 'œ') {
			local28 = -100;
		} else if (arg0 == 'ž') {
			local28 = -98;
		} else if (arg0 == 'Ÿ') {
			local28 = -97;
		} else {
			local28 = 63;
		}
		return local28;
	}
}
