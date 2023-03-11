import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class222 {

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "[I")
	public int[] anIntArray425;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
	public int anInt6270 = -1;

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
	public int anInt6275 = -1;

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
	private int anInt6279 = 0;

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
	public int anInt6272 = -1;

	@OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
	public int anInt6282 = -1;

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
	public int anInt6277 = -1;

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
	public int anInt6278 = 0;

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
	public int anInt6273 = -1;

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
	public int anInt6266 = 0;

	@OriginalMember(owner = "client!ti", name = "E", descriptor = "I")
	public int anInt6287 = 0;

	@OriginalMember(owner = "client!ti", name = "F", descriptor = "I")
	public int anInt6288 = -1;

	@OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
	public int anInt6281 = 0;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
	public int anInt6263 = -1;

	@OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
	public int anInt6291 = -1;

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
	public int anInt6265 = -1;

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
	public int anInt6274 = -1;

	@OriginalMember(owner = "client!ti", name = "J", descriptor = "Z")
	public boolean aBoolean424 = true;

	@OriginalMember(owner = "client!ti", name = "z", descriptor = "[I")
	public int[] anIntArray426 = null;

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
	public int anInt6264 = -1;

	@OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
	public int anInt6286 = -1;

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
	public int anInt6283 = 0;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
	public int anInt6267 = -1;

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
	public int anInt6268 = -1;

	@OriginalMember(owner = "client!ti", name = "B", descriptor = "[I")
	public int[] anIntArray427 = null;

	@OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
	public int anInt6292 = -1;

	@OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
	public int anInt6284 = -1;

	@OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
	public int anInt6296 = -1;

	@OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
	public int anInt6297 = -1;

	@OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
	public int anInt6280 = 0;

	@OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
	public int anInt6299 = -1;

	@OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
	public int anInt6290 = 0;

	@OriginalMember(owner = "client!ti", name = "U", descriptor = "I")
	public int anInt6300 = 0;

	@OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
	public int anInt6293 = -1;

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
	public int anInt6271 = -1;

	@OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
	public int anInt6303 = 0;

	@OriginalMember(owner = "client!ti", name = "Y", descriptor = "I")
	public int anInt6304 = -1;

	@OriginalMember(owner = "client!ti", name = "V", descriptor = "I")
	public int anInt6301 = -1;

	@OriginalMember(owner = "client!ti", name = "W", descriptor = "I")
	public int anInt6302 = 0;

	@OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
	public int anInt6295 = -1;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!bt;I)V")
	public void method5690(@OriginalArg(0) Class2_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4815();
			if (local13 == 0) {
				return;
			}
			this.method5691(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!bt;I)V")
	private void method5691(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt6291 = arg1.method4829();
			this.anInt6270 = arg1.method4829();
			if (this.anInt6291 == 65535) {
				this.anInt6291 = -1;
			}
			if (this.anInt6270 == 65535) {
				this.anInt6270 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt6265 = arg1.method4829();
		} else if (arg0 == 3) {
			this.anInt6299 = arg1.method4829();
		} else if (arg0 == 4) {
			this.anInt6284 = arg1.method4829();
		} else if (arg0 == 5) {
			this.anInt6267 = arg1.method4829();
		} else if (arg0 == 6) {
			this.anInt6263 = arg1.method4829();
		} else if (arg0 == 7) {
			this.anInt6292 = arg1.method4829();
		} else if (arg0 == 8) {
			this.anInt6271 = arg1.method4829();
		} else if (arg0 == 9) {
			this.anInt6301 = arg1.method4829();
		} else if (arg0 == 26) {
			this.anInt6287 = (short) (arg1.method4815() * 4);
			this.anInt6290 = (short) (arg1.method4815() * 4);
		} else {
			@Pc(137) int local137;
			@Pc(335) int local335;
			if (arg0 == 27) {
				if (this.anIntArrayArray53 == null) {
					this.anIntArrayArray53 = new int[12][];
				}
				local137 = arg1.method4815();
				this.anIntArrayArray53[local137] = new int[6];
				for (local335 = 0; local335 < 6; local335++) {
					this.anIntArrayArray53[local137][local335] = arg1.method4823();
				}
			} else if (arg0 == 28) {
				this.anIntArray425 = new int[12];
				for (local137 = 0; local137 < 12; local137++) {
					this.anIntArray425[local137] = arg1.method4815();
					if (this.anIntArray425[local137] == 255) {
						this.anIntArray425[local137] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt6266 = arg1.method4815();
			} else if (arg0 == 30) {
				this.anInt6300 = arg1.method4829();
			} else if (arg0 == 31) {
				this.anInt6302 = arg1.method4815();
			} else if (arg0 == 32) {
				this.anInt6278 = arg1.method4829();
			} else if (arg0 == 33) {
				this.anInt6281 = arg1.method4823();
			} else if (arg0 == 34) {
				this.anInt6303 = arg1.method4815();
			} else if (arg0 == 35) {
				this.anInt6280 = arg1.method4829();
			} else if (arg0 == 36) {
				this.anInt6283 = arg1.method4823();
			} else if (arg0 == 37) {
				this.anInt6274 = arg1.method4815();
			} else if (arg0 == 38) {
				this.anInt6286 = arg1.method4829();
			} else if (arg0 == 39) {
				this.anInt6273 = arg1.method4829();
			} else if (arg0 == 40) {
				this.anInt6293 = arg1.method4829();
			} else if (arg0 == 41) {
				this.anInt6268 = arg1.method4829();
			} else if (arg0 == 42) {
				this.anInt6296 = arg1.method4829();
			} else if (arg0 == 43) {
				this.anInt6304 = arg1.method4829();
			} else if (arg0 == 44) {
				this.anInt6288 = arg1.method4829();
			} else if (arg0 == 45) {
				this.anInt6272 = arg1.method4829();
			} else if (arg0 == 46) {
				this.anInt6297 = arg1.method4829();
			} else if (arg0 == 47) {
				this.anInt6295 = arg1.method4829();
			} else if (arg0 == 48) {
				this.anInt6264 = arg1.method4829();
			} else if (arg0 == 49) {
				this.anInt6275 = arg1.method4829();
			} else if (arg0 == 50) {
				this.anInt6277 = arg1.method4829();
			} else if (arg0 == 51) {
				this.anInt6282 = arg1.method4829();
			} else if (arg0 == 52) {
				local137 = arg1.method4815();
				this.anIntArray426 = new int[local137];
				this.anIntArray427 = new int[local137];
				for (local335 = 0; local335 < local137; local335++) {
					this.anIntArray426[local335] = arg1.method4829();
					@Pc(348) int local348 = arg1.method4815();
					this.anIntArray427[local335] = local348;
					this.anInt6279 += local348;
				}
			} else if (arg0 == 53) {
				this.aBoolean424 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)Z")
	public boolean method5692(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt6291 == arg0) {
			return true;
		} else {
			if (this.anIntArray426 != null) {
				for (@Pc(32) int local32 = 0; local32 < this.anIntArray426.length; local32++) {
					if (arg0 == this.anIntArray426[local32]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)I")
	public int method5696() {
		if (this.anInt6291 != -1) {
			return this.anInt6291;
		} else if (this.anIntArray426 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) ((double) this.anInt6279 * Math.random());
			@Pc(30) int local30;
			for (local30 = 0; local28 >= this.anIntArray427[local30]; local30++) {
				local28 -= this.anIntArray427[local30];
			}
			return this.anIntArray426[local30];
		}
	}
}
