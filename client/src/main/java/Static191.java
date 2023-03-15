import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "[I")
	public static final int[] anIntArray101 = new int[14];

	@OriginalMember(owner = "client!ku", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray13 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!mr;I)V")
	public static void method1581(@OriginalArg(0) PathingEntity arg0) {
		if (arg0 instanceof Npc) {
			@Pc(5) Npc local5 = (Npc) arg0;
			if (local5.type != null) {
				Static241.method4191(local5, local5.plane != PlayerList.self.plane);
			}
		} else if (arg0 instanceof Player) {
			@Pc(27) Player local27 = (Player) arg0;
			Static184.method3397(PlayerList.self.plane != local27.plane, local27);
		}
	}
}
