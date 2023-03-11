import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class146 {

	@OriginalMember(owner = "client!md", name = "f", descriptor = "Lclient!ii;")
	public Class104 aClass104_1;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "I")
	public int anInt3751;

	@OriginalMember(owner = "client!md", name = "j", descriptor = "I")
	public int anInt3752;

	@OriginalMember(owner = "client!md", name = "i", descriptor = "Z")
	public boolean aBoolean243 = false;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!bt;)V")
	public void method3706(@OriginalArg(1) Class2_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4815();
			if (local13 == 0) {
				return;
			}
			this.method3709(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)Z")
	public boolean method3708() {
		return this.aClass104_1.aClass197_39.method5087(this.anInt3751);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!bt;I)V")
	private void method3709(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt3751 = arg1.method4829();
		} else if (arg0 == 2) {
			this.anInt3752 = arg1.method4833();
		} else if (arg0 == 3) {
			this.aBoolean243 = true;
		} else if (arg0 == 4) {
			this.anInt3751 = -1;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZZILclient!wm;)Lclient!jd;")
	public Class13 method3711(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(24) long local24 = (long) (this.anInt3751 | arg1 << 16 | (arg0 ? 262144 : 0) | arg2.anInt2836 << 19);
		@Pc(32) Class13 local32 = (Class13) this.aClass104_1.aClass98_20.method2612(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass104_1.aClass197_39.method5087(this.anInt3751)) {
			@Pc(54) Class48 local54 = Static396.method1682(this.aClass104_1.aClass197_39, this.anInt3751, 0);
			if (local54 != null) {
				local54.anInt1534 = local54.anInt1535 = local54.anInt1532 = local54.anInt1530 = 0;
				if (arg0) {
					local54.method1687();
				}
				for (@Pc(74) int local74 = 0; local74 < arg1; local74++) {
					local54.method1675();
				}
			}
			local32 = arg2.method2891(local54);
			if (local32 != null) {
				this.aClass104_1.aClass98_20.method2624(local24, local32);
			}
			return local32;
		} else {
			return null;
		}
	}
}
