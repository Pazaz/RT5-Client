import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public class InterfaceList {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!r;BLclient!r;Lclient!r;Lclient!r;)V")
	public static void init(@OriginalArg(0) Js5 arg0, @OriginalArg(2) Js5 arg1, @OriginalArg(3) Js5 arg2, @OriginalArg(4) Js5 arg3) {
		Static79.aClass197_19 = arg3;
		Static283.aClass197_68 = arg2;
		Static142.aClass197_37 = arg1;
		Static391.aClass197_95 = arg0;
		Static26.aClass161ArrayArray1 = new Class161[Static283.aClass197_68.capacity()][];
		Static128.aBooleanArray21 = new boolean[Static283.aClass197_68.capacity()];
	}

}
