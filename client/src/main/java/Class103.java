import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public abstract class Class103 {

	@OriginalMember(owner = "client!li", name = "h", descriptor = "I")
	public final int anInt6633;

	@OriginalMember(owner = "client!li", name = "d", descriptor = "I")
	public final int anInt6629;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "I")
	protected final int anInt6627;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(III)V")
	protected Class103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6633 = arg0;
		this.anInt6629 = arg1;
		this.anInt6627 = arg2;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIB)V")
	public abstract void method5648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IZI)V")
	public abstract void method5650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V")
	public abstract void method5652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
