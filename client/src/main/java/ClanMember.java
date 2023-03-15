import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class ClanMember {

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "Ljava/lang/String;")
	public String username2;

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "Ljava/lang/String;")
	public String aString59;

	@OriginalMember(owner = "client!sk", name = "o", descriptor = "Ljava/lang/String;")
	public String username;

	@OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
	public int world;

	@OriginalMember(owner = "client!sk", name = "q", descriptor = "B")
	public byte rank;

	@OriginalMember(owner = "client!sk", name = "t", descriptor = "Ljava/lang/String;")
	public String worldName;
}
