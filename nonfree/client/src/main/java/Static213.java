import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
	public static int anInt3469;

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
	public static int anInt3475;

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
	public static int anInt3470 = 0;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
	public static int anInt3471 = 0;

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
	public static int anInt3472 = 0;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([BIIIII)Z")
	public static boolean method3141(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) boolean local5 = true;
		@Pc(10) Class2_Sub21 local10 = new Class2_Sub21(arg0);
		@Pc(12) int local12 = -1;
		label54: while (true) {
			@Pc(16) int local16 = local10.method7345();
			if (local16 == 0) {
				return local5;
			}
			local12 += local16;
			@Pc(24) int local24 = 0;
			@Pc(26) boolean local26 = false;
			while (true) {
				@Pc(32) int local32;
				while (!local26) {
					local32 = local10.method7390();
					if (local32 == 0) {
						continue label54;
					}
					local24 += local32 - 1;
					@Pc(59) int local59 = local24 & 0x3F;
					@Pc(65) int local65 = local24 >> 6 & 0x3F;
					@Pc(71) int local71 = local10.method7396() >> 2;
					@Pc(75) int local75 = arg1 + local65;
					@Pc(79) int local79 = local59 + arg3;
					if (local75 > 0 && local79 > 0 && arg2 - 1 > local75 && arg4 - 1 > local79) {
						@Pc(111) Class54 local111 = Static354.aClass142_4.method3063(local12, 109);
						if (local71 != 22 || Static400.aClass2_Sub34_28.aClass57_Sub6_1.method2714() != 0 || local111.anInt1271 != 0 || local111.anInt1242 == 1 || local111.aBoolean101) {
							local26 = true;
							if (!local111.method1302()) {
								local5 = false;
								Static13.anInt150++;
							}
						}
					}
				}
				local32 = local10.method7390();
				if (local32 == 0) {
					break;
				}
				local10.method7396();
			}
		}
	}
}
