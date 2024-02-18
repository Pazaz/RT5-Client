import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ima")
public final class Class8_Sub6 extends Class8 {

	@OriginalMember(owner = "client!ima", name = "f", descriptor = "I")
	public int anInt4501;

	@OriginalMember(owner = "client!ima", name = "k", descriptor = "I")
	public int anInt4502;

	@OriginalMember(owner = "client!ima", name = "i", descriptor = "I")
	public int anInt4503;

	@OriginalMember(owner = "client!ima", name = "j", descriptor = "I")
	public int anInt4504;

	@OriginalMember(owner = "client!ima", name = "g", descriptor = "I")
	public int anInt4505;

	@OriginalMember(owner = "client!ima", name = "h", descriptor = "Z")
	public boolean aBoolean352 = false;

	@OriginalMember(owner = "client!ima", name = "a", descriptor = "(II)Z")
	public boolean method4048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean352) {
			return false;
		}
		@Pc(10) int local10 = this.anInt4501 - this.anInt4504;
		@Pc(16) int local16 = this.anInt4503 - this.anInt4505;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt4504 * local10 - this.anInt4505 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt4504 - arg0;
			local54 = this.anInt4505 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4502 * this.anInt4502;
		} else if (local42 > local24) {
			local49 = this.anInt4501 - arg0;
			local54 = this.anInt4503 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4502 * this.anInt4502;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt4504 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt4505 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4502 * this.anInt4502;
		}
	}
}
