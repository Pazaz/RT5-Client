import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
	public int anInt4342;

	@OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
	public int anInt4344;

	@OriginalMember(owner = "client!mg", name = "H", descriptor = "I")
	public int anInt4345;

	@OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
	public int anInt4346;

	@OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
	public int anInt4349;

	@OriginalMember(owner = "client!mg", name = "E", descriptor = "Lclient!la;")
	public final Class116 aClass116_2;

	@OriginalMember(owner = "client!mg", name = "M", descriptor = "Lclient!le;")
	public final Class118 aClass118_1;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!la;Lclient!qp;)V")
	public Class1_Sub1_Sub15(@OriginalArg(0) Class116 arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		this.aClass116_2 = arg0;
		this.aClass118_1 = Static236.method4503(arg0.anInt4036);
		this.method3739();
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V")
	public void method3739() {
		this.anInt4342 = this.aClass116_2.anInt4038;
		this.anInt4346 = this.aClass116_2.anInt4043;
		this.anInt4344 = this.aClass116_2.anInt4040;
		if (this.aClass116_2.aClass11_8 != null) {
			this.aClass116_2.aClass11_8.method5501(this.aClass118_1.anInt4090, this.aClass118_1.anInt4078, this.aClass118_1.anInt4083, Static84.anIntArray142);
		}
		this.anInt4349 = Static84.anIntArray142[2];
		this.anInt4345 = Static84.anIntArray142[0];
	}
}
