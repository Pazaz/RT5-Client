import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class Class173 {

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
	protected final int anInt6998;

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
	public final int anInt6997;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
	public final int anInt6996;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(III)V")
	protected Class173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6998 = arg2;
		this.anInt6997 = arg0;
		this.anInt6996 = arg1;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBI)V")
	public abstract void method6248(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V")
	public abstract void method6250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)V")
	public abstract void method6251(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
