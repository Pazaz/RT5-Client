import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public final class Class27_Sub1 extends Class27 {

	@OriginalMember(owner = "client!c", name = "u", descriptor = "Ljava/lang/String;")
	public String aString42;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "Ljava/lang/String;")
	public String aString43;

	@OriginalMember(owner = "client!c", name = "z", descriptor = "I")
	public int anInt936;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "I")
	public int anInt934 = -1;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(I)Lclient!ja;")
	public Class95 method701() {
		return Static38.aClass95Array1[super.anInt931];
	}
}
