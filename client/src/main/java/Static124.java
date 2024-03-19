import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ic", name = "z", descriptor = "Lclient!r;")
	public static Class167 aClass167_1;

	@OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
	public static int anInt3119;

	@OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
	public static int anInt3120;

	@OriginalMember(owner = "client!ic", name = "I", descriptor = "Lclient!qa;")
	public static Class29 aClass29_10;

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "Lclient!we;")
	public static final Class215 aClass215_49 = new Class215(64);

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString112 = "";

	@OriginalMember(owner = "client!ic", name = "H", descriptor = "[I")
	public static final int[] anIntArray227 = new int[4];

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!qj;I)V")
	public static void method2652(@OriginalArg(0) Class162 arg0) {
		Static115.aClass162_99 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)I")
	public static int method2653(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZLclient!qj;Lclient!qj;Lclient!qj;)V")
	public static void method2654(@OriginalArg(1) Class162 arg0, @OriginalArg(2) Class162 arg1, @OriginalArg(3) Class162 arg2) {
		Static1.aClass162_8 = arg2;
		Static295.method5216(arg1, arg0);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!il;)Lclient!lm;")
	public static Class123 method2655(@OriginalArg(1) Class1_Sub16 arg0) {
		@Pc(12) Class123 local12 = new Class123();
		local12.anInt4141 = arg0.method5749();
		local12.aClass1_Sub1_Sub12_1 = Static17.method457(local12.anInt4141);
		return local12;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method2656(@OriginalArg(1) long arg0) {
		Static242.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static242.aCalendar1.get(7);
		@Pc(17) int local17 = Static242.aCalendar1.get(5);
		@Pc(21) int local21 = Static242.aCalendar1.get(2);
		@Pc(25) int local25 = Static242.aCalendar1.get(1);
		@Pc(29) int local29 = Static242.aCalendar1.get(11);
		@Pc(40) int local40 = Static242.aCalendar1.get(12);
		@Pc(44) int local44 = Static242.aCalendar1.get(13);
		return Static14.aStringArray3[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static338.aStringArray44[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10 + " GMT";
	}
}
