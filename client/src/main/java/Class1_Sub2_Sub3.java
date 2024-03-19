import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bh", name = "Y", descriptor = "[Lclient!li;")
	private Class103[] aClass103Array1;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.aClass103Array1 = new Class103[arg1.method5761()];
			for (@Pc(37) int local37 = 0; local37 < this.aClass103Array1.length; local37++) {
				@Pc(43) int local43 = arg1.method5761();
				if (local43 == 0) {
					this.aClass103Array1[local37] = Static122.method2616(arg1);
				} else if (local43 == 1) {
					this.aClass103Array1[local37] = Static23.method576(arg1);
				} else if (local43 == 2) {
					this.aClass103Array1[local37] = Static312.method5083(arg1);
				} else if (local43 == 3) {
					this.aClass103Array1[local37] = Static84.method1876(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean515 = arg1.method5761() == 1;
			return;
		}
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(22) int[] local22 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			this.method504(super.aClass201_41.method5514());
		}
		return local22;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6081(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass68_41.method2002(arg0);
		if (super.aClass68_41.aBoolean157) {
			@Pc(21) int local21 = Static64.anInt1755;
			@Pc(23) int local23 = Static53.anInt1598;
			@Pc(27) int[][] local27 = new int[local23][local21];
			@Pc(32) int[][][] local32 = super.aClass68_41.method2008();
			this.method504(local27);
			for (@Pc(38) int local38 = 0; local38 < Static53.anInt1598; local38++) {
				@Pc(44) int[] local44 = local27[local38];
				@Pc(48) int[][] local48 = local32[local38];
				@Pc(52) int[] local52 = local48[0];
				@Pc(56) int[] local56 = local48[1];
				@Pc(60) int[] local60 = local48[2];
				for (@Pc(62) int local62 = 0; local62 < Static64.anInt1755; local62++) {
					@Pc(68) int local68 = local44[local62];
					local60[local62] = (local68 & 0xFF) << 4;
					local56[local62] = local68 >> 4 & 0xFF0;
					local52[local62] = local68 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[[I)V")
	private void method504(@OriginalArg(1) int[][] arg0) {
		@Pc(12) int local12 = Static64.anInt1755;
		@Pc(14) int local14 = Static53.anInt1598;
		Static85.method1905(arg0);
		Static190.method4602(Static145.anInt3608, Static128.anInt3242);
		if (this.aClass103Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass103Array1.length; local28++) {
			@Pc(35) Class103 local35 = this.aClass103Array1[local28];
			@Pc(38) int local38 = local35.anInt6633;
			@Pc(41) int local41 = local35.anInt6629;
			if (local38 >= 0) {
				if (local41 >= 0) {
					local35.method5652(local12, local14);
				} else {
					local35.method5648(local14, local12);
				}
			} else if (local41 >= 0) {
				local35.method5650(local14, local12);
			}
		}
	}
}
