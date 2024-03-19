import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Lclient!rr;")
	public static final Class179 aClass179_2 = new Class179();

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
	public static int anInt947 = 0;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString45 = "Loaded config";

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!ep;")
	public static final Class58 aClass58_3 = new Class58();

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BC)Z")
	public static boolean method710(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(36) char[] local36 = Static259.aCharArray15;
			for (@Pc(38) int local38 = 0; local38 < local36.length; local38++) {
				@Pc(44) char local44 = local36[local38];
				if (local44 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
	public static void method714() {
		if (Static133.aBoolean236) {
			return;
		}
		Static326.aBoolean480 = true;
		if (Static69.aBoolean133) {
			Static188.aFloat17 = (int) Static188.aFloat17 - 65 & 0xFFFFFF80;
		} else {
			Static164.aFloat50 += (-Static164.aFloat50 - 24.0F) / 2.0F;
		}
		Static133.aBoolean236 = true;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)Lclient!kj;")
	public static Class1_Sub1_Sub14 method715(@OriginalArg(1) int arg0) {
		@Pc(5) Class215 local5 = Static67.aClass215_6;
		@Pc(14) Class1_Sub1_Sub14 local14;
		synchronized (Static67.aClass215_6) {
			local14 = (Class1_Sub1_Sub14) Static67.aClass215_6.method6057((long) arg0);
			if (local14 == null) {
				local14 = new Class1_Sub1_Sub14(arg0);
				Static67.aClass215_6.method6050(local14, (long) arg0);
			}
		}
		synchronized (local14) {
			return local14.method3358() ? local14 : null;
		}
	}
}
