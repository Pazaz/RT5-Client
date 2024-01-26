import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public final class Class254 {

	@OriginalMember(owner = "client!nba", name = "l", descriptor = "Ljava/lang/String;")
	public static final String aString70;

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "Ljava/lang/String;")
	public static final String aString69;

	@OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
	public int anInt6360;

	@OriginalMember(owner = "client!nba", name = "o", descriptor = "I")
	public int anInt6362;

	@OriginalMember(owner = "client!nba", name = "n", descriptor = "I")
	public int anInt6363;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "I")
	public int anInt6364;

	@OriginalMember(owner = "client!nba", name = "p", descriptor = "I")
	public int anInt6365;

	@OriginalMember(owner = "client!nba", name = "j", descriptor = "I")
	public int anInt6366;

	@OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
	public int anInt6367;

	@OriginalMember(owner = "client!nba", name = "m", descriptor = "I")
	public int anInt6368;

	@OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
	public int anInt6369;

	@OriginalMember(owner = "client!nba", name = "k", descriptor = "I")
	public int anInt6371 = -1;

	static {
		@Pc(63) String local63 = "Unknown";
		try {
			local63 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(71) Exception local71) {
		}
		local63.toLowerCase();
		local63 = "Unknown";
		try {
			local63 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(86) Exception local86) {
		}
		local63.toLowerCase();
		local63 = "Unknown";
		try {
			local63 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(101) Exception local101) {
		}
		aString70 = local63.toLowerCase();
		local63 = "Unknown";
		try {
			local63 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(116) Exception local116) {
		}
		aString69 = local63.toLowerCase();
		local63 = "Unknown";
		try {
			local63 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(131) Exception local131) {
		}
		local63.toLowerCase();
		local63 = "~/";
		try {
			local63 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(146) Exception local146) {
		}
		new File(local63);
	}
}
