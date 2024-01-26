import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!sl", name = "C", descriptor = "[Lclient!wka;")
	public static final Interface27[] anInterface27Array2 = new Interface27[75];

	@OriginalMember(owner = "client!sl", name = "B", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_107 = new Class345(92, 3);

	@OriginalMember(owner = "client!sl", name = "A", descriptor = "I")
	public static int anInt8739 = 0;

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(IIIII)V")
	public static void method7757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static180.anInt2995 <= arg0 && Static111.anInt2219 >= arg0) {
			@Pc(30) int local30 = Static670.method8732(Static724.anInt10930, Static273.anInt4395, arg2);
			@Pc(36) int local36 = Static670.method8732(Static724.anInt10930, Static273.anInt4395, arg3);
			Static87.method1692(local36, local30, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZ[B)I")
	public static int method7758(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static12.method5163(arg0, 0, arg1);
	}
}
