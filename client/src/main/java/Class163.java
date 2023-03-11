import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public final class Class163 {

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
	public int anInt4329;

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "Lclient!on;")
	public Class14 aClass14_5;

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
	public int anInt4335;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
	public int anInt4337;

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "Lclient!nm;")
	public Class163 aClass163_2;

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
	public final int anInt4330;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
	public final int anInt4333;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(II)V")
	public Class163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4330 = arg0;
		this.anInt4333 = arg1;
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!nm;I)V")
	public Class163(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1) {
		this.aClass163_2 = arg0;
		this.anInt4333 = arg1 + this.aClass163_2.anInt4333;
		this.aClass14_5 = this.aClass163_2.aClass14_5;
		this.anInt4330 = this.aClass163_2.anInt4330;
	}
}
