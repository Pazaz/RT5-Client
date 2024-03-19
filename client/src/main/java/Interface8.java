import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public interface Interface8 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I[I)V")
	void method3721(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
	void method3722(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIZ)V")
	void method3723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
	void method3724(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)I")
	int method3725(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)V")
	void method3726(@OriginalArg(1) int arg0);
}
