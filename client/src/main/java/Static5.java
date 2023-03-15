import java.awt.Frame;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
	public static int anInt105;

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "J")
	public static long aLong11 = 0L;

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_2 = new LocalizedString("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIILclient!ml;II)Ljava/awt/Frame;")
	public static Frame method85(@OriginalArg(0) int arg0, @OriginalArg(3) Signlink arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg1.method3765()) {
			return null;
		}
		@Pc(24) DisplayMode[] local24 = Static110.method2265(arg1);
		if (local24 == null) {
			return null;
		}
		@Pc(30) boolean local30 = false;
		for (@Pc(32) int local32 = 0; local32 < local24.length; local32++) {
			if (local24[local32].width == arg2 && local24[local32].height == arg0 && (!local30 || arg3 < local24[local32].anInt4687)) {
				arg3 = local24[local32].anInt4687;
				local30 = true;
			}
		}
		if (!local30) {
			return null;
		}
		@Pc(98) PrivilegedRequest local98 = arg1.enterFullScreen(arg2, arg0, arg3);
		while (local98.status == 0) {
			ThreadUtils.sleep(10L);
		}
		@Pc(110) Frame local110 = (Frame) local98.result;
		if (local110 == null) {
			return null;
		} else if (local98.status == 2) {
			Static17.method4215(local110, arg1);
			return null;
		} else {
			return local110;
		}
	}

}
