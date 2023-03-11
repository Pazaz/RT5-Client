import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "Lclient!je;")
	public static Class113 aClass113_2;

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "Lclient!s;")
	public static final Class210 aClass210_2 = new Class210(11, 3);

	@OriginalMember(owner = "client!bk", name = "m", descriptor = "Lclient!kk;")
	public static final Class127 aClass127_1 = new Class127("WTQA", 2);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)I")
	public static int method870(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(42) int local42 = (arg0 & 0x7F) * 96 >> 7;
			if (local42 < 2) {
				local42 = 2;
			} else if (local42 > 126) {
				local42 = 126;
			}
			return (arg0 & 0xFF80) + local42;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!bt;B)V")
	public static void method875(@OriginalArg(0) Buffer arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static317.aClass205_6 != null) {
			@Pc(20) int local20;
			try {
				Static317.aClass205_6.method5214(0L);
				Static317.aClass205_6.method5220(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.pdata(local8, 24);
	}
}
