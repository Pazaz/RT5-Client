import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!qfa", name = "m", descriptor = "Lclient!hh;")
	public static final Class162 aClass162_4 = new Class162("RC", 1);

	@OriginalMember(owner = "client!qfa", name = "n", descriptor = "Lclient!gga;")
	public static Class144 aClass144_1 = new Class144(8);

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(B)I")
	public static int method6831() {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		if (Static446.aClass390_6.aBoolean781 && !Static446.aClass390_6.aBoolean779) {
			local5 = true;
			if (Static292.aClass2_Sub43_2.anInt7610 < 512 && Static292.aClass2_Sub43_2.anInt7610 != 0) {
				local5 = false;
			}
			if (Static689.aString119.startsWith("win")) {
				local9 = true;
				local7 = true;
			} else {
				local7 = true;
			}
		}
		if (Static698.aBoolean792) {
			local7 = false;
		}
		if (Static78.aBoolean139) {
			local9 = false;
		}
		if (Static449.aBoolean511) {
			local5 = false;
		}
		if (!local5 && !local7 && !local9) {
			return Static625.method8337();
		}
		@Pc(82) int local82 = -1;
		@Pc(84) int local84 = -1;
		@Pc(86) int local86 = -1;
		if (local5) {
			try {
				local82 = Static363.method6235(1000, 2);
			} catch (@Pc(95) Exception local95) {
			}
		}
		if (local9) {
			try {
				local86 = Static363.method6235(1000, 3);
				if (Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7915() == 3) {
					@Pc(114) Class84 local114 = Static163.aClass19_17.method7981();
					@Pc(119) long local119 = local114.aLong91 & 0xFFFFFFFFFFFFL;
					@Pc(122) int local122 = local114.anInt2329;
					if (local122 == 4318) {
						local7 &= local119 >= 64425238954L;
					} else if (local122 == 4098) {
						local7 &= local119 >= 60129613779L;
					}
				}
			} catch (@Pc(161) Exception local161) {
			}
		}
		if (local7) {
			try {
				local84 = Static363.method6235(1000, 1);
			} catch (@Pc(171) Exception local171) {
			}
		}
		if (local82 == -1 && local84 == -1 && local86 == -1) {
			return Static625.method8337();
		}
		local84 = (int) ((float) local84 * 1.1F);
		local86 = (int) ((float) local86 * 1.1F);
		if (local82 > local86 && local82 > local84) {
			return Static611.method8228(local82);
		} else if (local86 > local84) {
			return Static399.method5571(3, local86);
		} else {
			return Static399.method5571(1, local84);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(III)Z")
	public static boolean method6832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static280.method4087(arg2, arg1)) {
			return Static77.method1560(arg2, arg1) | (arg1 & 0x9000) != 0 | Static433.method5601(arg2, arg1) ? true : (arg2 & 0x37) == 0 & (Static526.method7073(arg2, arg1) | (arg1 & 0x2000) != 0 | Static220.method3197(arg1, arg2));
		} else {
			return false;
		}
	}
}
