import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!de", name = "b", descriptor = "[I")
	public static int[] anIntArray189;

	@OriginalMember(owner = "client!de", name = "h", descriptor = "Lclient!uf;")
	public static final Class370 aClass370_1 = new Class370();

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Lclient!fma;")
	public static final Class131 aClass131_2 = new Class131();

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method2029(@OriginalArg(1) String arg0) {
		@Pc(6) Class2_Sub19 local6 = Static273.method3962();
		local6.aClass2_Sub21_Sub2_1.method7389(Static572.aClass167_63.anInt3973);
		local6.aClass2_Sub21_Sub2_1.method7373(0);
		@Pc(28) int local28 = local6.aClass2_Sub21_Sub2_1.anInt8388;
		local6.aClass2_Sub21_Sub2_1.method7373(667);
		@Pc(39) int[] local39 = Static664.method8652(local6);
		@Pc(43) int local43 = local6.aClass2_Sub21_Sub2_1.anInt8388;
		local6.aClass2_Sub21_Sub2_1.method7391(arg0);
		local6.aClass2_Sub21_Sub2_1.method7389(Static51.anInt1052);
		local6.aClass2_Sub21_Sub2_1.anInt8388 += 7;
		local6.aClass2_Sub21_Sub2_1.method7366(local39, local43, local6.aClass2_Sub21_Sub2_1.anInt8388);
		local6.aClass2_Sub21_Sub2_1.method7357(local6.aClass2_Sub21_Sub2_1.anInt8388 - local28);
		Static405.aClass153_1.method3275(local6);
		Static580.anInt8621 = -3;
		Static654.anInt9739 = 0;
		Static6.anInt95 = 1;
		Static720.anInt10865 = 0;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
	public static void method2033() {
		Static425.aClass19_13.xa(((float) Static400.aClass2_Sub34_28.aClass57_Sub22_1.method6769() * 0.1F + 0.7F) * 1.1523438F);
		Static425.aClass19_13.ZA(Static68.anInt4096, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static425.aClass19_13.L(Static563.anInt8460, -1, 0);
		Static425.aClass19_13.method7973(Static226.aClass67_9);
	}
}
