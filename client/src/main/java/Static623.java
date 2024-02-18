import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static623 {

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[100];

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray30 = new boolean[200];

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method8326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Random arg2) {
		if (arg0 != -5208) {
			method8327((byte) 25);
		}
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static700.method9150(arg1)) {
			return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(46) int local46 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(49) int local49;
			do {
				local49 = arg2.nextInt();
			} while (local49 >= local46);
			return Static719.method9118(local49, arg0 + 22147, arg1);
		}
	}
}
