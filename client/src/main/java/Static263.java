import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!ida", name = "e", descriptor = "[I")
	public static final int[] anIntArray327 = new int[2];

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZIIILjava/lang/String;)V")
	public static void method3855(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		Static311.method4538(false, arg0, arg1, arg2, arg3, (String) null);
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lclient!rka;I)V")
	public static void method3856(@OriginalArg(0) PacketBit arg0) {
		arg0.bits();
		@Pc(10) int local10 = 0;
		@Pc(20) int local20;
		@Pc(52) int local52;
		for (@Pc(12) int local12 = 0; local12 < Static338.anInt5564; local12++) {
			local20 = Static210.anIntArray280[local12];
			if ((Static402.aByteArray68[local20] & 0x1) == 0) {
				if (local10 > 0) {
					Static402.aByteArray68[local20] = (byte) (Static402.aByteArray68[local20] | 0x2);
					local10--;
				} else {
					local52 = arg0.gBit(1);
					if (local52 == 0) {
						local10 = Static59.method5329(arg0);
						Static402.aByteArray68[local20] = (byte) (Static402.aByteArray68[local20] | 0x2);
					} else {
						Static610.method8217(local20, arg0);
					}
				}
			}
		}
		arg0.bytes();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.bits();
		@Pc(144) int local144;
		for (local20 = 0; local20 < Static338.anInt5564; local20++) {
			local52 = Static210.anIntArray280[local20];
			if ((Static402.aByteArray68[local52] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static402.aByteArray68[local52] = (byte) (Static402.aByteArray68[local52] | 0x2);
				} else {
					local144 = arg0.gBit(1);
					if (local144 == 0) {
						local10 = Static59.method5329(arg0);
						Static402.aByteArray68[local52] = (byte) (Static402.aByteArray68[local52] | 0x2);
					} else {
						Static610.method8217(local52, arg0);
					}
				}
			}
		}
		arg0.bytes();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.bits();
		@Pc(243) int local243;
		for (local52 = 0; local52 < Static51.anInt1053; local52++) {
			local144 = Static409.anIntArray494[local52];
			if ((Static402.aByteArray68[local144] & 0x1) != 0) {
				if (local10 > 0) {
					Static402.aByteArray68[local144] = (byte) (Static402.aByteArray68[local144] | 0x2);
					local10--;
				} else {
					local243 = arg0.gBit(1);
					if (local243 == 0) {
						local10 = Static59.method5329(arg0);
						Static402.aByteArray68[local144] = (byte) (Static402.aByteArray68[local144] | 0x2);
					} else if (Static383.method5379(local144, arg0)) {
						Static402.aByteArray68[local144] = (byte) (Static402.aByteArray68[local144] | 0x2);
					}
				}
			}
		}
		arg0.bytes();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.bits();
		for (local144 = 0; local144 < Static51.anInt1053; local144++) {
			local243 = Static409.anIntArray494[local144];
			if ((Static402.aByteArray68[local243] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static402.aByteArray68[local243] = (byte) (Static402.aByteArray68[local243] | 0x2);
				} else {
					@Pc(351) int local351 = arg0.gBit(1);
					if (local351 == 0) {
						local10 = Static59.method5329(arg0);
						Static402.aByteArray68[local243] = (byte) (Static402.aByteArray68[local243] | 0x2);
					} else if (Static383.method5379(local243, arg0)) {
						Static402.aByteArray68[local243] = (byte) (Static402.aByteArray68[local243] | 0x2);
					}
				}
			}
		}
		arg0.bytes();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static51.anInt1053 = 0;
		Static338.anInt5564 = 0;
		for (local243 = 1; local243 < 2048; local243++) {
			Static402.aByteArray68[local243] = (byte) (Static402.aByteArray68[local243] >> 1);
			@Pc(433) Class8_Sub2_Sub1_Sub2_Sub1 local433 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local243];
			if (local433 == null) {
				Static409.anIntArray494[Static51.anInt1053++] = local243;
			} else {
				Static210.anIntArray280[Static338.anInt5564++] = local243;
			}
		}
	}
}
