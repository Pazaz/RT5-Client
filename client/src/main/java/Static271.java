import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "Lclient!h;")
	public static final InboundPacket aClass89_182 = new InboundPacket(50, -1);

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "J")
	public static long aLong146 = -1L;

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "S")
	public static short aShort79 = 256;

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(IB)I")
	public static int method4567(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (arg0 * local19 >> 12) + 40960;
		return local32 * local13 >> 12;
	}
}
