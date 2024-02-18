import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class2_Sub1_Sub39 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ws", name = "G", descriptor = "I")
	private int anInt10892 = 1;

	@OriginalMember(owner = "client!ws", name = "F", descriptor = "I")
	private int anInt10893 = 204;

	@OriginalMember(owner = "client!ws", name = "K", descriptor = "I")
	private int anInt10895 = 1;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			this.anInt10895 = arg1.g1();
		} else if (arg2 == 1) {
			this.anInt10892 = arg1.g1();
		} else if (arg2 == 2) {
			this.anInt10893 = arg1.g2();
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int[] local11 = super.aClass180_41.method3935(arg1);
		if (super.aClass180_41.aBoolean338) {
			for (@Pc(17) int local17 = 0; local17 < Static608.anInt9289; local17++) {
				@Pc(23) int local23 = Static54.anIntArray92[local17];
				@Pc(27) int local27 = Static273.anIntArray341[arg1];
				@Pc(34) int local34 = local23 * this.anInt10895 >> 12;
				@Pc(41) int local41 = local27 * this.anInt10892 >> 12;
				@Pc(51) int local51 = local23 % (4096 / this.anInt10895) * this.anInt10895;
				@Pc(61) int local61 = this.anInt10892 * (local27 % (4096 / this.anInt10892));
				if (local61 < this.anInt10893) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (local51 < this.anInt10893) {
						local11[local17] = 0;
						continue;
					}
				}
				if (local51 < this.anInt10893) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 > 0) {
						local11[local17] = 0;
						continue;
					}
				}
				local11[local17] = 4096;
			}
		}
		return local11;
	}
}
