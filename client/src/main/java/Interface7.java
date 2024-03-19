import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public interface Interface7 {

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "()I")
	int method6093();

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I[BI)V")
	void method6094(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)V")
	void method6095(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
