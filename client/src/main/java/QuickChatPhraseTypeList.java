import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

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

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)Lclient!tb;")
	public static QuickChatPhraseType get(@OriginalArg(1) int arg0) {
		@Pc(10) QuickChatPhraseType local10 = (QuickChatPhraseType) Static388.aClass116_8.method3152((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28;
		if (arg0 < 32768) {
			local28 = Static137.aClass197_33.fetchFile(arg0, 1);
		} else {
			local28 = Static308.aClass197_80.fetchFile(arg0 & 0x7FFF, 1);
		}
		local10 = new QuickChatPhraseType();
		if (local28 != null) {
			local10.method5599(new Buffer(local28));
		}
		if (arg0 >= 32768) {
			local10.method5604();
		}
		Static388.aClass116_8.method3155(local10, (long) arg0);
		return local10;
	}

}
