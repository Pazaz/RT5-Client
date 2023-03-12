import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
	public static int anInt1721;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!nf;B)V")
	public static void method1822(@OriginalArg(0) Class12_Sub4 arg0) {
		arg0.aClass11_1 = null;
		@Pc(10) int local10 = arg0.aClass12_Sub2Array1.length;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			arg0.aClass12_Sub2Array1[local12].aBoolean29 = false;
		}
		@Pc(28) Class36[] local28 = Class2_Sub43.aClass36Array1;
		synchronized (Class2_Sub43.aClass36Array1) {
			if (local10 < Class2_Sub43.aClass36Array1.length && Static206.anIntArray224[local10] < 200) {
				Class2_Sub43.aClass36Array1[local10].method1418(arg0);
				@Pc(49) int local49 = Static206.anIntArray224[local10]++;
			}
		}
	}
}
