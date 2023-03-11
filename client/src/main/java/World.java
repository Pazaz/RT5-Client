import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public final class World extends Class3 {

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "Ljava/lang/String;")
	public String activity;

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "Ljava/lang/String;")
	public String hostname;

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
	public int ping = -1;

	static {
		new Class79("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)Lclient!kh;")
	public Country getCountry() {
		return WorldList.countries[super.country];
	}
}
