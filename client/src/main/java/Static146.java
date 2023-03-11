import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_63 = new Class79("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
	public static int anInt2703 = 0;

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "Lclient!h;")
	public static final Class89 aClass89_113 = new Class89(85, -2);

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
	public static int anInt2705 = 2;

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
	public static int anInt2706 = 0;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(CI)Z")
	public static boolean method2697(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2698(@OriginalArg(1) String arg0) {
		return Static319.method5433(10, arg0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)Lclient!tb;")
	public static Class2_Sub2_Sub16 method2699(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub16 local10 = (Class2_Sub2_Sub16) Static388.aClass116_8.method3152((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28;
		if (arg0 < 32768) {
			local28 = Static137.aClass197_33.method5089(arg0, 1);
		} else {
			local28 = Static308.aClass197_80.method5089(arg0 & 0x7FFF, 1);
		}
		local10 = new Class2_Sub2_Sub16();
		if (local28 != null) {
			local10.method5599(new Class2_Sub4(local28));
		}
		if (arg0 >= 32768) {
			local10.method5604();
		}
		Static388.aClass116_8.method3155(local10, (long) arg0);
		return local10;
	}
}
