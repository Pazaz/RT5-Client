import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!qq", name = "B", descriptor = "I")
	public static int anInt4930;

	@OriginalMember(owner = "client!qq", name = "F", descriptor = "I")
	public static int anInt4931;

	@OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
	public static int anInt4936;

	@OriginalMember(owner = "client!qq", name = "A", descriptor = "I")
	public static int anInt4929 = 0;

	@OriginalMember(owner = "client!qq", name = "C", descriptor = "[C")
	public static final char[] aCharArray15 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!qq", name = "D", descriptor = "Lclient!sk;")
	public static final Class1_Sub33 aClass1_Sub33_3 = new Class1_Sub33(0, 0);

	@OriginalMember(owner = "client!qq", name = "E", descriptor = "Z")
	public static boolean aBoolean340 = true;

	@OriginalMember(owner = "client!qq", name = "H", descriptor = "I")
	public static int anInt4933 = -1;

	@OriginalMember(owner = "client!qq", name = "I", descriptor = "I")
	public static int anInt4934 = 0;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IBILclient!vp;)V")
	public static void method4233(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class7_Sub1_Sub1_Sub2 arg2) {
		if (arg2.anInt7046 == arg0 && arg0 != -1) {
			@Pc(22) Class165 local22 = Static231.method4385(arg0);
			@Pc(25) int local25 = local22.anInt5575;
			if (local25 == 1) {
				arg2.anInt7055 = arg1;
				arg2.anInt7047 = 0;
				arg2.anInt7037 = 0;
				arg2.anInt7099 = 0;
				arg2.anInt7057 = 1;
				Static209.method4128(arg2.anInt7027, Static264.aClass7_Sub1_Sub1_Sub2_2 == arg2, arg2.anInt7047, arg2.anInt7032, local22);
			}
			if (local25 == 2) {
				arg2.anInt7099 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt7046 == -1 || Static231.method4385(arg0).anInt5568 >= Static231.method4385(arg2.anInt7046).anInt5568) {
			arg2.anInt7055 = arg1;
			arg2.anInt7057 = 1;
			arg2.anInt7099 = 0;
			arg2.anInt7047 = 0;
			arg2.anInt7046 = arg0;
			arg2.anInt7111 = arg2.anInt7113;
			arg2.anInt7037 = 0;
			if (arg2.anInt7046 != -1) {
				Static209.method4128(arg2.anInt7027, arg2 == Static264.aClass7_Sub1_Sub1_Sub2_2, arg2.anInt7047, arg2.anInt7032, Static231.method4385(arg2.anInt7046));
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(B)V")
	public static void method4235() {
		Static150.aClass1_Sub16_Sub2_2.method5793(36);
		Static150.aClass1_Sub16_Sub2_2.method5771(0);
	}
}
