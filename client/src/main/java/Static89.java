import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!et", name = "l", descriptor = "[Z")
	public static boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!et", name = "m", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!et", name = "d", descriptor = "Lclient!bt;")
	public static final Buffer aClass2_Sub4_2 = new Buffer(new byte[5000]);

	@OriginalMember(owner = "client!et", name = "k", descriptor = "I")
	public static int anInt1885 = 0;

	@OriginalMember(owner = "client!et", name = "n", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_67 = new Class145(80, 7);

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IC)Z")
	public static boolean method1939(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;")
	public static String method1940(@OriginalArg(0) int arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(19) String local19 = arg1[arg0];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(30) int local30 = arg2 + arg0;
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = arg0; local34 < local30; local34++) {
				@Pc(40) String local40 = arg1[local34];
				if (local40 == null) {
					local32 += 4;
				} else {
					local32 += local40.length();
				}
			}
			@Pc(59) StringBuffer local59 = new StringBuffer(local32);
			for (@Pc(66) int local66 = arg0; local66 < local30; local66++) {
				@Pc(72) String local72 = arg1[local66];
				if (local72 == null) {
					local59.append("null");
				} else {
					local59.append(local72);
				}
			}
			return local59.toString();
		}
	}
}
