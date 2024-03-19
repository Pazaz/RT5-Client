import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!ma", name = "P", descriptor = "I")
	public static int anInt4291;

	@OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
	public static int anInt4292;

	@OriginalMember(owner = "client!ma", name = "S", descriptor = "Lclient!qj;")
	public static Class162 aClass162_149;

	@OriginalMember(owner = "client!ma", name = "D", descriptor = "I")
	public static int anInt4287 = 0;

	@OriginalMember(owner = "client!ma", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString157 = "Continue";

	@OriginalMember(owner = "client!ma", name = "O", descriptor = "Lclient!we;")
	public static final Class215 aClass215_60 = new Class215(64);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!qj;I)V")
	public static void method3695(@OriginalArg(0) Class162 arg0) {
		Static220.aClass162_178 = arg0;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIZI)V")
	public static void method3696(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(9) Class157 local9 = Static185.aClass157ArrayArray1[arg0][arg1];
		Static215.method4213(5000, local9 == null ? Static316.aClass157_2 : local9);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V")
	public static void method3698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class183 local10 = new Class183(16);
		for (@Pc(15) Class1_Sub11 local15 = (Class1_Sub11) Static208.aClass183_24.method5052(); local15 != null; local15 = (Class1_Sub11) Static208.aClass183_24.method5050()) {
			local15.method6172();
			@Pc(26) int local26 = (int) (local15.aLong235 >> 28);
			@Pc(37) int local37 = (int) (local15.aLong235 >> 14 & 0x3FFFL) - arg0;
			@Pc(46) int local46 = (int) (local15.aLong235 & 0x3FFFL) - arg1;
			if (local46 >= 0 && local37 >= 0 && Static25.anInt850 > local46 && Static219.anInt4987 > local37) {
				local10.method5055((long) (local26 << 28 | local37 << 14 | local46), local15);
			}
		}
		Static208.aClass183_24 = local10;
	}
}
