import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bh", name = "R", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!bh", name = "S", descriptor = "Lclient!we;")
	public static final Class215 aClass215_11 = new Class215(128);

	@OriginalMember(owner = "client!bh", name = "ab", descriptor = "I")
	public static int anInt709 = 0;

	@OriginalMember(owner = "client!bh", name = "bb", descriptor = "[I")
	public static final int[] anIntArray49 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!sn;IIBILclient!ro;II)V")
	public static void method501(@OriginalArg(0) int arg0, @OriginalArg(1) Class142 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class177 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg6 * arg6 + arg7 * arg7;
		if (local11 > arg3) {
			return;
		}
		@Pc(29) int local29 = Math.min(arg5.anInt5803 / 2, arg5.anInt5816 / 2);
		if (local11 <= local29 * local29) {
			Static22.method554(arg2, arg7, arg1, Static110.aClass29Array6[arg0], arg4, arg5, arg6);
			return;
		}
		local29 -= 10;
		@Pc(55) int local55;
		if (Static303.anInt6342 == 4) {
			local55 = (int) Static188.aFloat17 & 0x3FFF;
		} else {
			local55 = Static238.anInt5295 + (int) Static188.aFloat17 & 0x3FFF;
		}
		@Pc(66) int local66 = Class39.anIntArray88[local55];
		@Pc(70) int local70 = Class39.anIntArray87[local55];
		if (Static303.anInt6342 != 4) {
			local66 = local66 * 256 / (Static312.anInt6009 + 256);
			local70 = local70 * 256 / (Static312.anInt6009 + 256);
		}
		@Pc(101) int local101 = arg7 * local66 + local70 * arg6 >> 15;
		@Pc(111) int local111 = arg7 * local70 - arg6 * local66 >> 15;
		@Pc(117) double local117 = Math.atan2((double) local101, (double) local111);
		@Pc(124) int local124 = (int) ((double) local29 * Math.sin(local117));
		@Pc(131) int local131 = (int) ((double) local29 * Math.cos(local117));
		Static353.aClass29Array17[arg0].method5843((float) local124 + (float) arg5.anInt5803 / 2.0F + (float) arg2, (float) -local131 + (float) arg5.anInt5816 / 2.0F + (float) arg4, 4096, (int) (-local117 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(II)I")
	public static int method502(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;Lclient!ud;BI)Lclient!or;")
	public static Class145 method503(@OriginalArg(0) String arg0, @OriginalArg(1) Class199 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg1.method5474(arg0);
		}
		@Pc(39) Class145 local39;
		if (arg2 == 1) {
			try {
				Static358.method1003(arg1.anApplet1, new Object[] { (new URL(arg1.anApplet1.getCodeBase(), arg0)).toString() }, "openjs");
				local39 = new Class145();
				local39.anInt5065 = 1;
				return local39;
			} catch (@Pc(45) Throwable local45) {
				local39 = new Class145();
				local39.anInt5065 = 2;
				return local39;
			}
		} else if (arg2 == 2) {
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_blank");
				local39 = new Class145();
				local39.anInt5065 = 1;
				return local39;
			} catch (@Pc(81) Exception local81) {
				local39 = new Class145();
				local39.anInt5065 = 2;
				return local39;
			}
		} else if (arg2 == 3) {
			try {
				Static358.method1001(arg1.anApplet1, "loggedout");
			} catch (@Pc(108) Throwable local108) {
			}
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_top");
				local39 = new Class145();
				local39.anInt5065 = 1;
				return local39;
			} catch (@Pc(130) Exception local130) {
				local39 = new Class145();
				local39.anInt5065 = 2;
				return local39;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(IIII)V")
	public static void method505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class1_Sub1_Sub10 local13 = Static122.method2624(9, arg0);
		local13.method2539();
		local13.anInt2960 = arg2;
		local13.anInt2952 = arg1;
	}
}
