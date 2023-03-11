import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public final class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!co", name = "e", descriptor = "Z")
	public boolean aBoolean101;

	@OriginalMember(owner = "client!co", name = "g", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!co", name = "i", descriptor = "I")
	public int anInt1245;

	@OriginalMember(owner = "client!co", name = "n", descriptor = "J")
	public long aLong36;

	@OriginalMember(owner = "client!co", name = "o", descriptor = "I")
	public int anInt1250;

	@OriginalMember(owner = "client!co", name = "q", descriptor = "Lclient!co;")
	public Class37_Sub1 aClass37_Sub1_1;

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)C")
	@Override
	public char method1456() {
		return this.aChar1;
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(I)I")
	@Override
	public int method1461() {
		return this.anInt1245;
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(B)I")
	@Override
	public int method1460() {
		return this.anInt1250;
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(I)J")
	@Override
	public long method1457() {
		return this.aLong36;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method1459() {
		return this.aBoolean101;
	}
}
