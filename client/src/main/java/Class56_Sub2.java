import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public final class Class56_Sub2 extends Class56 {

	@OriginalMember(owner = "client!hq", name = "J", descriptor = "I")
	private final int anInt4104;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!vq;I)V")
	public Class56_Sub2(@OriginalArg(0) Class390 arg0, @OriginalArg(1) int arg1) {
		Static253.anInterface7_1 = (Interface7) arg0.method8976();
		this.anInt4104 = arg1;
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
	@Override
	public void method3588(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static253.anInterface7_1.method4095(arg0, this.anInt4104);
	}

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "()I")
	@Override
	protected int method3587() {
		return Static253.anInterface7_1.method4094(this.anInt4104);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "()V")
	@Override
	protected void method3583() {
		Static253.anInterface7_1.method4097(this.anInt4104);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method3593(@OriginalArg(0) Component arg0) throws Exception {
		Static253.anInterface7_1.method4096(Static686.anInt8944, Static316.aBoolean644, arg0);
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "()V")
	@Override
	protected void method3590() {
		Static253.anInterface7_1.method4098(this.anInt4104, super.anIntArray315);
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "()V")
	@Override
	protected void method3596() {
		Static253.anInterface7_1.method4099(this.anInt4104);
	}
}
