import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!at", name = "N", descriptor = "Lclient!nh;")
	public static Player aClass11_Sub5_Sub2_Sub1_3;

	@OriginalMember(owner = "client!at", name = "P", descriptor = "Lclient!ml;")
	public static Signlink aClass152_4;

	@OriginalMember(owner = "client!at", name = "A", descriptor = "Lclient!jm;")
	public static final Class116 aClass116_6 = new Class116(16);

	@OriginalMember(owner = "client!at", name = "O", descriptor = "Z")
	public static boolean aBoolean308 = true;

	@OriginalMember(owner = "client!at", name = "Q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[200];

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BII)V")
	public static void method4208(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub2_Sub7 local8 = Static316.method5413(7, arg0);
		local8.method2311();
		local8.anInt2289 = arg1;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "([Ljava/lang/Object;B[III)V")
	public static void method4211(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) int local20 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local20;
		@Pc(34) Object local34 = arg0[local14];
		arg0[local14] = arg0[arg3];
		arg0[arg3] = local34;
		for (@Pc(46) int local46 = arg2; local46 < arg3; local46++) {
			if ((local46 & 0x1) + local20 > arg1[local46]) {
				@Pc(61) int local61 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16] = local61;
				@Pc(75) Object local75 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local75;
			}
		}
		arg1[arg3] = arg1[local16];
		arg1[local16] = local20;
		arg0[arg3] = arg0[local16];
		arg0[local16] = local34;
		method4211(arg0, arg1, arg2, local16 - 1);
		method4211(arg0, arg1, local16 + 1, arg3);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method4212(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)V")
	public static void method4213(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub2_Sub7 local8 = Static316.method5413(4, arg0);
		local8.method2312();
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/awt/Frame;ILclient!ml;)V")
	public static void method4215(@OriginalArg(0) Frame arg0, @OriginalArg(2) Signlink arg1) {
		while (true) {
			@Pc(19) PrivilegedRequest local19 = arg1.exitFullScreen(arg0);
			while (local19.status == 0) {
				ThreadUtils.sleep(10L);
			}
			if (local19.status == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			ThreadUtils.sleep(100L);
		}
	}
}
