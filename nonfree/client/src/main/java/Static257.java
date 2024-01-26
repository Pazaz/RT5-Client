import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray6 = new boolean[8];

	@OriginalMember(owner = "client!hv", name = "t", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[32];

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(IZ)Lclient!hv;")
	public static Class8_Sub5 method3654(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static349.anInt5693 == Static295.anInt4781) {
			return new Class8_Sub5(arg0, arg1);
		} else {
			@Pc(6) Class8_Sub5 local6 = Static81.aClass8_Sub5Array1[Static295.anInt4781];
			Static295.anInt4781 = Static295.anInt4781 + 1 & Static190.anIntArray265[Static507.anInt7618];
			local6.method3657(arg0, arg1);
			return local6;
		}
	}
}
