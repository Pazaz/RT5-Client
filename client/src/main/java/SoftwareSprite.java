import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public abstract class SoftwareSprite extends Sprite {

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
	protected int anInt1916;

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
	protected int anInt1919;

	@OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
	protected int anInt1929;

	@OriginalMember(owner = "client!ik", name = "x", descriptor = "I")
	protected int anInt1938;

	@OriginalMember(owner = "client!ik", name = "G", descriptor = "[I")
	private int[] anIntArray124;

	@OriginalMember(owner = "client!ik", name = "y", descriptor = "Lclient!j;")
	protected final Class19_Sub2 aClass19_Sub2_5;

	@OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
	protected final int anInt1936;

	@OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
	protected final int anInt1944;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!j;II)V")
	protected SoftwareSprite(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass19_Sub2_5 = arg0;
		this.anInt1936 = arg1;
		this.anInt1944 = arg2;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFFFLclient!kf;II)V")
	@Override
	protected final void method6387(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class78 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass19_Sub2_5.method2912()) {
			throw new IllegalStateException();
		}
		this.method1990(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class78_Sub1 local18 = (Class78_Sub1) arg6;
		this.method1989(local18.anIntArray139, local18.anIntArray140, Static149.anInt1945 - arg7, -arg8 - (Static149.anInt1933 - Static149.anInt1943));
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([I[III)V")
	protected abstract void method1989(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V")
	public abstract void method6401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method6394(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass19_Sub2_5.method2912()) {
			throw new IllegalStateException();
		}
		this.method1990(arg0, arg1, arg2, arg3, arg4, arg5);
		Static149.anInt1920 = arg7;
		if (arg6 != 0) {
			Static149.anInt1925 = arg7 >>> 24;
			Static149.anInt1942 = 256 - Static149.anInt1925;
			if (arg6 == 1) {
				Static149.anInt1923 = arg7 >> 16 & 0xFF;
				Static149.anInt1941 = arg7 >> 8 & 0xFF;
				Static149.anInt1922 = arg7 & 0xFF;
			} else {
				Static149.anInt1927 = arg7 >>> 24;
				Static149.anInt1921 = 256 - Static149.anInt1927;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static149.anInt1921 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static149.anInt1921 & 0xFF0000;
				Static149.anInt1940 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method1991(0);
		} else if (arg6 == 1) {
			this.method1991(1);
		} else if (arg6 == 2) {
			this.method1991(2);
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IILclient!kf;II)V")
	public abstract void method6383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "()I")
	@Override
	public final int method6382() {
		return this.anInt1944;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method6391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1938 = arg0;
		this.anInt1916 = arg1;
		this.anInt1919 = arg2;
		this.anInt1929 = arg3;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method6395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "()I")
	@Override
	public final int method6384() {
		return this.anInt1916 + this.anInt1944 + this.anInt1929;
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "()I")
	@Override
	public final int method6389() {
		return this.anInt1936;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method6397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass19_Sub2_5.method2912()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray124 == null) {
			this.anIntArray124 = new int[4];
		}
		this.aClass19_Sub2_5.method2851(this.anIntArray124);
		this.aClass19_Sub2_5.method2817(this.aClass19_Sub2_5.anInt2868, this.aClass19_Sub2_5.anInt2857, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method6399();
		@Pc(40) int local40 = this.method6384();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method6401(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass19_Sub2_5.method2895(this.anIntArray124[0], this.anIntArray124[1], this.anIntArray124[2], this.anIntArray124[3]);
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "()I")
	@Override
	public final int method6399() {
		return this.anInt1938 + this.anInt1936 + this.anInt1919;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFFF)V")
	private void method1990(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt1938 + this.anInt1936 + this.anInt1919;
		@Pc(17) int local17 = this.anInt1916 + this.anInt1944 + this.anInt1929;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt1936 || local17 != this.anInt1944) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt1916;
			local65 = local53 * (float) this.anInt1916;
			local71 = local32 * (float) this.anInt1938;
			local77 = local39 * (float) this.anInt1938;
			@Pc(84) float local84 = -local32 * (float) this.anInt1919;
			@Pc(91) float local91 = -local39 * (float) this.anInt1919;
			@Pc(98) float local98 = -local46 * (float) this.anInt1929;
			@Pc(105) float local105 = -local53 * (float) this.anInt1929;
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
		if (local46 < (float) this.aClass19_Sub2_5.anInt2868) {
			local46 = this.aClass19_Sub2_5.anInt2868;
		}
		if (local53 > (float) this.aClass19_Sub2_5.anInt2854) {
			local53 = this.aClass19_Sub2_5.anInt2854;
		}
		if (local59 < (float) this.aClass19_Sub2_5.anInt2857) {
			local59 = this.aClass19_Sub2_5.anInt2857;
		}
		if (local65 > (float) this.aClass19_Sub2_5.anInt2859) {
			local65 = this.aClass19_Sub2_5.anInt2859;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static149.anInt1934 = this.aClass19_Sub2_5.anInt2863;
		Static149.anInt1918 = (int) ((float) ((int) local59 * Static149.anInt1934) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static149.anInt1915 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt1936 / local71);
		Static149.anInt1928 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt1944 / local77);
		Static149.anInt1924 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt1936 / local77);
		Static149.anInt1930 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt1944 / local71);
		Static149.anInt1932 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static149.anInt1926 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static149.anInt1939 = (this.anInt1936 >> 1 << 12) + (Static149.anInt1926 * Static149.anInt1924 >> 4);
		Static149.anInt1917 = (this.anInt1944 >> 1 << 12) + (Static149.anInt1926 * Static149.anInt1930 >> 4);
		Static149.anInt1935 = Static149.anInt1932 * Static149.anInt1915 >> 4;
		Static149.anInt1931 = Static149.anInt1932 * Static149.anInt1928 >> 4;
		Static149.anInt1945 = (int) local46;
		Static149.anInt1937 = (int) local53;
		Static149.anInt1943 = (int) local59;
		Static149.anInt1933 = (int) local65;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)V")
	protected abstract void method1991(@OriginalArg(0) int arg0);
}
