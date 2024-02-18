import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class173 {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Lclient!u;")
	public Class363 aClass363_2;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
	public int anInt4165;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
	public int anInt4167;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "Z")
	public boolean aBoolean329 = false;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!ha;ZI)Lclient!st;")
	public Class23 method3689(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(23) long local23 = (long) (arg1.anInt8962 << 19 | (arg2 ? 262144 : 0) | arg0 << 16 | this.anInt4167);
		@Pc(31) Class23 local31 = (Class23) this.aClass363_2.aClass82_202.method2156(local23);
		if (local31 != null) {
			return local31;
		} else if (this.aClass363_2.aClass330_116.method7581(this.anInt4167)) {
			@Pc(55) Class407 local55 = Static735.method9382(this.aClass363_2.aClass330_116, this.anInt4167, 0);
			if (local55 != null) {
				local55.anInt10849 = local55.anInt10852 = local55.anInt10851 = local55.anInt10848 = 0;
				if (arg2) {
					local55.method9377();
				}
				for (@Pc(79) int local79 = 0; local79 < arg0; local79++) {
					local55.method9386();
				}
			}
			local31 = arg1.method7948(local55, true);
			if (local31 != null) {
				this.aClass363_2.aClass82_202.method2150(local31, local23);
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)Z")
	public boolean method3690() {
		return this.aClass363_2.aClass330_116.method7581(this.anInt4167);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILclient!ge;)V")
	private void method3691(@OriginalArg(1) int arg0, @OriginalArg(2) Packet arg1) {
		if (arg0 == 1) {
			this.anInt4167 = arg1.g2();
		} else if (arg0 == 2) {
			this.anInt4165 = arg1.g3();
		} else if (arg0 == 3) {
			this.aBoolean329 = true;
		} else if (arg0 == 4) {
			this.anInt4167 = -1;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method3694(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.g1();
			if (local7 == 0) {
				return;
			}
			this.method3691(local7, arg0);
		}
	}
}
