import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!cl", name = "S", descriptor = "I")
	public static int anInt1094;

	@OriginalMember(owner = "client!cl", name = "db", descriptor = "Lclient!qj;")
	public static Class162 aClass162_50;

	@OriginalMember(owner = "client!cl", name = "V", descriptor = "[I")
	public static final int[] anIntArray76 = new int[500];

	@OriginalMember(owner = "client!cl", name = "Y", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!cl", name = "Z", descriptor = "[Lclient!jd;")
	public static final Class98[] aClass98Array1 = new Class98[8];

	@OriginalMember(owner = "client!cl", name = "cb", descriptor = "Ljava/lang/String;")
	public static String aString49 = "skill: ";

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method875(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) boolean local7 = false;
		for (@Pc(9) int local9 = 0; local9 < Static329.anInt6733; local9++) {
			@Pc(17) Class7_Sub1_Sub1_Sub2 local17 = Static168.aClass7_Sub1_Sub1_Sub2Array1[Static238.anIntArray389[local9]];
			if (local17 != null && local17.aString266 != null && local17.aString266.equalsIgnoreCase(arg1)) {
				if (arg0 == 1) {
					Static150.aClass1_Sub16_Sub2_2.method5793(152);
					Static150.aClass1_Sub16_Sub2_2.method5783(0);
					Static150.aClass1_Sub16_Sub2_2.method5757(Static238.anIntArray389[local9]);
				} else if (arg0 == 4) {
					Static150.aClass1_Sub16_Sub2_2.method5793(114);
					Static150.aClass1_Sub16_Sub2_2.method5757(Static238.anIntArray389[local9]);
					Static150.aClass1_Sub16_Sub2_2.method5751(0);
				} else if (arg0 == 5) {
					Static150.aClass1_Sub16_Sub2_2.method5793(94);
					Static150.aClass1_Sub16_Sub2_2.method5771(0);
					Static150.aClass1_Sub16_Sub2_2.method5734(Static238.anIntArray389[local9]);
				} else if (arg0 == 6) {
					Static150.aClass1_Sub16_Sub2_2.method5793(35);
					Static150.aClass1_Sub16_Sub2_2.method5757(Static238.anIntArray389[local9]);
					Static150.aClass1_Sub16_Sub2_2.method5751(0);
				} else if (arg0 == 7) {
					Static150.aClass1_Sub16_Sub2_2.method5793(128);
					Static150.aClass1_Sub16_Sub2_2.method5782(Static238.anIntArray389[local9]);
					Static150.aClass1_Sub16_Sub2_2.method5760(0);
				}
				local7 = true;
				break;
			}
		}
		if (!local7) {
			Static293.method5172(Static66.aString66 + arg1);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!ud;Ljava/awt/Frame;Z)V")
	public static void method876(@OriginalArg(0) Class199 arg0, @OriginalArg(1) Frame arg1) {
		while (true) {
			@Pc(10) Class145 local10 = arg0.method5473(arg1);
			while (local10.anInt5065 == 0) {
				Static295.method5212(10L);
			}
			if (local10.anInt5065 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static295.method5212(100L);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLclient!ro;I)Ljava/lang/String;")
	public static String method877(@OriginalArg(1) Class177 arg0, @OriginalArg(2) int arg1) {
		if (!Static37.method930(arg0).method5618(arg1) && arg0.anObjectArray33 == null) {
			return null;
		} else if (arg0.aStringArray38 == null || arg0.aStringArray38.length <= arg1 || arg0.aStringArray38[arg1] == null || arg0.aStringArray38[arg1].trim().length() == 0) {
			return Static278.aBoolean279 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray38[arg1];
		}
	}
}
