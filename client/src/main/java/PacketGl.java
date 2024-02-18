import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jfa")
public final class PacketGl extends Packet {

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(I)V")
	public PacketGl(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IF)V")
	public void pFloat(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.data[super.pos++] = (byte) (local6 >> 24);
		super.data[super.pos++] = (byte) (local6 >> 16);
		super.data[super.pos++] = (byte) (local6 >> 8);
		super.data[super.pos++] = (byte) local6;
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(IF)V")
	public void ipFloat(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.data[super.pos++] = (byte) local6;
		super.data[super.pos++] = (byte) (local6 >> 8);
		super.data[super.pos++] = (byte) (local6 >> 16);
		super.data[super.pos++] = (byte) (local6 >> 24);
	}
}
