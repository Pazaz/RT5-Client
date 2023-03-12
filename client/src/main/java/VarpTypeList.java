import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class VarpTypeList {

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!hu;")
	private final LruHashTable aClass98_43 = new LruHashTable(64);

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Lclient!r;")
	private final Js5 aClass197_76;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
	public final int anInt5596;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public VarpTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass197_76 = arg2;
		if (this.aClass197_76 == null) {
			this.anInt5596 = 0;
		} else {
			this.anInt5596 = this.aClass197_76.getGroupCapacity(16);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public void method5108() {
		@Pc(2) LruHashTable local2 = this.aClass98_43;
		synchronized (this.aClass98_43) {
			this.aClass98_43.method2614();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V")
	public void method5109() {
		@Pc(14) LruHashTable local14 = this.aClass98_43;
		synchronized (this.aClass98_43) {
			this.aClass98_43.clean(5);
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	public void method5112() {
		@Pc(14) LruHashTable local14 = this.aClass98_43;
		synchronized (this.aClass98_43) {
			this.aClass98_43.method2621();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)Lclient!ok;")
	public Class171 method5114(@OriginalArg(0) int arg0) {
		@Pc(6) LruHashTable local6 = this.aClass98_43;
		@Pc(16) Class171 local16;
		synchronized (this.aClass98_43) {
			local16 = (Class171) this.aClass98_43.get((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass197_76.fetchFile(arg0, 16);
		local16 = new Class171();
		if (local33 != null) {
			local16.method4370(new Buffer(local33));
		}
		@Pc(49) LruHashTable local49 = this.aClass98_43;
		synchronized (this.aClass98_43) {
			this.aClass98_43.put((long) arg0, local16);
			return local16;
		}
	}
}
