import org.openrs2.deob.annotation.OriginalMember;

public final class Static43 {

	@OriginalMember(owner = "client!ck", name = "J", descriptor = "[S")
	public static short[] aShortArray20;

	@OriginalMember(owner = "client!ck", name = "U", descriptor = "Lclient!r;")
	public static Class197 aClass197_7;

	@OriginalMember(owner = "client!ck", name = "B", descriptor = "Lclient!h;")
	public static final InboundPacket aClass89_39 = new InboundPacket(34, 15);

	@OriginalMember(owner = "client!ck", name = "H", descriptor = "[I")
	public static final int[] anIntArray87 = new int[5];

	@OriginalMember(owner = "client!ck", name = "K", descriptor = "Lclient!vr;")
	public static final OutboundPacket JS5 = new OutboundPacket(15, 4);

	@OriginalMember(owner = "client!ck", name = "L", descriptor = "Lclient!vr;")
	public static final OutboundPacket WORLD_CONNECT = new OutboundPacket(16, -2);

	@OriginalMember(owner = "client!ck", name = "M", descriptor = "Lclient!vr;")
	public static final OutboundPacket aClass242_4 = new OutboundPacket(17, 0);

	@OriginalMember(owner = "client!ck", name = "N", descriptor = "Lclient!vr;")
	public static final OutboundPacket WORLD_RECONNECT = new OutboundPacket(18, -2);

	@OriginalMember(owner = "client!ck", name = "R", descriptor = "Lclient!vr;")
	public static final OutboundPacket GET_WORLDLIST = new OutboundPacket(23, 4);

	@OriginalMember(owner = "client!ck", name = "S", descriptor = "Lclient!vr;")
	public static final OutboundPacket aClass242_10 = new OutboundPacket(24, -1);

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)[Lclient!vr;")
	public static OutboundPacket[] method3371() {
		return new OutboundPacket[] { LoginManager.LOGIN, JS5, WORLD_CONNECT, aClass242_4, WORLD_RECONNECT, CreateManager.REGISTER_STEP1, CreateManager.VALIDATE_USERNAME, CreateManager.REGISTER_STEP2, GET_WORLDLIST, aClass242_10 };
	}

}
