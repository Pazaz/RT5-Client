import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static429 {

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_81 = new Class345(90, -1);

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray21 = new boolean[200];

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)I")
	public static int method5803() {
		return Static37.anInt918++;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILclient!s;)V")
	public static void method5805(@OriginalArg(0) int arg0, @OriginalArg(1) Class178 arg1) {
		Static246.aClass178Array1[arg0] = arg1;
	}
}
