import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!is", name = "j", descriptor = "Lclient!oj;")
	public static Class170 aClass170_2;

	@OriginalMember(owner = "client!is", name = "d", descriptor = "I")
	public static int anInt2803 = 0;

	@OriginalMember(owner = "client!is", name = "i", descriptor = "I")
	public static int anInt2806 = 0;

	@OriginalMember(owner = "client!is", name = "k", descriptor = "I")
	public static int anInt2807 = 0;

	@OriginalMember(owner = "client!is", name = "l", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_66 = new Class79("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!is", name = "m", descriptor = "J")
	public static long aLong89 = 0L;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!kb;III[Z)V")
	public static void method2780(@OriginalArg(0) Class2_Sub2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static365.aClass6Array4 == Static186.aClass6Array2) {
			return;
		}
		@Pc(9) int local9 = Static330.aClass6Array3[arg1].method5728(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class6 local22 = Static330.aClass6Array3[local11];
				if (local22 != null) {
					local22.method5724(arg0, arg2, local9 - local22.method5728(arg2, arg3), arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)V")
	public static void method2783(@OriginalArg(0) int arg0) {
		Static199.anInt5756 = arg0;
		@Pc(7) Class98 local7 = Static98.aClass98_10;
		synchronized (Static98.aClass98_10) {
			Static98.aClass98_10.method2614();
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IZZ)I")
	public static int method2784(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub41 local14 = Static374.method6275(false, arg0);
		if (local14 == null) {
			return Static178.aClass51_3.method1706(arg0).anInt2488;
		}
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local14.anIntArray489.length; local31++) {
			if (local14.anIntArray489[local31] == -1) {
				local29++;
			}
		}
		return local29 + Static178.aClass51_3.method1706(arg0).anInt2488 - local14.anIntArray489.length;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "([I[I[IILclient!nh;)V")
	public static void method2785(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class11_Sub5_Sub2_Sub1 arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(11) int local11 = arg0[local3];
			@Pc(15) int local15 = arg1[local3];
			@Pc(19) int local19 = arg2[local3];
			for (@Pc(21) int local21 = 0; local15 != 0 && local21 < arg3.aClass20Array3.length; local21++) {
				if ((local15 & 0x1) != 0) {
					if (local11 == -1) {
						arg3.aClass20Array3[local21] = null;
					} else {
						@Pc(46) Class157 local46 = Static39.aClass85_1.method2371(local11);
						@Pc(49) int local49 = local46.anInt4022;
						@Pc(54) Class20 local54 = arg3.aClass20Array3[local21];
						if (local54 != null) {
							if (local54.anInt624 == local11) {
								if (local49 == 0) {
									local54 = arg3.aClass20Array3[local21] = null;
								} else if (local49 == 1) {
									local54.anInt628 = 0;
									local54.anInt629 = local19;
									local54.anInt625 = 0;
									local54.anInt627 = 1;
									local54.anInt626 = 0;
									Static1.method4(local46, Static17.aClass11_Sub5_Sub2_Sub1_3 == arg3, arg3.aByte78, arg3.anInt6781, arg3.anInt6783, 0);
								} else if (local49 == 2) {
									local54.anInt626 = 0;
								}
							} else if (local46.anInt4023 >= Static39.aClass85_1.method2371(local54.anInt624).anInt4023) {
								local54 = arg3.aClass20Array3[local21] = null;
							}
						}
						if (local54 == null) {
							local54 = arg3.aClass20Array3[local21] = new Class20();
							local54.anInt627 = 1;
							local54.anInt624 = local11;
							local54.anInt628 = 0;
							local54.anInt626 = 0;
							local54.anInt625 = 0;
							local54.anInt629 = local19;
							Static1.method4(local46, Static17.aClass11_Sub5_Sub2_Sub1_3 == arg3, arg3.aByte78, arg3.anInt6781, arg3.anInt6783, 0);
						}
					}
				}
				local15 >>>= 0x1;
			}
		}
	}
}
