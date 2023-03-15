import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
	public static int anInt6167;

	@OriginalMember(owner = "client!tc", name = "Q", descriptor = "Lclient!oj;")
	public static final Class170 aClass170_4 = new Class170(1);

	@OriginalMember(owner = "client!tc", name = "T", descriptor = "[I")
	public static final int[] anIntArray419 = new int[50];

	@OriginalMember(owner = "client!tc", name = "W", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!tc", name = "Y", descriptor = "Lclient!ad;")
	public static HashTable aClass4_130 = new HashTable(8);

	@OriginalMember(owner = "client!tc", name = "ab", descriptor = "[I")
	public static final int[] anIntArray420 = new int[3];

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!hb;Z)Z")
	public static boolean method5630(@OriginalArg(0) Entity arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Scene.aClass6Array4 == Scene.aClass6Array2;
		@Pc(8) int local8 = 0;
		@Pc(10) byte local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method6078();
		if (arg0.aShort103 < 0 || arg0.aShort101 < 0 || arg0.aShort104 >= Scene.anInt1684 || arg0.aShort102 >= Scene.anInt3773) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort103; local34 <= arg0.aShort104; local34++) {
			for (local38 = arg0.aShort101; local38 <= arg0.aShort102; local38++) {
				@Pc(45) Class67 local45 = Static266.method4500(arg0.plane, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort103) {
						local49++;
					}
					if (local34 < arg0.aShort104) {
						local49 += 4;
					}
					if (local38 > arg0.aShort101) {
						local49 += 8;
					}
					if (local38 < arg0.aShort102) {
						local49 += 2;
					}
					@Pc(74) Class22 local74 = Static165.method3149(local49, arg0);
					@Pc(77) Class22 local77 = local45.aClass22_2;
					if (local77 == null) {
						local45.aClass22_2 = local74;
					} else {
						while (local77.aClass22_1 != null) {
							local77 = local77.aClass22_1;
						}
						local77.aClass22_1 = local74;
					}
					local45.aByte8 = (byte) (local45.aByte8 | local49);
					if (local6 && (Scene.anIntArrayArray16[local34][local38] & 0xFF000000) != 0) {
						local8 = Scene.anIntArrayArray16[local34][local38];
						local10 = Scene.aByteArrayArray4[local34][local38];
						local12 = Scene.aByteArrayArray17[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort103; local38 <= arg0.aShort104; local38++) {
				for (@Pc(150) int local150 = arg0.aShort101; local150 <= arg0.aShort102; local150++) {
					if ((Scene.anIntArrayArray16[local38][local150] & 0xFF000000) == 0) {
						Scene.anIntArrayArray16[local38][local150] = local8;
						Scene.aByteArrayArray4[local38][local150] = local10;
						Scene.aByteArrayArray17[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Scene.aClass11_Sub5Array1[Scene.anInt7077++] = arg0;
		}
		return true;
	}
}
