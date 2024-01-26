import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!gla", name = "y", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_85 = new Class225(144, 5);

	@OriginalMember(owner = "client!gla", name = "D", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_39 = new Class345(27, 7);

	@OriginalMember(owner = "client!gla", name = "I", descriptor = "I")
	public static int anInt3500 = -1;

	@OriginalMember(owner = "client!gla", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method3157(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
			local17 = arg0.charAt(local19) + (local17 << 5) - local17;
		}
		return local17;
	}
}
