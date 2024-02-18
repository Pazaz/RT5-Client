import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
	public static int anInt1569;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ce", name = "k", descriptor = "Ljava/lang/Class;")
	private static Class aClass4;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "[I")
	public static final int[] anIntArray147 = new int[50];

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lclient!fb;")
	public static Class120 method1513(@OriginalArg(0) Component arg0) {
		try {
			@Pc(34) Constructor local34 = Class.forName("Class120_Sub1").getDeclaredConstructor(aClass4 == null ? (aClass4 = Class.forName("java.awt.Component")) : aClass4, Boolean.TYPE);
			return (Class120) local34.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(52) Throwable local52) {
			return new Class120_Sub2(arg0, true);
		}
	}
}
