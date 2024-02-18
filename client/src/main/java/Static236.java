import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!hfa", name = "s", descriptor = "I")
	public static int anInt3893;

	@OriginalMember(owner = "client!hfa", name = "w", descriptor = "Lclient!oba;")
	public static Class270 aClass270_2;

	@OriginalMember(owner = "client!hfa", name = "v", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_50 = new Class345(69, 7);

	@OriginalMember(owner = "client!hfa", name = "r", descriptor = "Z")
	public static boolean aBoolean304 = false;

	@OriginalMember(owner = "client!hfa", name = "u", descriptor = "Z")
	public static boolean aBoolean305 = false;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IZ)V")
	public static void method3450(@OriginalArg(0) int arg0) {
		@Pc(16) Class2_Sub2_Sub2 local16 = Static440.method5963(14, (long) arg0);
		local16.method205();
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lclient!gw;I)Z")
	public static boolean method3451(@OriginalArg(0) Class153 arg0) {
		try {
			return Static293.method4334(arg0);
		} catch (@Pc(15) IOException local15) {
			if (Static283.anInt4574 == 9) {
				arg0.aClass348_1 = null;
				return false;
			} else {
				Static370.method5279();
				return true;
			}
		} catch (@Pc(29) Exception local29) {
			@Pc(106) String local106 = "T2 - " + (arg0.aClass225_93 == null ? -1 : arg0.aClass225_93.method5239()) + "," + (arg0.aClass225_94 == null ? -1 : arg0.aClass225_94.method5239()) + "," + (arg0.aClass225_91 == null ? -1 : arg0.aClass225_91.method5239()) + " - " + arg0.anInt3648 + "," + (Static691.anInt10367 + Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray879[0]) + "," + (Static116.anInt2270 + Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray878[0]) + " - ";
			for (@Pc(108) int local108 = 0; arg0.anInt3648 > local108 && local108 < 50; local108++) {
				local106 = local106 + arg0.aClass2_Sub21_Sub2_2.aByteArray93[local108] + ",";
			}
			Static240.method3496(local29, local106);
			Static233.method3409(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "(I)V")
	public static void method3453() {
		for (@Pc(16) Class2_Sub5 local16 = (Class2_Sub5) Static106.aClass28_11.method736(); local16 != null; local16 = (Class2_Sub5) Static106.aClass28_11.method740()) {
			if (local16.aClass222_Sub1_1.method9177()) {
				Static121.method2199(local16.anInt182);
			} else {
				local16.aClass222_Sub1_1.method9193(109);
				try {
					local16.aClass222_Sub1_1.method9179();
				} catch (@Pc(43) Exception local43) {
					Static240.method3496(local43, "TV: " + local16.anInt182);
					Static121.method2199(local16.anInt182);
				}
				if (!local16.aBoolean14 && !local16.aBoolean16) {
					@Pc(73) Class2_Sub28_Sub1 local73 = local16.aClass222_Sub1_1.method9189();
					if (local73 != null) {
						@Pc(79) Class2_Sub6_Sub5 local79 = local73.method3960();
						if (local79 != null) {
							local79.method9147(local16.anInt180);
							Static336.aClass2_Sub6_Sub3_1.method5882(local79);
							local16.aBoolean14 = true;
						}
					}
				}
			}
		}
	}
}
