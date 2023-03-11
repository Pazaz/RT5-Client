import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public final class Class2_Sub2_Sub15 extends Class2_Sub2 {

	@OriginalMember(owner = "client!sn", name = "B", descriptor = "[B")
	public final byte[] aByteArray78;

	static {
		new Class79("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2_Sub15(@OriginalArg(0) byte[] arg0) {
		this.aByteArray78 = arg0;
	}
}
