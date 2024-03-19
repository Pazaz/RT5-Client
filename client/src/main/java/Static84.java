import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static84 {

	@OriginalMember(owner = "client!fk", name = "Z", descriptor = "[I")
	public static final int[] anIntArray141 = new int[13];

	@OriginalMember(owner = "client!fk", name = "hb", descriptor = "Lclient!we;")
	public static final Class215 aClass215_35 = new Class215(64);

	@OriginalMember(owner = "client!fk", name = "ub", descriptor = "[Lclient!ai;")
	public static final Class7_Sub1_Sub1_Sub1[] aClass7_Sub1_Sub1_Sub1Array1 = new Class7_Sub1_Sub1_Sub1[32768];

	@OriginalMember(owner = "client!fk", name = "vb", descriptor = "I")
	public static int anInt2246 = 127;

	@OriginalMember(owner = "client!fk", name = "wb", descriptor = "[I")
	public static final int[] anIntArray142 = new int[3];

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
	public static void method1870() {
		Static321.aClass29_22 = null;
		Static124.aClass29_10 = null;
		Static56.aClass29_8 = null;
		Static23.aClass29_4 = null;
		Static188.aClass29_7 = null;
		Static57.aClass29_17 = null;
		Static90.aClass29_9 = null;
		Static344.aClass29_24 = null;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)I")
	public static int method1871(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!il;)Lclient!uq;")
	public static Class103_Sub4 method1876(@OriginalArg(1) Class1_Sub16 arg0) {
		return new Class103_Sub4(arg0.method5762(), arg0.method5762(), arg0.method5762(), arg0.method5762(), arg0.method5755(), arg0.method5755(), arg0.method5761());
	}
}
