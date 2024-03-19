import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public final class Class62 {

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Lclient!ih;")
	private final Class40_Sub2 aClass40_Sub2_11;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
	private final int anInt2130;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!ih;I)V")
	public Class62(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass40_Sub2_11 = arg0;
		this.anInt2130 = this.aClass40_Sub2_11.anOpengl1.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public void method1787(@OriginalArg(0) int arg0) {
		this.aClass40_Sub2_11.anOpengl1.glNewList(this.anInt2130 + arg0, 4864);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "()V")
	public void method1788() {
		this.aClass40_Sub2_11.anOpengl1.glEndList();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(C)V")
	public void method1789(@OriginalArg(0) char arg0) {
		this.aClass40_Sub2_11.anOpengl1.glCallList(this.anInt2130 + arg0);
	}
}
