import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public abstract class Class2_Sub38 extends Class2 {

	@OriginalMember(owner = "client!uk", name = "t", descriptor = "Z")
	public boolean aBoolean479;

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "Lclient!bf;")
	protected final Class19_Sub1 aClass19_Sub1_41;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!bf;)V")
	public Class2_Sub38(@OriginalArg(0) Class19_Sub1 arg0) {
		this.aClass19_Sub1_41 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "()Z")
	public abstract boolean method6300();

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "()I")
	public int method6301() {
		return 0;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)Z")
	public final boolean method6302() {
		return false;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)I")
	public final int method6303() {
		return 1;
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)Z")
	public final boolean method6304() {
		return this.aBoolean479;
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "()V")
	public abstract void method6305();

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
	public abstract void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
	public abstract void method6307(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "()Z")
	public abstract boolean method6308();

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!al;Lclient!al;)V")
	public abstract void method6309(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1 arg1, @OriginalArg(2) Class8_Sub1 arg2);
}
