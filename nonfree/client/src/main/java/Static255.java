import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!hs", name = "n", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_54 = new Class345(4, 8);

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!sb;BLclient!d;ILjava/awt/Canvas;I)Lclient!ha;")
	public static Class19 method3612(@OriginalArg(0) Class330 arg0, @OriginalArg(2) Interface4 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		if (arg3 != null) {
			@Pc(20) Dimension local20 = arg3.getSize();
			local13 = local20.width;
			local15 = local20.height;
		}
		return Static226.method7982(arg3, local15, arg4, arg1, arg2, arg0, local13);
	}
}
