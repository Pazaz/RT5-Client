import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Equipment {

	@OriginalMember(owner = "client!am", name = "i", descriptor = "[I")
	public static int[] objIds;

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(B)V")
	public static void init() {
		@Pc(9) int[] local9 = new int[client.ObjTypes.capacity];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < client.ObjTypes.capacity; local13++) {
			@Pc(20) ObjType local20 = client.ObjTypes.get(local13);
			if (local20.anInt5205 >= 0 || local20.anInt5250 >= 0) {
				local9[local11++] = local13;
			}
		}
		objIds = new int[local11];
		for (@Pc(52) int local52 = 0; local52 < local11; local52++) {
			objIds[local52] = local9[local52];
		}
	}

}
