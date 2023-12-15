import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
	private int elevation;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "[B")
	private byte[] subData;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
	private int writerIndex;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "[I")
	private final int[] pows = new int[this.factorsOfTwo];

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class57_Sub1(@OriginalArg(0) int seed, @OriginalArg(1) int factorsOfTwo, @OriginalArg(2) int xFactor, @OriginalArg(3) int yFactor, @OriginalArg(4) int zFactor, @OriginalArg(5) float frequency) {
		super(seed, factorsOfTwo, xFactor, yFactor, zFactor);
		for (@Pc(15) int index = 0; index < super.factorsOfTwo; index++) {
			this.pows[index] = (short) (Math.pow((double) frequency, (double) index) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
	@Override
	protected final void add() {
		this.elevation = Math.abs(this.elevation);
		if (this.elevation >= 4096) {
			this.elevation = 4095;
		}
		this.modify(this.writerIndex++, (byte) (this.elevation >> 4));
		this.elevation = 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
	@Override
	protected final void apply(@OriginalArg(1) int index, @OriginalArg(2) int noise) {
		this.elevation += this.pows[index] * noise >> 12;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V")
	protected void modify(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.subData[this.writerIndex++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	@Override
	protected final void setup() {
		this.elevation = 0;
		this.writerIndex = 0;
	}
}
