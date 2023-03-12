import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
	public static final int anInt2708 = 1403;

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "Lclient!mc;")
	public static final ClientProt aClass145_103 = new ClientProt(73, 7);

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "[S")
	public static short[] aShortArray54 = new short[256];

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
	public static int anInt2717 = -1;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
	public static void method2703() {
		Static268.anInt4959 = 0;
		Static129.aClass135_19.clear();
		Static129.aClass135_19.addTail(Static23.aClass2_Sub5_1);
		Static268.anInt4959++;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB)Lclient!nf;")
	public static Class12_Sub4 method2706(@OriginalArg(0) int arg0) {
		@Pc(15) Class36[] local15 = ColorImageCacheEntry.aClass36Array1;
		synchronized (ColorImageCacheEntry.aClass36Array1) {
			@Pc(35) Class12_Sub4 local35;
			if (ColorImageCacheEntry.aClass36Array1.length <= arg0 || ColorImageCacheEntry.aClass36Array1[arg0].method1414()) {
				local35 = new Class12_Sub4();
				local35.aClass12_Sub2Array1 = new Class12_Sub2[arg0];
				for (@Pc(41) int local41 = 0; local41 < arg0; local41++) {
					local35.aClass12_Sub2Array1[local41] = new Class12_Sub2();
				}
			} else {
				local35 = (Class12_Sub4) ColorImageCacheEntry.aClass36Array1[arg0].method1417();
				local35.method5684();
				@Pc(74) int local74 = Static206.anIntArray224[arg0]--;
			}
			return local35;
		}
	}
}
