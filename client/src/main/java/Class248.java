import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class248 {

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
	public int anInt7197;

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "I")
	private int anInt7205;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V")
	public void method6440() {
		this.anInt7197 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)I")
	public int method6441() {
		return this.anInt7197 & 0x3FFF;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)V")
	public void method6442(@OriginalArg(0) int arg0) {
		this.anInt7205 = 0;
		this.anInt7197 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIZI)Z")
	public boolean method6443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt7205;
		if (this.anInt7197 == arg0 && this.anInt7205 == 0) {
			return false;
		}
		@Pc(69) boolean local69;
		@Pc(102) int local102;
		if (this.anInt7205 == 0) {
			if (this.anInt7197 < arg0 && this.anInt7197 + arg1 >= arg0 || arg0 < this.anInt7197 && this.anInt7197 - arg1 <= arg0) {
				this.anInt7197 = arg0;
				return false;
			}
			local69 = true;
		} else {
			@Pc(108) int local108;
			if (this.anInt7205 > 0 && arg0 > this.anInt7197) {
				local102 = this.anInt7205 * this.anInt7205 / (arg1 * 2);
				local108 = local102 + this.anInt7197;
				if (local108 < arg0 && this.anInt7197 <= local108) {
					local69 = true;
				} else {
					local69 = false;
				}
			} else if (this.anInt7205 < 0 && this.anInt7197 > arg0) {
				local102 = this.anInt7205 * this.anInt7205 / (arg1 * 2);
				local108 = this.anInt7197 - local102;
				if (arg0 < local108 && local108 <= this.anInt7197) {
					local69 = true;
				} else {
					local69 = false;
				}
			} else {
				local69 = false;
			}
		}
		if (local69) {
			if (this.anInt7197 >= arg0) {
				this.anInt7205 -= arg1;
				if (arg2 != 0 && -arg2 > this.anInt7205) {
					this.anInt7205 = -arg2;
				}
			} else {
				this.anInt7205 += arg1;
				if (arg2 != 0 && arg2 < this.anInt7205) {
					this.anInt7205 = arg2;
				}
			}
			if (local8 != this.anInt7205) {
				local102 = this.anInt7205 * this.anInt7205 / (arg1 * 2);
				if (arg0 > this.anInt7197) {
					if (arg0 < local102 + this.anInt7197) {
						this.anInt7205 = local8;
					}
				} else if (arg0 < this.anInt7197 && arg0 > this.anInt7197 - local102) {
					this.anInt7205 = local8;
				}
			}
		} else if (this.anInt7205 <= 0) {
			this.anInt7205 += arg1;
			if (this.anInt7205 > 0) {
				this.anInt7205 = 0;
			}
		} else {
			this.anInt7205 -= arg1;
			if (this.anInt7205 < 0) {
				this.anInt7205 = 0;
			}
		}
		this.anInt7197 += local8 + this.anInt7205 >> 1;
		return local69;
	}
}
