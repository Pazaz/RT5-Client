import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!jl", name = "Z", descriptor = "I")
	public static int anInt3139;

	@OriginalMember(owner = "client!jl", name = "ab", descriptor = "I")
	public static int anInt3140;

	@OriginalMember(owner = "client!jl", name = "bb", descriptor = "F")
	public static float aFloat38;

	@OriginalMember(owner = "client!jl", name = "eb", descriptor = "Lclient!bk;")
	public static Class24 aClass24_1;

	@OriginalMember(owner = "client!jl", name = "V", descriptor = "Lclient!h;")
	public static final Class89 aClass89_129 = new Class89(79, 7);

	@OriginalMember(owner = "client!jl", name = "W", descriptor = "I")
	public static final int anInt3138 = 0;

	@OriginalMember(owner = "client!jl", name = "X", descriptor = "Lclient!nk;")
	public static Class161 aClass161_5 = null;

	@OriginalMember(owner = "client!jl", name = "Y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!jl", name = "cb", descriptor = "Lclient!s;")
	public static final Class210 aClass210_8 = new Class210(8, 6);

	@OriginalMember(owner = "client!jl", name = "db", descriptor = "Lclient!h;")
	public static final Class89 aClass89_130 = new Class89(86, 10);

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIILclient!ur;Lclient!vi;Lclient!kf;Ljava/lang/String;Lclient!nk;)V")
	public static void method3147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class130 arg6, @OriginalArg(8) Class239 arg7, @OriginalArg(9) Class78 arg8, @OriginalArg(10) String arg9, @OriginalArg(11) Class161 arg10) {
		@Pc(15) int local15;
		if (Static314.anInt5911 == 4) {
			local15 = (int) Static277.aFloat67 & 0x3FFF;
		} else {
			local15 = Static6.anInt158 + (int) Static277.aFloat67 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg10.anInt4248 / 2, arg10.anInt4261 / 2) + 10;
		@Pc(43) int local43 = arg4 * arg4 + arg1 * arg1;
		if (local43 > local34 * local34) {
			return;
		}
		@Pc(53) int local53 = Class19.anIntArray178[local15];
		@Pc(57) int local57 = Class19.anIntArray177[local15];
		if (Static314.anInt5911 != 4) {
			local57 = local57 * 256 / (Static97.anInt2005 + 256);
			local53 = local53 * 256 / (Static97.anInt2005 + 256);
		}
		@Pc(86) int local86 = local57 * arg4 + local53 * arg1 >> 15;
		@Pc(96) int local96 = arg1 * local57 - local53 * arg4 >> 15;
		@Pc(103) int local103 = arg7.method6124(null, arg9, 100);
		@Pc(109) int local109 = local86 - local103 / 2;
		@Pc(117) int local117 = arg7.method6121(arg9, null);
		if (-arg10.anInt4248 <= local109 && arg10.anInt4248 >= local109 && -arg10.anInt4261 <= local96 && local96 <= arg10.anInt4261) {
			arg6.method5893(arg0, 0, arg10.anInt4248 / 2 + local109 + arg0, 1, 0, null, arg2, arg8, 50, arg9, 0, arg10.anInt4261 / 2 + arg2 - local117 - local96 - arg5, null, arg3, local103);
		}
	}

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)V")
	public static void method3148() {
		if (Static154.anInt2803 == 0) {
			return;
		}
		try {
			if (++Static193.anInt3557 > 1500) {
				if (Static335.aClass111_4 != null) {
					Static335.aClass111_4.method2799();
					Static335.aClass111_4 = null;
				}
				if (Static60.anInt666 >= 1) {
					Static154.anInt2803 = 0;
					Static41.anInt1046 = -5;
					return;
				}
				Static154.anInt2803 = 1;
				if (Static392.anInt7225 == Static278.anInt5154) {
					Static278.anInt5154 = Static35.anInt920;
				} else {
					Static278.anInt5154 = Static392.anInt7225;
				}
				Static60.anInt666++;
				Static193.anInt3557 = 0;
			}
			if (Static154.anInt2803 == 1) {
				Static5.aClass32_1 = Static328.aClass152_5.openSocket(Static61.aString14, Static278.anInt5154);
				Static154.anInt2803 = 2;
			}
			@Pc(125) int local125;
			if (Static154.anInt2803 == 2) {
				if (Static5.aClass32_1.status == 2) {
					throw new IOException();
				}
				if (Static5.aClass32_1.status != 1) {
					return;
				}
				Static335.aClass111_4 = new Class111((Socket) Static5.aClass32_1.result, Static328.aClass152_5);
				Static5.aClass32_1 = null;
				Static335.aClass111_4.method2797(Static257.aClass2_Sub4_Sub2_4.anInt5300, Static257.aClass2_Sub4_Sub2_4.aByteArray73);
				if (Static303.aClass221_2 != null) {
					Static303.aClass221_2.method6325();
				}
				if (Static190.aClass221_1 != null) {
					Static190.aClass221_1.method6325();
				}
				local125 = Static335.aClass111_4.method2800();
				if (Static303.aClass221_2 != null) {
					Static303.aClass221_2.method6325();
				}
				if (Static190.aClass221_1 != null) {
					Static190.aClass221_1.method6325();
				}
				if (local125 != 101) {
					Static41.anInt1046 = local125;
					Static154.anInt2803 = 0;
					Static335.aClass111_4.method2799();
					Static335.aClass111_4 = null;
					return;
				}
				Static154.anInt2803 = 3;
			}
			if (Static154.anInt2803 == 3 && Static335.aClass111_4.method2795() >= 2) {
				local125 = Static335.aClass111_4.method2800() << 8 | Static335.aClass111_4.method2800();
				Static375.method6279(local125);
				if (Static120.anInt2385 == -1) {
					Static154.anInt2803 = 0;
					Static41.anInt1046 = 6;
					Static335.aClass111_4.method2799();
					Static335.aClass111_4 = null;
				} else {
					Static154.anInt2803 = 0;
					Static335.aClass111_4.method2799();
					Static335.aClass111_4 = null;
					Static230.method4014();
				}
			}
		} catch (@Pc(208) IOException local208) {
			if (Static335.aClass111_4 != null) {
				Static335.aClass111_4.method2799();
				Static335.aClass111_4 = null;
			}
			if (Static60.anInt666 >= 1) {
				Static154.anInt2803 = 0;
				Static41.anInt1046 = -4;
			} else {
				Static154.anInt2803 = 1;
				Static193.anInt3557 = 0;
				if (Static278.anInt5154 == Static392.anInt7225) {
					Static278.anInt5154 = Static35.anInt920;
				} else {
					Static278.anInt5154 = Static392.anInt7225;
				}
				Static60.anInt666++;
			}
		}
	}
}
