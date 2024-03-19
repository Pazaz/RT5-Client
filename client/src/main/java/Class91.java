import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class91 {

	@OriginalMember(owner = "client!in", name = "c", descriptor = "Z")
	public boolean aBoolean233 = true;

	@OriginalMember(owner = "client!in", name = "e", descriptor = "I")
	private int anInt3324 = -1;

	@OriginalMember(owner = "client!in", name = "h", descriptor = "Lclient!up;")
	private final Class207 aClass207_1;

	@OriginalMember(owner = "client!in", name = "d", descriptor = "Lclient!ih;")
	private final Class40_Sub2 aClass40_Sub2_18;

	@OriginalMember(owner = "client!in", name = "i", descriptor = "I")
	private final int anInt3326;

	@OriginalMember(owner = "client!in", name = "b", descriptor = "I")
	private final int anInt3323;

	@OriginalMember(owner = "client!in", name = "f", descriptor = "I")
	private final int anInt3325;

	@OriginalMember(owner = "client!in", name = "j", descriptor = "Lclient!eq;")
	private Class44_Sub1 aClass44_Sub1_4;

	@OriginalMember(owner = "client!in", name = "g", descriptor = "Lclient!ir;")
	private Interface7 anInterface7_4;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!ih;Lclient!up;Lclient!ms;IIIII)V")
	public Class91(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) Class77_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass207_1 = arg1;
		this.aClass40_Sub2_18 = arg0;
		this.anInt3326 = arg6;
		this.anInt3323 = arg7;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(47) int local47;
		@Pc(49) int local49;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local47 = local29 + (local35 + local33) * arg2.anInt4630;
			for (local49 = 0; local49 < local23; local49++) {
				@Pc(62) short[] local62 = arg2.aShortArrayArray4[local47++];
				if (local62 != null) {
					local25 += local62.length;
				}
			}
		}
		this.anInt3325 = local25;
		if (local25 <= 0) {
			this.aClass44_Sub1_4 = null;
		} else {
			@Pc(90) Class1_Sub16 local90 = new Class1_Sub16(local25 * 2);
			@Pc(125) short[] local125;
			@Pc(130) int local130;
			@Pc(112) int local112;
			if (this.aClass40_Sub2_18.aBoolean216) {
				for (local47 = 0; local47 < local23; local47++) {
					local49 = local29 + (local33 + local47) * arg2.anInt4630;
					for (local112 = 0; local112 < local23; local112++) {
						local125 = arg2.aShortArrayArray4[local49++];
						if (local125 != null) {
							for (local130 = 0; local130 < local125.length; local130++) {
								local90.method5757(local125[local130]);
							}
						}
					}
				}
			} else {
				for (local47 = 0; local47 < local23; local47++) {
					local49 = arg2.anInt4630 * (local33 + local47) + local29;
					for (local112 = 0; local112 < local23; local112++) {
						local125 = arg2.aShortArrayArray4[local49++];
						if (local125 != null) {
							for (local130 = 0; local130 < local125.length; local130++) {
								local90.method5779(local125[local130]);
							}
						}
					}
				}
			}
			this.anInterface7_4 = this.aClass40_Sub2_18.method2822(local90.aByteArray86, local90.anInt6813, false);
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
	private void method2967() {
		if (!this.aBoolean233) {
			return;
		}
		this.aBoolean233 = false;
		@Pc(11) byte[] local11 = this.aClass207_1.aByteArray83;
		@Pc(13) byte[] local13 = Static131.aByteArray31;
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = this.aClass207_1.anInt6626;
		@Pc(29) int local29 = this.anInt3323 * this.aClass207_1.anInt6626 + this.anInt3326;
		@Pc(31) int local31;
		@Pc(45) int local45;
		for (local31 = -128; local31 < 0; local31++) {
			local15 = (local15 << 8) - local15;
			for (local45 = -128; local45 < 0; local45++) {
				if (local11[local29++] != 0) {
					local15++;
				}
			}
			local29 += local19 - 128;
		}
		if (this.aClass44_Sub1_4 != null && this.anInt3324 == local15) {
			this.aBoolean233 = false;
			return;
		}
		this.anInt3324 = local15;
		local29 = this.anInt3326 + this.anInt3323 * local19;
		local31 = 0;
		for (local45 = -128; local45 < 0; local45++) {
			for (@Pc(103) int local103 = -128; local103 < 0; local103++) {
				if (local11[local29] == 0) {
					@Pc(118) int local118 = 0;
					if (local11[local29 - 1] != 0) {
						local118++;
					}
					if (local11[local29 + 1] != 0) {
						local118++;
					}
					if (local11[local29 - local19] != 0) {
						local118++;
					}
					if (local11[local29 + local19] != 0) {
						local118++;
					}
					local13[local31++] = (byte) (local118 * 17);
				} else {
					local13[local31++] = 68;
				}
				local29++;
			}
			local29 += this.aClass207_1.anInt6626 - 128;
		}
		if (this.aClass44_Sub1_4 == null) {
			this.aClass44_Sub1_4 = new Class44_Sub1(this.aClass40_Sub2_18, 3553, 6406, 128, 128, false, Static131.aByteArray31, 6406, false);
			this.aClass44_Sub1_4.method4162(false, false);
			this.aClass44_Sub1_4.method5455(true);
		} else {
			this.aClass44_Sub1_4.method4159(128, 128, Static131.aByteArray31, 6406, false);
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)V")
	public void method2968() {
		this.method2969(this.anInt3325, this.anInterface7_4);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IBLclient!ir;)V")
	public void method2969(@OriginalArg(0) int arg0, @OriginalArg(2) Interface7 arg1) {
		if (arg0 != 0) {
			this.method2967();
			this.aClass40_Sub2_18.method2882(this.aClass44_Sub1_4);
			this.aClass40_Sub2_18.method2847(arg1, 0, arg0);
		}
	}
}
