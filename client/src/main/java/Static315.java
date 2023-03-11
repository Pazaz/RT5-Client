import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!se", name = "t", descriptor = "I")
	public static int anInt5930;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
	public static void method5381() {
		Static295.aClass135_32.method3544();
		for (@Pc(13) Class2_Sub5 local13 = (Class2_Sub5) Static129.aClass135_19.method3551(); local13 != null; local13 = (Class2_Sub5) Static129.aClass135_19.method3552()) {
			if (local13.anInt1005 < 1000) {
				local13.method6468();
				Static295.aClass135_32.method3540(local13);
			}
		}
		Static295.aClass135_32.method3542(Static129.aClass135_19);
		@Pc(41) int local41 = -1;
		if (Static370.aClass2_Sub24_1 != null) {
			local41 = Static370.aClass2_Sub24_1.method5247();
		}
		if (!Static375.aBoolean477) {
			if (local41 == 0 && (Static232.anInt4087 == 1 && Static268.anInt4959 > 2 || Static208.method3710())) {
				local41 = 2;
			}
			if (local41 == 2 && Static268.anInt4959 > 0 && Static370.aClass2_Sub24_1 != null) {
				if (Static375.aClass161_14 == null && Static348.anInt6449 == 0) {
					Static388.method6439(Static370.aClass2_Sub24_1.method5243(), Static370.aClass2_Sub24_1.method5242());
				} else {
					Static116.anInt2357 = 2;
				}
			}
			if (local41 == 0 && Static268.anInt4959 > 0) {
				Static145.method2695();
			}
			if (Static375.aClass161_14 == null && Static348.anInt6449 == 0) {
				Static116.anInt2357 = 0;
				Static32.aClass2_Sub5_2 = null;
			}
			return;
		}
		@Pc(57) int local57;
		@Pc(61) int local61;
		if (local41 == -1) {
			local57 = Static226.aClass119_1.method3304();
			local61 = Static226.aClass119_1.method3313();
			if (local57 < Static305.anInt5743 - 10 || local57 > Static107.anInt2220 + Static305.anInt5743 + 10 || local61 < Static363.anInt6801 - 10 || local61 > Static363.anInt6801 + Static352.anInt6519 + 10) {
				Static375.aBoolean477 = false;
				Static369.method6221(Static107.anInt2220, Static305.anInt5743, Static352.anInt6519, Static363.anInt6801);
			}
		}
		if (local41 != 0) {
			return;
		}
		local57 = Static305.anInt5743;
		local61 = Static363.anInt6801;
		@Pc(117) int local117 = Static107.anInt2220;
		@Pc(121) int local121 = Static370.aClass2_Sub24_1.method5243();
		@Pc(125) int local125 = Static370.aClass2_Sub24_1.method5242();
		@Pc(127) int local127 = -1;
		@Pc(145) int local145;
		for (@Pc(129) int local129 = 0; local129 < Static268.anInt4959; local129++) {
			if (Static270.aBoolean371) {
				local145 = local61 + (Static268.anInt4959 - (local129 + 1)) * 16 + 33;
				if (local57 < local121 && local57 + local117 > local121 && local125 > local145 - 13 && local145 + 4 > local125) {
					local127 = local129;
				}
			} else {
				local145 = local61 + (-local129 + -1 + Static268.anInt4959) * 16 + 31;
				if (local57 < local121 && local121 < local117 + local57 && local145 - 13 < local125 && local125 < local145 + 3) {
					local127 = local129;
				}
			}
		}
		if (local127 != -1) {
			local145 = 0;
			@Pc(232) Class75 local232 = new Class75(Static129.aClass135_19);
			for (@Pc(237) Class2_Sub5 local237 = (Class2_Sub5) local232.method2181(); local237 != null; local237 = (Class2_Sub5) local232.method2178()) {
				if (local145 == local127) {
					Static259.method4427(local237, local121, local125);
				}
				local145++;
			}
		}
		Static375.aBoolean477 = false;
		Static369.method6221(Static107.anInt2220, Static305.anInt5743, Static352.anInt6519, Static363.anInt6801);
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	public static void method5382() {
		Protocol.inboundBuffer.accessBits();
		@Pc(13) int local13 = Protocol.inboundBuffer.gBit(8);
		@Pc(18) int local18;
		if (local13 < Static166.anInt3187) {
			for (local18 = local13; local18 < Static166.anInt3187; local18++) {
				Static17.anIntArray291[Static242.anInt4450++] = Static211.anIntArray230[local18];
			}
		}
		if (Static166.anInt3187 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static166.anInt3187 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(64) int local64 = Static211.anIntArray230[local18];
			@Pc(68) Class11_Sub5_Sub2_Sub2 local68 = Static365.aClass11_Sub5_Sub2_Sub2Array1[local64];
			@Pc(73) int local73 = Protocol.inboundBuffer.gBit(1);
			if (local73 == 0) {
				Static211.anIntArray230[Static166.anInt3187++] = local64;
				local68.anInt4610 = Static114.anInt2348;
			} else {
				@Pc(96) int local96 = Protocol.inboundBuffer.gBit(2);
				if (local96 == 0) {
					Static211.anIntArray230[Static166.anInt3187++] = local64;
					local68.anInt4610 = Static114.anInt2348;
					Static277.anIntArray361[Static343.anInt6390++] = local64;
				} else {
					@Pc(140) int local140;
					@Pc(150) int local150;
					if (local96 == 1) {
						Static211.anIntArray230[Static166.anInt3187++] = local64;
						local68.anInt4610 = Static114.anInt2348;
						local140 = Protocol.inboundBuffer.gBit(3);
						local68.method4338(1, local140);
						local150 = Protocol.inboundBuffer.gBit(1);
						if (local150 == 1) {
							Static277.anIntArray361[Static343.anInt6390++] = local64;
						}
					} else if (local96 == 2) {
						Static211.anIntArray230[Static166.anInt3187++] = local64;
						local68.anInt4610 = Static114.anInt2348;
						if (Protocol.inboundBuffer.gBit(1) == 1) {
							local140 = Protocol.inboundBuffer.gBit(3);
							local68.method4338(2, local140);
							local150 = Protocol.inboundBuffer.gBit(3);
							local68.method4338(2, local150);
						} else {
							local140 = Protocol.inboundBuffer.gBit(3);
							local68.method4338(0, local140);
						}
						local140 = Protocol.inboundBuffer.gBit(1);
						if (local140 == 1) {
							Static277.anIntArray361[Static343.anInt6390++] = local64;
						}
					} else if (local96 == 3) {
						Static17.anIntArray291[Static242.anInt4450++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(B)Lclient!oo;")
	public static Class12_Sub6 method5383() {
		@Pc(8) Class12_Sub6 local8 = (Class12_Sub6) Static352.aClass36_9.method1424();
		if (local8 == null) {
			return new Class12_Sub6();
		} else {
			Static285.anInt5374--;
			return local8;
		}
	}
}
