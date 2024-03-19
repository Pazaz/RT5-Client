import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public final class Class60 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
	public int anInt2077;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
	public int anInt2079;

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
	public int anInt2081;

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
	public int anInt2083;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "B")
	private byte aByte24;

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
	public int anInt2087;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public Class60() {
	}

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!il;)V")
	public Class60(@OriginalArg(0) Class1_Sub16 arg0) {
		this.aByte24 = arg0.method5772();
		this.anInt2079 = arg0.method5749();
		this.anInt2077 = arg0.method5730();
		this.anInt2083 = arg0.method5730();
		this.anInt2087 = arg0.method5730();
		this.anInt2081 = arg0.method5730();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)I")
	public int method1749() {
		return this.aByte24 & 0x7;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)I")
	public int method1750() {
		return (this.aByte24 & 0x8) == 8 ? 1 : 0;
	}
}
