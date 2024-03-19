import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!um", name = "q", descriptor = "Lclient!qj;")
	public static Class162 aClass162_225;

	@OriginalMember(owner = "client!um", name = "D", descriptor = "I")
	public static int anInt6611;

	@OriginalMember(owner = "client!um", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString253 = "Loading interfaces - ";

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(IIII)Lclient!oo;")
	public static Class1_Sub1_Sub17 method5615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg2 | arg0 << 8;
		@Pc(18) Class1_Sub1_Sub17 local18 = (Class1_Sub1_Sub17) Static321.aClass143_12.method4323((long) local9 << 16);
		if (local18 != null) {
			return local18;
		}
		@Pc(32) byte[] local32 = Static257.aClass162_198.method4630(Static257.aClass162_198.method4644(local9));
		if (local32 == null) {
			local9 = arg2 | arg1 + 65536 << 8;
			local18 = (Class1_Sub1_Sub17) Static321.aClass143_12.method4323((long) local9 << 16);
			if (local18 != null) {
				return local18;
			}
			local32 = Static257.aClass162_198.method4630(Static257.aClass162_198.method4644(local9));
			if (local32 == null) {
				local9 = arg2 | 0xFFFF00;
				local18 = (Class1_Sub1_Sub17) Static321.aClass143_12.method4323((long) local9 << 16);
				if (local18 != null) {
					return local18;
				}
				local32 = Static257.aClass162_198.method4630(Static257.aClass162_198.method4644(local9));
				if (local32 == null) {
					return null;
				} else if (local32.length <= 1) {
					return null;
				} else {
					local18 = Static19.method473(local32);
					local18.anInt5037 = arg2;
					Static321.aClass143_12.method4322(local18, (long) local9 << 16);
					return local18;
				}
			} else if (local32.length <= 1) {
				return null;
			} else {
				local18 = Static19.method473(local32);
				local18.anInt5037 = arg2;
				Static321.aClass143_12.method4322(local18, (long) local9 << 16);
				return local18;
			}
		} else if (local32.length <= 1) {
			return null;
		} else {
			local18 = Static19.method473(local32);
			local18.anInt5037 = arg2;
			Static321.aClass143_12.method4322(local18, (long) local9 << 16);
			return local18;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method5616(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 < 10000000) {
			return "<col=ffffff>" + arg0 / 1000 + Static139.aString120 + "</col>";
		} else {
			return "<col=00ff80>" + arg0 / 1000000 + Static68.aString70 + "</col>";
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method5624(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static199.aClass202_1);
		arg0.removeMouseMotionListener(Static199.aClass202_1);
		arg0.removeFocusListener(Static199.aClass202_1);
		Static89.anInt2373 = 0;
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "(I)V")
	public static void method5627() {
		@Pc(1) Class215 local1 = Static218.aClass215_68;
		synchronized (Static218.aClass215_68) {
			Static218.aClass215_68.method6052();
		}
	}
}
