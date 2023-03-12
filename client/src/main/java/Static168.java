import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "Lclient!mc;")
	public static final ClientProt aClass145_268 = new ClientProt(81, 2);

	@OriginalMember(owner = "client!jq", name = "D", descriptor = "I")
	public static int anInt7248 = -1;

	@OriginalMember(owner = "client!jq", name = "H", descriptor = "[Z")
	public static final boolean[] aBooleanArray67 = new boolean[8];

	@OriginalMember(owner = "client!jq", name = "I", descriptor = "[Lclient!nb;")
	public static final Class157[] aClass157Array42 = new Class157[14];

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIII)V")
	public static void method6474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class58 local3 = new Class58();
		local3.anInt1696 = arg1 >> Static322.anInt6029;
		local3.anInt1687 = arg2 >> Static322.anInt6029;
		local3.anInt1688 = arg3 >> Static322.anInt6029;
		local3.anInt1691 = arg4 >> Static322.anInt6029;
		local3.anInt1689 = arg0;
		local3.anInt1699 = arg1;
		local3.anInt1695 = arg2;
		local3.anInt1686 = arg3;
		local3.anInt1692 = arg4;
		local3.anInt1697 = arg5;
		local3.anInt1703 = arg6;
		Static246.aClass58Array3[Static266.anInt4901++] = local3;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)I")
	public static int method6476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static32.aByteArrayArray4 == null ? 0 : (Static32.aByteArrayArray4[arg0][arg1] & 0xFF) << 3;
	}
}
