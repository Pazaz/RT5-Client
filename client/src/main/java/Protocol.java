import org.openrs2.deob.annotation.OriginalMember;

import java.math.BigInteger;

public class Protocol {

	@OriginalMember(owner = "client!on", name = "g", descriptor = "Lclient!qg;")
	public static final Packet outboundBuffer = new Packet(5000);
	@OriginalMember(owner = "client!ld", name = "n", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger MODULUS = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	@OriginalMember(owner = "client!sm", name = "w", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger EXPONENT = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
	@OriginalMember(owner = "client!mi", name = "m", descriptor = "Lclient!qg;")
	public static final Packet inboundBuffer = new Packet(5000);

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "Lclient!cc;")
	public static PrivilegedRequest socketRequest = null;

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "Lclient!cc;")
	public static PrivilegedRequest socketRequest2;

	@OriginalMember(owner = "client!ti", name = "A", descriptor = "Lclient!iu;")
	public static Class111 socket;

}
