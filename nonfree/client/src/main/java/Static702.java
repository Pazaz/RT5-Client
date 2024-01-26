import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static702 {

	@OriginalMember(owner = "client!wda", name = "n", descriptor = "I")
	public static int anInt10569;

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "Lclient!wda;")
	public static final Class397 aClass397_20 = new Class397(4);

	@OriginalMember(owner = "client!wda", name = "l", descriptor = "Lclient!wda;")
	public static final Class397 aClass397_16 = new Class397(1);

	@OriginalMember(owner = "client!wda", name = "d", descriptor = "Lclient!wda;")
	public static final Class397 aClass397_13 = new Class397(1);

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "Lclient!wda;")
	public static final Class397 aClass397_14 = new Class397(2);

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "Lclient!wda;")
	public static final Class397 aClass397_15 = new Class397(4);

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "Lclient!wda;")
	public static final Class397 aClass397_17 = new Class397(2);

	@OriginalMember(owner = "client!wda", name = "i", descriptor = "Lclient!wda;")
	public static final Class397 aClass397_18 = new Class397(4);

	@OriginalMember(owner = "client!wda", name = "e", descriptor = "Lclient!wda;")
	public static final Class397 aClass397_19 = new Class397(2);

	@OriginalMember(owner = "client!wda", name = "h", descriptor = "Z")
	public static boolean aBoolean797 = false;

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILclient!cg;I)V")
	public static void method9166(@OriginalArg(1) Class8_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArray869 == null) {
			return;
		}
		@Pc(13) int local13 = arg0.anIntArray869[arg1 + 1];
		if (arg0.aClass152_11.method9114() != local13) {
			arg0.aClass152_11.method9098(arg0.aClass152_11.method9087(), local13);
			arg0.anInt10762 = arg0.anInt10764;
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZILjava/lang/String;I)Z")
	public static boolean method9167(@OriginalArg(2) String arg0) {
		if (10 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + 10);
		}
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		@Pc(31) int local31 = 0;
		@Pc(34) int local34 = arg0.length();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(41) char local41 = arg0.charAt(local36);
			if (local36 == 0) {
				if (local41 == '-') {
					local27 = true;
					continue;
				}
				if (local41 == '+' && true) {
					continue;
				}
			}
			@Pc(73) int local73;
			if (local41 >= '0' && local41 <= '9') {
				local73 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local73 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local73 = local41 - 'W';
			} else {
				return false;
			}
			if (local73 >= 10) {
				return false;
			}
			if (local27) {
				local73 = -local73;
			}
			@Pc(124) int local124 = local73 + local31 * 10;
			if (local31 != local124 / 10) {
				return false;
			}
			local31 = local124;
			local29 = true;
		}
		return local29;
	}
}
