import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class106_Sub2 extends Class106 {

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "J")
	private long aLong208 = 0L;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "J")
	private long aLong209 = 0L;

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "J")
	private long aLong210 = 0L;

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
	private int anInt6712 = 1;

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
	private int anInt6713 = 0;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class106_Sub2() {
		this.aLong209 = System.nanoTime();
		this.aLong208 = System.nanoTime();
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)J")
	private long method5703() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong210;
		this.aLong210 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray8[this.anInt6713] = local7;
			if (this.anInt6712 < 1) {
				this.anInt6712++;
			}
			this.anInt6713 = (this.anInt6713 + 1) % 10;
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(59) int local59 = 1; local59 <= this.anInt6712; local59++) {
			local52 += this.aLongArray8[(this.anInt6713 + 10 - local59) % 10];
		}
		return local52 / (long) this.anInt6712;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)I")
	@Override
	public int method6131(@OriginalArg(0) int arg0) {
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		this.aLong209 += this.method5703();
		if (this.aLong208 > this.aLong209) {
			Static295.method5212((this.aLong208 - this.aLong209) / 1000000L);
			this.aLong210 += this.aLong208 - this.aLong209;
			this.aLong209 += this.aLong208 - this.aLong209;
			this.aLong208 += local12;
			return 1;
		}
		@Pc(67) int local67 = 0;
		do {
			this.aLong208 += local12;
			local67++;
		} while (local67 < 10 && this.aLong208 < this.aLong209);
		if (this.aLong209 > this.aLong208) {
			this.aLong208 = this.aLong209;
		}
		return local67;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	@Override
	public void method6129() {
		this.aLong210 = 0L;
		if (this.aLong209 < this.aLong208) {
			this.aLong209 += this.aLong208 - this.aLong209;
		}
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)J")
	@Override
	public long method6135() {
		return this.aLong209;
	}
}
