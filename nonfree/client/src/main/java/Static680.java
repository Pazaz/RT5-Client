import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static680 {

	@OriginalMember(owner = "client!vja", name = "h", descriptor = "I")
	public static int anInt10289;

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(Lclient!sb;IZ)Lclient!cea;")
	public static Class2_Sub11 method8917(@OriginalArg(0) Class330 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte[] local8 = arg0.method7589(arg1);
		return local8 == null ? null : new Class2_Sub11(local8);
	}
}
