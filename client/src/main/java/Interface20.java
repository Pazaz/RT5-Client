import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public interface Interface20 extends Interface21 {

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)Z")
	boolean method8546();

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
	void method8538();

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method8547();

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)Lclient!wda;")
	Class397 method8548();

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
	void method8543(@OriginalArg(1) int arg0);
}
