import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static651 {

	@OriginalMember(owner = "client!uja", name = "j", descriptor = "Lclient!rt;")
	public static Class327 aClass327_8;

	@OriginalMember(owner = "client!uja", name = "p", descriptor = "[Lclient!gaa;")
	public static Interface9[] anInterface9Array1;

	@OriginalMember(owner = "client!uja", name = "h", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_235 = new Class225(43, -2);

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(BILclient!ha;)Lclient!st;")
	public static Class23 method8512(@OriginalArg(1) int arg0, @OriginalArg(2) Class19 arg1) {
		@Pc(18) Class2_Sub5 local18 = (Class2_Sub5) Static106.aClass28_11.method738((long) arg0);
		if (local18 != null) {
			@Pc(25) Class2_Sub28_Sub3 local25 = local18.aClass222_Sub1_1.method9187();
			local18.aBoolean18 = true;
			if (local25 != null) {
				return local25.method5491(arg1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IIIILclient!cg;)V")
	public static void method8513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class8_Sub2_Sub1_Sub2 arg3) {
		@Pc(9) Class289 local9 = arg3.method9317();
		@Pc(19) Class152 local19 = arg3.aClass152_10;
		@Pc(29) int local29 = arg3.anInt10756 - arg3.aClass126_7.anInt2889 & 0x3FFF;
		if (arg0 == -1) {
			if (local29 == 0 && arg3.anInt10749 <= 25) {
				if (!arg3.aBoolean817 || !local9.method6479(local19.method9114())) {
					local19.method9113(true, local9.method6477());
					arg3.aBoolean817 = local19.method9109();
				}
			} else if (arg1 < 0 && local9.anInt7264 != -1) {
				local19.method9113(true, local9.anInt7264);
				arg3.aBoolean817 = false;
			} else if (arg1 > 0 && local9.anInt7243 != -1) {
				local19.method9113(true, local9.anInt7243);
				arg3.aBoolean817 = false;
			} else if (!arg3.aBoolean817 || !local9.method6479(local19.method9114())) {
				local19.method9113(true, local9.method6477());
				arg3.aBoolean817 = arg3.aClass152_10.method9109();
			}
		} else if (arg3.anInt10722 != -1 && (local29 >= 10240 || local29 <= 2048)) {
			@Pc(172) int local172 = Static464.anIntArray561[arg2] - arg3.aClass126_7.anInt2889 & 0x3FFF;
			if (arg0 == 2 && local9.anInt7226 != -1) {
				if (local172 > 2048 && local172 <= 6144 && local9.anInt7260 != -1) {
					local19.method9113(true, local9.anInt7260);
				} else if (local172 >= 10240 && local172 < 14336 && local9.anInt7240 != -1) {
					local19.method9113(true, local9.anInt7240);
				} else if (local172 <= 6144 || local172 >= 10240 || local9.anInt7241 == -1) {
					local19.method9113(true, local9.anInt7226);
				} else {
					local19.method9113(true, local9.anInt7241);
				}
			} else if (arg0 == 0 && local9.anInt7235 != -1) {
				if (local172 > 2048 && local172 <= 6144 && local9.anInt7268 != -1) {
					local19.method9113(true, local9.anInt7268);
				} else if (local172 >= 10240 && local172 < 14336 && local9.anInt7239 != -1) {
					local19.method9113(true, local9.anInt7239);
				} else if (local172 <= 6144 || local172 >= 10240 || local9.anInt7262 == -1) {
					local19.method9113(true, local9.anInt7235);
				} else {
					local19.method9113(true, local9.anInt7262);
				}
			} else if (local172 > 2048 && local172 <= 6144 && local9.anInt7254 != -1) {
				local19.method9113(true, local9.anInt7254);
			} else if (local172 >= 10240 && local172 < 14336 && local9.anInt7266 != -1) {
				local19.method9113(true, local9.anInt7266);
			} else if (local172 <= 6144 || local172 >= 10240 || local9.anInt7253 == -1) {
				local19.method9113(true, local9.anInt7245);
			} else {
				local19.method9113(true, local9.anInt7253);
			}
			arg3.aBoolean817 = false;
		} else if (local29 == 0 && arg3.anInt10749 <= 25) {
			if (arg0 == 2 && local9.anInt7226 != -1) {
				local19.method9113(true, local9.anInt7226);
			} else if (arg0 == 0 && local9.anInt7235 != -1) {
				local19.method9113(true, local9.anInt7235);
			} else {
				local19.method9113(true, local9.anInt7245);
			}
			arg3.aBoolean817 = false;
		} else {
			if (arg0 == 2 && local9.anInt7226 != -1) {
				if (arg1 < 0 && local9.anInt7249 != -1) {
					local19.method9113(true, local9.anInt7249);
				} else if (arg1 <= 0 || local9.anInt7227 == -1) {
					local19.method9113(true, local9.anInt7226);
				} else {
					local19.method9113(true, local9.anInt7227);
				}
			} else if (arg0 == 0 && local9.anInt7235 != -1) {
				if (arg1 < 0 && local9.anInt7244 != -1) {
					local19.method9113(true, local9.anInt7244);
				} else if (arg1 <= 0 || local9.anInt7233 == -1) {
					local19.method9113(true, local9.anInt7235);
				} else {
					local19.method9113(true, local9.anInt7233);
				}
			} else if (arg1 < 0 && local9.anInt7263 != -1) {
				local19.method9113(true, local9.anInt7263);
			} else if (arg1 <= 0 || local9.anInt7269 == -1) {
				local19.method9113(true, local9.anInt7245);
			} else {
				local19.method9113(true, local9.anInt7269);
			}
			arg3.aBoolean817 = false;
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "([IIZLclient!cg;I)V")
	public static void method8515(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class8_Sub2_Sub1_Sub2 arg3) {
		@Pc(8) boolean local8;
		@Pc(10) int local10;
		if (arg3.anIntArray869 != null) {
			local8 = true;
			for (local10 = 0; local10 < arg3.anIntArray869.length; local10++) {
				if (arg0[local10] != arg3.anIntArray869[local10]) {
					local8 = false;
					break;
				}
			}
			@Pc(31) Class152 local31 = arg3.aClass152_11;
			if (local8 && local31.method9109()) {
				@Pc(44) Class69 local44 = arg3.aClass152_11.method9107();
				@Pc(47) int local47 = local44.anInt1646;
				if (local47 == 1) {
					local31.method9093(arg1);
				}
				if (local47 == 2) {
					local31.method9115();
				}
			}
		}
		local8 = true;
		for (local10 = 0; local10 < arg0.length; local10++) {
			if (arg0[local10] != -1) {
				local8 = false;
			}
			if (arg3.anIntArray869 == null || arg3.anIntArray869[local10] == -1 || Static25.aClass50_1.method1162(arg0[local10]).anInt1649 >= Static25.aClass50_1.method1162(arg3.anIntArray869[local10]).anInt1649) {
				arg3.anIntArray869 = arg0;
				arg3.aClass152_11.method9091(arg1);
				if (arg2) {
					arg3.anInt10762 = arg3.anInt10764;
				}
			}
		}
		if (!local8) {
			return;
		}
		arg3.anIntArray869 = arg0;
		arg3.aClass152_11.method9091(arg1);
		if (arg2) {
			arg3.anInt10762 = arg3.anInt10764;
			return;
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(I)Z")
	public static boolean method8516() {
		return Static14.method179("jaclib") ? Static14.method179("hw3d") : false;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IZLclient!wj;)V")
	public static void method8517(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class8_Sub2_Sub1_Sub2_Sub2 arg1) {
		if (Static594.anInt8777 >= 400) {
			return;
		}
		@Pc(21) Class268 local21 = arg1.aClass268_1;
		@Pc(24) String local24 = arg1.aString128;
		if (local21.anIntArray532 != null) {
			local21 = local21.method5985(65535, Static34.aClass304_1);
			if (local21 == null) {
				return;
			}
			local24 = local21.aString73;
		}
		if (!local21.aBoolean505) {
			return;
		}
		if (arg1.anInt10791 != 0) {
			@Pc(67) String local67 = Static723.aClass377_9 == Static392.aClass377_4 ? Static32.aClass32_30.method877(Static51.anInt1052) : Static32.aClass32_28.method877(Static51.anInt1052);
			local24 = local24 + Static693.method9009(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt1444, arg1.anInt10791) + " (" + local67 + arg1.anInt10791 + ")";
		}
		if (Static156.aBoolean223 && !arg0) {
			@Pc(113) Class296 local113 = Static610.anInt9329 == -1 ? null : Static386.aClass49_2.method1161(Static610.anInt9329);
			if ((Static717.anInt10822 & 0x2) != 0 && (local113 == null || local21.method5995(Static610.anInt9329, local113.anInt7509) != local113.anInt7509)) {
				Static416.method5707(false, -1, (long) arg1.anInt10740, 0, 0, Static153.aString27, 23, true, Static369.anInt4263, Static128.aString108 + " -> <col=ffff00>" + local24, (long) arg1.anInt10740, false);
			}
		}
		if (arg0) {
			return;
		}
		@Pc(176) String[] local176 = local21.aStringArray34;
		if (Static187.aBoolean255) {
			local176 = Static246.method3522(local176);
		}
		if (local176 == null) {
			return;
		}
		for (@Pc(189) int local189 = local176.length - 1; local189 >= 0; local189--) {
			if (local176[local189] != null && (local21.aByte107 == 0 || !local176[local189].equalsIgnoreCase(Static32.aClass32_23.method877(Static51.anInt1052)) && !local176[local189].equalsIgnoreCase(Static32.aClass32_22.method877(Static51.anInt1052)))) {
				@Pc(226) short local226 = 0;
				@Pc(228) int local228 = Static39.anInt950;
				if (local189 == 0) {
					local226 = 49;
				}
				if (local189 == 1) {
					local226 = 59;
				}
				if (local189 == 2) {
					local226 = 47;
				}
				if (local189 == 3) {
					local226 = 57;
				}
				if (local189 == 4) {
					local226 = 3;
				}
				if (local189 == 5) {
					local226 = 1011;
				}
				if (local189 == local21.anInt6716) {
					local228 = local21.anInt6739;
				}
				if (local21.anInt6737 == local189) {
					local228 = local21.anInt6752;
				}
				Static416.method5707(false, -1, (long) arg1.anInt10740, 0, 0, local176[local189], local226, true, local176[local189].equalsIgnoreCase(Static32.aClass32_23.method877(Static51.anInt1052)) ? local21.anInt6740 : local228, "<col=ffff00>" + local24, (long) arg1.anInt10740, false);
			}
		}
		if (local21.aByte107 != 1) {
			return;
		}
		for (@Pc(341) int local341 = 0; local341 < local176.length; local341++) {
			if (local176[local341] != null && (local176[local341].equalsIgnoreCase(Static32.aClass32_23.method877(Static51.anInt1052)) || local176[local341].equalsIgnoreCase(Static32.aClass32_22.method877(Static51.anInt1052)))) {
				@Pc(372) short local372 = 0;
				if (arg1.anInt10791 > Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt1444) {
					local372 = 2000;
				}
				@Pc(385) short local385 = 0;
				@Pc(387) int local387 = Static39.anInt950;
				if (local341 == 0) {
					local385 = 49;
				}
				if (local341 == 1) {
					local385 = 59;
				}
				if (local341 == 2) {
					local385 = 47;
				}
				if (local341 == 3) {
					local385 = 57;
				}
				if (local341 == 4) {
					local385 = 3;
				}
				if (local341 == 5) {
					local385 = 1011;
				}
				if (local21.anInt6716 == local341) {
					local387 = local21.anInt6739;
				}
				if (local385 != 0) {
					local385 += local372;
				}
				if (local21.anInt6737 == local341) {
					local387 = local21.anInt6752;
				}
				Static416.method5707(false, -1, (long) arg1.anInt10740, 0, 0, local176[local341], local385, true, local176[local341].equalsIgnoreCase(Static32.aClass32_23.method877(Static51.anInt1052)) ? local21.anInt6740 : local387, "<col=ffff00>" + local24, (long) arg1.anInt10740, false);
			}
		}
		return;
	}
}
