import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public final class Class39_Sub13 extends Class39 {

	@OriginalMember(owner = "client!kha", name = "i", descriptor = "Lclient!bn;")
	private Class2_Sub8 aClass2_Sub8_4;

	@OriginalMember(owner = "client!kha", name = "n", descriptor = "I")
	private final int anInt5431;

	@OriginalMember(owner = "client!kha", name = "k", descriptor = "I")
	private final int anInt5433;

	@OriginalMember(owner = "client!kha", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub13(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt5431 = arg0.g2();
		this.anInt5433 = arg0.g1();
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9158() {
		if (this.aClass2_Sub8_4 == null) {
			this.aClass2_Sub8_4 = Static728.method1153(Static398.aClass330_81, this.anInt5431, 0);
		}
		if (this.aClass2_Sub8_4 == null) {
			return false;
		} else {
			return Static311.method4537(this.aClass2_Sub8_4);
		}
	}

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "(I)V")
	@Override
	public void method9161() {
		Static706.method9221(this.aClass2_Sub8_4, this.anInt5433);
	}
}
