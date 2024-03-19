import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public interface Interface1 {

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)J")
	long method3076();

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!bp;I)Z")
	boolean method3077(@OriginalArg(0) Interface1 arg0);
}
