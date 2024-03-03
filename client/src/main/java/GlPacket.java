import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class GlPacket extends Packet {

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(I)V")
	public GlPacket(@OriginalArg(0) int size) {
		super(size);
	}

	// inverse, put, float
	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(FI)V")
	public void ipf(@OriginalArg(0) float value) {
		@Pc(6) int bits = Float.floatToRawIntBits(value);
		this.data[this.pos++] = (byte) bits;
		this.data[this.pos++] = (byte) (bits >> 8);
		this.data[this.pos++] = (byte) (bits >> 16);
		this.data[this.pos++] = (byte) (bits >> 24);
	}

	// put, float
	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(FI)V")
	public void pf(@OriginalArg(0) float value) {
		@Pc(2) int bits = Float.floatToRawIntBits(value);
		this.data[this.pos++] = (byte) (bits >> 24);
		this.data[this.pos++] = (byte) (bits >> 16);
		this.data[this.pos++] = (byte) (bits >> 8);
		this.data[this.pos++] = (byte) bits;
	}
}
