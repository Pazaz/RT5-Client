import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public interface Interface1 {

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)J")
	long method9352();

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)I")
	int method9353();

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)I")
	int method9354();

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(II[BI)V")
	void method9355(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1);
}
