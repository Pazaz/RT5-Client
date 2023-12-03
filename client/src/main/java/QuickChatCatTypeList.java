import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class QuickChatCatTypeList {

	@OriginalMember(owner = "client!on", name = "e", descriptor = "Lclient!jm;")
	public static final Class116 aClass116_5 = new Class116(64);
	@OriginalMember(owner = "client!ck", name = "U", descriptor = "Lclient!r;")
	public static Js5 aClass197_7;
	@OriginalMember(owner = "client!vj", name = "ab", descriptor = "Lclient!r;")
	public static Js5 aClass197_92;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!r;Lclient!r;Z)V")
	public static void init(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
		aClass197_7 = arg1;
		aClass197_92 = arg0;
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)Lclient!mn;")
	public static QuickChatCatType get(@OriginalArg(1) int arg0) {
		@Pc(10) QuickChatCatType local10 = (QuickChatCatType) aClass116_5.method3152((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25;
		if (arg0 >= 32768) {
			local25 = aClass197_7.fetchFile(arg0 & 0x7FFF, 0);
		} else {
			local25 = aClass197_92.fetchFile(arg0, 0);
		}
		local10 = new QuickChatCatType();
		if (local25 != null) {
			local10.method3797(new Buffer(local25));
		}
		if (arg0 >= 32768) {
			local10.method3793();
		}
		aClass116_5.method3155(local10, (long) arg0);
		return local10;
	}

}
