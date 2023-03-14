import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!sk", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
	public static final int anInt5977 = 50;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "[I")
	public static final int[] anIntArray397 = new int[anInt5977];

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "[I")
	public static final int[] anIntArray398 = new int[anInt5977];

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "[I")
	public static final int[] anIntArray399 = new int[anInt5977];

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "[I")
	public static final int[] anIntArray400 = new int[anInt5977];

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray54 = new String[200];

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray55 = new String[anInt5977];

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "[I")
	public static final int[] anIntArray401 = new int[anInt5977];

	@OriginalMember(owner = "client!sk", name = "s", descriptor = "[I")
	public static final int[] anIntArray402 = new int[anInt5977];

	@OriginalMember(owner = "client!sk", name = "u", descriptor = "[I")
	public static final int[] anIntArray403 = new int[13];

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)I")
	public static int method5431(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method5432(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(10) DelayedStateChange local10 = Static316.method5413(3, arg0);
		local10.method2311();
		local10.aString21 = arg1;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZIILjava/lang/String;)I")
	public static int method5433(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg1.length();
		for (@Pc(40) int local40 = 0; local40 < local33; local40++) {
			@Pc(46) char local46 = arg1.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(78) int local78;
			if (local46 >= '0' && local46 <= '9') {
				local78 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local78 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local78 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local78) {
				throw new NumberFormatException();
			}
			if (local26) {
				local78 = -local78;
			}
			@Pc(130) int local130 = local78 + arg0 * local30;
			if (local130 / arg0 != local30) {
				throw new NumberFormatException();
			}
			local28 = true;
			local30 = local130;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V")
	public static void method5435() {
		if (LoginManager.loginStep == 5) {
			LoginManager.loginStep = 6;
		}
	}
}
