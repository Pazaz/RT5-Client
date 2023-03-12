import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public final class Class2_Sub2_Sub5 extends SecondaryNode {

	@OriginalMember(owner = "client!d", name = "B", descriptor = "I")
	public int anInt1389;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "I")
	public int anInt1390;

	@OriginalMember(owner = "client!d", name = "E", descriptor = "I")
	public int anInt1391;

	@OriginalMember(owner = "client!d", name = "O", descriptor = "I")
	public int anInt1395;

	@OriginalMember(owner = "client!d", name = "P", descriptor = "I")
	public int anInt1396;

	@OriginalMember(owner = "client!d", name = "D", descriptor = "Lclient!nm;")
	public final Class163 aClass163_1;

	@OriginalMember(owner = "client!d", name = "K", descriptor = "Lclient!bp;")
	public final Class28 aClass28_1;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!nm;Lclient!oh;)V")
	public Class2_Sub2_Sub5(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class12_Sub5 arg1) {
		this.aClass163_1 = arg0;
		this.aClass28_1 = Static314.method5367(arg0.anInt4330);
		this.method1564();
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	public void method1564() {
		this.anInt1395 = this.aClass163_1.anInt4329;
		this.anInt1390 = this.aClass163_1.anInt4335;
		this.anInt1396 = this.aClass163_1.anInt4337;
		if (this.aClass163_1.aClass14_5 != null) {
			this.aClass163_1.aClass14_5.method3934(this.aClass28_1.anInt754, this.aClass28_1.anInt748, this.aClass28_1.anInt741, Static329.anIntArray420);
		}
		this.anInt1389 = Static329.anIntArray420[0];
		this.anInt1391 = Static329.anIntArray420[2];
	}
}
