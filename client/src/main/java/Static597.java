import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
	public static int anInt8821 = -1;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIZ)I")
	public static int method7822(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class2_Sub22 local18 = Static556.method7303(arg0, arg2);
		if (local18 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local18.anIntArray278.length) {
			return local18.anIntArray278[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I[BI)[B")
	public static byte[] method7823(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) byte[] local12 = new byte[arg1];
		Static734.method7694(arg0, 0, local12, 0, arg1);
		return local12;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILclient!hda;ZI)V")
	public static void method7824(@OriginalArg(0) int arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(3) int arg2) {
		if (Static109.aClass158_3 != null || Static400.aBoolean622 || (arg1 == null || Static582.method7658(arg1) == null)) {
			return;
		}
		Static109.aClass158_3 = arg1;
		Static354.aClass158_8 = Static582.method7658(arg1);
		Static150.anInt2631 = arg0;
		Static378.anInt5941 = arg2;
		Static172.aBoolean246 = false;
		Static181.anInt3003 = 0;
	}
}
