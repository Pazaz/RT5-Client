import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "Lclient!dc;")
	public static Class28 aClass28_1;

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "Lclient!qj;")
	public static Class162 aClass162_199;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "[Lclient!r;")
	public static final Class167[] aClass167Array1 = new Class167[29];

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "Lclient!ro;")
	public static Class177 aClass177_15 = null;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method4771(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static186.anInt4356 >= 100) {
			Static293.method5172(Static188.aString58);
			return;
		}
		@Pc(21) String local21 = Static301.method5274(arg0);
		if (local21 == null) {
			return;
		}
		@Pc(61) String local61;
		for (@Pc(26) int local26 = 0; local26 < Static186.anInt4356; local26++) {
			@Pc(34) String local34 = Static301.method5274(Static140.aStringArray21[local26]);
			if (local34 != null && local34.equals(local21)) {
				Static293.method5172(arg0 + Static164.aString149);
				return;
			}
			if (Static189.aStringArray27[local26] != null) {
				local61 = Static301.method5274(Static189.aStringArray27[local26]);
				if (local61 != null && local61.equals(local21)) {
					Static293.method5172(arg0 + Static164.aString149);
					return;
				}
			}
		}
		for (@Pc(84) int local84 = 0; local84 < Static43.anInt1459; local84++) {
			local61 = Static301.method5274(Static46.aStringArray42[local84]);
			if (local61 != null && local61.equals(local21)) {
				Static293.method5172(Static73.aString75 + arg0 + Static76.aString77);
				return;
			}
			if (Static210.aStringArray29[local84] != null) {
				@Pc(121) String local121 = Static301.method5274(Static210.aStringArray29[local84]);
				if (local121 != null && local121.equals(local21)) {
					Static293.method5172(Static73.aString75 + arg0 + Static76.aString77);
					return;
				}
			}
		}
		if (Static301.method5274(Static264.aClass7_Sub1_Sub1_Sub2_2.aString266).equals(local21)) {
			Static293.method5172(Static14.aString18);
		} else {
			Static150.aClass1_Sub16_Sub2_2.method5793(82);
			Static150.aClass1_Sub16_Sub2_2.method5771(Static279.method4951(arg0) + 1);
			Static150.aClass1_Sub16_Sub2_2.method5726(arg0);
			Static150.aClass1_Sub16_Sub2_2.method5771(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)Lclient!il;")
	public static Class1_Sub16 method4773() {
		@Pc(8) Class1_Sub16 local8 = new Class1_Sub16(37);
		local8.method5771(14);
		local8.method5771(Static216.anInt4909);
		local8.method5771(Static109.aBoolean182 ? 1 : 0);
		local8.method5771(Static146.aBoolean257 ? 1 : 0);
		local8.method5771(Static218.aBoolean342 ? 1 : 0);
		local8.method5771(Static289.aBoolean360 ? 1 : 0);
		local8.method5771(0);
		local8.method5771(Static288.aBoolean423 ? 1 : 0);
		local8.method5771(Static166.aBoolean285 ? 1 : 0);
		local8.method5771(Static190.aBoolean378 ? 1 : 0);
		local8.method5771(Static102.anInt2545);
		local8.method5771(Static265.aBoolean396 ? 1 : 0);
		local8.method5771(Static307.aBoolean465 ? 1 : 0);
		local8.method5771(Static200.aBoolean321 ? 1 : 0);
		local8.method5771(Static74.anInt2054);
		local8.method5771(Static90.aBoolean156 ? 1 : 0);
		local8.method5771(Static84.anInt2246);
		local8.method5771(Static340.anInt7187);
		local8.method5771(Static183.anInt4317);
		local8.method5757(Static144.anInt3575);
		local8.method5757(Static17.anInt652);
		local8.method5771(Static293.method5173());
		local8.method5768(Static308.anInt6435);
		local8.method5771(Static146.anInt3619);
		local8.method5771(Static123.aBoolean203 ? 1 : 0);
		local8.method5771(Static69.aBoolean133 ? 1 : 0);
		local8.method5771(Static226.anInt5071);
		local8.method5771(Static280.aBoolean419 ? 1 : 0);
		local8.method5771(Static52.aBoolean106 ? 1 : 0);
		local8.method5771(Static271.anInt5700);
		local8.method5771(Static122.aBoolean202 ? 1 : 0);
		local8.method5771(Static4.anInt207);
		return local8;
	}
}
