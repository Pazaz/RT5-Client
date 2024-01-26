package jaclib.peer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/peer/Peer")
public abstract class Peer {

	// $FF: synthetic field
	@OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "Ljava/lang/Class;")
	private static Class a;

	@OriginalMember(owner = "client!jaclib/peer/Peer", name = "reference", descriptor = "Lclient!jaclib/peer/PeerReference;")
	protected PeerReference reference;

	static {
		init(a == null ? (a = a("jaclib.peer.PeerReference")) : a);
	}

	@OriginalMember(owner = "client!jaclib/peer/Peer", name = "init", descriptor = "(Ljava/lang/Class;)V")
	private static native void init(@OriginalArg(0) Class arg0);

	@OriginalMember(owner = "client!jaclib/peer/Peer", name = "z", descriptor = "(Ljava/lang/String;)[C")
	private static char[] z(@OriginalArg(0) String arg0) {
		@Pc(1) char[] local1 = arg0.toCharArray();
		if (local1.length < 2) {
			local1[0] = (char) (local1[0] ^ 0x37);
		}
		return local1;
	}

	@OriginalMember(owner = "client!jaclib/peer/Peer", name = "z", descriptor = "([C)Ljava/lang/String;")
	private static String z(@OriginalArg(0) char[] arg0) {
		@Pc(2) int local2 = arg0.length;
		@Pc(0) char[] local0 = arg0;
		@Pc(3) int local3 = local2;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(10) char local10 = local0[local5];
			@Pc(15) byte local15;
			switch(local5 % 5) {
				case 0:
					local15 = 83;
					break;
				case 1:
					local15 = 93;
					break;
				case 2:
					local15 = 47;
					break;
				case 3:
					local15 = 54;
					break;
				default:
					local15 = 55;
			}
			local0[local5] = (char) (local10 ^ local15);
		}
		return (new String(local0)).intern();
	}

	@OriginalMember(owner = "client!jaclib/peer/Peer", name = "<init>", descriptor = "()V")
	protected Peer() {
	}

	@OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "()J")
	protected long a() {
		return this.reference.b(0);
	}

	@OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "(B)Z")
	protected final boolean a(@OriginalArg(0) byte arg0) {
		return this.reference.a(0);
	}
}
