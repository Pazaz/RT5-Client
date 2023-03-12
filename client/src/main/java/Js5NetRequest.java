import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public final class Js5NetRequest extends Js5Request {

	@OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
	public int blockPosition;

	@OriginalMember(owner = "client!jj", name = "Q", descriptor = "B")
	public byte trailerLen;

	@OriginalMember(owner = "client!jj", name = "T", descriptor = "Lclient!bt;")
	public Buffer buffer;

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)[B")
	@Override
	public byte[] getData() {
		if (super.incomplete || this.buffer.pos < this.buffer.data.length - this.trailerLen) {
			throw new RuntimeException();
		}
		return this.buffer.data;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)I")
	@Override
	public int getPercentageComplete() {
		return this.buffer == null ? 0 : this.buffer.pos * 100 / (this.buffer.data.length - this.trailerLen);
	}
}
