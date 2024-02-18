import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public final class Class165 implements Interface26 {

	@OriginalMember(owner = "client!hia", name = "e", descriptor = "I")
	public final int anInt3961;

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "[F")
	public final float[] aFloatArray21;

	@OriginalMember(owner = "client!hia", name = "c", descriptor = "I")
	public final int anInt3960;

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(II)V")
	public Class165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3961 = arg0;
		this.aFloatArray21 = new float[arg0 * arg1];
		this.anInt3960 = arg1;
	}
}
