import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class InterfaceList {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!r;BLclient!r;Lclient!r;Lclient!r;)V")
	public static void init(@OriginalArg(0) Js5 arg0, @OriginalArg(2) Js5 arg1, @OriginalArg(3) Js5 arg2, @OriginalArg(4) Js5 arg3) {
		Static79.aClass197_19 = arg3;
		Static283.aClass197_68 = arg2;
		Static142.aClass197_37 = arg1;
		Static391.aClass197_95 = arg0;
		Static26.aClass161ArrayArray1 = new Class161[Static283.aClass197_68.capacity()][];
		Static128.aBooleanArray21 = new boolean[Static283.aClass197_68.capacity()];
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(BI)Lclient!nk;")
	public static Class161 getComponent(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 >> 16;
		@Pc(19) int local19 = arg0 & 0xFFFF;
		if (Static26.aClass161ArrayArray1[local15] == null || Static26.aClass161ArrayArray1[local15][local19] == null) {
			@Pc(33) boolean local33 = Static222.method3916(local15);
			if (!local33) {
				return null;
			}
		}
		return Static26.aClass161ArrayArray1[local15][local19];
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!nk;B)V")
	public static void redraw(@OriginalArg(0) Class161 arg0) {
		if (Static132.anInt2468 == arg0.anInt4268) {
			Static357.aBooleanArray59[arg0.anInt4257] = true;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!nk;B)V")
	public static void update(@OriginalArg(0) Class161 arg0) {
		@Pc(7) Class161 local7 = Static7.method6465(arg0);
		@Pc(13) int local13;
		@Pc(11) int local11;
		if (local7 == null) {
			local11 = GameShell.canvasHeight;
			local13 = GameShell.canvasWidth;
		} else {
			local11 = local7.height;
			local13 = local7.width;
		}
		Static371.method6256(local11, local13, false, arg0);
		Static287.method4939(arg0, local13, local11);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIB)Lclient!nk;")
	public static Class161 method3705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class161 local7 = getComponent(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.activeComponents == null || arg1 >= local7.activeComponents.length) {
			return null;
		} else {
			return local7.activeComponents[arg1];
		}
	}

}
