import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!ol", name = "F", descriptor = "I")
	public static int anInt7013;

	@OriginalMember(owner = "client!ol", name = "J", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_176 = new Class225(45, 2);

	@OriginalMember(owner = "client!ol", name = "G", descriptor = "[I")
	public static final int[] anIntArray561 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!ol", name = "I", descriptor = "Z")
	public static boolean aBoolean533 = false;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!ge;Z)Lclient!hea;")
	public static Class160_Sub1 method6301(@OriginalArg(0) Class2_Sub21 arg0) {
		@Pc(16) Class160 local16 = Static515.method6803(arg0);
		@Pc(20) int local20 = arg0.method7392();
		return new Class160_Sub1(local16.anInt3851, local16.aClass403_9, local16.aClass103_9, local16.anInt3850, local16.anInt3845, local20);
	}
}
