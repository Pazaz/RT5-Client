import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!kt", name = "T", descriptor = "Lclient!uc;")
	public static Class367 aClass367_1;

	@OriginalMember(owner = "client!kt", name = "V", descriptor = "[F")
	public static final float[] aFloatArray40 = new float[2];

	@OriginalMember(owner = "client!kt", name = "P", descriptor = "Lclient!av;")
	public static final Class28 aClass28_29 = new Class28(16);

	@OriginalMember(owner = "client!kt", name = "R", descriptor = "[I")
	public static int[] anIntArray420 = new int[4];

	@OriginalMember(owner = "client!kt", name = "S", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_145 = new Class225(124, 1);

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BB)C")
	public static char method5084(@OriginalArg(0) byte arg0) {
		@Pc(14) int local14 = arg0 & 0xFF;
		if (local14 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local14, 16) + " provided");
		}
		if (local14 >= 128 && local14 < 160) {
			@Pc(50) char local50 = Static376.aCharArray7[local14 - 128];
			if (local50 == '\u0000') {
				local50 = '?';
			}
			local14 = local50;
		}
		return (char) local14;
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)V")
	public static void method5085() {
		Static78.anInt1622 = 0;
		Static86.anInt1798 = 0;
		Static572.anInt8896++;
		Static262.method3839();
		Static161.method2588();
		Static538.method7193();
		@Pc(23) boolean local23 = false;
		@Pc(33) int local33;
		for (@Pc(25) int local25 = 0; local25 < Static78.anInt1622; local25++) {
			local33 = Static118.anIntArray197[local25];
			@Pc(40) Class2_Sub45 local40 = (Class2_Sub45) Static18.aClass28_2.method738((long) local33);
			@Pc(43) Class8_Sub2_Sub1_Sub2_Sub2 local43 = local40.aClass8_Sub2_Sub1_Sub2_Sub2_2;
			if (local43.anInt10751 != Static572.anInt8896) {
				if (Static400.aBoolean622 && Static321.method4622(local33)) {
					Static488.method6522();
				}
				if (local43.aClass268_1.method5984()) {
					Static58.method1259(local43);
				}
				local43.method9328((Class268) null);
				local40.method9457();
				local23 = true;
			}
		}
		if (local23) {
			Static416.anInt6378 = Static18.aClass28_2.method739();
			Static18.aClass28_2.method743(Static592.aClass2_Sub45Array1);
		}
		if (Static405.aClass153_2.aClass2_Sub21_Sub2_2.anInt8388 != Static405.aClass153_2.anInt3648) {
			throw new RuntimeException("gnp1 pos:" + Static405.aClass153_2.aClass2_Sub21_Sub2_2.anInt8388 + " psize:" + Static405.aClass153_2.anInt3648);
		}
		for (local33 = 0; local33 < Static390.anInt6126; local33++) {
			if (Static18.aClass28_2.method738((long) Static103.anIntArray187[local33]) == null) {
				throw new RuntimeException("gnp2 pos:" + local33 + " size:" + Static390.anInt6126);
			}
		}
		if (Static416.anInt6378 - Static390.anInt6126 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static416.anInt6378 - Static390.anInt6126));
		}
		for (@Pc(214) int local214 = 0; local214 < Static416.anInt6378; local214++) {
			if (Static592.aClass2_Sub45Array1[local214].aClass8_Sub2_Sub1_Sub2_Sub2_2.anInt10751 != Static572.anInt8896) {
				throw new RuntimeException("gnp4 uk:" + Static592.aClass2_Sub45Array1[local214].aClass8_Sub2_Sub1_Sub2_Sub2_2.anInt10740);
			}
		}
	}
}
