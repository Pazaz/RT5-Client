import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class244_Sub1 extends Class244 {

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "[Lclient!mc;")
	public final Class237[] aClass237Array1;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "([Lclient!mc;)V")
	public Class244_Sub1(@OriginalArg(0) Class237[] arg0) {
		this.aClass237Array1 = arg0;
	}
}
