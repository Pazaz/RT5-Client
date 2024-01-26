import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!rw", name = "v", descriptor = "I")
	public static int anInt8534;

	@OriginalMember(owner = "client!rw", name = "A", descriptor = "[I")
	public static final int[] anIntArray682 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!rw", name = "B", descriptor = "J")
	public static final long aLong269 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!rw", name = "D", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_103 = new Class345(43, 3);

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "(II)Z")
	public static boolean method7566(@OriginalArg(1) int arg0) {
		if (Static132.aBooleanArray5[arg0]) {
			return true;
		} else if (Static666.aClass330_118.method7607(arg0)) {
			@Pc(25) int local25 = Static666.aClass330_118.method7608(arg0);
			if (local25 == 0) {
				Static132.aBooleanArray5[arg0] = true;
				return true;
			}
			if (Static453.aClass158ArrayArray2[arg0] == null) {
				Static453.aClass158ArrayArray2[arg0] = new Class158[local25];
			}
			for (@Pc(53) int local53 = 0; local53 < local25; local53++) {
				if (Static453.aClass158ArrayArray2[arg0][local53] == null) {
					@Pc(66) byte[] local66 = Static666.aClass330_118.method7595(local53, arg0);
					if (local66 != null) {
						@Pc(78) Class158 local78 = Static453.aClass158ArrayArray2[arg0][local53] = new Class158();
						local78.anInt3812 = local53 + (arg0 << 16);
						if (local66[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local78.method3390(new Class2_Sub21(local66));
					}
				}
			}
			Static132.aBooleanArray5[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
