import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class210 {

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "Lclient!qa;")
	private Class29 aClass29_23;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
	private int anInt6666;

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
	private int anInt6669;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
	private int anInt6658 = -1;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "Z")
	private boolean aBoolean479 = true;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
	private final int anInt6668;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
	private final int anInt6661;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "[Lclient!u;")
	private final Class198[] aClass198Array1;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
	private final int anInt6659;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
	private final int anInt6663;

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "[Lclient!u;")
	private final Class198[] aClass198Array2;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Lclient!u;")
	private final Class198 aClass198_1;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(I[Lclient!u;IIII)V")
	public Class210(@OriginalArg(0) int arg0, @OriginalArg(1) Class198[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6668 = arg0;
		this.anInt6661 = arg3;
		this.aClass198Array1 = arg1;
		this.anInt6659 = arg4;
		this.anInt6663 = arg5;
		if (arg1 == null) {
			this.aClass198_1 = null;
			this.aClass198Array2 = null;
		} else {
			this.aClass198Array2 = new Class198[arg1.length];
			this.aClass198_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILclient!nr;)Z")
	public boolean method5659(@OriginalArg(0) int arg0, @OriginalArg(2) Class40 arg1) {
		if (arg0 != this.anInt6658) {
			this.anInt6658 = arg0;
			@Pc(16) int local16 = Static162.method3414(arg0);
			if (local16 > arg0) {
				local16 = Static229.method4360(arg0);
			}
			if (local16 > 512) {
				local16 = 512;
			}
			if (this.anInt6666 != local16) {
				this.anInt6666 = local16;
				this.aClass29_23 = null;
			}
			if (this.aClass198Array1 != null) {
				this.anInt6669 = 0;
				@Pc(53) int[] local53 = new int[this.aClass198Array1.length];
				for (@Pc(55) int local55 = 0; local55 < this.aClass198Array1.length; local55++) {
					@Pc(62) Class198 local62 = this.aClass198Array1[local55];
					if (local62.method5438(this.anInt6661, this.anInt6659, this.anInt6663, this.anInt6658)) {
						local53[this.anInt6669] = local62.anInt6471;
						this.aClass198Array2[this.anInt6669++] = local62;
					}
				}
				Static186.method3746(this.anInt6669 - 1, local53, this.aClass198Array2, 0);
			}
			this.aBoolean479 = true;
		}
		@Pc(115) boolean local115 = false;
		if (this.aBoolean479) {
			this.aBoolean479 = false;
			for (@Pc(126) int local126 = this.anInt6669 - 1; local126 >= 0; local126--) {
				@Pc(137) boolean local137 = this.aClass198Array2[local126].method5445(arg1, this.aClass198_1);
				this.aBoolean479 |= !local137;
				local115 |= local137;
			}
		}
		return local115;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public void method5664() {
		if (this.aClass198Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass198Array1.length; local10++) {
				this.aClass198Array1[local10].method5442();
			}
		}
		this.aClass29_23 = null;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILclient!nr;IIIIIIII)V")
	public void method5665(@OriginalArg(1) Class40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = arg2 + arg4 & 0x3FFF;
		if (this.anInt6668 == -1) {
			arg0.method2717(arg6, arg3, arg7, arg8, arg5, 0);
		} else {
			@Pc(23) Class50 local23 = Static115.anInterface4_4.method165(this.anInt6668);
			if (this.aClass29_23 == null && Static115.anInterface4_4.method166(this.anInt6668)) {
				@Pc(59) int[] local59 = local23.aBoolean109 ? Static115.anInterface4_4.method169(0.7F, this.anInt6666, this.anInt6668, this.anInt6666, false) : Static115.anInterface4_4.method167(this.anInt6666, this.anInt6668, 0.7F, this.anInt6666);
				this.aClass29_23 = arg0.method2791(local59, this.anInt6666, this.anInt6666, this.anInt6666);
			}
			if (!local23.aBoolean109) {
				arg0.method2717(arg6, arg3, arg7, arg8, arg5, 0);
			}
			if (this.aClass29_23 != null) {
				@Pc(92) int local92 = local23.aBoolean109 ? 0 : 1;
				@Pc(98) int local98 = arg8 * arg1 / -4096;
				@Pc(111) int local111;
				for (local111 = arg8 * local11 / 4096 + (arg7 - arg8) / 2; local111 > arg8; local111 -= arg8) {
				}
				while (local111 < 0) {
					local111 += arg8;
				}
				while (arg8 < local98) {
					local98 -= arg8;
				}
				while (local98 < 0) {
					local98 += arg8;
				}
				for (@Pc(150) int local150 = local111 - arg8; local150 < arg7; local150 += arg8) {
					for (@Pc(157) int local157 = local98 - arg8; local157 < arg8; local157 += arg8) {
						this.aClass29_23.method5835(local150 + arg6, arg3 + local157, arg8, arg8, 0, 0, local92);
					}
				}
			}
		}
		for (@Pc(217) int local217 = this.anInt6669 - 1; local217 >= 0; local217--) {
			this.aClass198Array2[local217].method5440(arg0, arg6, arg3, arg7, arg8, arg1, local11);
		}
	}
}
