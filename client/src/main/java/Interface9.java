import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public interface Interface9 {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IJ[II)Ljava/lang/String;")
	String method2360(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2);
}
