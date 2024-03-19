import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!nj", name = "hb", descriptor = "Lclient!ro;")
	public static Class177 aClass177_13;

	@OriginalMember(owner = "client!nj", name = "R", descriptor = "Z")
	public static boolean aBoolean329 = false;

	@OriginalMember(owner = "client!nj", name = "T", descriptor = "I")
	public static int anInt4726 = 0;

	@OriginalMember(owner = "client!nj", name = "X", descriptor = "[I")
	public static final int[] anIntArray355 = new int[1000];

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(BI)V")
	public static void method4067(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class1 local14 = Static273.aClass183_30.method5052(); local14 != null; local14 = Static273.aClass183_30.method5050()) {
			if ((long) arg0 == (local14.aLong235 >> 48 & 0xFFFFL)) {
				local14.method6172();
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(II)I")
	public static int method4069(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
