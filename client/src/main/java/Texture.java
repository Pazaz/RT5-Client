import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Texture extends SecondaryNode {

	@OriginalMember(owner = "client!gg", name = "B", descriptor = "[I")
	public static final int[] brightnessMap = new int[256];
	@OriginalMember(owner = "client!oq", name = "w", descriptor = "Lclient!ci;")
	public static TextureProviderInterface provider;
	@OriginalMember(owner = "client!ge", name = "e", descriptor = "Lclient!r;")
	public static Js5 spritesArchive;
	@OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
	public static int width;
	@OriginalMember(owner = "client!th", name = "t", descriptor = "[I")
	public static int[] widthFractions;
	@OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
	public static int anInt1721;
	@OriginalMember(owner = "client!rf", name = "db", descriptor = "I")
	public static int anInt5653;
	@OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
	public static int height;
	@OriginalMember(owner = "client!as", name = "a", descriptor = "[I")
	public static int[] heightFractions;
	@OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
	public static int heightMask;
	@OriginalMember(owner = "client!qm", name = "I", descriptor = "[I")
	private final int[] anIntArray370;

	@OriginalMember(owner = "client!qm", name = "L", descriptor = "[I")
	private final int[] anIntArray371;

	@OriginalMember(owner = "client!qm", name = "D", descriptor = "Lclient!jq;")
	private final TextureOp textureOp3;

	@OriginalMember(owner = "client!qm", name = "K", descriptor = "Lclient!jq;")
	private final TextureOp textureOp1;

	@OriginalMember(owner = "client!qm", name = "C", descriptor = "Lclient!jq;")
	private final TextureOp textureOp2;

	@OriginalMember(owner = "client!qm", name = "F", descriptor = "[Lclient!jq;")
	private final TextureOp[] textureOps;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Texture(@OriginalArg(0) Packet buffer) {
		@Pc(7) int local7 = buffer.g1();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.textureOps = new TextureOp[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) TextureOp local26 = Static286.method4928(buffer);
			if (local26.method6478() >= 0) {
				local9++;
			}
			if (local26.method6482() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.ops.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = buffer.g1();
			}
			this.textureOps[local20] = local26;
		}
		this.anIntArray371 = new int[local9];
		this.anIntArray370 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(95) int local95 = 0; local95 < local7; local95++) {
			@Pc(102) TextureOp local102 = this.textureOps[local95];
			local50 = local102.ops.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.ops[local108] = this.textureOps[local14[local95][local108]];
			}
			@Pc(130) int local130 = local102.method6478();
			@Pc(134) int local134 = local102.method6482();
			if (local130 > 0) {
				this.anIntArray371[local9++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray370[local11++] = local134;
			}
			local14[local95] = null;
		}
		this.textureOp1 = this.textureOps[buffer.g1()];
		this.textureOp2 = this.textureOps[buffer.g1()];
		this.textureOp3 = this.textureOps[buffer.g1()];
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Lclient!jq;")
	public static TextureOp create(@OriginalArg(0) int op) {
		if (op == 0) {
			return new TextureOp0();
		} else if (op == 1) {
			return new TextureOp1();
		} else if (op == 2) {
			return new TextureOp2();
		} else if (op == 3) {
			return new TextureOp3();
		} else if (op == 4) {
			return new TextureOp4();
		} else if (op == 5) {
			return new TextureOp5();
		} else if (op == 6) {
			return new TextureOp6();
		} else if (op == 7) {
			return new TextureOp7();
		} else if (op == 8) {
			return new TextureOp8();
		} else if (op == 9) {
			return new TextureOp9();
		} else if (op == 10) {
			return new TextureOp10();
		} else if (op == 11) {
			return new TextureOp11();
		} else if (op == 12) {
			return new TextureOp12();
		} else if (op == 13) {
			return new TextureOp13();
		} else if (op == 14) {
			return new TextureOp14();
		} else if (op == 15) {
			return new TextureOp15();
		} else if (op == 16) {
			return new TextureOp16();
		} else if (op == 17) {
			return new TextureOp17();
		} else if (op == 18) {
			return new TextureOp18();
		} else if (op == 19) {
			return new TextureOp19();
		} else if (op == 20) {
			return new TextureOp20();
		} else if (op == 21) {
			return new TextureOp21();
		} else if (op == 22) {
			return new TextureOp22();
		} else if (op == 23) {
			return new TextureOp23();
		} else if (op == 24) {
			return new TextureOp24();
		} else if (op == 25) {
			return new TextureOp25();
		} else if (op == 26) {
			return new TextureOp26();
		} else if (op == 27) {
			return new TextureOp27();
		} else if (op == 28) {
			return new TextureOp28();
		} else if (op == 29) {
			return new TextureOp29();
		} else if (op == 30) {
			return new TextureOp30();
		} else if (op == 31) {
			return new TextureOp31();
		} else if (op == 32) {
			return new TextureOp32();
		} else if (op == 33) {
			return new TextureOp33();
		} else if (op == 34) {
			return new TextureOp34();
		} else if (op == 35) {
			return new TextureOp35();
		} else if (op == 36) {
			return new TextureOp36();
		} else if (op == 37) {
			return new TextureOp37();
		} else if (op == 38) {
			return new TextureOp38();
		} else if (op == 39) {
			return new TextureOp39();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIB)V")
	public static void setSize(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != width) {
			widthFractions = new int[arg0];
			for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
				widthFractions[local9] = (local9 << 12) / arg0;
			}
			anInt1721 = arg0 - 1;
			width = arg0;
			anInt5653 = arg0 * 32;
		}
		if (arg1 == height) {
			return;
		}
		if (arg1 == width) {
			heightFractions = widthFractions;
		} else {
			heightFractions = new int[arg1];
			for (@Pc(72) int local72 = 0; local72 < arg1; local72++) {
				heightFractions[local72] = (local72 << 12) / arg1;
			}
		}
		heightMask = arg1 - 1;
		height = arg1;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(DI)V")
	public static void setBrightness(@OriginalArg(0) double arg0) {
		if (Static109.aDouble1 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			brightnessMap[local7] = local19 > 255 ? 255 : local19;
		}
		Static109.aDouble1 = arg0;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZLclient!r;Lclient!ci;ZII)[F")
	public float[] method4956(@OriginalArg(1) Js5 arg0, @OriginalArg(2) TextureProviderInterface arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		spritesArchive = arg0;
		provider = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.textureOps.length; local11++) {
			this.textureOps[local11].method6475(arg3, arg4);
		}
		setSize(arg4, arg3);
		@Pc(38) float[] local38 = new float[arg4 * arg3 * 4];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < arg3; local55++) {
			@Pc(71) int[] local71;
			@Pc(79) int[] local79;
			@Pc(75) int[] local75;
			if (this.textureOp1.monochrome) {
				@Pc(87) int[] local87 = this.textureOp1.getMonochromeOutput(local55);
				local71 = local87;
				local75 = local87;
				local79 = local87;
			} else {
				@Pc(67) int[][] local67 = this.textureOp1.getColorOutput(local55);
				local71 = local67[0];
				local75 = local67[2];
				local79 = local67[1];
			}
			@Pc(105) int[] local105;
			if (this.textureOp2.monochrome) {
				local105 = this.textureOp2.getMonochromeOutput(local55);
			} else {
				local105 = this.textureOp2.getColorOutput(local55)[0];
			}
			if (arg2) {
				local53 = local55 << 2;
			}
			@Pc(131) int[] local131;
			if (this.textureOp3.monochrome) {
				local131 = this.textureOp3.getMonochromeOutput(local55);
			} else {
				local131 = this.textureOp3.getColorOutput(local55)[0];
			}
			for (@Pc(143) int local143 = arg4 - 1; local143 >= 0; local143--) {
				@Pc(152) float local152 = (float) local105[local143] / 4096.0F;
				@Pc(165) float local165 = ((float) local131[local143] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local152 < 0.0F) {
					local152 = 0.0F;
				} else if (local152 > 1.0F) {
					local152 = 1.0F;
				}
				local38[local53++] = local165 * (float) local71[local143];
				local38[local53++] = local165 * (float) local79[local143];
				local38[local53++] = (float) local75[local143] * local165;
				local38[local53++] = local152;
				if (arg2) {
					local53 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(236) int local236 = 0; local236 < this.textureOps.length; local236++) {
			this.textureOps[local236].clearImageCache();
		}
		return local38;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!ci;Lclient!r;)Z")
	public boolean method4957(@OriginalArg(1) TextureProviderInterface arg0, @OriginalArg(2) Js5 arg1) {
		@Pc(9) int local9;
		if (Static123.anInt2421 >= 0) {
			for (local9 = 0; local9 < this.anIntArray371.length; local9++) {
				if (!arg1.isFileReady(this.anIntArray371[local9], Static123.anInt2421)) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray371.length; local9++) {
				if (!arg1.isFileReady(this.anIntArray371[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray370.length; local9++) {
			if (!arg0.method2657(this.anIntArray370[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZDIILclient!r;ZILclient!ci;)[I")
	public int[] method4958(@OriginalArg(0) boolean arg0, @OriginalArg(1) double arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Js5 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) TextureProviderInterface arg6) {
		spritesArchive = arg4;
		provider = arg6;
		for (@Pc(19) int local19 = 0; local19 < this.textureOps.length; local19++) {
			this.textureOps[local19].method6475(arg3, arg2);
		}
		setBrightness(arg1);
		setSize(arg2, arg3);
		@Pc(47) int[] local47 = new int[arg3 * arg2];
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(55) byte local55;
		if (arg5) {
			local51 = arg2 - 1;
			local53 = -1;
			local55 = -1;
		} else {
			local51 = 0;
			local53 = arg2;
			local55 = 1;
		}
		@Pc(67) int local67 = 0;
		for (@Pc(69) int local69 = 0; local69 < arg3; local69++) {
			if (arg0) {
				local67 = local69;
			}
			@Pc(87) int[] local87;
			@Pc(89) int[] local89;
			@Pc(91) int[] local91;
			if (this.textureOp1.monochrome) {
				@Pc(85) int[] local85 = this.textureOp1.getMonochromeOutput(local69);
				local87 = local85;
				local89 = local85;
				local91 = local85;
			} else {
				@Pc(99) int[][] local99 = this.textureOp1.getColorOutput(local69);
				local87 = local99[0];
				local89 = local99[1];
				local91 = local99[2];
			}
			for (@Pc(113) int local113 = local51; local113 != local53; local113 += local55) {
				@Pc(121) int local121 = local87[local113] >> 4;
				if (local121 > 255) {
					local121 = 255;
				}
				if (local121 < 0) {
					local121 = 0;
				}
				@Pc(139) int local139 = local89[local113] >> 4;
				if (local139 > 255) {
					local139 = 255;
				}
				if (local139 < 0) {
					local139 = 0;
				}
				@Pc(156) int local156 = local91[local113] >> 4;
				if (local156 > 255) {
					local156 = 255;
				}
				local139 = brightnessMap[local139];
				local121 = brightnessMap[local121];
				if (local156 < 0) {
					local156 = 0;
				}
				local156 = brightnessMap[local156];
				@Pc(189) int local189 = (local139 << 8) + (local121 << 16) + local156;
				if (local189 != 0) {
					local189 |= 0xFF000000;
				}
				local47[local67++] = local189;
				if (arg0) {
					local67 += arg2 - 1;
				}
			}
		}
		for (@Pc(229) int local229 = 0; local229 < this.textureOps.length; local229++) {
			this.textureOps[local229].clearImageCache();
		}
		return local47;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!ci;Lclient!r;DIZII)[I")
	public int[] method4960(@OriginalArg(0) TextureProviderInterface arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) double arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		spritesArchive = arg1;
		provider = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.textureOps.length; local11++) {
			this.textureOps[local11].method6475(arg5, arg4);
		}
		setBrightness(arg2);
		setSize(arg4, arg5);
		@Pc(45) int[] local45 = new int[arg5 * 4 * arg4];
		@Pc(47) int local47 = 0;
		for (@Pc(54) int local54 = 0; local54 < arg5; local54++) {
			@Pc(68) int[] local68;
			@Pc(70) int[] local70;
			@Pc(72) int[] local72;
			@Pc(66) int[] local66;
			if (this.textureOp1.monochrome) {
				local66 = this.textureOp1.getMonochromeOutput(local54);
				local68 = local66;
				local70 = local66;
				local72 = local66;
			} else {
				@Pc(80) int[][] local80 = this.textureOp1.getColorOutput(local54);
				local68 = local80[0];
				local70 = local80[1];
				local72 = local80[2];
			}
			if (this.textureOp2.monochrome) {
				local66 = this.textureOp2.getMonochromeOutput(local54);
			} else {
				local66 = this.textureOp2.getColorOutput(local54)[0];
			}
			if (arg3) {
				local47 = local54;
			}
			for (@Pc(120) int local120 = arg4 - 1; local120 >= 0; local120--) {
				@Pc(128) int local128 = local68[local120] >> 4;
				if (local128 > 255) {
					local128 = 255;
				}
				if (local128 < 0) {
					local128 = 0;
				}
				@Pc(143) int local143 = local70[local120] >> 4;
				if (local143 > 255) {
					local143 = 255;
				}
				if (local143 < 0) {
					local143 = 0;
				}
				@Pc(158) int local158 = local72[local120] >> 4;
				if (local158 > 255) {
					local158 = 255;
				}
				local128 = brightnessMap[local128];
				if (local158 < 0) {
					local158 = 0;
				}
				local143 = brightnessMap[local143];
				local158 = brightnessMap[local158];
				@Pc(205) int local205;
				if (local128 == 0 && local143 == 0 && local158 == 0) {
					local205 = 0;
				} else {
					local205 = local66[local120] >> 4;
					if (local205 > 255) {
						local205 = 255;
					}
					if (local205 < 0) {
						local205 = 0;
					}
				}
				local45[local47++] = local158 + (local143 << 8) + (local205 << 24) + (local128 << 16);
				if (arg3) {
					local47 += arg4 - 1;
				}
			}
		}
		for (@Pc(261) int local261 = 0; local261 < this.textureOps.length; local261++) {
			this.textureOps[local261].clearImageCache();
		}
		return local45;
	}
}
