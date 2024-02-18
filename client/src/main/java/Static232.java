import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!hda", name = "Tc", descriptor = "Lclient!faa;")
	public static Class119 aClass119_1;

	@OriginalMember(owner = "client!hda", name = "id", descriptor = "I")
	public static int anInt3829;

	@OriginalMember(owner = "client!hda", name = "i", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_103 = new Class225(38, 0);

	@OriginalMember(owner = "client!hda", name = "sd", descriptor = "I")
	public static int anInt3764 = 0;

	@OriginalMember(owner = "client!hda", name = "ob", descriptor = "Lclient!av;")
	public static final Class28 aClass28_18 = new Class28(8);

	@OriginalMember(owner = "client!hda", name = "u", descriptor = "Lclient!mia;")
	public static final Class242 aClass242_6 = new Class242("", 21);

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!ha;IIIIILclient!pg;IIIII)V")
	public static void method3387(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub2_Sub16 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg9 < arg10 && arg1 + arg9 > arg10 && arg8 > arg4 - 13 && arg4 + 3 > arg8 && arg6.aBoolean552) {
			arg7 = arg5;
		}
		@Pc(49) int[] local49 = null;
		if (Static245.method8635(arg6.anInt7314)) {
			local49 = Static419.aClass112_1.method2486((int) arg6.aLong233).anIntArray800;
		} else if (arg6.anInt7317 != -1) {
			local49 = Static419.aClass112_1.method2486(arg6.anInt7317).anIntArray800;
		} else if (Static598.method7825(arg6.anInt7314)) {
			@Pc(110) Class2_Sub45 local110 = (Class2_Sub45) Static18.aClass28_2.method738((long) (int) arg6.aLong233);
			if (local110 != null) {
				@Pc(115) Class8_Sub2_Sub1_Sub2_Sub2 local115 = local110.aClass8_Sub2_Sub1_Sub2_Sub2_2;
				@Pc(118) Class268 local118 = local115.aClass268_1;
				if (local118.anIntArray532 != null) {
					local118 = local118.method5985(65535, Static34.aClass304_1);
				}
				if (local118 != null) {
					local49 = local118.anIntArray533;
				}
			}
		} else if (Static523.method3444(arg6.anInt7314)) {
			@Pc(87) Class54 local87 = Static354.aClass142_4.method3063((int) (arg6.aLong233 >>> 32 & 0x7FFFFFFFL), 99);
			if (local87.anIntArray113 != null) {
				local87 = local87.method1301(13, Static34.aClass304_1);
			}
			if (local87 != null) {
				local49 = local87.anIntArray112;
			}
		}
		@Pc(154) String local154 = Static518.method9293(arg6);
		if (local49 != null) {
			local154 = local154 + Static72.method1527(local49);
		}
		Static180.aClass14_3.method8827(arg7, arg4, local154, arg9 + 3, Static186.aClass23Array5, Static460.anIntArray554);
		if (arg6.aBoolean553) {
			Static517.aClass23_32.method8202(arg9 + Static42.aClass381_4.method8744(local154) + 5, arg4 + -12);
		}
	}

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "(I)V")
	public static void method3392() {
		try {
			@Pc(14) int local14;
			if (Static96.anInt10171 == 1) {
				local14 = Static581.aClass2_Sub6_Sub1_3.method948();
				if (local14 > 0 && Static581.aClass2_Sub6_Sub1_3.method922()) {
					local14 -= Static190.anInt3112;
					if (local14 < 0) {
						local14 = 0;
					}
					Static581.aClass2_Sub6_Sub1_3.method916(local14);
					return;
				}
				Static581.aClass2_Sub6_Sub1_3.method912();
				Static581.aClass2_Sub6_Sub1_3.method927();
				Static12.aClass123_4 = null;
				Static62.aClass2_Sub8_3 = null;
				if (Static676.aClass330_121 == null) {
					Static96.anInt10171 = 0;
				} else {
					Static96.anInt10171 = 2;
				}
			}
			if (Static96.anInt10171 == 3) {
				local14 = Static581.aClass2_Sub6_Sub1_3.method948();
				if (local14 < Static24.anInt595 && Static581.aClass2_Sub6_Sub1_3.method922()) {
					local14 += Static611.anInt9335;
					if (local14 > Static24.anInt595) {
						local14 = Static24.anInt595;
					}
					Static581.aClass2_Sub6_Sub1_3.method916(local14);
				} else {
					Static611.anInt9335 = 0;
					Static96.anInt10171 = 0;
				}
			}
		} catch (@Pc(103) Exception local103) {
			local103.printStackTrace();
			Static581.aClass2_Sub6_Sub1_3.method912();
			Static117.aClass2_Sub6_Sub1_2 = null;
			Static62.aClass2_Sub8_3 = null;
			Static96.anInt10171 = 0;
			Static676.aClass330_121 = null;
			Static12.aClass123_4 = null;
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method3395(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(13) int local13 = arg0.indexOf(arg1); local13 != -1; local13 = arg0.indexOf(arg1, local13 + arg2.length())) {
			arg0 = arg0.substring(0, local13) + arg2 + arg0.substring(arg1.length() + local13);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)Z")
	public static boolean method3400() {
		@Pc(10) Class2_Sub57 local10 = (Class2_Sub57) Static631.aClass339_78.method7699(65280);
		if (local10 == null) {
			return false;
		}
		for (@Pc(23) int local23 = 0; local23 < local10.anInt10364; local23++) {
			if (local10.aClass270Array1[local23] != null && local10.aClass270Array1[local23].anInt6789 == 0) {
				return false;
			}
			if (local10.aClass270Array2[local23] != null && local10.aClass270Array2[local23].anInt6789 == 0) {
				return false;
			}
		}
		return true;
	}
}
