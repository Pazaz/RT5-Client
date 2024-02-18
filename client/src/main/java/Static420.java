import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!nea", name = "f", descriptor = "Z")
	public static boolean aBoolean479;

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "Lclient!tt;")
	public static Class73 aClass73_7;

	@OriginalMember(owner = "client!nea", name = "g", descriptor = "[[[Lclient!pha;")
	public static Class291[][][] aClass291ArrayArrayArray2;

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "Lclient!pc;")
	public static final Class287 aClass287_13 = new Class287(3, 4);

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "I")
	public static int anInt6436 = 1;

	@OriginalMember(owner = "client!nea", name = "d", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_78 = new Class345(28, 3);

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(ILclient!hda;II)V")
	public static void method5758(@OriginalArg(1) Class158 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static156.aBoolean223) {
			@Pc(16) Class296 local16 = Static610.anInt9329 == -1 ? null : Static386.aClass49_2.method1161(Static610.anInt9329);
			if (Static84.method1661(arg0).method6217() && (Static717.anInt10822 & 0x20) != 0 && (local16 == null || arg0.method3404(local16.anInt7509, Static610.anInt9329) != local16.anInt7509)) {
				Static416.method5707(false, arg0.anInt3760, 0L, arg0.anInt3741, arg0.anInt3812, Static153.aString27, 18, true, Static369.anInt4263, Static128.aString108 + " -> " + arg0.aString41, (long) (arg0.anInt3741 << 0 | arg0.anInt3812), false);
			}
		}
		@Pc(106) String local106;
		for (@Pc(97) int local97 = 9; local97 >= 5; local97--) {
			local106 = Static443.method5982(arg0, local97);
			if (local106 != null) {
				Static416.method5707(false, arg0.anInt3760, (long) (local97 + 1), arg0.anInt3741, arg0.anInt3812, local106, 1002, true, Static372.method5292(local97, arg0), arg0.aString41, (long) (arg0.anInt3812 | arg0.anInt3741 << 0), false);
			}
		}
		local106 = Static380.method5359(arg0);
		if (local106 != null) {
			Static416.method5707(false, arg0.anInt3760, 0L, arg0.anInt3741, arg0.anInt3812, local106, 12, true, arg0.anInt3776, arg0.aString41, (long) (arg0.anInt3741 << 0 | arg0.anInt3812), false);
		}
		for (@Pc(193) int local193 = 4; local193 >= 0; local193--) {
			@Pc(204) String local204 = Static443.method5982(arg0, local193);
			if (local204 != null) {
				Static416.method5707(false, arg0.anInt3760, (long) (local193 + 1), arg0.anInt3741, arg0.anInt3812, local204, 20, true, Static372.method5292(local193, arg0), arg0.aString41, (long) (arg0.anInt3812 | arg0.anInt3741 << 0), false);
			}
		}
		if (!Static84.method1661(arg0).method6219()) {
			return;
		}
		if (arg0.aString42 == null) {
			Static416.method5707(false, arg0.anInt3760, 0L, arg0.anInt3741, arg0.anInt3812, Static32.aClass32_10.method877(Static51.anInt1052), 10, true, -1, "", (long) (arg0.anInt3812 | arg0.anInt3741 << 0), false);
		} else {
			Static416.method5707(false, arg0.anInt3760, 0L, arg0.anInt3741, arg0.anInt3812, arg0.aString42, 10, true, -1, "", (long) (arg0.anInt3812 | arg0.anInt3741 << 0), false);
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(I[SI[Ljava/lang/String;I)V")
	public static void method5759(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(12) int local12 = (arg0 + arg2) / 2;
		@Pc(14) int local14 = arg2;
		@Pc(18) String local18 = arg3[local12];
		arg3[local12] = arg3[arg0];
		arg3[arg0] = local18;
		@Pc(32) short local32 = arg1[local12];
		arg1[local12] = arg1[arg0];
		arg1[arg0] = local32;
		for (@Pc(44) int local44 = arg2; local44 < arg0; local44++) {
			if (local18 == null || arg3[local44] != null && arg3[local44].compareTo(local18) < (local44 & 0x1)) {
				@Pc(68) String local68 = arg3[local44];
				arg3[local44] = arg3[local14];
				arg3[local14] = local68;
				@Pc(82) short local82 = arg1[local44];
				arg1[local44] = arg1[local14];
				arg1[local14++] = local82;
			}
		}
		arg3[arg0] = arg3[local14];
		arg3[local14] = local18;
		arg1[arg0] = arg1[local14];
		arg1[local14] = local32;
		method5759(local14 - 1, arg1, arg2, arg3);
		method5759(arg0, arg1, local14 + 1, arg3);
	}
}
