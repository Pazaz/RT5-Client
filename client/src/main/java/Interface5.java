import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public interface Interface5 {

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!kj;)V")
	void method4598(@OriginalArg(0) Class126 arg0);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "()I")
	int method6066();

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(Lclient!kj;)V")
	void method4600(@OriginalArg(0) Class126 arg0);

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(Lclient!kj;)V")
	void method4601(@OriginalArg(0) Class126 arg0);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[BI)V")
	void method4602(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(Lclient!kj;)V")
	void method4603(@OriginalArg(0) Class126 arg0);
}
