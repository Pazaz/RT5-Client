import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public final class Class2_Sub9_Sub2 extends Class2_Sub9 {

	@OriginalMember(owner = "client!lt", name = "t", descriptor = "I")
	public int anInt5937;

	@OriginalMember(owner = "client!lt", name = "v", descriptor = "I")
	public int anInt5940;

	@OriginalMember(owner = "client!lt", name = "r", descriptor = "I")
	public int anInt5942;

	@OriginalMember(owner = "client!lt", name = "y", descriptor = "J")
	public long aLong181;

	@OriginalMember(owner = "client!lt", name = "w", descriptor = "I")
	public int anInt5946;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)I")
	@Override
	public int method5333() {
		return this.anInt5937;
	}

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "(B)I")
	@Override
	public int method5332() {
		return this.anInt5942;
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)I")
	@Override
	public int method5331() {
		return this.anInt5940;
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(B)J")
	@Override
	public long method5334() {
		return this.aLong181;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)I")
	@Override
	public int method5328() {
		return this.anInt5946;
	}
}
