import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!li", name = "e", descriptor = "I")
	public static int anInt6934;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!li", name = "g", descriptor = "J")
	public static long aLong219;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "Lclient!it;")
	public static final Class184 aClass184_13 = new Class184(9, 0, 4, 1);

	@OriginalMember(owner = "client!li", name = "c", descriptor = "Lclient!nga;")
	public static final Class259 aClass259_14 = new Class259();

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I[Ljava/lang/String;)V")
	public static void method6234(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static110.aString19 = Static110.aString19 + arg0[0];
			Static594.anInt8776 += arg0[0].length();
			return;
		}
		for (@Pc(41) int local41 = 0; local41 < arg0.length; local41++) {
			if (arg0[local41].startsWith("pause")) {
				@Pc(61) int local61 = 5;
				try {
					local61 = Integer.parseInt(arg0[local41].substring(6));
				} catch (@Pc(70) Exception local70) {
				}
				Static79.method1579("Pausing for " + local61 + " seconds...");
				Static144.aStringArray7 = arg0;
				Static523.anInt3885 = local41 + 1;
				Static305.aLong157 = (long) (local61 * 1000) + Static588.method7715();
				return;
			}
			Static110.aString19 = arg0[local41];
			Static270.method3920(false);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)I")
	public static int method6235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static65.aClass3_1.anInt81 == -1) {
			return 1;
		}
		if (arg1 != Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7915()) {
			Static667.method8695(true, Static32.aClass32_13.method877(Static51.anInt1052), arg1);
			if (arg1 != Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7915()) {
				return -1;
			}
		}
		try {
			@Pc(43) Dimension local43 = Static434.aCanvas7.getSize();
			Static694.method9028(Static163.aClass19_17, Static32.aClass32_13.method877(Static51.anInt1052), true, Static694.aClass381_13, Static437.aClass14_9);
			@Pc(67) Class88 local67 = Static121.method2201(Static65.aClass3_1.anInt81, Static190.aClass330_38);
			@Pc(70) long local70 = Static588.method7715();
			Static163.aClass19_17.la();
			Static460.aClass73_10.method7125(0, Static247.anInt3993, 0);
			Static163.aClass19_17.method8000(Static460.aClass73_10);
			Static163.aClass19_17.DA(local43.width / 2, local43.height / 2, 512, 512);
			Static163.aClass19_17.xa(1.0F);
			Static163.aClass19_17.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(111) Class114 local111 = Static163.aClass19_17.method7952(local67, 2048, 64, 64, 768);
			@Pc(113) int local113 = 0;
			label41: for (@Pc(115) int local115 = 0; local115 < 500; local115++) {
				Static163.aClass19_17.GA(0);
				Static163.aClass19_17.ya();
				for (@Pc(123) int local123 = 15; local123 >= 0; local123--) {
					for (@Pc(126) int local126 = 0; local126 <= local123; local126++) {
						Static59.aClass73_5.method7125((int) ((float) Static340.anInt5586 * (-((float) local123 / 2.0F) + (float) local126)), 0, (local123 + 1) * Static340.anInt5586);
						local111.method7473(Static59.aClass73_5, (Class8_Sub6) null, 0);
						local113++;
						if ((long) arg0 <= Static588.method7715() - local70) {
							break label41;
						}
					}
				}
			}
			Static163.aClass19_17.method7950();
			@Pc(195) long local195 = (long) (local113 * 1000) / (Static588.method7715() - local70);
			Static163.aClass19_17.GA(0);
			Static163.aClass19_17.ya();
			return (int) local195;
		} catch (@Pc(204) Throwable local204) {
			local204.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIZ)V")
	public static void method6236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static316.aFrame8 != null && (arg2 != 3 || arg3 != Static328.anInt5427 || Static110.anInt2189 != arg1)) {
			Static655.method8562(Static446.aClass390_6, Static316.aFrame8);
			Static316.aFrame8 = null;
		}
		if (arg2 == 3 && Static316.aFrame8 == null) {
			Static316.aFrame8 = Static489.method6543(0, Static446.aClass390_6, arg1, arg3);
			if (Static316.aFrame8 != null) {
				Static328.anInt5427 = arg3;
				Static110.anInt2189 = arg1;
				Static666.method8693(1);
			}
		}
		if (arg2 == 3 && Static316.aFrame8 == null) {
			method6236(arg0, -1, Static400.aClass2_Sub34_28.aClass57_Sub1_1.method1485(), -1, true);
			return;
		}
		@Pc(95) Container local95;
		@Pc(110) Insets local110;
		if (Static316.aFrame8 != null) {
			Static54.anInt1084 = arg1;
			Static52.anInt1059 = arg3;
			local95 = Static316.aFrame8;
		} else if (Static353.aFrame10 == null) {
			if (Static166.anApplet1 == null) {
				local95 = Static149.anApplet_Sub1_1;
			} else {
				local95 = Static166.anApplet1;
			}
			Static52.anInt1059 = local95.getSize().width;
			Static54.anInt1084 = local95.getSize().height;
		} else {
			local110 = Static353.aFrame10.getInsets();
			Static52.anInt1059 = Static353.aFrame10.getSize().width - local110.right - local110.left;
			@Pc(126) int local126 = -local110.top;
			Static54.anInt1084 = Static353.aFrame10.getSize().height + local126 - local110.bottom;
			local95 = Static353.aFrame10;
		}
		if (arg2 == 1) {
			Static241.anInt3962 = 0;
			Static134.anInt10329 = (Static52.anInt1059 - Static302.anInt4851) / 2;
			Static380.anInt5979 = Static479.anInt7201;
			Static680.anInt10289 = Static302.anInt4851;
		} else {
			Static323.method4625();
		}
		if (Static2.aClass355_1 != Static446.aClass355_5) {
			@Pc(178) boolean local178;
			if (Static680.anInt10289 < 1024 && Static380.anInt5979 < 768) {
				local178 = true;
			} else {
				local178 = false;
			}
		}
		if (arg4) {
			Static574.method7572();
		} else {
			Static434.aCanvas7.setSize(Static680.anInt10289, Static380.anInt5979);
			if (Static137.aBoolean210) {
				Static575.method7606(Static434.aCanvas7);
			} else {
				Static163.aClass19_17.method7935(Static434.aCanvas7, Static680.anInt10289, Static380.anInt5979);
			}
			if (local95 == Static353.aFrame10) {
				local110 = Static353.aFrame10.getInsets();
				Static434.aCanvas7.setLocation(Static134.anInt10329 + local110.left, Static241.anInt3962 + local110.top);
			} else {
				Static434.aCanvas7.setLocation(Static134.anInt10329, Static241.anInt3962);
			}
		}
		if (arg2 >= 2) {
			Static152.aBoolean811 = true;
		} else {
			Static152.aBoolean811 = false;
		}
		if (Static377.anInt5930 != -1) {
			Static640.method8435(true);
		}
		if (Static405.aClass153_2.aClass348_1 != null && Static109.method2070(Static283.anInt4574)) {
			Static371.method5284();
		}
		for (@Pc(258) int local258 = 0; local258 < 100; local258++) {
			Static364.aBooleanArray18[local258] = true;
		}
		Static664.aBoolean759 = true;
	}
}
