import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
	public static int anInt4118;

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
	public static int anInt4123;

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "[Lclient!kj;")
	public static final Class1_Sub1_Sub14[] aClass1_Sub1_Sub14Array4 = new Class1_Sub1_Sub14[14];

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[100];

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "[I")
	public static final int[] anIntArray288 = new int[100];

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)V")
	public static void method3530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class157 local16 = Static185.aClass157ArrayArray1[arg0][arg1];
		if (local16 != null) {
			Static137.anInt3414 = local16.anInt5304;
			Static256.anInt5542 = local16.anInt5310;
			Static222.anInt5047 = local16.anInt5306;
		}
		Static199.method3939();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
	public static void method3532(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1_Sub10 local8 = Static122.method2624(11, arg0);
		local8.method2536();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZII)V")
	public static void method3533(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 * Static340.anInt7187 >> 8;
		if (arg0 == -1 && !Static46.aBoolean484) {
			Static59.method5605();
		} else if (arg0 != -1 && (Static67.anInt204 != arg0 || !Static235.method4606()) && local14 != 0 && !Static46.aBoolean484) {
			Static176.method3563(local14, Static250.aClass162_193, arg0);
		}
		Static67.anInt204 = arg0;
	}
}
