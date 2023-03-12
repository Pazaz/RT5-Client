import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class Class93 {

	static {
		new LocalizedString("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!eu;)Lclient!eu;")
	public abstract Class2_Sub2_Sub6 method3695(@OriginalArg(1) Class2_Sub2_Sub6 arg0);
}
