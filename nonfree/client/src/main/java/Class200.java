import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public final class Class200 implements Interface10 {

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
	public final int anInt4996;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(I)V")
	public Class200(@OriginalArg(0) int arg0) {
		this.anInt4996 = arg0;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)Lclient!kda;")
	@Override
	public Class204 method5357() {
		return Static667.aClass204_15;
	}
}
