import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public final class Class199 {

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
	public int anInt4928;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
	public int anInt4929;

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
	public int anInt4931;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
	public int anInt4930 = -1;

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "Lclient!gu;")
	public final Class152 aClass152_7;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!cg;)V")
	public Class199(@OriginalArg(0) Class8_Sub2_Sub1_Sub2 arg0) {
		this.aClass152_7 = new Class152_Sub2(arg0, false);
	}
}
