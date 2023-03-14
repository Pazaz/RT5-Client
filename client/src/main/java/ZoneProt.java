import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public final class ZoneProt {

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "Lclient!s;")
	public static final ZoneProt PACKET_0 = new ZoneProt(0, 4);
	@OriginalMember(owner = "client!pk", name = "lb", descriptor = "Lclient!s;")
	public static final ZoneProt PACKET_1 = new ZoneProt(1, 15);
	@OriginalMember(owner = "client!gb", name = "o", descriptor = "Lclient!s;")
	public static final ZoneProt PACKET_2 = new ZoneProt(2, 5);
	@OriginalMember(owner = "client!gd", name = "e", descriptor = "Lclient!s;")
	public static final ZoneProt PACKET_3 = new ZoneProt(3, -1);
	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Lclient!s;")
	public static final ZoneProt PACKET_4 = new ZoneProt(4, 3);
	@OriginalMember(owner = "client!nr", name = "d", descriptor = "Lclient!s;")
	public static final ZoneProt PACKET_5 = new ZoneProt(5, 2);
	@OriginalMember(owner = "client!bc", name = "f", descriptor = "Lclient!s;")
	public static final ZoneProt PACKET_6 = new ZoneProt(6, 15);
	@OriginalMember(owner = "client!lo", name = "l", descriptor = "Lclient!s;")
	public static final ZoneProt PACKET_7 = new ZoneProt(7, 4);
	@OriginalMember(owner = "client!jl", name = "cb", descriptor = "Lclient!s;")
	public static final ZoneProt PACKET_8 = new ZoneProt(8, 6);
	@OriginalMember(owner = "client!vr", name = "d", descriptor = "Lclient!s;")
	public static final ZoneProt PACKET_9 = new ZoneProt(9, 17);
	@OriginalMember(owner = "client!tg", name = "I", descriptor = "Lclient!s;")
	public static final ZoneProt PACKET_10 = new ZoneProt(10, 6);
	@OriginalMember(owner = "client!bk", name = "g", descriptor = "Lclient!s;")
	public static final ZoneProt PACKET_11 = new ZoneProt(11, 3);
	@OriginalMember(owner = "client!qj", name = "m", descriptor = "Lclient!s;")
	public static final ZoneProt PACKET_12 = new ZoneProt(12, 7);
	@OriginalMember(owner = "client!hu", name = "i", descriptor = "Lclient!s;")
	public static final ZoneProt PACKET_13 = new ZoneProt(13, 7);
	@OriginalMember(owner = "client!us", name = "R", descriptor = "Lclient!s;")
	public static final ZoneProt PACKET_14 = new ZoneProt(14, 14);

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(II)V")
	public ZoneProt(@OriginalArg(0) int opcode, @OriginalArg(1) int size) {
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)[Lclient!s;")
	public static ZoneProt[] getAll() {
		return new ZoneProt[] { PACKET_0, PACKET_1, PACKET_2, PACKET_3, PACKET_4, PACKET_5, PACKET_6, PACKET_7, PACKET_8, PACKET_9, PACKET_10, PACKET_11, PACKET_12, PACKET_13, PACKET_14 };
	}

	@OriginalMember(owner = "client!s", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
