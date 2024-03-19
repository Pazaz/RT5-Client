import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class165 {

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
	public int anInt5565;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "[I")
	public int[] anIntArray407;

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!qr", name = "o", descriptor = "[Z")
	public boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!qr", name = "q", descriptor = "[I")
	private int[] anIntArray409;

	@OriginalMember(owner = "client!qr", name = "s", descriptor = "[I")
	public int[] anIntArray410;

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "Z")
	public boolean aBoolean391 = false;

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
	public int anInt5570 = -1;

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
	public int anInt5564 = 99;

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
	public int anInt5569 = -1;

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
	public int anInt5567 = -1;

	@OriginalMember(owner = "client!qr", name = "r", descriptor = "Z")
	public boolean aBoolean392 = false;

	@OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
	public int anInt5568 = 5;

	@OriginalMember(owner = "client!qr", name = "y", descriptor = "Z")
	public boolean aBoolean394 = false;

	@OriginalMember(owner = "client!qr", name = "C", descriptor = "I")
	public int anInt5581 = -1;

	@OriginalMember(owner = "client!qr", name = "u", descriptor = "I")
	public int anInt5575 = 2;

	@OriginalMember(owner = "client!qr", name = "x", descriptor = "Z")
	public boolean aBoolean393 = false;

	@OriginalMember(owner = "client!qr", name = "B", descriptor = "I")
	public int anInt5580 = -1;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIBLclient!qc;I)Lclient!qc;")
	public Class86 method4751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class86 arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray410[arg4];
		@Pc(21) int local21 = this.anIntArray407[arg4];
		@Pc(27) Class1_Sub1_Sub14 local27 = Static44.method715(local21 >> 16);
		@Pc(31) int local31 = local21 & 0xFFFF;
		if (local27 == null) {
			return arg3.method5565((byte) 1, arg2, true);
		}
		@Pc(41) Class1_Sub1_Sub14 local41 = null;
		if ((this.aBoolean394 || Static187.aBoolean305) && arg0 != -1 && arg0 < this.anIntArray407.length) {
			@Pc(59) int local59 = this.anIntArray407[arg0];
			local41 = Static44.method715(local59 >> 16);
			arg0 = local59 & 0xFFFF;
		}
		@Pc(71) Class1_Sub1_Sub14 local71 = null;
		@Pc(73) Class1_Sub1_Sub14 local73 = null;
		@Pc(75) int local75 = 0;
		@Pc(77) int local77 = 0;
		if (this.anIntArray409 != null) {
			if (arg4 < this.anIntArray409.length) {
				local75 = this.anIntArray409[arg4];
				if (local75 != 65535) {
					local71 = Static44.method715(local75 >> 16);
					local75 &= 0xFFFF;
				}
			}
			if ((this.aBoolean394 || Static187.aBoolean305) && arg0 != -1 && this.anIntArray409.length > arg0) {
				local77 = this.anIntArray409[arg0];
				if (local77 != 65535) {
					local73 = Static44.method715(local77 >> 16);
					local77 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean391) {
			arg2 |= 0x200;
		}
		if (local27.method3354(local31)) {
			arg2 |= 0x80;
		}
		if (local27.method3357(local31)) {
			arg2 |= 0x100;
		}
		if (local71 != null) {
			if (local71.method3354(local75)) {
				arg2 |= 0x80;
			}
			if (local71.method3357(local75)) {
				arg2 |= 0x100;
			}
		}
		if (local41 != null) {
			if (local41.method3354(arg0)) {
				arg2 |= 0x80;
			}
			if (local41.method3357(arg0)) {
				arg2 |= 0x100;
			}
		}
		if (local73 != null) {
			if (local73.method3354(local77)) {
				arg2 |= 0x80;
			}
			if (local73.method3357(local77)) {
				arg2 |= 0x100;
			}
		}
		arg2 |= 0x20;
		@Pc(235) Class86 local235 = arg3.method5565((byte) 1, arg2, true);
		local235.method5548(arg0, 0, local8, arg1 - 1, local41, this.aBoolean391, local27, local31);
		if (local71 != null) {
			local235.method5548(local77, 0, local8, arg1 - 1, local73, this.aBoolean391, local71, local75);
		}
		return local235;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZII)I")
	public int method4752(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray407[arg2];
		@Pc(14) Class1_Sub1_Sub14 local14 = null;
		@Pc(20) Class1_Sub1_Sub14 local20 = Static44.method715(local12 >> 16);
		@Pc(29) int local29 = local12 & 0xFFFF;
		if (local20 == null) {
			return 0;
		}
		if ((this.aBoolean394 || Static187.aBoolean305) && arg1 != -1 && this.anIntArray407.length > arg1) {
			local7 = this.anIntArray407[arg1];
			local14 = Static44.method715(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean391) {
			local5 = 512;
		}
		if (local20.method3354(local29)) {
			local5 |= 0x80;
		}
		if (local20.method3357(local29)) {
			local5 |= 0x100;
		}
		if (local14 != null) {
			if (local14.method3354(local7)) {
				local5 |= 0x80;
			}
			if (local14.method3357(local7)) {
				local5 |= 0x100;
			}
		}
		if (this.anIntArray409 != null && arg0) {
			@Pc(125) int local125;
			@Pc(134) Class1_Sub1_Sub14 local134;
			if (arg2 < this.anIntArray409.length) {
				local125 = this.anIntArray409[arg2];
				if (local125 != 65535) {
					local134 = Static44.method715(local125 >> 16);
					local125 &= 0xFFFF;
					if (local134 != null) {
						if (local134.method3354(local125)) {
							local5 |= 0x80;
						}
						if (local134.method3357(local125)) {
							local5 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean394 || Static187.aBoolean305) && arg1 != -1 && this.anIntArray409.length > arg1) {
				local125 = this.anIntArray409[arg1];
				if (local125 != 65535) {
					local134 = Static44.method715(local125 >> 16);
					local125 &= 0xFFFF;
					if (local134 != null) {
						if (local134.method3354(local125)) {
							local5 |= 0x80;
						}
						if (local134.method3357(local125)) {
							local5 |= 0x100;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIBIILclient!qc;B)Lclient!qc;")
	public Class86 method4753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class86 arg6) {
		@Pc(8) int local8 = this.anIntArray410[arg1];
		@Pc(13) int local13 = this.anIntArray407[arg1];
		@Pc(19) Class1_Sub1_Sub14 local19 = Static44.method715(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg6.method5565((byte) 1, arg2, true);
		}
		@Pc(40) Class1_Sub1_Sub14 local40 = null;
		if ((this.aBoolean394 || Static187.aBoolean305) && arg0 != -1 && arg0 < this.anIntArray407.length) {
			@Pc(59) int local59 = this.anIntArray407[arg0];
			local40 = Static44.method715(local59 >> 16);
			arg0 = local59 & 0xFFFF;
		}
		if (this.aBoolean391) {
			arg2 |= 0x200;
		}
		if (local19.method3354(local23)) {
			arg2 |= 0x80;
		}
		if (local19.method3357(local23)) {
			arg2 |= 0x100;
		}
		if (local40 != null) {
			if (local40.method3354(arg0)) {
				arg2 |= 0x80;
			}
			if (local40.method3357(arg0)) {
				arg2 |= 0x100;
			}
		}
		arg2 |= 0x20;
		@Pc(124) Class86 local124 = arg6.method5565(arg3, arg2, true);
		local124.method5548(arg0, arg5, local8, arg4 - 1, local40, this.aBoolean391, local19, local23);
		return local124;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!il;)V")
	public void method4755(@OriginalArg(1) Class1_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5761();
			if (local9 == 0) {
				return;
			}
			this.method4758(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
	public void method4757() {
		if (this.anInt5567 == -1) {
			if (this.aBooleanArray21 == null) {
				this.anInt5567 = 0;
			} else {
				this.anInt5567 = 2;
			}
		}
		if (this.anInt5580 != -1) {
			return;
		}
		if (this.aBooleanArray21 == null) {
			this.anInt5580 = 0;
		} else {
			this.anInt5580 = 2;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!il;II)V")
	private void method4758(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10;
		@Pc(16) int local16;
		@Pc(39) int local39;
		@Pc(58) int local58;
		if (arg1 == 1) {
			local10 = arg0.method5749();
			this.anIntArray410 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray410[local16] = arg0.method5749();
			}
			this.anIntArray407 = new int[local10];
			for (local39 = 0; local39 < local10; local39++) {
				this.anIntArray407[local39] = arg0.method5749();
			}
			for (local58 = 0; local58 < local10; local58++) {
				this.anIntArray407[local58] += arg0.method5749() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt5581 = arg0.method5749();
		} else if (arg1 == 3) {
			this.aBooleanArray21 = new boolean[256];
			local10 = arg0.method5761();
			for (local16 = 0; local16 < local10; local16++) {
				this.aBooleanArray21[arg0.method5761()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean392 = true;
		} else if (arg1 == 5) {
			this.anInt5568 = arg0.method5761();
		} else if (arg1 == 6) {
			this.anInt5570 = arg0.method5749();
		} else if (arg1 == 7) {
			this.anInt5569 = arg0.method5749();
		} else if (arg1 == 8) {
			this.anInt5564 = arg0.method5761();
		} else if (arg1 == 9) {
			this.anInt5567 = arg0.method5761();
		} else if (arg1 == 10) {
			this.anInt5580 = arg0.method5761();
		} else if (arg1 == 11) {
			this.anInt5575 = arg0.method5761();
		} else if (arg1 == 12) {
			local10 = arg0.method5761();
			this.anIntArray409 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray409[local16] = arg0.method5749();
			}
			for (local39 = 0; local39 < local10; local39++) {
				this.anIntArray409[local39] += arg0.method5749() << 16;
			}
		} else if (arg1 == 13) {
			local10 = arg0.method5749();
			this.anIntArrayArray36 = new int[local10][];
			for (local16 = 0; local16 < local10; local16++) {
				local39 = arg0.method5761();
				if (local39 > 0) {
					this.anIntArrayArray36[local16] = new int[local39];
					this.anIntArrayArray36[local16][0] = arg0.method5755();
					for (local58 = 1; local58 < local39; local58++) {
						this.anIntArrayArray36[local16][local58] = arg0.method5749();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean391 = true;
		} else if (arg1 == 15) {
			this.aBoolean394 = true;
		} else if (arg1 == 16) {
			this.aBoolean393 = true;
		}
	}
}
