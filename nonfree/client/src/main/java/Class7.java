import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class7 {

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "Lclient!bga;")
	public Interface2 anInterface2_1 = null;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "[Lclient!og;")
	public Interface18[] anInterface18Array2 = null;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "Lclient!bga;")
	public Interface2 anInterface2_2 = null;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "[Lclient!og;")
	private Interface18[] anInterface18Array1 = null;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "Lclient!am;")
	private final Class19_Sub1 aClass19_Sub1_1;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "Z")
	public boolean aBoolean7;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!am;)V")
	public Class7(@OriginalArg(0) Class19_Sub1 arg0) {
		this.aClass19_Sub1_1 = arg0;
		this.aBoolean7 = this.aClass19_Sub1_1.aBoolean696;
		if (this.aBoolean7 && !this.aClass19_Sub1_1.method8153(Static702.aClass397_16, Static482.aClass92_13)) {
			this.aBoolean7 = false;
		}
		if (this.aBoolean7 || this.aClass19_Sub1_1.method8071(Static482.aClass92_13, Static702.aClass397_16)) {
			Static132.method2312();
			if (this.aBoolean7) {
				@Pc(60) byte[] local60 = Static377.method5321(false, Static177.anObject6);
				this.anInterface2_2 = this.aClass19_Sub1_1.method8038(Static482.aClass92_13, local60);
				@Pc(76) byte[] local76 = Static377.method5321(false, Static644.anObject18);
				this.aClass19_Sub1_1.method8038(Static482.aClass92_13, local76);
			} else {
				this.anInterface18Array2 = new Interface18[16];
				for (@Pc(93) int local93 = 0; local93 < 16; local93++) {
					@Pc(104) byte[] local104 = Static60.method1292(Static177.anObject6, local93 * 16384 * 2);
					this.anInterface18Array2[local93] = this.aClass19_Sub1_1.method8028(128, local104, Static482.aClass92_13, 128, true);
				}
				this.anInterface18Array1 = new Interface18[16];
				for (@Pc(129) int local129 = 0; local129 < 16; local129++) {
					@Pc(140) byte[] local140 = Static60.method1292(Static644.anObject18, local129 * 128 * 256);
					this.anInterface18Array1[local129] = this.aClass19_Sub1_1.method8028(128, local140, Static482.aClass92_13, 128, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)Z")
	public boolean method115() {
		if (this.anInterface2_1 == null) {
			@Pc(26) byte[] local26;
			if (Static186.anObject7 == null) {
				local26 = Static448.method6106(4.0F, 4.0F, 0.5F, 16.0F, 0.6F, new Class59_Sub1(419684));
				Static186.anObject7 = Static247.method3524(local26);
			}
			local26 = Static377.method5321(false, Static186.anObject7);
			@Pc(42) byte[] local42 = new byte[local26.length * 4];
			@Pc(44) int local44 = 0;
			for (@Pc(46) int local46 = 0; local46 < 16; local46++) {
				@Pc(54) int local54 = local46 * 128 * 128;
				@Pc(56) int local56 = local54;
				for (@Pc(58) int local58 = 0; local58 < 128; local58++) {
					@Pc(67) int local67 = local56 + local58 * 128;
					@Pc(78) int local78 = local56 + (local58 - 1 & 0x7F) * 128;
					@Pc(88) int local88 = (local58 + 1 & 0x7F) * 128 + local56;
					for (@Pc(90) int local90 = 0; local90 < 128; local90++) {
						@Pc(111) float local111 = (float) ((local26[local78 + local90] & 0xFF) - (local26[local90 + local88] & 0xFF));
						@Pc(138) float local138 = (float) ((local26[local67 + (local90 - 1 & 0x7F)] & 0xFF) - (local26[local67 + (local90 + 1 & 0x7F)] & 0xFF));
						@Pc(153) float local153 = (float) (128.0D / Math.sqrt((double) (local111 * local111 + local138 * local138 + 16384.0F)));
						local42[local44++] = (byte) (int) (local138 * local153 + 127.0F);
						local42[local44++] = (byte) (int) (local153 * 128.0F + 127.0F);
						local42[local44++] = (byte) (int) (local111 * local153 + 127.0F);
						local42[local44++] = local26[local54++];
					}
				}
			}
			this.anInterface2_1 = this.aClass19_Sub1_1.method8038(Static172.aClass92_8, local42);
		}
		return this.anInterface2_1 != null;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)Z")
	public boolean method116() {
		if (this.aBoolean7) {
			return this.anInterface2_2 != null;
		} else {
			return this.anInterface18Array2 != null;
		}
	}
}
