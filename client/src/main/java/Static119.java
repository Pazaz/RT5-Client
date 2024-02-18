import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static119 {

	@OriginalMember(owner = "client!dma", name = "m", descriptor = "[Lclient!st;")
	public static Class23[] aClass23Array3;

	@OriginalMember(owner = "client!dma", name = "k", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_47 = new Class225(137, 8);

	@OriginalMember(owner = "client!dma", name = "l", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_11 = new Class155(41);

	@OriginalMember(owner = "client!dma", name = "h", descriptor = "[I")
	public static final int[] anIntArray199 = new int[64];

	@OriginalMember(owner = "client!dma", name = "a", descriptor = "(Lclient!kn;)V")
	public static void method2170(@OriginalArg(0) Class213 arg0) {
		Static514.aClass213_2 = arg0;
	}

	@OriginalMember(owner = "client!dma", name = "b", descriptor = "(I)Lclient!fk;")
	public static Class2_Sub19 method2174() {
		return Static76.anInt1604 == 0 ? new Class2_Sub19() : Static372.aClass2_Sub19Array1[--Static76.anInt1604];
	}

	@OriginalMember(owner = "client!dma", name = "a", descriptor = "(IBI)Z")
	public static boolean method2175(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}
