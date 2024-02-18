import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
	public static int anInt5001;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "Lclient!dla;")
	public static final Class82 aClass82_106 = new Class82(50);

	@OriginalMember(owner = "client!jt", name = "h", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_131 = new Class225(112, 6);

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
	public static int anInt5000 = -1;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)V")
	public static void method4541() {
		Static117.aClass2_Sub6_Sub1_2 = null;
		Static676.aClass330_121 = null;
		Static190.anInt3112 = 2;
		Static497.aBoolean564 = false;
		Static24.anInt595 = 0;
		Static96.anInt10171 = 1;
		Static99.anInt2077 = -1;
		Static174.anInt2918 = -1;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(BLclient!hda;)V")
	public static void method4542(@OriginalArg(1) Class158 arg0) {
		if (!Static156.aBoolean223) {
			return;
		}
		if (arg0.anObjectArray10 != null) {
			@Pc(17) Class158 local17 = Static15.method186(Static77.anInt1614, Static450.anInt6819);
			if (local17 != null) {
				@Pc(23) Class2_Sub42 local23 = new Class2_Sub42();
				local23.anObjectArray36 = arg0.anObjectArray10;
				local23.aClass158_14 = arg0;
				local23.aClass158_13 = local17;
				Static472.method6420(local23);
			}
		}
		@Pc(45) Class2_Sub19 local45 = Static293.method4335(Static505.aClass345_119, Static405.aClass153_2.aClass186_1);
		local45.aClass2_Sub21_Sub2_1.method7350(arg0.anInt3812);
		local45.aClass2_Sub21_Sub2_1.method7393(Static162.anInt2799);
		local45.aClass2_Sub21_Sub2_1.method7370(Static77.anInt1614);
		local45.aClass2_Sub21_Sub2_1.method7347(Static450.anInt6819);
		local45.aClass2_Sub21_Sub2_1.method7393(arg0.anInt3760);
		local45.aClass2_Sub21_Sub2_1.method7362(arg0.anInt3741);
		Static405.aClass153_2.method3275(local45);
	}
}
