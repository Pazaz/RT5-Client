import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "[I")
	public static final int[] anIntArray231 = new int[3];

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
	public static int anInt3798 = 0;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)V")
	public static void method3774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) DelayedStateChange local8 = Static316.method5413(9, arg1);
		local8.method2311();
		local8.intArg1 = arg0;
		local8.intArg3 = arg2;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!nk;ILclient!wm;IILclient!kf;II)V")
	public static void method3776(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) RasteriserBase arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class78 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) MelType local14 = client.MelTypes.method3379(arg2);
		if (local14 == null || !local14.aBoolean304 || !local14.method4180(VarpDomain.instance)) {
			return;
		}
		@Pc(34) int local34;
		if (local14.anIntArray290 != null) {
			@Pc(32) int[] local32 = new int[local14.anIntArray290.length];
			@Pc(44) int local44;
			for (local34 = 0; local34 < local32.length / 2; local34++) {
				if (Camera.anInt5911 == 4) {
					local44 = (int) Camera.yawTarget & 0x3FFF;
				} else {
					local44 = (int) Camera.yawTarget + Static6.anInt158 & 0x3FFF;
				}
				@Pc(58) int local58 = RasteriserBase.anIntArray178[local44];
				@Pc(62) int local62 = RasteriserBase.anIntArray177[local44];
				if (Camera.anInt5911 != 4) {
					local62 = local62 * 256 / (Static97.anInt2005 + 256);
					local58 = local58 * 256 / (Static97.anInt2005 + 256);
				}
				local32[local34 * 2] = ((local14.anIntArray290[local34 * 2] * 4 + arg6) * local62 + (local14.anIntArray290[local34 * 2 + 1] * 4 + arg4) * local58 >> 15) + arg1.width / 2 + arg0;
				local32[local34 * 2 + 1] = arg7 + arg1.height / 2 - (local62 * (arg4 + local14.anIntArray290[local34 * 2 + 1] * 4) - (local14.anIntArray290[local34 * 2] * 4 + arg6) * local58 >> 15);
			}
			Static293.method5047(arg3, local32, local14.anInt4414, arg1.anIntArray282, arg1.anIntArray280);
			for (local44 = 0; local44 < local32.length / 2 - 1; local44++) {
				arg3.method2815(local32[local44 * 2], local32[local44 * 2 + 1], local32[(local44 + 1) * 2], local32[local44 * 2 + 1 + 2], local14.anInt4422, arg5, arg0, arg7);
			}
			arg3.method2815(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local14.anInt4422, arg5, arg0, arg7);
		}
		@Pc(267) Sprite local267 = null;
		if (local14.anInt4420 != -1) {
			local267 = local14.method4189(arg3, false);
			if (local267 != null) {
				Static376.method6288(arg5, arg6, arg0, arg4, local267, arg7, arg1);
			}
		}
		if (local14.aString48 == null) {
			return;
		}
		local34 = 0;
		if (local267 != null) {
			local34 = local267.method6382();
		}
		@Pc(301) BitmapFont local301 = Static200.aClass130_3;
		@Pc(303) Class239 local303 = Static52.aClass239_1;
		if (local14.anInt4418 == 1) {
			local303 = Static165.aClass239_3;
			local301 = Static276.aClass130_4;
		}
		if (local14.anInt4418 == 2) {
			local301 = Static52.aClass130_1;
			local303 = Static113.aClass239_2;
		}
		Static164.method3147(arg0, arg4, arg7, local14.anInt4431, arg6, local34, local301, local303, arg5, local14.aString48, arg1);
		return;
	}

}
