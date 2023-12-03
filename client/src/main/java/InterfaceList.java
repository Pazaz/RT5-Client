import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class InterfaceList {

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "Lclient!ld;")
	public static final LinkedList highPriorityRequests = new LinkedList();
	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!ld;")
	public static final LinkedList mediumPriorityRequests = new LinkedList();
	@OriginalMember(owner = "client!pp", name = "w", descriptor = "Lclient!ld;")
	public static final LinkedList lowPriorityRequests = new LinkedList();
	@OriginalMember(owner = "client!pi", name = "e", descriptor = "Z")
	public static boolean aBoolean371 = false;
	@OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
	public static int miscTransmitAt = 0;
	@OriginalMember(owner = "client!es", name = "d", descriptor = "I")
	public static int transmitTimer = 1;
	@OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
	public static int anInt6449 = 0;
	@OriginalMember(owner = "client!tc", name = "Y", descriptor = "Lclient!ad;")
	public static HashTable subInterfaces = new HashTable(8);

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!r;BLclient!r;Lclient!r;Lclient!r;)V")
	public static void init(@OriginalArg(0) Js5 arg0, @OriginalArg(2) Js5 arg1, @OriginalArg(3) Js5 arg2, @OriginalArg(4) Js5 arg3) {
		Static79.aClass197_19 = arg3;
		Static283.aClass197_68 = arg2;
		Static142.aClass197_37 = arg1;
		Static391.aClass197_95 = arg0;
		Static26.components = new Component[Static283.aClass197_68.capacity()][];
		Static128.aBooleanArray21 = new boolean[Static283.aClass197_68.capacity()];
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(BI)Lclient!nk;")
	public static Component getComponent(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 >> 16;
		@Pc(19) int local19 = arg0 & 0xFFFF;
		if (Static26.components[local15] == null || Static26.components[local15][local19] == null) {
			@Pc(33) boolean local33 = Static222.load(local15);
			if (!local33) {
				return null;
			}
		}
		return Static26.components[local15][local19];
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!nk;B)V")
	public static void redraw(@OriginalArg(0) Component arg0) {
		if (Static132.anInt2468 == arg0.anInt4268) {
			Static357.aBooleanArray59[arg0.anInt4257] = true;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!nk;B)V")
	public static void update(@OriginalArg(0) Component arg0) {
		@Pc(7) Component local7 = Static7.method6465(arg0);
		@Pc(13) int local13;
		@Pc(11) int local11;
		if (local7 == null) {
			local11 = GameShell.canvasHeight;
			local13 = GameShell.canvasWidth;
		} else {
			local11 = local7.height;
			local13 = local7.width;
		}
		Static371.method6256(local11, local13, false, arg0);
		Static287.method4939(arg0, local13, local11);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIB)Lclient!nk;")
	public static Component getCreatedComponent(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Component local7 = getComponent(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.activeComponents == null || arg1 >= local7.activeComponents.length) {
			return null;
		} else {
			return local7.activeComponents[arg1];
		}
	}

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!nk;)Lclient!eh;")
    public static ServerActiveProperties getServerActiveProperties(@OriginalArg(0) Component arg0) {
        @Pc(13) ServerActiveProperties local13 = (ServerActiveProperties) Static327.properties.get(((long) arg0.id << 32) + (long) arg0.activeComponentId);
        return local13 == null ? arg0.properties : local13;
    }

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)V")
	public static void closeModal() {
		Protocol.writeOpcode(ClientProt.CLOSE_MODAL);
		for (@Pc(21) SubInterface local21 = (SubInterface) subInterfaces.head(); local21 != null; local21 = (SubInterface) subInterfaces.next()) {
			if (!local21.isLinked()) {
				local21 = (SubInterface) subInterfaces.head();
				if (local21 == null) {
					break;
				}
			}
			if (local21.anInt1373 == 0) {
				Static276.method4655(true, local21, true);
			}
		}
		if (Static192.aClass161_8 != null) {
			redraw(Static192.aClass161_8);
			Static192.aClass161_8 = null;
		}
	}
}
