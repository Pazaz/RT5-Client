import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class221_Sub2 extends Class221 {

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
	private final int anInt7104;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!ml;I)V")
	public Class221_Sub2(@OriginalArg(0) Class152 arg0, @OriginalArg(1) int arg1) {
		Static379.anInterface3_2 = arg0.method3764();
		this.anInt7104 = arg1;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method6327(@OriginalArg(0) Component arg0) throws Exception {
		Static379.anInterface3_2.method1993(Static356.anInt6643, arg0, Static354.aBoolean93);
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "()V")
	@Override
	protected void method6324() {
		Static379.anInterface3_2.method1996(this.anInt7104);
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "()V")
	@Override
	protected void method6329() {
		Static379.anInterface3_2.method1994(this.anInt7104, super.anIntArray485);
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
	@Override
	public void method6332(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static379.anInterface3_2.method1992(this.anInt7104, arg0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()I")
	@Override
	protected int method6321() {
		return Static379.anInterface3_2.method1995(this.anInt7104);
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "()V")
	@Override
	protected void method6322() {
		Static379.anInterface3_2.method1997(this.anInt7104);
	}
}
