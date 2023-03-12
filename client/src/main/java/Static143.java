import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "Lclient!s;")
	public static final Class210 aClass210_7 = new Class210(0, 4);

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "Lclient!mc;")
	public static final ClientProt aClass145_102 = new ClientProt(45, 3);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIBZI)V")
	public static void method2677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static338.aLong214 = 0L;
		@Pc(12) int local12 = Static144.getWindowMode();
		if (arg1 == 3 || local12 == 3) {
			arg2 = true;
		}
		if (!Static190.aClass19_8.method2840()) {
			arg2 = true;
		}
		Static163.method3100(arg3, arg0, local12, arg1, arg2);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIB)V")
	public static void method2679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static116.anInt2357 == 1) {
			Static259.method4427(Static32.aClass2_Sub5_2, arg1, arg0);
		} else if (Static116.anInt2357 == 2) {
			Static388.method6439(arg1, arg0);
		}
		Static116.anInt2357 = 0;
		Static32.aClass2_Sub5_2 = null;
	}
}
