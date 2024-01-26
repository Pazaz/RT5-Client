import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "[I")
	public static int[] anIntArray449;

	@OriginalMember(owner = "client!lfa", name = "k", descriptor = "Lclient!rt;")
	public static Class327 aClass327_3;

	@OriginalMember(owner = "client!lfa", name = "g", descriptor = "I")
	public static int anInt5801;

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[100];

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(II)I")
	public static int method5224(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "([III[II[[B[B[[B)I")
	public static int method5225(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(7) int local7 = arg0[arg3];
		@Pc(14) int local14 = local7 + arg2[arg3];
		@Pc(18) int local18 = arg0[arg1];
		@Pc(24) int local24 = local18 + arg2[arg1];
		@Pc(26) int local26 = local7;
		if (local18 > local7) {
			local26 = local18;
		}
		@Pc(37) int local37 = local14;
		if (local14 > local24) {
			local37 = local24;
		}
		@Pc(48) int local48 = arg5[arg3] & 0xFF;
		if ((arg5[arg1] & 0xFF) < local48) {
			local48 = arg5[arg1] & 0xFF;
		}
		@Pc(69) byte[] local69 = arg6[arg3];
		@Pc(73) byte[] local73 = arg4[arg1];
		@Pc(78) int local78 = local26 - local7;
		@Pc(83) int local83 = local26 - local18;
		for (@Pc(85) int local85 = local26; local85 < local37; local85++) {
			@Pc(96) int local96 = local73[local83++] + local69[local78++];
			if (local48 > local96) {
				local48 = local96;
			}
		}
		return -local48;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)I")
	public static int method5226() {
		return Static372.method5291(false);
	}
}
