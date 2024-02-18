import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[8];

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Lclient!vq;ZZ)V")
	public static void method3693(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class390 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		if (!arg4) {
			Static637.method8382(arg0, 3, arg2);
			return;
		}
		@Pc(31) String local31;
		if (Static689.aString119.startsWith("win") && arg2.aBoolean781) {
			local31 = null;
			if (Static166.anApplet1 != null) {
				local31 = Static166.anApplet1.getParameter("haveie6");
			}
			if (local31 == null || !local31.equals("1")) {
				@Pc(53) Class270 local53 = Static637.method8382(arg0, 0, arg2);
				Static272.aClass390_3 = arg2;
				Static340.aString53 = arg0;
				Static236.aClass270_2 = local53;
				return;
			}
		}
		if (Static689.aString119.startsWith("mac")) {
			local31 = null;
			if (Static166.anApplet1 != null) {
				local31 = Static166.anApplet1.getParameter("havefirefox");
			}
			if (local31 != null && local31.equals("1") && arg3) {
				Static36.method980(arg2, arg0, arg1, 1);
				return;
			}
		}
		Static637.method8382(arg0, 2, arg2);
	}
}
