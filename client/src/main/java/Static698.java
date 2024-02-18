import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static698 {

	@OriginalMember(owner = "client!wba", name = "f", descriptor = "[I")
	public static final int[] anIntArray831 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!wba", name = "d", descriptor = "I")
	public static int anInt10510 = -1;

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "Z")
	public static boolean aBoolean792 = false;

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!th;)V")
	public static void method9122(@OriginalArg(0) Class353 arg0) {
		if (Static319.anInt5080 >= 65535) {
			return;
		}
		@Pc(7) Class2_Sub7 local7 = arg0.aClass2_Sub7_3;
		Static265.aClass353Array1[Static319.anInt5080] = arg0;
		Static279.aBooleanArray11[Static319.anInt5080] = false;
		Static319.anInt5080++;
		@Pc(22) int local22 = arg0.anInt9369;
		if (arg0.aBoolean716) {
			local22 = 0;
		}
		@Pc(30) int local30 = arg0.anInt9369;
		if (arg0.aBoolean717) {
			local30 = Static299.anInt4824 - 1;
		}
		for (@Pc(39) int local39 = local22; local39 <= local30; local39++) {
			@Pc(42) int local42 = 0;
			@Pc(54) int local54 = local7.method8429() + Static247.anInt3993 - local7.method8432() >> Static52.anInt1066;
			if (local54 < 0) {
				local42 = -local54;
				local54 = 0;
			}
			@Pc(74) int local74 = local7.method8429() + local7.method8432() - Static247.anInt3993 >> Static52.anInt1066;
			if (local74 >= Static662.anInt9843) {
				local74 = Static662.anInt9843 - 1;
			}
			for (@Pc(83) int local83 = local54; local83 <= local74; local83++) {
				@Pc(90) short local90 = arg0.aShortArray131[local42++];
				@Pc(106) int local106 = (local7.method8426() + Static247.anInt3993 - local7.method8432() >> Static52.anInt1066) + (local90 >>> 8);
				@Pc(114) int local114 = local106 + (local90 & 0xFF) - 1;
				if (local106 < 0) {
					local106 = 0;
				}
				if (local114 >= Static619.anInt1566) {
					local114 = Static619.anInt1566 - 1;
				}
				for (@Pc(127) int local127 = local106; local127 <= local114; local127++) {
					@Pc(136) long local136 = Static161.aLongArrayArrayArray1[local39][local127][local83];
					if ((local136 & 0xFFFFL) == 0L) {
						Static161.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static319.anInt5080;
					} else if ((local136 & 0xFFFF0000L) == 0L) {
						Static161.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static319.anInt5080 << 16;
					} else if ((local136 & 0xFFFF00000000L) == 0L) {
						Static161.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static319.anInt5080 << 32;
					} else if ((local136 & 0xFFFF000000000000L) == 0L) {
						Static161.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static319.anInt5080 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZII)V")
	public static void method9123(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class2_Sub22 local12 = Static556.method7303(arg1, arg0);
		if (local12 != null) {
			local12.method9457();
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method9124(@OriginalArg(1) String arg0) {
		if (arg0.equals("")) {
			return;
		}
		@Pc(16) Class153 local16 = Static668.method8701();
		@Pc(29) Class2_Sub19 local29 = Static293.method4335(Static244.aClass345_53, local16.aClass186_1);
		local29.aClass2_Sub21_Sub2_1.method7389(Static231.method3379(arg0));
		local29.aClass2_Sub21_Sub2_1.method7391(arg0);
		local16.method3275(local29);
	}
}
