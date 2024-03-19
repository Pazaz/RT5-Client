import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class1_Sub2_Sub38 extends Class1_Sub2 {

	@OriginalMember(owner = "client!vq", name = "Q", descriptor = "I")
	private int anInt7178 = 1;

	@OriginalMember(owner = "client!vq", name = "W", descriptor = "I")
	private int anInt7183 = 204;

	@OriginalMember(owner = "client!vq", name = "V", descriptor = "I")
	private int anInt7182 = 1;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			for (@Pc(22) int local22 = 0; local22 < Static64.anInt1755; local22++) {
				@Pc(28) int local28 = Static207.anIntArray360[local22];
				@Pc(32) int local32 = Static60.anIntArray455[arg0];
				@Pc(39) int local39 = this.anInt7178 * local28 >> 12;
				@Pc(46) int local46 = local32 * this.anInt7182 >> 12;
				@Pc(56) int local56 = this.anInt7178 * (local28 % (4096 / this.anInt7178));
				@Pc(66) int local66 = this.anInt7182 * (local32 % (4096 / this.anInt7182));
				if (this.anInt7183 > local66) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (local56 < this.anInt7183) {
						local16[local22] = 0;
						continue;
					}
				}
				if (local56 < this.anInt7183) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 > 0) {
						local16[local22] = 0;
						continue;
					}
				}
				local16[local22] = 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt7178 = arg1.method5761();
		} else if (arg0 == 1) {
			this.anInt7182 = arg1.method5761();
		} else if (arg0 == 2) {
			this.anInt7183 = arg1.method5749();
		}
	}
}
