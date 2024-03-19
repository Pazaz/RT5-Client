import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "Lclient!hp;")
	public static Class87 aClass87_1;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "Lclient!qj;")
	public static Class162 aClass162_111;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "Z")
	public static boolean aBoolean203 = false;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B[I[I[ILclient!ai;)V")
	public static void method2639(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class7_Sub1_Sub1_Sub1 arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) int local18 = arg0[local12];
			@Pc(22) int local22 = arg1[local12];
			@Pc(26) int local26 = arg2[local12];
			@Pc(28) int local28 = 0;
			while (local22 != 0 && local28 < arg3.aClass147Array3.length) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg3.aClass147Array3[local28] = null;
					} else {
						@Pc(45) Class165 local45 = Static231.method4385(local18);
						@Pc(48) int local48 = local45.anInt5575;
						@Pc(53) Class147 local53 = arg3.aClass147Array3[local28];
						if (local53 != null) {
							if (local18 == local53.anInt5076) {
								if (local48 == 0) {
									local53 = arg3.aClass147Array3[local28] = null;
								} else if (local48 == 1) {
									local53.anInt5078 = 0;
									local53.anInt5072 = 0;
									local53.anInt5073 = 1;
									local53.anInt5075 = local26;
									local53.anInt5074 = 0;
									Static209.method4128(arg3.anInt7027, false, 0, arg3.anInt7032, local45);
								} else if (local48 == 2) {
									local53.anInt5072 = 0;
								}
							} else if (local45.anInt5568 >= Static231.method4385(local53.anInt5076).anInt5568) {
								local53 = arg3.aClass147Array3[local28] = null;
							}
						}
						if (local53 == null) {
							local53 = arg3.aClass147Array3[local28] = new Class147();
							local53.anInt5078 = 0;
							local53.anInt5072 = 0;
							local53.anInt5074 = 0;
							local53.anInt5073 = 1;
							local53.anInt5076 = local18;
							local53.anInt5075 = local26;
							Static209.method4128(arg3.anInt7027, false, 0, arg3.anInt7032, local45);
						}
					}
				}
				local28++;
				local22 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)Lclient!gj;")
	public static Class75 method2640(@OriginalArg(0) int arg0) {
		@Pc(11) Class215 local11 = Static87.aClass215_38;
		@Pc(20) Class75 local20;
		synchronized (Static87.aClass215_38) {
			local20 = (Class75) Static87.aClass215_38.method6057((long) arg0);
		}
		if (local20 != null) {
			return local20;
		}
		@Pc(40) byte[] local40 = Static9.aClass162_23.method4636(Static119.method1988(arg0), Static142.method3127(arg0));
		local20 = new Class75();
		local20.anInt2491 = arg0;
		if (local40 != null) {
			local20.method2066(new Class1_Sub16(local40));
		}
		local20.method2061();
		@Pc(61) Class215 local61 = Static87.aClass215_38;
		synchronized (Static87.aClass215_38) {
			Static87.aClass215_38.method6050(local20, (long) arg0);
			return local20;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)V")
	public static void method2642(@OriginalArg(1) int arg0) {
		Static263.anInt5600 = -1;
		Static74.anInt2057 = 3;
		Static259.anInt4933 = arg0;
		Static243.anInt5366 = 100;
	}
}
