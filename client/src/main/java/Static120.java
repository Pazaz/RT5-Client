import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_50 = new Class79(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "Lclient!ad;")
	public static Class4 aClass4_49 = new Class4(64);

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "S")
	public static short aShort35 = 32767;

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "S")
	public static short aShort36 = 320;

	@OriginalMember(owner = "client!gs", name = "m", descriptor = "I")
	public static int anInt2387 = 0;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Ljava/lang/String;ILclient!bt;)I")
	public static int method2379(@OriginalArg(0) String arg0, @OriginalArg(2) Buffer arg1) {
		@Pc(6) int local6 = arg1.pos;
		@Pc(10) byte[] local10 = Static51.method1546(arg0);
		arg1.psmarts(local10.length);
		arg1.pos += Static370.aClass140_1.method3648(arg1.data, local10, 0, arg1.pos, local10.length);
		return arg1.pos - local6;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
	public static void method2380() {
		Static141.aClass115_1 = new Class115(8);
		Static201.anInt3701 = 0;
		for (@Pc(17) Class12_Sub5 local17 = (Class12_Sub5) Static131.aClass36_4.method1415(); local17 != null; local17 = (Class12_Sub5) Static131.aClass36_4.method1420()) {
			local17.method4356();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "([[BBLclient!bu;)V")
	public static void method2381(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class29_Sub1 arg1) {
		@Pc(16) int[] local16 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(18) int local18 = 0; local18 < arg1.anInt912; local18++) {
			Static37.method1135();
			for (@Pc(24) int local24 = 0; local24 < Static373.anInt7033 >> 3; local24++) {
				for (@Pc(28) int local28 = 0; local28 < Static242.anInt4449 >> 3; local28++) {
					@Pc(32) boolean local32 = false;
					@Pc(40) int local40 = Static310.anIntArrayArrayArray12[local18][local24][local28];
					if (local40 != -1) {
						@Pc(50) int local50 = local40 >> 24 & 0x3;
						if (!arg1.aBoolean73 || local50 == 0) {
							@Pc(61) int local61 = local40 >> 1 & 0x3;
							@Pc(67) int local67 = local40 >> 14 & 0x3FF;
							@Pc(73) int local73 = local40 >> 3 & 0x7FF;
							@Pc(83) int local83 = local73 / 8 + (local67 / 8 << 8);
							for (@Pc(85) int local85 = 0; local85 < Static291.mapSquares.length; local85++) {
								if (Static291.mapSquares[local85] == local83 && arg0[local85] != null) {
									@Pc(107) Buffer local107 = new Buffer(arg0[local85]);
									arg1.method1091(local24 * 8, local73, local107, Static171.aClass46Array1, local67, local28 * 8, local61, local50, local18);
									arg1.method1101(local107, local28 * 8, local18, local50, local73, local67, Static190.aClass19_8, local16[0] == -1 ? local16 : null, local24 * 8, local61);
									local32 = true;
									break;
								}
							}
						}
					}
					if (!local32) {
						arg1.method1092(8, local28 * 8, local24 * 8, 8, local18);
					}
				}
			}
		}
		if (local16[0] == -1) {
			Static368.aClass43_1 = null;
		} else {
			Static368.aClass43_1 = Static9.aClass213_1.method5424(local16[0], local16[1], local16[2], Static278.aClass160_1, local16[3]);
			Static72.anInt1683 = local16[4];
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IBI)V")
	public static void method2383(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub2_Sub7 local13 = Static316.method5413(12, arg1);
		local13.method2311();
		local13.anInt2289 = arg0;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!bt;B)Ljava/lang/String;")
	public static String method2384(@OriginalArg(1) Buffer arg0) {
		try {
			@Pc(7) int local7 = arg0.gsmart();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(23) byte[] local23 = new byte[local7];
			arg0.pos += Static370.aClass140_1.method3651(local7, local23, 0, arg0.pos, arg0.data);
			return Cp1252Charset.decodeString(0, local23, local7);
		} catch (@Pc(47) Exception local47) {
			return "Cabbage";
		}
	}
}
