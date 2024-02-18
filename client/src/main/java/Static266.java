import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "[I")
	public static int[] anIntArray615;

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "[[B")
	public static final byte[][] aByteArrayArray27 = new byte[1000][];

	@OriginalMember(owner = "client!ifa", name = "g", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_191 = new Class225(138, -1);

	@OriginalMember(owner = "client!ifa", name = "i", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_192 = new Class225(109, 10);

	@OriginalMember(owner = "client!ifa", name = "h", descriptor = "Z")
	public static boolean aBoolean583 = true;

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V")
	public static void method6774() {
		Static117.anInt2282 = -1;
		Static102.anInt2129 = -1;
		Static342.method4465(0);
		@Pc(22) int local22;
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static720.anInt10859 >> 3; local18++) {
				for (local22 = 0; local22 < Static501.anInt7568 >> 3; local22++) {
					Static623.anIntArrayArrayArray19[local14][local18][local22] = -1;
				}
			}
		}
		@Pc(93) int local93;
		@Pc(98) int local98;
		@Pc(101) int local101;
		@Pc(104) int local104;
		@Pc(107) int local107;
		@Pc(110) int local110;
		@Pc(113) int local113;
		@Pc(116) int local116;
		for (@Pc(71) Class2_Sub35 local71 = (Class2_Sub35) Static391.aClass339_34.method7699(65280); local71 != null; local71 = (Class2_Sub35) Static391.aClass339_34.method7706()) {
			local22 = local71.anInt5689;
			@Pc(88) boolean local88 = (local22 & 0x1) == 1;
			local93 = local71.anInt5691 >> 3;
			local98 = local71.anInt5692 >> 3;
			local101 = local71.anInt5685;
			local104 = local71.anInt5696;
			local107 = local71.anInt5695;
			local110 = local71.anInt5690;
			local113 = local71.anInt5686;
			local116 = local71.anInt5694;
			@Pc(118) int local118 = 0;
			@Pc(120) int local120 = 0;
			@Pc(122) byte local122 = 1;
			@Pc(124) byte local124 = 1;
			if (local22 == 1) {
				local122 = -1;
				local120 = local113 - 1;
			} else if (local22 == 2) {
				local124 = -1;
				local122 = -1;
				local120 = local113 - 1;
				local118 = local116 - 1;
			} else if (local22 == 3) {
				local122 = 1;
				local118 = local116 - 1;
				local124 = -1;
			}
			for (@Pc(171) int local171 = local98; local171 < local116 + local98; local171++) {
				@Pc(175) int local175 = local120;
				@Pc(177) int local177 = local93;
				while (local177 < local93 + local113) {
					if (local88) {
						Static623.anIntArrayArrayArray19[local110][local118 + local101][local175 + local104] = (local171 << 3) + (local177 << 14) + (local107 << 24) + (local22 << 1);
					} else {
						Static623.anIntArrayArrayArray19[local110][local175 + local101][local104 + local118] = (local22 << 1) + (local171 << 3) + (local107 << 24) + (local177 << 14);
					}
					local177++;
					local175 += local122;
				}
				local118 += local124;
			}
		}
		local22 = Static322.anIntArrayArray265.length;
		anIntArray615 = new int[local22];
		Static89.anIntArray169 = new int[local22];
		Static319.aByteArrayArray16 = new byte[local22][];
		Static298.anIntArray367 = new int[local22];
		Static363.aByteArrayArray22 = null;
		Static118.aByteArrayArray3 = new byte[local22][];
		Static177.aByteArrayArray5 = new byte[local22][];
		Static267.anIntArray329 = new int[local22];
		Static68.anIntArray316 = new int[local22];
		Static376.anIntArray458 = null;
		Static421.aByteArrayArray19 = new byte[local22][];
		local22 = 0;
		for (@Pc(312) Class2_Sub35 local312 = (Class2_Sub35) Static391.aClass339_34.method7699(65280); local312 != null; local312 = (Class2_Sub35) Static391.aClass339_34.method7706()) {
			local93 = local312.anInt5691 >>> -2127211805;
			local98 = local312.anInt5692 >>> 3;
			local101 = local312.anInt5686 + local93;
			if ((local101 & 0x7) == 0) {
				local101--;
			}
			local101 >>>= 0x3;
			local104 = local98 + local312.anInt5694;
			if ((local104 & 0x7) == 0) {
				local104--;
			}
			local104 >>>= 0x3;
			for (local107 = local93 >>> 3; local107 <= local101; local107++) {
				label82: for (local110 = local98 >>> 3; local110 <= local104; local110++) {
					local113 = local107 << 8 | local110;
					for (local116 = 0; local116 < local22; local116++) {
						if (local113 == Static89.anIntArray169[local116]) {
							continue label82;
						}
					}
					Static89.anIntArray169[local22] = local113;
					Static267.anIntArray329[local22] = Static93.aClass330_16.method7590("m" + local107 + "_" + local110);
					anIntArray615[local22] = Static93.aClass330_16.method7590("l" + local107 + "_" + local110);
					Static68.anIntArray316[local22] = Static93.aClass330_16.method7590("um" + local107 + "_" + local110);
					Static298.anIntArray367[local22] = Static93.aClass330_16.method7590("ul" + local107 + "_" + local110);
					local22++;
				}
			}
		}
		Static22.anIntArrayArray11 = Static322.anIntArrayArray265;
		Static322.anIntArrayArray265 = null;
		Static684.method8931(false, Static720.anInt10859 >> 4, 12, Static501.anInt7568 >> 4);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)V")
	public static void method6777() {
		@Pc(5) Class83 local5 = null;
		try {
			local5 = Static689.method8983("2");
			@Pc(25) Packet local25 = new Packet(Static319.anInt5078 * 6 + 3);
			local25.p1(1);
			local25.p2(Static319.anInt5078);
			for (@Pc(35) int local35 = 0; local35 < Static511.anIntArray614.length; local35++) {
				if (Static118.aBooleanArray4[local35]) {
					local25.p2(local35);
					local25.p4(Static511.anIntArray614[local35]);
				}
			}
			local5.method2162(local25.data, 0, local25.pos);
		} catch (@Pc(67) Exception local67) {
		}
		try {
			if (local5 != null) {
				local5.method2158();
			}
		} catch (@Pc(74) Exception local74) {
		}
		Static98.aLong71 = Static588.method7715();
		Static624.aBoolean727 = false;
	}
}
