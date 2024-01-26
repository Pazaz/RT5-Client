import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public final class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!co", name = "z", descriptor = "I")
	public int anInt1821;

	@OriginalMember(owner = "client!co", name = "x", descriptor = "I")
	public int anInt1823;

	@OriginalMember(owner = "client!co", name = "y", descriptor = "I")
	public int anInt1824;

	@OriginalMember(owner = "client!co", name = "C", descriptor = "I")
	public int anInt1825;

	@OriginalMember(owner = "client!co", name = "D", descriptor = "I")
	public int anInt1827;

	@OriginalMember(owner = "client!co", name = "A", descriptor = "Lclient!mn;")
	public final Class249 aClass249_1;

	@OriginalMember(owner = "client!co", name = "w", descriptor = "Lclient!ok;")
	public final Class278 aClass278_1;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!mn;Lclient!hv;)V")
	public Class2_Sub2_Sub5(@OriginalArg(0) Class249 arg0, @OriginalArg(1) Class8_Sub5 arg1) {
		this.aClass249_1 = arg0;
		this.aClass278_1 = this.aClass249_1.method5590();
		this.method1707();
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(B)V")
	public void method1707() {
		this.anInt1827 = this.aClass249_1.anInt6252;
		this.anInt1824 = this.aClass249_1.anInt6250;
		this.anInt1821 = this.aClass249_1.anInt6249;
		if (this.aClass249_1.aClass73_6 != null) {
			this.aClass249_1.aClass73_6.method7138(this.aClass278_1.anInt6979, this.aClass278_1.anInt6987, this.aClass278_1.anInt6975, Static485.anIntArray888);
		}
		this.anInt1823 = Static485.anIntArray888[2];
		this.anInt1825 = Static485.anIntArray888[0];
	}
}
