import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class1_Sub33 extends Class1 {

	@OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
	public final int anInt6052;

	@OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
	public final int anInt6049;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(II)V")
	public Class1_Sub33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6052 = arg1;
		this.anInt6049 = arg0;
	}
}
