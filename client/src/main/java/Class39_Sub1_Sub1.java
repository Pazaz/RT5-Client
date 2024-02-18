import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class39_Sub1_Sub1 extends Class39_Sub1 {

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
	private final int anInt987;

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
	private final int anInt983;

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
	private final int anInt986;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub1_Sub1(@OriginalArg(0) Packet arg0) {
		super(arg0);
		@Pc(6) int local6 = arg0.g4();
		this.anInt987 = local6 & 0xFFFF;
		this.anInt983 = local6 >>> 16;
		this.anInt986 = arg0.g1();
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
	@Override
	public void method9161() {
		@Pc(10) int local10 = this.anInt983 * 512 + 256;
		@Pc(17) int local17 = this.anInt987 * 512 + 256;
		@Pc(30) int local30 = this.anInt986;
		if (local30 < 3 && Static441.method5968(this.anInt987, this.anInt983)) {
			local30++;
		}
		@Pc(79) Class8_Sub2_Sub1_Sub5 local79 = new Class8_Sub2_Sub1_Sub5(super.anInt10558, 0, this.anInt986, local30, local10, Static102.method2025(this.anInt986, -29754, local17, local10) - super.anInt10560, local17, this.anInt983, this.anInt983, this.anInt987, this.anInt987, super.anInt10556, false);
		Static346.aClass28_29.method735((long) (this.anInt983 << 16 | this.anInt987), new Class2_Sub2_Sub20(local79));
	}
}
