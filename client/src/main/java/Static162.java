import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString146 = "wave2:";

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "[I")
	public static final int[] anIntArray278 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!oc;III[Z)Z")
	public static boolean method3411(@OriginalArg(0) Class1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static118.aClass77Array1 != Static137.aClass77Array2) {
			@Pc(11) int local11 = Static336.aClass77Array3[arg1].method3994(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class77 local18 = Static336.aClass77Array3[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method3994(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method3988(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method3983(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!il;I)Ljava/lang/String;")
	public static String method3412(@OriginalArg(0) Class1_Sub16 arg0) {
		return Static73.method1723(arg0);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(III)Z")
	public static boolean method3413(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static204.aBoolean329) {
			return false;
		}
		@Pc(18) int local18 = arg0 >> 16;
		@Pc(22) int local22 = arg0 & 0xFFFF;
		if (Class1_Sub2_Sub10.lb[local18] == null || Class1_Sub2_Sub10.lb[local18][local22] == null) {
			return false;
		}
		@Pc(40) Class177 local40 = Class1_Sub2_Sub10.lb[local18][local22];
		@Pc(54) Class1_Sub22 local54;
		if (arg1 == -1 && local40.anInt5838 == 0) {
			for (local54 = (Class1_Sub22) Static97.aClass130_9.method3749(); local54 != null; local54 = (Class1_Sub22) Static97.aClass130_9.method3756()) {
				if (local54.anInt4308 == 22 || local54.anInt4308 == 1006 || local54.anInt4308 == 4 || local54.anInt4308 == 36 || local54.anInt4308 == 24) {
					for (@Pc(144) Class177 local144 = Static298.method5252(local54.anInt4307); local144 != null; local144 = Static14.method411(local144)) {
						if (local40.anInt5828 == local144.anInt5828) {
							return true;
						}
					}
				}
			}
		} else {
			for (local54 = (Class1_Sub22) Static97.aClass130_9.method3749(); local54 != null; local54 = (Class1_Sub22) Static97.aClass130_9.method3756()) {
				if (local54.anInt4310 == arg1 && local54.anInt4307 == local40.anInt5828 && (local54.anInt4308 == 22 || local54.anInt4308 == 1006 || local54.anInt4308 == 4 || local54.anInt4308 == 36 || local54.anInt4308 == 24)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)I")
	public static int method3414(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(23) int local23 = local10 | local10 >>> 2;
		@Pc(29) int local29 = local23 | local23 >>> 4;
		@Pc(35) int local35 = local29 | local29 >>> 8;
		@Pc(41) int local41 = local35 | local35 >>> 16;
		return local41 + 1;
	}
}
