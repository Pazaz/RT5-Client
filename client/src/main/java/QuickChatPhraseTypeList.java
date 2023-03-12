import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public class QuickChatPhraseTypeList {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!o;Lclient!r;Lclient!r;B)V")
	public static void init(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) Js5 arg2) {
		Static137.aClass197_33 = arg1;
		Static325.anInterface9_1 = arg0;
		Static308.aClass197_80 = arg2;
		if (Static137.aClass197_33 != null) {
			Static21.anInt554 = Static137.aClass197_33.getGroupCapacity(1);
		}
		if (Static308.aClass197_80 != null) {
			Static361.anInt6769 = Static308.aClass197_80.getGroupCapacity(1);
		}
	}

}
