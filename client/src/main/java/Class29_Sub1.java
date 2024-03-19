import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public abstract class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
	protected int anInt5370;

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
	protected int anInt5387;

	@OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
	protected int anInt5395;

	@OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
	protected int anInt5396;

	@OriginalMember(owner = "client!cg", name = "F", descriptor = "[I")
	private int[] anIntArray396;

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "Lclient!cs;")
	protected final Class40_Sub1 aClass40_Sub1_9;

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
	protected final int anInt5388;

	@OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
	protected final int anInt5394;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!cs;II)V")
	protected Class29_Sub1(@OriginalArg(0) Class40_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass40_Sub1_9 = arg0;
		this.anInt5388 = arg1;
		this.anInt5394 = arg2;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "()I")
	@Override
	public final int method5840() {
		return this.anInt5388;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method5842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5387 = arg0;
		this.anInt5395 = arg1;
		this.anInt5370 = arg2;
		this.anInt5396 = arg3;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([I[III)V")
	protected abstract void method4585(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method5839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass40_Sub1_9.method1233()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray396 == null) {
			this.anIntArray396 = new int[4];
		}
		this.aClass40_Sub1_9.method2772(this.anIntArray396);
		this.aClass40_Sub1_9.method2792(this.aClass40_Sub1_9.anInt1438, this.aClass40_Sub1_9.anInt1435, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method5850();
		@Pc(40) int local40 = this.method5832();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method5836(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass40_Sub1_9.method2732(this.anIntArray396[0], this.anIntArray396[1], this.anIntArray396[2], this.anIntArray396[3]);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(FFFFFF)V")
	private void method4586(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt5387 + this.anInt5388 + this.anInt5370;
		@Pc(17) int local17 = this.anInt5395 + this.anInt5394 + this.anInt5396;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt5388 || local17 != this.anInt5394) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt5395;
			local65 = local53 * (float) this.anInt5395;
			local71 = local32 * (float) this.anInt5387;
			local77 = local39 * (float) this.anInt5387;
			@Pc(84) float local84 = -local32 * (float) this.anInt5370;
			@Pc(91) float local91 = -local39 * (float) this.anInt5370;
			@Pc(98) float local98 = -local46 * (float) this.anInt5396;
			@Pc(105) float local105 = -local53 * (float) this.anInt5396;
			arg0 += local71 + local59;
			arg1 += local77 + local65;
			arg2 += local84 + local59;
			arg3 += local91 + local65;
			arg4 += local71 + local98;
			arg5 += local77 + local105;
		}
		local32 = arg4 + arg2 - arg0;
		local39 = arg3 + arg5 - arg1;
		if (arg0 < arg2) {
			local46 = arg0;
			local53 = arg2;
		} else {
			local46 = arg2;
			local53 = arg0;
		}
		if (arg4 < local46) {
			local46 = arg4;
		}
		if (local32 < local46) {
			local46 = local32;
		}
		if (arg4 > local53) {
			local53 = arg4;
		}
		if (local32 > local53) {
			local53 = local32;
		}
		if (arg1 < arg3) {
			local59 = arg1;
			local65 = arg3;
		} else {
			local59 = arg3;
			local65 = arg1;
		}
		if (arg5 < local59) {
			local59 = arg5;
		}
		if (local39 < local59) {
			local59 = local39;
		}
		if (arg5 > local65) {
			local65 = arg5;
		}
		if (local39 > local65) {
			local65 = local39;
		}
		if (local46 < (float) this.aClass40_Sub1_9.anInt1438) {
			local46 = this.aClass40_Sub1_9.anInt1438;
		}
		if (local53 > (float) this.aClass40_Sub1_9.lb) {
			local53 = this.aClass40_Sub1_9.lb;
		}
		if (local59 < (float) this.aClass40_Sub1_9.anInt1435) {
			local59 = this.aClass40_Sub1_9.anInt1435;
		}
		if (local65 > (float) this.aClass40_Sub1_9.anInt1410) {
			local65 = this.aClass40_Sub1_9.anInt1410;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static34.anInt5397 = this.aClass40_Sub1_9.anInt1412;
		Static34.anInt5384 = (int) ((float) ((int) local59 * Static34.anInt5397) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static34.anInt5377 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt5388 / local71);
		Static34.anInt5390 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt5394 / local77);
		Static34.anInt5372 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt5388 / local77);
		Static34.anInt5379 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt5394 / local71);
		Static34.anInt5380 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static34.anInt5392 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static34.anInt5382 = (this.anInt5388 >> 1 << 12) + (Static34.anInt5392 * Static34.anInt5372 >> 4);
		Static34.anInt5399 = (this.anInt5394 >> 1 << 12) + (Static34.anInt5392 * Static34.anInt5379 >> 4);
		Static34.anInt5391 = Static34.anInt5380 * Static34.anInt5377 >> 4;
		Static34.anInt5373 = Static34.anInt5380 * Static34.anInt5390 >> 4;
		Static34.anInt5376 = (int) local46;
		Static34.anInt5398 = (int) local53;
		Static34.anInt5393 = (int) local59;
		Static34.anInt5378 = (int) local65;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "()I")
	@Override
	public final int method5832() {
		return this.anInt5395 + this.anInt5394 + this.anInt5396;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "()I")
	@Override
	public final int method5838() {
		return this.anInt5394;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method5851(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass40_Sub1_9.method1233()) {
			throw new IllegalStateException();
		}
		this.method4586(arg0, arg1, arg2, arg3, arg4, arg5);
		Static34.anInt5385 = arg7;
		if (arg6 != 0) {
			Static34.anInt5371 = arg7 >>> 24;
			Static34.anInt5386 = 256 - Static34.anInt5371;
			if (arg6 == 1) {
				Static34.anInt5374 = arg7 >> 16 & 0xFF;
				Static34.anInt5400 = arg7 >> 8 & 0xFF;
				Static34.anInt5383 = arg7 & 0xFF;
			} else {
				Static34.anInt5389 = arg7 >>> 24;
				Static34.anInt5375 = 256 - Static34.anInt5389;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static34.anInt5375 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static34.anInt5375 & 0xFF0000;
				Static34.anInt5381 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method4587(0);
		} else if (arg6 == 1) {
			this.method4587(1);
		} else if (arg6 == 2) {
			this.method4587(2);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILclient!sn;II)V")
	public abstract void method5848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class142 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "()I")
	@Override
	public final int method5850() {
		return this.anInt5387 + this.anInt5388 + this.anInt5370;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)V")
	protected abstract void method4587(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIII)V")
	public abstract void method5836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(FFFFFFLclient!sn;II)V")
	@Override
	protected final void method5841(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class142 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass40_Sub1_9.method1233()) {
			throw new IllegalStateException();
		}
		this.method4586(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class142_Sub1 local18 = (Class142_Sub1) arg6;
		this.method4585(local18.anIntArray371, local18.anIntArray372, Static34.anInt5376 - arg7, -arg8 - (Static34.anInt5378 - Static34.anInt5393));
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);
}
