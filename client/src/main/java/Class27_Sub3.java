import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class27_Sub3 extends Class27 {

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "J")
	private long aLong201 = 0L;

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "J")
	private long aLong202 = 0L;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "J")
	private long aLong203 = 0L;

	@OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
	private int anInt6263 = 0;

	@OriginalMember(owner = "client!mp", name = "h", descriptor = "[J")
	private final long[] aLongArray13 = new long[10];

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
	private int anInt6264 = 1;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V")
	public Class27_Sub3() {
		this.aLong201 = this.aLong202 = jagmisc.nanoTime();
		if (this.aLong202 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
	@Override
	public void method5597() {
		this.aLong203 = 0L;
		if (this.aLong202 < this.aLong201) {
			this.aLong202 += this.aLong201 - this.aLong202;
		}
	}

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "(I)J")
	private long method5603() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(14) long local14 = local1 - this.aLong203;
		this.aLong203 = local1;
		if (local14 > -5000000000L && local14 < 5000000000L) {
			this.aLongArray13[this.anInt6263] = local14;
			if (this.anInt6264 < 1) {
				this.anInt6264++;
			}
			this.anInt6263 = (this.anInt6263 + 1) % 10;
		}
		@Pc(59) long local59 = 0L;
		for (@Pc(61) int local61 = 1; local61 <= this.anInt6264; local61++) {
			local59 += this.aLongArray13[(this.anInt6263 + 10 - local61) % 10];
		}
		return local59 / (long) this.anInt6264;
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)J")
	@Override
	public long method5602() {
		return this.aLong202;
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(B)J")
	@Override
	protected long method5599() {
		this.aLong202 += this.method5603();
		return this.aLong201 > this.aLong202 ? (this.aLong201 - this.aLong202) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method5596(@OriginalArg(1) long arg0) {
		if (this.aLong201 > this.aLong202) {
			this.aLong203 += this.aLong201 - this.aLong202;
			this.aLong202 += this.aLong201 - this.aLong202;
			this.aLong201 += arg0;
			return 1;
		}
		@Pc(46) int local46 = 0;
		do {
			this.aLong201 += arg0;
			local46++;
		} while (local46 < 10 && this.aLong202 > this.aLong201);
		if (this.aLong202 > this.aLong201) {
			this.aLong201 = this.aLong202;
		}
		return local46;
	}
}
