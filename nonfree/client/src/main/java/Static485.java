import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!pf", name = "C", descriptor = "[I")
	public static int[] anIntArray886;

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "[I")
	public static final int[] anIntArray887 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "[I")
	public static final int[] anIntArray888 = new int[3];

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!hda;ILclient!ha;)V")
	public static void method9415(@OriginalArg(0) Class158 arg0, @OriginalArg(2) Class19 arg1) {
		@Pc(38) boolean local38 = Static419.aClass112_1.method2483(arg0.aBoolean288 ? Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass201_1 : null, arg1, arg0.anInt3757, arg0.anInt3760, arg0.anInt3773, arg0.anInt3817, arg0.anInt3798 | 0xFF000000) == null;
		if (local38) {
			Static133.aClass339_13.method7711(new Class2_Sub36(arg0.anInt3760, arg0.anInt3817, arg0.anInt3773, arg0.anInt3798 | 0xFF000000, arg0.anInt3757, arg0.aBoolean288));
			Static178.method2729(arg0);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIII)I")
	public static int method9417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 4095 - arg2;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z[FI)[F")
	public static float[] method9420(@OriginalArg(0) boolean arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		if (arg0) {
			return null;
		} else {
			@Pc(12) float[] local12 = new float[arg2];
			Static734.method7689(arg1, 0, local12, 0, arg2);
			return local12;
		}
	}
}
