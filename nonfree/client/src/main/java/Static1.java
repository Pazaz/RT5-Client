import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
	public static int anInt10797;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "Lclient!st;")
	public static Class23 aClass23_42;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
	public static int anInt10798 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Z")
	public static boolean aBoolean821 = false;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBI)Z")
	public static boolean method9338(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
