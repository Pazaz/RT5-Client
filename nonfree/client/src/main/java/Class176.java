import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public final class Class176 {

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "Lclient!sb;")
	private final Class330 aClass330_57;

	@OriginalMember(owner = "client!ida", name = "d", descriptor = "I")
	public final int anInt4266;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class176(@OriginalArg(0) Class377 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2) {
		new Class82(64);
		this.aClass330_57 = arg2;
		this.anInt4266 = this.aClass330_57.method7608(15);
	}
}
