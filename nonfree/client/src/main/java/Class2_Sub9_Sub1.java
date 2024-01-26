import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public final class Class2_Sub9_Sub1 extends Class2_Sub9 {

	@OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
	public int anInt1887;

	@OriginalMember(owner = "client!ct", name = "s", descriptor = "I")
	public int anInt1888;

	@OriginalMember(owner = "client!ct", name = "v", descriptor = "J")
	public long aLong68;

	@OriginalMember(owner = "client!ct", name = "u", descriptor = "I")
	public int anInt1889;

	@OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
	public int anInt1890;

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(B)I")
	@Override
	public int method5332() {
		return this.anInt1890;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)I")
	@Override
	public int method5333() {
		return this.anInt1887;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)J")
	@Override
	public long method5334() {
		return this.aLong68;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)I")
	@Override
	public int method5328() {
		return this.anInt1888;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)I")
	@Override
	public int method5331() {
		return this.anInt1889;
	}
}
