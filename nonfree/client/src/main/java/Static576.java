import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!sba", name = "g", descriptor = "I")
	public static int anInt8580;

	@OriginalMember(owner = "client!sba", name = "e", descriptor = "[Lclient!eo;")
	public static Class8_Sub2[] aClass8_Sub2Array9;

	@OriginalMember(owner = "client!sba", name = "d", descriptor = "I")
	public static int anInt8585;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(III)Z")
	public static boolean method7609(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static69.method6335(arg1, arg0) & (Static526.method7073(arg0, arg1) | (arg1 & 0x2000) != 0 | Static220.method3197(arg1, arg0));
	}

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(Z)Z")
	public static boolean method7611() {
		try {
			if (Static96.anInt10171 == 2) {
				if (Static62.aClass2_Sub8_3 == null) {
					Static62.aClass2_Sub8_3 = Static728.method1153(Static676.aClass330_121, Static99.anInt2077, Static174.anInt2918);
					if (Static62.aClass2_Sub8_3 == null) {
						return false;
					}
				}
				if (Static12.aClass123_4 == null) {
					Static12.aClass123_4 = new Class123(Static91.aClass330_117, Static296.aClass330_61);
				}
				@Pc(36) Class2_Sub6_Sub1 local36 = Static581.aClass2_Sub6_Sub1_3;
				if (Static117.aClass2_Sub6_Sub1_2 != null) {
					local36 = Static117.aClass2_Sub6_Sub1_2;
				}
				if (local36.method944(Static12.aClass123_4, Static86.aClass330_13, Static62.aClass2_Sub8_3)) {
					Static581.aClass2_Sub6_Sub1_3 = local36;
					Static581.aClass2_Sub6_Sub1_3.method933();
					@Pc(65) int local65;
					if (Static611.anInt9335 <= 0) {
						Static96.anInt10171 = 0;
						Static581.aClass2_Sub6_Sub1_3.method916(Static24.anInt595);
						for (local65 = 0; local65 < Static286.anIntArray358.length; local65++) {
							Static581.aClass2_Sub6_Sub1_3.method926(Static286.anIntArray358[local65], local65);
							Static286.anIntArray358[local65] = 255;
						}
					} else {
						Static96.anInt10171 = 3;
						Static581.aClass2_Sub6_Sub1_3.method916(Static24.anInt595 < Static611.anInt9335 ? Static24.anInt595 : Static611.anInt9335);
						for (local65 = 0; local65 < Static286.anIntArray358.length; local65++) {
							Static581.aClass2_Sub6_Sub1_3.method926(Static286.anIntArray358[local65], local65);
							Static286.anIntArray358[local65] = 255;
						}
					}
					if (Static117.aClass2_Sub6_Sub1_2 == null) {
						if (Static146.aLong95 <= 0L) {
							Static581.aClass2_Sub6_Sub1_3.method934(Static62.aClass2_Sub8_3, Static497.aBoolean564);
						} else {
							Static581.aClass2_Sub6_Sub1_3.method925(Static62.aClass2_Sub8_3, Static497.aBoolean564, Static146.aLong95);
						}
					}
					if (Static426.aClass56_2 != null) {
						Static426.aClass56_2.method3582(Static581.aClass2_Sub6_Sub1_3);
					}
					Static146.aLong95 = 0L;
					Static12.aClass123_4 = null;
					Static62.aClass2_Sub8_3 = null;
					Static117.aClass2_Sub6_Sub1_2 = null;
					Static676.aClass330_121 = null;
					return true;
				}
			}
		} catch (@Pc(191) Exception local191) {
			local191.printStackTrace();
			Static581.aClass2_Sub6_Sub1_3.method912();
			Static12.aClass123_4 = null;
			Static117.aClass2_Sub6_Sub1_2 = null;
			Static676.aClass330_121 = null;
			Static62.aClass2_Sub8_3 = null;
			Static96.anInt10171 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(B)V")
	public static void method7614() {
		Static286.aClass28_23.method737();
	}
}
