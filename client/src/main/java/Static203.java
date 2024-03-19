import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "[Lclient!dk;")
	public static Class47[] aClass47Array2;

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
	public static int anInt926;

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "Lclient!qj;")
	public static Class162 aClass162_46;

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "Lclient!qj;")
	public static Class162 aClass162_47;

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "[S")
	public static final short[] aShortArray11 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
	public static void method693(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static241.aClass154ArrayArrayArray2 = Static134.aClass154ArrayArrayArray1;
			Static118.aClass77Array1 = Static137.aClass77Array2;
		} else {
			Static241.aClass154ArrayArrayArray2 = Static330.aClass154ArrayArrayArray3;
			Static118.aClass77Array1 = Static336.aClass77Array3;
		}
		Static214.anInt4867 = Static241.aClass154ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIILclient!ud;II)Ljava/awt/Frame;")
	public static Frame method694(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class199 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method5472()) {
			return null;
		}
		@Pc(22) Class47[] local22 = Static266.method4819(arg2);
		if (local22 == null) {
			return null;
		}
		@Pc(28) boolean local28 = false;
		for (@Pc(30) int local30 = 0; local30 < local22.length; local30++) {
			if (local22[local30].anInt1566 == arg0 && arg1 == local22[local30].anInt1569 && (!local28 || local22[local30].anInt1570 > arg3)) {
				arg3 = local22[local30].anInt1570;
				local28 = true;
			}
		}
		if (!local28) {
			return null;
		}
		@Pc(96) Class145 local96 = arg2.method5479(arg0, arg3, arg1);
		while (local96.anInt5065 == 0) {
			Static295.method5212(10L);
		}
		@Pc(113) Frame local113 = (Frame) local96.anObject6;
		if (local113 == null) {
			return null;
		} else if (local96.anInt5065 == 2) {
			Static36.method876(arg2, local113);
			return null;
		} else {
			return local113;
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
	public static void method695() {
		Static150.aClass1_Sub16_Sub2_2.method5793(5);
		Static150.aClass1_Sub16_Sub2_2.method5757(Static121.anInt3034);
	}
}
