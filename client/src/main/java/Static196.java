import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static196 {

	@OriginalMember(owner = "client!gb", name = "K", descriptor = "Z")
	public static boolean aBoolean262 = false;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;I)V")
	public static void method2947(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1) {
		Static154.aHashtable3.put(arg1, arg0);
	}
}
