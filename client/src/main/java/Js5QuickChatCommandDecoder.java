import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Js5QuickChatCommandDecoder implements Interface9 {

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IJ[II)Ljava/lang/String;")
	@Override
	public String method2360(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			@Pc(23) EnumType local23 = client.EnumTypes.method2779(arg1[0]);
			return local23.method1775((int) arg0);
		} else if (arg2 == 1 || arg2 == 10) {
			@Pc(45) ObjType local45 = client.ObjTypes.get((int) arg0);
			return local45.aString55;
		} else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
			return client.EnumTypes.method2779(arg1[0]).method1775((int) arg0);
		} else {
			return null;
		}
	}
}
