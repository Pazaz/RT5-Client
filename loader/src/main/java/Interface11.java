import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!mf")
public interface Interface11 {

	@OriginalMember(owner = "loader!mf", name = "a", descriptor = "(IB)I")
	int method6205();

	@OriginalMember(owner = "loader!mf", name = "b", descriptor = "(II)V")
	void method6206();

	@OriginalMember(owner = "loader!mf", name = "a", descriptor = "(IIZ)V")
	void method6207() throws Exception;

	@OriginalMember(owner = "loader!mf", name = "a", descriptor = "(II)V")
	void method6208();

	@OriginalMember(owner = "loader!mf", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
	void method6209(@OriginalArg(2) Component arg0) throws Exception;

	@OriginalMember(owner = "loader!mf", name = "a", descriptor = "(I[I)V")
	void method6210(@OriginalArg(1) int[] arg0);
}
