import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "([IB[I)V")
	public static void method7241(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static3.anIntArray13 = null;
			Static203.aByteArrayArrayArray2 = null;
			Static242.anIntArray311 = null;
			return;
		}
		Static3.anIntArray13 = arg0;
		Static242.anIntArray311 = new int[arg0.length];
		Static203.aByteArrayArrayArray2 = new byte[arg0.length][][];
		for (@Pc(39) int local39 = 0; local39 < Static3.anIntArray13.length; local39++) {
			Static203.aByteArrayArrayArray2[local39] = new byte[arg1[local39]][];
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7242(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(11) String local11 = Static390.method5492(arg0);
		if (local11 == null) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < Static327.anInt5392; local22++) {
			@Pc(27) String local27 = Static330.aStringArray25[local22];
			@Pc(31) String local31 = Static390.method5492(local27);
			if (Static585.method7682(arg0, local31, local27, local11)) {
				Static327.anInt5392--;
				for (@Pc(44) int local44 = local22; local44 < Static327.anInt5392; local44++) {
					Static330.aStringArray25[local44] = Static330.aStringArray25[local44 + 1];
					Static572.aStringArray42[local44] = Static572.aStringArray42[local44 + 1];
					Static371.anIntArray455[local44] = Static371.anIntArray455[local44 + 1];
					Static419.aStringArray33[local44] = Static419.aStringArray33[local44 + 1];
					Static715.anIntArray881[local44] = Static715.anIntArray881[local44 + 1];
					Static623.aBooleanArray30[local44] = Static623.aBooleanArray30[local44 + 1];
					Static429.aBooleanArray21[local44] = Static429.aBooleanArray21[local44 + 1];
				}
				Static344.anInt5621 = Static642.anInt9599;
				@Pc(118) Class153 local118 = Static668.method8701();
				@Pc(124) Class2_Sub19 local124 = Static293.method4335(Static86.aClass345_16, local118.aIsaacRandom_1);
				local124.aPacketBit_1.p1(Static231.method3379(arg0));
				local124.aPacketBit_1.pjstr(arg0);
				local118.method3275(local124);
				return;
			}
		}
	}
}
