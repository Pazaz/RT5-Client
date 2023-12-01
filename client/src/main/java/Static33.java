import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bs", name = "u", descriptor = "I")
	public static int anInt4463;

	@OriginalMember(owner = "client!bs", name = "q", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_96 = new LocalizedString("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!bs", name = "t", descriptor = "I")
	public static int anInt4462 = -1;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)V")
	public static void method4200(@OriginalArg(1) String msg2, @OriginalArg(2) int timestamp, @OriginalArg(3) String message, @OriginalArg(4) int type, @OriginalArg(5) String msg3) {
		Static220.method3874(timestamp, null, message, -1, type, msg3, msg2);
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)I")
	public static int method4201() {
		if (Cs1ScriptRunner.aClass161_14 == null) {
			if (!Static375.aBoolean477 && Static268.anInt4959 > 0) {
				if (Static148.shiftClickMod && Keyboard.instance.isPressed(81) && Static268.anInt4959 > 2) {
					return ((Class2_Sub5) Static129.aClass135_19.aClass2_130.prev.prev).anInt1007;
				}
				return ((Class2_Sub5) Static129.aClass135_19.aClass2_130.prev).anInt1007;
			}
			@Pc(23) int local23 = Mouse.instance.method3304();
			@Pc(27) int local27 = Mouse.instance.method3313();
			@Pc(29) int local29 = Static305.anInt5743;
			@Pc(31) int local31 = Static363.anInt6801;
			@Pc(33) int local33 = Static107.anInt2220;
			if (local29 < local23 && local23 < local33 + local29) {
				@Pc(47) int local47 = -1;
				@Pc(66) int local66;
				for (@Pc(49) int local49 = 0; local49 < Static268.anInt4959; local49++) {
					if (InterfaceList.aBoolean371) {
						local66 = local31 + (-local49 + Static268.anInt4959 + -1) * 16 + 33;
						if (local66 - 13 < local27 && local66 + 3 >= local27) {
							local47 = local49;
						}
					} else {
						local66 = local31 + (-local49 + -1 + Static268.anInt4959) * 16 + 31;
						if (local27 > local66 - 13 && local66 + 3 >= local27) {
							local47 = local49;
						}
					}
				}
				if (local47 != -1) {
					local66 = 0;
					@Pc(137) Class75 local137 = new Class75(Static129.aClass135_19);
					for (@Pc(142) Class2_Sub5 local142 = (Class2_Sub5) local137.method2181(); local142 != null; local142 = (Class2_Sub5) local137.method2178()) {
						if (local47 == local66++) {
							return local142.anInt1007;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BI)V")
	public static void method4202() {
		@Pc(1) LruHashTable local1 = Static98.aClass98_10;
		synchronized (Static98.aClass98_10) {
			Static98.aClass98_10.clean(5);
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIII)I")
	public static int method4205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(10) int local10 = arg3;
			arg3 = arg5;
			arg5 = local10;
		}
		@Pc(18) int local18 = arg0 & 0x3;
		if (local18 == 0) {
			return arg4;
		} else if (local18 == 1) {
			return 7 + 1 - arg2 - arg3;
		} else if (local18 == 2) {
			return 1 + 7 - arg4 - arg5;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "(I)V")
	public static void method4207() {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static373.buildAreaLimitX; local13++) {
			for (@Pc(17) int local17 = 0; local17 < Static242.buildAreaLimitZ; local17++) {
				if (Static81.method3667(Scene.aClass67ArrayArrayArray3, true, local13, local17, local11)) {
					local11++;
				}
				if (local11 >= 512) {
					return;
				}
			}
		}
	}
}
