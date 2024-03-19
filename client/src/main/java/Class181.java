import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public final class Class181 {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	public int anInt5956;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
	public final int[] anIntArray451;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "[I")
	public final int[] anIntArray452;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I)V")
	public Class181(@OriginalArg(0) int arg0) {
		this.anInt5956 = arg0;
		this.anIntArray451 = new int[this.anInt5956];
		this.anIntArray452 = new int[this.anInt5956];
	}
}
