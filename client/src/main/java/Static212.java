import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!o", name = "f", descriptor = "Lclient!qj;")
	public static Class162 aClass162_245;

	@OriginalMember(owner = "client!o", name = "j", descriptor = "I")
	public static int anInt7376 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)I")
	public static int method6168() {
		@Pc(10) Class215 local10 = Static94.aClass215_39;
		synchronized (Static94.aClass215_39) {
			return Static94.aClass215_39.method6055();
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!qj;)I")
	public static int method6170(@OriginalArg(1) Class162 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4615(Static314.anInt6502)) {
			local5++;
		}
		if (arg0.method4615(Static14.anInt586)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)V")
	public static void method6171(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static241.aClass154ArrayArrayArray2 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg0 << 14 | arg1 << 28 | arg2);
		@Pc(25) Class1_Sub11 local25 = (Class1_Sub11) Static208.aClass183_24.method5053(local19);
		if (local25 == null) {
			Static120.method2586(arg1, arg2, arg0);
			return;
		}
		@Pc(39) Class1_Sub19 local39 = (Class1_Sub19) local25.aClass130_11.method3749();
		if (local39 == null) {
			Static120.method2586(arg1, arg2, arg0);
			return;
		}
		@Pc(61) Class7_Sub4_Sub1 local61 = (Class7_Sub4_Sub1) Static120.method2586(arg1, arg2, arg0);
		if (local61 == null) {
			local61 = new Class7_Sub4_Sub1();
		} else {
			local61.anInt6287 = local61.anInt6295 = -1;
		}
		local61.anInt6294 = local39.anInt3991;
		local61.anInt6289 = local39.anInt3986;
		label44: while (true) {
			@Pc(89) Class1_Sub19 local89 = (Class1_Sub19) local25.aClass130_11.method3756();
			if (local89 == null) {
				break;
			}
			if (local89.anInt3991 != local61.anInt6294) {
				local61.anInt6292 = local89.anInt3986;
				local61.anInt6287 = local89.anInt3991;
				while (true) {
					@Pc(110) Class1_Sub19 local110 = (Class1_Sub19) local25.aClass130_11.method3756();
					if (local110 == null) {
						break label44;
					}
					if (local61.anInt6294 != local110.anInt3991 && local110.anInt3991 != local61.anInt6287) {
						local61.anInt6288 = local110.anInt3986;
						local61.anInt6295 = local110.anInt3991;
					}
				}
			}
		}
		@Pc(150) int local150 = Static309.method5429((arg0 << 7) + 64, (arg2 << 7) + 64, arg1);
		Static182.method3706(arg1, arg2, arg0, local150, local61);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Lclient!pb;")
	public static Class149 method6173(@OriginalArg(0) int arg0) {
		@Pc(12) Class149 local12 = (Class149) Static351.aClass215_101.method6057((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static299.aClass162_215.method4636(arg0, 33);
		local12 = new Class149();
		if (local22 != null) {
			local12.method4352(arg0, new Class1_Sub16(local22));
		}
		Static351.aClass215_101.method6050(local12, (long) arg0);
		return local12;
	}
}
