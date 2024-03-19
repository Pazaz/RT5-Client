import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public final class Class31 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
	public int anInt1055;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
	public int anInt1056;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
	public int anInt1057;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
	public Class31() {
	}

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!ce;)V")
	public Class31(@OriginalArg(0) Class31 arg0) {
		this.anInt1055 = arg0.anInt1055;
		this.anInt1056 = arg0.anInt1056;
		this.anInt1057 = arg0.anInt1057;
	}
}
