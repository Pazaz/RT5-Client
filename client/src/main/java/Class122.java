import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class122 {

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_17;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
	public final int anInt3352;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!bf;II)V")
	public Class122(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass19_Sub1_17 = arg0;
		this.anInt3352 = arg2;
	}

	@OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass19_Sub1_17.method836(this.anInt3352);
		super.finalize();
	}
}
