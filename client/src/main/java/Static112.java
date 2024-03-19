import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
	public static int anInt2867;

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "[I")
	public static int[] anIntArray204;

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "Lclient!os;")
	public static Class146 aClass146_6;

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
	public static int anInt2873;

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "Lclient!mi;")
	public static Class130 aClass130_10;

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBI)I")
	public static int method2379(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(48) int local48 = Static337.method5990(arg0 + 91923, arg1 + 45365, 4) + (Static337.method5990(arg0 + 37821, arg1 + 10294, 2) - 128 >> 1) + (Static337.method5990(arg0, arg1, 1) + -128 >> 2) - 128;
		local48 = (int) ((double) local48 * 0.3D) + 35;
		if (local48 < 10) {
			local48 = 10;
		} else if (local48 > 60) {
			local48 = 60;
		}
		return local48;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
	public static void method2381() {
		if (Static133.aBoolean236) {
			return;
		}
		Static326.aBoolean480 = true;
		if (Static69.aBoolean133) {
			Static188.aFloat17 = (int) Static188.aFloat17 + 191 & 0xFFFFFF80;
		} else {
			Static164.aFloat50 += (24.0F - Static164.aFloat50) / 2.0F;
		}
		Static133.aBoolean236 = true;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
	public static void method2382() {
		Static150.aClass1_Sub16_Sub2_2.method5793(170);
		Static150.aClass1_Sub16_Sub2_2.method5771(Static164.method3437());
		Static150.aClass1_Sub16_Sub2_2.method5757(Static107.anInt2674);
		Static150.aClass1_Sub16_Sub2_2.method5757(Static350.anInt7318);
		Static150.aClass1_Sub16_Sub2_2.method5771(Static355.anInt4211);
	}
}
