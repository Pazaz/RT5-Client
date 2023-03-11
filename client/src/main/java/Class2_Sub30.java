import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class Class2_Sub30 extends Class2 {

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
	public int anInt5127;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
	public abstract void method4695();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!fi;)I")
	public abstract int method4696(@OriginalArg(0) Class2_Sub12_Sub2 arg0);
}
