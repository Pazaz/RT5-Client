import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class SkyboxTypeList {

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "Lclient!hu;")
	private final LruHashTable aClass98_52 = new LruHashTable(16);

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "Lclient!r;")
	private final Js5 aClass197_83;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public SkyboxTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass197_83 = arg2;
		this.aClass197_83.getGroupCapacity(29);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
	public void method5422() {
		@Pc(10) LruHashTable local10 = this.aClass98_52;
		synchronized (this.aClass98_52) {
			this.aClass98_52.method2621();
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V")
	public void method5423() {
		@Pc(2) LruHashTable local2 = this.aClass98_52;
		synchronized (this.aClass98_52) {
			this.aClass98_52.clean(5);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIILclient!ng;IB)Lclient!dd;")
	public Class43 method5424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) SkyboxSphereTypeList arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class112[] local7 = null;
		@Pc(19) SkyboxType local19 = this.method5427(arg0);
		if (local19.anIntArray484 != null) {
			local7 = new Class112[local19.anIntArray484.length];
			for (@Pc(29) int local29 = 0; local29 < local7.length; local29++) {
				@Pc(41) SkyboxSphereType local41 = arg3.method4031(local19.anIntArray484[local29]);
				local7[local29] = new Class112(local41.anInt2692, local41.anInt2686, local41.anInt2695, local41.anInt2698, local41.anInt2693, local41.anInt2690, local41.anInt2687, local41.aBoolean191);
			}
		}
		return new Class43(local19.anInt7072, local7, local19.anInt7078, arg1, arg2, arg4);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
	public void method5426() {
		@Pc(12) LruHashTable local12 = this.aClass98_52;
		synchronized (this.aClass98_52) {
			this.aClass98_52.method2614();
		}
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)Lclient!wa;")
	private SkyboxType method5427(@OriginalArg(0) int arg0) {
		@Pc(6) LruHashTable local6 = this.aClass98_52;
		@Pc(24) SkyboxType local24;
		synchronized (this.aClass98_52) {
			local24 = (SkyboxType) this.aClass98_52.get((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(41) byte[] local41 = this.aClass197_83.fetchFile(arg0, 29);
		local24 = new SkyboxType();
		if (local41 != null) {
			local24.decode(new Buffer(local41));
		}
		local6 = this.aClass98_52;
		synchronized (this.aClass98_52) {
			this.aClass98_52.put((long) arg0, local24);
			return local24;
		}
	}
}
