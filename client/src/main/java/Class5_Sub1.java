import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!af", name = "g", descriptor = "J")
	private long aLong14 = 0L;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "J")
	private long aLong15 = 0L;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "I")
	private int anInt171 = 0;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "I")
	private int anInt172 = 1;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!af", name = "k", descriptor = "J")
	private long aLong16 = 0L;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class5_Sub1() {
		this.aLong14 = this.aLong15 = jagmisc.nanoTime();
		if (this.aLong15 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V")
	@Override
	public void method4408() {
		if (this.aLong14 > this.aLong15) {
			this.aLong15 += this.aLong14 - this.aLong15;
		}
		this.aLong16 = 0L;
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(I)J")
	private long method154() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong16;
		this.aLong16 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray2[this.anInt171] = local6;
			this.anInt171 = (this.anInt171 + 1) % 10;
			if (this.anInt172 < 1) {
				this.anInt172++;
			}
		}
		@Pc(53) long local53 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt172; local55++) {
			local53 += this.aLongArray2[(this.anInt171 + 10 - local55) % 10];
		}
		return local53 / (long) this.anInt172;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)I")
	@Override
	public int method4409(@OriginalArg(1) int arg0) {
		this.aLong15 += this.method154();
		@Pc(17) long local17 = (long) arg0 * 1000000L;
		if (this.aLong14 > this.aLong15) {
			Static231.method4023((this.aLong14 - this.aLong15) / 1000000L);
			this.aLong16 += this.aLong14 - this.aLong15;
			this.aLong15 += this.aLong14 - this.aLong15;
			this.aLong14 += local17;
			return 1;
		}
		@Pc(25) int local25 = 0;
		do {
			this.aLong14 += local17;
			local25++;
		} while (local25 < 10 && this.aLong15 > this.aLong14);
		if (this.aLong14 < this.aLong15) {
			this.aLong14 = this.aLong15;
		}
		return local25;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)J")
	@Override
	public long method4405() {
		return this.aLong15;
	}
}
