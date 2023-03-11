import org.openrs2.deob.annotation.OriginalMember;

public class Protocol {

	@OriginalMember(owner = "client!on", name = "g", descriptor = "Lclient!qg;")
	public static final Packet outboundBuffer = new Packet(5000);

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "Lclient!cc;")
	public static PrivilegedRequest socketRequest = null;

	@OriginalMember(owner = "client!ti", name = "A", descriptor = "Lclient!iu;")
	public static Class111 socket;

}
