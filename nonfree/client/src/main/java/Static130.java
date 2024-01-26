import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "Lclient!ek;")
	public static final Class103 aClass103_2 = new Class103();

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method2280(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			@Pc(15) char local15 = arg0.charAt(local10);
			if (local15 == '<' || local15 == '>') {
				local8 += 3;
			}
		}
		@Pc(42) StringBuffer local42 = new StringBuffer(local6 + local8);
		for (@Pc(44) int local44 = 0; local44 < local6; local44++) {
			@Pc(49) char local49 = arg0.charAt(local44);
			if (local49 == '<') {
				local42.append("<lt>");
			} else if (local49 == '>') {
				local42.append("<gt>");
			} else {
				local42.append(local49);
			}
		}
		return local42.toString();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method2281() {
		if (Static400.aBoolean622 || Static470.aClass2_Sub2_Sub16_10 == null) {
			return "";
		} else if ((Static470.aClass2_Sub2_Sub16_10.aString86 == null || Static470.aClass2_Sub2_Sub16_10.aString86.length() == 0) && Static470.aClass2_Sub2_Sub16_10.aString88 != null && Static470.aClass2_Sub2_Sub16_10.aString88.length() > 0) {
			return Static470.aClass2_Sub2_Sub16_10.aString88;
		} else {
			return Static470.aClass2_Sub2_Sub16_10.aString86;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)I")
	public static int method2283() {
		return Static448.anInt6796 == 1 ? Static2.anInt45 : 0;
	}
}
