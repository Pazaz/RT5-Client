import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "[I")
	public static int[] locGroupIds;

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "Lclient!s;")
	public static final Class210 aClass210_16 = new Class210(9, 17);

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "[Lclient!bl;")
	public static final Class25_Sub1[] aClass25_Sub1Array2 = new Class25_Sub1[29];

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "Lclient!mc;")
	public static final ClientProt aClass145_255 = new ClientProt(66, 2);

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)I")
	public static int method6273() {
		@Pc(15) Class19 local15 = Static190.aClass19_8;
		@Pc(17) boolean local17 = false;
		if (Static77.anInt1762 != 0) {
			@Pc(26) Canvas local26 = new Canvas();
			local26.setSize(100, 100);
			local17 = true;
			local15 = Static387.method2822(0, null, null, local26, 0);
		}
		@Pc(43) long local43 = MonotonicClock.currentTimeMillis();
		for (@Pc(45) int local45 = 0; local45 < 10000; local45++) {
			local15.method2853();
		}
		@Pc(72) int local72 = (int) (MonotonicClock.currentTimeMillis() - local43);
		local15.method2868(100, 0, 0, -16777216, 100);
		if (local17) {
			local15.method2825();
		}
		return local72;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!nk;II)V")
	public static void method6274(@OriginalArg(0) int arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2) {
		Static63.anInt1549 = arg0;
		Static290.anInt5498 = arg2;
		Static179.aClass161_6 = arg1;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZII)Lclient!we;")
	public static Class2_Sub41 method6275(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(12) long local12 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class2_Sub41) Static353.aClass4_136.method90(local12);
	}
}
