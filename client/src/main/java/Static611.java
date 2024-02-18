import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static611 {

	@OriginalMember(owner = "client!tfa", name = "g", descriptor = "I")
	public static int anInt9335;

	@OriginalMember(owner = "client!tfa", name = "i", descriptor = "I")
	public static int anInt9341 = 0;

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)V")
	public static void method8227(@OriginalArg(1) int arg0) {
		@Pc(23) Class2_Sub2_Sub2 local23 = Static440.method5963(3, (long) arg0);
		local23.method205();
	}

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "(ZI)I")
	public static int method8228(@OriginalArg(1) int arg0) {
		@Pc(8) byte local8;
		if (arg0 > 12000) {
			local8 = 4;
			Static395.method9162();
		} else if (arg0 > 5000) {
			Static133.method2316();
			local8 = 3;
		} else if (arg0 > 2000) {
			Static75.method6239();
			local8 = 2;
		} else {
			local8 = 1;
			Static468.method7643();
		}
		if (Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7915() != 2) {
			Static400.aClass2_Sub34_28.method5104(2, Static400.aClass2_Sub34_28.aClass57_Sub29_2);
			Static32.method880(2, false);
		}
		Static666.method8693(1);
		return local8;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIILclient!sb;ZI)V")
	public static void method8229(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class330 arg2) {
		Static184.method2797(0L, arg0, arg1, arg2);
	}
}
