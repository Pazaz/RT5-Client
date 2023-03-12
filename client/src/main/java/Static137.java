import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "[Lclient!jd;")
	public static Class13[] aClass13Array13;

	@OriginalMember(owner = "client!hq", name = "C", descriptor = "Lclient!r;")
	public static Class197 aClass197_33;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIILclient!ed;I)V")
	public static void method2550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub8 arg2, @OriginalArg(4) int arg3) {
		@Pc(25) long local25 = (long) (arg1 | arg3 << 28 | arg0 << 14);
		@Pc(31) Class2_Sub32 local31 = (Class2_Sub32) Static120.aClass4_49.method90(local25);
		if (local31 == null) {
			local31 = new Class2_Sub32();
			Static120.aClass4_49.method87(local31, local25);
			local31.aClass135_34.method3540(arg2);
			return;
		}
		@Pc(54) Class188 local54 = Static313.ObjTypeList.get(arg2.anInt1717);
		@Pc(57) int local57 = local54.anInt5220;
		if (local54.anInt5247 == 1) {
			local57 *= arg2.anInt1719 + 1;
		}
		for (@Pc(76) Class2_Sub8 local76 = (Class2_Sub8) local31.aClass135_34.method3551(); local76 != null; local76 = (Class2_Sub8) local31.aClass135_34.method3552()) {
			local54 = Static313.ObjTypeList.get(local76.anInt1717);
			@Pc(87) int local87 = local54.anInt5220;
			if (local54.anInt5247 == 1) {
				local87 *= local76.anInt1719 + 1;
			}
			if (local57 > local87) {
				Static97.method2100(arg2, local76);
				return;
			}
		}
		local31.aClass135_34.method3540(arg2);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZ)V")
	public static void method2552(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub2_Sub7 local8 = Static316.method5413(14, arg0);
		local8.method2312();
	}
}
