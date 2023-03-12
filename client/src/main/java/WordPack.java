import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public class WordPack {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!lo;)V")
	public static void init(@OriginalArg(1) HuffmanCodec arg0) {
		Static370.aClass140_1 = arg0;
	}

}
