import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!nn", name = "t", descriptor = "Lclient!fi;")
	public static Class63 aClass63_6;

	@OriginalMember(owner = "client!nn", name = "u", descriptor = "I")
	public static int anInt4813;

	@OriginalMember(owner = "client!nn", name = "v", descriptor = "I")
	public static int anInt4814;

	@OriginalMember(owner = "client!nn", name = "r", descriptor = "Lclient!mi;")
	public static final Class130 aClass130_31 = new Class130();

	@OriginalMember(owner = "client!nn", name = "s", descriptor = "Lclient!sf;")
	public static Class183 aClass183_24 = new Class183(64);

	@OriginalMember(owner = "client!nn", name = "w", descriptor = "Z")
	public static boolean aBoolean333 = false;

	@OriginalMember(owner = "client!nn", name = "x", descriptor = "[I")
	public static final int[] anIntArray361 = new int[50];

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method4120(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		Static150.aClass1_Sub16_Sub2_2.method5793(47);
		Static150.aClass1_Sub16_Sub2_2.method5771(Static279.method4951(arg1) + 1);
		Static150.aClass1_Sub16_Sub2_2.method5726(arg1);
		Static150.aClass1_Sub16_Sub2_2.method5760(arg0);
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)Lclient!oo;")
	public static Class1_Sub1_Sub17 method4121(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub1_Sub17 local15 = (Class1_Sub1_Sub17) Static321.aClass143_12.method4323((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static257.aClass162_198.method4636(0, arg0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local15 = Static19.method473(local25);
			Static321.aClass143_12.method4322(local15, (long) arg0);
			return local15;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!nr;I)V")
	public static void method4123(@OriginalArg(0) Class40 arg0) {
		if (Static30.anInt3905 != Static39.anInt1215 && (Static241.aClass154ArrayArrayArray2 != null && Static279.method4953(arg0, Static39.anInt1215))) {
			Static30.anInt3905 = Static39.anInt1215;
		}
	}
}
