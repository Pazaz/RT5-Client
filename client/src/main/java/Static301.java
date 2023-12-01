import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!ri", name = "X", descriptor = "[[I")
	public static int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!ri", name = "N", descriptor = "Lclient!nk;")
	public static Component aClass161_13 = null;

	@OriginalMember(owner = "client!ri", name = "P", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[128][128];

	@OriginalMember(owner = "client!ri", name = "V", descriptor = "Z")
	public static boolean aBoolean403 = false;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(Z)V")
	public static void method5188() {
		for (@Pc(14) ProjAnimNode local14 = (ProjAnimNode) Static332.projAnims.head(); local14 != null; local14 = (ProjAnimNode) Static332.projAnims.next()) {
			@Pc(19) ProjAnim local19 = local14.aClass11_Sub5_Sub3_1;
			if (local19.plane != Static355.anInt6585 || local19.anInt4722 < client.cycle) {
				local14.unlink();
				local19.method4391();
			} else if (client.cycle >= local19.anInt4725) {
				if (local19.anInt4714 > 0) {
					@Pc(56) Npc local56 = NpcList.npcs[local19.anInt4714 - 1];
					if (local56 != null && local56.xFine >= 0 && local56.xFine < Static373.buildAreaLimitX * 128 && local56.zFine >= 0 && Static242.buildAreaLimitZ * 128 > local56.zFine) {
						local19.setTarget(Scene.getTileHeight(local56.xFine, local56.zFine, local19.plane) - local19.anInt4736, local56.xFine, client.cycle, local56.zFine);
					}
				}
				if (local19.anInt4714 < 0) {
					@Pc(111) int local111 = -local19.anInt4714 - 1;
					@Pc(120) Player local120;
					if (local111 == PlayerList.selfId) {
						local120 = PlayerList.self;
					} else {
						local120 = PlayerList.players[local111];
					}
					if (local120 != null && local120.xFine >= 0 && local120.xFine < Static373.buildAreaLimitX * 128 && local120.zFine >= 0 && local120.zFine < Static242.buildAreaLimitZ * 128) {
						local19.setTarget(Scene.getTileHeight(local120.xFine, local120.zFine, local19.plane) - local19.anInt4736, local120.xFine, client.cycle, local120.zFine);
					}
				}
				local19.method4392(client.sceneDelta);
				Static329.method5630(local19, true);
			}
		}
	}
}
