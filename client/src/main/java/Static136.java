import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
	public static int anInt6778;

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_141 = new LocalizedString("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(III)I")
	public static int method6071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg1 > 0) {
			local7 = arg0 & 0x1 | local7 << 1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I[B)[B")
	public static byte[] method6072(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static404.method4607(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZI)V")
	public static void method6077(@OriginalArg(1) int arg0) {
		Static324.anIntArray409 = new int[arg0];
		Static353.anIntArray448 = new int[arg0];
		Static107.anIntArray136 = new int[arg0];
		Static86.anIntArray122 = new int[arg0];
		Static248.anIntArray318 = new int[arg0];
	}
}
