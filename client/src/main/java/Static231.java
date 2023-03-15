import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
	public static int anInt4071;

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "[I")
	public static final int[] anIntArray265 = new int[1000];

	@OriginalMember(owner = "client!nf", name = "w", descriptor = "[Lclient!bt;")
	public static final Buffer[] aClass2_Sub4Array1 = new Buffer[2048];

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)I")
	public static int method4024(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(25) int local25 = (local7 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local7 & 0xFF0000) >>> 8;
		@Pc(30) int local30 = 255 - local7;
		return (((arg0 & 0xFF00FF) * local30 & 0xFF00FF00 | local30 * (arg0 & 0xFF00) & 0xFF0000) >>> 8) + local25;
	}
}
