import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aja")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!aja", name = "y", descriptor = "Lclient!am;")
	private final Class19_Sub1 aClass19_Sub1_2;

	@OriginalMember(owner = "client!aja", name = "A", descriptor = "Lclient!og;")
	private final Interface18 anInterface18_1;

	@OriginalMember(owner = "client!aja", name = "x", descriptor = "Z")
	private final boolean aBoolean19;

	@OriginalMember(owner = "client!aja", name = "z", descriptor = "Lclient!mg;")
	private final Interface16 anInterface16_1;

	@OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(Lclient!am;Lclient!ve;[Lclient!wp;Z)V")
	public Class14_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Class381 arg1, @OriginalArg(2) Class407[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass19_Sub1_2 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class407 local15 = arg2[local10];
			if (local15.anInt10850 > local8) {
				local8 = local15.anInt10850;
			}
			if (local15.anInt10847 > local8) {
				local8 = local15.anInt10847;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(46) int local46;
		@Pc(51) Class407 local51;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		@Pc(77) int local77;
		@Pc(85) int local85;
		@Pc(88) int local88;
		@Pc(241) int local241;
		if (arg3) {
			@Pc(44) byte[] local44 = new byte[local37 * local37];
			@Pc(54) int local54;
			for (local46 = 0; local46 < 256; local46++) {
				local51 = arg2[local46];
				local54 = local51.anInt10850;
				@Pc(57) int local57 = local51.anInt10847;
				local63 = local46 % 16 * local8;
				local69 = local46 / 16 * local8;
				local75 = local69 * local37 + local63;
				local77 = 0;
				@Pc(83) byte[] local83;
				if (local51.aByteArray115 == null) {
					local83 = local51.aByteArray114;
					for (local85 = 0; local85 < local54; local85++) {
						for (local88 = 0; local88 < local57; local88++) {
							local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
						}
						local75 += local37 - local57;
					}
				} else {
					local83 = local51.aByteArray115;
					for (local85 = 0; local85 < local54; local85++) {
						for (local88 = 0; local88 < local57; local88++) {
							local44[local75++] = local83[local77++];
						}
						local75 += local37 - local57;
					}
				}
			}
			if (arg0.method8071(Static679.aClass92_15, Static702.aClass397_16)) {
				this.anInterface18_1 = arg0.method8028(local37, local44, Static679.aClass92_15, local37, false);
			} else {
				@Pc(162) int[] local162 = new int[local44.length];
				for (local54 = 0; local54 < local44.length; local54++) {
					local162[local54] = local44[local54] << 24;
				}
				this.anInterface18_1 = arg0.method8034(false, local37, local37, local162);
			}
			this.aBoolean19 = true;
		} else {
			@Pc(207) int[] local207 = new int[local37 * local37];
			for (local46 = 0; local46 < 256; local46++) {
				local51 = arg2[local46];
				@Pc(217) int[] local217 = local51.anIntArray882;
				@Pc(220) byte[] local220 = local51.aByteArray115;
				@Pc(223) byte[] local223 = local51.aByteArray114;
				local69 = local51.anInt10850;
				local75 = local51.anInt10847;
				local77 = local46 % 16 * local8;
				local241 = local46 / 16 * local8;
				local85 = local241 * local37 + local77;
				local88 = 0;
				@Pc(253) int local253;
				@Pc(256) int local256;
				if (local220 == null) {
					for (local253 = 0; local253 < local69; local253++) {
						for (local256 = 0; local256 < local75; local256++) {
							@Pc(302) byte local302;
							if ((local302 = local223[local88++]) == 0) {
								local85++;
							} else {
								local207[local85++] = local217[local302 & 0xFF] | 0xFF000000;
							}
						}
						local85 += local37 - local75;
					}
				} else {
					for (local253 = 0; local253 < local69; local253++) {
						for (local256 = 0; local256 < local75; local256++) {
							local207[local85++] = local220[local88] << 24 | local217[local223[local88] & 0xFF];
							local88++;
						}
						local85 += local37 - local75;
					}
				}
			}
			this.anInterface18_1 = arg0.method8034(false, local37, local37, local207);
			this.aBoolean19 = false;
		}
		this.anInterface18_1.method9041(Static363.aClass259_14);
		this.anInterface16_1 = arg0.method8156(false);
		this.anInterface16_1.method3153(20, 20480);
		for (@Pc(366) int local366 = 0; local366 < 4; local366++) {
			@Pc(373) Buffer local373 = this.anInterface16_1.method3155();
			if (local373 != null) {
				@Pc(381) Stream local381 = this.aClass19_Sub1_2.method8100(local373);
				@Pc(391) float local391 = this.anInterface18_1.method9046((float) local37) / (float) local37;
				@Pc(401) float local401 = this.anInterface18_1.method9050((float) local37) / (float) local37;
				for (local63 = 0; local63 < 256; local63++) {
					@Pc(408) Class407 local408 = arg2[local63];
					local75 = local408.anInt10850;
					local77 = local408.anInt10847;
					local241 = local408.anInt10848;
					local85 = local408.anInt10852;
					@Pc(427) float local427 = (float) (local63 % 16 * local8);
					@Pc(434) float local434 = (float) (local63 / 16 * local8);
					@Pc(438) float local438 = local427 * local391;
					@Pc(442) float local442 = local434 * local401;
					@Pc(449) float local449 = (local427 + (float) local77) * local391;
					@Pc(456) float local456 = (local434 + (float) local75) * local401;
					if (Stream.b()) {
						local381.a((float) local85);
						local381.a((float) local241);
						local381.a(0.0F);
						local381.a(local438);
						local381.a(local442);
						local381.a((float) local85);
						local381.a((float) (local241 + local75));
						local381.a(0.0F);
						local381.a(local438);
						local381.a(local456);
						local381.a((float) (local85 + local77));
						local381.a((float) (local241 + local75));
						local381.a(0.0F);
						local381.a(local449);
						local381.a(local456);
						local381.a((float) (local85 + local77));
						local381.a((float) local241);
						local381.a(0.0F);
						local381.a(local449);
						local381.a(local442);
					} else {
						local381.b((float) local85);
						local381.b((float) local241);
						local381.b(0.0F);
						local381.b(local438);
						local381.b(local442);
						local381.b((float) local85);
						local381.b((float) (local241 + local75));
						local381.b(0.0F);
						local381.b(local438);
						local381.b(local456);
						local381.b((float) (local85 + local77));
						local381.b((float) (local241 + local75));
						local381.b(0.0F);
						local381.b(local449);
						local381.b(local456);
						local381.b((float) (local85 + local77));
						local381.b((float) local241);
						local381.b(0.0F);
						local381.b(local449);
						local381.b(local442);
					}
				}
				local381.c();
				if (this.anInterface16_1.method3154()) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method8817(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
	}

	@OriginalMember(owner = "client!aja", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass19_Sub1_2.method8064();
		this.aClass19_Sub1_2.method8088(this.anInterface18_1);
		if (this.aBoolean19 || arg4) {
			this.aClass19_Sub1_2.method8094(Static209.aClass121_4, Static185.aClass121_3);
			this.aClass19_Sub1_2.method8080(0, Static454.aClass168_5);
			this.aClass19_Sub1_2.method8112(arg3);
		} else {
			this.aClass19_Sub1_2.method8094(Static185.aClass121_3, Static185.aClass121_3);
		}
		@Pc(43) Class73_Sub1 local43 = this.aClass19_Sub1_2.method8040();
		local43.method7125(arg1, arg2, 0);
		this.aClass19_Sub1_2.method8042();
		this.aClass19_Sub1_2.method8130(0, this.anInterface16_1);
		this.aClass19_Sub1_2.method8114(this.aClass19_Sub1_2.aClass244_17);
		this.aClass19_Sub1_2.method8079(Static694.aClass131_6, arg0 * 4, 2);
		if (this.aBoolean19 || arg4) {
			this.aClass19_Sub1_2.method8080(0, Static189.aClass168_2);
		}
	}
}
