import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class67_Sub2_Sub1 extends Class67_Sub2 {

	@OriginalMember(owner = "client!vo", name = "q", descriptor = "Lclient!fv;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!vo", name = "w", descriptor = "I")
	private final int anInt10332;

	@OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
	private final int anInt10335;

	@OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
	private final int anInt10339;

	@OriginalMember(owner = "client!vo", name = "t", descriptor = "I")
	private final int anInt10333;

	@OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
	private final int anInt10338;

	@OriginalMember(owner = "client!vo", name = "x", descriptor = "I")
	private final int anInt10340;

	@OriginalMember(owner = "client!vo", name = "u", descriptor = "Lclient!am;")
	private final Class19_Sub1 aClass19_Sub1_22;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!am;IIIIII)V")
	public Class67_Sub2_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt10332 = arg2;
		this.anInt10335 = arg3;
		this.anInt10339 = arg6;
		this.anInt10333 = arg5;
		this.anInt10338 = arg1;
		this.anInt10340 = arg4;
		this.aClass19_Sub1_22 = arg0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)Lclient!fv;")
	@Override
	public Interface8 method8954() {
		if (this.anInterface8_1 == null) {
			Static601.anIntArray705[4] = this.anInt10333;
			Static601.anIntArray705[5] = this.anInt10339;
			Static601.anIntArray705[1] = this.anInt10332;
			Static601.anIntArray705[0] = this.anInt10338;
			Static601.anIntArray705[2] = this.anInt10335;
			Static601.anIntArray705[3] = this.anInt10340;
			@Pc(42) Interface4 local42 = this.aClass19_Sub1_22.anInterface4_10;
			@Pc(44) boolean local44 = false;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local42.method6814(Static601.anIntArray705[local48])) {
					return null;
				}
				@Pc(71) Class118 local71 = local42.method6817(Static601.anIntArray705[local48]);
				@Pc(79) int local79 = local71.aBoolean233 ? 64 : 128;
				if (local79 > local46) {
					local46 = local79;
				}
				if (local71.aByte53 > 0) {
					local44 = true;
				}
			}
			for (@Pc(102) int local102 = 0; local102 < 6; local102++) {
				Static518.anIntArrayArray262[local102] = local42.method6818(local46, false, local46, Static601.anIntArray705[local102], 1.0F);
			}
			this.anInterface8_1 = this.aClass19_Sub1_22.method8063(local46, Static518.anIntArrayArray262, local44);
		}
		return this.anInterface8_1;
	}
}
