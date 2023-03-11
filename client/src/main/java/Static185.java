import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "[Lclient!rn;")
	public static final Class205[] aClass205Array1 = new Class205[29];

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIII)V")
	public static void method3398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Protocol.outboundBuffer.p4(arg2);
		Protocol.outboundBuffer.p2add(arg1);
		Protocol.outboundBuffer.p2(arg0);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BILclient!bc;I)Lclient!js;")
	public static Class2_Sub2_Sub11 method3399(@OriginalArg(1) int arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg2 << 8 | arg1.anInt538;
		@Pc(27) Class2_Sub2_Sub11 local27 = (Class2_Sub2_Sub11) Static261.aClass116_7.method3152((long) local10 << 16);
		if (local27 != null) {
			return local27;
		}
		@Pc(39) byte[] local39 = Static195.aClass197_54.method5082(Static195.aClass197_54.method5097(local10));
		if (local39 == null) {
			local10 = arg1.anInt538 | arg0 + 65536 << 8;
			local27 = (Class2_Sub2_Sub11) Static261.aClass116_7.method3152((long) local10 << 16);
			if (local27 != null) {
				return local27;
			}
			local39 = Static195.aClass197_54.method5082(Static195.aClass197_54.method5097(local10));
			if (local39 == null) {
				local10 = arg1.anInt538 | 0xFFFF00;
				local27 = (Class2_Sub2_Sub11) Static261.aClass116_7.method3152((long) local10 << 16);
				if (local27 != null) {
					return local27;
				}
				local39 = Static195.aClass197_54.method5082(Static195.aClass197_54.method5097(local10));
				if (local39 == null) {
					return null;
				} else if (local39.length <= 1) {
					return null;
				} else {
					local27 = Static214.method3745(local39);
					local27.aClass16_4 = arg1;
					Static261.aClass116_7.method3155(local27, (long) local10 << 16);
					return local27;
				}
			} else if (local39.length <= 1) {
				return null;
			} else {
				local27 = Static214.method3745(local39);
				local27.aClass16_4 = arg1;
				Static261.aClass116_7.method3155(local27, (long) local10 << 16);
				return local27;
			}
		} else if (local39.length <= 1) {
			return null;
		} else {
			local27 = Static214.method3745(local39);
			local27.aClass16_4 = arg1;
			Static261.aClass116_7.method3155(local27, (long) local10 << 16);
			return local27;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIBII)V")
	public static void method3400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class161 local8 = Static207.method3705(arg2, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray15 != null) {
			@Pc(18) Class2_Sub13 local18 = new Class2_Sub13();
			local18.aClass161_3 = local8;
			local18.anObjectArray4 = local8.anObjectArray15;
			Static198.method3591(local18);
		}
		Static196.anInt3317 = local8.anInt4300;
		Static107.anInt2219 = arg4;
		Static41.anInt1044 = arg0;
		Static214.anInt3792 = arg3;
		Static330.aBoolean419 = true;
		Static337.anInt6317 = arg2;
		Static115.anInt3837 = arg1;
		Static172.anInt3298 = arg5;
		Static200.method3645(local8);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIII)V")
	public static void method3401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static25.method861(Static365.anInt6832, arg2, Static161.anInt2954);
		@Pc(17) int local17 = Static25.method861(Static365.anInt6832, arg0, Static161.anInt2954);
		@Pc(23) int local23 = Static25.method861(Static28.anInt675, arg4, Static82.anInt1837);
		@Pc(29) int local29 = Static25.method861(Static28.anInt675, arg3, Static82.anInt1837);
		@Pc(37) int local37 = Static25.method861(Static365.anInt6832, arg1 + arg2, Static161.anInt2954);
		@Pc(46) int local46 = Static25.method861(Static365.anInt6832, arg0 - arg1, Static161.anInt2954);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static101.method2163(local29, Static357.anIntArrayArray58[local48], arg5, local23);
		}
		for (@Pc(64) int local64 = local17; local64 > local46; local64--) {
			Static101.method2163(local29, Static357.anIntArrayArray58[local64], arg5, local23);
		}
		@Pc(89) int local89 = Static25.method861(Static28.anInt675, arg4 + arg1, Static82.anInt1837);
		@Pc(97) int local97 = Static25.method861(Static28.anInt675, arg3 - arg1, Static82.anInt1837);
		for (@Pc(107) int local107 = local37; local107 <= local46; local107++) {
			@Pc(113) int[] local113 = Static357.anIntArrayArray58[local107];
			Static101.method2163(local89, local113, arg5, local23);
			Static101.method2163(local29, local113, arg5, local97);
		}
	}
}
