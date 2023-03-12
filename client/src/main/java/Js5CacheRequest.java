import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Js5CacheRequest extends Js5Request {

	@OriginalMember(owner = "client!td", name = "L", descriptor = "Lclient!rq;")
	public Cache aClass207_4;

	@OriginalMember(owner = "client!td", name = "W", descriptor = "I")
	public int anInt6199;

	@OriginalMember(owner = "client!td", name = "Z", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)I")
	@Override
	public int getPercentageComplete() {
		return super.incomplete ? 0 : 100;
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(B)[B")
	@Override
	public byte[] getData() {
		if (super.incomplete) {
			throw new RuntimeException();
		}
		return this.aByteArray91;
	}
}
