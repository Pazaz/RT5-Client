import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!go", name = "p", descriptor = "Lclient!r;")
	public static Js5 aClass197_26;

	@OriginalMember(owner = "client!go", name = "s", descriptor = "[Lclient!jd;")
	public static Sprite[] aClass13Array8;

	@OriginalMember(owner = "client!go", name = "i", descriptor = "I")
	public static int anInt2357 = 0;

	@OriginalMember(owner = "client!go", name = "l", descriptor = "Lclient!fr;")
	public static final Class75 aClass75_1 = new Class75();

	@OriginalMember(owner = "client!go", name = "m", descriptor = "[I")
	public static final int[] anIntArray149 = new int[5];

	@OriginalMember(owner = "client!go", name = "n", descriptor = "I")
	public static int anInt2360 = 0;

	@OriginalMember(owner = "client!go", name = "q", descriptor = "[Lclient!nt;")
	public static final AnimFrameset[] aClass2_Sub2_Sub13Array3 = new AnimFrameset[14];

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)[B")
	public static byte[] method2364(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub2_Sub15 local12 = (Class2_Sub2_Sub15) Static17.aClass116_6.method3152((long) arg0);
		if (local12 == null) {
			@Pc(17) byte[] local17 = new byte[512];
			@Pc(23) Random local23 = new Random((long) arg0);
			for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
				local17[local25] = (byte) local25;
			}
			for (@Pc(38) int local38 = 0; local38 < 255; local38++) {
				@Pc(45) int local45 = 255 - local38;
				@Pc(50) int local50 = Static382.method6361(local45, local23);
				@Pc(54) byte local54 = local17[local50];
				local17[local50] = local17[local45];
				local17[local45] = local17[511 - local38] = local54;
			}
			local12 = new Class2_Sub2_Sub15(local17);
			Static17.aClass116_6.method3155(local12, (long) arg0);
		}
		return local12.aByteArray78;
	}
}
