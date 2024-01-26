import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!rga", name = "g", descriptor = "[S")
	public static short[] aShortArray112 = new short[256];

	@OriginalMember(owner = "client!rga", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray206 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IIIIIIIZ)V")
	public static void method7289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) Class2_Sub25 local7 = null;
		for (@Pc(12) Class2_Sub25 local12 = (Class2_Sub25) Static159.aClass339_15.method7699(65280); local12 != null; local12 = (Class2_Sub25) Static159.aClass339_15.method7706()) {
			if (arg4 == local12.anInt4010 && local12.anInt4016 == arg3 && arg6 == local12.anInt4006 && local12.anInt4011 == arg2) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub25();
			local7.anInt4011 = arg2;
			local7.anInt4010 = arg4;
			local7.anInt4006 = arg6;
			local7.anInt4016 = arg3;
			if (arg3 >= 0 && arg6 >= 0 && Static720.anInt10859 > arg3 && arg6 < Static501.anInt7568) {
				Static293.method4332(local7);
			}
			Static159.aClass339_15.method7711(local7);
		}
		local7.aBoolean310 = true;
		local7.anInt4012 = arg0;
		local7.anInt4013 = arg5;
		local7.aBoolean309 = false;
		local7.anInt4014 = arg1;
	}

	@OriginalMember(owner = "client!rga", name = "c", descriptor = "(I)V")
	public static void method7290() {
		Static627.aClass82_200.method2151();
	}
}
