import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static322 {

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray265;

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "S")
	public static short aShort135;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "[I")
	public static final int[] anIntArray889 = new int[32];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIC)C")
	public static char method9436(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	public static void method9441() {
		Static81.method1586(12);
		Static300.method4393();
		System.gc();
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(BI)I")
	public static int method9443(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
