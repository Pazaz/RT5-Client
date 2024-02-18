import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dba", name = "x", descriptor = "Lclient!dg;")
	public static Class78 aClass78_1;

	@OriginalMember(owner = "client!dba", name = "z", descriptor = "I")
	public static int anInt2077;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Ljava/net/Socket;IB)Lclient!vn;")
	public static Class348 method1975(@OriginalArg(0) Socket arg0) throws IOException {
		return new Class348_Sub1(arg0, 15000);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method1977(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) long local31 = arg0; local31 != 0L; local31 /= 37L) {
				local29++;
			}
			@Pc(56) StringBuffer local56 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(59) long local59 = arg0;
				arg0 /= 37L;
				@Pc(73) char local73 = Static333.aCharArray4[(int) (local59 - arg0 * 37L)];
				if (local73 == '_') {
					@Pc(83) int local83 = local56.length() - 1;
					local56.setCharAt(local83, Character.toUpperCase(local56.charAt(local83)));
					local73 = ' ';
				}
				local56.append(local73);
			}
			local56.reverse();
			local56.setCharAt(0, Character.toUpperCase(local56.charAt(0)));
			return local56.toString();
		}
	}
}
