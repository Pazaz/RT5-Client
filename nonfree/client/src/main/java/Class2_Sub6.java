import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public abstract class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!dea", name = "l", descriptor = "Lclient!dea;")
	public Class2_Sub6 aClass2_Sub6_9;

	@OriginalMember(owner = "client!dea", name = "n", descriptor = "I")
	public int anInt10517;

	@OriginalMember(owner = "client!dea", name = "k", descriptor = "Lclient!rm;")
	public Class2_Sub49 aClass2_Sub49_6;

	@OriginalMember(owner = "client!dea", name = "m", descriptor = "Z")
	public volatile boolean aBoolean793 = true;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V")
	public abstract void method9130(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "([III)V")
	public abstract void method9131(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "()I")
	public abstract int method9132();

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "()Lclient!dea;")
	public abstract Class2_Sub6 method9133();

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "([III)V")
	protected final void method9134(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean793) {
			this.method9131(arg0, arg1, arg2);
		} else {
			this.method9130(arg2);
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "()Lclient!dea;")
	public abstract Class2_Sub6 method9135();

	@OriginalMember(owner = "client!dea", name = "d", descriptor = "()I")
	public int method9136() {
		return 255;
	}
}
