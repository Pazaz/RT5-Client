import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class39_Sub23 extends Class39 {

	@OriginalMember(owner = "client!vca", name = "j", descriptor = "I")
	private final int anInt9972;

	@OriginalMember(owner = "client!vca", name = "s", descriptor = "I")
	private final int anInt9982;

	@OriginalMember(owner = "client!vca", name = "w", descriptor = "I")
	private final int anInt9980;

	@OriginalMember(owner = "client!vca", name = "u", descriptor = "I")
	private final int anInt9973;

	@OriginalMember(owner = "client!vca", name = "A", descriptor = "I")
	private final int anInt9985;

	@OriginalMember(owner = "client!vca", name = "v", descriptor = "I")
	private final int anInt9989;

	@OriginalMember(owner = "client!vca", name = "q", descriptor = "I")
	private final int anInt9983;

	@OriginalMember(owner = "client!vca", name = "l", descriptor = "I")
	private final int anInt9976;

	@OriginalMember(owner = "client!vca", name = "h", descriptor = "I")
	private final int anInt9974;

	@OriginalMember(owner = "client!vca", name = "n", descriptor = "I")
	private final int anInt9988;

	@OriginalMember(owner = "client!vca", name = "t", descriptor = "I")
	private final int anInt9978;

	@OriginalMember(owner = "client!vca", name = "p", descriptor = "I")
	private final int anInt9977;

	@OriginalMember(owner = "client!vca", name = "y", descriptor = "I")
	private final int anInt9979;

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lclient!ge;II)V")
	public Class39_Sub23(@OriginalArg(0) Class2_Sub21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		@Pc(10) int local10;
		if (arg1 == 0) {
			local10 = arg0.method7349();
			this.anInt9972 = local10 & 0xFFFF;
			this.anInt9982 = -1;
			this.anInt9980 = local10 >>> 16;
		} else {
			this.anInt9980 = -1;
			this.anInt9972 = -1;
			this.anInt9982 = arg0.method7382();
		}
		if (arg2 == 0) {
			local10 = arg0.method7349();
			this.anInt9985 = local10 >>> 16;
			this.anInt9989 = -1;
			this.anInt9973 = local10 & 0xFFFF;
		} else {
			this.anInt9973 = -1;
			this.anInt9985 = -1;
			this.anInt9989 = arg0.method7382();
		}
		if (arg1 == 0 && arg2 == 0) {
			this.anInt9983 = arg0.method7396();
		} else {
			this.anInt9983 = -1;
		}
		this.anInt9976 = arg0.method7382();
		this.anInt9974 = arg0.method7396();
		this.anInt9988 = arg0.method7396();
		this.anInt9978 = arg0.method7383();
		this.anInt9977 = arg0.method7382();
		this.anInt9979 = arg0.method7396();
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)V")
	@Override
	public void method9161() {
		@Pc(24) int local24;
		@Pc(21) int local21;
		@Pc(18) int local18;
		@Pc(15) Class8_Sub2_Sub1_Sub2 local15;
		if (this.anInt9980 < 0) {
			local15 = Static219.aClass236Array1[this.anInt9982].method5363();
			local18 = local15.aByte144;
			local21 = local15.anInt10694;
			local24 = local15.anInt10690;
		} else {
			local21 = this.anInt9972 * 512 + 256;
			local24 = this.anInt9980 * 512 + 256;
			local18 = this.anInt9983;
		}
		@Pc(63) int local63;
		@Pc(56) int local56;
		if (this.anInt9972 >= 0) {
			local56 = this.anInt9973 * 512 + 256;
			local63 = this.anInt9985 * 512 + 256;
		} else {
			local15 = Static219.aClass236Array1[this.anInt9989].method5363();
			local63 = local15.anInt10690;
			local56 = local15.anInt10694;
			if (local18 < 0) {
				local18 = local15.aByte144;
			}
		}
		@Pc(91) int local91 = this.anInt9979 << 2;
		@Pc(128) Class8_Sub2_Sub1_Sub1 local128 = new Class8_Sub2_Sub1_Sub1(this.anInt9976, local18, local18, local24, local21, this.anInt9974 << 2, Static333.anInt5455, Static333.anInt5455 + this.anInt9978, this.anInt9977, local91, this.anInt9982 + 1, this.anInt9989 + 1, this.anInt9988 << 2, false, 0);
		local128.method813(this.anInt9988 << 2, this.anInt9978 + Static333.anInt5455, local56, local63);
		Static505.aClass339_77.method7711(new Class2_Sub2_Sub15(local128));
	}
}
