import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public abstract class Class90 implements Interface13 {

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "J")
	private long aLong274;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "Lclient!da;")
	private Class14 aClass14_10;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
	private int anInt8730;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "Lclient!is;")
	protected final Class138 aClass138_5;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "Lclient!sb;")
	protected final Class330 aClass330_109;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "Lclient!sb;")
	private final Class330 aClass330_110;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!sb;Lclient!sb;Lclient!is;)V")
	protected Class90(@OriginalArg(0) Class330 arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) Class138 arg2) {
		this.aClass138_5 = arg2;
		this.aClass330_109 = arg0;
		this.aClass330_110 = arg1;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)V")
	@Override
	public final void method7749() {
		@Pc(18) int local18 = this.aClass138_5.aClass403_10.method9332(Static302.anInt4851, this.aClass138_5.anInt4418) + this.aClass138_5.anInt4423;
		@Pc(32) int local32 = this.aClass138_5.aClass103_10.method2416(Static479.anInt7201, this.aClass138_5.anInt4413) + this.aClass138_5.anInt4412;
		this.method7751(local18, local32);
		this.method7753(local18, local32);
		@Pc(56) String local56 = Static449.aClass364_1.method8377();
		if (Static588.method7715() - this.aLong274 > 10000L) {
			local56 = local56 + " (" + Static449.aClass364_1.method8369().method2952() + ")";
		}
		this.aClass14_10.method8828(-1, local18 + this.aClass138_5.anInt4418 / 2, local56, local32 + this.aClass138_5.anInt4413 / 2 + this.aClass138_5.anInt4416 + 4, this.aClass138_5.anInt4421);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZIBI)V")
	protected abstract void method7751(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)I")
	protected final int method7752() {
		@Pc(9) int local9 = Static449.aClass364_1.method8378();
		@Pc(13) int local13 = local9 * 100;
		if (local9 == this.anInt8730 && local9 != 0) {
			@Pc(40) int local40 = Static449.aClass364_1.method8375();
			if (local9 < local40) {
				@Pc(55) long local55 = this.aLong274 - Static449.aClass364_1.method8370();
				if (local55 > 0L) {
					@Pc(72) long local72 = (long) (local40 - local9) * (local55 * 10000L / (long) local9);
					@Pc(81) long local81 = (Static588.method7715() - this.aLong274) * 10000L;
					if (local81 < local72) {
						local13 = (int) ((long) (local40 - local9) * local81 * 100L / local72 + (long) (local9 * 100));
					} else {
						local13 = local40 * 100;
					}
				}
			}
		} else {
			this.anInt8730 = local9;
			this.aLong274 = Static588.method7715();
		}
		return local13;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIZI)V")
	protected abstract void method7753(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	@Override
	public void method7748() {
		@Pc(21) Class381 local21 = Static238.method3468(this.aClass138_5.anInt4415, this.aClass330_110);
		this.aClass14_10 = Static163.aClass19_17.method8010(local21, Static735.method9387(this.aClass330_109, this.aClass138_5.anInt4415), true);
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7747() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass330_109.method7581(this.aClass138_5.anInt4415)) {
			local5 = false;
		}
		if (!this.aClass330_110.method7581(this.aClass138_5.anInt4415)) {
			local5 = false;
		}
		return local5;
	}
}
