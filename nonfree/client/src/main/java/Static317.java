import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!kaa", name = "g", descriptor = "I")
	public static int anInt5046;

	@OriginalMember(owner = "client!kaa", name = "h", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_62 = new Class345(56, 0);

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IBI)I")
	public static int method4579(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4;
		if (arg1 < arg0) {
			local4 = arg1;
			arg1 = arg0;
			arg0 = local4;
		}
		while (arg0 != 0) {
			local4 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local4;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIILclient!ka;I)Lclient!ke;")
	public static Class205 method4583(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class114 arg2, @OriginalArg(4) int arg3) {
		return arg2 == null ? null : new Class205(arg1, arg0, arg3, arg2.na(), arg2.V(), arg2.RA(), arg2.fa(), arg2.EA(), arg2.HA(), arg2.G());
	}
}
