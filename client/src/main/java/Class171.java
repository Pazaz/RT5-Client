import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class171 {

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
	public int anInt4700 = 0;

	static {
		new Class79("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!bt;)V")
	public void method4370(@OriginalArg(1) Buffer arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.g1();
			if (local12 == 0) {
				return;
			}
			this.method4374(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILclient!bt;)V")
	private void method4374(@OriginalArg(1) int arg0, @OriginalArg(2) Buffer arg1) {
		if (arg0 == 5) {
			this.anInt4700 = arg1.method4829();
		}
	}
}
