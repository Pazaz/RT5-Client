import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "F")
	public static float aFloat123 = 1024.0F;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	public static int anInt7201 = 503;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_177 = new Class225(49, 1);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZI)V")
	public static void method6461(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub19 local13 = Static293.method4335(Static288.aClass345_58, Static405.aClass153_2.aIsaacRandom_1);
		local13.aPacketBit_1.p4_alt3(arg1);
		local13.aPacketBit_1.p2_alt3(arg0);
		Static405.aClass153_2.method3275(local13);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)V")
	public static void method6462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class2_Sub2_Sub2 local9 = Static440.method5963(4, (long) arg3);
		local9.method202();
		local9.anInt192 = arg2;
		local9.anInt197 = arg1;
		local9.anInt195 = arg0;
	}
}
