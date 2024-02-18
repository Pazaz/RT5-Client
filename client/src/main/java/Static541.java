import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "Lclient!dla;")
	public static final Class82 aClass82_174 = new Class82(8);

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "Lclient!ts;")
	public static final Class361 aClass361_4 = new Class361(16);

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "Lclient!kda;")
	public static final Class204 aClass204_12 = new Class204(5, 1);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method7198(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static384.aStringArray31.length; local7++) {
			if (Static384.aStringArray31[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}
}
