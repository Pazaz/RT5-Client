import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!eda", name = "k", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream2;

	@OriginalMember(owner = "client!eda", name = "f", descriptor = "Lclient!taa;")
	public static Class306_Sub1 aClass306_Sub1_3;

	@OriginalMember(owner = "client!eda", name = "e", descriptor = "I")
	public static int anInt10326;

	@OriginalMember(owner = "client!eda", name = "h", descriptor = "[J")
	public static final long[] aLongArray20 = new long[10];

	@OriginalMember(owner = "client!eda", name = "g", descriptor = "I")
	public static int anInt10329 = 0;

	@OriginalMember(owner = "client!eda", name = "m", descriptor = "I")
	public static int anInt10330 = 0;

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "([BI)[B")
	public static byte[] method8955(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(12) byte[] local12 = new byte[arg0.length];
			Static734.method7694(arg0, 0, local12, 0, arg0.length);
			return local12;
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!hda;BZ)V")
	public static void method8956(@OriginalArg(0) Class158 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) int local16 = arg0.anInt3769 == 0 ? arg0.anInt3802 : arg0.anInt3769;
		@Pc(37) int local37 = arg0.anInt3742 == 0 ? arg0.anInt3746 : arg0.anInt3742;
		Static220.method3200(local16, arg1, local37, Static453.aClass158ArrayArray2[arg0.anInt3812 >> 16], arg0.anInt3812);
		if (arg0.aClass158Array1 != null) {
			Static220.method3200(local16, arg1, local37, arg0.aClass158Array1, arg0.anInt3812);
		}
		@Pc(72) Class2_Sub4 local72 = (Class2_Sub4) Static548.aClass28_40.method738((long) arg0.anInt3812);
		if (local72 != null) {
			Static19.method265(arg1, local72.anInt147, local37, local16);
		}
	}
}
