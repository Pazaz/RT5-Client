import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Js5MasterIndex {

	@OriginalMember(owner = "client!mq", name = "h", descriptor = "Lclient!bt;")
	private Buffer buffer;

	@OriginalMember(owner = "client!mq", name = "j", descriptor = "[Lclient!bl;")
	private Js5CachedResourceProvider[] resourceProviders;

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "Lclient!ro;")
	private final Js5CacheQueue cacheQueue;

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "Lclient!pp;")
	private final Js5NetQueue netQueue;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "Lclient!jj;")
	private Js5NetRequest request;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!pp;Lclient!ro;)V")
	public Js5MasterIndex(@OriginalArg(0) Js5NetQueue arg0, @OriginalArg(1) Js5CacheQueue arg1) {
		this.cacheQueue = arg1;
		this.netQueue = arg0;
		if (!this.netQueue.isUrgentRequestQueueFull()) {
			this.request = this.netQueue.read(true, 255, (byte) 0, 255);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!rq;ILclient!rq;)Lclient!bl;")
	public Js5CachedResourceProvider getResourceProvider(@OriginalArg(0) int arg0, @OriginalArg(1) Cache arg1, @OriginalArg(3) Cache arg2) {
		return this.method3875(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)Z")
	public boolean isReady() {
		if (this.buffer != null) {
			return true;
		}
		if (this.request == null) {
			if (this.netQueue.isUrgentRequestQueueFull()) {
				return false;
			}
			this.request = this.netQueue.read(true, 255, (byte) 0, 255);
		}
		if (this.request.incomplete) {
			return false;
		} else {
			this.buffer = new Buffer(this.request.getData());
			this.resourceProviders = new Js5CachedResourceProvider[(this.buffer.data.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IZLclient!rq;Lclient!rq;I)Lclient!bl;")
	private Js5CachedResourceProvider method3875(@OriginalArg(0) int arg0, @OriginalArg(2) Cache arg1, @OriginalArg(3) Cache arg2) {
		if (this.buffer == null) {
			throw new RuntimeException();
		}
		this.buffer.pos = arg0 * 8 + 5;
		if (this.buffer.pos >= this.buffer.data.length) {
			throw new RuntimeException();
		} else if (this.resourceProviders[arg0] == null) {
			@Pc(45) int local45 = this.buffer.g4();
			@Pc(50) int local50 = this.buffer.g4();
			@Pc(64) Js5CachedResourceProvider local64 = new Js5CachedResourceProvider(arg0, arg1, arg2, this.netQueue, this.cacheQueue, local45, local50, true);
			this.resourceProviders[arg0] = local64;
			return local64;
		} else {
			return this.resourceProviders[arg0];
		}
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)V")
	public void method3877() {
		if (this.resourceProviders == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.resourceProviders.length; local11++) {
			if (this.resourceProviders[local11] != null) {
				this.resourceProviders[local11].method892();
			}
		}
		for (@Pc(38) int local38 = 0; local38 < this.resourceProviders.length; local38++) {
			if (this.resourceProviders[local38] != null) {
				this.resourceProviders[local38].method894();
			}
		}
	}
}
