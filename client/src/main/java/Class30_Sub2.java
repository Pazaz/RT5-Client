import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!io", name = "F", descriptor = "Lclient!cs;")
	private Class40_Sub1 aClass40_Sub1_5;

	@OriginalMember(owner = "client!io", name = "E", descriptor = "[I")
	private final int[] anIntArray241;

	@OriginalMember(owner = "client!io", name = "D", descriptor = "[I")
	private final int[] anIntArray240;

	@OriginalMember(owner = "client!io", name = "I", descriptor = "[[B")
	private final byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!io", name = "G", descriptor = "[I")
	private final int[] anIntArray242;

	@OriginalMember(owner = "client!io", name = "H", descriptor = "[I")
	private final int[] anIntArray243;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!cs;Lclient!fi;[Lclient!n;[I[I)V")
	public Class30_Sub2(@OriginalArg(0) Class40_Sub1 arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) Class133[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		super(arg0, arg1);
		this.aClass40_Sub1_5 = arg0;
		this.aClass40_Sub1_5 = arg0;
		this.anIntArray241 = arg3;
		this.anIntArray240 = arg4;
		this.aByteArrayArray25 = new byte[arg2.length][];
		this.anIntArray242 = new int[arg2.length];
		this.anIntArray243 = new int[arg2.length];
		for (@Pc(32) int local32 = 0; local32 < arg2.length; local32++) {
			this.aByteArrayArray25[local32] = arg2[local32].aByteArray65;
			this.anIntArray242[local32] = arg2[local32].anInt4514;
			this.anIntArray243[local32] = arg2[local32].anInt4519;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(CIIIZLclient!sn;II)V")
	@Override
	protected void method4837(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class142 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg5 == null) {
			this.method4847(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray243[arg0];
		arg2 += this.anIntArray242[arg0];
		@Pc(28) int local28 = this.anIntArray241[arg0];
		@Pc(33) int local33 = this.anIntArray240[arg0];
		@Pc(37) int local37 = this.aClass40_Sub1_5.anInt1412;
		@Pc(43) int local43 = arg1 + arg2 * local37;
		@Pc(47) int local47 = local37 - local28;
		@Pc(49) int local49 = 0;
		@Pc(51) int local51 = 0;
		@Pc(62) int local62;
		if (arg2 < this.aClass40_Sub1_5.anInt1435) {
			local62 = this.aClass40_Sub1_5.anInt1435 - arg2;
			local33 -= local62;
			arg2 = this.aClass40_Sub1_5.anInt1435;
			local51 = local62 * local28;
			local43 += local62 * local37;
		}
		if (arg2 + local33 > this.aClass40_Sub1_5.anInt1410) {
			local33 -= arg2 + local33 - this.aClass40_Sub1_5.anInt1410;
		}
		if (arg1 < this.aClass40_Sub1_5.anInt1438) {
			local62 = this.aClass40_Sub1_5.anInt1438 - arg1;
			local28 -= local62;
			arg1 = this.aClass40_Sub1_5.anInt1438;
			local51 += local62;
			local43 += local62;
			local49 = local62;
			local47 += local62;
		}
		if (arg1 + local28 > this.aClass40_Sub1_5.lb) {
			local62 = arg1 + local28 - this.aClass40_Sub1_5.lb;
			local28 -= local62;
			local49 += local62;
			local47 += local62;
		}
		if (local28 > 0 && local33 > 0) {
			this.method2994(this.aByteArrayArray25[arg0], this.aClass40_Sub1_5.anIntArray90, arg3, local51, local43, local28, local33, local47, local49, arg1, arg2, this.anIntArray241[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "([B[IIIIIIII)V")
	private void method2993(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(2) int local2 = -arg6; local2 < 0; local2++) {
			for (@Pc(6) int local6 = -arg5; local6 < 0; local6++) {
				@Pc(14) int local14 = arg0[arg3++] & 0xFF;
				if (local14 == 0) {
					arg4++;
				} else {
					@Pc(34) int local34 = ((arg2 & 0xFF00FF) * local14 & 0xFF00FF00) + ((arg2 & 0xFF00) * local14 & 0xFF0000) >> 8;
					local14 = 256 - local14;
					@Pc(42) int local42 = arg1[arg4];
					arg1[arg4++] = (((local42 & 0xFF00FF) * local14 & 0xFF00FF00) + ((local42 & 0xFF00) * local14 & 0xFF0000) >> 8) + local34;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "([B[IIIIIIIIIIILclient!sn;II)V")
	private void method2994(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class142 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class142_Sub1 local2 = (Class142_Sub1) arg12;
		@Pc(5) int[] local5 = local2.anIntArray371;
		@Pc(8) int[] local8 = local2.anIntArray372;
		@Pc(14) int local14 = arg9 - this.aClass40_Sub1_5.anInt1438;
		@Pc(16) int local16 = arg10;
		if (arg14 > arg10) {
			local16 = arg14;
			arg4 += (arg14 - arg10) * this.aClass40_Sub1_5.anInt1412;
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(56) int local56 = arg14 + local5.length < arg10 + arg6 ? arg14 + local5.length : arg10 + arg6;
		for (@Pc(58) int local58 = local16; local58 < local56; local58++) {
			@Pc(67) int local67 = local5[local58 - arg14] + arg13;
			@Pc(73) int local73 = local8[local58 - arg14];
			@Pc(75) int local75 = arg5;
			@Pc(82) int local82;
			if (local14 > local67) {
				local82 = local14 - local67;
				if (local82 >= local73) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				local73 -= local82;
			} else {
				local82 = local67 - local14;
				if (local82 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				arg3 += local82;
				local75 = arg5 - local82;
				arg4 += local82;
			}
			local82 = 0;
			if (local75 < local73) {
				local73 = local75;
			} else {
				local82 = local75 - local73;
			}
			for (@Pc(150) int local150 = -local73; local150 < 0; local150++) {
				@Pc(158) int local158 = arg0[arg3++] & 0xFF;
				if (local158 == 0) {
					arg4++;
				} else {
					@Pc(178) int local178 = ((arg2 & 0xFF00FF) * local158 & 0xFF00FF00) + ((arg2 & 0xFF00) * local158 & 0xFF0000) >> 8;
					local158 = 256 - local158;
					@Pc(186) int local186 = arg1[arg4];
					arg1[arg4++] = (((local186 & 0xFF00FF) * local158 & 0xFF00FF00) + ((local186 & 0xFF00) * local158 & 0xFF0000) >> 8) + local178;
				}
			}
			arg3 += local82 + arg8;
			arg4 += local82 + arg7;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(CIIIZ)V")
	@Override
	protected void method4847(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		arg1 += this.anIntArray243[arg0];
		arg2 += this.anIntArray242[arg0];
		@Pc(18) int local18 = this.anIntArray241[arg0];
		@Pc(23) int local23 = this.anIntArray240[arg0];
		@Pc(27) int local27 = this.aClass40_Sub1_5.anInt1412;
		@Pc(33) int local33 = arg1 + arg2 * local27;
		@Pc(37) int local37 = local27 - local18;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(52) int local52;
		if (arg2 < this.aClass40_Sub1_5.anInt1435) {
			local52 = this.aClass40_Sub1_5.anInt1435 - arg2;
			local23 -= local52;
			arg2 = this.aClass40_Sub1_5.anInt1435;
			local41 = local52 * local18;
			local33 += local52 * local27;
		}
		if (arg2 + local23 > this.aClass40_Sub1_5.anInt1410) {
			local23 -= arg2 + local23 - this.aClass40_Sub1_5.anInt1410;
		}
		if (arg1 < this.aClass40_Sub1_5.anInt1438) {
			local52 = this.aClass40_Sub1_5.anInt1438 - arg1;
			local18 -= local52;
			arg1 = this.aClass40_Sub1_5.anInt1438;
			local41 += local52;
			local33 += local52;
			local39 = local52;
			local37 += local52;
		}
		if (arg1 + local18 > this.aClass40_Sub1_5.lb) {
			local52 = arg1 + local18 - this.aClass40_Sub1_5.lb;
			local18 -= local52;
			local39 += local52;
			local37 += local52;
		}
		if (local18 > 0 && local23 > 0) {
			this.method2993(this.aByteArrayArray25[arg0], this.aClass40_Sub1_5.anIntArray90, arg3, local41, local33, local18, local23, local37, local39);
		}
	}
}
