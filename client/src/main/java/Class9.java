import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public final class Class9 {

	@OriginalMember(owner = "client!am", name = "d", descriptor = "Lclient!ih;")
	private final Class40_Sub2 aClass40_Sub2_1;

	@OriginalMember(owner = "client!am", name = "e", descriptor = "S")
	public final short aShort13;

	@OriginalMember(owner = "client!am", name = "c", descriptor = "Lclient!cj;")
	public Interface2 anInterface2_1;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "B")
	public byte aByte9;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "B")
	public final byte aByte8;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!ih;Lclient!cj;III)V")
	public Class9(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass40_Sub2_1 = arg0;
		this.aShort13 = (short) arg2;
		this.anInterface2_1 = arg1;
		this.aByte9 = (byte) arg4;
		this.aByte8 = (byte) arg3;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
	public void method350() {
		this.aClass40_Sub2_1.method2813(this.anInterface2_1);
		this.anInterface2_1.method3540(this);
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
	public void method351() {
		this.aClass40_Sub2_1.method2813(this.anInterface2_1);
		this.anInterface2_1.method3539(this);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
	public void method352() {
		this.aClass40_Sub2_1.method2813(this.anInterface2_1);
		this.anInterface2_1.method3541(this);
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
	public void method353() {
		this.aClass40_Sub2_1.method2813(this.anInterface2_1);
		this.anInterface2_1.method3538(this);
	}
}
