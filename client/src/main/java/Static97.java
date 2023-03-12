import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!fk", name = "Z", descriptor = "I")
	public static int anInt2034;

	@OriginalMember(owner = "client!fk", name = "Ab", descriptor = "I")
	public static int anInt2052;

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
	public static int anInt2005 = 0;

	@OriginalMember(owner = "client!fk", name = "lb", descriptor = "I")
	public static int anInt2040 = -50;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)V")
	public static void method2087(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		LoginManager.username = arg1;
		Static202.anInt3714 = arg2;
		LoginManager.password = arg0;
		if (LoginManager.username.equals("") || LoginManager.password.equals("")) {
			LoginManager.reply = 3;
		} else if (client.worldId == -1) {
			Static60.anInt666 = 0;
			Static154.anInt2803 = 1;
			LoginManager.reply = -3;
			Static193.anInt3557 = 0;
			@Pc(40) Buffer local40 = new Buffer(128);
			local40.p1(10);
			local40.p4((int) (Math.random() * 9.9999999E7D));
			local40.p8(StringUtils.toBase37(LoginManager.username));
			local40.p4((int) (Math.random() * 9.9999999E7D));
			local40.pjstr(LoginManager.password);
			local40.p4((int) (Math.random() * 9.9999999E7D));
			local40.rsaenc(Protocol.EXPONENT, Protocol.MODULUS);
			Protocol.outboundBuffer.pos = 0;
			Protocol.outboundBuffer.p1(Static43.aClass242_10.opcode);
			Protocol.outboundBuffer.p1(local40.pos + 2);
			Protocol.outboundBuffer.p2(578);
			Protocol.outboundBuffer.pdata(local40.data, local40.pos);
		} else {
			Static230.method4014();
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method2095(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIII)V")
	public static void method2096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static28.anInt675 <= arg5 - arg0 && arg5 + arg0 <= Static82.anInt1837 && arg4 - arg0 >= Static365.anInt6832 && Static161.anInt2954 >= arg0 + arg4) {
			Static37.method1136(arg3, arg5, arg1, arg4, arg0, arg2);
		} else {
			Static260.method6016(arg1, arg4, arg0, arg3, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!ag;BLclient!ag;)V")
	public static void method2100(@OriginalArg(0) Node arg0, @OriginalArg(2) Node arg1) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = arg1.prev;
		arg0.next = arg1;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)I")
	public static int method2101(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static376.method6285(arg0);
	}
}
