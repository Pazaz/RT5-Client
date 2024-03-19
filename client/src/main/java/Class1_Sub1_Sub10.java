import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
	public int anInt2952;

	@OriginalMember(owner = "client!hn", name = "C", descriptor = "I")
	public int anInt2954;

	@OriginalMember(owner = "client!hn", name = "H", descriptor = "Ljava/lang/String;")
	public String aString107;

	@OriginalMember(owner = "client!hn", name = "K", descriptor = "I")
	public int anInt2960;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong235 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V")
	public void method2536() {
		super.aLong234 = super.aLong234 & Long.MIN_VALUE | Static325.method5658() + 500L;
		Static44.aClass179_2.method4927(this);
	}

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)J")
	public long method2538() {
		return Long.MAX_VALUE & super.aLong234;
	}

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "(I)V")
	public void method2539() {
		super.aLong234 |= Long.MIN_VALUE;
		if (this.method2538() == 0L) {
			Static165.aClass179_4.method4927(this);
		}
	}

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "(I)I")
	public int method2540() {
		return (int) (super.aLong235 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "(B)I")
	public int method2542() {
		return (int) super.aLong235;
	}
}
