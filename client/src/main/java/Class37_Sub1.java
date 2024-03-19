import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public final class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
	private final int anInt1319;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lclient!ud;I)V")
	public Class37_Sub1(@OriginalArg(0) Class199 arg0, @OriginalArg(1) int arg1) {
		Static40.anInterface8_1 = arg0.method5469();
		this.anInt1319 = arg1;
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)V")
	@Override
	public void method5862(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static40.anInterface8_1.method3723(arg0, this.anInt1319);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5861(@OriginalArg(0) Component arg0) throws Exception {
		Static40.anInterface8_1.method3724(Class1_Sub2_Sub1_Sub1.lb, arg0, Static80.anInt2184);
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "()V")
	@Override
	protected void method5859() {
		Static40.anInterface8_1.method3722(this.anInt1319);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "()I")
	@Override
	protected int method5857() {
		return Static40.anInterface8_1.method3725(this.anInt1319);
	}

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "()V")
	@Override
	protected void method5872() {
		Static40.anInterface8_1.method3721(this.anInt1319, super.anIntArray558);
	}

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "()V")
	@Override
	protected void method5869() {
		Static40.anInterface8_1.method3726(this.anInt1319);
	}
}
