import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class296 {

	@OriginalMember(owner = "client!po", name = "c", descriptor = "I")
	public int anInt7509;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "C")
	private char aChar6;

	@OriginalMember(owner = "client!po", name = "g", descriptor = "Ljava/lang/String;")
	public String aString89;

	@OriginalMember(owner = "client!po", name = "e", descriptor = "Z")
	public boolean aBoolean570 = true;

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(B)Z")
	public boolean method6672() {
		return this.aChar6 == 's';
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!ge;B)V")
	public void method6673(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			this.method6674(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IILclient!ge;)V")
	private void method6674(@OriginalArg(1) int arg0, @OriginalArg(2) Packet arg1) {
		if (arg0 == 1) {
			this.aChar6 = Static346.method5084(arg1.g1b());
		} else if (arg0 == 2) {
			this.anInt7509 = arg1.g4();
		} else if (arg0 == 4) {
			this.aBoolean570 = false;
		} else if (arg0 == 5) {
			this.aString89 = arg1.gjstr();
		}
	}
}
