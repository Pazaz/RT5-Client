import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public final class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!ef", name = "v", descriptor = "S")
	public final short aShort20;

	static {
		new Class79("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(S)V")
	public Class2_Sub9(@OriginalArg(0) short arg0) {
		this.aShort20 = arg0;
	}
}
