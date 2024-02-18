import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!lca", name = "n", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame10;

	@OriginalMember(owner = "client!lca", name = "k", descriptor = "Z")
	public static boolean aBoolean734 = false;

	@OriginalMember(owner = "client!lca", name = "s", descriptor = "[I")
	public static final int[] anIntArray748 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!lca", name = "A", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_233 = new Class225(30, -2);

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!ge;B)Lclient!fw;")
	public static Class138_Sub1_Sub1 method8430(@OriginalArg(0) Packet arg0) {
		@Pc(7) Class138_Sub1 local7 = Static715.method9346(arg0);
		@Pc(20) int local20 = arg0.g2s();
		return new Class138_Sub1_Sub1(local7.aClass403_10, local7.aClass103_10, local7.anInt4423, local7.anInt4412, local7.anInt4418, local7.anInt4413, local7.anInt4416, local7.anInt4415, local7.anInt4421, local7.anInt3188, local7.anInt3190, local7.anInt3189, local7.anInt3185, local7.anInt3183, local7.anInt3182, local20);
	}
}
