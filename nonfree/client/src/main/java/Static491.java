import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_253 = new Class225(142, 0);

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_254 = new Class225(103, 2);

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray257 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!qha;Z)V")
	public static void method9159(@OriginalArg(0) Class19_Sub3 arg0) {
		@Pc(12) byte[] local12;
		if (Static599.anObject14 == null) {
			@Pc(5) Class35_Sub2_Sub2 local5 = new Class35_Sub2_Sub2();
			local12 = local5.method5816();
			Static599.anObject14 = Static247.method3524(local12);
		}
		if (Static158.anObject5 == null) {
			@Pc(34) Class35_Sub1_Sub1 local34 = new Class35_Sub1_Sub1();
			local12 = local34.method979();
			Static158.anObject5 = Static247.method3524(local12);
		}
		@Pc(49) Class202 local49 = arg0.aClass202_1;
		if (local49.method4582() && Static71.anObject4 == null) {
			local12 = Static448.method6106(4.0F, 4.0F, 0.5F, 16.0F, 0.6F, new Class59_Sub1(419684));
			Static71.anObject4 = Static247.method3524(local12);
		}
	}
}
