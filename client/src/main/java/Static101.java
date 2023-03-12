import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_44 = new LocalizedString("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "Lclient!mc;")
	public static final ClientProt aClass145_75 = new ClientProt(8, 6);

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "Z")
	public static boolean aBoolean158 = false;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I[IIII)V")
	public static void method2163(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg3--;
		@Pc(12) int local12 = arg0 - 1;
		@Pc(15) int local15 = local12 - 7;
		while (arg3 < local15) {
			@Pc(19) int local19 = arg3 + 1;
			arg1[local19] = arg2;
			@Pc(24) int local24 = local19 + 1;
			arg1[local24] = arg2;
			@Pc(29) int local29 = local24 + 1;
			arg1[local29] = arg2;
			@Pc(34) int local34 = local29 + 1;
			arg1[local34] = arg2;
			@Pc(39) int local39 = local34 + 1;
			arg1[local39] = arg2;
			@Pc(44) int local44 = local39 + 1;
			arg1[local44] = arg2;
			@Pc(49) int local49 = local44 + 1;
			arg1[local49] = arg2;
			arg3 = local49 + 1;
			arg1[arg3] = arg2;
		}
		while (arg3 < local12) {
			arg3++;
			arg1[arg3] = arg2;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!np;)Z")
	public static boolean method2164(@OriginalArg(1) MelType arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean305) {
			return false;
		} else if (!arg0.method4180(Static344.anInterface11_2)) {
			return false;
		} else if (Static220.aClass4_83.get((long) arg0.anInt4430) == null) {
			return Static141.aClass4_58.get((long) arg0.anInt4424) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIILclient!r;)Lclient!vi;")
	public static Class239 method2165(@OriginalArg(2) int arg0, @OriginalArg(3) Js5 arg1) {
		@Pc(13) byte[] local13 = arg1.fetchFile(0, arg0);
		return local13 == null ? null : new Class239(local13);
	}

}
