import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!at", name = "N", descriptor = "Lclient!nh;")
	public static Class11_Sub5_Sub2_Sub1 aClass11_Sub5_Sub2_Sub1_3;

	@OriginalMember(owner = "client!at", name = "P", descriptor = "Lclient!ml;")
	public static Signlink aClass152_4;

	@OriginalMember(owner = "client!at", name = "A", descriptor = "Lclient!jm;")
	public static final Class116 aClass116_6 = new Class116(16);

	@OriginalMember(owner = "client!at", name = "J", descriptor = "[I")
	public static final int[] anIntArray291 = new int[1000];

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

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZZ)V")
	public static void method4210(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Protocol.inboundBuffer.availableBits(Static82.packetSize) >= 15) {
				@Pc(16) int local16 = Protocol.inboundBuffer.gBit(15);
				if (local16 != 32767) {
					@Pc(21) boolean local21 = false;
					if (Static365.aClass11_Sub5_Sub2_Sub2Array1[local16] == null) {
						Static365.aClass11_Sub5_Sub2_Sub2Array1[local16] = new Class11_Sub5_Sub2_Sub2();
						Static365.aClass11_Sub5_Sub2_Sub2Array1[local16].anInt4619 = local16;
						local21 = true;
					}
					@Pc(42) Class11_Sub5_Sub2_Sub2 local42 = Static365.aClass11_Sub5_Sub2_Sub2Array1[local16];
					Static211.anIntArray230[Static166.anInt3187++] = local16;
					local42.anInt4610 = Static114.anInt2348;
					if (local42.aClass71_1 != null && local42.aClass71_1.method2099()) {
						Static154.method2781(local42);
					}
					@Pc(71) int local71;
					if (arg0) {
						local71 = Protocol.inboundBuffer.gBit(8);
						if (local71 > 127) {
							local71 -= 256;
						}
					} else {
						local71 = Protocol.inboundBuffer.gBit(5);
						if (local71 > 15) {
							local71 -= 32;
						}
					}
					@Pc(97) int local97;
					if (arg0) {
						local97 = Protocol.inboundBuffer.gBit(8);
						if (local97 > 127) {
							local97 -= 256;
						}
					} else {
						local97 = Protocol.inboundBuffer.gBit(5);
						if (local97 > 15) {
							local97 -= 32;
						}
					}
					@Pc(119) int local119 = Protocol.inboundBuffer.gBit(1);
					if (local119 == 1) {
						Static277.anIntArray361[Static343.anInt6390++] = local16;
					}
					local42.method4342(Static6.NpcTypeList.method5570(Protocol.inboundBuffer.gBit(14)));
					@Pc(151) int local151 = Protocol.inboundBuffer.gBit(3) + 4 << 11 & 0x3929;
					@Pc(156) int local156 = Protocol.inboundBuffer.gBit(2);
					@Pc(161) int local161 = Protocol.inboundBuffer.gBit(1);
					local42.method4322(local42.aClass71_1.anInt2041);
					local42.anInt4604 = local42.aClass71_1.anInt2044 << 3;
					if (local42.anInt4604 == 0) {
						local42.method4330(0);
					} else if (local21) {
						local42.method4330(local151);
					}
					local42.method4339(local42.method4328(), local156, aClass11_Sub5_Sub2_Sub1_3.anIntArray316[0] + local97, local161 == 1, aClass11_Sub5_Sub2_Sub1_3.anIntArray317[0] + local71);
					if (local42.aClass71_1.method2099()) {
						Static211.method3724(null, local42.anIntArray317[0], 0, null, local42, local42.anIntArray316[0], local42.aByte78);
					}
					continue;
				}
			}
			Protocol.inboundBuffer.accessBytes();
			return;
		}
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

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(B)Lclient!wj;")
	public static Class236 method4214() {
		try {
			return (Class236) Class.forName("Class236_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/awt/Frame;ILclient!ml;)V")
	public static void method4215(@OriginalArg(0) Frame arg0, @OriginalArg(2) Signlink arg1) {
		while (true) {
			@Pc(19) PrivilegedRequest local19 = arg1.exitFullScreen(arg0);
			while (local19.status == 0) {
				Static231.method4023(10L);
			}
			if (local19.status == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static231.method4023(100L);
		}
	}
}
