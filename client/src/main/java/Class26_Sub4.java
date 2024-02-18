import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fga")
public final class Class26_Sub4 extends Class26 {

	@OriginalMember(owner = "client!fga", name = "q", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!fga", name = "s", descriptor = "Z")
	private boolean aBoolean247;

	@OriginalMember(owner = "client!fga", name = "l", descriptor = "[Lclient!fv;")
	private Interface8[] anInterface8Array1;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Lclient!am;)V")
	public Class26_Sub4(@OriginalArg(0) Class19_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean685) {
			this.aBoolean247 = arg0.anInt9184 < 3;
			@Pc(28) int local28 = this.aBoolean247 ? 48 : 127;
			@Pc(32) int[][] local32 = new int[6][4096];
			@Pc(36) int[][] local36 = new int[6][4096];
			@Pc(40) int[][] local40 = new int[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(47) int local47 = 0; local47 < 64; local47++) {
					@Pc(57) float local57 = (float) local47 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local66 * local66 + local57 * local57 + 1.0F)));
					@Pc(85) float local85 = local66 * local81;
					@Pc(89) float local89 = local57 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(97) float local97;
						if (local91 == 0) {
							local97 = -local89;
						} else if (local91 == 1) {
							local97 = local89;
						} else if (local91 == 2) {
							local97 = local85;
						} else if (local91 == 3) {
							local97 = -local85;
						} else if (local91 == 4) {
							local97 = local81;
						} else {
							local97 = -local81;
						}
						@Pc(147) int local147;
						@Pc(156) int local156;
						@Pc(165) int local165;
						if (local97 > 0.0F) {
							local147 = (int) (Math.pow((double) local97, 96.0D) * (double) local28);
							local156 = (int) ((double) local28 * Math.pow((double) local97, 36.0D));
							local165 = (int) ((double) local28 * Math.pow((double) local97, 12.0D));
						} else {
							local165 = 0;
							local156 = 0;
							local147 = 0;
						}
						local36[local91][local42] = local147 << 24;
						local40[local91][local42] = local156 << 24;
						local32[local91][local42] = local165 << 24;
					}
					local42++;
				}
			}
			this.anInterface8Array1 = new Interface8[3];
			this.anInterface8Array1[0] = super.aClass19_Sub1_21.method8063(64, local36, false);
			this.anInterface8Array1[1] = super.aClass19_Sub1_21.method8063(64, local40, false);
			this.anInterface8Array1[2] = super.aClass19_Sub1_21.method8063(64, local32, false);
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!mw;IB)V")
	@Override
	public void method8294(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) int arg1) {
		super.aClass19_Sub1_21.method8088(arg0);
		super.aClass19_Sub1_21.method8054(arg1);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8297(@OriginalArg(1) boolean arg0) {
		if (this.anInterface8Array1 == null || !arg0) {
			super.aClass19_Sub1_21.method8142(Static207.aClass168_4, 0);
			return;
		}
		super.aClass19_Sub1_21.method8138(1);
		super.aClass19_Sub1_21.method8097(Static360.aClass172_3);
		@Pc(33) Class73_Sub1 local33 = super.aClass19_Sub1_21.method8082();
		local33.method7136(1024);
		super.aClass19_Sub1_21.method8073(Static104.aClass370_1);
		if (this.aBoolean247) {
			super.aClass19_Sub1_21.method8094(Static185.aClass121_3, Static438.aClass121_5);
			super.aClass19_Sub1_21.method8125(Static189.aClass168_2, true, false, 0);
			super.aClass19_Sub1_21.method8142(Static207.aClass168_4, 0);
		} else {
			super.aClass19_Sub1_21.method8094(Static209.aClass121_4, Static185.aClass121_3);
			super.aClass19_Sub1_21.method8080(0, Static188.aClass168_1);
			super.aClass19_Sub1_21.method8138(2);
			super.aClass19_Sub1_21.method8094(Static185.aClass121_3, Static438.aClass121_5);
			super.aClass19_Sub1_21.method8080(0, Static188.aClass168_1);
			super.aClass19_Sub1_21.method8125(Static188.aClass168_1, true, false, 1);
			super.aClass19_Sub1_21.method8142(Static207.aClass168_4, 0);
			super.aClass19_Sub1_21.method8088(super.aClass19_Sub1_21.anInterface17_3);
		}
		super.aClass19_Sub1_21.method8138(0);
		this.aBoolean248 = true;
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8289() {
		return true;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8290(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean248) {
			super.aClass19_Sub1_21.method8138(1);
			super.aClass19_Sub1_21.method8088(this.anInterface8Array1[arg0 - 1]);
			super.aClass19_Sub1_21.method8138(0);
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8292(@OriginalArg(0) boolean arg0) {
		super.aClass19_Sub1_21.method8094(Static185.aClass121_3, Static209.aClass121_4);
	}

	@OriginalMember(owner = "client!fga", name = "e", descriptor = "(I)V")
	@Override
	public void method8286() {
		if (this.aBoolean248) {
			super.aClass19_Sub1_21.method8138(1);
			super.aClass19_Sub1_21.method8088((Interface17) null);
			super.aClass19_Sub1_21.method8097(Static582.aClass172_4);
			super.aClass19_Sub1_21.method8031();
			if (this.aBoolean247) {
				super.aClass19_Sub1_21.method8094(Static209.aClass121_4, Static209.aClass121_4);
				super.aClass19_Sub1_21.method8080(0, Static189.aClass168_2);
				super.aClass19_Sub1_21.method8142(Static189.aClass168_2, 0);
			} else {
				super.aClass19_Sub1_21.method8094(Static209.aClass121_4, Static209.aClass121_4);
				super.aClass19_Sub1_21.method8080(0, Static189.aClass168_2);
				super.aClass19_Sub1_21.method8138(2);
				super.aClass19_Sub1_21.method8094(Static209.aClass121_4, Static209.aClass121_4);
				super.aClass19_Sub1_21.method8080(0, Static189.aClass168_2);
				super.aClass19_Sub1_21.method8080(1, Static188.aClass168_1);
				super.aClass19_Sub1_21.method8142(Static189.aClass168_2, 0);
				super.aClass19_Sub1_21.method8088((Interface17) null);
			}
			super.aClass19_Sub1_21.method8138(0);
			this.aBoolean248 = false;
		} else {
			super.aClass19_Sub1_21.method8142(Static189.aClass168_2, 0);
		}
		super.aClass19_Sub1_21.method8094(Static209.aClass121_4, Static209.aClass121_4);
	}
}
