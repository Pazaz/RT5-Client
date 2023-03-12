import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class FloTypeList {

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "Lclient!hu;")
	private final LruHashTable types = new LruHashTable(64);

	@OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
	public int anInt2060 = 0;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "Lclient!r;")
	private final Js5 archive;

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
	public final int capacity;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!dn;ILclient!r;)V")
	public FloTypeList(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.archive = arg2;
		this.capacity = this.archive.getGroupCapacity(4);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)V")
	public void clean() {
		synchronized (this.types) {
			this.types.clean(5);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
	public void method2103() {
		synchronized (this.types) {
			this.types.method2614();
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)Lclient!mg;")
	public FloType get(@OriginalArg(1) int id) {
		@Pc(16) FloType flo;
		synchronized (this.types) {
			flo = (FloType) this.types.get(id);
		}
		if (flo != null) {
			return flo;
		}
		@Pc(41) byte[] data = this.archive.fetchFile(id, 4);
		flo = new FloType();
		flo.aClass72_4 = this;
		flo.id = id;
		if (data != null) {
			flo.decode(new Buffer(data));
		}
		flo.method3716();
		synchronized (this.types) {
			this.types.put(id, flo);
			return flo;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
	public void method2108() {
		synchronized (this.types) {
			this.types.method2621();
		}
	}
}
