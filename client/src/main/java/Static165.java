import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ks", name = "s", descriptor = "Lclient!rr;")
	public static final Class179 aClass179_4 = new Class179();

	@OriginalMember(owner = "client!ks", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString150 = "Examine";

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZ)Lclient!co;")
	public static Class36 method3446(@OriginalArg(0) int arg0) {
		@Pc(5) Class215 local5 = Static268.aClass215_81;
		@Pc(14) Class36 local14;
		synchronized (Static268.aClass215_81) {
			local14 = (Class36) Static268.aClass215_81.method6057((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(39) byte[] local39 = Static148.aClass162_127.method4636(Static78.method1782(arg0), Static99.method2075(arg0));
		local14 = new Class36();
		local14.anInt1255 = arg0;
		if (local39 != null) {
			local14.method956(new Class1_Sub16(local39));
		}
		local14.method959();
		if (local14.anInt1231 != -1) {
			local14.method950(method3446(local14.anInt1209), method3446(local14.anInt1231));
		}
		if (local14.anInt1224 != -1) {
			local14.method946(method3446(local14.anInt1224), method3446(local14.anInt1263));
		}
		if (!Static303.aBoolean456 && local14.aBoolean76) {
			local14.aStringArray6 = Static344.aStringArray45;
			local14.aStringArray7 = Static197.aStringArray28;
			local14.aString51 = Static297.aString233;
			local14.aBoolean75 = false;
			local14.anIntArray78 = null;
			local14.anInt1210 = 0;
		}
		@Pc(114) Class215 local114 = Static268.aClass215_81;
		synchronized (Static268.aClass215_81) {
			Static268.aClass215_81.method6050(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method3447(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class1_Sub1_Sub10 local8 = Static122.method2624(2, arg0);
		local8.method2539();
		local8.aString107 = arg1;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3448(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(20) String local20 = Static301.method5274(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static186.anInt4356; local25++) {
			@Pc(33) String local33 = Static301.method5274(Static140.aStringArray21[local25]);
			if (local33 != null && local33.equals(local20)) {
				Static186.anInt4356--;
				for (@Pc(45) int local45 = local25; local45 < Static186.anInt4356; local45++) {
					Static140.aStringArray21[local45] = Static140.aStringArray21[local45 + 1];
					Static19.aStringArray5[local45] = Static19.aStringArray5[local45 + 1];
					Static189.aStringArray27[local45] = Static189.aStringArray27[local45 + 1];
					Static347.aStringArray43[local45] = Static347.aStringArray43[local45 + 1];
					Static173.aBooleanArray10[local45] = Static173.aBooleanArray10[local45 + 1];
				}
				Static305.anInt6396 = Class7_Sub5.anInt3948;
				Static150.aClass1_Sub16_Sub2_2.method5793(30);
				Static150.aClass1_Sub16_Sub2_2.method5771(Static279.method4951(arg0));
				Static150.aClass1_Sub16_Sub2_2.method5726(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIIII)I")
	public static int method3449(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(13) int local13 = arg2;
			arg2 = arg1;
			arg1 = local13;
		}
		@Pc(21) int local21 = arg5 & 0x3;
		if (local21 == 0) {
			return arg0;
		} else if (local21 == 1) {
			return 1 + 7 - arg2 - arg3;
		} else if (local21 == 2) {
			return 1 + 7 - arg0 - arg1;
		} else {
			return arg3;
		}
	}
}
