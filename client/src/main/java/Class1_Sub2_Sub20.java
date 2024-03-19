import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class1_Sub2_Sub20 extends Class1_Sub2 {

	@OriginalMember(owner = "client!k", name = "Y", descriptor = "I")
	private int anInt3748 = 0;

	@OriginalMember(owner = "client!k", name = "X", descriptor = "I")
	private int anInt3747 = 1;

	@OriginalMember(owner = "client!k", name = "V", descriptor = "I")
	private int anInt3745 = 0;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			@Pc(27) int local27 = Static60.anIntArray455[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static64.anInt1755; local35++) {
				@Pc(41) int local41 = Static207.anIntArray360[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(70) int local70;
				if (this.anInt3745 == 0) {
					local70 = this.anInt3747 * (local41 - local27);
				} else {
					@Pc(60) int local60 = local33 * local33 + local47 * local47 >> 12;
					local70 = (int) (Math.sqrt((double) ((float) local60 / 4096.0F)) * 4096.0D);
					local70 = (int) ((double) (this.anInt3747 * local70) * 3.141592653589793D);
				}
				local70 -= local70 & 0xFFFFF000;
				if (this.anInt3748 == 0) {
					local70 = Static266.anIntArray417[local70 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt3748 == 2) {
					local70 -= 2048;
					if (local70 < 0) {
						local70 = -local70;
					}
					local70 = 2048 - local70 << 1;
				}
				local19[local35] = local70;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V")
	@Override
	public void method6090() {
		Static166.method3459();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt3745 = arg1.method5761();
		} else if (arg0 == 1) {
			this.anInt3748 = arg1.method5761();
		} else if (arg0 == 3) {
			this.anInt3747 = arg1.method5761();
		}
	}
}
