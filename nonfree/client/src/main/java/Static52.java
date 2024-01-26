import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static52 {

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
	public static int anInt1059;

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
	public static int anInt1066;

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
	public static int anInt1065 = 0;

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)Z")
	public static boolean method1157(@OriginalArg(0) int arg0) {
		return Static96.anInt10171 == 0 ? Static581.aClass2_Sub6_Sub1_3.method922() : true;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)[I")
	public static int[] method1159() {
		return new int[] { Static662.anInt9845, Static539.anInt8173, Static634.anInt9519 };
	}
}
