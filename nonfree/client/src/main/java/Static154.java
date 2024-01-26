import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static154 {

	@OriginalMember(owner = "client!er", name = "e", descriptor = "[I")
	public static int[] anIntArray237;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "Lclient!ve;")
	public static Class381 aClass381_6;

	@OriginalMember(owner = "client!er", name = "f", descriptor = "[I")
	public static final int[] anIntArray236 = new int[1000];

	@OriginalMember(owner = "client!er", name = "c", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable3 = new Hashtable();

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIB)Z")
	public static boolean method2475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
