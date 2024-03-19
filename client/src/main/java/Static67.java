import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ei", name = "ab", descriptor = "Lclient!qj;")
	public static Class162 aClass162_13;

	@OriginalMember(owner = "client!ei", name = "fb", descriptor = "[Lclient!qa;")
	public static Class29[] aClass29Array2;

	@OriginalMember(owner = "client!ei", name = "X", descriptor = "Lclient!we;")
	public static final Class215 aClass215_6 = new Class215(100);

	@OriginalMember(owner = "client!ei", name = "bb", descriptor = "Z")
	public static boolean aBoolean11 = false;

	@OriginalMember(owner = "client!ei", name = "cb", descriptor = "Ljava/lang/String;")
	public static String aString5 = "Loaded textures";

	@OriginalMember(owner = "client!ei", name = "db", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!ei", name = "gb", descriptor = "Z")
	public static boolean aBoolean12 = false;

	@OriginalMember(owner = "client!ei", name = "hb", descriptor = "I")
	public static int anInt203 = 0;

	@OriginalMember(owner = "client!ei", name = "ib", descriptor = "[I")
	public static final int[] anIntArray8 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ei", name = "jb", descriptor = "I")
	public static int anInt204 = -1;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!vp;IILclient!ai;ZILclient!ta;I)V")
	public static void method143(@OriginalArg(0) Class7_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class7_Sub1_Sub1_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class189 arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class1_Sub20 local12 = new Class1_Sub20();
		local12.anInt4018 = arg6 * 128;
		local12.anInt4012 = arg2 * 128;
		local12.anInt4002 = arg4;
		if (arg5 != null) {
			local12.aClass189_1 = arg5;
			@Pc(137) int local137 = arg5.anInt6195;
			@Pc(140) int local140 = arg5.anInt6173;
			if (arg1 == 1 || arg1 == 3) {
				local140 = arg5.anInt6195;
				local137 = arg5.anInt6173;
			}
			local12.anInt4010 = arg5.anInt6176;
			local12.anIntArray282 = arg5.anIntArray474;
			local12.anInt4004 = arg5.anInt6182;
			local12.anInt4008 = arg5.anInt6210;
			local12.anInt4017 = (arg2 + local140) * 128;
			local12.anInt4003 = arg5.anInt6185 * 128;
			local12.anInt4005 = arg5.anInt6190;
			local12.anInt4015 = (arg6 + local137) * 128;
			if (arg5.anIntArray470 != null) {
				local12.aBoolean284 = true;
				local12.method3451();
			}
			if (local12.anIntArray282 != null) {
				local12.anInt4011 = local12.anInt4010 + (int) ((double) (local12.anInt4004 - local12.anInt4010) * Math.random());
			}
			Static268.aClass130_35.method3760(local12);
			return;
		}
		if (arg3 != null) {
			local12.aClass7_Sub1_Sub1_Sub1_1 = arg3;
			@Pc(35) Class75 local35 = arg3.aClass75_1;
			if (local35.anIntArray155 != null) {
				local12.aBoolean284 = true;
				local35 = local35.method2064();
			}
			if (local35 != null) {
				local12.anInt4015 = (arg6 + local35.anInt2458) * 128;
				local12.anInt4017 = (arg2 + local35.anInt2458) * 128;
				local12.anInt4008 = Static352.method6141(arg3);
				local12.anInt4003 = local35.anInt2476 * 128;
				local12.anInt4005 = local35.anInt2464;
			}
			Static24.aClass130_4.method3760(local12);
			return;
		}
		if (arg0 == null) {
			return;
		}
		local12.aClass7_Sub1_Sub1_Sub2_1 = arg0;
		local12.anInt4015 = (arg0.method5973() + arg6) * 128;
		local12.anInt4017 = (arg2 + arg0.method5973()) * 128;
		local12.anInt4008 = Static256.method4724(arg0);
		local12.anInt4003 = arg0.anInt7135 * 128;
		local12.anInt4005 = arg0.anInt7118;
		Static195.aClass183_22.method5055((long) arg0.anInt7070, local12);
		return;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method144(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(20) String local20 = Static301.method5274(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static43.anInt1459; local25++) {
			@Pc(33) String local33 = Static301.method5274(Static46.aStringArray42[local25]);
			if (local33 != null && local33.equals(local20)) {
				Static43.anInt1459--;
				for (@Pc(45) int local45 = local25; local45 < Static43.anInt1459; local45++) {
					Static46.aStringArray42[local45] = Static46.aStringArray42[local45 + 1];
					Static210.aStringArray29[local45] = Static210.aStringArray29[local45 + 1];
					Static228.anIntArray381[local45] = Static228.anIntArray381[local45 + 1];
					Static140.aStringArray22[local45] = Static140.aStringArray22[local45 + 1];
					Static27.anIntArray56[local45] = Static27.anIntArray56[local45 + 1];
					Static221.aBooleanArray15[local45] = Static221.aBooleanArray15[local45 + 1];
				}
				Static305.anInt6396 = Class7_Sub5.anInt3948;
				Static150.aClass1_Sub16_Sub2_2.method5793(92);
				Static150.aClass1_Sub16_Sub2_2.method5771(Static279.method4951(arg0));
				Static150.aClass1_Sub16_Sub2_2.method5726(arg0);
				return;
			}
		}
	}
}
