import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class2_Sub1_Sub24 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ot", name = "M", descriptor = "[Lclient!ifa;")
	private Class154[] aClass154Array1;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 107) {
			Static471.aClass23Array11 = null;
		}
		@Pc(16) int[] local16 = super.aClass180_41.method3935(arg1);
		if (super.aClass180_41.aBoolean338) {
			this.method6410(super.aClass180_41.method3932());
		}
		return local16;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I[[I)V")
	private void method6410(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static608.anInt9289;
		@Pc(9) int local9 = Static2.anInt53;
		Static430.method5815(arg0);
		Static96.method8835(Static489.anInt7343, Static576.anInt8580);
		if (this.aClass154Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass154Array1.length; local23++) {
			@Pc(30) Class154 local30 = this.aClass154Array1[local23];
			@Pc(33) int local33 = local30.anInt7654;
			@Pc(36) int local36 = local30.anInt7655;
			if (local33 >= 0) {
				if (local36 < 0) {
					local30.method6772(local7, local9);
				} else {
					local30.method6776(local9, local7);
				}
			} else if (local36 >= 0) {
				local30.method6775(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method9414(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass372_41.method8450(arg0);
		if (super.aClass372_41.aBoolean737) {
			@Pc(23) int local23 = Static608.anInt9289;
			@Pc(25) int local25 = Static2.anInt53;
			@Pc(29) int[][] local29 = new int[local25][local23];
			@Pc(34) int[][][] local34 = super.aClass372_41.method8451();
			this.method6410(local29);
			for (@Pc(40) int local40 = 0; local40 < Static2.anInt53; local40++) {
				@Pc(46) int[] local46 = local29[local40];
				@Pc(50) int[][] local50 = local34[local40];
				@Pc(54) int[] local54 = local50[0];
				@Pc(58) int[] local58 = local50[1];
				@Pc(62) int[] local62 = local50[2];
				for (@Pc(64) int local64 = 0; local64 < Static608.anInt9289; local64++) {
					@Pc(70) int local70 = local46[local64];
					local62[local64] = (local70 & 0xFF) << 4;
					local58[local64] = local70 >> 4 & 0xFF0;
					local54[local64] = local70 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			this.aClass154Array1 = new Class154[arg1.g1()];
			for (@Pc(33) int local33 = 0; local33 < this.aClass154Array1.length; local33++) {
				@Pc(39) int local39 = arg1.g1();
				if (local39 == 0) {
					this.aClass154Array1[local33] = Static305.method4437(arg1);
				} else if (local39 == 1) {
					this.aClass154Array1[local33] = Static396.method5552(arg1);
				} else if (local39 == 2) {
					this.aClass154Array1[local33] = Static150.method2456(arg1);
				} else if (local39 == 3) {
					this.aClass154Array1[local33] = Static75.method6240(arg1);
				}
			}
		} else if (arg2 == 1) {
			super.aBoolean824 = arg1.g1() == 1;
		}
		if (arg0) {
			this.method9416(false, (Packet) null, -67);
		}
	}
}
