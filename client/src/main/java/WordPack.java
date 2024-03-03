import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class WordPack {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!lo;)V")
	public static void init(@OriginalArg(1) HuffmanCodec arg0) {
		Static370.aClass140_1 = arg0;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Ljava/lang/String;ILclient!bt;)I")
	public static int encode(@OriginalArg(0) String arg0, @OriginalArg(2) Packet arg1) {
		@Pc(6) int local6 = arg1.pos;
		@Pc(10) byte[] local10 = Static51.method1546(arg0);
		arg1.psmart(local10.length);
		arg1.pos += Static370.aClass140_1.method3648(arg1.data, local10, 0, arg1.pos, local10.length);
		return arg1.pos - local6;
	}

}
