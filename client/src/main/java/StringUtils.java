import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class StringUtils {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)I")
	public static int compare(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(22) char local22 = 0;
		@Pc(24) char local24 = 0;
		while (local8 > local13 - local22 || local15 - local24 < local11) {
			if (local13 - local22 >= local8) {
				return -1;
			}
			if (local15 - local24 >= local11) {
				return 1;
			}
			@Pc(61) char local61;
			if (local22 == '\u0000') {
				local61 = arg1.charAt(local13++);
			} else {
				local61 = local22;
			}
			@Pc(74) char local74;
			if (local24 == '\u0000') {
				local74 = arg0.charAt(local15++);
			} else {
				local74 = local24;
			}
			local22 = Static391.method6455(local61);
			local24 = Static391.method6455(local74);
			local61 = Static135.method2536(arg2, local61);
			local74 = Static135.method2536(arg2, local74);
			if (local61 != local74 && Character.toUpperCase(local61) != Character.toUpperCase(local74)) {
				local61 = Character.toLowerCase(local61);
				local74 = Character.toLowerCase(local74);
				if (local61 != local74) {
					return Static172.method3288(local61, arg2) - Static172.method3288(local74, arg2);
				}
			}
		}
		@Pc(145) int local145 = Math.min(local8, local11);
		for (@Pc(147) int local147 = 0; local147 < local145; local147++) {
			if (arg2 == 2) {
				local15 = local11 - local147 - 1;
				local13 = local8 - local147 - 1;
			} else {
				local15 = local147;
				local13 = local147;
			}
			@Pc(178) char local178 = arg1.charAt(local13);
			@Pc(182) char local182 = arg0.charAt(local15);
			if (local182 != local178 && Character.toUpperCase(local178) != Character.toUpperCase(local182)) {
				local178 = Character.toLowerCase(local178);
				local182 = Character.toLowerCase(local182);
				if (local178 != local182) {
					return Static172.method3288(local178, arg2) - Static172.method3288(local182, arg2);
				}
			}
		}
		@Pc(226) int local226 = local8 - local11;
		if (local226 != 0) {
			return local226;
		}
		for (@Pc(235) int local235 = 0; local235 < local145; local235++) {
			@Pc(241) char local241 = arg1.charAt(local235);
			@Pc(245) char local245 = arg0.charAt(local235);
			if (local245 != local241) {
				return Static172.method3288(local241, arg2) - Static172.method3288(local245, arg2);
			}
		}
		return 0;
	}

}
