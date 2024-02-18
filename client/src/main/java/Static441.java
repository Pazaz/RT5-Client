import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "I")
	public static int anInt6689;

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "[Lclient!st;")
	public static Class23[] aClass23Array10;

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "I")
	public static int anInt6691;

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_168 = new Class225(20, -1);

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(II[I[Ljava/lang/Object;Z)V")
	public static void method5966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Object[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(16) int local16 = (arg1 + arg0) / 2;
		@Pc(18) int local18 = arg1;
		@Pc(22) int local22 = arg2[local16];
		arg2[local16] = arg2[arg0];
		arg2[arg0] = local22;
		@Pc(36) Object local36 = arg3[local16];
		arg3[local16] = arg3[arg0];
		arg3[arg0] = local36;
		@Pc(56) int local56 = ~local22 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(58) int local58 = arg1; local58 < arg0; local58++) {
			if (local22 + (local58 & local56) > arg2[local58]) {
				@Pc(72) int local72 = arg2[local58];
				arg2[local58] = arg2[local18];
				arg2[local18] = local72;
				@Pc(86) Object local86 = arg3[local58];
				arg3[local58] = arg3[local18];
				arg3[local18++] = local86;
			}
		}
		arg2[arg0] = arg2[local18];
		arg2[local18] = local22;
		arg3[arg0] = arg3[local18];
		arg3[local18] = local36;
		method5966(local18 - 1, arg1, arg2, arg3);
		method5966(arg0, local18 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILclient!cg;)V")
	public static void method5967(@OriginalArg(1) Class8_Sub2_Sub1_Sub2 arg0) {
		@Pc(9) int local9 = arg0.anInt10759 - Static333.anInt5455;
		@Pc(20) int local20 = arg0.anInt10750 * 512 + arg0.method9302((byte) 99) * 256;
		@Pc(32) int local32 = arg0.anInt10753 * 512 + arg0.method9302((byte) 58) * 256;
		arg0.anInt10694 += (local32 - arg0.anInt10694) / local9;
		arg0.anInt10690 += (local20 - arg0.anInt10690) / local9;
		arg0.anInt10763 = 0;
		if (arg0.anInt10754 == 0) {
			arg0.method9305(8192);
		}
		if (arg0.anInt10754 == 1) {
			arg0.method9305(12288);
		}
		if (arg0.anInt10754 == 2) {
			arg0.method9305(0);
		}
		if (arg0.anInt10754 == 3) {
			arg0.method9305(4096);
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)Z")
	public static boolean method5968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && arg1 < Static280.aByteArrayArrayArray3[1].length && arg0 < Static280.aByteArrayArrayArray3[1][arg1].length) {
			return (Static280.aByteArrayArrayArray3[1][arg1][arg0] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
