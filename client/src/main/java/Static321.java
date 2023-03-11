import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!sn", name = "E", descriptor = "Lclient!h;")
	public static final Class89 aClass89_216 = new Class89(100, -2);

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
	public static void method5478() {
		Static14.aBoolean24 = false;
		Static353.anIntArray450 = null;
		Static313.anIntArray388 = null;
		Static121.anIntArray156 = null;
		Static23.aClipboard1 = null;
		Static121.anIntArray157 = null;
		Static98.method2107();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(FIIIZIII)[I")
	public static int[] method5479(@OriginalArg(0) float arg0) {
		@Pc(11) int[] local11 = new int[2048];
		@Pc(15) Class2_Sub3_Sub6 local15 = new Class2_Sub3_Sub6();
		local15.anInt1051 = 8;
		local15.anInt1049 = (int) (arg0 * 4096.0F);
		local15.anInt1043 = 4;
		local15.anInt1045 = 35;
		local15.aBoolean85 = true;
		local15.anInt1050 = 8;
		local15.method6480();
		Static155.method2789(2048, 1);
		local15.method1308(local11, 0);
		return local11;
	}
}
