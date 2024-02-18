import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class301 {

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
	public int anInt7681;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
	public int anInt7682;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
	public int anInt7683;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	public Class301() {
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!qd;)V")
	public Class301(@OriginalArg(0) Class301 arg0) {
		this.anInt7682 = arg0.anInt7682;
		this.anInt7683 = arg0.anInt7683;
		this.anInt7681 = arg0.anInt7681;
	}
}
