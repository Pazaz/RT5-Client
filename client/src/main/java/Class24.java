import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public final class Class24 {

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
	public final int anInt591;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
	public final int anInt592;

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
	public final int anInt588;

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
	public final int anInt589;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(IIII)V")
	public Class24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt591 = arg3;
		this.anInt592 = arg0;
		this.anInt588 = arg1;
		this.anInt589 = arg2;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)Lclient!aq;")
	public Class24 method682(@OriginalArg(1) int arg0) {
		return new Class24(this.anInt592, arg0, this.anInt589, this.anInt591);
	}
}
