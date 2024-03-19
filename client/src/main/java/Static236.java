import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!pl", name = "Y", descriptor = "Lclient!qj;")
	public static Class162 aClass162_187;

	@OriginalMember(owner = "client!pl", name = "P", descriptor = "Lclient!op;")
	public static final Class143 aClass143_9 = new Class143(64);

	@OriginalMember(owner = "client!pl", name = "R", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[100];

	@OriginalMember(owner = "client!pl", name = "V", descriptor = "Z")
	public static boolean aBoolean367 = false;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIILclient!nr;ZIII)V")
	public static void method4500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class40 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(24) Interface6 local24 = (Interface6) Static56.method1394(arg3, arg6, arg5);
		@Pc(32) Class189 local32;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(48) int local48;
		if (local24 != null) {
			local32 = Static83.method1840(local24.method5686());
			local38 = local24.method5687() & 0x3;
			local42 = local24.method5684();
			if (local32.anInt6201 == -1) {
				local48 = arg0;
				if (local32.anInt6170 > 0) {
					local48 = arg1;
				}
				if (local42 == 0 || local42 == 2) {
					if (local38 == 0) {
						arg4.method2797(arg7, local48, arg2, 4);
					} else if (local38 == 1) {
						arg4.method2769(arg2, local48, 4, arg7);
					} else if (local38 == 2) {
						arg4.method2797(arg7, local48, arg2 + 3, 4);
					} else if (local38 == 3) {
						arg4.method2769(arg2, local48, 4, arg7 + 3);
					}
				}
				if (local42 == 3) {
					if (local38 == 0) {
						arg4.method2745(1, 1, arg2, arg7, local48);
					} else if (local38 == 1) {
						arg4.method2745(1, 1, arg2 + 3, arg7, local48);
					} else if (local38 == 2) {
						arg4.method2745(1, 1, arg2 + 3, arg7 + 3, local48);
					} else if (local38 == 3) {
						arg4.method2745(1, 1, arg2, arg7 + 3, local48);
					}
				}
				if (local42 == 2) {
					if (local38 == 0) {
						arg4.method2769(arg2, local48, 4, arg7);
					} else if (local38 == 1) {
						arg4.method2797(arg7, local48, arg2 + 3, 4);
					} else if (local38 == 2) {
						arg4.method2769(arg2, local48, 4, arg7 + 3);
					} else if (local38 == 3) {
						arg4.method2797(arg7, local48, arg2, 4);
					}
				}
			} else {
				Static3.method61(arg7, arg2, arg4, local32, local38);
			}
		}
		local24 = (Interface6) Static95.method2029(arg3, arg6, arg5, Interface6.class);
		if (local24 != null) {
			local32 = Static83.method1840(local24.method5686());
			local38 = local24.method5687() & 0x3;
			local42 = local24.method5684();
			if (local32.anInt6201 != -1) {
				Static3.method61(arg7, arg2, arg4, local32, local38);
			} else if (local42 == 9) {
				local48 = -1118482;
				if (local32.anInt6170 > 0) {
					local48 = -1179648;
				}
				if (local38 == 0 || local38 == 2) {
					arg4.method2739(arg7, arg2 + 3, arg7 + 3, arg2, local48);
				} else {
					arg4.method2739(arg7 + 3, arg2 + 3, arg7, arg2, local48);
				}
			}
		}
		local24 = (Interface6) Static293.method5174(arg3, arg6, arg5);
		if (local24 == null) {
			return;
		}
		local32 = Static83.method1840(local24.method5686());
		local38 = local24.method5687() & 0x3;
		if (local32.anInt6201 != -1) {
			Static3.method61(arg7, arg2, arg4, local32, local38);
			return;
		}
	}

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)V")
	public static void method4501() {
		if (Static221.aClass40_6 == null) {
			return;
		}
		Static216.aClass58_8.method1673();
		Static341.method6031();
		Static15.method447();
		Static84.method1870();
		Static98.method909();
		Static334.method5892();
		if (Static156.aClass210_1 != null) {
			Static156.aClass210_1.method5664();
		}
		Static301.method5275();
		Static4.method147();
		Static256.method4722();
		Static314.method5510(false);
		Static141.method3109();
		for (@Pc(42) int local42 = 0; local42 < 2048; local42++) {
			@Pc(48) Class7_Sub1_Sub1_Sub2 local48 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local42];
			if (local48 != null) {
				local48.anInterface6_3 = null;
				for (@Pc(55) int local55 = 0; local55 < local48.aClass86Array3.length; local55++) {
					local48.aClass86Array3[local55] = null;
				}
			}
		}
		for (@Pc(74) int local74 = 0; local74 < Static84.aClass7_Sub1_Sub1_Sub1Array1.length; local74++) {
			@Pc(80) Class7_Sub1_Sub1_Sub1 local80 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local74];
			if (local80 != null) {
				for (@Pc(84) int local84 = 0; local84 < local80.aClass86Array3.length; local84++) {
					local80.aClass86Array3[local84] = null;
				}
			}
		}
		Static221.aClass40_6.method2711();
		Static221.aClass40_6 = null;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)Lclient!le;")
	public static Class118 method4503(@OriginalArg(0) int arg0) {
		@Pc(15) Class118 local15 = (Class118) Static181.aClass215_60.method6057((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static156.aClass162_133.method4636(arg0, 1);
		local15 = new Class118();
		local15.anInt4077 = arg0;
		if (local25 != null) {
			local15.method3500(new Class1_Sub16(local25));
		}
		local15.method3497();
		if (local15.anInt4088 == 2 && Static138.aClass183_12.method5053((long) arg0) == null) {
			Static138.aClass183_12.method5055((long) arg0, new Class1_Sub26(Static244.anInt2616));
			Static264.aClass118Array1[Static244.anInt2616++] = local15;
		}
		Static181.aClass215_60.method6050(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(CB)Z")
	public static boolean method4504(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
