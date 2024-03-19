import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class94_Sub1_Sub2 extends Class94_Sub1 {

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "Lclient!sg;")
	private Class44_Sub3 aClass44_Sub3_2;

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
	private final int anInt7222;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
	private final int anInt7220;

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
	private final int anInt7221;

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "Lclient!ih;")
	private final Class40_Sub2 aClass40_Sub2_40;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
	private final int anInt7225;

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
	private final int anInt7223;

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
	private final int anInt7224;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!ih;IIIIII)V")
	public Class94_Sub1_Sub2(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt7222 = arg3;
		this.anInt7220 = arg2;
		this.anInt7221 = arg5;
		this.aClass40_Sub2_40 = arg0;
		this.anInt7225 = arg1;
		this.anInt7223 = arg6;
		this.anInt7224 = arg4;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Lclient!sg;")
	@Override
	public Class44_Sub3 method6048() {
		if (this.aClass44_Sub3_2 == null) {
			@Pc(6) Interface4 local6 = this.aClass40_Sub2_40.anInterface4_5;
			Static343.anIntArray584[0] = this.anInt7225;
			Static343.anIntArray584[3] = this.anInt7224;
			Static343.anIntArray584[5] = this.anInt7223;
			Static343.anIntArray584[1] = this.anInt7220;
			Static343.anIntArray584[4] = this.anInt7221;
			Static343.anIntArray584[2] = this.anInt7222;
			@Pc(38) byte local38 = 0;
			@Pc(40) int local40 = 0;
			@Pc(42) int local42;
			for (local42 = 0; local42 < 6; local42++) {
				if (!local6.method166(Static343.anIntArray584[local42])) {
					return null;
				}
				@Pc(61) Class50 local61 = local6.method165(Static343.anIntArray584[local42]);
				@Pc(68) int local68 = local61.aBoolean112 ? 64 : 128;
				if (local40 < local68) {
					local40 = local68;
				}
				if (local61.aByte17 > 0) {
					local38 = 1;
				}
			}
			for (local42 = 0; local42 < 6; local42++) {
				Static343.anIntArrayArray55[local42] = local6.method169(1.0F, local40, Static343.anIntArray584[local42], local40, false);
			}
			this.aClass44_Sub3_2 = new Class44_Sub3(this.aClass40_Sub2_40, 6407, local40, local38 != 0, Static343.anIntArrayArray55);
		}
		return this.aClass44_Sub3_2;
	}
}
