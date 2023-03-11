import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!op", name = "g", descriptor = "J")
	private long aLong139 = 0L;

	@OriginalMember(owner = "client!op", name = "h", descriptor = "J")
	private long aLong140 = 0L;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "J")
	private long aLong141 = 0L;

	@OriginalMember(owner = "client!op", name = "l", descriptor = "I")
	private int anInt4760 = 1;

	@OriginalMember(owner = "client!op", name = "j", descriptor = "I")
	private int anInt4759 = 0;

	@OriginalMember(owner = "client!op", name = "i", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V")
	public Class5_Sub3() {
		this.aLong139 = System.nanoTime();
		this.aLong140 = System.nanoTime();
	}

	@OriginalMember(owner = "client!op", name = "d", descriptor = "(I)J")
	private long method4410() {
		@Pc(6) long local6 = System.nanoTime();
		@Pc(12) long local12 = local6 - this.aLong141;
		this.aLong141 = local6;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray8[this.anInt4759] = local12;
			this.anInt4759 = (this.anInt4759 + 1) % 10;
			if (this.anInt4760 < 1) {
				this.anInt4760++;
			}
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt4760; local56++) {
			local54 += this.aLongArray8[(this.anInt4759 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt4760;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZI)I")
	@Override
	public int method4409(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong139 += this.method4410();
		if (this.aLong139 < this.aLong140) {
			Static231.method4023((this.aLong140 - this.aLong139) / 1000000L);
			this.aLong141 += this.aLong140 - this.aLong139;
			this.aLong139 += this.aLong140 - this.aLong139;
			this.aLong140 += local4;
			return 1;
		}
		@Pc(67) int local67 = 0;
		do {
			this.aLong140 += local4;
			local67++;
		} while (local67 < 10 && this.aLong140 < this.aLong139);
		if (this.aLong140 < this.aLong139) {
			this.aLong140 = this.aLong139;
		}
		return local67;
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V")
	@Override
	public void method4408() {
		if (this.aLong140 > this.aLong139) {
			this.aLong139 += this.aLong140 - this.aLong139;
		}
		this.aLong141 = 0L;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)J")
	@Override
	public long method4405() {
		return this.aLong139;
	}
}
