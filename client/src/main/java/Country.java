import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Country {

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "Ljava/lang/String;")
	public String name;

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
	public int flag;
}
