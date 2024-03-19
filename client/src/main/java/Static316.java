import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "[Lclient!qa;")
	public static Class29[] aClass29Array15;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "Lclient!pp;")
	public static Class157 aClass157_2;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
	public static void method5517() {
		@Pc(17) int local17 = Static1.method54();
		if (local17 == 0) {
			Static233.aByteArrayArrayArray13 = null;
			Static282.method5034(0);
		} else if (local17 == 1) {
			Static183.method3714((byte) 0);
			Static282.method5034(512);
			if (Static62.aByteArrayArrayArray3 != null) {
				Static187.method3761();
			}
		} else {
			Static183.method3714((byte) (Static135.anInt7217 - 4 & 0xFF));
			Static282.method5034(2);
		}
		Static189.anInt4391 = Static39.anInt1215;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/lang/String;IZI)I")
	public static int method5518(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1) {
		@Pc(29) boolean local29 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg0.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(44) char local44 = arg0.charAt(local38);
			if (local38 == 0) {
				if (local44 == '-') {
					local29 = true;
					continue;
				}
				if (local44 == '+') {
					continue;
				}
			}
			@Pc(81) int local81;
			if (local44 >= '0' && local44 <= '9') {
				local81 = local44 - '0';
			} else if (local44 >= 'A' && local44 <= 'Z') {
				local81 = local44 - '7';
			} else if (local44 >= 'a' && local44 <= 'z') {
				local81 = local44 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local81 >= arg1) {
				throw new NumberFormatException();
			}
			if (local29) {
				local81 = -local81;
			}
			@Pc(121) int local121 = local81 + arg1 * local33;
			if (local33 != local121 / arg1) {
				throw new NumberFormatException();
			}
			local31 = true;
			local33 = local121;
		}
		if (!local31) {
			throw new NumberFormatException();
		}
		return local33;
	}
}
