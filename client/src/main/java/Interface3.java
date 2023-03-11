import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public interface Interface3 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI)V")
	void method1992(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BILjava/awt/Component;Z)V")
	void method1993(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[I)V")
	void method1994(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
	int method1995(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)V")
	void method1996(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)V")
	void method1997(@OriginalArg(0) int arg0);
}
