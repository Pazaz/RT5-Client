import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!nt", name = "j", descriptor = "I")
	public static int anInt6680 = 0;

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "I")
	public static int anInt6683 = 1;

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "[I")
	public static final int[] anIntArray529 = new int[2];

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(II)I")
	public static int method5962(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(16) int local16 = local4 | local4 >>> 1;
		@Pc(22) int local22 = local16 | local16 >>> 2;
		@Pc(28) int local28 = local22 | local22 >>> 4;
		@Pc(34) int local34 = local28 | local28 >>> 8;
		@Pc(40) int local40 = local34 | local34 >>> 16;
		return local40 + 1;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIJ)Lclient!aj;")
	public static Class2_Sub2_Sub2 method5963(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(21) Class2_Sub2_Sub2 local21 = (Class2_Sub2_Sub2) Static658.aClass28_43.method738(arg1 | (long) arg0 << 56);
		if (local21 == null) {
			local21 = new Class2_Sub2_Sub2(arg0, arg1);
			Static658.aClass28_43.method735(local21.aLong328, local21);
		}
		return local21;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILclient!dea;)V")
	public static void method5964(@OriginalArg(1) Class2_Sub6 arg0) {
		if (arg0.aClass2_Sub49_6 != null) {
			arg0.aClass2_Sub49_6.anInt8817 = 0;
		}
		arg0.aBoolean793 = false;
		for (@Pc(25) Class2_Sub6 local25 = arg0.method9133(); local25 != null; local25 = arg0.method9135()) {
			method5964(local25);
		}
	}
}
