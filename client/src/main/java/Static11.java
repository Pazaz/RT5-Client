import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "Lclient!h;")
	public static final Class89 aClass89_13 = new Class89(95, 8);

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "[I")
	public static final int[] anIntArray12 = new int[13];

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)I")
	public static int method244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 >> 31 & arg0 - 1;
		return local16 + (arg1 + (arg1 >>> 31)) % arg0;
	}
}
