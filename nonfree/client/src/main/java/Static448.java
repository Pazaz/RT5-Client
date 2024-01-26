import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
	public static int anInt6796;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
	public static int anInt6801;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIFFFIIFFLclient!tk;)[B")
	public static byte[] method6106(@OriginalArg(3) float arg0, @OriginalArg(4) float arg1, @OriginalArg(5) float arg2, @OriginalArg(8) float arg3, @OriginalArg(9) float arg4, @OriginalArg(10) Class59 arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static314.method4565(arg1, arg3, arg2, arg0, local10, 0, arg4, arg5);
		return local10;
	}
}
