import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class118 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "I")
	public int anInt4077;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "I")
	public int anInt4078;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "I")
	public int anInt4081;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "J")
	public long aLong119;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "I")
	public int anInt4083;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "I")
	private int anInt4084;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "I")
	public int anInt4085;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "I")
	public int anInt4086;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "I")
	public int anInt4088;

	@OriginalMember(owner = "client!le", name = "r", descriptor = "I")
	public int anInt4090;

	@OriginalMember(owner = "client!le", name = "u", descriptor = "I")
	public int anInt4092;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "I")
	public int anInt4082 = 0;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "I")
	public int anInt4080 = 0;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "Z")
	private boolean aBoolean289 = false;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
	public void method3497() {
		this.anInt4092 = Class39.anIntArray87[this.anInt4084 << 3];
		this.anInt4086 = (int) Math.sqrt((double) (this.anInt4078 * this.anInt4078 + this.anInt4090 * this.anInt4090 + this.anInt4083 * this.anInt4083));
		if (this.anInt4085 == 0) {
			this.anInt4085 = 1;
		}
		if (this.anInt4081 == 0) {
			this.aLong119 = 2147483647L;
		} else if (this.anInt4081 == 1) {
			this.aLong119 = this.anInt4086 * 8 / this.anInt4085;
			this.aLong119 *= this.aLong119;
		} else if (this.anInt4081 == 2) {
			this.aLong119 = this.anInt4086 * 8 / this.anInt4085;
		}
		if (this.aBoolean289) {
			this.anInt4086 *= -1;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IILclient!il;)V")
	private void method3498(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 1) {
			this.anInt4084 = arg1.method5749();
		} else if (arg0 == 2) {
			arg1.method5761();
		} else if (arg0 == 3) {
			this.anInt4090 = arg1.method5730();
			this.anInt4078 = arg1.method5730();
			this.anInt4083 = arg1.method5730();
		} else if (arg0 == 4) {
			this.anInt4081 = arg1.method5761();
			this.anInt4085 = arg1.method5730();
		} else if (arg0 == 6) {
			this.anInt4088 = arg1.method5761();
		} else if (arg0 == 8) {
			this.anInt4082 = 1;
		} else if (arg0 == 9) {
			this.anInt4080 = 1;
		} else if (arg0 == 10) {
			this.aBoolean289 = true;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!il;)V")
	public void method3500(@OriginalArg(1) Class1_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5761();
			if (local5 == 0) {
				return;
			}
			this.method3498(local5, arg0);
		}
	}
}
