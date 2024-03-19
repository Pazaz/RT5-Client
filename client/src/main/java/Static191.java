import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!mn", name = "x", descriptor = "I")
	public static int anInt4426;

	@OriginalMember(owner = "client!mn", name = "y", descriptor = "Lclient!qj;")
	public static Class162 aClass162_153;

	@OriginalMember(owner = "client!mn", name = "v", descriptor = "Lclient!bc;")
	public static final Class17 aClass17_1 = new Class17();

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!il;I)V")
	public static void method3800(@OriginalArg(0) Class1_Sub16 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static124.aClass167_1 != null) {
			@Pc(20) int local20;
			try {
				Static124.aClass167_1.method4761(0L);
				Static124.aClass167_1.method4763(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(45) Exception local45) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method5740(local8, 24);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZIZIIIII)V")
	public static void method3801(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (!arg2 && arg3 == Static213.anInt1925 && Static274.anInt5784 == arg1 && (arg5 == Static331.anInt6843 || Static13.method5497())) {
			return;
		}
		Static213.anInt1925 = arg3;
		Static331.anInt6843 = arg5;
		Static274.anInt5784 = arg1;
		if (Static13.method5497()) {
			Static331.anInt6843 = 0;
		}
		if (arg0) {
			Static276.method4934(28);
		} else {
			Static276.method4934(25);
		}
		Static104.method2158(true, Static17.aString24, Static290.aClass30_3);
		@Pc(50) int local50 = Static149.anInt3667;
		@Pc(52) int local52 = Static96.anInt2446;
		Static149.anInt3667 = (Static213.anInt1925 - (Static25.anInt850 >> 4)) * 8;
		Static96.anInt2446 = (Static274.anInt5784 - (Static219.anInt4987 >> 4)) * 8;
		Static335.aClass1_Sub1_Sub3_3 = Static201.method3689(Static213.anInt1925 * 8, Static274.anInt5784 * 8);
		Static79.aClass181_4 = null;
		@Pc(85) int local85 = Static149.anInt3667 - local50;
		@Pc(90) int local90 = Static96.anInt2446 - local52;
		@Pc(94) int local94;
		@Pc(104) int local104;
		if (arg0) {
			Static49.anInt1559 = 0;
			local94 = Static25.anInt850 * 128 - 128;
			@Pc(164) int local164 = Static219.anInt4987 * 128 - 128;
			for (local104 = 0; local104 < 32768; local104++) {
				@Pc(172) Class7_Sub1_Sub1_Sub1 local172 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local104];
				if (local172 != null) {
					local172.anInt7032 -= local90 * 128;
					local172.anInt7027 -= local85 * 128;
					if (local172.anInt7027 >= 0 && local172.anInt7027 <= local94 && local172.anInt7032 >= 0 && local164 >= local172.anInt7032) {
						@Pc(224) boolean local224 = true;
						for (@Pc(226) int local226 = 0; local226 < 10; local226++) {
							local172.anIntArray578[local226] -= local85;
							local172.anIntArray579[local226] -= local90;
							if (local172.anIntArray578[local226] < 0 || Static25.anInt850 <= local172.anIntArray578[local226] || local172.anIntArray579[local226] < 0 || local172.anIntArray579[local226] >= Static219.anInt4987) {
								local224 = false;
							}
						}
						if (local224) {
							Static185.anIntArray309[Static49.anInt1559++] = local104;
						} else {
							Static84.aClass7_Sub1_Sub1_Sub1Array1[local104].method330(null);
							Static84.aClass7_Sub1_Sub1_Sub1Array1[local104] = null;
						}
					} else {
						Static84.aClass7_Sub1_Sub1_Sub1Array1[local104].method330(null);
						Static84.aClass7_Sub1_Sub1_Sub1Array1[local104] = null;
					}
				}
			}
		} else {
			for (local94 = 0; local94 < 32768; local94++) {
				@Pc(100) Class7_Sub1_Sub1_Sub1 local100 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local94];
				if (local100 != null) {
					for (local104 = 0; local104 < 10; local104++) {
						local100.anIntArray578[local104] -= local85;
						local100.anIntArray579[local104] -= local90;
					}
					local100.anInt7027 -= local85 * 128;
					local100.anInt7032 -= local90 * 128;
				}
			}
		}
		for (local94 = 0; local94 < 2048; local94++) {
			@Pc(315) Class7_Sub1_Sub1_Sub2 local315 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local94];
			if (local315 != null) {
				for (local104 = 0; local104 < 10; local104++) {
					local315.anIntArray578[local104] -= local85;
					local315.anIntArray579[local104] -= local90;
				}
				local315.anInt7027 -= local85 * 128;
				local315.anInt7032 -= local90 * 128;
			}
		}
		Static39.anInt1215 = arg5;
		Static264.aClass7_Sub1_Sub1_Sub2_2.method5988(false, arg4, Static39.anInt1215, arg6);
		Static181.method3698(local90, local85);
		for (@Pc(381) Class1_Sub4 local381 = (Class1_Sub4) Static12.aClass130_1.method3749(); local381 != null; local381 = (Class1_Sub4) Static12.aClass130_1.method3756()) {
			local381.anInt519 -= local90;
			local381.anInt526 -= local85;
			if (local381.anInt526 < 0 || local381.anInt519 < 0 || local381.anInt526 >= Static25.anInt850 || Static219.anInt4987 <= local381.anInt519) {
				local381.method6172();
			}
		}
		Static88.anInt2333 = 0;
		if (Static47.anInt1523 != 0) {
			Static47.anInt1523 -= local85;
			Static268.anInt5668 -= local90;
		}
		if (arg0) {
			Static88.anInt2339 -= local90 * 128;
			Static246.anInt6529 -= local85;
			Static32.anInt7023 -= local85;
			Static339.anInt7358 -= local90;
			Static151.anInt3704 -= local90;
			Static3.anInt92 -= local85 * 128;
			if (Math.abs(local85) > Static25.anInt850 || Math.abs(local90) > Static219.anInt4987) {
				Static206.method4105();
			}
		} else if (Static303.anInt6342 == 4) {
			Static12.anInt536 -= local90 * 128;
			Static72.anInt1985 -= local90 * 128;
			Static142.anInt3529 -= local85 * 128;
			Static327.anInt6692 -= local85 * 128;
		} else {
			Static303.anInt6342 = 1;
		}
		Static339.method6154();
		Static15.method447();
		Static66.aClass130_5.method3754();
		Static77.aClass130_6.method3754();
		Static44.aClass58_3.method1673();
		Static27.method656();
	}
}
