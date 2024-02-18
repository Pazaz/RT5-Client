import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static694 {

	@OriginalMember(owner = "client!vv", name = "z", descriptor = "I")
	public static int anInt10405;

	@OriginalMember(owner = "client!vv", name = "y", descriptor = "Lclient!ve;")
	public static Class381 aClass381_13;

	@OriginalMember(owner = "client!vv", name = "w", descriptor = "I")
	public static int anInt10411;

	@OriginalMember(owner = "client!vv", name = "D", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_122 = new Class345(71, 4);

	@OriginalMember(owner = "client!vv", name = "F", descriptor = "Lclient!fma;")
	public static final Class131 aClass131_6 = new Class131();

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IZ)[B")
	public static byte[] method9027(@OriginalArg(0) int arg0) {
		@Pc(17) Class2_Sub2_Sub7 local17 = (Class2_Sub2_Sub7) Static541.aClass361_4.method8342((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(42) int local42 = 0; local42 < 255; local42++) {
				@Pc(48) int local48 = 255 - local42;
				@Pc(53) int local53 = Static623.method8326(-5208, local48, local28);
				@Pc(57) byte local57 = local22[local53];
				local22[local53] = local22[local48];
				local22[local48] = local22[511 - local42] = local57;
			}
			local17 = new Class2_Sub2_Sub7(local22);
			Static541.aClass361_4.method8341(local17, (long) arg0);
		}
		return local17.aByteArray21;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!ha;Ljava/lang/String;ZLclient!ve;Lclient!da;I)V")
	public static void method9028(@OriginalArg(0) Class19 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class381 arg3, @OriginalArg(4) Class14 arg4) {
		@Pc(15) boolean local15 = !Static483.aBoolean546 || Static71.method1525();
		if (!local15) {
			return;
		}
		@Pc(40) int local40;
		@Pc(49) int local49;
		if (Static483.aBoolean546 && local15) {
			@Pc(27) Class381 local27 = Static16.aClass381_1;
			@Pc(33) Class14 local33 = arg0.method8010(local27, Static627.aClass407Array1, true);
			local40 = local27.method8741((Class23[]) null, arg1, 250);
			local49 = local27.method8745(250, local27.anInt10027, arg1, (Class23[]) null);
			@Pc(52) int local52 = Static535.aClass407_3.anInt10847;
			@Pc(56) int local56 = local52 + 4;
			local40 += local56 * 2;
			local49 += local56 * 2;
			if (Static320.anInt5083 > local49) {
				local49 = Static320.anInt5083;
			}
			if (Static343.anInt5610 > local40) {
				local40 = Static343.anInt5610;
			}
			@Pc(92) int local92 = Static180.aClass403_3.method9332(Static302.anInt4851, local40) + Static665.anInt9944;
			@Pc(101) int local101 = Static129.aClass103_1.method2416(Static479.anInt7201, local49) + Static101.anInt2097;
			if (Static137.aBoolean210) {
				local92 += Static130.method2283();
				local101 += Static422.method5771();
			}
			arg0.method7948(Static74.aClass407_1, false).method8189(Static414.aClass407_2.anInt10847 + local92, Static414.aClass407_2.anInt10850 + local101, local40 - Static414.aClass407_2.anInt10847 * 2, local49 + -(Static414.aClass407_2.anInt10850 * 2), 1, 0, 0);
			arg0.method7948(Static414.aClass407_2, true).method8202(local92, local101);
			Static414.aClass407_2.method9388();
			arg0.method7948(Static414.aClass407_2, true).method8202(local40 + local92 - local52, local101);
			Static414.aClass407_2.method9377();
			arg0.method7948(Static414.aClass407_2, true).method8202(local40 + local92 - local52, -local52 + local101 + local49);
			Static414.aClass407_2.method9388();
			arg0.method7948(Static414.aClass407_2, true).method8202(local92, local49 + local101 - local52);
			Static414.aClass407_2.method9377();
			arg0.method7948(Static535.aClass407_3, true).method8198(local92, Static414.aClass407_2.anInt10850 + local101, local52, local49 - Static414.aClass407_2.anInt10850 * 2);
			Static535.aClass407_3.method9386();
			arg0.method7948(Static535.aClass407_3, true).method8198(Static414.aClass407_2.anInt10847 + local92, local101, local40 - Static414.aClass407_2.anInt10847 * 2, local52);
			Static535.aClass407_3.method9386();
			arg0.method7948(Static535.aClass407_3, true).method8198(local40 + local92 - local52, Static414.aClass407_2.anInt10850 + local101, local52, local49 - Static414.aClass407_2.anInt10850 * 2);
			Static535.aClass407_3.method9386();
			arg0.method7948(Static535.aClass407_3, true).method8198(local92 + Static414.aClass407_2.anInt10847, local49 + (local101 - local52), local40 - Static414.aClass407_2.anInt10847 * 2, local52);
			Static535.aClass407_3.method9386();
			local33.method8826(0, (int[]) null, Static675.anInt10154 | 0xFF000000, arg1, (Class1) null, (Class23[]) null, local56 + local101, -1, 0, 1, local92 + local56, 1, 0, local40 - local56 * 2, -(local56 * 2) + local49);
			Static585.method7670(local40, local92, local49, local101);
		} else {
			local40 = arg3.method8741((Class23[]) null, arg1, 250);
			local49 = arg3.method8739(arg1, (Class23[]) null, 250) * 13;
			arg0.aa(6, 6, local40 + 4 + 4, local49 + 4 + 4, -16777216, 0);
			arg0.method7976(6, 6, local40 + 8, 4 + 4 + local49, -1, 0);
			arg4.method8826(0, (int[]) null, -1, arg1, (Class1) null, (Class23[]) null, 10, -1, 0, 1, 10, 1, 0, local40, local49);
			Static585.method7670(local40 + 8, 6, local49 + 4 + 4, 6);
		}
		if (!arg2) {
			return;
		}
		try {
			if (Static137.aBoolean210) {
				Static430.method5818();
			} else {
				arg0.method7984();
			}
		} catch (@Pc(458) Exception_Sub1 local458) {
		}
	}

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "(B)I")
	public static int method9030() {
		@Pc(9) int local9 = Static473.aClass140_22.method2952();
		if (local9 < Static655.aClass140Array1.length - 1) {
			Static473.aClass140_22 = Static655.aClass140Array1[local9 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!vv", name = "e", descriptor = "(I)V")
	public static void method9031() {
		for (@Pc(10) int local10 = 0; local10 < Static617.anInt9434; local10++) {
			@Pc(23) int local23 = Static719.method9118(Static482.anInt7265 + local10, 16939, Static617.anInt9434) * Static211.anInt5574;
			for (@Pc(25) int local25 = 0; local25 < Static211.anInt5574; local25++) {
				@Pc(36) int local36 = Static719.method9118(Static632.anInt9503 + local25, 16939, Static211.anInt5574) + local23;
				if (Static173.anIntArray252[local36] == Static420.anInt6436) {
					Static651.anInterface9Array1[local36].method9040(0, 0, Static437.anInt6628, Static714.anInt10802, Static437.anInt6628 * local25, Static714.anInt10802 * local10);
				}
			}
		}
		anInt10405++;
	}
}
