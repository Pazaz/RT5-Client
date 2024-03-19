import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class1_Sub2_Sub29 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pq", name = "U", descriptor = "I")
	private int anInt5346 = 32768;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub29() {
		super(3, false);
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6081(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass68_41.method2002(arg0);
		if (super.aClass68_41.aBoolean157) {
			@Pc(21) int[] local21 = this.method6078(1, arg0);
			@Pc(27) int[] local27 = this.method6078(2, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static64.anInt1755; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = local27[local41] * this.anInt5346 >> 12;
				@Pc(70) int local70 = local62 * Static110.anIntArray232[local53] >> 12;
				@Pc(78) int local78 = local62 * Static266.anIntArray417[local53] >> 12;
				@Pc(86) int local86 = (local70 >> 12) + local41 & Static145.anInt3608;
				@Pc(94) int local94 = Static128.anInt3242 & (local78 >> 12) + arg0;
				@Pc(100) int[][] local100 = this.method6082(0, local94);
				local31[local41] = local100[0][local86];
				local35[local41] = local100[1][local86];
				local39[local41] = local100[2][local86];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			@Pc(27) int[] local27 = this.method6078(1, arg0);
			@Pc(33) int[] local33 = this.method6078(2, arg0);
			for (@Pc(35) int local35 = 0; local35 < Static64.anInt1755; local35++) {
				@Pc(45) int local45 = local27[local35] >> 4 & 0xFF;
				@Pc(54) int local54 = this.anInt5346 * local33[local35] >> 12;
				@Pc(62) int local62 = local54 * Static110.anIntArray232[local45] >> 12;
				@Pc(70) int local70 = local54 * Static266.anIntArray417[local45] >> 12;
				@Pc(79) int local79 = local35 + (local62 >> 12) & Static145.anInt3608;
				@Pc(87) int local87 = Static128.anInt3242 & (local70 >> 12) + arg0;
				@Pc(93) int[] local93 = this.method6078(0, local87);
				local11[local35] = local93[local79];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)V")
	@Override
	public void method6090() {
		Static166.method3459();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt5346 = arg1.method5749() << 4;
		} else if (arg0 == 1) {
			super.aBoolean515 = arg1.method5761() == 1;
		}
	}
}
