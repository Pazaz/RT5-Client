import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class106_Sub3 extends Class106 {

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "J")
	private long aLong229 = 0L;

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "J")
	private long aLong230 = 0L;

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
	private int anInt7326 = 1;

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "J")
	private long aLong231 = 0L;

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "[J")
	private final long[] aLongArray10 = new long[10];

	@OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
	private int anInt7327 = 0;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
	public Class106_Sub3() {
		this.aLong229 = this.aLong230 = jagmisc.nanoTime();
		if (this.aLong230 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "(I)J")
	private long method6136() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong231;
		this.aLong231 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray10[this.anInt7327] = local7;
			this.anInt7327 = (this.anInt7327 + 1) % 10;
			if (this.anInt7326 < 1) {
				this.anInt7326++;
			}
		}
		@Pc(46) long local46 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt7326; local54++) {
			local46 += this.aLongArray10[(this.anInt7327 + 10 - local54) % 10];
		}
		return local46 / (long) this.anInt7326;
	}

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(I)J")
	@Override
	public long method6135() {
		return this.aLong230;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)I")
	@Override
	public int method6131(@OriginalArg(0) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong230 += this.method6136();
		if (this.aLong229 > this.aLong230) {
			Static295.method5212((this.aLong229 - this.aLong230) / 1000000L);
			this.aLong231 += this.aLong229 - this.aLong230;
			this.aLong230 += this.aLong229 - this.aLong230;
			this.aLong229 += local4;
			return 1;
		}
		@Pc(68) int local68 = 0;
		do {
			local68++;
			this.aLong229 += local4;
		} while (local68 < 10 && this.aLong230 > this.aLong229);
		if (this.aLong230 > this.aLong229) {
			this.aLong229 = this.aLong230;
		}
		return local68;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
	@Override
	public void method6129() {
		this.aLong231 = 0L;
		if (this.aLong229 > this.aLong230) {
			this.aLong230 += this.aLong229 - this.aLong230;
		}
	}
}
