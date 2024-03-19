import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class77_Sub2 extends Class77 {

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
	private int anInt4632;

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
	private int anInt4633;

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
	private int anInt4634;

	@OriginalMember(owner = "client!ng", name = "t", descriptor = "[[Lclient!d;")
	private Class41[][] aClass41ArrayArray1;

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
	private int anInt4636;

	@OriginalMember(owner = "client!ng", name = "w", descriptor = "[[Lclient!bb;")
	private Class16[][] aClass16ArrayArray1;

	@OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
	private int anInt4637;

	@OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
	private int anInt4639;

	@OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
	private int anInt4640;

	@OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
	private int anInt4641;

	@OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
	private int anInt4642;

	@OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
	private int anInt4643;

	@OriginalMember(owner = "client!ng", name = "F", descriptor = "[[Lclient!kg;")
	private Class110[][] aClass110ArrayArray1;

	@OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
	private int anInt4644;

	@OriginalMember(owner = "client!ng", name = "J", descriptor = "[[Lclient!kl;")
	private Class112[][] aClass112ArrayArray1;

	@OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
	private int anInt4646;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "Lclient!cs;")
	private final Class40_Sub1 aClass40_Sub1_8;

	@OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
	private final int anInt4638;

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "[[I")
	public final int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "[[I")
	private final int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
	private final int anInt4635;

	@OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
	private int anInt4645;

	@OriginalMember(owner = "client!ng", name = "H", descriptor = "[[B")
	private byte[][] aByteArrayArray43;

	@OriginalMember(owner = "client!ng", name = "v", descriptor = "[[B")
	private byte[][] aByteArrayArray42;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!cs;IIII[[I[[II)V")
	public Class77_Sub2(@OriginalArg(0) Class40_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass40_Sub1_8 = arg0;
		this.anInt4638 = arg2;
		this.anIntArrayArray30 = arg5;
		this.anIntArrayArray31 = arg6;
		this.anInt4635 = arg7;
		this.anInt4645 = 0;
		while (arg7 > 1) {
			this.anInt4645++;
			arg7 >>= 0x1;
		}
		this.aByteArrayArray43 = new byte[arg3 + 1][arg4 + 1];
		@Pc(50) int local50 = this.aClass40_Sub1_8.anInt1427 >> 9;
		for (@Pc(52) int local52 = 1; local52 < arg4; local52++) {
			for (@Pc(55) int local55 = 1; local55 < arg3; local55++) {
				@Pc(76) int local76 = this.anIntArrayArray30[local55 + 1][local52] - this.anIntArrayArray30[local55 - 1][local52];
				@Pc(94) int local94 = this.anIntArrayArray30[local55][local52 + 1] - this.anIntArrayArray30[local55][local52 - 1];
				@Pc(107) int local107 = (int) Math.sqrt((double) (local76 * local76 + local94 * local94 + 65536));
				@Pc(113) int local113 = (local76 << 8) / local107;
				@Pc(117) int local117 = -65536 / local107;
				@Pc(123) int local123 = (local94 << 8) / local107;
				@Pc(145) int local145 = local50 + (this.aClass40_Sub1_8.anInt1428 * local113 + this.aClass40_Sub1_8.anInt1440 * local117 + this.aClass40_Sub1_8.anInt1423 * local123 >> 17);
				local145 >>= 0x1;
				if (local145 < 2) {
					local145 = 2;
				} else if (local145 > 126) {
					local145 = 126;
				}
				this.aByteArrayArray43[local55][local52] = (byte) local145;
			}
		}
		this.aByteArrayArray42 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(Lclient!oc;IIIIZ)Z")
	@Override
	public boolean method3988(@OriginalArg(0) Class1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method4000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		if (this.aClass112ArrayArray1 == null) {
			this.aClass112ArrayArray1 = new Class112[super.anInt4630][super.anInt4625];
			this.aClass110ArrayArray1 = new Class110[super.anInt4630][super.anInt4625];
		} else if (this.aClass41ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg5.length; local32++) {
			if (arg5[local32] == -1) {
				arg5[local32] = 0;
			} else {
				arg5[local32] = Static139.anIntArray247[Static192.method3828(arg5[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg6 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg6.length; local68++) {
				if (arg6[local68] == -1) {
					arg6[local68] = 0;
				} else {
					arg6[local68] = Static139.anIntArray247[Static192.method3828(arg6[local68]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(102) boolean local102 = true;
		@Pc(104) int local104 = -1;
		@Pc(106) int local106 = -1;
		@Pc(108) int local108 = -1;
		@Pc(110) int local110 = -1;
		@Pc(244) int local244;
		if (arg2.length == 6) {
			for (@Pc(116) int local116 = 0; local116 < 6; local116++) {
				if (arg2[local116] == 0 && arg4[local116] == 0) {
					if (local104 != -1 && arg5[local104] != arg5[local116]) {
						local102 = false;
						break;
					}
					local104 = local116;
				} else if (arg2[local116] == this.anInt4635 && arg4[local116] == 0) {
					if (local106 != -1 && arg5[local106] != arg5[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == this.anInt4635 && arg4[local116] == this.anInt4635) {
					if (local108 != -1 && arg5[local108] != arg5[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == this.anInt4635) {
					if (local110 != -1 && arg5[local110] != arg5[local116]) {
						local102 = false;
						break;
					}
					local110 = local116;
				}
			}
			if (local104 == -1 || local106 == -1 || local108 == -1 || local110 == -1) {
				local102 = false;
			}
			if (local102) {
				if (arg3 != null) {
					for (local244 = 0; local244 < 4; local244++) {
						if (arg3[local244] != 0) {
							local102 = false;
							break;
						}
					}
				}
				if (local102) {
					for (local244 = 1; local244 < 4; local244++) {
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + this.anInt4635 && arg2[local244] != arg2[0] - this.anInt4635) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + this.anInt4635 && arg4[local244] != arg4[0] - this.anInt4635) {
							local102 = false;
							break;
						}
					}
				}
			}
		} else {
			local102 = false;
		}
		@Pc(342) int local342;
		@Pc(531) int local531;
		if (local102) {
			@Pc(334) Class112 local334 = new Class112();
			local244 = arg5[0];
			local342 = arg7[0];
			if (arg6 != null) {
				local334.anInt3934 = arg6[0] >> 8;
				if (local244 == 0) {
					local334.aByte37 = (byte) (local334.aByte37 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray30[arg0][arg1] == this.anIntArrayArray30[arg0 + 1][arg1] && this.anIntArrayArray30[arg0][arg1] == this.anIntArrayArray30[arg0 + 1][arg1 + 1] && this.anIntArrayArray30[arg0][arg1] == this.anIntArrayArray30[arg0][arg1 + 1]) {
				local334.aByte37 = (byte) (local334.aByte37 | 0x1);
			}
			if (local342 == -1 || (local334.aByte37 & 0x2) != 0 || this.aClass40_Sub1_8.anInterface4_1.method165(local342).aBoolean108) {
				if (this.anIntArrayArray31 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray31[arg0][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt3938 = Static99.method2072(local531, Static364.method4006(arg5[local104] >> 8, this.aByteArrayArray43[arg0][arg1] - this.aByteArrayArray42[arg0][arg1]), arg9);
				if (local334.anInt3934 != 0) {
					local334.anInt3938 |= this.aByteArrayArray42[arg0][arg1] + 255 - this.aByteArrayArray43[arg0][arg1] << 25;
				}
				if (this.anIntArrayArray31 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray31[arg0 + 1][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt3935 = Static99.method2072(local531, Static364.method4006(arg5[local106] >> 8, this.aByteArrayArray43[arg0 + 1][arg1] - this.aByteArrayArray42[arg0 + 1][arg1]), arg9);
				if (local334.anInt3934 != 0) {
					local334.anInt3935 |= this.aByteArrayArray42[arg0 + 1][arg1] + 255 - this.aByteArrayArray43[arg0 + 1][arg1] << 25;
				}
				if (this.anIntArrayArray31 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray31[arg0 + 1][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt3936 = Static99.method2072(local531, Static364.method4006(arg5[local108] >> 8, this.aByteArrayArray43[arg0 + 1][arg1 + 1] - this.aByteArrayArray42[arg0 + 1][arg1 + 1]), arg9);
				if (local334.anInt3934 != 0) {
					local334.anInt3936 |= this.aByteArrayArray42[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray43[arg0 + 1][arg1 + 1] << 25;
				}
				if (this.anIntArrayArray31 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray31[arg0][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt3937 = Static99.method2072(local531, Static364.method4006(arg5[local110] >> 8, this.aByteArrayArray43[arg0][arg1 + 1] - this.aByteArrayArray42[arg0][arg1 + 1]), arg9);
				if (local334.anInt3934 != 0) {
					local334.anInt3937 |= this.aByteArrayArray42[arg0][arg1 + 1] + 255 - this.aByteArrayArray43[arg0][arg1 + 1] << 25;
				}
				local334.aShort58 = -1;
			} else {
				local334.anInt3938 = this.aByteArrayArray43[arg0][arg1] - this.aByteArrayArray42[arg0][arg1];
				local334.anInt3935 = this.aByteArrayArray43[arg0 + 1][arg1] - this.aByteArrayArray42[arg0 + 1][arg1];
				local334.anInt3936 = this.aByteArrayArray43[arg0 + 1][arg1 + 1] - this.aByteArrayArray42[arg0 + 1][arg1 + 1];
				local334.anInt3937 = this.aByteArrayArray43[arg0][arg1 + 1] - this.aByteArrayArray42[arg0][arg1 + 1];
				local334.aShort58 = (short) local342;
			}
			this.aClass112ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(886) Class110 local886 = new Class110();
		local886.aShort56 = (short) arg2.length;
		local886.aShort57 = (short) (arg2.length / 3);
		local886.aShortArray60 = new short[local886.aShort56];
		local886.aShortArray57 = new short[local886.aShort56];
		local886.aShortArray56 = new short[local886.aShort56];
		local886.anIntArray273 = new int[local886.aShort56];
		if (this.anIntArrayArray31 != null) {
			local886.aShortArray55 = new short[local886.aShort56];
		}
		@Pc(957) int local957;
		@Pc(1078) int local1078;
		@Pc(1125) int local1125;
		@Pc(1225) int local1225;
		@Pc(1344) int local1344;
		for (local244 = 0; local244 < local886.aShort56; local244++) {
			local342 = arg2[local244];
			local531 = arg4[local244];
			if (local342 == 0 && local531 == 0) {
				local957 = this.aByteArrayArray43[arg0][arg1] - this.aByteArrayArray42[arg0][arg1];
			} else if (local342 == 0 && local531 == this.anInt4635) {
				local957 = this.aByteArrayArray43[arg0][arg1 + 1] - this.aByteArrayArray42[arg0][arg1 + 1];
			} else if (local342 == this.anInt4635 && local531 == this.anInt4635) {
				local957 = this.aByteArrayArray43[arg0 + 1][arg1 + 1] - this.aByteArrayArray42[arg0 + 1][arg1 + 1];
			} else if (local342 == this.anInt4635 && local531 == 0) {
				local957 = this.aByteArrayArray43[arg0 + 1][arg1] - this.aByteArrayArray42[arg0 + 1][arg1];
			} else {
				local1078 = (this.aByteArrayArray43[arg0][arg1] - this.aByteArrayArray42[arg0][arg1]) * (this.anInt4635 - local342) + (this.aByteArrayArray43[arg0 + 1][arg1] - this.aByteArrayArray42[arg0 + 1][arg1]) * local342;
				local1125 = (this.aByteArrayArray43[arg0][arg1 + 1] - this.aByteArrayArray42[arg0][arg1 + 1]) * (this.anInt4635 - local342) + (this.aByteArrayArray43[arg0 + 1][arg1 + 1] - this.aByteArrayArray42[arg0 + 1][arg1 + 1]) * local342;
				local957 = local1078 * (this.anInt4635 - local531) + local1125 * local531 >> this.anInt4645 * 2;
			}
			@Pc(1149) short local1149 = (short) ((arg0 << this.anInt4645) + local342);
			@Pc(1157) short local1157 = (short) ((arg1 << this.anInt4645) + local531);
			local886.aShortArray60[local244] = local1149;
			local886.aShortArray56[local244] = local1157;
			local886.aShortArray57[local244] = (short) (this.method3994(local1149, local1157) + (arg3 == null ? 0 : arg3[local244]));
			if (local957 < 0) {
				local957 = 0;
			}
			if (arg7[local244] != -1 && !this.aClass40_Sub1_8.anInterface4_1.method165(arg7[local244]).aBoolean108) {
				local886.anIntArray273[local244] = local957;
			} else if (arg5[local244] != 0) {
				local1225 = 0;
				if (this.anIntArrayArray31 != null) {
					@Pc(1241) int local1241;
					if (local342 == 0 && local531 == 0) {
						local1241 = this.anIntArrayArray31[arg0][arg1];
					} else if (local342 == 0 && local531 == this.anInt4635) {
						local1241 = this.anIntArrayArray31[arg0][arg1 + 1];
					} else if (local342 == this.anInt4635 && local531 == this.anInt4635) {
						local1241 = this.anIntArrayArray31[arg0 + 1][arg1 + 1];
					} else if (local342 == this.anInt4635 && local531 == 0) {
						local1241 = this.anIntArrayArray31[arg0 + 1][arg1];
					} else {
						@Pc(1317) int local1317 = this.anIntArrayArray31[arg0][arg1] * (this.anInt4635 - local342) + this.anIntArrayArray31[arg0 + 1][arg1] * local342;
						local1344 = this.anIntArrayArray31[arg0][arg1 + 1] * (this.anInt4635 - local342) + this.anIntArrayArray31[arg0 + 1][arg1 + 1] * local342;
						local1241 = local1317 * (this.anInt4635 - local531) + local1344 * local531 >> this.anInt4645 * 2;
					}
					local886.aShortArray55[local244] = (short) local1241;
					if (arg10 != 0) {
						local1225 = local1241 * 255 / arg10;
						if (local1225 < 0) {
							local1225 = 0;
						} else if (local1225 > 255) {
							local1225 = 255;
						}
					}
				}
				local886.anIntArray273[local244] = Static99.method2072(local1225, Static364.method4006(arg5[local244] >> 8, local957), arg9);
				if (arg6 != null) {
					local886.anIntArray273[local244] |= local957 << 25;
				}
			} else if (arg6 == null) {
				local886.anIntArray273[local244] = 0;
			} else {
				local886.anIntArray273[local244] = local957 << 25;
			}
		}
		@Pc(1424) boolean local1424 = false;
		for (local531 = 0; local531 < local886.aShort57; local531++) {
			if (arg7[local531 * 3] != -1 && !this.aClass40_Sub1_8.anInterface4_1.method165(arg7[local531 * 3]).aBoolean108) {
				local1424 = true;
			}
		}
		if (arg6 != null) {
			local886.anIntArray274 = new int[local886.aShort57];
		}
		if (local1424) {
			local886.aShortArray58 = new short[local886.aShort57];
			local886.aShortArray59 = new short[local886.aShort57];
		}
		for (local957 = 0; local957 < local886.aShort57; local957++) {
			local1078 = local957 * 3;
			if (arg6 != null && arg6[local1078] != 0) {
				local886.anIntArray274[local957] = arg6[local1078] >> 8;
			}
			if (local1424) {
				local1125 = local1078 + 1;
				local1225 = local1125 + 1;
				@Pc(1506) boolean local1506 = false;
				@Pc(1508) boolean local1508 = true;
				local1344 = arg7[local1078];
				if (local1344 == -1 || this.aClass40_Sub1_8.anInterface4_1.method165(local1344).aBoolean108) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1125];
				if (local1344 == -1 || this.aClass40_Sub1_8.anInterface4_1.method165(local1344).aBoolean108) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1225];
				if (local1344 == -1 || this.aClass40_Sub1_8.anInterface4_1.method165(local1344).aBoolean108) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				if (local1508) {
					local886.aShortArray58[local957] = (short) local1344;
					local886.aShortArray59[local957] = (short) arg8[local1078];
				} else {
					if (local1506) {
						local1344 = arg7[local1078];
						if (local1344 != -1 && !this.aClass40_Sub1_8.anInterface4_1.method165(local1344).aBoolean108) {
							local886.anIntArray273[local1078] = Static139.anIntArray247[Static192.method3828(this.aClass40_Sub1_8.anInterface4_1.method165(local1344).aShort27 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1125];
						if (local1344 != -1 && !this.aClass40_Sub1_8.anInterface4_1.method165(local1344).aBoolean108) {
							local886.anIntArray273[local1125] = Static139.anIntArray247[Static192.method3828(this.aClass40_Sub1_8.anInterface4_1.method165(local1344).aShort27 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1225];
						if (local1344 != -1 && !this.aClass40_Sub1_8.anInterface4_1.method165(local1344).aBoolean108) {
							local886.anIntArray273[local1225] = Static139.anIntArray247[Static192.method3828(this.aClass40_Sub1_8.anInterface4_1.method165(local1344).aShort27 & 0xFFFF) & 0xFFFF];
						}
					}
					local886.aShortArray58[local957] = -1;
				}
			}
		}
		this.aClass110ArrayArray1[arg0][arg1] = local886;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method3984(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class134 local4 = this.aClass40_Sub1_8.method1228(Thread.currentThread());
		@Pc(7) Class74 local7 = local4.aClass74_1;
		local7.anInt2447 = 0;
		local7.aBoolean160 = false;
		if (this.aClass112ArrayArray1 != null) {
			this.method4008(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray322, local4.anIntArray334);
		} else if (this.aClass41ArrayArray1 != null) {
			this.method4007(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray322, local4.anIntArray334);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)I")
	@Override
	public int method3986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray30[arg0][arg1];
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILclient!gi;[I[I[I)V")
	private void method4003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class74 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class41 local6 = this.aClass41ArrayArray1[arg0][arg1];
		@Pc(24) int local24;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(181) int local181;
		@Pc(237) int local237;
		@Pc(293) int local293;
		@Pc(349) int local349;
		@Pc(209) int local209;
		@Pc(170) int local170;
		@Pc(226) int local226;
		@Pc(282) int local282;
		@Pc(338) int local338;
		@Pc(198) int local198;
		@Pc(254) int local254;
		@Pc(310) int local310;
		@Pc(366) int local366;
		@Pc(68) int local68;
		@Pc(91) int local91;
		@Pc(114) int local114;
		@Pc(137) int local137;
		@Pc(46) int local46;
		@Pc(265) int local265;
		@Pc(321) int local321;
		@Pc(377) int local377;
		if (local6 == null) {
			@Pc(996) Class16 local996 = this.aClass16ArrayArray1[arg0][arg1];
			if (local996 != null) {
				for (local349 = 0; local349 < local996.aShort15; local349++) {
					local24 = local996.anIntArray41[local349];
					local29 = local996.anIntArray44[local349];
					local34 = local996.anIntArray43[local349];
					local293 = this.anInt4639 + (this.anInt4642 * local24 + this.anInt4641 * local29 + this.anInt4633 * local34 >> 15);
					if (local293 <= this.aClass40_Sub1_8.anInt1421) {
						return;
					}
					local181 = this.anInt4636 + (this.anInt4634 * local24 + this.anInt4632 * local29 + this.anInt4643 * local34 >> 15);
					local237 = this.anInt4637 + (this.anInt4644 * local24 + this.anInt4646 * local29 + this.anInt4640 * local34 >> 15);
					arg3[local349] = arg2.anInt2449 + local181 * this.aClass40_Sub1_8.anInt1439 / local293;
					arg4[local349] = arg2.anInt2448 + local237 * this.aClass40_Sub1_8.anInt1417 / local293;
				}
				if (local996.aShortArray3 != null) {
					local209 = this.anIntArrayArray30[arg0][arg1];
					local265 = this.anIntArrayArray30[arg0 + 1][arg1];
					local321 = this.anIntArrayArray30[arg0][arg1 + 1];
					local377 = arg0 * this.anInt4635;
					local170 = local377 + this.anInt4635;
					local226 = arg1 * this.anInt4635;
					local282 = local226 + this.anInt4635;
					local338 = this.anInt4636 + (this.anInt4634 * local377 + this.anInt4632 * local209 + this.anInt4643 * local226 >> 15);
					local198 = this.anInt4637 + (this.anInt4644 * local377 + this.anInt4646 * local209 + this.anInt4640 * local226 >> 15);
					local254 = this.anInt4639 + (this.anInt4642 * local377 + this.anInt4641 * local209 + this.anInt4633 * local226 >> 15);
					local310 = this.anInt4636 + (this.anInt4634 * local170 + this.anInt4632 * local265 + this.anInt4643 * local226 >> 15);
					local366 = this.anInt4637 + (this.anInt4644 * local170 + this.anInt4646 * local265 + this.anInt4640 * local226 >> 15);
					local68 = this.anInt4639 + (this.anInt4642 * local170 + this.anInt4641 * local265 + this.anInt4633 * local226 >> 15);
					local91 = this.anInt4636 + (this.anInt4634 * local377 + this.anInt4632 * local321 + this.anInt4643 * local282 >> 15);
					local114 = this.anInt4637 + (this.anInt4644 * local377 + this.anInt4646 * local321 + this.anInt4640 * local282 >> 15);
					local137 = this.anInt4639 + (this.anInt4642 * local377 + this.anInt4641 * local321 + this.anInt4633 * local282 >> 15);
					for (local46 = 0; local46 < local996.aShort16; local46++) {
						@Pc(1349) short local1349 = local996.aShortArray2[local46];
						@Pc(1354) short local1354 = local996.aShortArray5[local46];
						@Pc(1359) short local1359 = local996.aShortArray6[local46];
						@Pc(1363) int local1363 = arg3[local1349];
						@Pc(1367) int local1367 = arg3[local1354];
						@Pc(1371) int local1371 = arg3[local1359];
						@Pc(1375) int local1375 = arg4[local1349];
						@Pc(1379) int local1379 = arg4[local1354];
						@Pc(1383) int local1383 = arg4[local1359];
						if ((local1363 - local1367) * (local1383 - local1379) - (local1375 - local1379) * (local1371 - local1367) > 0) {
							arg2.aBoolean160 = local1363 < 0 || local1367 < 0 || local1371 < 0 || local1363 > arg2.anInt2451 || local1367 > arg2.anInt2451 || local1371 > arg2.anInt2451;
							@Pc(1427) short local1427 = local996.aShortArray3[local46];
							if (local1427 == -1) {
								@Pc(1482) int local1482 = local996.anIntArray42[local46];
								if (local1482 != -1) {
									arg2.method2055(local1375, local1379, local1383, local1363, local1367, local1371, Static87.method1938(local996.aShortArray7[local1349], local1482), Static87.method1938(local996.aShortArray7[local1354], local1482), Static87.method1938(local996.aShortArray7[local1359], local1482));
								}
							} else {
								if (this.method4004(this.aClass40_Sub1_8.anInterface4_1.method165(local1427).aByte21)) {
									arg2.anInt2447 = 100;
								}
								arg2.method2050(local1375, local1379, local1383, local1363, local1367, local1371, local996.aShortArray7[local1349], local996.aShortArray7[local1354], local996.aShortArray7[local1359], local338, local310, local91, local198, local366, local114, local254, local68, local137, local1427);
								arg2.anInt2447 = 0;
							}
						}
					}
					return;
				}
				for (local209 = 0; local209 < local996.aShort16; local209++) {
					@Pc(1528) short local1528 = local996.aShortArray2[local209];
					@Pc(1533) short local1533 = local996.aShortArray5[local209];
					@Pc(1538) short local1538 = local996.aShortArray6[local209];
					local170 = arg3[local1528];
					local226 = arg3[local1533];
					local282 = arg3[local1538];
					local338 = arg4[local1528];
					local198 = arg4[local1533];
					local254 = arg4[local1538];
					if ((local170 - local226) * (local254 - local198) - (local338 - local198) * (local282 - local226) > 0) {
						local310 = local996.anIntArray42[local209];
						if (local310 != -1) {
							arg2.aBoolean160 = local170 < 0 || local226 < 0 || local282 < 0 || local170 > arg2.anInt2451 || local226 > arg2.anInt2451 || local282 > arg2.anInt2451;
							arg2.method2055(local338, local198, local254, local170, local226, local282, Static87.method1938(local996.aShortArray7[local1528], local310), Static87.method1938(local996.aShortArray7[local1533], local310), Static87.method1938(local996.aShortArray7[local1538], local310));
						}
					}
				}
			}
		} else if ((local6.aByte14 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt4635;
			local24 = local19 + this.anInt4635;
			local29 = arg1 * this.anInt4635;
			local34 = local29 + this.anInt4635;
			@Pc(51) int local51;
			@Pc(148) int local148;
			@Pc(153) int local153;
			if ((local6.aByte14 & 0x1) == 0) {
				local46 = this.anIntArrayArray30[arg0][arg1];
				local51 = this.anIntArrayArray30[arg0 + 1][arg1];
				local148 = this.anIntArrayArray30[arg0 + 1][arg1 + 1];
				local153 = this.anIntArrayArray30[arg0][arg1 + 1];
				local68 = this.anInt4639 + (this.anInt4642 * local19 + this.anInt4641 * local46 + this.anInt4633 * local29 >> 15);
				if (local68 <= this.aClass40_Sub1_8.anInt1421) {
					return;
				}
				local91 = this.anInt4639 + (this.anInt4642 * local24 + this.anInt4641 * local51 + this.anInt4633 * local29 >> 15);
				if (local91 <= this.aClass40_Sub1_8.anInt1421) {
					return;
				}
				local114 = this.anInt4639 + (this.anInt4642 * local24 + this.anInt4641 * local148 + this.anInt4633 * local34 >> 15);
				if (local114 <= this.aClass40_Sub1_8.anInt1421) {
					return;
				}
				local137 = this.anInt4639 + (this.anInt4642 * local19 + this.anInt4641 * local153 + this.anInt4633 * local34 >> 15);
				if (local137 <= this.aClass40_Sub1_8.anInt1421) {
					return;
				}
				local170 = this.anInt4636 + (this.anInt4634 * local19 + this.anInt4632 * local46 + this.anInt4643 * local29 >> 15);
				local181 = arg2.anInt2449 + local170 * this.aClass40_Sub1_8.anInt1439 / local68;
				local198 = this.anInt4637 + (this.anInt4644 * local19 + this.anInt4646 * local46 + this.anInt4640 * local29 >> 15);
				local209 = arg2.anInt2448 + local198 * this.aClass40_Sub1_8.anInt1417 / local68;
				local226 = this.anInt4636 + (this.anInt4634 * local24 + this.anInt4632 * local51 + this.anInt4643 * local29 >> 15);
				local237 = arg2.anInt2449 + local226 * this.aClass40_Sub1_8.anInt1439 / local91;
				local254 = this.anInt4637 + (this.anInt4644 * local24 + this.anInt4646 * local51 + this.anInt4640 * local29 >> 15);
				local265 = arg2.anInt2448 + local254 * this.aClass40_Sub1_8.anInt1417 / local91;
				local282 = this.anInt4636 + (this.anInt4634 * local24 + this.anInt4632 * local148 + this.anInt4643 * local34 >> 15);
				local293 = arg2.anInt2449 + local282 * this.aClass40_Sub1_8.anInt1439 / local114;
				local310 = this.anInt4637 + (this.anInt4644 * local24 + this.anInt4646 * local148 + this.anInt4640 * local34 >> 15);
				local321 = arg2.anInt2448 + local310 * this.aClass40_Sub1_8.anInt1417 / local114;
				local338 = this.anInt4636 + (this.anInt4634 * local19 + this.anInt4632 * local153 + this.anInt4643 * local34 >> 15);
				local349 = arg2.anInt2449 + local338 * this.aClass40_Sub1_8.anInt1439 / local137;
				local366 = this.anInt4637 + (this.anInt4644 * local19 + this.anInt4646 * local153 + this.anInt4640 * local34 >> 15);
				local377 = arg2.anInt2448 + local366 * this.aClass40_Sub1_8.anInt1417 / local137;
			} else {
				local46 = this.anIntArrayArray30[arg0][arg1];
				local51 = this.anInt4641 * local46;
				local68 = this.anInt4639 + (this.anInt4642 * local19 + local51 + this.anInt4633 * local29 >> 15);
				if (local68 <= this.aClass40_Sub1_8.anInt1421) {
					return;
				}
				local91 = this.anInt4639 + (this.anInt4642 * local24 + local51 + this.anInt4633 * local29 >> 15);
				if (local91 <= this.aClass40_Sub1_8.anInt1421) {
					return;
				}
				local114 = this.anInt4639 + (this.anInt4642 * local24 + local51 + this.anInt4633 * local34 >> 15);
				if (local114 <= this.aClass40_Sub1_8.anInt1421) {
					return;
				}
				local137 = this.anInt4639 + (this.anInt4642 * local19 + local51 + this.anInt4633 * local34 >> 15);
				if (local137 <= this.aClass40_Sub1_8.anInt1421) {
					return;
				}
				local148 = this.anInt4632 * local46;
				local153 = this.anInt4646 * local46;
				local170 = this.anInt4636 + (this.anInt4634 * local19 + local148 + this.anInt4643 * local29 >> 15);
				local181 = arg2.anInt2449 + local170 * this.aClass40_Sub1_8.anInt1439 / local68;
				local198 = this.anInt4637 + (this.anInt4644 * local19 + local153 + this.anInt4640 * local29 >> 15);
				local209 = arg2.anInt2448 + local198 * this.aClass40_Sub1_8.anInt1417 / local68;
				local226 = this.anInt4636 + (this.anInt4634 * local24 + local148 + this.anInt4643 * local29 >> 15);
				local237 = arg2.anInt2449 + local226 * this.aClass40_Sub1_8.anInt1439 / local91;
				local254 = this.anInt4637 + (this.anInt4644 * local24 + local153 + this.anInt4640 * local29 >> 15);
				local265 = arg2.anInt2448 + local254 * this.aClass40_Sub1_8.anInt1417 / local91;
				local282 = this.anInt4636 + (this.anInt4634 * local24 + local148 + this.anInt4643 * local34 >> 15);
				local293 = arg2.anInt2449 + local282 * this.aClass40_Sub1_8.anInt1439 / local114;
				local310 = this.anInt4637 + (this.anInt4644 * local24 + local153 + this.anInt4640 * local34 >> 15);
				local321 = arg2.anInt2448 + local310 * this.aClass40_Sub1_8.anInt1417 / local114;
				local338 = this.anInt4636 + (this.anInt4634 * local19 + local148 + this.anInt4643 * local34 >> 15);
				local349 = arg2.anInt2449 + local338 * this.aClass40_Sub1_8.anInt1439 / local137;
				local366 = this.anInt4637 + (this.anInt4644 * local19 + local153 + this.anInt4640 * local34 >> 15);
				local377 = arg2.anInt2448 + local366 * this.aClass40_Sub1_8.anInt1417 / local137;
			}
			if ((local293 - local349) * (local265 - local377) - (local321 - local377) * (local237 - local349) > 0) {
				arg2.aBoolean160 = local293 < 0 || local349 < 0 || local237 < 0 || local293 > arg2.anInt2451 || local349 > arg2.anInt2451 || local237 > arg2.anInt2451;
				if (local6.aShort26 >= 0) {
					if (this.method4004(this.aClass40_Sub1_8.anInterface4_1.method165(local6.aShort26).aByte21)) {
						arg2.anInt2447 = 100;
					}
					arg2.method2050(local321, local377, local265, local293, local349, local237, local6.aShort25 & 0xFFFF, local6.aShort24 & 0xFFFF, local6.aShort23 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort26);
					arg2.anInt2447 = 0;
				} else {
					arg2.method2055(local321, local377, local265, local293, local349, local237, local6.aShort25 & 0xFFFF, local6.aShort24 & 0xFFFF, local6.aShort23 & 0xFFFF);
				}
			}
			if ((local181 - local237) * (local377 - local265) - (local209 - local265) * (local349 - local237) > 0) {
				arg2.aBoolean160 = local181 < 0 || local237 < 0 || local349 < 0 || local181 > arg2.anInt2451 || local237 > arg2.anInt2451 || local349 > arg2.anInt2451;
				if (local6.aShort26 >= 0) {
					if (this.method4004(this.aClass40_Sub1_8.anInterface4_1.method165(local6.aShort26).aByte21)) {
						arg2.anInt2447 = 100;
					}
					arg2.method2050(local209, local265, local377, local181, local237, local349, local6.aShort22 & 0xFFFF, local6.aShort23 & 0xFFFF, local6.aShort24 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort26);
					arg2.anInt2447 = 0;
					return;
				}
				arg2.method2055(local209, local265, local377, local181, local237, local349, local6.aShort22 & 0xFFFF, local6.aShort23 & 0xFFFF, local6.aShort24 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!oc;IIIIZ)V")
	@Override
	public void method3983(@OriginalArg(0) Class1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILclient!oc;)Lclient!oc;")
	@Override
	public Class1_Sub1_Sub6 method4002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub6 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "()V")
	@Override
	public void method3987() {
		this.aByteArrayArray43 = null;
		this.aByteArrayArray42 = null;
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(II)V")
	@Override
	public void method4001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class134 local4 = this.aClass40_Sub1_8.method1228(Thread.currentThread());
		local4.aClass74_1.anInt2447 = 0;
		if (this.aClass112ArrayArray1 != null) {
			this.method4005(arg0, arg1, this.aClass40_Sub1_8.aBoolean92, local4.aClass74_1, local4.anIntArray322, local4.anIntArray334, local4.anIntArray340);
		} else if (this.aClass41ArrayArray1 != null) {
			this.method4003(arg0, arg1, local4.aClass74_1, local4.anIntArray322, local4.anIntArray334, local4.anIntArray340);
		}
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(Lclient!oc;IIIIZ)V")
	@Override
	public void method3995(@OriginalArg(0) Class1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)Z")
	private boolean method4004(@OriginalArg(0) int arg0) {
		if ((this.anInt4638 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else {
			return arg0 == 8;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIZLclient!gi;[I[I[I)V")
	private void method4005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class74 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class112 local6 = this.aClass112ArrayArray1[arg0][arg1];
		@Pc(29) int local29;
		@Pc(255) int local255;
		@Pc(311) int local311;
		@Pc(367) int local367;
		@Pc(423) int local423;
		@Pc(283) int local283;
		@Pc(339) int local339;
		@Pc(395) int local395;
		@Pc(451) int local451;
		@Pc(244) int local244;
		@Pc(300) int local300;
		@Pc(356) int local356;
		@Pc(412) int local412;
		@Pc(272) int local272;
		@Pc(328) int local328;
		@Pc(384) int local384;
		@Pc(440) int local440;
		@Pc(78) int local78;
		@Pc(101) int local101;
		@Pc(124) int local124;
		@Pc(147) int local147;
		@Pc(36) int local36;
		@Pc(38) int local38;
		@Pc(40) int local40;
		@Pc(42) int local42;
		@Pc(163) int local163;
		@Pc(56) int local56;
		@Pc(61) int local61;
		@Pc(222) int local222;
		@Pc(227) int local227;
		@Pc(620) int local620;
		if (local6 == null) {
			@Pc(1450) Class110 local1450 = this.aClass110ArrayArray1[arg0][arg1];
			if (local1450 != null) {
				for (local423 = 0; local423 < local1450.aShort56; local423++) {
					@Pc(1460) short local1460 = local1450.aShortArray60[local423];
					local29 = local1450.aShortArray57[local423];
					@Pc(1470) short local1470 = local1450.aShortArray56[local423];
					local367 = this.anInt4639 + (this.anInt4642 * local1460 + this.anInt4641 * local29 + this.anInt4633 * local1470 >> 15);
					if (local367 <= this.aClass40_Sub1_8.anInt1421) {
						return;
					}
					arg6[local423] = 0;
					if (arg2) {
						local283 = local367 - this.aClass40_Sub1_8.anInt1424;
						if (local283 > 255) {
							local283 = 255;
						}
						if (local283 > 0) {
							arg6[local423] = local283;
							local339 = local1450.aShortArray55[local423] * local283 / 255;
							if (local339 > 0) {
								local29 -= local339;
							}
						}
					} else if (this.aClass40_Sub1_8.aBoolean91) {
						local283 = local367 - this.aClass40_Sub1_8.anInt1424;
						if (local283 > 0) {
							arg6[local423] = local283;
							if (arg6[local423] > 255) {
								arg6[local423] = 255;
							}
						}
					}
					local255 = this.anInt4636 + (this.anInt4634 * local1460 + this.anInt4632 * local29 + this.anInt4643 * local1470 >> 15);
					local311 = this.anInt4637 + (this.anInt4644 * local1460 + this.anInt4646 * local29 + this.anInt4640 * local1470 >> 15);
					arg4[local423] = arg3.anInt2449 + local255 * this.aClass40_Sub1_8.anInt1439 / local367;
					arg5[local423] = arg3.anInt2448 + local311 * this.aClass40_Sub1_8.anInt1417 / local367;
				}
				if (local1450.aShortArray58 != null) {
					local283 = this.anIntArrayArray30[arg0][arg1];
					local339 = this.anIntArrayArray30[arg0 + 1][arg1];
					local395 = this.anIntArrayArray30[arg0][arg1 + 1];
					local451 = arg0 * this.anInt4635;
					local244 = local451 + this.anInt4635;
					local300 = arg1 * this.anInt4635;
					local356 = local300 + this.anInt4635;
					local412 = this.anInt4636 + (this.anInt4634 * local451 + this.anInt4632 * local283 + this.anInt4643 * local300 >> 15);
					local272 = this.anInt4637 + (this.anInt4644 * local451 + this.anInt4646 * local283 + this.anInt4640 * local300 >> 15);
					local328 = this.anInt4639 + (this.anInt4642 * local451 + this.anInt4641 * local283 + this.anInt4633 * local300 >> 15);
					local384 = this.anInt4636 + (this.anInt4634 * local244 + this.anInt4632 * local339 + this.anInt4643 * local300 >> 15);
					local440 = this.anInt4637 + (this.anInt4644 * local244 + this.anInt4646 * local339 + this.anInt4640 * local300 >> 15);
					local78 = this.anInt4639 + (this.anInt4642 * local244 + this.anInt4641 * local339 + this.anInt4633 * local300 >> 15);
					local101 = this.anInt4636 + (this.anInt4634 * local451 + this.anInt4632 * local395 + this.anInt4643 * local356 >> 15);
					local124 = this.anInt4637 + (this.anInt4644 * local451 + this.anInt4646 * local395 + this.anInt4640 * local356 >> 15);
					local147 = this.anInt4639 + (this.anInt4642 * local451 + this.anInt4641 * local395 + this.anInt4633 * local356 >> 15);
					for (local36 = 0; local36 < local1450.aShort57; local36++) {
						local38 = local36 * 3;
						local40 = local38 + 1;
						local42 = local40 + 1;
						local163 = arg4[local38];
						local56 = arg4[local40];
						local61 = arg4[local42];
						local222 = arg5[local38];
						local227 = arg5[local40];
						local620 = arg5[local42];
						@Pc(1910) int local1910 = arg6[local38] + arg6[local40] + arg6[local42];
						if ((local163 - local56) * (local620 - local227) - (local222 - local227) * (local61 - local56) > 0) {
							arg3.aBoolean160 = local163 < 0 || local56 < 0 || local61 < 0 || local163 > arg3.anInt2451 || local56 > arg3.anInt2451 || local61 > arg3.anInt2451;
							@Pc(1954) short local1954 = local1450.aShortArray58[local36];
							if (local1910 < 765) {
								if (local1954 != -1 && this.method4004(this.aClass40_Sub1_8.anInterface4_1.method165(local1954).aByte21)) {
									arg3.anInt2447 = 100;
								}
								if (local1910 > 0) {
									if (local1954 != -1) {
										arg3.method2047(local222, local227, local620, local163, local56, local61, this.aClass40_Sub1_8.anInt1422, arg6[local38], arg6[local40], arg6[local42], local1450.anIntArray273[local38], local1450.anIntArray273[local40], local1450.anIntArray273[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
									} else if ((local1450.anIntArray273[local38] & 0xFFFFFF) != 0) {
										arg3.method2056(local222, local227, local620, local163, local56, local61, Static340.method6026(local1450.anIntArray273[local38], arg6[local38] << 24 | this.aClass40_Sub1_8.anInt1422), Static340.method6026(local1450.anIntArray273[local40], arg6[local40] << 24 | this.aClass40_Sub1_8.anInt1422), Static340.method6026(local1450.anIntArray273[local42], arg6[local42] << 24 | this.aClass40_Sub1_8.anInt1422));
									}
								} else if (local1954 != -1) {
									arg3.method2050(local222, local227, local620, local163, local56, local61, local1450.anIntArray273[local38], local1450.anIntArray273[local40], local1450.anIntArray273[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
								} else if ((local1450.anIntArray273[local38] & 0xFFFFFF) != 0) {
									arg3.method2056(local222, local227, local620, local163, local56, local61, local1450.anIntArray273[local38], local1450.anIntArray273[local40], local1450.anIntArray273[local42]);
								}
								arg3.anInt2447 = 0;
							} else {
								arg3.method2049(local222, local227, local620, local163, local56, local61, this.aClass40_Sub1_8.anInt1422);
							}
						}
					}
					return;
				}
				for (local283 = 0; local283 < local1450.aShort57; local283++) {
					local339 = local283 * 3;
					local395 = local339 + 1;
					local451 = local395 + 1;
					local244 = arg4[local339];
					local300 = arg4[local395];
					local356 = arg4[local451];
					local412 = arg5[local339];
					local272 = arg5[local395];
					local328 = arg5[local451];
					local384 = arg6[local339] + arg6[local395] + arg6[local451];
					if ((local244 - local300) * (local328 - local272) - (local412 - local272) * (local356 - local300) > 0) {
						arg3.aBoolean160 = local244 < 0 || local300 < 0 || local356 < 0 || local244 > arg3.anInt2451 || local300 > arg3.anInt2451 || local356 > arg3.anInt2451;
						if (local384 >= 765) {
							arg3.method2049(local412, local272, local328, local244, local300, local356, this.aClass40_Sub1_8.anInt1422);
						} else if (local384 > 0) {
							if ((local1450.anIntArray273[local339] & 0xFFFFFF) != 0) {
								arg3.method2056(local412, local272, local328, local244, local300, local356, Static99.method2072(arg6[local339], local1450.anIntArray273[local339], this.aClass40_Sub1_8.anInt1422), Static99.method2072(arg6[local395], local1450.anIntArray273[local395], this.aClass40_Sub1_8.anInt1422), Static99.method2072(arg6[local451], local1450.anIntArray273[local451], this.aClass40_Sub1_8.anInt1422));
							}
						} else if ((local1450.anIntArray273[local339] & 0xFFFFFF) != 0) {
							arg3.method2056(local412, local272, local328, local244, local300, local356, local1450.anIntArray273[local339], local1450.anIntArray273[local395], local1450.anIntArray273[local451]);
						}
					}
				}
			}
		} else if ((local6.aByte37 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt4635;
			@Pc(24) int local24 = local19 + this.anInt4635;
			local29 = arg1 * this.anInt4635;
			@Pc(34) int local34 = local29 + this.anInt4635;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte37 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray30[arg0][arg1];
				local61 = this.anIntArrayArray30[arg0 + 1][arg1];
				local222 = this.anIntArrayArray30[arg0 + 1][arg1 + 1];
				local227 = this.anIntArrayArray30[arg0][arg1 + 1];
				local78 = this.anInt4639 + (this.anInt4642 * local19 + this.anInt4641 * local56 + this.anInt4633 * local29 >> 15);
				if (local78 <= this.aClass40_Sub1_8.anInt1421) {
					return;
				}
				local101 = this.anInt4639 + (this.anInt4642 * local24 + this.anInt4641 * local61 + this.anInt4633 * local29 >> 15);
				if (local101 <= this.aClass40_Sub1_8.anInt1421) {
					return;
				}
				local124 = this.anInt4639 + (this.anInt4642 * local24 + this.anInt4641 * local222 + this.anInt4633 * local34 >> 15);
				if (local124 <= this.aClass40_Sub1_8.anInt1421) {
					return;
				}
				local147 = this.anInt4639 + (this.anInt4642 * local19 + this.anInt4641 * local227 + this.anInt4633 * local34 >> 15);
				if (local147 <= this.aClass40_Sub1_8.anInt1421) {
					return;
				}
				if (arg2) {
					local163 = local78 - this.aClass40_Sub1_8.anInt1424;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local36 = local163;
						local620 = this.anIntArrayArray31[arg0][arg1] * local163 / 255;
						if (local620 > 0) {
							local56 -= local620;
						}
					}
					local163 = local101 - this.aClass40_Sub1_8.anInt1424;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local38 = local163;
						local620 = this.anIntArrayArray31[arg0 + 1][arg1] * local163 / 255;
						if (local620 > 0) {
							local61 -= local620;
						}
					}
					local163 = local124 - this.aClass40_Sub1_8.anInt1424;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local40 = local163;
						local620 = this.anIntArrayArray31[arg0 + 1][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local222 -= local620;
						}
					}
					local163 = local147 - this.aClass40_Sub1_8.anInt1424;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local42 = local163;
						local620 = this.anIntArrayArray31[arg0][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local227 -= local620;
						}
					}
				} else if (this.aClass40_Sub1_8.aBoolean91) {
					local163 = local78 - this.aClass40_Sub1_8.anInt1424;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass40_Sub1_8.anInt1424;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass40_Sub1_8.anInt1424;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass40_Sub1_8.anInt1424;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local244 = this.anInt4636 + (this.anInt4634 * local19 + this.anInt4632 * local56 + this.anInt4643 * local29 >> 15);
				local255 = arg3.anInt2449 + local244 * this.aClass40_Sub1_8.anInt1439 / local78;
				local272 = this.anInt4637 + (this.anInt4644 * local19 + this.anInt4646 * local56 + this.anInt4640 * local29 >> 15);
				local283 = arg3.anInt2448 + local272 * this.aClass40_Sub1_8.anInt1417 / local78;
				local300 = this.anInt4636 + (this.anInt4634 * local24 + this.anInt4632 * local61 + this.anInt4643 * local29 >> 15);
				local311 = arg3.anInt2449 + local300 * this.aClass40_Sub1_8.anInt1439 / local101;
				local328 = this.anInt4637 + (this.anInt4644 * local24 + this.anInt4646 * local61 + this.anInt4640 * local29 >> 15);
				local339 = arg3.anInt2448 + local328 * this.aClass40_Sub1_8.anInt1417 / local101;
				local356 = this.anInt4636 + (this.anInt4634 * local24 + this.anInt4632 * local222 + this.anInt4643 * local34 >> 15);
				local367 = arg3.anInt2449 + local356 * this.aClass40_Sub1_8.anInt1439 / local124;
				local384 = this.anInt4637 + (this.anInt4644 * local24 + this.anInt4646 * local222 + this.anInt4640 * local34 >> 15);
				local395 = arg3.anInt2448 + local384 * this.aClass40_Sub1_8.anInt1417 / local124;
				local412 = this.anInt4636 + (this.anInt4634 * local19 + this.anInt4632 * local227 + this.anInt4643 * local34 >> 15);
				local423 = arg3.anInt2449 + local412 * this.aClass40_Sub1_8.anInt1439 / local147;
				local440 = this.anInt4637 + (this.anInt4644 * local19 + this.anInt4646 * local227 + this.anInt4640 * local34 >> 15);
				local451 = arg3.anInt2448 + local440 * this.aClass40_Sub1_8.anInt1417 / local147;
			} else {
				local56 = this.anIntArrayArray30[arg0][arg1];
				local61 = this.anInt4641 * local56;
				local78 = this.anInt4639 + (this.anInt4642 * local19 + local61 + this.anInt4633 * local29 >> 15);
				if (local78 <= this.aClass40_Sub1_8.anInt1421) {
					return;
				}
				local101 = this.anInt4639 + (this.anInt4642 * local24 + local61 + this.anInt4633 * local29 >> 15);
				if (local101 <= this.aClass40_Sub1_8.anInt1421) {
					return;
				}
				local124 = this.anInt4639 + (this.anInt4642 * local24 + local61 + this.anInt4633 * local34 >> 15);
				if (local124 <= this.aClass40_Sub1_8.anInt1421) {
					return;
				}
				local147 = this.anInt4639 + (this.anInt4642 * local19 + local61 + this.anInt4633 * local34 >> 15);
				if (local147 <= this.aClass40_Sub1_8.anInt1421) {
					return;
				}
				if (this.aClass40_Sub1_8.aBoolean91) {
					local163 = local78 - this.aClass40_Sub1_8.anInt1424;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass40_Sub1_8.anInt1424;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass40_Sub1_8.anInt1424;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass40_Sub1_8.anInt1424;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local222 = this.anInt4632 * local56;
				local227 = this.anInt4646 * local56;
				local244 = this.anInt4636 + (this.anInt4634 * local19 + local222 + this.anInt4643 * local29 >> 15);
				local255 = arg3.anInt2449 + local244 * this.aClass40_Sub1_8.anInt1439 / local78;
				local272 = this.anInt4637 + (this.anInt4644 * local19 + local227 + this.anInt4640 * local29 >> 15);
				local283 = arg3.anInt2448 + local272 * this.aClass40_Sub1_8.anInt1417 / local78;
				local300 = this.anInt4636 + (this.anInt4634 * local24 + local222 + this.anInt4643 * local29 >> 15);
				local311 = arg3.anInt2449 + local300 * this.aClass40_Sub1_8.anInt1439 / local101;
				local328 = this.anInt4637 + (this.anInt4644 * local24 + local227 + this.anInt4640 * local29 >> 15);
				local339 = arg3.anInt2448 + local328 * this.aClass40_Sub1_8.anInt1417 / local101;
				local356 = this.anInt4636 + (this.anInt4634 * local24 + local222 + this.anInt4643 * local34 >> 15);
				local367 = arg3.anInt2449 + local356 * this.aClass40_Sub1_8.anInt1439 / local124;
				local384 = this.anInt4637 + (this.anInt4644 * local24 + local227 + this.anInt4640 * local34 >> 15);
				local395 = arg3.anInt2448 + local384 * this.aClass40_Sub1_8.anInt1417 / local124;
				local412 = this.anInt4636 + (this.anInt4634 * local19 + local222 + this.anInt4643 * local34 >> 15);
				local423 = arg3.anInt2449 + local412 * this.aClass40_Sub1_8.anInt1439 / local147;
				local440 = this.anInt4637 + (this.anInt4644 * local19 + local227 + this.anInt4640 * local34 >> 15);
				local451 = arg3.anInt2448 + local440 * this.aClass40_Sub1_8.anInt1417 / local147;
			}
			@Pc(1062) boolean local1062 = local6.aShort58 != -1 && this.method4004(this.aClass40_Sub1_8.anInterface4_1.method165(local6.aShort58).aByte21);
			local61 = local38 + local40 + local42;
			if ((local367 - local423) * (local339 - local451) - (local395 - local451) * (local311 - local423) > 0) {
				arg3.aBoolean160 = local367 < 0 || local423 < 0 || local311 < 0 || local367 > arg3.anInt2451 || local423 > arg3.anInt2451 || local311 > arg3.anInt2451;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt2447 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort58 >= 0) {
							arg3.method2047(local395, local451, local339, local367, local423, local311, this.aClass40_Sub1_8.anInt1422, local40, local42, local38, local6.anInt3936, local6.anInt3937, local6.anInt3935, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort58);
						} else {
							arg3.method2056(local395, local451, local339, local367, local423, local311, Static340.method6026(local6.anInt3936, local40 << 24 | this.aClass40_Sub1_8.anInt1422), Static340.method6026(local6.anInt3937, local42 << 24 | this.aClass40_Sub1_8.anInt1422), Static340.method6026(local6.anInt3935, local38 << 24 | this.aClass40_Sub1_8.anInt1422));
						}
					} else if (local6.aShort58 >= 0) {
						arg3.method2050(local395, local451, local339, local367, local423, local311, local6.anInt3936, local6.anInt3937, local6.anInt3935, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort58);
					} else {
						arg3.method2056(local395, local451, local339, local367, local423, local311, local6.anInt3936, local6.anInt3937, local6.anInt3935);
					}
					arg3.anInt2447 = 0;
				} else {
					arg3.method2049(local395, local451, local339, local367, local423, local311, this.aClass40_Sub1_8.anInt1422);
				}
			}
			local61 = local36 + local38 + local42;
			if ((local255 - local311) * (local451 - local339) - (local283 - local339) * (local423 - local311) > 0) {
				arg3.aBoolean160 = local255 < 0 || local311 < 0 || local423 < 0 || local255 > arg3.anInt2451 || local311 > arg3.anInt2451 || local423 > arg3.anInt2451;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt2447 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort58 >= 0) {
							arg3.method2047(local283, local339, local451, local255, local311, local423, this.aClass40_Sub1_8.anInt1422, local36, local38, local42, local6.anInt3938, local6.anInt3935, local6.anInt3937, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort58);
						} else {
							arg3.method2056(local283, local339, local451, local255, local311, local423, Static340.method6026(local6.anInt3938, local36 << 24 | this.aClass40_Sub1_8.anInt1422), Static340.method6026(local6.anInt3935, local38 << 24 | this.aClass40_Sub1_8.anInt1422), Static340.method6026(local6.anInt3937, local42 << 24 | this.aClass40_Sub1_8.anInt1422));
						}
					} else if (local6.aShort58 >= 0) {
						arg3.method2050(local283, local339, local451, local255, local311, local423, local6.anInt3938, local6.anInt3935, local6.anInt3937, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort58);
					} else {
						arg3.method2056(local283, local339, local451, local255, local311, local423, local6.anInt3938, local6.anInt3935, local6.anInt3937);
					}
					arg3.anInt2447 = 0;
					return;
				}
				arg3.method2049(local283, local339, local451, local255, local311, local423, this.aClass40_Sub1_8.anInt1422);
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method3985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class11_Sub2 local3 = this.aClass40_Sub1_8.aClass11_Sub2_1;
		this.anInt4634 = local3.anInt6492;
		this.anInt4632 = local3.anInt6490;
		this.anInt4643 = local3.anInt6493;
		this.anInt4636 = local3.anInt6501;
		this.anInt4644 = local3.anInt6500;
		this.anInt4646 = local3.anInt6491;
		this.anInt4640 = local3.anInt6497;
		this.anInt4637 = local3.anInt6499;
		this.anInt4642 = local3.anInt6498;
		this.anInt4641 = local3.anInt6496;
		this.anInt4633 = local3.anInt6495;
		this.anInt4639 = local3.anInt6494;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V")
	@Override
	public void method3989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray42[arg0][arg1] < arg2) {
			this.aByteArrayArray42[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method3997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		if (this.aClass41ArrayArray1 == null) {
			this.aClass41ArrayArray1 = new Class41[super.anInt4630][super.anInt4625];
			this.aClass16ArrayArray1 = new Class16[super.anInt4630][super.anInt4625];
		} else if (this.aClass112ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(26) boolean local26 = false;
		@Pc(64) int local64;
		@Pc(70) int local70;
		if (arg8.length == 2 && arg5.length == 2 && (arg8[0] == arg8[1] || arg10[0] != -1 && arg10[0] == arg10[1])) {
			local26 = true;
			for (@Pc(57) int local57 = 1; local57 < 2; local57++) {
				local64 = arg2[arg5[local57]];
				local70 = arg4[arg5[local57]];
				if (local64 != 0 && local64 != this.anInt4635 || local70 != 0 && local70 != this.anInt4635) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class16 local95 = new Class16();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg8.length;
			local95.aShort15 = local99;
			local95.aShortArray7 = new short[local99];
			local95.anIntArray41 = new int[local99];
			local95.anIntArray44 = new int[local99];
			local95.anIntArray43 = new int[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray7[local124] = (short) (this.aByteArrayArray43[arg0][arg1] - this.aByteArrayArray42[arg0][arg1]);
				} else if (local129 == 0 && local133 == this.anInt4635) {
					local95.aShortArray7[local124] = (short) (this.aByteArrayArray43[arg0][arg1 + 1] - this.aByteArrayArray42[arg0][arg1 + 1]);
				} else if (local129 == this.anInt4635 && local133 == this.anInt4635) {
					local95.aShortArray7[local124] = (short) (this.aByteArrayArray43[arg0 + 1][arg1 + 1] - this.aByteArrayArray42[arg0 + 1][arg1 + 1]);
				} else if (local129 == this.anInt4635 && local133 == 0) {
					local95.aShortArray7[local124] = (short) (this.aByteArrayArray43[arg0 + 1][arg1] - this.aByteArrayArray42[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray43[arg0][arg1] - this.aByteArrayArray42[arg0][arg1]) * (this.anInt4635 - local129) + (this.aByteArrayArray43[arg0 + 1][arg1] - this.aByteArrayArray42[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray43[arg0][arg1 + 1] - this.aByteArrayArray42[arg0][arg1 + 1]) * (this.anInt4635 - local129) + (this.aByteArrayArray43[arg0 + 1][arg1 + 1] - this.aByteArrayArray42[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray7[local124] = (short) (local288 * (this.anInt4635 - local133) + local335 * local133 >> this.anInt4645 * 2);
				}
				local288 = (arg0 << this.anInt4645) + local129;
				local335 = (arg1 << this.anInt4645) + local133;
				local95.anIntArray41[local124] = local288;
				local95.anIntArray43[local124] = local335;
				local95.anIntArray44[local124] = this.method3994(local288, local335) + (arg3 == null ? 0 : arg3[local124]);
				if (local95.aShortArray7[local124] < 2) {
					local95.aShortArray7[local124] = 2;
				}
			}
			@Pc(412) boolean local412 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg8[local288] >= 0 || arg9 != null && arg9[local288] >= 0) {
					local133++;
				}
				if (arg10[local288] != -1 && !this.aClass40_Sub1_8.anInterface4_1.method165(arg10[local288]).aBoolean108) {
					local412 = true;
				}
			}
			local95.anIntArray42 = new int[local133];
			if (arg9 != null) {
				local95.anIntArray40 = new int[local133];
			}
			local95.aShortArray2 = new short[local133];
			local95.aShortArray5 = new short[local133];
			local95.aShortArray6 = new short[local133];
			if (local412) {
				local95.aShortArray3 = new short[local133];
				local95.aShortArray4 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg8[local335] >= 0 || arg9 != null && arg9[local335] >= 0) {
					if (arg8[local335] >= 0) {
						local95.anIntArray42[local95.aShort16] = Static192.method3828(arg8[local335]);
					} else {
						local95.anIntArray42[local95.aShort16] = -1;
					}
					if (arg9 != null) {
						if (arg9[local335] == -1) {
							local95.anIntArray40[local95.aShort16] = -1;
						} else {
							local95.anIntArray40[local95.aShort16] = Static192.method3828(arg9[local335]);
						}
					}
					local95.aShortArray2[local95.aShort16] = (short) arg5[local335];
					local95.aShortArray5[local95.aShort16] = (short) arg6[local335];
					local95.aShortArray6[local95.aShort16] = (short) arg7[local335];
					if (local412) {
						if (arg10[local335] == -1 || this.aClass40_Sub1_8.anInterface4_1.method165(arg10[local335]).aBoolean108) {
							local95.aShortArray3[local95.aShort16] = -1;
						} else {
							local95.aShortArray3[local95.aShort16] = (short) arg10[local335];
							local95.aShortArray4[local95.aShort16] = (short) arg11[local335];
						}
					}
					local95.aShort16++;
				}
			}
			this.aClass16ArrayArray1[arg0][arg1] = local95;
		} else if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
			@Pc(641) Class41 local641 = new Class41();
			local64 = arg8[0];
			local70 = arg10[0];
			if (arg9 != null) {
				local641.anInt1441 = Static87.method1938(this.aByteArrayArray43[arg0][arg1] - this.aByteArrayArray42[arg0][arg1], Static192.method3828(arg9[0]));
				if (local64 == -1) {
					local641.aByte14 = (byte) (local641.aByte14 | 0x2);
				}
			}
			if (this.anIntArrayArray30[arg0][arg1] == this.anIntArrayArray30[arg0 + 1][arg1] && this.anIntArrayArray30[arg0][arg1] == this.anIntArrayArray30[arg0 + 1][arg1 + 1] && this.anIntArrayArray30[arg0][arg1] == this.anIntArrayArray30[arg0][arg1 + 1]) {
				local641.aByte14 = (byte) (local641.aByte14 | 0x1);
			}
			if (local70 == -1 || (local641.aByte14 & 0x2) != 0 || this.aClass40_Sub1_8.anInterface4_1.method165(local70).aBoolean108) {
				@Pc(842) short local842 = Static192.method3828(local64);
				local641.aShort22 = (short) Static87.method1938(this.aByteArrayArray43[arg0][arg1] - this.aByteArrayArray42[arg0][arg1], local842);
				local641.aShort23 = (short) Static87.method1938(this.aByteArrayArray43[arg0 + 1][arg1] - this.aByteArrayArray42[arg0 + 1][arg1], local842);
				local641.aShort25 = (short) Static87.method1938(this.aByteArrayArray43[arg0 + 1][arg1 + 1] - this.aByteArrayArray42[arg0 + 1][arg1 + 1], local842);
				local641.aShort24 = (short) Static87.method1938(this.aByteArrayArray43[arg0][arg1 + 1] - this.aByteArrayArray42[arg0][arg1 + 1], local842);
				local641.aShort26 = -1;
			} else {
				local641.aShort22 = (short) (this.aByteArrayArray43[arg0][arg1] - this.aByteArrayArray42[arg0][arg1]);
				local641.aShort23 = (short) (this.aByteArrayArray43[arg0 + 1][arg1] - this.aByteArrayArray42[arg0 + 1][arg1]);
				local641.aShort25 = (short) (this.aByteArrayArray43[arg0 + 1][arg1 + 1] - this.aByteArrayArray42[arg0 + 1][arg1 + 1]);
				local641.aShort24 = (short) (this.aByteArrayArray43[arg0][arg1 + 1] - this.aByteArrayArray42[arg0][arg1 + 1]);
				local641.aShort26 = (short) local70;
			}
			this.aClass41ArrayArray1[arg0][arg1] = local641;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIII[[ZLclient!gi;[I[I)V")
	private void method4007(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class74 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean161 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass41ArrayArray1[local22][local25] != null) {
						@Pc(50) Class41 local50 = this.aClass41ArrayArray1[local22][local25];
						if (local50.aShort26 != -1 && (local50.aByte14 & 0x2) == 0 && local50.anInt1441 == -1) {
							local69 = this.aClass40_Sub1_8.method1232(local50.aShort26);
							arg5.method2055(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static87.method1938(local50.aShort25 & 0xFFFF, local69), Static87.method1938(local50.aShort24 & 0xFFFF, local69), Static87.method1938(local50.aShort23 & 0xFFFF, local69));
							arg5.method2055(local20, local20, local20 - 4, local16, local16 + 4, local16, Static87.method1938(local50.aShort22 & 0xFFFF, local69), Static87.method1938(local50.aShort23 & 0xFFFF, local69), Static87.method1938(local50.aShort24 & 0xFFFF, local69));
						} else if (local50.anInt1441 == -1) {
							arg5.method2055(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort25 & 0xFFFF, local50.aShort24 & 0xFFFF, local50.aShort23 & 0xFFFF);
							arg5.method2055(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort22 & 0xFFFF, local50.aShort23 & 0xFFFF, local50.aShort24 & 0xFFFF);
						} else {
							local69 = local50.anInt1441;
							arg5.method2055(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method2055(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass16ArrayArray1[local22][local25] != null) {
						@Pc(249) Class16 local249 = this.aClass16ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort15; local69++) {
							arg6[local69] = local16 + (local249.anIntArray41[local69] - local22 * this.anInt4635) * 4 / this.anInt4635;
							arg7[local69] = local20 - (local249.anIntArray43[local69] - local25 * this.anInt4635) * 4 / this.anInt4635;
						}
						for (@Pc(297) int local297 = 0; local297 < local249.aShort16; local297++) {
							@Pc(303) short local303 = local249.aShortArray2[local297];
							@Pc(308) short local308 = local249.aShortArray5[local297];
							@Pc(313) short local313 = local249.aShortArray6[local297];
							@Pc(317) int local317 = arg6[local303];
							@Pc(321) int local321 = arg6[local308];
							@Pc(325) int local325 = arg6[local313];
							@Pc(329) int local329 = arg7[local303];
							@Pc(333) int local333 = arg7[local308];
							@Pc(337) int local337 = arg7[local313];
							@Pc(351) int local351;
							if (local249.anIntArray40 != null && local249.anIntArray40[local297] != -1) {
								local351 = local249.anIntArray40[local297];
								arg5.method2055(local329, local333, local337, local317, local321, local325, Static87.method1938(local249.aShortArray7[local303], local351), Static87.method1938(local249.aShortArray7[local308], local351), Static87.method1938(local249.aShortArray7[local313], local351));
							} else if (local249.aShortArray3 == null || local249.aShortArray3[local297] == -1) {
								local351 = local249.anIntArray42[local297];
								arg5.method2055(local329, local333, local337, local317, local321, local325, Static87.method1938(local249.aShortArray7[local303], local351), Static87.method1938(local249.aShortArray7[local308], local351), Static87.method1938(local249.aShortArray7[local313], local351));
							} else {
								local351 = this.aClass40_Sub1_8.method1232(local249.aShortArray3[local297]);
								arg5.method2055(local329, local333, local337, local317, local321, local325, Static87.method1938(local249.aShortArray7[local303], local351), Static87.method1938(local249.aShortArray7[local308], local351), Static87.method1938(local249.aShortArray7[local313], local351));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean161 = true;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!fe;[I)V")
	@Override
	public void method3993(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(IIIIIII[[ZLclient!gi;[I[I)V")
	private void method4008(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class74 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean161 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass112ArrayArray1[local22][local25] != null) {
						@Pc(50) Class112 local50 = this.aClass112ArrayArray1[local22][local25];
						if (local50.aShort58 != -1 && (local50.aByte37 & 0x2) == 0 && local50.anInt3934 == 0) {
							local68 = this.aClass40_Sub1_8.method1232(local50.aShort58);
							arg5.method2055(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static87.method1938(local50.anInt3936, local68), Static87.method1938(local50.anInt3937, local68), Static87.method1938(local50.anInt3935, local68));
							arg5.method2055(local20, local20, local20 - 4, local16, local16 + 4, local16, Static87.method1938(local50.anInt3938, local68), Static87.method1938(local50.anInt3935, local68), Static87.method1938(local50.anInt3937, local68));
						} else if (local50.anInt3934 == 0) {
							arg5.method2056(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt3936, local50.anInt3937, local50.anInt3935);
							arg5.method2056(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt3938, local50.anInt3935, local50.anInt3937);
						} else {
							local68 = local50.anInt3934;
							arg5.method2056(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static340.method6026(local68, local50.anInt3936 & 0xFF000000), Static340.method6026(local68, local50.anInt3937 & 0xFF000000), Static340.method6026(local68, local50.anInt3935 & 0xFF000000));
							arg5.method2056(local20, local20, local20 - 4, local16, local16 + 4, local16, Static340.method6026(local68, local50.anInt3938 & 0xFF000000), Static340.method6026(local68, local50.anInt3935 & 0xFF000000), Static340.method6026(local68, local50.anInt3937 & 0xFF000000));
						}
					} else if (this.aClass110ArrayArray1[local22][local25] != null) {
						@Pc(259) Class110 local259 = this.aClass110ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort56; local68++) {
							arg6[local68] = local16 + (local259.aShortArray60[local68] - local22 * this.anInt4635) * 4 / this.anInt4635;
							arg7[local68] = local20 - (local259.aShortArray56[local68] - local25 * this.anInt4635) * 4 / this.anInt4635;
						}
						for (@Pc(307) int local307 = 0; local307 < local259.aShort57; local307++) {
							@Pc(312) int local312 = local307 * 3;
							@Pc(316) int local316 = local312 + 1;
							@Pc(320) int local320 = local316 + 1;
							@Pc(324) int local324 = arg6[local312];
							@Pc(328) int local328 = arg6[local316];
							@Pc(332) int local332 = arg6[local320];
							@Pc(336) int local336 = arg7[local312];
							@Pc(340) int local340 = arg7[local316];
							@Pc(344) int local344 = arg7[local320];
							@Pc(369) int local369;
							if (local259.anIntArray274 != null && local259.anIntArray274[local307] != 0 && (local259.aShortArray58 == null || local259.aShortArray58 != null && local259.aShortArray58[local307] == -1)) {
								local369 = local259.anIntArray274[local307];
								arg5.method2056(local336, local340, local344, local324, local328, local332, Static340.method6026(local369, -(local259.anIntArray273[local312] & -16777216) - 16777216), Static340.method6026(local369, -(local259.anIntArray273[local316] & -16777216) - 16777216), Static340.method6026(local369, -(local259.anIntArray273[local320] & -16777216) - 16777216));
							} else if (local259.aShortArray58 == null || local259.aShortArray58[local307] == -1) {
								arg5.method2056(local336, local340, local344, local324, local328, local332, local259.anIntArray273[local312], local259.anIntArray273[local316], local259.anIntArray273[local320]);
							} else {
								local369 = this.aClass40_Sub1_8.method1232(local259.aShortArray58[local307]);
								arg5.method2055(local336, local340, local344, local324, local328, local332, local369, local369, local369);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean161 = true;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)I")
	@Override
	public int method3994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt4645;
		@Pc(9) int local9 = arg1 >> this.anInt4645;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt4630 - 1 || local9 > super.anInt4625 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt4635 - 1;
		@Pc(41) int local41 = arg1 & this.anInt4635 - 1;
		@Pc(67) int local67 = this.anIntArrayArray30[local4][local9] * (this.anInt4635 - local34) + this.anIntArrayArray30[local4 + 1][local9] * local34 >> this.anInt4645;
		@Pc(97) int local97 = this.anIntArrayArray30[local4][local9 + 1] * (this.anInt4635 - local34) + this.anIntArrayArray30[local4 + 1][local9 + 1] * local34 >> this.anInt4645;
		return local67 * (this.anInt4635 - local41) + local97 * local41 >> this.anInt4645;
	}
}
