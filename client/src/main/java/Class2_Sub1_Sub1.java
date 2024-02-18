import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aaa", name = "G", descriptor = "I")
	private int anInt49;

	@OriginalMember(owner = "client!aaa", name = "R", descriptor = "[I")
	private int[] anIntArray10;

	@OriginalMember(owner = "client!aaa", name = "V", descriptor = "I")
	private int anInt57;

	@OriginalMember(owner = "client!aaa", name = "J", descriptor = "I")
	private int anInt55 = -1;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub1() {
		super(0, false);
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)V")
	@Override
	public void method9423() {
		super.method9423();
		this.anIntArray10 = null;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method9414(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass372_41.method8450(arg0);
		if (super.aClass372_41.aBoolean737) {
			@Pc(44) int local44 = (this.anInt49 == Static2.anInt53 ? arg0 : arg0 * this.anInt49 / Static2.anInt53) * this.anInt57;
			@Pc(48) int[] local48 = local17[0];
			@Pc(52) int[] local52 = local17[1];
			@Pc(56) int[] local56 = local17[2];
			@Pc(66) int local66;
			@Pc(75) int local75;
			if (this.anInt57 == Static608.anInt9289) {
				for (local66 = 0; local66 < Static608.anInt9289; local66++) {
					local75 = this.anIntArray10[local44++];
					local56[local66] = (local75 & 0xFF) << 4;
					local52[local66] = local75 >> 4 & 0xFF0;
					local48[local66] = local75 >> 12 & 0xFF0;
				}
			} else {
				for (local66 = 0; local66 < Static608.anInt9289; local66++) {
					local75 = local66 * this.anInt57 / Static608.anInt9289;
					@Pc(82) int local82 = this.anIntArray10[local75 + local44];
					local56[local66] = (local82 & 0xFF) << 4;
					local52[local66] = local82 >> 4 & 0xFF0;
					local48[local66] = local82 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
		if (arg0) {
			this.anInt55 = -36;
		}
		if (arg2 == 0) {
			this.anInt55 = arg1.g2();
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method9418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method9418(arg0, arg1);
		if (this.anInt55 >= 0 && Static677.anInterface4_11 != null) {
			@Pc(40) int local40 = Static677.anInterface4_11.method6817(this.anInt55).aBoolean233 ? 64 : 128;
			this.anIntArray10 = Static677.anInterface4_11.method6818(local40, false, local40, this.anInt55, 1.0F);
			this.anInt49 = local40;
			this.anInt57 = local40;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "(I)I")
	@Override
	public int method9419() {
		return this.anInt55;
	}
}
