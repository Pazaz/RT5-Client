import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!kt", name = "V", descriptor = "[I")
	public static int[] anIntArray208;

	@OriginalMember(owner = "client!kt", name = "X", descriptor = "Lclient!wm;")
	public static Class19 aClass19_8;

	@OriginalMember(owner = "client!kt", name = "db", descriptor = "Lclient!bu;")
	public static SceneBuilder aClass29_Sub1_63;

	@OriginalMember(owner = "client!kt", name = "O", descriptor = "Lclient!mc;")
	public static final ClientProt aClass145_138 = new ClientProt(58, 2);

	@OriginalMember(owner = "client!kt", name = "Y", descriptor = "I")
	public static int anInt3541 = 1;

	@OriginalMember(owner = "client!kt", name = "cb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[100];

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIILclient!wm;)V")
	public static void method3500(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class19 arg2) {
		Static65.aClass19_3 = arg2;
		Static332.aClass21ArrayArray3 = new Class21[arg1][arg0];
		if (Static209.anIntArray228 != null) {
			Static62.aClass42_5 = Static297.method5107(Static209.anIntArray228[2], Static209.anIntArray228[4], Static209.anIntArray228[5], Static209.anIntArray228[1], Static209.anIntArray228[0], Static209.anIntArray228[3]);
		}
		Static119.aClass21_1 = new Class21();
		Static20.method560();
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIII)V")
	public static void method3501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class2_Sub2_Sub7 local12 = Static316.method5413(4, arg3);
		local12.method2311();
		local12.anInt2290 = arg0;
		local12.anInt2284 = arg1;
		local12.anInt2289 = arg2;
	}

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "(I)V")
	public static void method3502() {
		Static211.aClass13_13 = null;
		Static339.aClass13_18 = null;
		Static75.aClass13_5 = null;
		Static337.aClass13_17 = null;
		Static35.aClass13_3 = null;
		Static197.aClass13_12 = null;
		Static110.aClass13_6 = null;
		Static138.aClass13_8 = null;
	}
}
