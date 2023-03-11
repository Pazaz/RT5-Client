import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!au", name = "i", descriptor = "I")
	public int anInt423;

	@OriginalMember(owner = "client!au", name = "j", descriptor = "I")
	public int anInt424;

	@OriginalMember(owner = "client!au", name = "k", descriptor = "I")
	public int anInt425;

	@OriginalMember(owner = "client!au", name = "l", descriptor = "I")
	public int anInt426;

	@OriginalMember(owner = "client!au", name = "n", descriptor = "I")
	public int anInt427;

	@OriginalMember(owner = "client!au", name = "m", descriptor = "Z")
	public boolean aBoolean29 = false;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Z")
	public boolean method432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean29) {
			return false;
		}
		@Pc(10) int local10 = this.anInt425 - this.anInt423;
		@Pc(16) int local16 = this.anInt426 - this.anInt424;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt423 * local10 - this.anInt424 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt423 - arg0;
			local54 = this.anInt424 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt427 * this.anInt427;
		} else if (local42 > local24) {
			local49 = this.anInt425 - arg0;
			local54 = this.anInt426 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt427 * this.anInt427;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt423 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt424 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt427 * this.anInt427;
		}
	}
}
