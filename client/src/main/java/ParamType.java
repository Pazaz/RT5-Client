import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class ParamType {

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "Ljava/lang/String;")
	public String defaultString;

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
	public int defaultInt;

	@OriginalMember(owner = "client!vp", name = "j", descriptor = "Z")
	public boolean aBoolean476 = true;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!bt;I)V")
	public void decode(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.decode(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)Z")
	public boolean isString() {
		return this.aChar5 == 's';
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IILclient!bt;)V")
	private void decode(@OriginalArg(0) int arg0, @OriginalArg(2) Packet arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static78.forCharKey(arg1.g1b());
		} else if (arg0 == 2) {
			this.defaultInt = arg1.g4();
		} else if (arg0 == 4) {
			this.aBoolean476 = false;
		} else if (arg0 == 5) {
			this.defaultString = arg1.gjstr();
		}
	}
}
