import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public interface Interface12 {

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)I")
	int method5001();

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([BIIB)V")
	void method5002(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)J")
	long method5003();

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
	int method5004();
}
