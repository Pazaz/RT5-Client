import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_196 = new Class225(114, 4);

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "[I")
	public static final int[] anIntArray628 = new int[1000];

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
	public static void method7119() {
		for (@Pc(8) Class2_Sub2_Sub4 local8 = (Class2_Sub2_Sub4) Static350.aClass192_8.method4352(); local8 != null; local8 = (Class2_Sub2_Sub4) Static350.aClass192_8.method4350()) {
			if (local8.anInt1534 > 1) {
				local8.anInt1534 = 0;
				Static717.aClass82_232.method2150(local8, ((Class2_Sub2_Sub16) local8.aClass192_3.aClass2_Sub2_36.aClass2_Sub2_66).aLong234);
				local8.aClass192_3.method4351();
			}
		}
		Static31.anInt767 = 0;
		Static594.anInt8777 = 0;
		Static693.aClass339_79.method7700();
		Static490.aClass28_34.method737();
		Static350.aClass192_8.method4351();
		Static400.aBoolean622 = false;
	}
}
