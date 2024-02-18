import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB[B)[B")
	public static byte[] method5550(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(14) byte[] local14 = new byte[arg0];
		Static734.method7694(arg1, 0, local14, 0, arg0);
		return local14;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	public static void method5551() {
		@Pc(10) Class153 local10 = Static668.method8701();
		@Pc(18) Class2_Sub19 local18 = Static293.method4335(Static244.aClass345_53, local10.aClass186_1);
		local18.aClass2_Sub21_Sub2_1.method7389(0);
		local10.method3275(local18);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ge;B)Lclient!pfa;")
	public static Class154_Sub3 method5552(@OriginalArg(0) Class2_Sub21 arg0) {
		return new Class154_Sub3(arg0.method7356(), arg0.method7356(), arg0.method7356(), arg0.method7356(), arg0.method7356(), arg0.method7356(), arg0.method7356(), arg0.method7356(), arg0.method7383(), arg0.method7396());
	}
}
