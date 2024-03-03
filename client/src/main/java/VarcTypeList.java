import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class VarcTypeList {

	@OriginalMember(owner = "client!df", name = "h", descriptor = "Lclient!hu;")
	private final LruHashTable aClass98_4 = new LruHashTable(64);

	@OriginalMember(owner = "client!df", name = "j", descriptor = "Lclient!r;")
	private final Js5 aClass197_10;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "I")
	public final int anInt1466;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public VarcTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass197_10 = arg2;
		this.anInt1466 = this.aClass197_10.getGroupCapacity(19);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)Lclient!cr;")
	public VarcType get(@OriginalArg(1) int arg0) {
		@Pc(6) LruHashTable local6 = this.aClass98_4;
		@Pc(16) VarcType local16;
		synchronized (this.aClass98_4) {
			local16 = (VarcType) this.aClass98_4.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass197_10.fetchFile(arg0, 19);
		local16 = new VarcType();
		if (local33 != null) {
			local16.decode(new Packet(local33));
		}
		@Pc(54) LruHashTable local54 = this.aClass98_4;
		synchronized (this.aClass98_4) {
			this.aClass98_4.put((long) arg0, local16);
			return local16;
		}
	}
}
