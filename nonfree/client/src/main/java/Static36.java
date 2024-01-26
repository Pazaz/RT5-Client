import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bda", name = "E", descriptor = "Lclient!nh;")
	public static Class260 aClass260_1;

	@OriginalMember(owner = "client!bda", name = "D", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_15 = new Class225(70, -2);

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IB)V")
	public static void method977(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		Static101.method2000();
		if (arg1 < 92) {
			return;
		}
		@Pc(16) int local16 = aClass260_1.method5782(arg0).anInt8301;
		if (local16 == 0) {
			return;
		}
		@Pc(25) int local25 = Static34.aClass304_1.anIntArray621[arg0];
		if (local16 == 5) {
			Static219.anInt3549 = local25;
		}
		if (local16 == 6) {
			Static55.anInt1124 = local25;
		}
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)I")
	public static int method978(@OriginalArg(0) int arg0) {
		if (arg0 != 3) {
			method977(127, (byte) 11);
		}
		if (Static316.aFrame8 == null) {
			return Static152.aBoolean811 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BLclient!vq;Ljava/lang/String;Ljava/lang/String;I)Lclient!oba;")
	public static Class270 method980(@OriginalArg(1) Class390 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		if (arg3 == 0) {
			return arg0.method8986(arg1);
		}
		@Pc(57) Class270 local57;
		if (arg3 == 1) {
			try {
				@Pc(36) Object local36 = Static727.method96(Static166.anApplet1, arg2, new Object[] { (new URL(Static166.anApplet1.getCodeBase(), arg1)).toString() });
				if (local36 == null) {
					throw new RuntimeException();
				}
				@Pc(47) Class270 local47 = new Class270();
				local47.anInt6789 = 1;
				return local47;
			} catch (@Pc(53) Throwable local53) {
				local57 = new Class270();
				local57.anInt6789 = 2;
				return local57;
			}
		} else if (arg3 == 2) {
			try {
				Static166.anApplet1.getAppletContext().showDocument(new URL(Static166.anApplet1.getCodeBase(), arg1), "_blank");
				local57 = new Class270();
				local57.anInt6789 = 1;
				return local57;
			} catch (@Pc(94) Exception local94) {
				local57 = new Class270();
				local57.anInt6789 = 2;
				return local57;
			}
		} else if (arg3 == 3) {
			try {
				Static727.method97("loggedout", Static166.anApplet1);
			} catch (@Pc(115) Throwable local115) {
			}
			try {
				Static166.anApplet1.getAppletContext().showDocument(new URL(Static166.anApplet1.getCodeBase(), arg1), "_top");
				local57 = new Class270();
				local57.anInt6789 = 1;
				return local57;
			} catch (@Pc(137) Exception local137) {
				local57 = new Class270();
				local57.anInt6789 = 2;
				return local57;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
