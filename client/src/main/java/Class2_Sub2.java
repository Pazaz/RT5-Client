import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!tl", name = "u", descriptor = "Lclient!tl;")
	public Class2_Sub2 aClass2_Sub2_51;

	@OriginalMember(owner = "client!tl", name = "x", descriptor = "J")
	public long aLong215;

	@OriginalMember(owner = "client!tl", name = "z", descriptor = "Lclient!tl;")
	public Class2_Sub2 aClass2_Sub2_52;

	static {
		new Class79("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)Z")
	public final boolean method6142() {
		return this.aClass2_Sub2_52 != null;
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(B)V")
	public final void method6143() {
		if (this.aClass2_Sub2_52 != null) {
			this.aClass2_Sub2_52.aClass2_Sub2_51 = this.aClass2_Sub2_51;
			this.aClass2_Sub2_51.aClass2_Sub2_52 = this.aClass2_Sub2_52;
			this.aClass2_Sub2_51 = null;
			this.aClass2_Sub2_52 = null;
		}
	}
}
