import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public final class Class104 {

	@OriginalMember(owner = "client!eka", name = "n", descriptor = "Lclient!sq;")
	public Class2_Sub49_Sub1 aClass2_Sub49_Sub1_2;

	@OriginalMember(owner = "client!eka", name = "m", descriptor = "Lclient!haa;")
	public Class2_Sub6_Sub2 aClass2_Sub6_Sub2_2;

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "Lclient!uj;")
	public Class2_Sub53 aClass2_Sub53_1;

	@OriginalMember(owner = "client!eka", name = "t", descriptor = "Lclient!dw;")
	public Class89 aClass89_1;

	@OriginalMember(owner = "client!eka", name = "q", descriptor = "I")
	public final int anInt2573;

	@OriginalMember(owner = "client!eka", name = "g", descriptor = "B")
	public final byte aByte49;

	@OriginalMember(owner = "client!eka", name = "p", descriptor = "I")
	public final int anInt2580;

	@OriginalMember(owner = "client!eka", name = "e", descriptor = "I")
	public int anInt2571;

	@OriginalMember(owner = "client!eka", name = "k", descriptor = "I")
	public final int anInt2578;

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "I")
	public final int anInt2574;

	@OriginalMember(owner = "client!eka", name = "j", descriptor = "Lclient!eo;")
	public final Class8_Sub2 aClass8_Sub2_10;

	@OriginalMember(owner = "client!eka", name = "r", descriptor = "I")
	public final int anInt2577;

	@OriginalMember(owner = "client!eka", name = "<init>", descriptor = "(BIIIIIILclient!eo;)V")
	public Class104(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class8_Sub2 arg7) {
		this.anInt2573 = arg6;
		this.aByte49 = arg0;
		this.anInt2580 = arg1;
		this.anInt2571 = arg3;
		this.anInt2578 = arg5;
		this.anInt2574 = arg2;
		this.aClass8_Sub2_10 = arg7;
		this.anInt2577 = arg4;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(B)Z")
	public boolean method2418() {
		return this.aByte49 == 2 || this.aByte49 == 3;
	}
}
