import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class DisplayMode {

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
	public int anInt4682;

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
	public int height;

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
	public int width;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
	public int anInt4687;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIBZI)V")
	public static void setWindowMode(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static338.aLong214 = 0L;
		@Pc(12) int local12 = getWindowMode();
		if (arg1 == 3 || local12 == 3) {
			arg2 = true;
		}
		if (!Rasteriser.textureProvider.method2840()) {
			arg2 = true;
		}
		Static163.method3100(arg3, arg0, local12, arg1, arg2);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)[Lclient!oi;")
	public static DisplayMode[] getDisplayModes() {
		if (Static232.aClass169Array1 == null) {
			@Pc(15) DisplayMode[] local15 = Static110.method2265(GameShell.signlink);
			@Pc(19) DisplayMode[] local19 = new DisplayMode[local15.length];
			@Pc(21) int local21 = 0;
			@Pc(75) int local75;
			@Pc(81) DisplayMode local81;
			label63: for (@Pc(23) int local23 = 0; local23 < local15.length; local23++) {
				@Pc(29) DisplayMode local29 = local15[local23];
				if ((local29.anInt4687 <= 0 || local29.anInt4687 >= 24) && local29.width >= 800 && local29.height >= 600 && (GameShell.maxMemory >= 96 || Static77.anInt1762 != 0 || local29.width <= 1024 && local29.height <= 768)) {
					for (local75 = 0; local75 < local21; local75++) {
						local81 = local19[local75];
						if (local29.width == local81.width && local81.height == local29.height) {
							if (local29.anInt4687 > local81.anInt4687) {
								local19[local75] = local29;
							}
							continue label63;
						}
					}
					local19[local21] = local29;
					local21++;
				}
			}
			Static232.aClass169Array1 = new DisplayMode[local21];
			Static404.method4609(local19, 0, Static232.aClass169Array1, 0, local21);
			@Pc(145) int[] local145 = new int[Static232.aClass169Array1.length];
			for (local75 = 0; local75 < Static232.aClass169Array1.length; local75++) {
				local81 = Static232.aClass169Array1[local75];
				local145[local75] = local81.height * local81.width;
			}
			Static226.method3984(Static232.aClass169Array1, local145);
		}
		return Static232.aClass169Array1;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)I")
	public static int getWindowMode() {
		if (GameShell.fullScreenFrame == null) {
			return Static363.aBoolean464 ? 2 : 1;
		} else {
			return 3;
		}
	}

}
