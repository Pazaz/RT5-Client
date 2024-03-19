import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!eh", name = "lb", descriptor = "[[Lclient!ro;")
	public static Class177[][] lb;

	@OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
	private int anInt1833;

	@OriginalMember(owner = "client!eh", name = "U", descriptor = "I")
	private int anInt1835;

	@OriginalMember(owner = "client!eh", name = "W", descriptor = "I")
	private int anInt1837;

	@OriginalMember(owner = "client!eh", name = "X", descriptor = "I")
	private int anInt1838;

	@OriginalMember(owner = "client!eh", name = "Y", descriptor = "I")
	private int anInt1839;

	@OriginalMember(owner = "client!eh", name = "bb", descriptor = "I")
	private int anInt1841;

	@OriginalMember(owner = "client!eh", name = "fb", descriptor = "I")
	private int anInt1843 = 0;

	@OriginalMember(owner = "client!eh", name = "gb", descriptor = "I")
	private int anInt1844 = 0;

	@OriginalMember(owner = "client!eh", name = "eb", descriptor = "I")
	private int anInt1842 = 0;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(IIII)V")
	private void method1560(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(27) int local27 = arg0 > 2048 ? arg0 + arg2 - (arg2 * arg0 >> 12) : (arg2 + 4096) * arg0 >> 12;
		if (local27 <= 0) {
			this.anInt1839 = this.anInt1837 = this.anInt1838 = arg0;
			return;
		}
		@Pc(48) int local48 = arg1 * 6;
		@Pc(55) int local55 = arg0 + arg0 - local27;
		@Pc(64) int local64 = (local27 - local55 << 12) / local27;
		@Pc(68) int local68 = local48 >> 12;
		@Pc(75) int local75 = local48 - (local68 << 12);
		@Pc(83) int local83 = local27 * local64 >> 12;
		@Pc(89) int local89 = local83 * local75 >> 12;
		@Pc(94) int local94 = local55 + local89;
		@Pc(98) int local98 = local27 - local89;
		if (local68 == 0) {
			this.anInt1839 = local27;
			this.anInt1838 = local55;
			this.anInt1837 = local94;
		} else if (local68 == 1) {
			this.anInt1839 = local98;
			this.anInt1837 = local27;
			this.anInt1838 = local55;
		} else if (local68 == 2) {
			this.anInt1839 = local55;
			this.anInt1837 = local27;
			this.anInt1838 = local94;
		} else if (local68 == 3) {
			this.anInt1837 = local98;
			this.anInt1838 = local27;
			this.anInt1839 = local55;
		} else if (local68 == 4) {
			this.anInt1838 = local27;
			this.anInt1839 = local94;
			this.anInt1837 = local55;
		} else if (local68 == 5) {
			this.anInt1838 = local98;
			this.anInt1837 = local55;
			this.anInt1839 = local27;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt1844 = arg1.method5762();
		} else if (arg0 == 1) {
			this.anInt1842 = (arg1.method5772() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt1843 = (arg1.method5772() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6081(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass68_41.method2002(arg0);
		if (super.aClass68_41.aBoolean157) {
			@Pc(21) int[][] local21 = this.method6082(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static64.anInt1755; local47++) {
				this.method1562(local29[local47], local25[local47], local33[local47]);
				this.anInt1841 += this.anInt1842;
				this.anInt1833 += this.anInt1843;
				for (this.anInt1835 += this.anInt1844; this.anInt1835 < 0; this.anInt1835 += 4096) {
				}
				while (this.anInt1835 > 4096) {
					this.anInt1835 -= 4096;
				}
				if (this.anInt1841 < 0) {
					this.anInt1841 = 0;
				}
				if (this.anInt1841 > 4096) {
					this.anInt1841 = 4096;
				}
				if (this.anInt1833 < 0) {
					this.anInt1833 = 0;
				}
				if (this.anInt1833 > 4096) {
					this.anInt1833 = 4096;
				}
				this.method1560(this.anInt1833, this.anInt1835, this.anInt1841);
				local37[local47] = this.anInt1839;
				local41[local47] = this.anInt1837;
				local45[local47] = this.anInt1838;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(IIII)V")
	private void method1562(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = arg0 < arg1 ? arg1 : arg0;
		@Pc(25) int local25 = arg0 > arg1 ? arg1 : arg0;
		@Pc(32) int local32 = arg2 <= local18 ? local18 : arg2;
		@Pc(39) int local39 = local25 <= arg2 ? local25 : arg2;
		@Pc(44) int local44 = local32 - local39;
		this.anInt1833 = (local39 + local32) / 2;
		if (this.anInt1833 > 0 && this.anInt1833 < 4096) {
			this.anInt1841 = (local44 << 12) / (this.anInt1833 <= 2048 ? this.anInt1833 * 2 : 8192 - (this.anInt1833 * 2));
		} else {
			this.anInt1841 = 0;
		}
		if (local44 <= 0) {
			this.anInt1835 = 0;
			return;
		}
		@Pc(105) int local105 = (local32 - arg1 << 12) / local44;
		@Pc(114) int local114 = (local32 - arg0 << 12) / local44;
		@Pc(123) int local123 = (local32 - arg2 << 12) / local44;
		if (arg1 == local32) {
			this.anInt1835 = local39 == arg0 ? local123 + 20480 : -local114 + 4096;
		} else if (arg0 == local32) {
			this.anInt1835 = arg2 == local39 ? local105 + 4096 : -local123 + 12288;
		} else {
			this.anInt1835 = arg1 == local39 ? local114 + 12288 : -local105 + 20480;
		}
		this.anInt1835 /= 6;
	}
}
