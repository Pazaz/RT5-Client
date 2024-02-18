import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static186 {

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "[Lclient!st;")
	public static Class23[] aClass23Array5;

	@OriginalMember(owner = "client!fo", name = "m", descriptor = "Ljava/lang/Object;")
	public static Object anObject7;

	@OriginalMember(owner = "client!fo", name = "k", descriptor = "Lclient!dla;")
	public static final Class82 aClass82_67 = new Class82(4);

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
	public static int anInt3059 = 0;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIBIIZ)V")
	public static void method2818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if ((arg5 ? Static400.aClass2_Sub34_28.lb.method7208() : Static400.aClass2_Sub34_28.aClass57_Sub25_3.method7208()) != 0 && arg1 != 0 && Static33.anInt779 < 50 && arg0 != -1) {
			Static409.aClass104Array1[Static33.anInt779++] = new Class104((byte) (arg5 ? 3 : 2), arg0, arg1, arg3, arg4, 0, arg2, (Class8_Sub2) null);
		}
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(I)Lclient!ip;")
	public static Class2_Sub2_Sub13 method2819() {
		return Static30.aClass2_Sub2_Sub13_3;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)V")
	public static void method2821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static281.anInt4566 = arg0;
		Static252.anInt4078 = arg1;
		if (Static448.anInt6796 == 0) {
			Static571.anInt8534 = Static321.anInt5113 * 2 + Static252.anInt4078;
			Static576.anInt8585 = Static281.anInt4566 + Static702.anInt10569 * 2;
		} else if (Static448.anInt6796 == 1) {
			Static211.anInt5574 = Static116.anInt2268 + Static252.anInt4078 / Static437.anInt6628 + 2;
			Static617.anInt9434 = Static281.anInt4566 / Static714.anInt10802 + Static464.anInt7013 + 2;
			Static576.anInt8585 = Static617.anInt9434 * Static714.anInt10802;
			Static571.anInt8534 = Static211.anInt5574 * Static437.anInt6628;
			Static321.anInt5113 = Static571.anInt8534 - Static252.anInt4078 >> 1;
			Static702.anInt10569 = Static576.anInt8585 - Static281.anInt4566 >> 1;
		} else if (Static448.anInt6796 == 2) {
			Static571.anInt8534 = Static252.anInt4078;
			Static576.anInt8585 = Static281.anInt4566;
		}
	}
}
