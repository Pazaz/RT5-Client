import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!wr", name = "I", descriptor = "I")
	public static int anInt4214;

	@OriginalMember(owner = "client!wr", name = "J", descriptor = "I")
	public static int anInt4215;

	@OriginalMember(owner = "client!wr", name = "A", descriptor = "Ljava/lang/String;")
	public static final String aString154 = "yellow:";

	@OriginalMember(owner = "client!wr", name = "D", descriptor = "Ljava/lang/String;")
	public static final String aString155 = "wave:";

	@OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
	public static int anInt4211 = 0;

	@OriginalMember(owner = "client!wr", name = "K", descriptor = "I")
	public static int anInt4216 = 0;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZZ)Z")
	public static boolean method3602(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!o;Lclient!o;I)V")
	public static void method3606(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_248 != null) {
			arg1.method6172();
		}
		arg1.aClass1_247 = arg0;
		arg1.aClass1_248 = arg0.aClass1_248;
		arg1.aClass1_248.aClass1_247 = arg1;
		arg1.aClass1_247.aClass1_248 = arg1;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BLjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method3607(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static235.method4605(arg1, arg0);
		@Pc(23) String[] local23 = new String[local10 + 1];
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local10; local29++) {
			@Pc(33) int local33;
			for (local33 = local27; arg1 != arg0.charAt(local33); local33++) {
			}
			local23[local25++] = arg0.substring(local27, local33);
			local27 = local33 + 1;
		}
		local23[local10] = arg0.substring(local27);
		return local23;
	}
}
