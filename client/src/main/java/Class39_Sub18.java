import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public final class Class39_Sub18 extends Class39 {

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
	private final int anInt8181;

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
	private final int anInt8183;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
	private final int anInt8180;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
	private final int anInt8182;

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
	private final int anInt8178;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
	private final int anInt8184;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub18(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt8181 = arg0.g2();
		this.anInt8183 = arg0.g2();
		this.anInt8180 = arg0.g2();
		this.anInt8182 = arg0.g2();
		this.anInt8178 = arg0.g2();
		this.anInt8184 = arg0.g2();
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
	@Override
	public void method9161() {
		Static75.aClass357Array2[this.anInt8181].method8328(0);
		Static75.aClass357Array2[this.anInt8183].method8328(1);
		Static71.anInt1581 = this.anInt8178;
		Static197.anInt3260 = 0;
		Static374.anInt5907 = 1;
		Static511.anInt7645 = 3;
		Static260.anInt4244 = 0;
		Static591.anInt8739 = this.anInt8182;
		Static303.anInt4868 = this.anInt8180;
		Static410.anInt6322 = this.anInt8184;
		Static583.method7659();
		Static421.aBoolean480 = true;
	}
}
