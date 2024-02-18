import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.lh;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!kea", name = "Dg", descriptor = "[I")
	public static final int[] anIntArray392 = new int[] { 77, 80 };

	@OriginalMember(owner = "client!kea", name = "Rg", descriptor = "[F")
	public static final float[] aFloatArray36 = new float[16];

	@OriginalMember(owner = "client!kea", name = "yg", descriptor = "[I")
	private static final int[] anIntArray393 = new int[] { 22, 23 };

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!fba;Z)I")
	public static int method4857(@OriginalArg(0) Class121 arg0) {
		if (arg0 == Static185.aClass121_3) {
			return 2;
		} else if (arg0 == Static209.aClass121_4) {
			return 4;
		} else if (Static725.aClass121_6 == arg0) {
			return 26;
		} else if (arg0 == Static438.aClass121_5) {
			return 7;
		} else if (Static329.aClass121_2 == arg0) {
			return 10;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!jagdx/D3DPRESENT_PARAMETERS;ILclient!jagdx/IDirect3D;III)Z")
	public static boolean method4859(@OriginalArg(0) D3DPRESENT_PARAMETERS arg0, @OriginalArg(1) int arg1, @OriginalArg(2) IDirect3D arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(10) int local10 = 0;
		try {
			@Pc(14) D3DDISPLAYMODE local14 = new D3DDISPLAYMODE();
			if (lh.a(arg2.a(arg1, local14), true)) {
				return false;
			}
			label82: while (arg4 >= 0) {
				if (arg4 != 1) {
					local10 = arg4;
					for (@Pc(42) int local42 = 0; local42 < anIntArray393.length; local42++) {
						if (arg2.CheckDeviceType(arg1, arg3, local14.Format, anIntArray393[local42], true) == 0 && arg2.CheckDeviceFormat(arg1, arg3, local14.Format, 1, 1, anIntArray393[local42]) == 0 && (arg4 == 0 || arg2.CheckDeviceMultiSampleType(arg1, arg3, anIntArray393[local42], true, local10) == 0)) {
							for (@Pc(109) int local109 = 0; local109 < anIntArray392.length; local109++) {
								if (arg2.CheckDeviceFormat(arg1, arg3, local14.Format, 2, 1, anIntArray392[local109]) == 0 && arg2.CheckDepthStencilMatch(arg1, arg3, local14.Format, anIntArray393[local42], anIntArray392[local109]) == 0 && (arg4 == 0 || arg2.CheckDeviceMultiSampleType(arg1, arg3, anIntArray392[local42], true, local10) == 0)) {
									local3 = anIntArray393[local42];
									local1 = anIntArray392[local109];
									break label82;
								}
							}
						}
					}
				}
				arg4--;
			}
			if (arg4 < 0 || local3 == 0 || local1 == 0) {
				return false;
			}
			arg0.MultiSampleType = local10;
			arg0.BackBufferFormat = local3;
			arg0.AutoDepthStencilFormat = local1;
			arg0.MultiSampleQuality = 0;
			return true;
		} catch (@Pc(218) Throwable local218) {
			return false;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILclient!nga;)I")
	public static int method4860(@OriginalArg(1) Class259 arg0) {
		if (arg0 == Static60.aClass259_3) {
			return 2;
		} else if (arg0 == Static363.aClass259_14) {
			return 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!hla;B)I")
	public static int method4862(@OriginalArg(0) Class168 arg0) {
		if (arg0 == Static189.aClass168_2) {
			return 2;
		} else if (arg0 == Static207.aClass168_4) {
			return 0;
		} else if (arg0 == Static188.aClass168_1) {
			return 1;
		} else if (arg0 == Static454.aClass168_5) {
			return 3;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(ILclient!uf;)I")
	public static int method4863(@OriginalArg(1) Class370 arg0) {
		if (arg0 == Static223.aClass370_9) {
			return 1;
		} else if (Static431.aClass370_5 == arg0) {
			return 2;
		} else if (Static104.aClass370_1 == arg0) {
			return 3;
		} else if (Static483.aClass370_7 == arg0) {
			return 4;
		} else if (arg0 == Static450.aClass370_6) {
			return 256;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILclient!fma;)I")
	public static int method4865(@OriginalArg(1) Class131 arg0) {
		if (Static437.aClass131_4 == arg0) {
			return 2;
		} else if (Static495.aClass131_5 == arg0) {
			return 3;
		} else if (arg0 == Static29.aClass131_1) {
			return 1;
		} else if (Static104.aClass131_2 == arg0) {
			return 4;
		} else if (arg0 == Static694.aClass131_6) {
			return 6;
		} else if (Static105.aClass131_3 == arg0) {
			return 5;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!wda;Lclient!eba;I)I")
	public static int method4868(@OriginalArg(0) Class397 arg0, @OriginalArg(1) Class92 arg1) {
		if (Static702.aClass397_16 == arg0) {
			if (Static685.aClass92_16 == arg1) {
				return 22;
			}
			if (arg1 == Static172.aClass92_8) {
				return 21;
			}
			if (arg1 == Static679.aClass92_15) {
				return 28;
			}
			if (arg1 == Static661.aClass92_10) {
				return 50;
			}
			if (arg1 == Static482.aClass92_13) {
				return 51;
			}
			if (Static42.aClass92_3 == arg1) {
				return 77;
			}
		}
		throw new IllegalArgumentException("");
	}
}
