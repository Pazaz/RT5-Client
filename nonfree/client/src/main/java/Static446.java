import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "Lclient!vq;")
	public static Class390 aClass390_6;

	@OriginalMember(owner = "client!oaa", name = "p", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "Lclient!tka;")
	public static final Class355 aClass355_5 = new Class355("LIVE", "", "", 0);

	@OriginalMember(owner = "client!oaa", name = "n", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_170 = new Class225(87, -2);

	@OriginalMember(owner = "client!oaa", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[100];

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BI)Lclient!it;")
	public static Class184 method6091(@OriginalArg(1) int arg0) {
		@Pc(6) Class184[] local6 = Static546.method7249();
		for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
			if (local6[local8].anInt4575 == arg0) {
				return local6[local8];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method6093(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(14) String local14;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(18) RuntimeException_Sub1 local18 = (RuntimeException_Sub1) arg0;
			local14 = local18.aString32 + " | ";
			arg0 = local18.aThrowable1;
		} else {
			local14 = "";
		}
		@Pc(37) StringWriter local37 = new StringWriter();
		@Pc(42) PrintWriter local42 = new PrintWriter(local37);
		arg0.printStackTrace(local42);
		local42.close();
		@Pc(50) String local50 = local37.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local14 + "| " + local61;
			}
			@Pc(70) int local70 = local64.indexOf(40);
			@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
			@Pc(85) String local85;
			if (local70 == -1) {
				local85 = local64;
			} else {
				local85 = local64.substring(0, local70);
			}
			local85 = local85.trim();
			local85 = local85.substring(local85.lastIndexOf(32) + 1);
			local85 = local85.substring(local85.lastIndexOf(9) + 1);
			local14 = local14 + local85;
			if (local70 != -1 && local77 != -1) {
				@Pc(132) int local132 = local64.indexOf(".java:", local70);
				if (local132 >= 0) {
					local14 = local14 + local64.substring(local132 + 5, local77);
				}
			}
			local14 = local14 + ' ';
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIZIIII)V")
	public static void method6094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg5 + arg6;
		@Pc(19) int local19 = arg0 - arg5;
		for (@Pc(21) int local21 = arg6; local21 < local9; local21++) {
			Static696.method9037(arg1, arg2, arg4, Static723.anIntArrayArray266[local21]);
		}
		@Pc(45) int local45 = arg4 + arg5;
		@Pc(50) int local50 = arg1 - arg5;
		for (@Pc(52) int local52 = arg0; local52 > local19; local52--) {
			Static696.method9037(arg1, arg2, arg4, Static723.anIntArrayArray266[local52]);
		}
		for (@Pc(72) int local72 = local9; local72 <= local19; local72++) {
			@Pc(80) int[] local80 = Static723.anIntArrayArray266[local72];
			Static696.method9037(local45, arg2, arg4, local80);
			Static696.method9037(local50, arg3, local45, local80);
			Static696.method9037(arg1, arg2, local50, local80);
		}
	}
}
