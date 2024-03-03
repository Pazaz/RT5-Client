import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class CursorType {

	@OriginalMember(owner = "client!te", name = "b", descriptor = "I")
	public int anInt6200;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "I")
	private int anInt6201;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Lclient!mi;")
	public CursorTypeList aClass150_4;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "I")
	public int anInt6203;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)Lclient!dk;")
	public synchronized Class48 method5658() {
		@Pc(13) Class48 local13 = (Class48) this.aClass150_4.aClass98_33.get((long) this.anInt6201);
		if (local13 != null) {
			return local13;
		}
		local13 = Static396.method1682(this.aClass150_4.aClass197_56, this.anInt6201, 0);
		if (local13 != null) {
			this.aClass150_4.aClass98_33.put((long) this.anInt6201, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!bt;I)V")
	public void decode(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.decode(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!bt;I)V")
	private void decode(@OriginalArg(1) Packet arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6201 = arg0.g2();
		} else if (arg1 == 2) {
			this.anInt6203 = arg0.g1();
			this.anInt6200 = arg0.g1();
		}
	}
}
