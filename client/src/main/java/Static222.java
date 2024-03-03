import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "I")
	public static int anInt3949;

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
	public static int anInt3944 = 0;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IB)Z")
	public static boolean load(@OriginalArg(0) int arg0) {
		if (Static128.aBooleanArray21[arg0]) {
			return true;
		} else if (Static283.aClass197_68.isGroupReady(arg0)) {
			@Pc(23) int local23 = Static283.aClass197_68.getGroupCapacity(arg0);
			if (local23 == 0) {
				Static128.aBooleanArray21[arg0] = true;
				return true;
			}
			if (Static26.components[arg0] == null) {
				Static26.components[arg0] = new Component[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static26.components[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static283.aClass197_68.fetchFile(local45, arg0);
					if (local59 != null) {
						@Pc(71) Component local71 = Static26.components[arg0][local45] = new Component();
						local71.id = local45 + (arg0 << 16);
						if (local59[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local71.method4106(new Packet(local59));
					}
				}
			}
			Static128.aBooleanArray21[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
	public static void method3917() {
		@Pc(9) int local9 = Static311.anInt5810 * 128 + 64;
		@Pc(15) int local15 = Static19.anInt535 * 128 + 64;
		@Pc(23) int local23 = Scene.getTileHeight(local9, local15, Static355.anInt6585) - Static180.anInt3404;
		if (Static359.anInt6702 >= 100) {
			Static211.anInt3777 = Static19.anInt535 * 128 + 64;
			Static136.anInt6778 = Static311.anInt5810 * 128 + 64;
			Static102.anInt3592 = Scene.getTileHeight(Static136.anInt6778, Static211.anInt3777, Static355.anInt6585) - Static180.anInt3404;
		} else {
			if (Static136.anInt6778 < local9) {
				Static136.anInt6778 += Static348.anInt6446 + (local9 - Static136.anInt6778) * Static359.anInt6702 / 1000;
				if (local9 < Static136.anInt6778) {
					Static136.anInt6778 = local9;
				}
			}
			if (local23 > Static102.anInt3592) {
				Static102.anInt3592 += (local23 - Static102.anInt3592) * Static359.anInt6702 / 1000 + Static348.anInt6446;
				if (Static102.anInt3592 > local23) {
					Static102.anInt3592 = local23;
				}
			}
			if (local9 < Static136.anInt6778) {
				Static136.anInt6778 -= Static359.anInt6702 * (Static136.anInt6778 - local9) / 1000 + Static348.anInt6446;
				if (local9 > Static136.anInt6778) {
					Static136.anInt6778 = local9;
				}
			}
			if (Static211.anInt3777 < local15) {
				Static211.anInt3777 += Static348.anInt6446 + Static359.anInt6702 * (local15 - Static211.anInt3777) / 1000;
				if (Static211.anInt3777 > local15) {
					Static211.anInt3777 = local15;
				}
			}
			if (local23 < Static102.anInt3592) {
				Static102.anInt3592 -= Static348.anInt6446 + (Static102.anInt3592 - local23) * Static359.anInt6702 / 1000;
				if (local23 > Static102.anInt3592) {
					Static102.anInt3592 = local23;
				}
			}
			if (local15 < Static211.anInt3777) {
				Static211.anInt3777 -= Static348.anInt6446 + (Static211.anInt3777 - local15) * Static359.anInt6702 / 1000;
				if (Static211.anInt3777 < local15) {
					Static211.anInt3777 = local15;
				}
			}
		}
		local9 = Static254.anInt4698 * 128 + 64;
		local15 = Static123.anInt2420 * 128 + 64;
		local23 = Scene.getTileHeight(local9, local15, Static355.anInt6585) - Static57.anInt1464;
		@Pc(231) int local231 = local9 - Static136.anInt6778;
		@Pc(235) int local235 = local23 - Static102.anInt3592;
		@Pc(239) int local239 = local15 - Static211.anInt3777;
		@Pc(251) int local251 = (int) Math.sqrt((double) (local231 * local231 + local239 * local239));
		@Pc(262) int local262 = (int) (Math.atan2((double) local235, (double) local251) * 2607.5945876176133D) & 0x3FFF;
		@Pc(273) int local273 = (int) (Math.atan2((double) local231, (double) local239) * -2607.5945876176133D) & 0x3FFF;
		if (local262 < 1024) {
			local262 = 1024;
		}
		if (local262 > 3072) {
			local262 = 3072;
		}
		if (local262 > Static265.anInt4857) {
			Static265.anInt4857 += Static236.anInt4309 + Static33.anInt4463 * (local262 - Static265.anInt4857 >> 3) / 1000 << 3;
			if (local262 < Static265.anInt4857) {
				Static265.anInt4857 = local262;
			}
		}
		if (local262 < Static265.anInt4857) {
			Static265.anInt4857 -= Static236.anInt4309 + (Static265.anInt4857 - local262 >> 3) * Static33.anInt4463 / 1000 << 3;
			if (Static265.anInt4857 < local262) {
				Static265.anInt4857 = local262;
			}
		}
		@Pc(347) int local347 = local273 - Static4.anInt87;
		if (local347 > 8192) {
			local347 -= 16384;
		}
		if (local347 < -8192) {
			local347 += 16384;
		}
		local347 >>= 0x3;
		if (local347 > 0) {
			Static4.anInt87 += Static33.anInt4463 * local347 / 1000 + Static236.anInt4309 << 3;
			Static4.anInt87 &= 0x3FFF;
		}
		if (local347 < 0) {
			Static4.anInt87 -= Static236.anInt4309 + -local347 * Static33.anInt4463 / 1000 << 3;
			Static4.anInt87 &= 0x3FFF;
		}
		@Pc(410) int local410 = local273 - Static4.anInt87;
		if (local410 > 8192) {
			local410 -= 16384;
		}
		if (local410 < -8192) {
			local410 += 16384;
		}
		if (local410 < 0 && local347 > 0 || local410 > 0 && local347 < 0) {
			Static4.anInt87 = local273;
		}
		Static342.anInt5657 = 0;
	}
}
