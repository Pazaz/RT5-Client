import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "[Lclient!jd;")
	public static Sprite[] aClass13Array12;

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "[I")
	public static final int[] anIntArray163 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "[I")
	public static final int[] anIntArray164 = new int[5];

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_59 = new LocalizedString("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLclient!r;)I")
	public static int method2509(@OriginalArg(1) Js5 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.isFileReady(Sprites.hitMarksId)) {
			local5++;
		}
		if (arg0.isFileReady(Sprites.hitBarDefaultId)) {
			local5++;
		}
		if (arg0.isFileReady(Sprites.timerBarDefaultId)) {
			local5++;
		}
		if (arg0.isFileReady(Sprites.headIconsPkId)) {
			local5++;
		}
		if (arg0.isFileReady(Sprites.headIconsPrayerId)) {
			local5++;
		}
		if (arg0.isFileReady(Sprites.hintHeadIconsId)) {
			local5++;
		}
		if (arg0.isFileReady(Sprites.hintMapMarkersId)) {
			local5++;
		}
		if (arg0.isFileReady(Sprites.mapFlagId)) {
			local5++;
		}
		if (arg0.isFileReady(Sprites.crossId)) {
			local5++;
		}
		if (arg0.isFileReady(Sprites.mapDotsId)) {
			local5++;
		}
		if (arg0.isFileReady(Sprites.scrollbarId)) {
			local5++;
		}
		if (arg0.isFileReady(Sprites.nameIconsId)) {
			local5++;
		}
		if (arg0.isFileReady(Sprites.floorShadowsId)) {
			local5++;
		}
		if (arg0.isFileReady(Sprites.compassId)) {
			local5++;
		}
		if (arg0.isFileReady(Sprites.otherLevelId)) {
			local5++;
		}
		if (arg0.isFileReady(Sprites.hintMapEdgeId)) {
			local5++;
		}
		return local5;
	}
}
