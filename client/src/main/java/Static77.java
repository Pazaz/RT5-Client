import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
	public static int anInt1613;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "Lclient!pc;")
	public static final Class287 aClass287_5 = new Class287(13, 7);

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "Lclient!kda;")
	public static final Class204 aClass204_1 = new Class204(1, 2);

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
	public static int anInt1614 = -1;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ)V")
	public static void method1557() {
		@Pc(13) Class2_Sub19 local13 = Static293.method4335(Static317.aClass345_62, Static405.aClass153_2.aIsaacRandom_1);
		Static405.aClass153_2.method3275(local13);
		for (@Pc(22) Class2_Sub4 local22 = (Class2_Sub4) Static548.aClass28_40.method736(); local22 != null; local22 = (Class2_Sub4) Static548.aClass28_40.method740()) {
			if (!local22.method9458()) {
				local22 = (Class2_Sub4) Static548.aClass28_40.method736();
				if (local22 == null) {
					break;
				}
			}
			if (local22.anInt146 == 0) {
				Static449.method6115(true, true, local22);
			}
		}
		if (Static390.aClass158_9 != null) {
			Static178.method2729(Static390.aClass158_9);
			Static390.aClass158_9 = null;
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(IZ)V")
	public static void method1558(@OriginalArg(0) int arg0) {
		@Pc(9) Class2_Sub2_Sub2 local9 = Static440.method5963(8, (long) arg0);
		local9.method205();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)Z")
	public static boolean method1559() {
		return Static594.anInt8777 > 0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)Z")
	public static boolean method1560(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
	public static void method1561() {
		@Pc(8) int local8 = Static400.aClass2_Sub34_28.aClass57_Sub4_2.method2143();
		if (local8 == 0) {
			Static328.aByteArrayArrayArray4 = null;
			Static556.method7300(0);
		} else if (local8 == 1) {
			Static170.method2652((byte) 0);
			Static556.method7300(512);
			if (Static280.aByteArrayArrayArray3 != null) {
				Static361.method5240();
			}
		} else {
			Static170.method2652((byte) (Static198.anInt3276 - 4 & 0xFF));
			Static556.method7300(2);
		}
		Static514.anInt7680 = Static394.anInt6176;
	}
}
