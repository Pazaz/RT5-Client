import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
	private int anInt2798 = 1;

	@OriginalMember(owner = "client!ir", name = "k", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "J")
	private long aLong87 = 0L;

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "J")
	private long aLong88 = 0L;

	@OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
	private int anInt2799 = 0;

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "J")
	private long aLong86 = 0L;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)J")
	@Override
	public long method4405() {
		return this.aLong87;
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V")
	@Override
	public void method4408() {
		if (this.aLong86 > this.aLong87) {
			this.aLong87 += this.aLong86 - this.aLong87;
		}
		this.aLong88 = 0L;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZI)I")
	@Override
	public int method4409(@OriginalArg(1) int arg0) {
		@Pc(11) long local11 = (long) arg0 * 1000000L;
		this.aLong87 += this.method2778();
		if (this.aLong86 > this.aLong87) {
			ThreadUtils.sleep((this.aLong86 - this.aLong87) / 1000000L);
			this.aLong88 += this.aLong86 - this.aLong87;
			this.aLong87 += this.aLong86 - this.aLong87;
			this.aLong86 += local11;
			return 1;
		}
		@Pc(71) int local71 = 0;
		do {
			local71++;
			this.aLong86 += local11;
		} while (local71 < 10 && this.aLong87 > this.aLong86);
		if (this.aLong86 < this.aLong87) {
			this.aLong86 = this.aLong87;
		}
		return local71;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)J")
	private long method2778() {
		@Pc(4) long local4 = MonotonicClock.currentTimeMillis() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong88;
		this.aLong88 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray3[this.anInt2799] = local10;
			if (this.anInt2798 < 10) {
				this.anInt2798++;
			}
			this.anInt2799 = (this.anInt2799 + 1) % 10;
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt2798; local53++) {
			local51 += this.aLongArray3[(this.anInt2799 + 10 - local53) % 10];
		}
		return local51 / (long) this.anInt2798;
	}
}
