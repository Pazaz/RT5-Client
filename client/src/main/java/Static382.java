import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!we", name = "I", descriptor = "I")
	public static int anInt7141;

	@OriginalMember(owner = "client!we", name = "y", descriptor = "[I")
	public static final int[] anIntArray490 = new int[13];

	@OriginalMember(owner = "client!we", name = "C", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_147 = new LocalizedString("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method6361(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static246.method4251(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(45) int local45;
			do {
				local45 = arg1.nextInt();
			} while (local45 >= local42);
			return Static11.method244(arg0, local45);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method6362(@OriginalArg(0) Js5 arg0) {
		Static146.anInt2706 = 0;
		Static82.anInt1835 = 0;
		Static131.aClass36_4 = new Class36();
		Static98.aClass12_Sub1_Sub1_Sub1Array1 = new Class12_Sub1_Sub1_Sub1[1024];
		Static285.method4895(arg0);
		Static152.method2768(arg0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!hk;")
	public static RuntimeException_Sub1 rethrow(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString23 = local9.aString23 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIZI)Lclient!cu;")
	public static SubInterface method6365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) SubInterface local7 = new SubInterface();
		local7.id = arg3;
		local7.anInt1373 = arg1;
		InterfaceList.subInterfaces.put(local7, (long) arg0);
		Static160.method2957(arg3);
		@Pc(26) Component local26 = InterfaceList.getComponent(arg0);
		if (local26 != null) {
			InterfaceList.redraw(local26);
		}
		if (Static192.aClass161_8 != null) {
			InterfaceList.redraw(Static192.aClass161_8);
			Static192.aClass161_8 = null;
		}
		Static227.method3989();
		if (local26 != null) {
			DelayedStateChange.setComponentSizeClient(!arg2, local26);
		}
		if (!arg2) {
			ScriptRunner.method3598(arg3);
		}
		if (!arg2 && Static139.anInt2595 != -1) {
			Static392.method6460(Static139.anInt2595, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)I")
	public static int method6367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg2;
		}
	}
}
