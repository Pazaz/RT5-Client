import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!ti", name = "T", descriptor = "Z")
	public static boolean aBoolean456;

	@OriginalMember(owner = "client!ti", name = "V", descriptor = "I")
	public static int anInt6342;

	@OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
	public static int anInt6340 = 0;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method5308(@OriginalArg(1) String arg0) {
		for (@Pc(13) int local13 = 0; local13 < Static17.aStringArray4.length; local13++) {
			if (Static17.aStringArray4[local13].equalsIgnoreCase(arg0)) {
				return local13;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIII)I")
	public static int method5309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static118.aClass77Array1 == null) {
			return 0;
		} else if (arg2 < 3) {
			@Pc(21) int local21 = arg0 >> 7;
			@Pc(25) int local25 = arg4 >> 7;
			if (arg3 < 0 || arg1 < 0 || arg3 > Static25.anInt850 - 1 || arg1 > Static219.anInt4987 - 1) {
				return 0;
			} else if (local21 >= 1 && local25 >= 1 && Static25.anInt850 - 1 >= local21 && local25 <= Static219.anInt4987 - 1) {
				@Pc(89) boolean local89 = (Static62.aByteArrayArrayArray3[1][arg0 >> 7][arg4 >> 7] & 0x2) != 0;
				@Pc(117) boolean local117;
				@Pc(133) boolean local133;
				if ((arg0 & 0x7F) == 0) {
					local117 = (Static62.aByteArrayArrayArray3[1][local21 - 1][arg4 >> 7] & 0x2) != 0;
					local133 = (Static62.aByteArrayArrayArray3[1][local21][arg4 >> 7] & 0x2) != 0;
					if (local133 != local117) {
						local89 = (Static62.aByteArrayArrayArray3[1][arg3][arg1] & 0x2) != 0;
					}
				}
				if ((arg4 & 0x7F) == 0) {
					local117 = (Static62.aByteArrayArrayArray3[1][arg0 >> 7][local25 - 1] & 0x2) != 0;
					local133 = (Static62.aByteArrayArrayArray3[1][arg0 >> 7][local25] & 0x2) != 0;
					if (local133 != local117) {
						local89 = (Static62.aByteArrayArrayArray3[1][arg3][arg1] & 0x2) != 0;
					}
				}
				if (local89) {
					arg2++;
				}
				return Static118.aClass77Array1[arg2].method3994(arg0, arg4);
			} else {
				return 0;
			}
		} else {
			return Static118.aClass77Array1[arg2].method3994(arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI)V")
	public static void method5310(@OriginalArg(0) boolean arg0) {
		if (arg0 != aBoolean456) {
			aBoolean456 = arg0;
			Static279.method4949();
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!oq;IIIII)V")
	public static void method5311(@OriginalArg(0) Class144 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5348 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass1_Sub9_Sub1Array3[local4] != null) {
				arg0.anInt5348++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt5348; local22++) {
			@Pc(31) int local31 = Static96.anIntArrayArrayArray3[arg1][arg2][arg3];
			@Pc(40) Class1_Sub9_Sub1 local40;
			while (local31 != 0) {
				local40 = Static68.aClass1_Sub9_Sub1Array1[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass1_Sub9_Sub1Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static96.anIntArrayArrayArray3[arg1][arg4][arg5];
			while (local31 != 0) {
				local40 = Static68.aClass1_Sub9_Sub1Array1[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass1_Sub9_Sub1Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(85) int local85 = local22; local85 < arg0.anInt5348 - 1; local85++) {
				arg0.aClass1_Sub9_Sub1Array3[local85] = arg0.aClass1_Sub9_Sub1Array3[local85 + 1];
			}
			arg0.anInt5348--;
		}
	}
}
