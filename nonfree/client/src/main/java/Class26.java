import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public abstract class Class26 {

	@OriginalMember(owner = "client!rea", name = "i", descriptor = "Lclient!am;")
	protected final Class19_Sub1 aClass19_Sub1_21;

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lclient!am;)V")
	public Class26(@OriginalArg(0) Class19_Sub1 arg0) {
		this.aClass19_Sub1_21 = arg0;
	}

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "(I)V")
	public void method8285() {
	}

	@OriginalMember(owner = "client!rea", name = "e", descriptor = "(I)V")
	public abstract void method8286();

	@OriginalMember(owner = "client!rea", name = "d", descriptor = "(I)V")
	public void method8287() {
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)V")
	public void method8288() {
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(B)Z")
	public abstract boolean method8289();

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ZII)V")
	public abstract void method8290(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(B)V")
	public void method8291() {
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ZZ)V")
	public abstract void method8292(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lclient!mw;IB)V")
	public abstract void method8294(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V")
	public void method8295() {
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Z)V")
	public void method8296() {
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IZ)V")
	public abstract void method8297(@OriginalArg(1) boolean arg0);
}
