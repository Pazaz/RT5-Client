import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	public static int anInt5083;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	public static int anInt5084;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	public static int anInt5085;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Lclient!hw;")
	public static final Class172 aClass172_2 = new Class172();

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_135 = new Class225(85, -2);

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
	public static void method4598() {
		if (!Static400.aBoolean622) {
			Static236.aBoolean304 = Static143.anInt4059 != -1 && Static143.anInt4059 <= Static594.anInt8777 || Static594.anInt8777 * 16 + (Static60.aBoolean87 ? 26 : 22) > Static380.anInt5979;
		}
		Static204.aClass339_16.method7700();
		Static239.aClass339_19.method7700();
		@Pc(64) int local64;
		for (@Pc(57) Class2_Sub2_Sub16 local57 = (Class2_Sub2_Sub16) Static693.aClass339_79.method7699(65280); local57 != null; local57 = (Class2_Sub2_Sub16) Static693.aClass339_79.method7706()) {
			local64 = local57.anInt7314;
			if (local64 < 1000) {
				local57.method9457();
				if (local64 == 21 || local64 == 60 || local64 == 23 || local64 == 17 || local64 == 44 || local64 == 4 || local64 == 18) {
					Static239.aClass339_19.method7711(local57);
				} else {
					Static204.aClass339_16.method7711(local57);
				}
			}
		}
		Static204.aClass339_16.method7707(Static693.aClass339_79);
		Static239.aClass339_19.method7707(Static693.aClass339_79);
		if (Static594.anInt8777 <= 1) {
			Static470.aClass2_Sub2_Sub16_10 = null;
			Static96.aClass2_Sub2_Sub16_13 = null;
		} else {
			if (Static209.aBoolean269 && Static334.aClass319_1.method8479(81) && Static594.anInt8777 > 2) {
				Static470.aClass2_Sub2_Sub16_10 = (Class2_Sub2_Sub16) Static693.aClass339_79.aClass2_271.aClass2_345.aClass2_345;
			} else {
				Static470.aClass2_Sub2_Sub16_10 = (Class2_Sub2_Sub16) Static693.aClass339_79.aClass2_271.aClass2_345;
			}
			Static96.aClass2_Sub2_Sub16_13 = (Class2_Sub2_Sub16) Static693.aClass339_79.aClass2_271.aClass2_345;
		}
		local64 = -1;
		@Pc(204) Class2_Sub9 local204 = (Class2_Sub9) Static226.aClass339_58.method7699(65280);
		if (local204 != null) {
			local64 = local204.method5328();
		}
		if (!Static400.aBoolean622) {
			if (local64 == 0 && (Static219.anInt3549 == 1 && Static594.anInt8777 > 2 || Static204.method3084())) {
				local64 = 2;
			}
			if (local64 == 2 && Static594.anInt8777 > 0 && local204 != null) {
				if (Static109.aClass158_3 == null && Static460.anInt6964 == 0) {
					Static572.method7876(local204.method5333(), local204.method5331());
				} else {
					Static536.anInt8149 = 2;
				}
			}
			if (local64 == 0) {
				if (Static470.aClass2_Sub2_Sub16_10 != null) {
					Static407.method5628();
				} else if (Static156.aBoolean223) {
					Static470.method6384();
				}
			}
			if (Static109.aClass158_3 == null && Static460.anInt6964 == 0) {
				Static75.aClass2_Sub2_Sub16_9 = null;
				Static536.anInt8149 = 0;
			}
			return;
		}
		@Pc(317) int local317;
		@Pc(321) int local321;
		@Pc(426) int local426;
		@Pc(428) int local428;
		if (local64 == -1) {
			local317 = Static189.aClass120_1.method8853();
			local321 = Static189.aClass120_1.method8854();
			@Pc(323) boolean local323 = false;
			if (Static139.aClass2_Sub2_Sub4_1 != null) {
				if (local317 >= Static692.anInt10375 - 10 && local317 <= Static692.anInt10375 + Static85.anInt10675 + 10 && Static493.anInt7364 - 10 <= local321 && local321 <= Static493.anInt7364 + Static25.anInt598 + 10) {
					local323 = true;
				} else {
					Static329.method1636();
				}
			}
			if (!local323) {
				if (Static71.anInt1576 - 10 > local317 || Static71.anInt1576 + Static682.anInt10295 + 10 < local317 || Static84.anInt1775 - 10 > local321 || local321 > Static407.anInt6288 + Static84.anInt1775 + 10) {
					Static488.method6522();
				} else if (Static236.aBoolean304) {
					local426 = -1;
					local428 = -1;
					@Pc(444) int local444;
					for (@Pc(430) int local430 = 0; local430 < Static31.anInt767; local430++) {
						if (Static60.aBoolean87) {
							local444 = local430 * 16 + Static84.anInt1775 + 33;
							if (local321 > local444 - 13 && local444 + 4 > local321) {
								local426 = local430;
								local428 = local444 - 13;
								break;
							}
						} else {
							local444 = local430 * 16 + Static84.anInt1775 + 31;
							if (local444 - 13 < local321 && local321 < local444 + 3) {
								local428 = local444 - 13;
								local426 = local430;
								break;
							}
						}
					}
					if (local426 != -1) {
						local444 = 0;
						@Pc(525) Class299 local525 = new Class299(Static350.aClass192_8);
						for (@Pc(530) Class2_Sub2_Sub4 local530 = (Class2_Sub2_Sub4) local525.method6724(); local530 != null; local530 = (Class2_Sub2_Sub4) local525.method6723()) {
							if (local444 == local426) {
								if (local530.anInt1534 > 1) {
									Static609.method8214(local428, local321, local530);
								}
								break;
							}
							local444++;
						}
					}
				}
			}
		}
		if (local64 != 0) {
			return;
		}
		local317 = local204.method5331();
		local321 = local204.method5333();
		@Pc(661) int local661;
		@Pc(886) Class299 local886;
		@Pc(762) Class2_Sub2_Sub16 local762;
		if (Static139.aClass2_Sub2_Sub4_1 != null && Static692.anInt10375 <= local317 && Static85.anInt10675 + Static692.anInt10375 >= local317 && local321 >= Static493.anInt7364 && Static493.anInt7364 + Static25.anInt598 >= local321) {
			local661 = -1;
			for (local426 = 0; local426 < Static139.aClass2_Sub2_Sub4_1.anInt1534; local426++) {
				if (Static60.aBoolean87) {
					local428 = local426 * 16 + Static493.anInt7364 + 33;
					if (local321 > local428 - 13 && local428 + 4 > local321) {
						local661 = local426;
					}
				} else {
					local428 = local426 * 16 + Static493.anInt7364 + 31;
					if (local321 > local428 - 13 && local321 < local428 + 3) {
						local661 = local426;
					}
				}
			}
			if (local661 != -1) {
				local428 = 0;
				local886 = new Class299(Static139.aClass2_Sub2_Sub4_1.aClass192_3);
				for (local762 = (Class2_Sub2_Sub16) local886.method6724(); local762 != null; local762 = (Class2_Sub2_Sub16) local886.method6723()) {
					if (local661 == local428) {
						Static55.method1217(local321, local762, local317);
						break;
					}
					local428++;
				}
			}
			Static488.method6522();
			return;
		}
		if (Static71.anInt1576 > local317 || Static71.anInt1576 + Static682.anInt10295 < local317 || Static84.anInt1775 > local321 || local321 > Static407.anInt6288 + Static84.anInt1775) {
			return;
		}
		if (!Static236.aBoolean304) {
			local661 = -1;
			for (local426 = 0; local426 < Static594.anInt8777; local426++) {
				if (Static60.aBoolean87) {
					local428 = (Static594.anInt8777 - local426 - 1) * 16 + Static84.anInt1775 + 33;
					if (local321 > local428 - 13 && local321 < local428 + 4) {
						local661 = local426;
					}
				} else {
					local428 = Static84.anInt1775 + (-local426 + Static594.anInt8777 + -1) * 16 + 31;
					if (local321 > local428 - 13 && local428 + 3 > local321) {
						local661 = local426;
					}
				}
			}
			if (local661 != -1) {
				local428 = 0;
				@Pc(757) Class191 local757 = new Class191(Static693.aClass339_79);
				for (local762 = (Class2_Sub2_Sub16) local757.method4343(); local762 != null; local762 = (Class2_Sub2_Sub16) local757.method4342()) {
					if (local661 == local428) {
						Static55.method1217(local321, local762, local317);
						break;
					}
					local428++;
				}
			}
			Static488.method6522();
			return;
		}
		local661 = -1;
		for (local426 = 0; local426 < Static31.anInt767; local426++) {
			if (Static60.aBoolean87) {
				local428 = local426 * 16 + Static84.anInt1775 + 33;
				if (local428 - 13 < local321 && local321 < local428 + 4) {
					local661 = local426;
					break;
				}
			} else {
				local428 = Static84.anInt1775 + local426 * 16 + 31;
				if (local321 > local428 - 13 && local321 < local428 + 3) {
					local661 = local426;
					break;
				}
			}
		}
		if (local661 == -1) {
			return;
		}
		local428 = 0;
		local886 = new Class299(Static350.aClass192_8);
		for (@Pc(891) Class2_Sub2_Sub4 local891 = (Class2_Sub2_Sub4) local886.method6724(); local891 != null; local891 = (Class2_Sub2_Sub4) local886.method6723()) {
			if (local428 == local661) {
				Static55.method1217(local321, (Class2_Sub2_Sub16) local891.aClass192_3.aClass2_Sub2_36.aClass2_Sub2_66, local317);
				Static488.method6522();
				return;
			}
			local428++;
		}
		return;
	}
}
