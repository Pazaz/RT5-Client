import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!df", name = "ab", descriptor = "I")
	private int anInt1529 = 0;

	@OriginalMember(owner = "client!df", name = "V", descriptor = "I")
	private int anInt1524 = 0;

	@OriginalMember(owner = "client!df", name = "R", descriptor = "I")
	private int anInt1520 = 2000;

	@OriginalMember(owner = "client!df", name = "cb", descriptor = "I")
	private int anInt1530 = 16;

	@OriginalMember(owner = "client!df", name = "db", descriptor = "I")
	private int anInt1531 = 4096;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
	@Override
	public void method6090() {
		Static166.method3459();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt1529 = arg1.method5761();
		} else if (arg0 == 1) {
			this.anInt1520 = arg1.method5749();
		} else if (arg0 == 2) {
			this.anInt1530 = arg1.method5761();
		} else if (arg0 == 3) {
			this.anInt1524 = arg1.method5749();
		} else if (arg0 == 4) {
			this.anInt1531 = arg1.method5749();
		}
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			@Pc(25) int local25 = this.anInt1531 >> 1;
			@Pc(30) int[][] local30 = super.aClass201_41.method5514();
			@Pc(37) Random local37 = new Random((long) this.anInt1529);
			for (@Pc(39) int local39 = 0; local39 < this.anInt1520; local39++) {
				@Pc(59) int local59 = this.anInt1531 <= 0 ? this.anInt1524 : this.anInt1524 + Static228.method4354(local37, this.anInt1531) - local25;
				@Pc(65) int local65 = local59 >> 4 & 0xFF;
				@Pc(70) int local70 = Static228.method4354(local37, Static64.anInt1755);
				@Pc(77) int local77 = Static228.method4354(local37, Static53.anInt1598);
				@Pc(88) int local88 = local70 + (Static110.anIntArray232[local65] * this.anInt1530 >> 12);
				@Pc(100) int local100 = local77 + (this.anInt1530 * Static266.anIntArray417[local65] >> 12);
				@Pc(105) int local105 = local100 - local77;
				@Pc(110) int local110 = local88 - local70;
				if (local110 != 0 || local105 != 0) {
					if (local105 < 0) {
						local105 = -local105;
					}
					if (local110 < 0) {
						local110 = -local110;
					}
					@Pc(138) boolean local138 = local110 < local105;
					@Pc(142) int local142;
					@Pc(146) int local146;
					if (local138) {
						local142 = local70;
						local70 = local77;
						local146 = local88;
						local77 = local142;
						local88 = local100;
						local100 = local146;
					}
					if (local88 < local70) {
						local142 = local70;
						local70 = local88;
						local146 = local77;
						local77 = local100;
						local88 = local142;
						local100 = local146;
					}
					local142 = local77;
					local146 = local88 - local70;
					@Pc(183) int local183 = local100 - local77;
					@Pc(188) int local188 = -local146 / 2;
					@Pc(192) int local192 = 2048 / local146;
					@Pc(204) int local204 = 1024 - (Static228.method4354(local37, 4096) >> 2);
					if (local183 < 0) {
						local183 = -local183;
					}
					@Pc(216) int local216 = local77 >= local100 ? -1 : 1;
					for (@Pc(218) int local218 = local70; local218 < local88; local218++) {
						@Pc(231) int local231 = local192 * (local218 - local70) + local204 + 1024;
						@Pc(235) int local235 = local218 & Static145.anInt3608;
						@Pc(239) int local239 = Static128.anInt3242 & local142;
						local188 += local183;
						if (local138) {
							local30[local239][local235] = local231;
						} else {
							local30[local235][local239] = local231;
						}
						if (local188 > 0) {
							local142 -= -local216;
							local188 += -local146;
						}
					}
				}
			}
		}
		return local16;
	}
}
