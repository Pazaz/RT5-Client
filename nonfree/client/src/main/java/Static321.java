import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!kca", name = "V", descriptor = "I")
	public static int anInt5113;

	@OriginalMember(owner = "client!kca", name = "w", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_64 = new Class345(58, 2);

	@OriginalMember(owner = "client!kca", name = "y", descriptor = "I")
	public static int anInt5111 = 0;

	@OriginalMember(owner = "client!kca", name = "O", descriptor = "[I")
	public static final int[] anIntArray388 = new int[2048];

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IIZ)V")
	public static void method4619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(23) Class2_Sub2_Sub2 local23 = Static440.method5963(18, (long) arg1 << 32 | (long) arg0);
		local23.method205();
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IB)Lclient!wca;")
	public static Class396 method4620() {
		return new Class396(1, false);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(II)Z")
	public static boolean method4622(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class2_Sub2_Sub16 local8 = (Class2_Sub2_Sub16) Static693.aClass339_79.method7699(65280); local8 != null; local8 = (Class2_Sub2_Sub16) Static693.aClass339_79.method7706()) {
			if (Static598.method7825(local8.anInt7314) && local8.aLong233 == (long) arg0) {
				return true;
			}
		}
		return false;
	}
}
