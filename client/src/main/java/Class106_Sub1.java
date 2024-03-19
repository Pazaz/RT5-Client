import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class106_Sub1 extends Class106 {

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "J")
	private long aLong111 = 0L;

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "J")
	private long aLong110 = 0L;

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
	private int anInt3763 = 0;

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "J")
	private long aLong112 = 0L;

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
	private int anInt3764 = 1;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)I")
	@Override
	public int method6131(@OriginalArg(0) int arg0) {
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		this.aLong111 += this.method3284();
		if (this.aLong110 > this.aLong111) {
			Static295.method5212((this.aLong110 - this.aLong111) / 1000000L);
			this.aLong112 += this.aLong110 - this.aLong111;
			this.aLong111 += this.aLong110 - this.aLong111;
			this.aLong110 += local12;
			return 1;
		}
		@Pc(32) int local32 = 0;
		do {
			this.aLong110 += local12;
			local32++;
		} while (local32 < 10 && this.aLong110 < this.aLong111);
		if (this.aLong111 > this.aLong110) {
			this.aLong110 = this.aLong111;
		}
		return local32;
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)J")
	private long method3284() {
		@Pc(4) long local4 = Static325.method5658() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong112;
		this.aLong112 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray4[this.anInt3763] = local10;
			this.anInt3763 = (this.anInt3763 + 1) % 10;
			if (this.anInt3764 < 10) {
				this.anInt3764++;
			}
		}
		@Pc(53) long local53 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt3764; local55++) {
			local53 += this.aLongArray4[(this.anInt3763 + 10 - local55) % 10];
		}
		return local53 / (long) this.anInt3764;
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)J")
	@Override
	public long method6135() {
		return this.aLong111;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	@Override
	public void method6129() {
		this.aLong112 = 0L;
		if (this.aLong110 > this.aLong111) {
			this.aLong111 += this.aLong110 - this.aLong111;
		}
	}
}
