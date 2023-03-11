import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class225 {

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
	public int anInt6372;

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
	public int anInt6378;

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
	public int anInt6379;

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
	public int anInt6381;

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
	private int anInt6374 = 0;

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "Z")
	public boolean aBoolean430 = true;

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
	public int anInt6377 = 128;

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
	public int anInt6384 = -1;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IB)V")
	private void method5771(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(64) double local64 = 0.0D;
		@Pc(66) double local66 = 0.0D;
		@Pc(72) double local72 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local72 < 0.5D) {
				local66 = (local46 - local32) / (local46 + local32);
			}
			if (local72 >= 0.5D) {
				local66 = (local46 - local32) / ((2.0D - local46) - local32);
			}
			if (local14 == local46) {
				local64 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local64 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local64 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		local64 /= 6.0D;
		this.anInt6381 = (int) (local72 * 256.0D);
		this.anInt6379 = (int) (local66 * 256.0D);
		if (local72 > 0.5D) {
			this.anInt6372 = (int) (local66 * 512.0D * (1.0D - local72));
		} else {
			this.anInt6372 = (int) (local72 * local66 * 512.0D);
		}
		if (this.anInt6381 < 0) {
			this.anInt6381 = 0;
		} else if (this.anInt6381 > 255) {
			this.anInt6381 = 255;
		}
		if (this.anInt6379 < 0) {
			this.anInt6379 = 0;
		} else if (this.anInt6379 > 255) {
			this.anInt6379 = 255;
		}
		if (this.anInt6372 < 1) {
			this.anInt6372 = 1;
		}
		this.anInt6378 = (int) ((double) this.anInt6372 * local64);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!bt;I)V")
	public void method5773(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.method5774(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!bt;IZ)V")
	private void method5774(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6374 = arg0.ig3();
			this.method5771(this.anInt6374);
		} else if (arg1 == 2) {
			this.anInt6384 = arg0.g2();
			if (this.anInt6384 == 65535) {
				this.anInt6384 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt6377 = arg0.g2();
		} else if (arg1 == 4) {
			this.aBoolean430 = false;
		}
	}
}
