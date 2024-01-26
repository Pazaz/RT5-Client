import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class2_Sub1_Sub29 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
	private int anInt9572 = 585;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			this.anInt9572 = arg1.method7382();
		}
		if (arg0) {
			this.method9416(false, (Class2_Sub21) null, 11);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 <= 107) {
			Static639.method8418((Class297_Sub1) null, 60, -47, true, -23, (Class297_Sub1) null, true);
		}
		@Pc(25) int[] local25 = super.aClass180_41.method3935(arg1);
		if (super.aClass180_41.aBoolean338) {
			@Pc(33) int local33 = Static273.anIntArray341[arg1];
			for (@Pc(35) int local35 = 0; local35 < Static608.anInt9289; local35++) {
				@Pc(41) int local41 = Static54.anIntArray92[local35];
				@Pc(80) int local80;
				if (local41 > this.anInt9572 && local41 < 4096 - this.anInt9572 && local33 > 2048 - this.anInt9572 && local33 < this.anInt9572 + 2048) {
					local80 = 2048 - local41;
					local80 = local80 >= 0 ? local80 : -local80;
					local80 <<= 0xC;
					local80 /= 2048 - this.anInt9572;
					local25[local35] = 4096 - local80;
				} else if (2048 - this.anInt9572 < local41 && local41 < this.anInt9572 + 2048) {
					local80 = local33 - 2048;
					local80 = local80 < 0 ? -local80 : local80;
					local80 -= this.anInt9572;
					local80 <<= 0xC;
					local25[local35] = local80 / (2048 - this.anInt9572);
				} else if (this.anInt9572 > local33 || local33 > 4096 - this.anInt9572) {
					local80 = local41 - 2048;
					@Pc(200) int local200 = local80 < 0 ? -local80 : local80;
					@Pc(205) int local205 = local200 - this.anInt9572;
					@Pc(209) int local209 = local205 << 12;
					local25[local35] = local209 / (2048 - this.anInt9572);
				} else if (this.anInt9572 <= local41 && local41 <= 4096 - this.anInt9572) {
					local25[local35] = 0;
				} else {
					local80 = 2048 - local33;
					local80 = local80 >= 0 ? local80 : -local80;
					local80 <<= 0xC;
					local80 /= 2048 - this.anInt9572;
					local25[local35] = 4096 - local80;
				}
			}
		}
		return local25;
	}
}
