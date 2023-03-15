import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class QuickChatCatTypeList {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!r;Lclient!r;Z)V")
	public static void init(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
		Static43.aClass197_7 = arg1;
		Static367.aClass197_92 = arg0;
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)Lclient!mn;")
	public static QuickChatCatType get(@OriginalArg(1) int arg0) {
		@Pc(10) QuickChatCatType local10 = (QuickChatCatType) Static257.aClass116_5.method3152((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25;
		if (arg0 >= 32768) {
			local25 = Static43.aClass197_7.fetchFile(arg0 & 0x7FFF, 0);
		} else {
			local25 = Static367.aClass197_92.fetchFile(arg0, 0);
		}
		local10 = new QuickChatCatType();
		if (local25 != null) {
			local10.method3797(new Buffer(local25));
		}
		if (arg0 >= 32768) {
			local10.method3793();
		}
		Static257.aClass116_5.method3155(local10, (long) arg0);
		return local10;
	}

}
