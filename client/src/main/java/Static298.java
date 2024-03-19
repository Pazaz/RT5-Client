import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!td", name = "I", descriptor = "I")
	public static int anInt6269;

	@OriginalMember(owner = "client!td", name = "v", descriptor = "Lclient!wq;")
	public static final Class1_Sub43 aClass1_Sub43_1 = new Class1_Sub43(0, 0);

	@OriginalMember(owner = "client!td", name = "E", descriptor = "[I")
	public static final int[] anIntArray480 = new int[32];

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!me;)V")
	public static void method5247(@OriginalArg(0) Class7_Sub1 arg0) {
		for (@Pc(2) int local2 = arg0.aShort93; local2 <= arg0.aShort92; local2++) {
			for (@Pc(6) int local6 = arg0.aShort91; local6 <= arg0.aShort90; local6++) {
				@Pc(16) Class154 local16 = Static241.aClass154ArrayArrayArray2[arg0.aByte72][local2][local6];
				if (local16 != null) {
					@Pc(21) Class93 local21 = local16.aClass93_3;
					@Pc(23) Class93 local23 = null;
					while (local21 != null) {
						if (local21.aClass7_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass93_3 = local21.aClass93_2;
							} else {
								local23.aClass93_2 = local21.aClass93_2;
							}
							local21.method3030();
							break;
						}
						local23 = local21;
						local21 = local21.aClass93_2;
					}
					local16.aByte41 = 0;
					for (@Pc(56) Class93 local56 = local16.aClass93_3; local56 != null; local56 = local56.aClass93_2) {
						local16.aByte41 = (byte) (local16.aByte41 | local56.anInt3391);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
	public static void method5250() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static187.aBooleanArray12[local3] = false;
		}
		Static350.anInt7319 = 0;
		Static168.anInt4073 = -1;
		Static94.anInt2428 = -1;
		Static303.anInt6342 = 1;
		Static264.anInt5616 = 0;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(II)Lclient!ro;")
	public static Class177 method5252(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Class1_Sub2_Sub10.lb[local7] == null || Class1_Sub2_Sub10.lb[local7][local16] == null) {
			@Pc(30) boolean local30 = Static199.method3942(local7);
			if (!local30) {
				return null;
			}
		}
		return Class1_Sub2_Sub10.lb[local7][local16];
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public static void method5253() {
		@Pc(5) Class215 local5 = Static304.aClass215_91;
		synchronized (Static304.aClass215_91) {
			Static304.aClass215_91.method6060();
		}
		@Pc(26) Class215 local26 = Static80.aClass215_34;
		synchronized (Static80.aClass215_34) {
			Static80.aClass215_34.method6060();
		}
	}
}
