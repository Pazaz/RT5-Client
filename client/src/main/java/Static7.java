import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "T", descriptor = "Lclient!qj;")
	public static Class162 aClass162_22;

	@OriginalMember(owner = "client!ag", name = "Q", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
	public static void method225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class154 local7 = Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass7_Sub3_2 != null) {
			local7.aClass7_Sub3_2 = null;
		}
		if (local7.aClass7_Sub3_1 != null) {
			local7.aClass7_Sub3_1 = null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method227(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(36) long local36 = arg0; local36 != 0L; local36 /= 37L) {
				local29++;
			}
			@Pc(54) StringBuffer local54 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				local54.append(Static109.aCharArray11[(int) (local58 - arg0 * 37L)]);
			}
			return local54.reverse().toString();
		}
	}
}
