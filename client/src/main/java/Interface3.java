import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public interface Interface3 {

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "([IIIJ)Ljava/lang/String;")
	String method3529(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2);
}
