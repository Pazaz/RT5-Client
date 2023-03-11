import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!hr", name = "S", descriptor = "Lclient!jd;")
	public static Class13 aClass13_8;

	@OriginalMember(owner = "client!hr", name = "Y", descriptor = "Lclient!bc;")
	public static final Class16 aClass16_3 = new Class16("", 10);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BIII)V")
	public static void method2578(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = arg1 * client.preferences.anInt4889 >> 8;
		if (arg2 == -1 && !Static393.aBoolean486) {
			Static368.method6192();
		} else if (arg2 != -1 && (Static171.anInt3268 != arg2 || !Static64.method1704()) && local6 != 0 && !Static393.aBoolean486) {
			Static180.method3367(arg2, arg0, local6, client.jsArchive6);
		}
		Static171.anInt3268 = arg2;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(IIB)I")
	public static int method2579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(49) int local49 = Static309.method5277(arg0 - 1, arg1 + -1) + Static309.method5277(arg0 - 1, arg1 + 1) + Static309.method5277(arg0 + 1, arg1 + -1) + Static309.method5277(arg0 + 1, arg1 + 1);
		@Pc(78) int local78 = Static309.method5277(arg0, arg1 - 1) + Static309.method5277(arg0, arg1 + 1) + Static309.method5277(arg0 - 1, arg1) + Static309.method5277(arg0 + 1, arg1);
		@Pc(83) int local83 = Static309.method5277(arg0, arg1);
		return local83 / 4 + local49 / 16 + local78 / 8;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)V")
	public static void method2580(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class2 local16 = Static327.aClass4_127.method80(); local16 != null; local16 = Static327.aClass4_127.method79()) {
			if ((long) arg0 == (local16.aLong232 >> 48 & 0xFFFFL)) {
				local16.method6468();
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)Lclient!mn;")
	public static Class2_Sub2_Sub12 method2581(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub12 local10 = (Class2_Sub2_Sub12) Static257.aClass116_5.method3152((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25;
		if (arg0 >= 32768) {
			local25 = Static43.aClass197_7.method5089(arg0 & 0x7FFF, 0);
		} else {
			local25 = Static367.aClass197_92.method5089(arg0, 0);
		}
		local10 = new Class2_Sub2_Sub12();
		if (local25 != null) {
			local10.method3797(new Buffer(local25));
		}
		if (arg0 >= 32768) {
			local10.method3793();
		}
		Static257.aClass116_5.method3155(local10, (long) arg0);
		return local10;
	}
}
