import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public final class Class359 {

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "Lclient!ri;")
	public Interface20 anInterface20_7;

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "Z")
	public boolean aBoolean729;

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "Lclient!ri;")
	public Interface20 anInterface20_8;

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "Z")
	public boolean aBoolean728;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Z)V")
	public Class359(@OriginalArg(0) boolean arg0) {
		this.aBoolean728 = arg0;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
	public void method8339() {
		if (this.anInterface20_7 != null) {
			this.anInterface20_7.method8538();
		}
		this.aBoolean729 = false;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)Z")
	public boolean method8340() {
		return this.aBoolean729 && !this.aBoolean728;
	}
}
