import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class175 {

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
	public int anInt5701;

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
	private int anInt5702;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)I")
	public int method4862() {
		return this.anInt5701 & 0x3FFF;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIII)Z")
	public boolean method4863(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt5702;
		if (arg0 == this.anInt5701 && this.anInt5702 == 0) {
			return false;
		}
		@Pc(46) boolean local46;
		@Pc(58) int local58;
		if (this.anInt5702 == 0) {
			if (arg0 > this.anInt5701 && arg2 + this.anInt5701 >= arg0 || this.anInt5701 > arg0 && this.anInt5701 - arg2 <= arg0) {
				this.anInt5701 = arg0;
				return false;
			}
			local46 = true;
		} else {
			@Pc(64) int local64;
			if (this.anInt5702 > 0 && this.anInt5701 < arg0) {
				local58 = this.anInt5702 * this.anInt5702 / (arg2 * 2);
				local64 = this.anInt5701 + local58;
				if (local64 < arg0 && this.anInt5701 <= local64) {
					local46 = true;
				} else {
					local46 = false;
				}
			} else if (this.anInt5702 < 0 && arg0 < this.anInt5701) {
				local58 = this.anInt5702 * this.anInt5702 / (arg2 * 2);
				local64 = this.anInt5701 - local58;
				if (local64 > arg0 && this.anInt5701 >= local64) {
					local46 = true;
				} else {
					local46 = false;
				}
			} else {
				local46 = false;
			}
		}
		if (local46) {
			if (this.anInt5701 >= arg0) {
				this.anInt5702 -= arg2;
				if (arg1 != 0 && -arg1 > this.anInt5702) {
					this.anInt5702 = -arg1;
				}
			} else {
				this.anInt5702 += arg2;
				if (arg1 != 0 && this.anInt5702 > arg1) {
					this.anInt5702 = arg1;
				}
			}
			if (this.anInt5702 != local8) {
				local58 = this.anInt5702 * this.anInt5702 / (arg2 * 2);
				if (this.anInt5701 >= arg0) {
					if (this.anInt5701 > arg0 && this.anInt5701 - local58 < arg0) {
						this.anInt5702 = local8;
					}
				} else if (arg0 < this.anInt5701 + local58) {
					this.anInt5702 = local8;
				}
			}
		} else if (this.anInt5702 > 0) {
			this.anInt5702 -= arg2;
			if (this.anInt5702 < 0) {
				this.anInt5702 = 0;
			}
		} else {
			this.anInt5702 += arg2;
			if (this.anInt5702 > 0) {
				this.anInt5702 = 0;
			}
		}
		this.anInt5701 += local8 + this.anInt5702 >> 1;
		return local46;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
	public void method4866() {
		this.anInt5701 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZI)V")
	public void method4867(@OriginalArg(1) int arg0) {
		this.anInt5701 = arg0;
		this.anInt5702 = 0;
	}
}
