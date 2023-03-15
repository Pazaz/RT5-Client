import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "Lclient!r;")
	public static Js5 aClass197_25;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
	public static final int anInt2254 = 12;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "Z")
	public static boolean aBoolean167 = false;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(Z)V")
	public static void method2276() {
		if (Static59.anIntArray107 != null) {
			return;
		}
		Static59.anIntArray107 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(22) int local22 = 0; local22 < 65536; local22++) {
			@Pc(41) double local41 = (double) (local22 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(52) double local52 = (double) (local22 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(59) double local59 = (double) (local22 & 0x7F) / 128.0D;
			@Pc(61) double local61 = local59;
			@Pc(63) double local63 = local59;
			@Pc(65) double local65 = local59;
			if (local52 != 0.0D) {
				@Pc(79) double local79;
				if (local59 < 0.5D) {
					local79 = local59 * (local52 + 1.0D);
				} else {
					local79 = local52 + local59 - local59 * local52;
				}
				@Pc(96) double local96 = local59 * 2.0D - local79;
				@Pc(100) double local100 = local41 + 0.3333333333333333D;
				if (local100 > 1.0D) {
					local100--;
				}
				@Pc(114) double local114 = local41 - 0.3333333333333333D;
				if (local41 * 6.0D < 1.0D) {
					local63 = (local79 - local96) * 6.0D * local41 + local96;
				} else if (local41 * 2.0D < 1.0D) {
					local63 = local79;
				} else if (local41 * 3.0D < 2.0D) {
					local63 = local96 + (local79 - local96) * 6.0D * (0.6666666666666666D - local41);
				} else {
					local63 = local96;
				}
				if (local114 < 0.0D) {
					local114++;
				}
				if (local100 * 6.0D < 1.0D) {
					local61 = local96 + (local79 - local96) * 6.0D * local100;
				} else if (local100 * 2.0D < 1.0D) {
					local61 = local79;
				} else if (local100 * 3.0D < 2.0D) {
					local61 = local96 + (0.6666666666666666D - local100) * 6.0D * (local79 - local96);
				} else {
					local61 = local96;
				}
				if (local114 * 6.0D < 1.0D) {
					local65 = local114 * (local79 - local96) * 6.0D + local96;
				} else if (local114 * 2.0D < 1.0D) {
					local65 = local79;
				} else if (local114 * 3.0D < 2.0D) {
					local65 = local96 + (local79 - local96) * 6.0D * (0.6666666666666666D - local114);
				} else {
					local65 = local96;
				}
			}
			local61 = Math.pow(local61, local20);
			local63 = Math.pow(local63, local20);
			local65 = Math.pow(local65, local20);
			@Pc(294) int local294 = (int) (local61 * 256.0D);
			@Pc(299) int local299 = (int) (local63 * 256.0D);
			@Pc(304) int local304 = (int) (local65 * 256.0D);
			@Pc(314) int local314 = local304 + (local299 << 8) + (local294 << 16);
			Static59.anIntArray107[local22] = local314;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIILjava/lang/String;IIII)V")
	public static void method2277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class12_Sub3 local7 = new Class12_Sub3();
		local7.anInt3201 = arg0 + client.cycle;
		local7.anInt3204 = arg1;
		local7.aString26 = arg3;
		local7.anInt3206 = arg2;
		local7.anInt3208 = arg5;
		local7.anInt3207 = arg4;
		local7.anInt3200 = arg6;
		Static284.aClass36_7.method1418(local7);
	}
}
