import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class264 {

	@OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
	public int anInt6630;

	@OriginalMember(owner = "client!nq", name = "o", descriptor = "I")
	public int anInt6632;

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
	public int anInt6637;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
	public int anInt6639;

	@OriginalMember(owner = "client!nq", name = "n", descriptor = "I")
	public int anInt6633 = -1;

	@OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
	private int anInt6634 = 0;

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "Z")
	public boolean aBoolean497 = true;

	@OriginalMember(owner = "client!nq", name = "m", descriptor = "I")
	public int anInt6635 = 512;

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "Z")
	public boolean aBoolean498 = true;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!ge;I)V")
	private void method5920(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub21 arg1) {
		if (arg0 == 1) {
			this.anInt6634 = arg1.method7383();
			this.method5922(this.anInt6634);
		} else if (arg0 == 2) {
			this.anInt6633 = arg1.method7382();
			if (this.anInt6633 == 65535) {
				this.anInt6633 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt6635 = arg1.method7382() << 2;
		} else if (arg0 == 4) {
			this.aBoolean498 = false;
		} else if (arg0 == 5) {
			this.aBoolean497 = false;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method5921(@OriginalArg(0) Class2_Sub21 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method7396();
			if (local3 == 0) {
				return;
			}
			this.method5920(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)V")
	private void method5922(@OriginalArg(0) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local12;
		if (local12 > local21) {
			local30 = local21;
		}
		if (local30 > local28) {
			local30 = local28;
		}
		@Pc(44) double local44 = local12;
		if (local21 > local12) {
			local44 = local21;
		}
		if (local28 > local44) {
			local44 = local28;
		}
		@Pc(58) double local58 = 0.0D;
		@Pc(60) double local60 = 0.0D;
		@Pc(66) double local66 = (local30 + local44) / 2.0D;
		if (local30 != local44) {
			if (local66 < 0.5D) {
				local60 = (local44 - local30) / (local30 + local44);
			}
			if (local12 == local44) {
				local58 = (local21 - local28) / (local44 - local30);
			} else if (local44 == local21) {
				local58 = (local28 - local12) / (local44 - local30) + 2.0D;
			} else if (local44 == local28) {
				local58 = (local12 - local21) / (-local30 + local44) + 4.0D;
			}
			if (local66 >= 0.5D) {
				local60 = (local44 - local30) / (2.0D - local44 - local30);
			}
		}
		this.anInt6637 = (int) (local60 * 256.0D);
		this.anInt6639 = (int) (local66 * 256.0D);
		local58 /= 6.0D;
		if (local66 > 0.5D) {
			this.anInt6632 = (int) ((1.0D - local66) * 512.0D * local60);
		} else {
			this.anInt6632 = (int) (local66 * 512.0D * local60);
		}
		if (this.anInt6639 < 0) {
			this.anInt6639 = 0;
		} else if (this.anInt6639 > 255) {
			this.anInt6639 = 255;
		}
		if (this.anInt6637 < 0) {
			this.anInt6637 = 0;
		} else if (this.anInt6637 > 255) {
			this.anInt6637 = 255;
		}
		if (this.anInt6632 < 1) {
			this.anInt6632 = 1;
		}
		this.anInt6630 = (int) (local58 * (double) this.anInt6632);
	}
}
