import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class255 {

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
	public int anInt6373;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "[I")
	public final int[] anIntArray495;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "[I")
	public final int[] anIntArray496;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(I)V")
	public Class255(@OriginalArg(0) int arg0) {
		this.anInt6373 = arg0;
		this.anIntArray495 = new int[this.anInt6373];
		this.anIntArray496 = new int[this.anInt6373];
	}
}
