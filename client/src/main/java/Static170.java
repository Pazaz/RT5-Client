import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!js", name = "O", descriptor = "I")
	public static int anInt3229;

	@OriginalMember(owner = "client!js", name = "J", descriptor = "Lclient!h;")
	public static final Class89 aClass89_136 = new Class89(73, 6);

	@OriginalMember(owner = "client!js", name = "Q", descriptor = "[B")
	public static final byte[] aByteArray33 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method3229(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(37) int local37 = 0;
			for (@Pc(39) long local39 = arg0; local39 != 0L; local39 /= 37L) {
				local37++;
			}
			@Pc(55) StringBuffer local55 = new StringBuffer(local37);
			while (arg0 != 0L) {
				@Pc(59) long local59 = arg0;
				arg0 /= 37L;
				@Pc(73) char local73 = Static349.aCharArray6[(int) (local59 - arg0 * 37L)];
				if (local73 == '_') {
					@Pc(83) int local83 = local55.length() - 1;
					local73 = ' ';
					local55.setCharAt(local83, Character.toUpperCase(local55.charAt(local83)));
				}
				local55.append(local73);
			}
			local55.reverse();
			local55.setCharAt(0, Character.toUpperCase(local55.charAt(0)));
			return local55.toString();
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!bu;[[B)V")
	public static void method3231(@OriginalArg(1) Class29_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(8) int local8 = Static106.aByteArrayArray6.length;
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(24) byte[] local24 = arg1[local18];
			if (local24 != null) {
				@Pc(37) int local37 = (Static291.anIntArray372[local18] >> 8) * 64 - Static164.anInt3140;
				@Pc(48) int local48 = (Static291.anIntArray372[local18] & 0xFF) * 64 - Static148.anInt2719;
				Static37.method1135();
				arg0.method1109(Static171.aClass46Array1, local48, local24, local37, Static190.aClass19_8);
			}
		}
	}
}
