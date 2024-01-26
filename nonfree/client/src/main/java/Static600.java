import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static600 {

	@OriginalMember(owner = "client!sv", name = "W", descriptor = "F")
	public static float aFloat179;

	@OriginalMember(owner = "client!sv", name = "hb", descriptor = "Lclient!nl;")
	public static Class27 aClass27_1;

	@OriginalMember(owner = "client!sv", name = "V", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_108 = new Class345(37, -1);

	@OriginalMember(owner = "client!sv", name = "N", descriptor = "[Lclient!dv;")
	public static final Class88[] aClass88Array1 = new Class88[4];

	@OriginalMember(owner = "client!sv", name = "L", descriptor = "I")
	public static int anInt8880 = 0;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BLjava/io/File;I)[B")
	public static byte[] method7864(@OriginalArg(1) File arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) byte[] local6 = new byte[arg1];
			Static282.method3977(arg0, local6, arg1);
			return local6;
		} catch (@Pc(21) IOException local21) {
			return null;
		}
	}
}
