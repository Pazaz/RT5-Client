import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!is", name = "f", descriptor = "I")
	public static int anInt4417;

	@OriginalMember(owner = "client!is", name = "m", descriptor = "I")
	public static int anInt4419;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (!Static18.aBoolean20 || !Static29.aBoolean60) {
			return false;
		} else if (Static432.anInt525 < 100) {
			return false;
		} else if (Static588.method7714(arg3, arg1, arg2)) {
			@Pc(38) int local38 = arg2 << Static52.anInt1066;
			@Pc(42) int local42 = arg3 << Static52.anInt1066;
			if (Static318.method8557(Static340.anInt5586, arg0, local38, local42, Static246.aClass178Array1[arg1].method7869(arg3, arg2), Static340.anInt5586)) {
				Static356.anInt5773++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/io/File;I[BI)V")
	public static void method3977(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local14.readFully(arg1, 0, arg2);
		} catch (@Pc(21) EOFException local21) {
		}
		local14.close();
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(FFFIB)F")
	public static float method3978(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(15) float[] local15 = Static558.aFloatArrayArray2[arg3];
		return arg0 * local15[2] + local15[0] * arg1 + arg2 * local15[1];
	}
}
