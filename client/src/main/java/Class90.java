import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class Class90 {

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
	public int anInt7113;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Ljava/lang/Object;")
	public Object anObject7;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "[I")
	public final int[] anIntArray486 = new int[100];

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "[Lclient!hb;")
	public final Class11_Sub5[] aClass11_Sub5Array3 = new Class11_Sub5[100];

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "[I")
	public final int[] anIntArray487 = new int[3];

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "[Lclient!nn;")
	public final Class2_Sub26_Sub1[] aClass2_Sub26_Sub1Array3 = new Class2_Sub26_Sub1[8];

	static {
		new Class79("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}
}
