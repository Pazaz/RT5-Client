import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class VarpDomain {

	@OriginalMember(owner = "client!ch", name = "fb", descriptor = "[I")
	public static final int[] updatedVarps = new int[32];
	@OriginalMember(owner = "client!mk", name = "e", descriptor = "Lclient!ts;")
	public static Class226 instance;
	@OriginalMember(owner = "client!am", name = "h", descriptor = "I")
	public static int updatedVarpsWriterIndex = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
	public static void refreshMagicVarp(@OriginalArg(1) int arg0) {
		Static12.method282();
		@Pc(15) int local15 = client.VarpTypes.method5114(arg0).anInt4700;
		if (local15 == 0) {
			return;
		}
		@Pc(23) int local23 = instance.anIntArray430[arg0];
		if (local15 == 5) {
			Static232.anInt4087 = local23;
		}
		if (local15 == 6) {
			Static389.anInt4896 = local23;
		}
	}

}
