import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lka")
public final class Class231 {

	@OriginalMember(owner = "client!lka", name = "c", descriptor = "[I")
	private final int[] anIntArray453;

	@OriginalMember(owner = "client!lka", name = "d", descriptor = "[I")
	private final int[] anIntArray454;

	@OriginalMember(owner = "client!lka", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class231(@OriginalArg(0) Packet arg0) {
		@Pc(7) int local7 = arg0.gSamrt1or2();
		this.anIntArray453 = new int[local7];
		this.anIntArray454 = new int[local7];
		for (@Pc(17) int local17 = 0; local17 < local7; local17++) {
			@Pc(23) int local23 = arg0.g1();
			this.anIntArray454[local17] = local23;
			@Pc(32) int local32 = arg0.g2();
			@Pc(36) int local36 = arg0.g2();
			this.anIntArray453[local17] = local36 + (local32 << 16);
		}
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(Lclient!lw;II)V")
	public void method5271(@OriginalArg(0) Class236 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anIntArray453[0];
		arg0.method5360(local10 >>> 16, arg1, local10 & 0xFFFF);
		@Pc(24) Class8_Sub2_Sub1_Sub2 local24 = arg0.method5363();
		local24.anInt10764 = 0;
		for (@Pc(41) int local41 = this.anIntArray454.length - 1; local41 >= 0; local41--) {
			@Pc(48) int local48 = this.anIntArray454[local41];
			@Pc(53) int local53 = this.anIntArray453[local41];
			local24.anIntArray879[local24.anInt10764] = local53 >> 16;
			local24.anIntArray878[local24.anInt10764] = local53 & 0xFFFF;
			@Pc(71) byte local71 = 1;
			if (local48 == 0) {
				local71 = 0;
			} else if (local48 == 2) {
				local71 = 2;
			}
			local24.aByteArray111[local24.anInt10764] = local71;
			local24.anInt10764++;
		}
	}
}
