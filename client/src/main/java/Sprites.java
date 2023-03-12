import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public class Sprites {

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
	public static int p11FullId;
	@OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
	public static int p12FullId;
	@OriginalMember(owner = "client!ek", name = "Z", descriptor = "I")
	public static int b12FullId;
	@OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
	public static int hitMarksId;
	@OriginalMember(owner = "client!l", name = "f", descriptor = "I")
	public static int hitBarDefaultId;
	@OriginalMember(owner = "client!om", name = "ob", descriptor = "I")
	public static int timerBarDefaultId;
	@OriginalMember(owner = "client!we", name = "E", descriptor = "I")
	public static int headIconsPkId;
	@OriginalMember(owner = "client!jo", name = "w", descriptor = "I")
	public static int headIconsPrayerId;
	@OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
	public static int hintHeadIconsId;
	@OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
	public static int hintMapMarkersId;
	@OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
	public static int mapFlagId;
	@OriginalMember(owner = "client!it", name = "d", descriptor = "I")
	public static int crossId;
	@OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
	public static int mapDotsId;
	@OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
	public static int scrollbarId;
	@OriginalMember(owner = "client!fp", name = "r", descriptor = "I")
	public static int nameIconsId;
	@OriginalMember(owner = "client!br", name = "R", descriptor = "I")
	public static int floorShadowsId;
	@OriginalMember(owner = "client!hs", name = "v", descriptor = "I")
	public static int compassId;
	@OriginalMember(owner = "client!so", name = "j", descriptor = "I")
	public static int otherLevelId;
	@OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
	public static int hintMapEdgeId;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLclient!r;)V")
	public static void init(@OriginalArg(1) Js5 archive) {
		p11FullId = archive.getGroupId("p11_full");
		p12FullId = archive.getGroupId("p12_full");
		b12FullId = archive.getGroupId("b12_full");
		hitMarksId = archive.getGroupId("hitmarks");
		hitBarDefaultId = archive.getGroupId("hitbar_default");
		timerBarDefaultId = archive.getGroupId("timerbar_default");
		headIconsPkId = archive.getGroupId("headicons_pk");
		headIconsPrayerId = archive.getGroupId("headicons_prayer");
		hintHeadIconsId = archive.getGroupId("hint_headicons");
		hintMapMarkersId = archive.getGroupId("hint_mapmarkers");
		mapFlagId = archive.getGroupId("mapflag");
		crossId = archive.getGroupId("cross");
		mapDotsId = archive.getGroupId("mapdots");
		scrollbarId = archive.getGroupId("scrollbar");
		nameIconsId = archive.getGroupId("name_icons");
		floorShadowsId = archive.getGroupId("floorshadows");
		compassId = archive.getGroupId("compass");
		otherLevelId = archive.getGroupId("otherlevel");
		hintMapEdgeId = archive.getGroupId("hint_mapedge");
	}

}
