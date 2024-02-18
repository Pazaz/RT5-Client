import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public final class Class394 {

	@OriginalMember(owner = "client!w", name = "f", descriptor = "I")
	public int anInt10412;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "I")
	public int anInt10416;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "I")
	public int anInt10419;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "I")
	public int anInt10422;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "I")
	private final int anInt10421;

	@OriginalMember(owner = "client!w", name = "m", descriptor = "I")
	public final int anInt10415;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class394(@OriginalArg(0) Class2_Sub21 arg0) {
		this.anInt10421 = arg0.method7346();
		this.anInt10415 = arg0.method7396();
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
	public void method9033() {
		Static553.method7289(this.anInt10412, -1, Static461.anIntArray555[this.anInt10415], this.anInt10419, this.anInt10416, this.anInt10415, this.anInt10422);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIBII)V")
	public void method9038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static553.method7289(arg1, this.anInt10421, Static461.anIntArray555[this.anInt10415], arg0, arg3, this.anInt10415, arg2);
		this.anInt10422 = arg2;
		this.anInt10412 = arg1;
		this.anInt10416 = arg3;
		this.anInt10419 = arg0;
	}
}
