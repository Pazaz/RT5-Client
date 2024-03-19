import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!op", name = "a", descriptor = "Lclient!we;")
	public static final Class215 aClass215_70 = new Class215(64);

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
	public static void method4325() {
		while (true) {
			if (Static299.aClass1_Sub16_Sub2_3.method5789(Static200.anInt4591) >= 11) {
				@Pc(18) int local18 = Static299.aClass1_Sub16_Sub2_3.method5800(11);
				if (local18 != 2047) {
					@Pc(25) boolean local25 = false;
					if (Static168.aClass7_Sub1_Sub1_Sub2Array1[local18] == null) {
						Static168.aClass7_Sub1_Sub1_Sub2Array1[local18] = new Class7_Sub1_Sub1_Sub2();
						Static168.aClass7_Sub1_Sub1_Sub2Array1[local18].anInt7070 = local18;
						if (Static83.aClass1_Sub16Array1[local18] != null) {
							Static168.aClass7_Sub1_Sub1_Sub2Array1[local18].method5987(Static83.aClass1_Sub16Array1[local18]);
						}
						local25 = true;
					}
					Static238.anIntArray389[Static329.anInt6733++] = local18;
					@Pc(68) Class7_Sub1_Sub1_Sub2 local68 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local18];
					local68.anInt7079 = Static197.anInt4521;
					@Pc(76) int local76 = Static299.aClass1_Sub16_Sub2_3.method5800(5);
					if (local76 > 15) {
						local76 -= 32;
					}
					@Pc(85) int local85 = Static299.aClass1_Sub16_Sub2_3.method5800(5);
					if (local85 > 15) {
						local85 -= 32;
					}
					@Pc(94) int local94 = Static299.aClass1_Sub16_Sub2_3.method5800(1);
					@Pc(99) int local99 = Static299.aClass1_Sub16_Sub2_3.method5800(1);
					if (local99 == 1) {
						Static31.anIntArray61[Static318.anInt6552++] = local18;
					}
					@Pc(119) int local119 = Static224.anIntArray394[Static299.aClass1_Sub16_Sub2_3.method5800(3)];
					if (local25) {
						local68.method5976(local119);
					}
					local68.method5988(local94 == 1, local76 + Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray579[0], Static39.anInt1215, Static264.aClass7_Sub1_Sub1_Sub2_2.anIntArray578[0] + local85);
					continue;
				}
			}
			Static299.aClass1_Sub16_Sub2_3.method5792();
			return;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZD)V")
	public static void method4326(@OriginalArg(1) double arg0) {
		if (arg0 == Static17.aDouble1) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static18.anIntArray47[local7] = local19 > 255 ? 255 : local19;
		}
		Static17.aDouble1 = arg0;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIIZII)V")
	public static void method4328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 >= Static239.anInt5299 && Static179.anInt4229 >= arg1 && Static180.anInt4240 <= arg4 && Static197.anInt4520 >= arg3) {
			if (arg5 == 1) {
				Static256.method4728(arg0, arg1, arg4, arg2, arg3);
			} else {
				Static13.method5508(arg2, arg5, arg3, arg0, arg4, arg1);
			}
		} else if (arg5 == 1) {
			Static90.method1977(arg2, arg0, arg3, arg1, arg4);
		} else {
			Static168.method3490(arg2, arg0, arg4, arg3, arg1, arg5);
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;JIIZIIZZ)V")
	public static void method4329(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) boolean arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(41) Class1_Sub16 local41 = new Class1_Sub16(128);
		local41.method5771(10);
		local41.method5757((arg8 ? 4 : 0) | (arg6 ? 2 : 0) | (arg9 ? 1 : 0));
		local41.method5753(arg3);
		local41.method5768(local8[0]);
		local41.method5726(arg2);
		local41.method5768(local8[1]);
		local41.method5757(Static192.anInt4459);
		local41.method5771(arg7);
		local41.method5771(arg4);
		local41.method5768(local8[2]);
		local41.method5757(arg1);
		local41.method5757(arg5);
		local41.method5768(local8[3]);
		local41.method5767(Static309.aBigInteger3, Static67.aBigInteger2);
		@Pc(127) Class1_Sub16 local127 = new Class1_Sub16(350);
		local127.method5726(arg0);
		@Pc(140) int local140 = 8 - Static279.method4951(arg0) % 8;
		for (@Pc(142) int local142 = 0; local142 < local140; local142++) {
			local127.method5771((int) (Math.random() * 255.0D));
		}
		local127.method5754(local8);
		Static150.aClass1_Sub16_Sub2_2.anInt6813 = 0;
		Static150.aClass1_Sub16_Sub2_2.method5771(22);
		Static150.aClass1_Sub16_Sub2_2.method5757(local41.anInt6813 + local127.anInt6813 + 2);
		Static150.aClass1_Sub16_Sub2_2.method5757(562);
		Static150.aClass1_Sub16_Sub2_2.method5740(local41.aByteArray86, local41.anInt6813);
		Static150.aClass1_Sub16_Sub2_2.method5740(local127.aByteArray86, local127.anInt6813);
		Static45.anInt1471 = 0;
		Static155.anInt3855 = 0;
		Static152.anInt3743 = -3;
		Static277.anInt5863 = 1;
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V")
	public static void method4330() {
		if (Static312.anInt6002 != 2) {
			try {
				Static358.method1001(Static345.aClient1, "tbrefresh");
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}
}
