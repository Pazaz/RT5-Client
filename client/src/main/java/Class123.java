import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public abstract class Class123 {

	static {
		new LocalizedString("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	}

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	protected Class123() {
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
	public abstract void method3337();

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
	public abstract void method3338();

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)Lclient!rk;")
	public abstract Class37 method3342();

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)Z")
	public abstract boolean method3343(@OriginalArg(1) int arg0);
}
