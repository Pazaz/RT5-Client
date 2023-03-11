import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "Lclient!ld;")
	public static final Class135 aClass135_40 = new Class135();

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!qg;)V")
	public static void method6120(@OriginalArg(1) Class2_Sub4_Sub2 arg0) {
		arg0.method4869();
		@Pc(10) int local10 = Static234.anInt4226;
		@Pc(20) Class11_Sub5_Sub2_Sub1 local20 = Static17.aClass11_Sub5_Sub2_Sub1_3 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local10] = new Class11_Sub5_Sub2_Sub1();
		local20.anInt4619 = local10;
		@Pc(28) int local28 = arg0.method4868(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(43) int local43 = local28 & 0x3FFF;
		local20.anIntArray316[0] = local39 - Static164.anInt3140;
		local20.anInt6781 = (local20.anIntArray316[0] << 7) + (local20.method4328() << 6);
		local20.anIntArray317[0] = local43 - Static148.anInt2719;
		local20.anInt6783 = (local20.anIntArray317[0] << 7) + (local20.method4328() << 6);
		Static355.anInt6585 = local20.aByte78 = local33;
		if (Static231.aClass2_Sub4Array1[local10] != null) {
			local20.method4066(Static231.aClass2_Sub4Array1[local10]);
		}
		Static31.anInt751 = 0;
		Static85.anIntArray121[Static31.anInt751++] = local10;
		Static36.aByteArray7[local10] = 0;
		Static192.anInt3547 = 0;
		for (@Pc(124) int local124 = 1; local124 < 2048; local124++) {
			if (local124 != local10) {
				@Pc(138) int local138 = arg0.method4868(18);
				@Pc(142) int local142 = local138 >> 16;
				@Pc(148) int local148 = local138 >> 8 & 0xFF;
				@Pc(152) int local152 = local138 & 0xFF;
				Static360.anIntArray422[local124] = (local142 << 28) - (-(local148 << 14) - local152);
				Static324.anIntArray410[local124] = 0;
				Static225.anIntArray260[local124] = -1;
				Static239.anIntArray284[Static192.anInt3547++] = local124;
				Static36.aByteArray7[local124] = 0;
			}
		}
		arg0.method4865();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!nk;I)V")
	public static void method6129(@OriginalArg(0) Class161 arg0) {
		if (!Static330.aBoolean419) {
			return;
		}
		Static91.method1960(Static105.aClass145_79);
		Protocol.outboundBuffer.p4(arg0.anInt4317);
		Protocol.outboundBuffer.p2add(arg0.anInt4297);
		Protocol.outboundBuffer.p2add(Static214.anInt3792);
		Protocol.outboundBuffer.p2(Static196.anInt3317);
		Protocol.outboundBuffer.mp4(Static337.anInt6317);
		Protocol.outboundBuffer.p2(arg0.anInt4300);
	}
}
