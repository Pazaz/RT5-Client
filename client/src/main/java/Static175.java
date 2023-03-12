import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	public static int anInt3348;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	public static int anInt3351;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Lclient!je;")
	public static Class113 aClass113_6;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Z")
	public static boolean aBoolean225 = false;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[B")
	public static final byte[] aByteArray35 = new byte[520];

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Lclient!mc;")
	public static final ClientProt aClass145_132 = new ClientProt(9, 15);

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)V")
	public static void method3324(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 * client.preferences.anInt4889 >> 8;
		if (local15 != 0 && arg0 != -1) {
			Static94.method2042(local15, arg0, client.jsArchive11);
			Static393.aBoolean486 = true;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([[[Lclient!f;B)V")
	public static void method3325(@OriginalArg(0) Class67[][][] arg0) {
		for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
			@Pc(15) Class67[][] local15 = arg0[local9];
			for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
				for (@Pc(21) int local21 = 0; local21 < local15[local17].length; local21++) {
					@Pc(29) Class67 local29 = local15[local17][local21];
					if (local29 != null) {
						if (local29.aClass11_Sub2_2 instanceof Interface6) {
							((Interface6) local29.aClass11_Sub2_2).method6082();
						}
						if (local29.aClass11_Sub3_2 instanceof Interface6) {
							((Interface6) local29.aClass11_Sub3_2).method6082();
						}
						if (local29.aClass11_Sub3_3 instanceof Interface6) {
							((Interface6) local29.aClass11_Sub3_3).method6082();
						}
						if (local29.aClass11_Sub1_3 instanceof Interface6) {
							((Interface6) local29.aClass11_Sub1_3).method6082();
						}
						if (local29.aClass11_Sub1_2 instanceof Interface6) {
							((Interface6) local29.aClass11_Sub1_2).method6082();
						}
						for (@Pc(81) Class22 local81 = local29.aClass22_2; local81 != null; local81 = local81.aClass22_1) {
							@Pc(86) Class11_Sub5 local86 = local81.aClass11_Sub5_1;
							if (local86 instanceof Interface6) {
								((Interface6) local86).method6082();
							}
						}
					}
				}
			}
		}
	}
}
