import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "Lclient!ud;")
	public static Class199 aClass199_7;

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "Lclient!ro;")
	public static Class177 aClass177_8;

	@OriginalMember(owner = "client!ia", name = "z", descriptor = "Lclient!qj;")
	public static Class162 aClass162_108;

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "[I")
	public static final int[] anIntArray225 = new int[100];

	@OriginalMember(owner = "client!ia", name = "x", descriptor = "Z")
	public static boolean aBoolean202 = true;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!il;)Lclient!ke;")
	public static Class103_Sub2 method2616(@OriginalArg(1) Class1_Sub16 arg0) {
		return new Class103_Sub2(arg0.method5762(), arg0.method5762(), arg0.method5762(), arg0.method5762(), arg0.method5755(), arg0.method5761());
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BII)I")
	public static int method2618(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 >> 31 & arg0 - 1;
		return ((arg1 >>> 31) + arg1) % arg0 + local16;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)V")
	public static void method2619() {
		@Pc(5) Class215 local5 = Static274.aClass215_83;
		synchronized (Static274.aClass215_83) {
			Static274.aClass215_83.method6052();
		}
		local5 = Static245.aClass215_50;
		synchronized (Static245.aClass215_50) {
			Static245.aClass215_50.method6052();
		}
		local5 = Static256.aClass215_78;
		synchronized (Static256.aClass215_78) {
			Static256.aClass215_78.method6052();
		}
		local5 = Static301.aClass215_89;
		synchronized (Static301.aClass215_89) {
			Static301.aClass215_89.method6052();
		}
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(B)V")
	public static void method2621() {
		@Pc(1) Class215 local1 = Static87.aClass215_38;
		synchronized (Static87.aClass215_38) {
			Static87.aClass215_38.method6052();
		}
		local1 = Static209.aClass215_67;
		synchronized (Static209.aClass215_67) {
			Static209.aClass215_67.method6052();
		}
		local1 = Static286.aClass215_86;
		synchronized (Static286.aClass215_86) {
			Static286.aClass215_86.method6052();
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
	public static void method2622() {
		if (Static286.anInt6050 < 0) {
			Static286.anInt6050 = 0;
			Static297.anInt6237 = -1;
			Static233.anInt5206 = -1;
		}
		if (Static286.anInt6050 > Static201.anInt4275) {
			Static233.anInt5206 = -1;
			Static297.anInt6237 = -1;
			Static286.anInt6050 = Static201.anInt4275;
		}
		if (Static311.anInt5198 < 0) {
			Static311.anInt5198 = 0;
			Static297.anInt6237 = -1;
			Static233.anInt5206 = -1;
		}
		if (Static201.anInt4284 < Static311.anInt5198) {
			Static297.anInt6237 = -1;
			Static311.anInt5198 = Static201.anInt4284;
			Static233.anInt5206 = -1;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIB)Lclient!hn;")
	public static Class1_Sub1_Sub10 method2624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(24) Class1_Sub1_Sub10 local24 = (Class1_Sub1_Sub10) Static27.aClass183_3.method5053((long) arg0 << 32 | (long) arg1);
		if (local24 == null) {
			local24 = new Class1_Sub1_Sub10(arg0, arg1);
			Static27.aClass183_3.method5055(local24.aLong235, local24);
		}
		return local24;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/awt/Canvas;Lclient!fl;Z)Lclient!nr;")
	public static Class40 method2625(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface4 arg2) {
		return new Class40_Sub1(arg1, arg2, arg0);
	}
}
