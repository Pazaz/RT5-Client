import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class InputStream_Sub1 extends InputStream {

	static {
		new Class79("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!mk", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static231.method4023(30000L);
		return -1;
	}
}
