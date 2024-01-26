import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static615 {

	@OriginalMember(owner = "client!tha", name = "e", descriptor = "I")
	public static int anInt9389;

	@OriginalMember(owner = "client!tha", name = "g", descriptor = "Z")
	public static final boolean aBoolean719 = false;

	@OriginalMember(owner = "client!tha", name = "f", descriptor = "[I")
	public static final int[] anIntArray719 = new int[13];

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(II)Lclient!pq;")
	public static Class297_Sub1 method8260(@OriginalArg(1) int arg0) {
		return Static518.aBoolean814 && Static494.anInt7396 <= arg0 && Static699.anInt10532 >= arg0 ? Static106.aClass297_Sub1Array1[arg0 - Static494.anInt7396] : null;
	}
}
