import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)V")
	public static void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static74.aClass19_4 == null) {
			return;
		}
		@Pc(9) int local9 = Static211.anInt5574;
		@Pc(16) int local16 = Static617.anInt9434;
		Static186.method2821(arg0, arg1);
		if (Static448.anInt6796 == 0) {
			Static450.anInterface9_1 = null;
			Static450.anInterface9_1 = Static74.aClass19_4.method7988(Static74.aClass19_4.method7962(Static571.anInt8534, Static576.anInt8585), Static74.aClass19_4.method7986(Static571.anInt8534, Static576.anInt8585));
		} else if (Static448.anInt6796 == 1 && (Static651.anInterface9Array1 == null || local9 != Static211.anInt5574 || local16 != Static617.anInt9434)) {
			Static651.anInterface9Array1 = new Interface9[Static211.anInt5574 * Static617.anInt9434];
			for (@Pc(74) int local74 = 0; local74 < Static651.anInterface9Array1.length; local74++) {
				Static651.anInterface9Array1[local74] = Static74.aClass19_4.method7988(Static74.aClass19_4.method7962(Static437.anInt6628, Static714.anInt10802), Static74.aClass19_4.method7986(Static437.anInt6628, Static714.anInt10802));
			}
			Static420.anInt6436 = 1;
			Static173.anIntArray252 = new int[Static211.anInt5574 * Static617.anInt9434];
		}
		Static75.aBoolean521 = true;
	}
}
