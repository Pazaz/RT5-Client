import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!mq", name = "n", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_83 = new LocalizedString("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!mq", name = "q", descriptor = "Z")
	public static boolean aBoolean252 = false;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BIIII)V")
	public static void method3870(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = arg0;
		@Pc(16) int local16 = -arg0;
		@Pc(18) int local18 = -1;
		Static101.method2163(arg3 + arg0, Static357.anIntArrayArray58[arg1], arg2, arg3 - arg0);
		while (local13 > local11) {
			local18 += 2;
			local11++;
			local16 += local18;
			if (local16 >= 0) {
				local13--;
				local16 -= local13 << 1;
				@Pc(56) int[] local56 = Static357.anIntArrayArray58[local13 + arg1];
				@Pc(63) int[] local63 = Static357.anIntArrayArray58[arg1 - local13];
				@Pc(67) int local67 = local11 + arg3;
				@Pc(72) int local72 = arg3 - local11;
				Static101.method2163(local67, local56, arg2, local72);
				Static101.method2163(local67, local63, arg2, local72);
			}
			@Pc(89) int local89 = arg3 + local13;
			@Pc(94) int local94 = arg3 - local13;
			@Pc(100) int[] local100 = Static357.anIntArrayArray58[local11 + arg1];
			@Pc(107) int[] local107 = Static357.anIntArrayArray58[arg1 - local11];
			Static101.method2163(local89, local100, arg2, local94);
			Static101.method2163(local89, local107, arg2, local94);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V")
	public static void method3874(@OriginalArg(0) int flags, @OriginalArg(1) String unkStr, @OriginalArg(3) String message, @OriginalArg(4) int unkInt, @OriginalArg(5) int type, @OriginalArg(6) String msg2, @OriginalArg(7) String msg3) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Chat.types[local3] = Chat.types[local3 - 1];
			Static18.MSG_TIMESTAMPS[local3] = Static18.MSG_TIMESTAMPS[local3 - 1];
			Chat.names[local3] = Chat.names[local3 - 1];
			Static169.MSG_SECONDARY[local3] = Static169.MSG_SECONDARY[local3 - 1];
			Chat.messages[local3] = Chat.messages[local3 - 1];
			Chat.clans[local3] = Chat.clans[local3 - 1];
			Chat.phraseIds[local3] = Chat.phraseIds[local3 - 1];
		}
		Chat.types[0] = type;
		Chat.names[0] = msg3;
		Static18.MSG_TIMESTAMPS[0] = flags;
		Static169.MSG_SECONDARY[0] = msg2;
		Chat.messages[0] = message;
		Static21.anInt551 = InterfaceList.transmitTimer;
		Chat.size++;
		Chat.clans[0] = unkStr;
		Chat.phraseIds[0] = unkInt;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZII)I")
	public static int method3876(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (local7 + arg0) / arg1 - local7;
	}
}
