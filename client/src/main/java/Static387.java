import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
	public static int anInt2831 = 0;

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_110 = new Class145(13, 16);

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "Lclient!h;")
	public static final InboundPacket aClass89_120 = new InboundPacket(20, 6);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IILclient!ml;Lclient!ci;Ljava/awt/Canvas;I)Lclient!wm;")
	public static synchronized Class19 method2822(@OriginalArg(1) int arg0, @OriginalArg(2) Signlink arg1, @OriginalArg(3) Interface2 arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
			if (!Static168.aBooleanArray67[local17]) {
				local7 = local17;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(56) Class19 local56;
		if (arg4 == 0) {
			local56 = Static388.method6437(arg2, local7, arg3);
		} else if (arg4 == 1) {
			local56 = Static160.method2955(arg3, arg1, arg2, arg0, local7);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static168.aBooleanArray67[local7] = true;
		return local56;
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(IIII)V")
	public static void method2835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class21 local9 = Static332.aClass21ArrayArray3[arg1][arg2];
		Static7.method6470(local9 == null ? Static119.aClass21_1 : local9, arg0);
	}
}
