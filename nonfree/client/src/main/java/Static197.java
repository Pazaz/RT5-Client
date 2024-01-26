import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "I")
	public static int anInt3260 = -1;

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)V")
	public static void method2949() {
		@Pc(8) Class2_Sub25 local8;
		for (local8 = (Class2_Sub25) Static159.aClass339_15.method7699(65280); local8 != null; local8 = (Class2_Sub25) Static159.aClass339_15.method7706()) {
			if (local8.aBoolean309) {
				local8.method9457();
			} else {
				local8.aBoolean310 = true;
				if (local8.anInt4016 >= 0 && local8.anInt4006 >= 0 && Static720.anInt10859 > local8.anInt4016 && Static501.anInt7568 > local8.anInt4006) {
					Static293.method4332(local8);
				}
			}
		}
		for (local8 = (Class2_Sub25) Static227.aClass339_18.method7699(65280); local8 != null; local8 = (Class2_Sub25) Static227.aClass339_18.method7706()) {
			if (local8.aBoolean309) {
				local8.method9457();
			} else {
				local8.aBoolean310 = true;
			}
		}
	}
}
