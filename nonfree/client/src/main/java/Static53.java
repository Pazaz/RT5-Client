import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!bp", name = "i", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_7 = new Class345(53, 3);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method1168(@OriginalArg(1) String arg0) {
		if (!Static93.aClass390_1.aBoolean781) {
			return -1;
		} else if (Static154.aHashtable3.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(22) String local22 = Static308.method4484(arg0);
			if (local22 == null) {
				return -1;
			}
			@Pc(36) String local36 = Static185.aString34 + local22;
			if (!Static442.aClass330_90.method7577(local36, "")) {
				return -1;
			} else if (Static442.aClass330_90.method7598(local36)) {
				@Pc(62) byte[] local62 = Static442.aClass330_90.method7600(local36, "");
				@Pc(68) File local68;
				try {
					local68 = Static649.method8490(local22);
				} catch (@Pc(70) RuntimeException local70) {
					return -1;
				}
				if (local62 == null || local68 == null) {
					return -1;
				}
				@Pc(80) boolean local80 = true;
				@Pc(84) byte[] local84 = Static629.method8348(local68);
				if (local84 != null && local84.length == local62.length) {
					for (@Pc(99) int local99 = 0; local99 < local84.length; local99++) {
						if (local62[local99] != local84[local99]) {
							local80 = false;
							break;
						}
					}
				} else {
					local80 = false;
				}
				try {
					if (!local80) {
						Static93.aClass390_1.method8987(local68, local62);
					}
				} catch (@Pc(145) Throwable local145) {
					return -1;
				}
				Static196.method2947(local68, arg0);
				return 100;
			} else {
				return Static442.aClass330_90.method7593(local36);
			}
		}
	}
}
