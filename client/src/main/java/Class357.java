import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class357 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "[I")
	private final int[] anIntArray735;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "[I")
	private final int[] anIntArray734;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "[I")
	private final int[] anIntArray729;

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "[I")
	private final int[] anIntArray733;

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "[I")
	private final int[] anIntArray731;

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "[I")
	private final int[] anIntArray732;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "[I")
	private final int[] anIntArray730;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class357(@OriginalArg(0) Packet arg0) {
		@Pc(7) int local7 = arg0.gSamrt1or2();
		this.anIntArray735 = new int[local7];
		this.anIntArray734 = new int[local7];
		this.anIntArray729 = new int[local7];
		this.anIntArray733 = new int[local7];
		this.anIntArray731 = new int[local7];
		this.anIntArray732 = new int[local7];
		this.anIntArray730 = new int[local7];
		for (@Pc(37) int local37 = 0; local37 < local7; local37++) {
			this.anIntArray733[local37] = arg0.g2() - 5120;
			this.anIntArray732[local37] = arg0.g2() - 5120;
			this.anIntArray735[local37] = arg0.g2s();
			this.anIntArray729[local37] = arg0.g2() - 5120;
			this.anIntArray734[local37] = arg0.g2() - 5120;
			this.anIntArray731[local37] = arg0.g2s();
			this.anIntArray730[local37] = arg0.g2s();
		}
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)V")
	public void method8328(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = new int[this.anIntArray733.length << 1][4];
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray733.length; local15++) {
			local13[local15 * 2][0] = this.anIntArray733[local15];
			local13[local15 * 2][1] = this.anIntArray735[local15];
			local13[local15 * 2][2] = this.anIntArray732[local15];
			local13[local15 * 2][3] = this.anIntArray730[local15];
			local13[local15 * 2 + 1][0] = this.anIntArray729[local15];
			local13[local15 * 2 + 1][1] = this.anIntArray731[local15];
			local13[local15 * 2 + 1][2] = this.anIntArray734[local15];
			local13[local15 * 2 + 1][3] = this.anIntArray730[local15];
		}
		Static603.anIntArrayArrayArray18[arg0] = local13;
	}
}
