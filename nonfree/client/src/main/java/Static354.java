import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "Lclient!nv;")
	public static Class267 aClass267_1;

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
	public static int anInt5759;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!gea;")
	public static Class142 aClass142_4;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
	public static int anInt5763;

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "Lclient!dla;")
	public static final Class82 aClass82_120 = new Class82(32);

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "Z")
	public static boolean aBoolean439 = false;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Lclient!hda;")
	public static Class158 aClass158_8 = null;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "Z")
	public static boolean aBoolean440 = false;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BLclient!cg;)V")
	public static void method5181(@OriginalArg(1) Class8_Sub2_Sub1_Sub2 arg0) {
		@Pc(6) Class152 local6 = arg0.aClass152_11;
		if (Static333.anInt5455 == arg0.anInt10755 || !local6.method9109() || local6.method9090()) {
			@Pc(34) int local34 = arg0.anInt10755 - arg0.anInt10759;
			@Pc(40) int local40 = Static333.anInt5455 - arg0.anInt10759;
			@Pc(52) int local52 = arg0.anInt10750 * 512 + arg0.method9302((byte) 124) * 256;
			@Pc(64) int local64 = arg0.anInt10753 * 512 + arg0.method9302((byte) 89) * 256;
			@Pc(76) int local76 = arg0.anInt10761 * 512 + arg0.method9302((byte) 107) * 256;
			@Pc(88) int local88 = arg0.anInt10758 * 512 + arg0.method9302((byte) 115) * 256;
			arg0.anInt10690 = (local76 * local40 + local52 * (local34 - local40)) / local34;
			arg0.anInt10694 = (local40 * local88 + local64 * (local34 - local40)) / local34;
		}
		arg0.anInt10763 = 0;
		if (arg0.anInt10754 == 0) {
			arg0.method9298(8192, false);
		}
		if (arg0.anInt10754 == 1) {
			arg0.method9298(12288, false);
		}
		if (arg0.anInt10754 == 2) {
			arg0.method9298(0, false);
		}
		if (arg0.anInt10754 == 3) {
			arg0.method9298(4096, false);
		}
	}
}
