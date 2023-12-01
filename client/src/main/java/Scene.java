import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Scene {

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "[Lclient!ec;")
	public static Occluder[] levelOccluders;

	@OriginalMember(owner = "client!so", name = "g", descriptor = "I")
	public static int scale;
	@OriginalMember(owner = "client!pe", name = "R", descriptor = "I")
	public static int levelOccluderCount;
	@OriginalMember(owner = "client!om", name = "A", descriptor = "I")
	public static int anInt4716;
	@OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
	public static int anInt4693;
	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	public static int anInt1684;
	@OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
	public static int anInt5876;
	@OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
	public static int anInt3773;
	@OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
	public static int anInt3788;
	@OriginalMember(owner = "client!wp", name = "j", descriptor = "[[[Lclient!f;")
	public static Class67[][][] aClass67ArrayArrayArray5;
	@OriginalMember(owner = "client!td", name = "U", descriptor = "[Lclient!tf;")
	public static Class6[] aClass6Array3;
	@OriginalMember(owner = "client!em", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray16;
	@OriginalMember(owner = "client!sd", name = "N", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;
	@OriginalMember(owner = "client!br", name = "P", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;
	@OriginalMember(owner = "client!eu", name = "G", descriptor = "[[[Lclient!f;")
	public static Class67[][][] aClass67ArrayArrayArray4;
	@OriginalMember(owner = "client!kp", name = "e", descriptor = "[Lclient!tf;")
	public static Class6[] aClass6Array2;
	@OriginalMember(owner = "client!cu", name = "B", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;
	@OriginalMember(owner = "client!rp", name = "J", descriptor = "[Lclient!nn;")
	public static Class2_Sub26_Sub1[] aClass2_Sub26_Sub1Array2;
	@OriginalMember(owner = "client!ug", name = "x", descriptor = "[Z")
	public static boolean[] aBooleanArray57;
	@OriginalMember(owner = "client!jl", name = "Z", descriptor = "I")
	public static int anInt3139;
	@OriginalMember(owner = "client!kl", name = "j", descriptor = "[Lclient!ec;")
	public static Occluder[] aClass58Array2;
	@OriginalMember(owner = "client!dr", name = "S", descriptor = "I")
	public static int anInt1622 = 0;
	@OriginalMember(owner = "client!jm", name = "p", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;
	@OriginalMember(owner = "client!fl", name = "j", descriptor = "[Lclient!hb;")
	public static Entity[] aClass11_Sub5Array1;
	@OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
	public static int anInt7077 = 0;
	@OriginalMember(owner = "client!ae", name = "X", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;
	@OriginalMember(owner = "client!vg", name = "u", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;
	@OriginalMember(owner = "client!jj", name = "Y", descriptor = "Lclient!ku;")
	public static Class15 aClass15_1;
	@OriginalMember(owner = "client!td", name = "V", descriptor = "[[[Lclient!f;")
	public static Class67[][][] aClass67ArrayArrayArray3;
	@OriginalMember(owner = "client!vh", name = "w", descriptor = "[Lclient!tf;")
	public static Class6[] aClass6Array4;
	@OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
	public static int anInt1914;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIII)V")
	public static void addOccluder(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (levelOccluderCount + 1 >= levelOccluders.length) {
			return;
		}

		@Pc(3) Occluder occluder = new Occluder();
		occluder.minTileX = arg1 >> scale;
		occluder.maxTileX = arg2 >> scale;
		occluder.minTileZ = arg3 >> scale;
		occluder.maxTileZ = arg4 >> scale;
		occluder.anInt1689 = arg0;
		occluder.anInt1699 = arg1;
		occluder.anInt1695 = arg2;
		occluder.anInt1686 = arg3;
		occluder.anInt1692 = arg4;
		occluder.anInt1697 = arg5;
		occluder.anInt1703 = arg6;
		levelOccluders[levelOccluderCount++] = occluder;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method1381(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		scale = 7;
		anInt4716 = 0x1 << scale;
		anInt4693 = anInt4716 >> 1;
		anInt5876 = (int) Math.sqrt(anInt4693 * anInt4693 + anInt4693 * anInt4693);
		anInt1684 = arg0;
		anInt3773 = arg1;
		anInt3788 = arg2;
		aClass67ArrayArrayArray5 = new Class67[4][anInt1684][anInt3773];
		aClass6Array3 = new Class6[4];
		if (arg3) {
			anIntArrayArray16 = new int[anInt1684][anInt3773];
			aByteArrayArray17 = new byte[anInt1684][anInt3773];
			aByteArrayArray4 = new byte[anInt1684][anInt3773];
			aClass67ArrayArrayArray4 = new Class67[1][anInt1684][anInt3773];
			aClass6Array2 = new Class6[1];
		} else {
			anIntArrayArray16 = null;
			aByteArrayArray17 = null;
			aByteArrayArray4 = null;
			aClass67ArrayArrayArray4 = null;
			aClass6Array2 = null;
		}
		if (arg4) {
			aLongArrayArrayArray1 = new long[4][arg0][arg1];
			aClass2_Sub26_Sub1Array2 = new Class2_Sub26_Sub1[65535];
			aBooleanArray57 = new boolean[65535];
			anInt3139 = 0;
		} else {
			aLongArrayArrayArray1 = null;
			aClass2_Sub26_Sub1Array2 = null;
			aBooleanArray57 = null;
			anInt3139 = 0;
		}
		method5767(false);
		levelOccluders = new Occluder[500];
		levelOccluderCount = 0;
		aClass58Array2 = new Occluder[500];
		anInt1622 = 0;
		anIntArrayArrayArray9 = new int[4][anInt1684 + 1][anInt3773 + 1];
		aClass11_Sub5Array1 = new Entity[5000];
		anInt7077 = 0;
		aBooleanArrayArray1 = new boolean[anInt3788 + anInt3788 + 1][anInt3788 + anInt3788 + 1];
		aBooleanArrayArray5 = new boolean[anInt3788 + anInt3788 + 2][anInt3788 + anInt3788 + 2];
		aClass15_1 = null;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)V")
	public static void method5767(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			aClass67ArrayArrayArray3 = aClass67ArrayArrayArray4;
			aClass6Array4 = aClass6Array2;
		} else {
			aClass67ArrayArrayArray3 = aClass67ArrayArrayArray5;
			aClass6Array4 = aClass6Array3;
		}
		anInt1914 = aClass67ArrayArrayArray3.length;
	}

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII)I")
    public static int getTileHeight(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
        if (aClass6Array4 == null) {
            return 0;
        }
        @Pc(11) int local11 = arg0 >> 7;
        @Pc(15) int local15 = arg1 >> 7;
        if (local11 < 0 || local15 < 0 || Static373.buildAreaLimitX - 1 < local11 || local15 > Static242.buildAreaLimitZ - 1) {
            return 0;
        }
        @Pc(51) int local51 = arg2;
        if (arg2 < 3 && (Static359.aByteArrayArrayArray16[1][local11][local15] & 0x2) != 0) {
            local51 = arg2 + 1;
        }
        return aClass6Array4[local51].method5728(arg0, arg1);
    }
}
