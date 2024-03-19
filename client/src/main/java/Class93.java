import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public final class Class93 {

	@OriginalMember(owner = "client!is", name = "a", descriptor = "Lclient!me;")
	public Class7_Sub1 aClass7_Sub1_1;

	@OriginalMember(owner = "client!is", name = "b", descriptor = "I")
	public int anInt3391;

	@OriginalMember(owner = "client!is", name = "g", descriptor = "Lclient!is;")
	public Class93 aClass93_2;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
	public void method3030() {
		if (Static76.anInt2080 >= 500) {
			return;
		}
		this.anInt3391 = 0;
		this.aClass93_2 = Static69.aClass93_1;
		this.aClass7_Sub1_1 = null;
		Static76.anInt2080++;
		Static69.aClass93_1 = this;
	}
}
