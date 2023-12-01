import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!td", name = "Y", descriptor = "Ljava/lang/String;")
	public static String aString62;

	@OriginalMember(owner = "client!td", name = "X", descriptor = "Z")
	public static boolean aBoolean419 = false;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIZ)B")
	public static byte method5653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(IB)Z")
	public static boolean method5654(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(IB)Lclient!uo;")
	public static Class235 method5655(@OriginalArg(0) int arg0) {
		@Pc(10) Class235 local10 = (Class235) Static233.aClass98_37.get((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static289.aClass197_73.fetchFile(arg0, 0);
		local10 = new Class235();
		if (local28 != null) {
			local10.decode(new Buffer(local28));
		}
		local10.method5931();
		Static233.aClass98_37.put((long) arg0, local10);
		return local10;
	}

}
