import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public class SoundPlayer {

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZIII)V")
	public static void play(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (client.preferences.anInt4888 == 0 || arg0 == 0 || Static243.anInt4503 >= 50 || arg3 == -1) {
			return;
		}
		Static256.anIntArray321[Static243.anInt4503] = arg3;
		Static329.anIntArray419[Static243.anInt4503] = arg0;
		Static237.anIntArray283[Static243.anInt4503] = arg2;
		Static196.aClass247Array2[Static243.anInt4503] = null;
		Static162.anIntArray188[Static243.anInt4503] = 0;
		Static223.anIntArray256[Static243.anInt4503] = arg1;
		Static243.anInt4503++;
	}

}
