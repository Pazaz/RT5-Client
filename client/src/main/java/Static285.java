import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
	public static final int anInt5368 = 52;

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
	public static int anInt5370 = 0;

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
	public static int anInt5374 = 0;

	@OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
	public static int anInt5375 = 0;

	@OriginalMember(owner = "client!qj", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray44 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLclient!nk;)V")
	public static void method4886(@OriginalArg(1) Class161 arg0) {
		if (arg0.anInt4273 != Static76.anInt1738) {
			return;
		}
		if (PlayerList.self.username == null) {
			arg0.modelId = 0;
			arg0.anInt4236 = 0;
			return;
		}
		arg0.modelXAngle = 150;
		arg0.modelYAngle = (int) (Math.sin((double) client.cycle / 40.0D) * 256.0D) & 0x7FF;
		arg0.modelId = PlayerList.selfId;
		arg0.modelType = 5;
		arg0.anInt4236 = Static276.method4651(PlayerList.self.username);
		arg0.anInt4316 = PlayerList.self.anInt4593;
		arg0.anInt4247 = PlayerList.self.anInt4626;
		arg0.anInt4283 = 0;
		arg0.modelSeqId = PlayerList.self.anInt4585;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
	public static void method4887() {
		for (@Pc(3) int local3 = 0; local3 < Static359.aByteArrayArrayArray16.length; local3++) {
			for (@Pc(12) int local12 = 0; local12 < Static359.aByteArrayArrayArray16[0].length; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static359.aByteArrayArrayArray16[0][0].length; local16++) {
					Static359.aByteArrayArrayArray16[local3][local12][local16] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)V")
	public static void method4893(@OriginalArg(1) int arg0) {
		@Pc(1) Class2_Sub2_Sub4 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class6 local8 = Scene.aClass6Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Scene.anInt3773; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Scene.anInt1684; local15++) {
						local1 = local8.method5730(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Scene.scale;
							@Pc(32) int local32 = local12 << Scene.scale;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class6 local41 = Scene.aClass6Array3[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method5719(local15, local12) - local41.method5719(local15, local12);
									@Pc(67) int local67 = local8.method5719(local15 + 1, local12) - local41.method5719(local15 + 1, local12);
									@Pc(85) int local85 = local8.method5719(local15 + 1, local12 + 1) - local41.method5719(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method5719(local15, local12 + 1) - local41.method5719(local15, local12 + 1);
									local41.method5725(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIII)V")
	public static void method4894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class67 local7 = Scene.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class11_Sub3 local13 = local7.aClass11_Sub3_2;
		@Pc(16) Class11_Sub3 local16 = local7.aClass11_Sub3_3;
		if (local13 != null) {
			local13.anInt6347 = local13.anInt6347 * arg3 / 16;
			local13.anInt6350 = local13.anInt6350 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt6347 = local16.anInt6347 * arg3 / 16;
			local16.anInt6350 = local16.anInt6350 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILclient!r;)V")
	public static void method4895(@OriginalArg(1) Js5 arg0) {
		Static289.aClass197_73 = arg0;
	}
}
