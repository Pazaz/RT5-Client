import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public final class Class49 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
	public int anInt1603;

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
	public int anInt1604;

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
	public int anInt1606;

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
	public int anInt1609;

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
	public int anInt1611;

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "Lclient!dn;")
	public Class49 aClass49_1;

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
	public int anInt1614;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
	public int anInt1616;

	@OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
	public int anInt1620;

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
	public int anInt1621;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
	public final int anInt1608;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
	public final int anInt1607;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
	public final int anInt1605;

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
	public final int anInt1618;

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "B")
	public final byte aByte15;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(IIIIB)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt1608 = arg3;
		this.anInt1607 = arg1;
		this.anInt1605 = arg0;
		this.anInt1618 = arg2;
		this.aByte15 = arg4;
	}

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lclient!dn;I)V")
	public Class49(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1) {
		this.aClass49_1 = arg0;
		this.anInt1618 = this.aClass49_1.anInt1618 + arg1;
		this.anInt1605 = this.aClass49_1.anInt1605;
		this.aByte15 = this.aClass49_1.aByte15;
		this.anInt1608 = this.aClass49_1.anInt1608 + arg1;
		this.anInt1607 = this.aClass49_1.anInt1607 + arg1;
	}
}
