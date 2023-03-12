import org.openrs2.deob.annotation.OriginalMember;

public class NpcList {

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "[I")
	public static final int[] ids = new int[1024];
	@OriginalMember(owner = "client!vh", name = "s", descriptor = "[Lclient!oe;")
	public static final Npc[] npcs = new Npc[32768];
	@OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
	public static int size = 0;

}
