import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ej", name = "E", descriptor = "Lclient!rc;")
	public static Class42 aClass42_4;

	@OriginalMember(owner = "client!ej", name = "H", descriptor = "Lclient!r;")
	public static Js5 aClass197_19;

	@OriginalMember(owner = "client!ej", name = "N", descriptor = "Z")
	public static boolean aBoolean131 = true;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "()V")
	public static void method1869() {
		Scene.anInt1622 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Scene.levelOccluderCount; local3++) {
			@Pc(8) Occluder local8 = Scene.levelOccluders[local3];
			@Pc(12) int local12;
			if (Static182.anIntArray205 != null) {
				for (local12 = 0; local12 < Static182.anIntArray205.length; local12++) {
					if (Static182.anIntArray205[local12] != -1000000 && (local8.anInt1697 <= Static182.anIntArray205[local12] || local8.anInt1703 <= Static182.anIntArray205[local12]) && (local8.anInt1699 <= Static375.anIntArray483[local12] || local8.anInt1695 <= Static375.anIntArray483[local12]) && (local8.anInt1699 >= Static160.anIntArray185[local12] || local8.anInt1695 >= Static160.anIntArray185[local12]) && (local8.anInt1686 <= Static96.anIntArray126[local12] || local8.anInt1692 <= Static96.anIntArray126[local12]) && (local8.anInt1686 >= Static356.anIntArray462[local12] || local8.anInt1692 >= Static356.anIntArray462[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt1689 == 1) {
				local12 = local8.minTileX + Scene.anInt3788 - Static248.anInt4650;
				if (local12 >= 0 && local12 <= Scene.anInt3788 + Scene.anInt3788) {
					local110 = local8.minTileZ + Scene.anInt3788 - Static211.anInt3780;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.maxTileZ + Scene.anInt3788 - Static211.anInt3780;
					if (local121 > Scene.anInt3788 + Scene.anInt3788) {
						local121 = Scene.anInt3788 + Scene.anInt3788;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Scene.aBooleanArrayArray1[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static353.anInt6532 - local8.anInt1699;
						if (local153 > Static256.anInt4744) {
							local8.anInt1690 = 1;
						} else {
							if (local153 >= -Static256.anInt4744) {
								continue;
							}
							local8.anInt1690 = 2;
							local153 = -local153;
						}
						local8.anInt1701 = (local8.anInt1686 - Static359.anInt6697 << 8) / local153;
						local8.anInt1685 = (local8.anInt1692 - Static359.anInt6697 << 8) / local153;
						local8.anInt1698 = (local8.anInt1697 - Static117.anInt2375 << 8) / local153;
						local8.anInt1702 = (local8.anInt1703 - Static117.anInt2375 << 8) / local153;
						Scene.aClass58Array2[Scene.anInt1622++] = local8;
					}
				}
			} else if (local8.anInt1689 == 2) {
				local12 = local8.minTileZ + Scene.anInt3788 - Static211.anInt3780;
				if (local12 >= 0 && local12 <= Scene.anInt3788 + Scene.anInt3788) {
					local110 = local8.minTileX + Scene.anInt3788 - Static248.anInt4650;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.maxTileX + Scene.anInt3788 - Static248.anInt4650;
					if (local121 > Scene.anInt3788 + Scene.anInt3788) {
						local121 = Scene.anInt3788 + Scene.anInt3788;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Scene.aBooleanArrayArray1[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static359.anInt6697 - local8.anInt1686;
						if (local153 > Static256.anInt4744) {
							local8.anInt1690 = 3;
						} else {
							if (local153 >= -Static256.anInt4744) {
								continue;
							}
							local8.anInt1690 = 4;
							local153 = -local153;
						}
						local8.anInt1693 = (local8.anInt1699 - Static353.anInt6532 << 8) / local153;
						local8.anInt1704 = (local8.anInt1695 - Static353.anInt6532 << 8) / local153;
						local8.anInt1698 = (local8.anInt1697 - Static117.anInt2375 << 8) / local153;
						local8.anInt1702 = (local8.anInt1703 - Static117.anInt2375 << 8) / local153;
						Scene.aClass58Array2[Scene.anInt1622++] = local8;
					}
				}
			} else if (local8.anInt1689 == 4) {
				local12 = local8.anInt1697 - Static117.anInt2375;
				if (local12 > Static256.anInt4720) {
					local110 = local8.minTileZ + Scene.anInt3788 - Static211.anInt3780;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.maxTileZ + Scene.anInt3788 - Static211.anInt3780;
					if (local121 > Scene.anInt3788 + Scene.anInt3788) {
						local121 = Scene.anInt3788 + Scene.anInt3788;
					}
					if (local110 <= local121) {
						@Pc(405) int local405 = local8.minTileX + Scene.anInt3788 - Static248.anInt4650;
						if (local405 < 0) {
							local405 = 0;
						}
						local153 = local8.maxTileX + Scene.anInt3788 - Static248.anInt4650;
						if (local153 > Scene.anInt3788 + Scene.anInt3788) {
							local153 = Scene.anInt3788 + Scene.anInt3788;
						}
						@Pc(427) boolean local427 = false;
						label159: for (@Pc(429) int local429 = local405; local429 <= local153; local429++) {
							for (@Pc(432) int local432 = local110; local432 <= local121; local432++) {
								if (Scene.aBooleanArrayArray1[local429][local432]) {
									local427 = true;
									break label159;
								}
							}
						}
						if (local427) {
							local8.anInt1690 = 5;
							local8.anInt1693 = (local8.anInt1699 - Static353.anInt6532 << 8) / local12;
							local8.anInt1704 = (local8.anInt1695 - Static353.anInt6532 << 8) / local12;
							local8.anInt1701 = (local8.anInt1686 - Static359.anInt6697 << 8) / local12;
							local8.anInt1685 = (local8.anInt1692 - Static359.anInt6697 << 8) / local12;
							Scene.aClass58Array2[Scene.anInt1622++] = local8;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIBIII)V")
	public static void method1871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < 1 || arg7 < 1 || Static373.anInt7033 - 2 < arg1 || Static242.anInt4449 - 2 < arg7) {
			return;
		}
		@Pc(30) int local30 = arg0;
		if (arg0 < 3 && Static325.method5545(arg7, arg1)) {
			local30 = arg0 + 1;
		}
		if (!client.preferences.method4495(Static77.anInt1762) && !Static142.method2661(arg7, Static44.anInt1115, local30, arg1)) {
			return;
		}
		if (Scene.aClass67ArrayArrayArray3 == null) {
			return;
		}
		Static190.aClass29_Sub1_63.method1108(arg0, arg1, Static171.aClass46Array1[arg0], arg4, arg7, Rasteriser.textureProvider);
		if (arg2 < 0) {
			return;
		}
		@Pc(76) boolean local76 = client.preferences.showGroundDecorations;
		client.preferences.showGroundDecorations = true;
		Static190.aClass29_Sub1_63.method1105(arg3, arg1, arg7, arg2, local30, arg0, Rasteriser.textureProvider, Static171.aClass46Array1[arg0], arg6, arg5);
		client.preferences.showGroundDecorations = local76;
		return;
	}
}
