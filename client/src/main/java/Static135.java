import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ee", name = "P", descriptor = "[F")
	public static final float[] aFloatArray56 = new float[16];

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
	public static int anInt8223 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZI)Z")
	public static boolean method7236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(28) boolean local28 = (arg1 & 0x37) == 0 ? Static519.method6832(-125, arg0, arg1) : Static576.method7609(arg1, arg0);
		return local28 | Static526.method7073(arg1, arg0) | (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V")
	public static void method7237() {
		Static203.aClass73_4 = null;
		Static450.anInterface9_1 = null;
		Static49.anInt1045 = -1;
		Static173.anIntArray252 = null;
		Static420.aClass73_7 = null;
		Static138.anInt2512 = -1;
		Static448.anInt6796 = -1;
		Static74.aClass19_4 = null;
		Static693.anInt10382 = -1;
		Static651.anInterface9Array1 = null;
		Static712.aClass73_11 = null;
		Static10.aClass213_1.method5010();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZI)V")
	public static void method7239(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub2_Sub2 local14 = Static440.method5963(1, (long) arg0);
		local14.method205();
	}
}
