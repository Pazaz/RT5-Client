import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
	public static int anInt5747;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "Lclient!mi;")
	public static final Class130 aClass130_36 = new Class130();

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "Lclient!sf;")
	public static final Class183 aClass183_30 = new Class183(512);

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString210 = "Loaded client variable data";

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "J")
	public static long aLong178 = 0L;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	public static void method4900() {
		if (Static189.aFloat55 < 1024.0F) {
			Static189.aFloat55 = 1024.0F;
		}
		if (Static189.aFloat55 > 3072.0F) {
			Static189.aFloat55 = 3072.0F;
		}
		while (Static188.aFloat17 >= 16384.0F) {
			Static188.aFloat17 -= 16384.0F;
		}
		while (Static188.aFloat17 < 0.0F) {
			Static188.aFloat17 += 16384.0F;
		}
		@Pc(41) int local41 = Static142.anInt3529 >> 7;
		@Pc(50) int local50 = Static12.anInt536 >> 7;
		@Pc(56) int local56 = Static309.method5429(Static12.anInt536, Static142.anInt3529, Static39.anInt1215);
		@Pc(58) int local58 = 0;
		@Pc(76) int local76;
		if (local41 > 3 && local50 > 3 && local41 < 100 && local50 < 100) {
			for (local76 = local41 - 4; local76 <= local41 + 4; local76++) {
				for (@Pc(82) int local82 = local50 - 4; local82 <= local50 + 4; local82++) {
					@Pc(86) int local86 = Static39.anInt1215;
					if (local86 < 3 && Static146.method3193(local82, local76)) {
						local86++;
					}
					@Pc(99) int local99 = 0;
					if (Static39.aByteArrayArrayArray2 != null && Static39.aByteArrayArrayArray2[local86] != null) {
						local99 = (Static39.aByteArrayArrayArray2[local86][local76][local82] & 0xFF) * 8;
					}
					@Pc(128) int local128 = local99 + local56 - Static118.aClass77Array1[local86].method3986(local76, local82);
					if (local58 < local128) {
						local58 = local128;
					}
				}
			}
		}
		local76 = local58 * 1536;
		if (local76 > 786432) {
			local76 = 786432;
		}
		if (local76 < 262144) {
			local76 = 262144;
		}
		if (local76 > Static96.anInt2440) {
			Static96.anInt2440 += (local76 - Static96.anInt2440) / 24;
		} else if (Static96.anInt2440 > local76) {
			Static96.anInt2440 += (local76 - Static96.anInt2440) / 80;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIZZ)Lclient!qj;")
	public static Class162 method4901(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) boolean arg2) {
		@Pc(15) Class96 local15 = null;
		if (Static330.aClass167_7 != null) {
			local15 = new Class96(arg0, Static330.aClass167_7, Static262.aClass167Array1[arg0], 1000000);
		}
		Static265.aClass26_Sub1Array1[arg0] = Static47.aClass180_1.method4939(arg0, Static58.aClass96_1, local15);
		if (arg1) {
			Static265.aClass26_Sub1Array1[arg0].method3374();
		}
		return new Class162(Static265.aClass26_Sub1Array1[arg0], arg2, 1);
	}
}
