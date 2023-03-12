import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public interface Interface6 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)I")
	int method6081();

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	void method6082();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!wm;I)V")
	void method6083(@OriginalArg(0) Class19 arg0);

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)I")
	int method6084();

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(I)I")
	int method6085();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)Z")
	boolean method6086();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BLclient!wm;)V")
	void method6087(@OriginalArg(1) Class19 arg0);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;")
	Model method6088(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1);
}
