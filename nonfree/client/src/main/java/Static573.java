import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZJIZ)Ljava/lang/String;")
	public static String method7571(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3) {
		@Pc(5) char local5 = ',';
		@Pc(19) char local19 = '.';
		if (arg0 == 0) {
			local5 = '.';
			local19 = ',';
		}
		if (arg0 == 2) {
			local19 = ' ';
		}
		@Pc(32) boolean local32 = false;
		if (arg2 < 0L) {
			arg2 = -arg2;
			local32 = true;
		}
		@Pc(48) StringBuffer local48 = new StringBuffer(26);
		@Pc(55) int local55;
		@Pc(59) int local59;
		if (arg3 > 0) {
			for (local55 = 0; local55 < arg3; local55++) {
				local59 = (int) arg2;
				arg2 /= 10L;
				local48.append((char) (local59 + 48 - (int) arg2 * 10));
			}
			local48.append(local5);
		}
		local55 = 0;
		while (true) {
			local59 = (int) arg2;
			arg2 /= 10L;
			local48.append((char) (local59 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local32) {
					local48.append('-');
				}
				return local48.reverse().toString();
			}
			if (arg1) {
				local55++;
				if (local55 % 3 == 0) {
					local48.append(local19);
				}
			}
		}
	}
}
