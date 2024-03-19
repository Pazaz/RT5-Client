import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!jl", name = "K", descriptor = "I")
	public static int anInt3595;

	@OriginalMember(owner = "client!jl", name = "ab", descriptor = "I")
	public static int anInt3608;

	@OriginalMember(owner = "client!jl", name = "fb", descriptor = "I")
	public static int anInt3612;

	@OriginalMember(owner = "client!jl", name = "D", descriptor = "S")
	public static short aShort55 = 32767;

	@OriginalMember(owner = "client!jl", name = "W", descriptor = "I")
	public static int anInt3605 = 0;

	@OriginalMember(owner = "client!jl", name = "Z", descriptor = "Lclient!we;")
	public static final Class215 aClass215_54 = new Class215(64);

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BII)V")
	public static void method3186(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub1_Sub10 local13 = Static122.method2624(6, arg0);
		local13.method2539();
		local13.anInt2960 = arg1;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V")
	public static void method3187() {
		@Pc(5) Class115 local5 = Static299.aClass115_1;
		synchronized (Static299.aClass115_1) {
			Static299.aClass115_1.method3454();
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!ro;)V")
	public static void method3188(@OriginalArg(1) Class177 arg0) {
		if (arg0.anInt5779 == Static234.anInt5226) {
			Static230.aBooleanArray16[arg0.anInt5762] = true;
		}
	}
}
