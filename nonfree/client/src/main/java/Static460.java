import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "Lclient!tt;")
	public static Class73 aClass73_10;

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "[I")
	public static int[] anIntArray554;

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
	public static int anInt6970;

	@OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
	public static int anInt6964 = 0;

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "Lclient!sia;")
	public static final Class339 aClass339_40 = new Class339();

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "(I)I")
	public static int method6266() {
		if (Static213.anInt3470 == 0) {
			Static566.aClass326_2.method7470(new Class64("jaclib"));
			if (Static566.aClass326_2.method7469().method6465() != 100) {
				return 1;
			}
			if (!((Class64) Static566.aClass326_2.method7469()).method1554()) {
				Static295.aClient1.method1644();
			}
			Static213.anInt3470 = 1;
		}
		@Pc(270) int local270;
		@Pc(292) int local292;
		@Pc(308) int local308;
		@Pc(314) int local314;
		if (Static213.anInt3470 == 1) {
			Static522.aClass326Array1 = Static566.method7467();
			Static566.aClass326_1.method7470(new Class137(Static336.aClass330_68));
			Static566.aClass326_3.method7470(new Class64("jaggl"));
			Static566.aClass326_4.method7470(new Class64("jagdx"));
			Static566.aClass326_5.method7470(new Class64("jagmisc"));
			Static566.aClass326_6.method7470(new Class64("sw3d"));
			Static566.aClass326_7.method7470(new Class64("hw3d"));
			Static566.aClass326_8.method7470(new Class64("jagtheora"));
			Static566.aClass326_9.method7470(new Class137(Static124.aClass330_20));
			Static566.aClass326_10.method7470(new Class137(Static199.aClass330_42));
			Static566.aClass326_11.method7470(new Class137(Static6.aClass330_1));
			Static566.aClass326_12.method7470(new Class137(Static459.aClass330_91));
			Static566.aClass326_13.method7470(new Class137(Static20.aClass330_3));
			Static566.aClass326_14.method7470(new Class137(Static333.aClass330_66));
			Static566.aClass326_15.method7470(new Class137(Static380.aClass330_79));
			Static566.aClass326_16.method7470(new Class137(Static668.aClass330_119));
			Static566.aClass326_17.method7470(new Class137(Static271.aClass330_59));
			Static566.aClass326_18.method7470(new Class137(Static233.aClass330_52));
			Static566.aClass326_19.method7470(new Class137(Static58.aClass330_12));
			Static566.aClass326_20.method7470(new Class137(Static244.aClass330_55));
			Static566.aClass326_21.method7470(new Class137(Static88.aClass330_14));
			Static566.aClass326_22.method7470(new Class137(Static140.aClass330_24));
			Static566.aClass326_23.method7470(new Class288(Static463.aClass330_93, "huffman"));
			Static566.aClass326_24.method7470(new Class137(Static554.aClass330_105));
			Static566.aClass326_25.method7470(new Class137(Static31.aClass330_6));
			Static566.aClass326_26.method7470(new Class137(Static697.aClass330_123));
			Static566.aClass326_27.method7470(new Class115(Static120.aClass330_19, "details"));
			for (local270 = 0; local270 < Static522.aClass326Array1.length; local270++) {
				if (Static522.aClass326Array1[local270].method7469() == null) {
					throw new RuntimeException();
				}
			}
			local292 = 0;
			@Pc(294) Class326[] local294 = Static522.aClass326Array1;
			for (@Pc(296) int local296 = 0; local296 < local294.length; local296++) {
				@Pc(304) Class326 local304 = local294[local296];
				local308 = local304.method7471();
				local314 = local304.method7469().method6465();
				local292 += local314 * local308 / 100;
			}
			Static392.anInt6144 = local292;
			Static213.anInt3470 = 2;
		}
		if (Static522.aClass326Array1 == null) {
			return 100;
		}
		local270 = 0;
		local292 = 0;
		@Pc(348) boolean local348 = true;
		@Pc(350) Class326[] local350 = Static522.aClass326Array1;
		for (@Pc(352) int local352 = 0; local352 < local350.length; local352++) {
			@Pc(358) Class326 local358 = local350[local352];
			local314 = local358.method7471();
			@Pc(370) int local370 = local358.method7469().method6465();
			local292 += local314 * local370 / 100;
			if (local370 < 100) {
				local348 = false;
			}
			local270 += local314;
		}
		if (local348) {
			if (!((Class64) Static566.aClass326_5.method7469()).method1554()) {
				Static295.aClient1.method1634();
			}
			if (!((Class64) Static566.aClass326_8.method7469()).method1554()) {
				Static234.aBoolean303 = Static295.aClient1.method1651();
			}
			Static522.aClass326Array1 = null;
		}
		local292 -= Static392.anInt6144;
		local270 -= Static392.anInt6144;
		local308 = local270 > 0 ? local292 * 100 / local270 : 100;
		if (!local348 && local308 > 99) {
			local308 = 99;
		}
		return local308;
	}
}
