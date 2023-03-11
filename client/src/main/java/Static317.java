import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "F")
	public static float aFloat74;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "Lclient!rn;")
	public static Class205 aClass205_6;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!mr;BZ)V")
	public static void method5548(@OriginalArg(0) Class11_Sub5_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class222 local9 = arg0.method4332();
		if (arg0.anInt4643 == 0) {
			arg0.anInt4641 = 0;
			Static16.anInt4756 = 0;
			Static170.anInt3229 = -1;
			return;
		}
		if (arg0.anInt4597 != -1 && arg0.anInt4590 == 0) {
			@Pc(39) Class157 local39 = Static39.aClass85_1.method2371(arg0.anInt4597);
			if (arg0.anInt4642 > 0 && local39.anInt4027 == 0) {
				Static16.anInt4756 = 0;
				Static170.anInt3229 = -1;
				arg0.anInt4641++;
				return;
			}
			if (arg0.anInt4642 <= 0 && local39.anInt4029 == 0) {
				Static170.anInt3229 = -1;
				Static16.anInt4756 = 0;
				arg0.anInt4641++;
				return;
			}
		}
		if (arg0.anInt4594 != -1 && arg0.anInt4595 <= Static114.anInt2348) {
			@Pc(97) Class91 local97 = Static322.aClass211_2.method5407(arg0.anInt4594);
			if (local97.aBoolean177 && local97.anInt2448 != -1) {
				@Pc(111) Class157 local111 = Static39.aClass85_1.method2371(local97.anInt2448);
				if (arg0.anInt4642 > 0 && local111.anInt4027 == 0) {
					Static16.anInt4756 = 0;
					arg0.anInt4641++;
					Static170.anInt3229 = -1;
					return;
				}
				if (arg0.anInt4642 <= 0 && local111.anInt4029 == 0) {
					arg0.anInt4641++;
					Static170.anInt3229 = -1;
					Static16.anInt4756 = 0;
					return;
				}
			}
		}
		@Pc(154) int local154 = arg0.anInt6781;
		@Pc(157) int local157 = arg0.anInt6783;
		@Pc(174) int local174 = arg0.anIntArray316[arg0.anInt4643 - 1] * 128 + arg0.method4328() * 64;
		@Pc(191) int local191 = arg0.anIntArray317[arg0.anInt4643 - 1] * 128 + arg0.method4328() * 64;
		if (local174 > local154) {
			if (local157 < local191) {
				arg0.method4325(10240);
			} else if (local191 >= local157) {
				arg0.method4325(12288);
			} else {
				arg0.method4325(14336);
			}
		} else if (local154 > local174) {
			if (local191 > local157) {
				arg0.method4325(6144);
			} else if (local157 > local191) {
				arg0.method4325(2048);
			} else {
				arg0.method4325(4096);
			}
		} else if (local191 > local157) {
			arg0.method4325(8192);
		} else if (local191 < local157) {
			arg0.method4325(0);
		}
		@Pc(289) byte local289 = arg0.aByteArray51[arg0.anInt4643 - 1];
		if (!arg1 && (local174 - local154 > 256 || local174 - local154 < -256 || local191 - local157 > 256 || local191 - local157 < -256)) {
			arg0.anInt6783 = local191;
			arg0.anInt6781 = local174;
			arg0.method4330(arg0.anInt4616);
			arg0.anInt4643--;
			Static170.anInt3229 = -1;
			if (arg0.anInt4642 > 0) {
				arg0.anInt4642--;
			}
			Static16.anInt4756 = 0;
			return;
		}
		@Pc(354) int local354 = 4;
		@Pc(356) boolean local356 = true;
		if (arg0 instanceof Class11_Sub5_Sub2_Sub2) {
			local356 = ((Class11_Sub5_Sub2_Sub2) arg0).aClass71_1.aBoolean143;
		}
		@Pc(396) int local396;
		if (local356) {
			local396 = arg0.anInt4616 - arg0.aClass248_7.anInt7197;
			if (local396 != 0 && arg0.anInt4611 == -1 && arg0.anInt4604 != 0) {
				local354 = 2;
			}
			if (!arg1 && arg0.anInt4643 > 2) {
				local354 = 6;
			}
			if (!arg1 && arg0.anInt4643 > 3) {
				local354 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt4643 > 1) {
				local354 = 6;
			}
			if (!arg1 && arg0.anInt4643 > 2) {
				local354 = 8;
			}
		}
		if (arg0.anInt4641 > 0 && arg0.anInt4643 > 1) {
			arg0.anInt4641--;
			local354 = 8;
		}
		if (local289 == 2) {
			local354 <<= 0x1;
		} else if (local289 == 0) {
			local354 >>= 0x1;
		}
		Static16.anInt4756 = 0;
		if (local9.anInt6274 != -1) {
			local354 <<= 0x7;
			if (arg0.anInt4643 == 1) {
				local396 = arg0.anInt4640 * arg0.anInt4640;
				@Pc(554) int local554 = (local174 >= arg0.anInt6781 ? local174 - arg0.anInt6781 : -local174 + arg0.anInt6781) << 7;
				@Pc(572) int local572 = (arg0.anInt6783 <= local191 ? local191 - arg0.anInt6783 : -local191 + arg0.anInt6783) << 7;
				@Pc(583) int local583 = local572 < local554 ? local554 : local572;
				@Pc(590) int local590 = local9.anInt6274 * 2 * local583;
				if (local396 > local590) {
					arg0.anInt4640 /= 2;
				} else if (local583 < local396 / 2) {
					arg0.anInt4640 -= local9.anInt6274;
					if (arg0.anInt4640 < 0) {
						arg0.anInt4640 = 0;
					}
				} else if (local354 > arg0.anInt4640) {
					arg0.anInt4640 += local9.anInt6274;
					if (local354 < arg0.anInt4640) {
						arg0.anInt4640 = local354;
					}
				}
			} else if (local354 > arg0.anInt4640) {
				arg0.anInt4640 += local9.anInt6274;
				if (local354 < arg0.anInt4640) {
					arg0.anInt4640 = local354;
				}
			} else if (arg0.anInt4640 > 0) {
				arg0.anInt4640 -= local9.anInt6274;
				if (arg0.anInt4640 < 0) {
					arg0.anInt4640 = 0;
				}
			}
			local354 = arg0.anInt4640 >> 7;
			if (local354 < 1) {
				local354 = 1;
			}
		}
		if (local154 < local174) {
			Static16.anInt4756 |= 0x4;
			arg0.anInt6781 += local354;
			if (local174 < arg0.anInt6781) {
				arg0.anInt6781 = local174;
			}
		} else if (local174 < local154) {
			Static16.anInt4756 |= 0x8;
			arg0.anInt6781 -= local354;
			if (local174 > arg0.anInt6781) {
				arg0.anInt6781 = local174;
			}
		}
		if (local157 < local191) {
			arg0.anInt6783 += local354;
			Static16.anInt4756 |= 0x1;
			if (local191 < arg0.anInt6783) {
				arg0.anInt6783 = local191;
			}
		} else if (local157 > local191) {
			Static16.anInt4756 |= 0x2;
			arg0.anInt6783 -= local354;
			if (local191 > arg0.anInt6783) {
				arg0.anInt6783 = local191;
			}
		}
		if (local354 < 8) {
			Static170.anInt3229 = local289;
		} else {
			Static170.anInt3229 = 2;
		}
		if (local174 != arg0.anInt6781 || local191 != arg0.anInt6783) {
			return;
		}
		arg0.anInt4643--;
		if (arg0.anInt4642 > 0) {
			arg0.anInt4642--;
			return;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)V")
	public static void method5549(@OriginalArg(1) int arg0) {
		Static233.anInt4199 = arg0;
		@Pc(15) Class98 local15 = Static349.aClass98_58;
		synchronized (Static349.aClass98_58) {
			Static349.aClass98_58.method2614();
		}
		local15 = Static92.aClass98_9;
		synchronized (Static92.aClass98_9) {
			Static92.aClass98_9.method2614();
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!bt;I)V")
	public static void method5551(@OriginalArg(0) Class2_Sub4 arg0) {
		@Pc(9) int local9 = arg0.method4817();
		Static363.aClass124Array1 = new Class124[local9];
		for (@Pc(22) int local22 = 0; local22 < local9; local22++) {
			Static363.aClass124Array1[local22] = new Class124();
			Static363.aClass124Array1[local22].anInt3405 = arg0.method4817();
			Static363.aClass124Array1[local22].aString28 = arg0.method4856();
		}
		Static375.anInt7042 = arg0.method4817();
		Static312.anInt5843 = arg0.method4817();
		Static299.anInt5643 = arg0.method4817();
		Static295.aClass3_Sub1Array1 = new Class3_Sub1[Static312.anInt5843 + 1 - Static375.anInt7042];
		for (@Pc(70) int local70 = 0; local70 < Static299.anInt5643; local70++) {
			@Pc(76) int local76 = arg0.method4817();
			@Pc(84) Class3_Sub1 local84 = Static295.aClass3_Sub1Array1[local76] = new Class3_Sub1();
			local84.anInt76 = arg0.method4815();
			local84.anInt74 = arg0.method4836();
			local84.anInt81 = local76 + Static375.anInt7042;
			local84.aString1 = arg0.method4856();
			local84.aString2 = arg0.method4856();
		}
		Static361.anInt6767 = arg0.method4836();
		Static70.aBoolean130 = true;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!r;Ljava/lang/String;ZI)Lclient!ih;")
	public static Class103 method5552(@OriginalArg(0) Class197 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(10) int local10 = arg0.method5075(arg1);
		if (local10 == -1) {
			return new Class103(0);
		}
		@Pc(28) int[] local28 = arg0.method5077(local10);
		@Pc(34) Class103 local34 = new Class103(local28.length);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local36 < local34.anInt2702) {
				@Pc(52) Class2_Sub4 local52 = new Class2_Sub4(arg0.method5089(local28[local38++], local10));
				@Pc(58) int local58 = local52.method4836();
				@Pc(62) int local62 = local52.method4829();
				@Pc(66) int local66 = local52.method4815();
				if (!arg2 && local66 == 1) {
					local34.anInt2702--;
				} else {
					local34.anIntArray170[local36] = local58;
					local34.anIntArray171[local36] = local62;
					local36++;
				}
			}
			return local34;
		}
	}
}
