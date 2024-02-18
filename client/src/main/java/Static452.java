import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!oea", name = "y", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_173 = new Class225(44, 10);

	@OriginalMember(owner = "client!oea", name = "v", descriptor = "I")
	public static int anInt6869 = 0;

	@OriginalMember(owner = "client!oea", name = "w", descriptor = "Lclient!dla;")
	public static final Class82 aClass82_149 = new Class82(8);

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(ILclient!ge;)Lclient!fea;")
	public static Class125 method6171(@OriginalArg(1) Packet arg0) {
		@Pc(7) String local7 = arg0.gjstr();
		@Pc(14) Class403 local14 = Static33.method882()[arg0.g1()];
		@Pc(23) Class103 local23 = Static313.method4544()[arg0.g1()];
		@Pc(27) int local27 = arg0.g2s();
		@Pc(33) int local33 = arg0.g2s();
		@Pc(39) int local39 = arg0.g1();
		@Pc(49) int local49 = arg0.g1();
		@Pc(53) int local53 = arg0.g1();
		@Pc(57) int local57 = arg0.g2();
		@Pc(61) int local61 = arg0.g2();
		@Pc(65) int local65 = arg0.g4();
		@Pc(69) int local69 = arg0.g4();
		@Pc(73) int local73 = arg0.g4();
		return new Class125(local7, local14, local23, local27, local33, local39, local49, local53, local57, local61, local65, local69, local73);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!c;BILclient!ha;II)V")
	public static void method6173(@OriginalArg(0) Class54 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class19 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class173 local9 = Static720.aClass363_4.method8362(arg0.anInt1239);
		if (local9.anInt4167 == -1) {
			return;
		}
		if (arg0.aBoolean103) {
			@Pc(24) int local24 = arg1 + arg0.anInt1210;
			arg1 = local24 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(39) Class23 local39 = local9.method3689(arg1, arg2, arg0.aBoolean96);
		if (local39 == null) {
			return;
		}
		@Pc(46) int local46 = arg0.anInt1270;
		@Pc(49) int local49 = arg0.anInt1229;
		if ((arg1 & 0x1) == 1) {
			local46 = arg0.anInt1229;
			local49 = arg0.anInt1270;
		}
		@Pc(72) int local72 = local39.method8203();
		@Pc(75) int local75 = local39.method8192();
		if (local9.aBoolean329) {
			local75 = local49 * 4;
			local72 = local46 * 4;
		}
		if (local9.anInt4165 == 0) {
			local39.method8206(arg3, arg4 + 4 - local49 * 4, local72, local75);
		} else {
			local39.method8205(arg3, arg4 - (local49 - 1) * 4, local72, local75, 0, local9.anInt4165 | 0xFF000000, 1);
		}
	}
}
