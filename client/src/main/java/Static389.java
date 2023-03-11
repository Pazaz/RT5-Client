import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!wo", name = "M", descriptor = "Lclient!r;")
	public static Class197 aClass197_66;

	@OriginalMember(owner = "client!wo", name = "J", descriptor = "I")
	public static int anInt4896 = 0;

	@OriginalMember(owner = "client!wo", name = "K", descriptor = "I")
	public static int anInt4897 = 2;

	@OriginalMember(owner = "client!wo", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString53 = null;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIII)V")
	public static void method4487(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 + 1;
		Static101.method2163(arg1, Static357.anIntArrayArray58[arg2], arg4, arg0);
		@Pc(18) int local18 = arg3 - 1;
		Static101.method2163(arg1, Static357.anIntArrayArray58[arg3], arg4, arg0);
		for (@Pc(29) int local29 = local9; local29 <= local18; local29++) {
			@Pc(35) int[] local35 = Static357.anIntArrayArray58[local29];
			local35[arg0] = local35[arg1] = arg4;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/lang/String;IIIZJIIZZLjava/lang/String;)V")
	public static void method4488(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) long arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) String arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(28) Buffer local28 = new Buffer(128);
		local28.p1(10);
		local28.method4843((arg7 ? 4 : 0) | (arg8 ? 2 : 0) | (arg3 ? 1 : 0));
		local28.method4832(arg4);
		local28.p4(local8[0]);
		local28.method4822(arg0);
		local28.p4(local8[1]);
		local28.method4843(client.affiliate);
		local28.p1(arg1);
		local28.p1(arg6);
		local28.p4(local8[2]);
		local28.method4843(arg5);
		local28.method4843(arg2);
		local28.p4(local8[3]);
		local28.method4834(Static320.aBigInteger2, Static194.aBigInteger1);
		@Pc(118) Buffer local118 = new Buffer(350);
		local118.method4822(arg9);
		@Pc(131) int local131 = 8 - Static27.method872(arg9) % 8;
		for (@Pc(133) int local133 = 0; local133 < local131; local133++) {
			local118.p1((int) (Math.random() * 255.0D));
		}
		local118.method4862(local8);
		Protocol.outboundBuffer.position = 0;
		Protocol.outboundBuffer.p1(Static43.aClass242_8.anInt7038);
		Protocol.outboundBuffer.method4843(local28.position + local118.position + 2);
		Protocol.outboundBuffer.method4843(578);
		Protocol.outboundBuffer.method4857(local28.aByteArray73, local28.position);
		Protocol.outboundBuffer.method4857(local118.aByteArray73, local118.position);
		Static141.anInt2652 = 1;
		Static66.anInt1625 = 0;
		Static318.anInt5968 = -3;
		Static327.anInt6109 = 0;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V")
	public static void method4490() {
		Static286.method4921();
		Static65.aClass19_3 = null;
		Static24.aClass42_2 = null;
		Static332.aClass21ArrayArray3 = null;
		Static79.aClass42_4 = null;
		Static62.aClass42_5 = null;
	}
}
