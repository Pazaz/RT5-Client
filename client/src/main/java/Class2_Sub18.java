import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class2_Sub18 extends Class2 implements Interface27 {

	@OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
	public int anInt2881;

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "J")
	public long aLong99;

	@OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
	public int anInt2885;

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
	public int anInt2886;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)I")
	@Override
	public int method2668() {
		return this.anInt2886;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)J")
	@Override
	public long method2665() {
		return this.aLong99;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)C")
	@Override
	public char method2666() {
		return this.aChar4;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)I")
	@Override
	public int method2667() {
		return this.anInt2885;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)I")
	@Override
	public int method2664() {
		return this.anInt2881;
	}
}
