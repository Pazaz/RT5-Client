import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!la", name = "a", descriptor = "[J")
	public static long[] aLongArray9;

	@OriginalMember(owner = "client!la", name = "v", descriptor = "Lclient!jga;")
	public static final Class192 aClass192_8 = new Class192();

	@OriginalMember(owner = "client!la", name = "u", descriptor = "[I")
	public static final int[] anIntArray433 = new int[1000];

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I")
	public static int method5124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static272.aShortArrayArray5 == null ? 0 : Static272.aShortArrayArray5[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[BIB)Ljava/lang/String;")
	public static String method5126(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(13) char[] local13 = new char[arg2];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg2; local17++) {
			@Pc(26) int local26 = arg1[local17 + arg0] & 0xFF;
			if (local26 != 0) {
				if (local26 >= 128 && local26 < 160) {
					@Pc(44) char local44 = Static376.aCharArray7[local26 - 128];
					if (local44 == '\u0000') {
						local44 = '?';
					}
					local26 = local44;
				}
				local13[local15++] = (char) local26;
			}
		}
		return new String(local13, 0, local15);
	}
}
