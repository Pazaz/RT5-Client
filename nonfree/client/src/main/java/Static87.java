import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "[Lclient!mga;")
	public static Class241[] aClass241Array1;

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
	public static int anInt1810;

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
	public static int anInt1806 = 0;

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_37 = new Class225(97, -1);

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_17 = new Class345(35, 7);

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "Lclient!it;")
	public static final Class184 aClass184_4 = new Class184(13, 0, 1, 0);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIII)V")
	public static void method1692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8;
		if (arg0 >= arg1) {
			for (local8 = arg1; local8 < arg0; local8++) {
				Static723.anIntArrayArray266[local8][arg3] = arg2;
			}
		} else {
			for (local8 = arg0; local8 < arg1; local8++) {
				Static723.anIntArrayArray266[local8][arg3] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILjava/lang/String;Lclient!ha;BIII)V")
	public static void method1693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static459.aClass23_31 == null || Static1.aClass23_42 == null) {
			if (Static721.aClass330_128.method7581(Static63.anInt1474) && Static721.aClass330_128.method7581(Static282.anInt4417)) {
				Static459.aClass23_31 = arg3.method7948(Static735.method9382(Static721.aClass330_128, Static63.anInt1474, 0), true);
				@Pc(49) Class407 local49 = Static735.method9382(Static721.aClass330_128, Static282.anInt4417, 0);
				Static1.aClass23_42 = arg3.method7948(local49, true);
				local49.method9388();
				Static608.aClass23_41 = arg3.method7948(local49, true);
			} else {
				arg3.aa(arg5, arg4, arg0, 20, Static719.anInt10504 | 255 - Static514.anInt7677 << 24, 1);
			}
		}
		if (Static459.aClass23_31 != null && Static1.aClass23_42 != null) {
			@Pc(82) int local82 = (arg0 - Static1.aClass23_42.method8199() * 2) / Static459.aClass23_31.method8199();
			for (@Pc(84) int local84 = 0; local84 < local82; local84++) {
				Static459.aClass23_31.method8202(arg5 + Static1.aClass23_42.method8199() + local84 * Static459.aClass23_31.method8199(), arg4);
			}
			Static1.aClass23_42.method8202(arg5, arg4);
			Static608.aClass23_41.method8202(arg0 + arg5 - Static608.aClass23_41.method8199(), arg4);
		}
		Static180.aClass14_3.method8829(arg5 + 3, arg4 + 14, arg2, -1, -16777216 | Static563.anInt8455);
		arg3.aa(arg5, arg4 + 20, arg0, arg1 - 20, -Static514.anInt7677 + 255 << 24 | Static719.anInt10504, 1);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method1694(@OriginalArg(0) String arg0) {
		Static110.aString19 = arg0;
		Static594.anInt8776 = Static110.aString19.length();
	}
}
