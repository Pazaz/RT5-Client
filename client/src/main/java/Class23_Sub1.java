import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public abstract class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	protected int anInt9294;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
	protected int anInt9295;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
	protected int anInt9298;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
	protected int anInt9308;

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "[I")
	private int[] anIntArray713;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "Lclient!iaa;")
	protected final Class19_Sub2 aClass19_Sub2_10;

	@OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
	public final int anInt9302;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
	public final int anInt9306;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!iaa;II)V")
	public Class23_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass19_Sub2_10 = arg0;
		this.anInt9302 = arg1;
		this.anInt9306 = arg2;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "()I")
	@Override
	public final int method8192() {
		return this.anInt9308 + this.anInt9306 + this.anInt9294;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method8195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([I)V")
	@Override
	public final void method8193(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt9298;
		arg0[1] = this.anInt9308;
		arg0[2] = this.anInt9295;
		arg0[3] = this.anInt9294;
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "()I")
	@Override
	public final int method8182() {
		return this.anInt9306;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method8190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(IIIIIIIII)V")
	public abstract void method8207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method8208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "()I")
	@Override
	public final int method8199() {
		return this.anInt9302;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method8194(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass19_Sub2_10.method3785()) {
			throw new IllegalStateException();
		} else if (this.method8211(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(22) Class1_Sub1 local22 = (Class1_Sub1) arg6;
			this.method8210(local22.anIntArray334, local22.anIntArray335, Static513.anInt9301 - arg7, -arg8 - (Static513.anInt9297 - Static513.anInt9314));
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method8200(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass19_Sub2_10.method3785()) {
			throw new IllegalStateException();
		} else if (this.method8211(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static513.anInt9313 = arg7;
			if (arg6 != 1) {
				Static513.anInt9304 = arg7 >>> 24;
				Static513.anInt9312 = 256 - Static513.anInt9304;
				if (arg6 == 0) {
					Static513.anInt9319 = arg7 >> 16 & 0xFF;
					Static513.anInt9299 = arg7 >> 8 & 0xFF;
					Static513.anInt9315 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static513.anInt9296 = arg7 >>> 24;
					Static513.anInt9300 = 256 - Static513.anInt9296;
					@Pc(73) int local73 = (arg7 & 0xFF00FF) * Static513.anInt9300 & 0xFF00FF00;
					@Pc(81) int local81 = (arg7 & 0xFF00) * Static513.anInt9300 & 0xFF0000;
					Static513.anInt9305 = (local73 | local81) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method8209(1);
			} else if (arg6 == 0) {
				this.method8209(0);
			} else if (arg6 == 3) {
				this.method8209(3);
			} else if (arg6 == 2) {
				this.method8209(2);
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "()I")
	@Override
	public final int method8203() {
		return this.anInt9298 + this.anInt9302 + this.anInt9295;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(IIII)V")
	@Override
	public final void method8184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9298 = arg0;
		this.anInt9308 = arg1;
		this.anInt9295 = arg2;
		this.anInt9294 = arg3;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V")
	public abstract void method8197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method8189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass19_Sub2_10.method3785()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray713 == null) {
			this.anIntArray713 = new int[4];
		}
		this.aClass19_Sub2_10.K(this.anIntArray713);
		this.aClass19_Sub2_10.T(this.aClass19_Sub2_10.anInt4192, this.aClass19_Sub2_10.anInt4186, arg0 + arg2, arg1 + arg3);
		@Pc(40) int local40 = this.method8203();
		@Pc(43) int local43 = this.method8192();
		@Pc(51) int local51 = (arg2 + local40 - 1) / local40;
		@Pc(59) int local59 = (arg3 + local43 - 1) / local43;
		for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
			@Pc(66) int local66 = local61 * local43;
			for (@Pc(68) int local68 = 0; local68 < local51; local68++) {
				this.method8197(arg0 + local68 * local40, arg1 + local66, arg4, arg5, arg6);
			}
		}
		this.aClass19_Sub2_10.KA(this.anIntArray713[0], this.anIntArray713[1], this.anIntArray713[2], this.anIntArray713[3]);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)V")
	protected abstract void method8209(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([I[III)V")
	protected abstract void method8210(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method8211(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt9298 + this.anInt9302 + this.anInt9295;
		@Pc(17) int local17 = this.anInt9308 + this.anInt9306 + this.anInt9294;
		@Pc(34) float local34;
		@Pc(41) float local41;
		@Pc(48) float local48;
		@Pc(55) float local55;
		@Pc(61) float local61;
		@Pc(67) float local67;
		@Pc(73) float local73;
		@Pc(79) float local79;
		if (local8 != this.anInt9302 || local17 != this.anInt9306) {
			local34 = (arg2 - arg0) / (float) local8;
			local41 = (arg3 - arg1) / (float) local8;
			local48 = (arg4 - arg0) / (float) local17;
			local55 = (arg5 - arg1) / (float) local17;
			local61 = local48 * (float) this.anInt9308;
			local67 = local55 * (float) this.anInt9308;
			local73 = local34 * (float) this.anInt9298;
			local79 = local41 * (float) this.anInt9298;
			@Pc(86) float local86 = -local34 * (float) this.anInt9295;
			@Pc(93) float local93 = -local41 * (float) this.anInt9295;
			@Pc(100) float local100 = -local48 * (float) this.anInt9294;
			@Pc(107) float local107 = -local55 * (float) this.anInt9294;
			arg0 += local73 + local61;
			arg1 += local79 + local67;
			arg2 += local86 + local61;
			arg3 += local93 + local67;
			arg4 += local73 + local100;
			arg5 += local79 + local107;
		}
		local34 = arg4 + arg2 - arg0;
		local41 = arg3 + arg5 - arg1;
		if (arg0 < arg2) {
			local48 = arg0;
			local55 = arg2;
		} else {
			local48 = arg2;
			local55 = arg0;
		}
		if (arg4 < local48) {
			local48 = arg4;
		}
		if (local34 < local48) {
			local48 = local34;
		}
		if (arg4 > local55) {
			local55 = arg4;
		}
		if (local34 > local55) {
			local55 = local34;
		}
		if (arg1 < arg3) {
			local61 = arg1;
			local67 = arg3;
		} else {
			local61 = arg3;
			local67 = arg1;
		}
		if (arg5 < local61) {
			local61 = arg5;
		}
		if (local41 < local61) {
			local61 = local41;
		}
		if (arg5 > local67) {
			local67 = arg5;
		}
		if (local41 > local67) {
			local67 = local41;
		}
		if (local48 < (float) this.aClass19_Sub2_10.anInt4192) {
			local48 = (float) this.aClass19_Sub2_10.anInt4192;
		}
		if (local55 > (float) this.aClass19_Sub2_10.anInt4200) {
			local55 = (float) this.aClass19_Sub2_10.anInt4200;
		}
		if (local61 < (float) this.aClass19_Sub2_10.anInt4186) {
			local61 = (float) this.aClass19_Sub2_10.anInt4186;
		}
		if (local67 > (float) this.aClass19_Sub2_10.anInt4196) {
			local67 = (float) this.aClass19_Sub2_10.anInt4196;
		}
		local55 = local48 - local55;
		if (local55 >= 0.0F) {
			return false;
		}
		local67 = local61 - local67;
		if (local67 >= 0.0F) {
			return false;
		}
		Static513.anInt9291 = this.aClass19_Sub2_10.anInt4207;
		Static513.anInt9292 = (int) ((float) ((int) local61 * Static513.anInt9291) + local48);
		local73 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local79 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static513.anInt9321 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt9302 / local73);
		Static513.anInt9309 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt9306 / local79);
		Static513.anInt9311 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt9302 / local79);
		Static513.anInt9293 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt9306 / local73);
		Static513.anInt9320 = (int) (local48 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local34) / 4.0F * 16.0F);
		Static513.anInt9307 = (int) (local61 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local41) / 4.0F * 16.0F);
		Static513.anInt9310 = (this.anInt9302 >> 1 << 12) + (Static513.anInt9307 * Static513.anInt9311 >> 4);
		Static513.anInt9317 = (this.anInt9306 >> 1 << 12) + (Static513.anInt9307 * Static513.anInt9293 >> 4);
		Static513.anInt9318 = Static513.anInt9320 * Static513.anInt9321 >> 4;
		Static513.anInt9316 = Static513.anInt9320 * Static513.anInt9309 >> 4;
		Static513.anInt9301 = (int) local48;
		Static513.anInt9303 = (int) local55;
		Static513.anInt9314 = (int) local61;
		Static513.anInt9297 = (int) local67;
		return true;
	}
}
