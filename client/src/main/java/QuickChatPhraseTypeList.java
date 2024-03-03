import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class QuickChatPhraseTypeList {

	@OriginalMember(owner = "client!hq", name = "C", descriptor = "Lclient!r;")
	public static Js5 aClass197_33;
	@OriginalMember(owner = "client!sr", name = "a", descriptor = "Lclient!o;")
	public static Interface9 anInterface9_1 = null;
	@OriginalMember(owner = "client!rr", name = "x", descriptor = "Lclient!r;")
	public static Js5 aClass197_80;
	@OriginalMember(owner = "client!be", name = "k", descriptor = "I")
	public static int anInt554 = 0;
	@OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
	public static int anInt6769 = 0;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!o;Lclient!r;Lclient!r;B)V")
	public static void init(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) Js5 arg2) {
		aClass197_33 = arg1;
		anInterface9_1 = arg0;
		aClass197_80 = arg2;
		if (aClass197_33 != null) {
			anInt554 = aClass197_33.getGroupCapacity(1);
		}
		if (aClass197_80 != null) {
			anInt6769 = aClass197_80.getGroupCapacity(1);
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
			local28 = aClass197_33.fetchFile(arg0, 1);
		} else {
			local28 = aClass197_80.fetchFile(arg0 & 0x7FFF, 1);
		}
		local10 = new QuickChatPhraseType();
		if (local28 != null) {
			local10.method5599(new Packet(local28));
		}
		if (arg0 >= 32768) {
			local10.method5604();
		}
		Static388.aClass116_8.method3155(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I[IIJ)Ljava/lang/String;")
	public static String method5770(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		if (anInterface9_1 != null) {
			@Pc(17) String local17 = anInterface9_1.method2360(arg2, arg0, arg1);
			if (local17 != null) {
				return local17;
			}
		}
		return Long.toString(arg2);
	}
}
