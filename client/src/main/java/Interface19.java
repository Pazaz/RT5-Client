import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public interface Interface19 {

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IJLclient!it;[I)Ljava/lang/String;")
	String method5631(@OriginalArg(1) long arg0, @OriginalArg(2) Class184 arg1, @OriginalArg(3) int[] arg2);
}
