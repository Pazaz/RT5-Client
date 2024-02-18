import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static726 {

	@OriginalMember(owner = "client!za", name = "k", descriptor = "Lclient!om;")
	public static Class280 aClass280_7;

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method9463(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(11) String local11 = Static390.method5492(arg0);
		if (local11 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static436.anInt3849; local25++) {
			@Pc(30) String local30 = Static632.aStringArray44[local25];
			@Pc(34) String local34 = Static390.method5492(local30);
			if (Static585.method7682(arg0, local34, local30, local11)) {
				Static436.anInt3849--;
				for (@Pc(47) int local47 = local25; local47 < Static436.anInt3849; local47++) {
					Static632.aStringArray44[local47] = Static632.aStringArray44[local47 + 1];
					Static446.aStringArray35[local47] = Static446.aStringArray35[local47 + 1];
					Static10.aStringArray1[local47] = Static10.aStringArray1[local47 + 1];
					Static316.aStringArray41[local47] = Static316.aStringArray41[local47 + 1];
					Static65.aBooleanArray2[local47] = Static65.aBooleanArray2[local47 + 1];
				}
				Static344.anInt5621 = Static642.anInt9599;
				@Pc(101) Class153 local101 = Static668.method8701();
				@Pc(107) Class2_Sub19 local107 = Static293.method4335(Static8.aClass345_1, local101.aIsaacRandom_1);
				local107.aPacketBit_1.p1(Static231.method3379(arg0));
				local107.aPacketBit_1.pjstr(arg0);
				local101.method3275(local107);
				return;
			}
		}
	}
}
