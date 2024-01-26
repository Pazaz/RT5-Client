import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class2_Sub35 extends Class2 {

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "I")
	public final int anInt5692;

	@OriginalMember(owner = "client!kw", name = "p", descriptor = "I")
	public final int anInt5695;

	@OriginalMember(owner = "client!kw", name = "q", descriptor = "I")
	public final int anInt5691;

	@OriginalMember(owner = "client!kw", name = "o", descriptor = "I")
	public final int anInt5686;

	@OriginalMember(owner = "client!kw", name = "s", descriptor = "I")
	public final int anInt5694;

	@OriginalMember(owner = "client!kw", name = "v", descriptor = "I")
	public final int anInt5690;

	@OriginalMember(owner = "client!kw", name = "t", descriptor = "I")
	public final int anInt5685;

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "I")
	public final int anInt5696;

	@OriginalMember(owner = "client!kw", name = "x", descriptor = "I")
	public final int anInt5689;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class2_Sub35(@OriginalArg(0) Class2_Sub21 arg0) {
		@Pc(5) int local5 = arg0.method7349();
		this.anInt5692 = local5 & 0x3FFF;
		this.anInt5695 = local5 >>> 28;
		this.anInt5691 = local5 >>> 14 & 0x3FFF;
		this.anInt5686 = arg0.method7396();
		this.anInt5694 = arg0.method7396();
		this.anInt5690 = arg0.method7396();
		this.anInt5685 = arg0.method7396();
		this.anInt5696 = arg0.method7396();
		this.anInt5689 = arg0.method7396();
	}
}
