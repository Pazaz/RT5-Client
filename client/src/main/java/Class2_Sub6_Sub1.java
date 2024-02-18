import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class2_Sub6_Sub1 extends Class2_Sub6 {

	@OriginalMember(owner = "client!bd", name = "ab", descriptor = "J")
	private long aLong28;

	@OriginalMember(owner = "client!bd", name = "Ib", descriptor = "Z")
	private boolean aBoolean65;

	@OriginalMember(owner = "client!bd", name = "gb", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!bd", name = "J", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!bd", name = "hb", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!bd", name = "cb", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!bd", name = "jb", descriptor = "Z")
	private boolean aBoolean66;

	@OriginalMember(owner = "client!bd", name = "Cb", descriptor = "Lclient!bn;")
	private Class2_Sub8 aClass2_Sub8_1;

	@OriginalMember(owner = "client!bd", name = "D", descriptor = "[I")
	private final int[] anIntArray42 = new int[16];

	@OriginalMember(owner = "client!bd", name = "I", descriptor = "[I")
	private final int[] anIntArray45 = new int[16];

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "[I")
	private final int[] anIntArray50 = new int[16];

	@OriginalMember(owner = "client!bd", name = "bb", descriptor = "[I")
	private final int[] anIntArray44 = new int[16];

	@OriginalMember(owner = "client!bd", name = "mb", descriptor = "[I")
	private final int[] anIntArray43 = new int[16];

	@OriginalMember(owner = "client!bd", name = "N", descriptor = "I")
	private final int anInt815 = 1000000;

	@OriginalMember(owner = "client!bd", name = "kb", descriptor = "[I")
	private final int[] anIntArray48 = new int[16];

	@OriginalMember(owner = "client!bd", name = "Gb", descriptor = "[I")
	private final int[] anIntArray47 = new int[16];

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "[I")
	private final int[] anIntArray55 = new int[16];

	@OriginalMember(owner = "client!bd", name = "E", descriptor = "[I")
	private final int[] anIntArray53 = new int[16];

	@OriginalMember(owner = "client!bd", name = "Fb", descriptor = "[[Lclient!dha;")
	private final Class2_Sub16[][] aClass2_Sub16ArrayArray1 = new Class2_Sub16[16][128];

	@OriginalMember(owner = "client!bd", name = "Q", descriptor = "[I")
	private final int[] anIntArray46 = new int[16];

	@OriginalMember(owner = "client!bd", name = "xb", descriptor = "I")
	private int anInt812 = 256;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "[I")
	public final int[] anIntArray49 = new int[16];

	@OriginalMember(owner = "client!bd", name = "db", descriptor = "[I")
	public final int[] anIntArray56 = new int[16];

	@OriginalMember(owner = "client!bd", name = "Z", descriptor = "[I")
	private final int[] anIntArray52 = new int[16];

	@OriginalMember(owner = "client!bd", name = "Mb", descriptor = "[[Lclient!dha;")
	private final Class2_Sub16[][] aClass2_Sub16ArrayArray2 = new Class2_Sub16[16][128];

	@OriginalMember(owner = "client!bd", name = "nb", descriptor = "[I")
	private final int[] anIntArray51 = new int[16];

	@OriginalMember(owner = "client!bd", name = "L", descriptor = "[I")
	public final int[] anIntArray57 = new int[16];

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "[I")
	private final int[] anIntArray54 = new int[16];

	@OriginalMember(owner = "client!bd", name = "vb", descriptor = "Lclient!bha;")
	private final Class40 aClass40_1 = new Class40();

	@OriginalMember(owner = "client!bd", name = "rb", descriptor = "Lclient!uka;")
	private final Class2_Sub6_Sub4 aClass2_Sub6_Sub4_1 = new Class2_Sub6_Sub4(this);

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "Lclient!av;")
	private final Class28 aClass28_7;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub1() {
		this.aClass28_7 = new Class28(128);
		this.method926(256, -1);
		this.method942(true);
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!bd;)V")
	public Class2_Sub6_Sub1(@OriginalArg(0) Class2_Sub6_Sub1 arg0) {
		this.aClass28_7 = arg0.aClass28_7;
		this.method926(256, -1);
		this.method942(true);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IJ)V")
	private void method910(@OriginalArg(1) long arg0) {
		while (this.aLong28 <= arg0) {
			@Pc(14) int local14 = this.anInt840;
			@Pc(17) int local17 = this.anInt841;
			@Pc(20) long local20 = this.aLong28;
			while (local17 == this.anInt841) {
				while (this.aClass40_1.anIntArray70[local14] == local17) {
					this.aClass40_1.method1063(local14);
					@Pc(33) int local33 = this.aClass40_1.method1057(local14);
					if (local33 == 1) {
						this.aClass40_1.method1064();
						this.aClass40_1.method1058(local14);
						if (this.aClass40_1.method1068()) {
							if (!this.aBoolean65 || local17 == 0) {
								this.method942(true);
								this.aClass40_1.method1059();
								return;
							}
							this.aClass40_1.method1066(local20);
						}
						break;
					}
					if ((local33 & 0x80) != 0 && (local33 & 0xF0) != 144) {
						this.method924(local33);
					}
					this.aClass40_1.method1069(local14);
					this.aClass40_1.method1058(local14);
				}
				this.aLong29 = local20;
				local14 = this.aClass40_1.method1062();
				local17 = this.aClass40_1.anIntArray70[local14];
				local20 = this.aClass40_1.method1056(local17);
			}
			this.anInt841 = local17;
			this.anInt840 = local14;
			this.aLong28 = local20;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BZ)V")
	private synchronized void method911(@OriginalArg(1) boolean arg0) {
		this.aClass40_1.method1059();
		this.aClass2_Sub8_1 = null;
		this.method942(arg0);
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method9131(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass40_1.method1055()) {
			@Pc(14) int local14 = this.aClass40_1.anInt988 * this.anInt815 / Static686.anInt8944;
			do {
				@Pc(24) long local24 = this.aLong29 + (long) arg2 * (long) local14;
				if (this.aLong28 - local24 >= 0L) {
					this.aLong29 = local24;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong28 + (long) local14 - this.aLong29 - 1L) / (long) local14);
				this.aLong29 += (long) local55 * (long) local14;
				this.aClass2_Sub6_Sub4_1.method9131(arg0, arg1, local55);
				arg1 += local55;
				this.method932((byte) -89);
				arg2 -= local55;
			} while (this.aClass40_1.method1055());
		}
		this.aClass2_Sub6_Sub4_1.method9131(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "()Lclient!dea;")
	@Override
	public synchronized Class2_Sub6 method9133() {
		return this.aClass2_Sub6_Sub4_1;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
	public synchronized void method912() {
		this.method911(true);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZZLclient!bn;I)V")
	private synchronized void method913(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class2_Sub8 arg2) {
		this.method911(arg1);
		this.aClass40_1.method1061(arg2.aByteArray12);
		this.aLong29 = 0L;
		this.aBoolean65 = arg0;
		@Pc(24) int local24 = this.aClass40_1.method1070();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass40_1.method1063(local26);
			this.aClass40_1.method1069(local26);
			this.aClass40_1.method1058(local26);
		}
		if (18429 != 18429) {
			this.method917(68, 61);
		}
		this.anInt840 = this.aClass40_1.method1062();
		this.anInt841 = this.aClass40_1.anIntArray70[this.anInt840];
		this.aLong28 = this.aClass40_1.method1056(this.anInt841);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!dha;)I")
	private int method914(@OriginalArg(1) Class2_Sub16 arg0) {
		@Pc(14) int local14 = arg0.anInt2191 + (arg0.anInt2203 * arg0.anInt2197 >> 12);
		local14 += (this.anIntArray48[arg0.anInt2187] - 8192) * this.anIntArray52[arg0.anInt2187] >> 12;
		@Pc(35) Class269 local35 = arg0.aClass269_1;
		@Pc(65) int local65;
		if (local35.anInt6776 > 0 && (local35.anInt6775 > 0 || this.anIntArray51[arg0.anInt2187] > 0)) {
			local65 = local35.anInt6775 << 2;
			@Pc(70) int local70 = local35.anInt6780 << 1;
			if (local70 > arg0.anInt2201) {
				local65 = arg0.anInt2201 * local65 / local70;
			}
			local65 += this.anIntArray51[arg0.anInt2187] >> 7;
			@Pc(104) double local104 = Math.sin((double) (arg0.anInt2188 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local104 * (double) local65);
		}
		local65 = (int) ((double) (arg0.aClass2_Sub49_Sub1_1.anInt8818 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static686.anInt8944 + 0.5D);
		return local65 >= 1 ? local65 : 1;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIII)V")
	private void method915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub16 local12 = this.aClass2_Sub16ArrayArray1[arg1][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass2_Sub16ArrayArray1[arg1][arg2] = null;
		if ((this.anIntArray56[arg1] & 0x2) == 0) {
			local12.anInt2202 = 0;
			return;
		}
		for (@Pc(47) Class2_Sub16 local47 = (Class2_Sub16) this.aClass2_Sub6_Sub4_1.aClass339_72.method7699(65280); local47 != null; local47 = (Class2_Sub16) this.aClass2_Sub6_Sub4_1.aClass339_72.method7706()) {
			if (local12.anInt2187 == local47.anInt2187 && local47.anInt2202 < 0 && local12 != local47) {
				local12.anInt2202 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)V")
	public synchronized void method916(@OriginalArg(1) int arg0) {
		this.anInt812 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(II)V")
	private void method917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((this.anIntArray56[arg1] & 0x4) != 0) {
			for (@Pc(22) Class2_Sub16 local22 = (Class2_Sub16) this.aClass2_Sub6_Sub4_1.aClass339_72.method7699(arg0 + 65280); local22 != null; local22 = (Class2_Sub16) this.aClass2_Sub6_Sub4_1.aClass339_72.method7706()) {
				if (arg1 == local22.anInt2187) {
					local22.anInt2183 = 0;
				}
			}
		}
		if (arg0 != 0) {
			this.method937(61, -58, -70);
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(BI)V")
	private void method919(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
				this.method919(local7);
			}
			return;
		}
		this.anIntArray53[arg0] = 12800;
		this.anIntArray55[arg0] = 8192;
		this.anIntArray45[arg0] = 16383;
		this.anIntArray48[arg0] = 8192;
		this.anIntArray51[arg0] = 0;
		this.anIntArray47[arg0] = 8192;
		this.method941(arg0);
		this.method917(0, arg0);
		this.anIntArray56[arg0] = 0;
		this.anIntArray44[arg0] = 32767;
		this.anIntArray52[arg0] = 256;
		this.anIntArray49[arg0] = 0;
		this.method928(8192, arg0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!dha;B)I")
	private int method920(@OriginalArg(0) Class2_Sub16 arg0) {
		if (this.anIntArray42[arg0.anInt2187] == 0) {
			return 0;
		}
		@Pc(18) Class269 local18 = arg0.aClass269_1;
		@Pc(34) int local34 = this.anIntArray45[arg0.anInt2187] * this.anIntArray53[arg0.anInt2187] + 4096 >> 13;
		@Pc(42) int local42 = local34 * local34 + 16384 >> 15;
		@Pc(51) int local51 = arg0.anInt2199 * local42 + 16384 >> 15;
		@Pc(60) int local60 = this.anInt812 * local51 + 128 >> 8;
		local34 = local60 * this.anIntArray42[arg0.anInt2187] + 128 >> 8;
		if (local18.anInt6771 > 0) {
			local34 = (int) ((double) local34 * Math.pow(0.5D, (double) arg0.anInt2204 * 1.953125E-5D * (double) local18.anInt6771) + 0.5D);
		}
		@Pc(102) int local102;
		@Pc(110) int local110;
		@Pc(132) int local132;
		@Pc(144) int local144;
		if (local18.aByteArray83 != null) {
			local102 = arg0.anInt2190;
			local110 = local18.aByteArray83[arg0.anInt2185 + 1];
			if (local18.aByteArray83.length - 2 > arg0.anInt2185) {
				local132 = (local18.aByteArray83[arg0.anInt2185] & 0xFF) << 8;
				local144 = (local18.aByteArray83[arg0.anInt2185 + 2] & 0xFF) << 8;
				local110 += (local18.aByteArray83[arg0.anInt2185 + 3] - local110) * (-local132 + local102) / (local144 - local132);
			}
			local34 = local110 * local34 + 32 >> 6;
		}
		if (arg0.anInt2202 > 0 && local18.aByteArray82 != null) {
			local102 = arg0.anInt2202;
			local110 = local18.aByteArray82[arg0.anInt2195 + 1];
			if (local18.aByteArray82.length - 2 > arg0.anInt2195) {
				local132 = (local18.aByteArray82[arg0.anInt2195] & 0xFF) << 8;
				local144 = (local18.aByteArray82[arg0.anInt2195 + 2] & 0xFF) << 8;
				local110 += (local102 - local132) * (local18.aByteArray82[arg0.anInt2195 + 3] - local110) / (local144 - local132);
			}
			local34 = local110 * local34 + 32 >> 6;
		}
		return local34;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "()I")
	@Override
	public synchronized int method9132() {
		return 0;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(Lclient!dha;B)Z")
	public boolean method921(@OriginalArg(0) Class2_Sub16 arg0) {
		if (arg0.aClass2_Sub6_Sub2_1 != null) {
			return false;
		}
		if (arg0.anInt2202 >= 0) {
			arg0.method9457();
			if (arg0.anInt2198 > 0 && this.aClass2_Sub16ArrayArray2[arg0.anInt2187][arg0.anInt2198] == arg0) {
				this.aClass2_Sub16ArrayArray2[arg0.anInt2187][arg0.anInt2198] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "()Lclient!dea;")
	@Override
	public synchronized Class2_Sub6 method9135() {
		return null;
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(B)Z")
	public synchronized boolean method922() {
		return this.aClass40_1.method1055();
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(ILclient!dha;)I")
	private int method923(@OriginalArg(1) Class2_Sub16 arg0) {
		@Pc(9) int local9 = this.anIntArray55[arg0.anInt2187];
		return local9 < 8192 ? local9 * arg0.anInt2193 + 32 >> 6 : 16384 - ((128 - arg0.anInt2193) * (-local9 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(II)V")
	private void method924(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method915(local28, local16, local22);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 <= 0) {
				this.method915(64, local16, local22);
			} else {
				this.method936(local16, local22, local28);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method939(local28, local16, local22);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray50[local16] = (local28 << 14) + (this.anIntArray50[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray50[local16] = (local28 << 7) + (this.anIntArray50[local16] & 0xFFFFC07F);
			}
			if (local22 == 1) {
				this.anIntArray51[local16] = (this.anIntArray51[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray51[local16] = local28 + (this.anIntArray51[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray47[local16] = (local28 << 7) + (this.anIntArray47[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray47[local16] = (this.anIntArray47[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.anIntArray53[local16] = (local28 << 7) + (this.anIntArray53[local16] & 0xFFFFC07F);
			}
			if (local22 == 39) {
				this.anIntArray53[local16] = local28 + (this.anIntArray53[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray55[local16] = (local28 << 7) + (this.anIntArray55[local16] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray55[local16] = local28 + (this.anIntArray55[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray45[local16] = (this.anIntArray45[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 43) {
				this.anIntArray45[local16] = (this.anIntArray45[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 < 64) {
					this.anIntArray56[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray56[local16] |= 0x1;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray56[local16] |= 0x2;
				} else {
					this.method941(local16);
					this.anIntArray56[local16] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray44[local16] = (local28 << 7) + (this.anIntArray44[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray44[local16] = local28 + (this.anIntArray44[local16] & 0x3F80);
			}
			if (local22 == 101) {
				this.anIntArray44[local16] = (this.anIntArray44[local16] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray44[local16] = (this.anIntArray44[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method930(local16);
			}
			if (local22 == 121) {
				this.method919(local16);
			}
			if (local22 == 123) {
				this.method938(local16);
			}
			@Pc(557) int local557;
			if (local22 == 6) {
				local557 = this.anIntArray44[local16];
				if (local557 == 16384) {
					this.anIntArray52[local16] = (local28 << 7) + (this.anIntArray52[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local557 = this.anIntArray44[local16];
				if (local557 == 16384) {
					this.anIntArray52[local16] = (this.anIntArray52[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray49[local16] = (local28 << 7) + (this.anIntArray49[local16] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.anIntArray49[local16] = local28 + (this.anIntArray49[local16] & 0xFFFFFF80);
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray56[local16] |= 0x4;
				} else {
					this.method917(0, local16);
					this.anIntArray56[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method928((this.anIntArray43[local16] & 0xFFFFC07F) + (local28 << 7), local16);
			}
			if (local22 == 49) {
				this.method928(local28 + (this.anIntArray43[local16] & 0xFFFFFF80), local16);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method947(local16, local22 + this.anIntArray50[local16]);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method946(local16, local22);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F0197) >> 9);
			this.method937(local22, -5807, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method942(true);
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!bn;ZIJZ)V")
	public synchronized void method925(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) long arg2) {
		this.method913(arg1, true, arg0);
		this.method910(arg2 * (long) this.aClass40_1.anInt988);
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(IZI)V")
	public synchronized void method926(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.anIntArray42[local12] = arg0;
			}
		} else {
			this.anIntArray42[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
	public synchronized void method927() {
		for (@Pc(5) Class2_Sub11 local5 = (Class2_Sub11) this.aClass28_7.method736(); local5 != null; local5 = (Class2_Sub11) this.aClass28_7.method740()) {
			local5.method9457();
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(IIB)V")
	private void method928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray43[arg1] = arg0;
		this.anIntArray57[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIB)V")
	public synchronized void method929() {
		this.method940();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
	private void method930(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class2_Sub16 local14 = (Class2_Sub16) this.aClass2_Sub6_Sub4_1.aClass339_72.method7699(65280); local14 != null; local14 = (Class2_Sub16) this.aClass2_Sub6_Sub4_1.aClass339_72.method7706()) {
			if (arg0 < 0 || local14.anInt2187 == arg0) {
				if (local14.aClass2_Sub6_Sub2_1 != null) {
					local14.aClass2_Sub6_Sub2_1.method3320(Static686.anInt8944 / 100);
					if (local14.aClass2_Sub6_Sub2_1.method3336()) {
						this.aClass2_Sub6_Sub4_1.aClass2_Sub6_Sub3_2.method5882(local14.aClass2_Sub6_Sub2_1);
					}
					local14.method2083();
				}
				if (local14.anInt2202 < 0) {
					this.aClass2_Sub16ArrayArray1[local14.anInt2187][local14.anInt2196] = null;
				}
				local14.method9457();
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)V")
	private void method932(@OriginalArg(0) byte arg0) {
		@Pc(8) int local8 = this.anInt840;
		@Pc(11) int local11 = this.anInt841;
		@Pc(14) long local14 = this.aLong28;
		if (this.aClass2_Sub8_1 != null && this.anInt842 == local11) {
			this.method913(this.aBoolean65, this.aBoolean66, this.aClass2_Sub8_1);
			this.method932((byte) -98);
			return;
		}
		while (this.anInt841 == local11) {
			while (this.aClass40_1.anIntArray70[local8] == local11) {
				this.aClass40_1.method1063(local8);
				@Pc(50) int local50 = this.aClass40_1.method1057(local8);
				if (local50 == 1) {
					this.aClass40_1.method1064();
					this.aClass40_1.method1058(local8);
					if (this.aClass40_1.method1068()) {
						if (this.aClass2_Sub8_1 != null) {
							this.method934(this.aClass2_Sub8_1, this.aBoolean65);
							this.method932((byte) -119);
							return;
						}
						if (!this.aBoolean65 || local11 == 0) {
							this.method942(true);
							this.aClass40_1.method1059();
							return;
						}
						this.aClass40_1.method1066(local14);
					}
					break;
				}
				if ((local50 & 0x80) != 0) {
					this.method924(local50);
				}
				this.aClass40_1.method1069(local8);
				this.aClass40_1.method1058(local8);
			}
			local8 = this.aClass40_1.method1062();
			local11 = this.aClass40_1.anIntArray70[local8];
			local14 = this.aClass40_1.method1056(local11);
		}
		if (arg0 >= -19) {
			this.anInt841 = -58;
		}
		this.anInt840 = local8;
		this.aLong28 = local14;
		this.anInt841 = local11;
		if (this.aClass2_Sub8_1 != null && local11 > this.anInt842) {
			this.anInt841 = this.anInt842;
			this.anInt840 = -1;
			this.aLong28 = this.aClass40_1.method1056(this.anInt841);
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	public synchronized void method933() {
		for (@Pc(7) Class2_Sub11 local7 = (Class2_Sub11) this.aClass28_7.method736(); local7 != null; local7 = (Class2_Sub11) this.aClass28_7.method740()) {
			local7.method1521();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!bn;Z)V")
	public synchronized void method934(@OriginalArg(1) Class2_Sub8 arg0, @OriginalArg(2) boolean arg1) {
		this.method913(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIZ)V")
	private void method936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method915(64, arg0, arg1);
		if ((this.anIntArray56[arg0] & 0x2) != 0) {
			for (@Pc(25) Class2_Sub16 local25 = (Class2_Sub16) this.aClass2_Sub6_Sub4_1.aClass339_72.method7708(); local25 != null; local25 = (Class2_Sub16) this.aClass2_Sub6_Sub4_1.aClass339_72.method7709()) {
				if (arg0 == local25.anInt2187 && local25.anInt2202 < 0) {
					this.aClass2_Sub16ArrayArray1[arg0][local25.anInt2196] = null;
					this.aClass2_Sub16ArrayArray1[arg0][arg1] = local25;
					@Pc(72) int local72 = local25.anInt2191 + (local25.anInt2203 * local25.anInt2197 >> 12);
					local25.anInt2191 += arg1 - local25.anInt2196 << 8;
					local25.anInt2197 = local72 - local25.anInt2191;
					local25.anInt2203 = 4096;
					local25.anInt2196 = arg1;
					return;
				}
			}
		}
		@Pc(117) Class2_Sub11 local117 = (Class2_Sub11) this.aClass28_7.method738((long) this.anIntArray54[arg0]);
		if (local117 == null) {
			return;
		}
		@Pc(126) Class2_Sub49_Sub1 local126 = local117.aClass2_Sub49_Sub1Array1[arg1];
		if (local126 == null) {
			return;
		}
		@Pc(142) Class2_Sub16 local142 = new Class2_Sub16();
		local142.aClass2_Sub11_1 = local117;
		local142.aClass2_Sub49_Sub1_1 = local126;
		local142.anInt2187 = arg0;
		local142.aClass269_1 = local117.aClass269Array1[arg1];
		local142.anInt2198 = local117.aByteArray19[arg1];
		local142.anInt2196 = arg1;
		local142.anInt2199 = local117.aByteArray20[arg1] * arg2 * arg2 * local117.anInt1579 + 1024 >> 11;
		local142.anInt2193 = local117.aByteArray18[arg1] & 0xFF;
		local142.anInt2191 = (arg1 << 8) - (local117.aShortArray16[arg1] & 0x7FFF);
		local142.anInt2204 = 0;
		local142.anInt2195 = 0;
		local142.anInt2202 = -1;
		local142.anInt2190 = 0;
		local142.anInt2185 = 0;
		if (this.anIntArray49[arg0] == 0) {
			local142.aClass2_Sub6_Sub2_1 = Static730.method3346(local126, this.method914(local142), this.method920(local142), this.method923(local142));
		} else {
			local142.aClass2_Sub6_Sub2_1 = Static730.method3346(local126, this.method914(local142), 0, this.method923(local142));
			this.method943(local117.aShortArray16[arg1] < 0, local142);
		}
		if (local117.aShortArray16[arg1] < 0) {
			local142.aClass2_Sub6_Sub2_1.method3318(-1);
		}
		if (local142.anInt2198 >= 0) {
			@Pc(297) Class2_Sub16 local297 = this.aClass2_Sub16ArrayArray2[arg0][local142.anInt2198];
			if (local297 != null && local297.anInt2202 < 0) {
				this.aClass2_Sub16ArrayArray1[arg0][local297.anInt2196] = null;
				local297.anInt2202 = 0;
			}
			this.aClass2_Sub16ArrayArray2[arg0][local142.anInt2198] = local142;
		}
		this.aClass2_Sub6_Sub4_1.aClass339_72.method7711(local142);
		this.aClass2_Sub16ArrayArray1[arg0][arg1] = local142;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(III)V")
	private void method937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 != -5807) {
			this.anInt840 = -101;
		}
		this.anIntArray48[arg2] = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(II)V")
	private void method938(@OriginalArg(1) int arg0) {
		for (@Pc(6) Class2_Sub16 local6 = (Class2_Sub16) this.aClass2_Sub6_Sub4_1.aClass339_72.method7699(65280); local6 != null; local6 = (Class2_Sub16) this.aClass2_Sub6_Sub4_1.aClass339_72.method7706()) {
			if ((arg0 < 0 || arg0 == local6.anInt2187) && local6.anInt2202 < 0) {
				this.aClass2_Sub16ArrayArray1[local6.anInt2187][local6.anInt2196] = null;
				local6.anInt2202 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(IIII)V")
	private void method939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZI)V")
	private void method940() {
		this.anIntArray46[9] = 128;
		this.anIntArray50[9] = 128;
		this.method947(9, 128);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)V")
	private void method941(@OriginalArg(1) int arg0) {
		if ((this.anIntArray56[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(28) Class2_Sub16 local28 = (Class2_Sub16) this.aClass2_Sub6_Sub4_1.aClass339_72.method7699(65280); local28 != null; local28 = (Class2_Sub16) this.aClass2_Sub6_Sub4_1.aClass339_72.method7706()) {
			if (arg0 == local28.anInt2187 && this.aClass2_Sub16ArrayArray1[arg0][local28.anInt2196] == null && local28.anInt2202 < 0) {
				local28.anInt2202 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZ)V")
	private void method942(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method930(-1);
		} else {
			this.method938(-1);
		}
		this.method919(-1);
		for (@Pc(21) int local21 = 0; local21 < 16; local21++) {
			this.anIntArray54[local21] = this.anIntArray46[local21];
		}
		for (@Pc(46) int local46 = 0; local46 < 16; local46++) {
			this.anIntArray50[local46] = this.anIntArray46[local46] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLclient!dha;I)V")
	public void method943(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub16 arg1) {
		@Pc(13) int local13 = arg1.aClass2_Sub49_Sub1_1.aByteArray98.length;
		@Pc(42) int local42;
		if (arg0 && arg1.aClass2_Sub49_Sub1_1.aBoolean668) {
			@Pc(29) int local29 = local13 + local13 - arg1.aClass2_Sub49_Sub1_1.anInt8819;
			local42 = (int) ((long) local29 * (long) this.anIntArray49[arg1.anInt2187] >> 6);
			local13 <<= 0x8;
			if (local13 <= local42) {
				local42 = local13 + local13 - local42 - 1;
				arg1.aClass2_Sub6_Sub2_1.method3323();
			}
		} else {
			local42 = (int) ((long) this.anIntArray49[arg1.anInt2187] * (long) local13 >> 6);
		}
		arg1.aClass2_Sub6_Sub2_1.method3344(local42);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!fca;Lclient!sb;IILclient!bn;)Z")
	public synchronized boolean method944(@OriginalArg(0) Class123 arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(4) Class2_Sub8 arg2) {
		arg2.method1154();
		@Pc(15) boolean local15 = true;
		@Pc(29) int[] local29 = new int[] { 22050 };
		for (@Pc(35) Class2_Sub55 local35 = (Class2_Sub55) arg2.aClass28_8.method736(); local35 != null; local35 = (Class2_Sub55) arg2.aClass28_8.method740()) {
			@Pc(40) int local40 = (int) local35.aLong328;
			@Pc(48) Class2_Sub11 local48 = (Class2_Sub11) this.aClass28_7.method738((long) local40);
			if (local48 == null) {
				local48 = Static680.method8917(arg1, local40);
				if (local48 == null) {
					local15 = false;
					continue;
				}
				this.aClass28_7.method735((long) local40, local48);
			}
			if (!local48.method1526(arg0, local29, local35.aByteArray105)) {
				local15 = false;
			}
		}
		if (local15) {
			arg2.method1155();
		}
		return local15;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method9130(@OriginalArg(0) int arg0) {
		if (this.aClass40_1.method1055()) {
			@Pc(18) int local18 = this.aClass40_1.anInt988 * this.anInt815 / Static686.anInt8944;
			do {
				@Pc(27) long local27 = (long) arg0 * (long) local18 + this.aLong29;
				if (this.aLong28 - local27 >= 0L) {
					this.aLong29 = local27;
					break;
				}
				@Pc(58) int local58 = (int) ((this.aLong28 + (long) local18 - this.aLong29 - 1L) / (long) local18);
				this.aLong29 += (long) local58 * (long) local18;
				this.aClass2_Sub6_Sub4_1.method9130(local58);
				arg0 -= local58;
				this.method932((byte) -117);
			} while (this.aClass40_1.method1055());
		}
		this.aClass2_Sub6_Sub4_1.method9130(arg0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!dha;I[III)Z")
	public boolean method945(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg0.anInt2184 = Static686.anInt8944 / 100;
		if (arg0.anInt2202 >= 0 && (arg0.aClass2_Sub6_Sub2_1 == null || arg0.aClass2_Sub6_Sub2_1.method3311())) {
			arg0.method2083();
			arg0.method9457();
			if (arg0.anInt2198 > 0 && this.aClass2_Sub16ArrayArray2[arg0.anInt2187][arg0.anInt2198] == arg0) {
				this.aClass2_Sub16ArrayArray2[arg0.anInt2187][arg0.anInt2198] = null;
			}
			return true;
		}
		@Pc(70) int local70 = arg0.anInt2203;
		if (local70 > 0) {
			local70 -= (int) (Math.pow(2.0D, (double) this.anIntArray47[arg0.anInt2187] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local70 < 0) {
				local70 = 0;
			}
			arg0.anInt2203 = local70;
		}
		arg0.aClass2_Sub6_Sub2_1.method3319(this.method914(arg0));
		@Pc(113) Class269 local113 = arg0.aClass269_1;
		arg0.anInt2188 += local113.anInt6776;
		@Pc(122) boolean local122 = false;
		arg0.anInt2201++;
		@Pc(147) double local147 = (double) ((arg0.anInt2196 - 60 << 8) + (arg0.anInt2197 * arg0.anInt2203 >> 12)) * 5.086263020833333E-6D;
		if (local113.anInt6771 > 0) {
			if (local113.anInt6772 > 0) {
				arg0.anInt2204 += (int) (Math.pow(2.0D, (double) local113.anInt6772 * local147) * 128.0D + 0.5D);
			} else {
				arg0.anInt2204 += 128;
			}
			if (arg0.anInt2204 * local113.anInt6771 >= 819200) {
				local122 = true;
			}
		}
		if (local113.aByteArray83 != null) {
			if (local113.anInt6778 <= 0) {
				arg0.anInt2190 += 128;
			} else {
				arg0.anInt2190 += (int) (Math.pow(2.0D, local147 * (double) local113.anInt6778) * 128.0D + 0.5D);
			}
			while (arg0.anInt2185 < local113.aByteArray83.length - 2 && arg0.anInt2190 > (local113.aByteArray83[arg0.anInt2185 + 2] & 0xFF) << 8) {
				arg0.anInt2185 += 2;
			}
			if (arg0.anInt2185 == local113.aByteArray83.length - 2 && local113.aByteArray83[arg0.anInt2185 + 1] == 0) {
				local122 = true;
			}
		}
		if (arg0.anInt2202 >= 0 && local113.aByteArray82 != null && (this.anIntArray56[arg0.anInt2187] & 0x1) == 0 && (arg0.anInt2198 < 0 || arg0 != this.aClass2_Sub16ArrayArray2[arg0.anInt2187][arg0.anInt2198])) {
			if (local113.anInt6779 <= 0) {
				arg0.anInt2202 += 128;
			} else {
				arg0.anInt2202 += (int) (Math.pow(2.0D, local147 * (double) local113.anInt6779) * 128.0D + 0.5D);
			}
			while (local113.aByteArray82.length - 2 > arg0.anInt2195 && arg0.anInt2202 > (local113.aByteArray82[arg0.anInt2195 + 2] & 0xFF) << 8) {
				arg0.anInt2195 += 2;
			}
			if (local113.aByteArray82.length - 2 == arg0.anInt2195) {
				local122 = true;
			}
		}
		if (!local122) {
			arg0.aClass2_Sub6_Sub2_1.method3338(arg0.anInt2184, this.method920(arg0), this.method923(arg0));
			return false;
		}
		arg0.aClass2_Sub6_Sub2_1.method3320(arg0.anInt2184);
		if (arg1 == null) {
			arg0.aClass2_Sub6_Sub2_1.method9130(arg3);
		} else {
			arg0.aClass2_Sub6_Sub2_1.method9131(arg1, arg2, arg3);
		}
		if (arg0.aClass2_Sub6_Sub2_1.method3336()) {
			this.aClass2_Sub6_Sub4_1.aClass2_Sub6_Sub3_2.method5882(arg0.aClass2_Sub6_Sub2_1);
		}
		arg0.method2083();
		if (arg0.anInt2202 >= 0) {
			arg0.method9457();
			if (arg0.anInt2198 > 0 && this.aClass2_Sub16ArrayArray2[arg0.anInt2187][arg0.anInt2198] == arg0) {
				this.aClass2_Sub16ArrayArray2[arg0.anInt2187][arg0.anInt2198] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)V")
	private void method946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(IIB)V")
	private void method947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray54[arg0] != arg1) {
			this.anIntArray54[arg0] = arg1;
			for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
				this.aClass2_Sub16ArrayArray2[arg0][local16] = null;
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)I")
	public int method948() {
		return this.anInt812;
	}
}
