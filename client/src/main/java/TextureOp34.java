import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class TextureOp34 extends TextureOp {

	@OriginalMember(owner = "client!ch", name = "U", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!ch", name = "jb", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!ch", name = "S", descriptor = "[B")
	private byte[] aByteArray12 = new byte[512];

	@OriginalMember(owner = "client!ch", name = "Z", descriptor = "I")
	public int anInt1045 = 0;

	@OriginalMember(owner = "client!ch", name = "db", descriptor = "I")
	public int anInt1049 = 1638;

	@OriginalMember(owner = "client!ch", name = "eb", descriptor = "I")
	public int anInt1050 = 4;

	@OriginalMember(owner = "client!ch", name = "O", descriptor = "Z")
	public boolean aBoolean85 = true;

	@OriginalMember(owner = "client!ch", name = "X", descriptor = "I")
	public int anInt1043 = 4;

	@OriginalMember(owner = "client!ch", name = "hb", descriptor = "I")
	public int anInt1051 = 4;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
	public TextureOp34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.monochromeImageCache.get(arg0);
		if (super.monochromeImageCache.invalid) {
			this.method1308(local9, arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V")
	@Override
	public void postDecode() {
		this.aByteArray12 = Static116.method2364(this.anInt1045);
		this.method1309();
		for (@Pc(23) int local23 = this.anInt1043 - 1; local23 >= 1; local23--) {
			@Pc(30) short local30 = this.aShortArray18[local23];
			if (local30 > 8 || local30 < -8) {
				return;
			}
			this.anInt1043--;
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(IIIIIII)I")
	private int method1307(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg5 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = local9 & 0xFF;
		if (local13 >= arg1) {
			local13 = 0;
		}
		@Pc(26) int local26 = arg5 & 0xFFF;
		@Pc(30) int local30 = arg0 - 4096;
		local13 &= 0xFF;
		@Pc(38) int local38 = local26 - 4096;
		@Pc(42) int local42 = Class57.fadeCurves[local26];
		@Pc(52) int local52 = this.aByteArray12[local17 + arg3] & 0x3;
		@Pc(69) int local69;
		if (local52 <= 1) {
			local69 = local52 == 0 ? local26 + arg0 : -local26 + arg0;
		} else {
			local69 = local52 == 2 ? local26 - arg0 : -arg0 + -local26;
		}
		local52 = this.aByteArray12[local13 + arg3] & 0x3;
		@Pc(116) int local116;
		if (local52 <= 1) {
			local116 = local52 == 0 ? arg0 + local38 : -local38 + arg0;
		} else {
			local116 = local52 == 2 ? local38 - arg0 : -arg0 + -local38;
		}
		@Pc(145) int local145 = local69 + (local42 * (local116 - local69) >> 12);
		local52 = this.aByteArray12[arg2 + local17] & 0x3;
		if (local52 > 1) {
			local69 = local52 == 2 ? local26 - local30 : -local30 + -local26;
		} else {
			local69 = local52 == 0 ? local26 + local30 : -local26 + local30;
		}
		local52 = this.aByteArray12[local13 + arg2] & 0x3;
		if (local52 > 1) {
			local116 = local52 == 2 ? local38 - local30 : -local38 + -local30;
		} else {
			local116 = local52 == 0 ? local30 + local38 : -local38 + local30;
		}
		@Pc(250) int local250 = (local42 * (local116 - local69) >> 12) + local69;
		return local145 + (arg4 * (local250 - local145) >> 12);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.aBoolean85 = arg1.g1() == 1;
		} else if (arg0 == 1) {
			this.anInt1043 = arg1.g1();
		} else if (arg0 == 2) {
			this.anInt1049 = arg1.g2s();
			if (this.anInt1049 < 0) {
				this.aShortArray18 = new short[this.anInt1043];
				for (@Pc(80) int local80 = 0; local80 < this.anInt1043; local80++) {
					this.aShortArray18[local80] = (short) arg1.g2s();
				}
				return;
			}
		} else if (arg0 == 3) {
			this.anInt1051 = this.anInt1050 = arg1.g1();
			return;
		} else if (arg0 == 4) {
			this.anInt1045 = arg1.g1();
			return;
		} else if (arg0 == 5) {
			this.anInt1051 = arg1.g1();
			return;
		} else if (arg0 == 6) {
			this.anInt1050 = arg1.g1();
			return;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "([III)V")
	public void method1308(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt1050 * Texture.heightFractions[arg1];
		@Pc(116) int local116;
		@Pc(130) int local130;
		@Pc(46) int local46;
		@Pc(29) short local29;
		@Pc(107) int local107;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(53) int local53;
		@Pc(87) int local87;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(96) int local96;
		@Pc(105) int local105;
		if (this.anInt1043 == 1) {
			local46 = this.aShortArray19[0] << 12;
			local29 = this.aShortArray18[0];
			local59 = local46 * local12 >> 12;
			local53 = local46 * this.anInt1050 >> 12;
			local66 = this.anInt1051 * local46 >> 12;
			local70 = local59 >> 12;
			local74 = local70 + 1;
			@Pc(379) int local379 = local59 & 0xFFF;
			if (local74 >= local53) {
				local74 = 0;
			}
			local96 = this.aByteArray12[local70 & 0xFF] & 0xFF;
			local87 = Class57.fadeCurves[local379];
			local105 = this.aByteArray12[local74 & 0xFF] & 0xFF;
			if (this.aBoolean85) {
				for (local107 = 0; local107 < Texture.width; local107++) {
					local116 = this.anInt1051 * Texture.widthFractions[local107];
					local130 = this.method1307(local379, local66, local105, local96, local87, local116 * local46 >> 12);
					@Pc(478) int local478 = local29 * local130 >> 12;
					arg0[local107] = (local478 >> 1) + 2048;
				}
			} else {
				for (local107 = 0; local107 < Texture.width; local107++) {
					local116 = this.anInt1051 * Texture.widthFractions[local107];
					local130 = this.method1307(local379, local66, local105, local96, local87, local46 * local116 >> 12);
					arg0[local107] = local130 * local29 >> 12;
				}
			}
			return;
		}
		local29 = this.aShortArray18[0];
		if (local29 > 8 || local29 < -8) {
			local46 = this.aShortArray19[0] << 12;
			local53 = local46 * this.anInt1050 >> 12;
			local59 = local12 * local46 >> 12;
			local66 = this.anInt1051 * local46 >> 12;
			local70 = local59 >> 12;
			local74 = local70 + 1;
			if (local74 >= local53) {
				local74 = 0;
			}
			local59 &= 0xFFF;
			local87 = Class57.fadeCurves[local59];
			local96 = this.aByteArray12[local70 & 0xFF] & 0xFF;
			local105 = this.aByteArray12[local74 & 0xFF] & 0xFF;
			for (local107 = 0; local107 < Texture.width; local107++) {
				local116 = this.anInt1051 * Texture.widthFractions[local107];
				local130 = this.method1307(local59, local66, local105, local96, local87, local46 * local116 >> 12);
				arg0[local107] = local130 * local29 >> 12;
			}
		}
		for (@Pc(148) int local148 = 1; local148 < this.anInt1043; local148++) {
			local29 = this.aShortArray18[local148];
			if (local29 > 8 || local29 < -8) {
				local46 = this.aShortArray19[local148] << 12;
				local59 = local12 * local46 >> 12;
				local66 = this.anInt1051 * local46 >> 12;
				local53 = local46 * this.anInt1050 >> 12;
				local70 = local59 >> 12;
				local74 = local70 + 1;
				if (local74 >= local53) {
					local74 = 0;
				}
				local59 &= 0xFFF;
				local87 = Class57.fadeCurves[local59];
				local96 = this.aByteArray12[local70 & 0xFF] & 0xFF;
				local105 = this.aByteArray12[local74 & 0xFF] & 0xFF;
				if (this.aBoolean85 && local148 == this.anInt1043 - 1) {
					for (local107 = 0; local107 < Texture.width; local107++) {
						local116 = this.anInt1051 * Texture.widthFractions[local107];
						local130 = this.method1307(local59, local66, local105, local96, local87, local116 * local46 >> 12);
						local130 = arg0[local107] + (local29 * local130 >> 12);
						arg0[local107] = (local130 >> 1) + 2048;
					}
				} else {
					for (local107 = 0; local107 < Texture.width; local107++) {
						local116 = Texture.widthFractions[local107] * this.anInt1051;
						local130 = this.method1307(local59, local66, local105, local96, local87, local116 * local46 >> 12);
						arg0[local107] += local130 * local29 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)V")
	private void method1309() {
		@Pc(31) int local31;
		if (this.anInt1049 > 0) {
			this.aShortArray19 = new short[this.anInt1043];
			this.aShortArray18 = new short[this.anInt1043];
			for (local31 = 0; local31 < this.anInt1043; local31++) {
				this.aShortArray18[local31] = (short) (Math.pow((double) ((float) this.anInt1049 / 4096.0F), (double) local31) * 4096.0D);
				this.aShortArray19[local31] = (short) Math.pow(2.0D, (double) local31);
			}
		} else if (this.aShortArray18 != null && this.aShortArray18.length == this.anInt1043) {
			this.aShortArray19 = new short[this.anInt1043];
			for (local31 = 0; local31 < this.anInt1043; local31++) {
				this.aShortArray19[local31] = (short) Math.pow(2.0D, (double) local31);
			}
		}
	}
}
