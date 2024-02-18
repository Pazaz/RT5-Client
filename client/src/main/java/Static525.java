import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!qja", name = "c", descriptor = "Lclient!pg;")
	public static Class2_Sub2_Sub16 aClass2_Sub2_Sub16_12;

	@OriginalMember(owner = "client!qja", name = "p", descriptor = "I")
	public static int anInt8907;

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(IZI)V")
	public static void method7886(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class2_Sub47 local17 = arg0 ? Static45.aClass2_Sub47_1 : Static674.aClass2_Sub47_3;
		if (local17 == null || arg1 < 0 || local17.anInt8286 <= arg1) {
			return;
		}
		@Pc(43) Class34 local43 = local17.aClass34Array1[arg1];
		if (local43.aByte9 != -1) {
			return;
		}
		@Pc(53) String local53 = local43.aString2;
		@Pc(56) Class153 local56 = Static668.method8701();
		@Pc(62) Class2_Sub19 local62 = Static293.method4335(Static457.aClass345_86, local56.aIsaacRandom_1);
		local62.aPacketBit_1.p1(Static231.method3379(local53) + 3);
		local62.aPacketBit_1.p1(arg0 ? 1 : 0);
		local62.aPacketBit_1.p2(arg1);
		local62.aPacketBit_1.pjstr(local53);
		local56.method3275(local62);
	}
}
