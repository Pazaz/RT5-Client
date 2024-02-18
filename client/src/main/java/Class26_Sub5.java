import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jka")
public final class Class26_Sub5 extends Class26 {

	@OriginalMember(owner = "client!jka", name = "<init>", descriptor = "(Lclient!am;)V")
	public Class26_Sub5(@OriginalArg(0) Class19_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jka", name = "e", descriptor = "(I)V")
	@Override
	public void method8286() {
		super.aClass19_Sub1_21.method8132(false);
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(Lclient!mw;IB)V")
	@Override
	public void method8294(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) int arg1) {
		super.aClass19_Sub1_21.method8088(arg0);
		super.aClass19_Sub1_21.method8054(arg1);
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8290(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jka", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8289() {
		return true;
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8297(@OriginalArg(1) boolean arg0) {
		super.aClass19_Sub1_21.method8132(true);
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8292(@OriginalArg(0) boolean arg0) {
	}
}
