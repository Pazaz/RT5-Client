import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!pla", name = "E", descriptor = "Z")
	public static boolean aBoolean564;

	@OriginalMember(owner = "client!pla", name = "i", descriptor = "Lclient!av;")
	public static Class28 aClass28_35 = new Class28(64);

	@OriginalMember(owner = "client!pla", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method6623(@OriginalArg(1) Class19 arg0) {
		for (@Pc(6) Class8_Sub5 local6 = (Class8_Sub5) Static342.aClass130_7.method2790(); local6 != null; local6 = (Class8_Sub5) Static342.aClass130_7.method2785()) {
			if (local6.aBoolean325) {
				local6.method3646(arg0);
			}
		}
		if (false) {
			aClass28_35 = null;
		}
	}

	@OriginalMember(owner = "client!pla", name = "a", descriptor = "(ILclient!wj;)I")
	public static int method6629(@OriginalArg(1) Class8_Sub2_Sub1_Sub2_Sub2 arg0) {
		@Pc(6) Class268 local6 = arg0.aClass268_1;
		if (local6.anIntArray532 != null) {
			local6 = local6.method5985(65535, Static34.aClass304_1);
			if (local6 == null) {
				return -1;
			}
		}
		@Pc(22) int local22 = local6.anInt6711;
		@Pc(32) Class289 local32 = arg0.method9317();
		@Pc(37) int local37 = arg0.aClass152_10.method9114();
		if (local37 == -1 || arg0.aBoolean817) {
			local22 = local6.anInt6714;
		} else if (local32.anInt7226 == local37 || local32.anInt7241 == local37 || local32.anInt7260 == local37 || local37 == local32.anInt7240) {
			local22 = local6.anInt6712;
		} else if (local32.anInt7235 == local37 || local37 == local32.anInt7262 || local32.anInt7268 == local37 || local32.anInt7239 == local37) {
			local22 = local6.anInt6724;
		}
		return local22;
	}
}
