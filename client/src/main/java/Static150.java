import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!il", name = "V", descriptor = "[I")
	public static int[] anIntArray173;

	@OriginalMember(owner = "client!il", name = "Z", descriptor = "Lclient!rn;")
	public static Class205 aClass205_2;

	@OriginalMember(owner = "client!il", name = "P", descriptor = "Lclient!mc;")
	public static final ClientProt aClass145_107 = new ClientProt(17, 8);

	@OriginalMember(owner = "client!il", name = "W", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_64 = new Class79("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!il", name = "X", descriptor = "[I")
	public static final int[] anIntArray174 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!il", name = "Y", descriptor = "[I")
	public static final int[] anIntArray175 = new int[500];

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(IIB)V")
	public static void method2737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class2_Sub2_Sub7 local16 = Static316.method5413(6, arg0);
		local16.method2311();
		local16.anInt2289 = arg1;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public static String method2739(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(B)[Lclient!kk;")
	public static Class127[] method2740() {
		return new Class127[] { client.MODE_WHERE_LIVE, Static125.aClass127_8, Static27.aClass127_1, Static45.aClass127_2, client.MODE_WHERE_LOCAL, Static48.aClass127_3 };
	}
}
