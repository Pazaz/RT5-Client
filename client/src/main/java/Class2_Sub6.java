import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!np", name = "i", descriptor = "I")
	public int anInt4826;

	@OriginalMember(owner = "client!np", name = "j", descriptor = "I")
	public int anInt4827;

	@OriginalMember(owner = "client!np", name = "k", descriptor = "I")
	public int anInt4828;

	@OriginalMember(owner = "client!np", name = "l", descriptor = "I")
	public int anInt4829;

	@OriginalMember(owner = "client!np", name = "m", descriptor = "I")
	public int anInt4830;

	@OriginalMember(owner = "client!np", name = "h", descriptor = "Z")
	public boolean aBoolean334 = false;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Z")
	public boolean method4134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean334) {
			return false;
		}
		@Pc(10) int local10 = this.anInt4829 - this.anInt4830;
		@Pc(16) int local16 = this.anInt4828 - this.anInt4826;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt4830 * local10 - this.anInt4826 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt4830 - arg0;
			local54 = this.anInt4826 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4827 * this.anInt4827;
		} else if (local42 > local24) {
			local49 = this.anInt4829 - arg0;
			local54 = this.anInt4828 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4827 * this.anInt4827;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt4830 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt4826 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4827 * this.anInt4827;
		}
	}
}
