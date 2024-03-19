import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
	public static int anInt5133;

	@OriginalMember(owner = "client!pd", name = "B", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!qj;BII)Lclient!fi;")
	public static Class63 method4379(@OriginalArg(0) Class162 arg0, @OriginalArg(3) int arg1) {
		@Pc(9) byte[] local9 = arg0.method4636(0, arg1);
		return local9 == null ? null : new Class63(local9);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBLclient!ro;I)V")
	public static void method4383(@OriginalArg(0) int arg0, @OriginalArg(2) Class177 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class142 local8 = arg1.method4905(Static221.aClass40_6);
		if (local8 == null) {
			return;
		}
		Static221.aClass40_6.method2732(arg2, arg0, arg2 + arg1.anInt5803, arg0 + arg1.anInt5816);
		if (Static286.anInt6044 >= 3) {
			Static221.aClass40_6.method2736(local8, arg2, arg0);
		} else {
			Static233.aClass29_16.method5846((float) arg2 + (float) arg1.anInt5803 / 2.0F, (float) arg1.anInt5816 / 2.0F + (float) arg0, ((int) -Static188.aFloat17 & 0x3FFF) << 2, local8, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)I")
	public static int method4384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = arg1 & 0x1 | local7 << 1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local7;
	}
}
