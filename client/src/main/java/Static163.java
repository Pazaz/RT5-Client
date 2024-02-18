import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "Lclient!ha;")
	public static Class19 aClass19_17;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray36;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method8846(@OriginalArg(0) long arg0) {
		Static459.aCalendar3.setTime(new Date(arg0));
		@Pc(19) int local19 = Static459.aCalendar3.get(7);
		@Pc(23) int local23 = Static459.aCalendar3.get(5);
		@Pc(27) int local27 = Static459.aCalendar3.get(2);
		@Pc(31) int local31 = Static459.aCalendar3.get(1);
		@Pc(35) int local35 = Static459.aCalendar3.get(11);
		@Pc(39) int local39 = Static459.aCalendar3.get(12);
		@Pc(43) int local43 = Static459.aCalendar3.get(13);
		return Static146.aStringArray8[local19 - 1] + ", " + local23 / 10 + local23 % 10 + "-" + Static361.aStringArray29[local27] + "-" + local31 + " " + local35 / 10 + local35 % 10 + ":" + local39 / 10 + local39 % 10 + ":" + local43 / 10 + local43 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([BI)[B")
	public static byte[] method8849(@OriginalArg(0) byte[] arg0) {
		@Pc(13) int local13 = arg0.length;
		@Pc(16) byte[] local16 = new byte[local13];
		Static734.method7694(arg0, 0, local16, 0, local13);
		return local16;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIZ)Lclient!aha;")
	public static Class2_Sub4 method8850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Class2_Sub4 local7 = new Class2_Sub4();
		local7.anInt147 = arg1;
		local7.anInt146 = arg0;
		Static548.aClass28_40.method735((long) arg2, local7);
		Static122.method2208(arg1);
		@Pc(26) Class158 local26 = Static145.method2412(arg2);
		if (local26 != null) {
			Static178.method2729(local26);
		}
		if (Static390.aClass158_9 != null) {
			Static178.method2729(Static390.aClass158_9);
			Static390.aClass158_9 = null;
		}
		Static94.method1840();
		if (local26 != null) {
			Static134.method8956(local26, !arg3);
		}
		if (!arg3) {
			Static472.method6414(arg1);
		}
		if (!arg3 && Static377.anInt5930 != -1) {
			Static145.method2411(1, Static377.anInt5930);
		}
		return local7;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([II[III)V")
	public static void method8852(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(15) int local15 = (arg1 + arg3) / 2;
		@Pc(17) int local17 = arg3;
		@Pc(21) int local21 = arg0[local15];
		arg0[local15] = arg0[arg1];
		arg0[arg1] = local21;
		@Pc(35) int local35 = arg2[local15];
		arg2[local15] = arg2[arg1];
		arg2[arg1] = local35;
		@Pc(53) int local53 = local21 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg3; local55 < arg1; local55++) {
			if ((local53 & local55) + local21 > arg0[local55]) {
				@Pc(74) int local74 = arg0[local55];
				arg0[local55] = arg0[local17];
				arg0[local17] = local74;
				@Pc(88) int local88 = arg2[local55];
				arg2[local55] = arg2[local17];
				arg2[local17++] = local88;
			}
		}
		arg0[arg1] = arg0[local17];
		arg0[local17] = local21;
		arg2[arg1] = arg2[local17];
		arg2[local17] = local35;
		method8852(arg0, local17 - 1, arg2, arg3);
		method8852(arg0, arg1, arg2, local17 + 1);
	}
}
