import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public interface Interface6 {

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BILclient!nr;)Lclient!qc;")
	Class86 method5681(@OriginalArg(1) int arg0, @OriginalArg(2) Class40 arg1);

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)Z")
	boolean method5682();

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!nr;Z)V")
	void method5683(@OriginalArg(0) Class40 arg0);

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)I")
	int method5684();

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!nr;)V")
	void method5685(@OriginalArg(1) Class40 arg0);

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(B)I")
	int method5686();

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(B)I")
	int method5687();

	@OriginalMember(owner = "client!im", name = "d", descriptor = "(B)V")
	void method5688();
}
