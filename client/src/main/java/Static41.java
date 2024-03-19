import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!cr", name = "ub", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10;

	@OriginalMember(owner = "client!cr", name = "wb", descriptor = "Lclient!or;")
	public static Class145 aClass145_2;

	@OriginalMember(owner = "client!cr", name = "u", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!cr", name = "hb", descriptor = "[Lclient!m;")
	public static final Class126[] aClass126Array1 = new Class126[4];

	@OriginalMember(owner = "client!cr", name = "vb", descriptor = "Z")
	public static boolean aBoolean87 = false;

	@OriginalMember(owner = "client!cr", name = "xb", descriptor = "[[I")
	public static final int[][] anIntArrayArray5 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
	public static void method1007() {
		Static9.aClass215_7.method6060();
		Static3.aClass215_1.method6060();
		Static74.aClass215_31.method6060();
		Static134.aClass215_52.method6060();
		Static326.aClass215_93.method6060();
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!ro;I)V")
	public static void method1008(@OriginalArg(0) Class177 arg0) {
		@Pc(11) int local11 = arg0.anInt5819;
		if (local11 == 324) {
			if (Static282.anInt5962 == -1) {
				Static147.anInt3639 = arg0.anInt5775;
				Static282.anInt5962 = arg0.anInt5788;
			}
			if (Static138.aClass190_1.aBoolean444) {
				arg0.anInt5788 = Static282.anInt5962;
			} else {
				arg0.anInt5788 = Static147.anInt3639;
			}
		} else if (local11 == 325) {
			if (Static282.anInt5962 == -1) {
				Static282.anInt5962 = arg0.anInt5788;
				Static147.anInt3639 = arg0.anInt5775;
			}
			if (Static138.aClass190_1.aBoolean444) {
				arg0.anInt5788 = Static147.anInt3639;
			} else {
				arg0.anInt5788 = Static282.anInt5962;
			}
		} else if (local11 == 327) {
			arg0.anInt5834 = 150;
			arg0.anInt5845 = (int) (Math.sin((double) Static197.anInt4521 / 40.0D) * 256.0D) & 0x3FFF;
			arg0.anInt5807 = 5;
			arg0.lb = -1;
		} else if (local11 == 328) {
			if (Static264.aClass7_Sub1_Sub1_Sub2_2.aString266 == null) {
				arg0.anInt5830 = 0;
				arg0.lb = 0;
			} else {
				arg0.anInt5834 = 150;
				arg0.anInt5845 = (int) (Math.sin((double) Static197.anInt4521 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt5807 = 5;
				arg0.lb = 2047;
				arg0.anInt5830 = Static182.method3707(Static264.aClass7_Sub1_Sub1_Sub2_2.aString266);
				arg0.anInt5844 = Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7096;
				arg0.anInt5769 = 0;
				arg0.anInt5846 = Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7035;
				arg0.anInt5821 = Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7053;
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!qj;Lclient!qj;B)V")
	public static void method1009(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class162 arg1) {
		Static249.aClass162_192 = arg1;
		Static122.aClass162_108 = arg0;
	}
}
