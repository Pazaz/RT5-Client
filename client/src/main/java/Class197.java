import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class197 {

	@OriginalMember(owner = "client!r", name = "c", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray35;

	@OriginalMember(owner = "client!r", name = "S", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!r", name = "h", descriptor = "Lclient!ra;")
	private Class198 aClass198_2 = null;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "Lclient!di;")
	private final Class25 aClass25_1;

	@OriginalMember(owner = "client!r", name = "x", descriptor = "Z")
	private final boolean aBoolean393;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "I")
	public int anInt5558;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!di;ZI)V")
	public Class197(@OriginalArg(0) Class25 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass25_1 = arg0;
		this.aBoolean393 = arg1;
		this.anInt5558 = arg2;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)I")
	private int method5067(@OriginalArg(1) int arg0) {
		if (this.method5102(arg0)) {
			return this.anObjectArray35[arg0] == null ? this.aClass25_1.method887(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	public void method5068() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.anObjectArrayArray1.length; local11++) {
				this.anObjectArrayArray1[local11] = null;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)Z")
	private boolean method5069(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5086()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass198_2.anIntArray377.length > arg1 && arg0 < this.aClass198_2.anIntArray377[arg1]) {
			return true;
		} else if (Static97.aBoolean144) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZIZ)V")
	public void method5070(@OriginalArg(2) boolean arg0) {
		if (!this.method5086()) {
			return;
		}
		this.aClass198_2.aClass167Array1 = null;
		this.aClass198_2.anIntArrayArray47 = null;
		if (arg0) {
			this.aClass198_2.anIntArray379 = null;
			this.aClass198_2.aClass167_1 = null;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(BI)Z")
	public boolean method5071(@OriginalArg(1) int arg0) {
		if (!this.method5102(arg0)) {
			return false;
		} else if (this.anObjectArray35[arg0] == null) {
			this.method5079(arg0);
			return this.anObjectArray35[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method5072(@OriginalArg(0) String arg0) {
		if (this.method5086()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass198_2.aClass167_1.method4249(Static278.method4722(local20));
			return this.method5071(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)Z")
	public boolean method5073() {
		if (!this.method5086()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass198_2.anIntArray380.length; local15++) {
			@Pc(23) int local23 = this.aClass198_2.anIntArray380[local15];
			if (this.anObjectArray35[local23] == null) {
				this.method5079(local23);
				if (this.anObjectArray35[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BII[I)Z")
	private boolean method5074(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method5102(arg1)) {
			return false;
		} else if (this.anObjectArray35[arg1] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass198_2.anIntArray376[arg1];
			@Pc(31) int[] local31 = this.aClass198_2.anIntArrayArray46[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass198_2.anIntArray377[arg1]];
			}
			@Pc(60) Object[] local60 = this.anObjectArrayArray1[arg1];
			@Pc(62) boolean local62 = true;
			for (@Pc(64) int local64 = 0; local64 < local25; local64++) {
				@Pc(70) int local70;
				if (local31 == null) {
					local70 = local64;
				} else {
					local70 = local31[local64];
				}
				if (local60[local70] == null) {
					local62 = false;
					break;
				}
			}
			if (local62) {
				return true;
			}
			@Pc(128) byte[] local128;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local128 = Static155.method2787(false, this.anObjectArray35[arg1]);
			} else {
				local128 = Static155.method2787(true, this.anObjectArray35[arg1]);
				@Pc(133) Class2_Sub4 local133 = new Class2_Sub4(local128);
				local133.method4821(arg2, local133.aByteArray73.length);
			}
			@Pc(157) byte[] local157;
			try {
				local157 = Static161.method2970(local128);
			} catch (@Pc(159) RuntimeException local159) {
				throw Static382.method6364(local159, "T3 - " + (arg2 != null) + "," + arg1 + "," + local128.length + "," + Static36.method1111(local128, local128.length) + "," + Static36.method1111(local128, local128.length - 2) + "," + this.aClass198_2.anIntArray382[arg1] + "," + this.aClass198_2.anInt5589);
			}
			if (this.aBoolean393) {
				this.anObjectArray35[arg1] = null;
			}
			@Pc(232) int local232;
			if (local25 > 1) {
				@Pc(239) int local239;
				@Pc(252) Class2_Sub4 local252;
				@Pc(260) int local260;
				@Pc(264) int local264;
				@Pc(266) int local266;
				@Pc(320) int local320;
				@Pc(322) int local322;
				@Pc(326) int local326;
				@Pc(328) int local328;
				if (this.anInt5558 == 2) {
					local232 = local157.length;
					local232--;
					local239 = local157[local232] & 0xFF;
					local232 -= local239 * local25 * 4;
					local252 = new Class2_Sub4(local157);
					@Pc(437) int local437 = 0;
					local252.anInt5300 = local232;
					local260 = 0;
					for (local264 = 0; local264 < local239; local264++) {
						local266 = 0;
						for (local320 = 0; local320 < local25; local320++) {
							local266 += local252.method4836();
							if (local31 == null) {
								local322 = local320;
							} else {
								local322 = local31[local320];
							}
							if (arg0 == local322) {
								local260 = local322;
								local437 += local266;
							}
						}
					}
					if (local437 == 0) {
						return true;
					}
					@Pc(496) byte[] local496 = new byte[local437];
					local252.anInt5300 = local232;
					local437 = 0;
					local320 = 0;
					for (local322 = 0; local322 < local239; local322++) {
						local326 = 0;
						for (local328 = 0; local328 < local25; local328++) {
							local326 += local252.method4836();
							@Pc(523) int local523;
							if (local31 == null) {
								local523 = local328;
							} else {
								local523 = local31[local328];
							}
							if (local523 == arg0) {
								Static404.method4607(local157, local320, local496, local437, local326);
								local437 += local326;
							}
							local320 += local326;
						}
					}
					local60[local260] = local496;
				} else {
					local232 = local157.length;
					@Pc(235) int local235 = local232 - 1;
					local239 = local157[local235] & 0xFF;
					@Pc(247) int local247 = local235 - local239 * local25 * 4;
					local252 = new Class2_Sub4(local157);
					@Pc(255) int[] local255 = new int[local25];
					local252.anInt5300 = local247;
					for (local260 = 0; local260 < local239; local260++) {
						local264 = 0;
						for (local266 = 0; local266 < local25; local266++) {
							local264 += local252.method4836();
							local255[local266] += local264;
						}
					}
					@Pc(296) byte[][] local296 = new byte[local25][];
					for (local266 = 0; local266 < local25; local266++) {
						local296[local266] = new byte[local255[local266]];
						local255[local266] = 0;
					}
					local252.anInt5300 = local247;
					local320 = 0;
					for (local322 = 0; local322 < local239; local322++) {
						local326 = 0;
						for (local328 = 0; local328 < local25; local328++) {
							local326 += local252.method4836();
							Static404.method4607(local157, local320, local296[local328], local255[local328], local326);
							local320 += local326;
							local255[local328] += local326;
						}
					}
					for (local326 = 0; local326 < local25; local326++) {
						if (local31 == null) {
							local328 = local326;
						} else {
							local328 = local31[local326];
						}
						if (this.anInt5558 == 0) {
							local60[local328] = Static6.method143(local296[local326]);
						} else {
							local60[local328] = local296[local326];
						}
					}
				}
			} else {
				if (local31 == null) {
					local232 = 0;
				} else {
					local232 = local31[0];
				}
				if (this.anInt5558 == 0) {
					local60[local232] = Static6.method143(local157);
				} else {
					local60[local232] = local157;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method5075(@OriginalArg(1) String arg0) {
		if (this.method5086()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass198_2.aClass167_1.method4249(Static278.method4722(local18));
			return this.method5102(local29) ? local29 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/lang/String;B)V")
	public void method5076(@OriginalArg(0) String arg0) {
		if (this.method5086()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass198_2.aClass167_1.method4249(Static278.method4722(local17));
			this.method5083(local26);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IZ)[I")
	public int[] method5077(@OriginalArg(0) int arg0) {
		if (!this.method5102(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass198_2.anIntArrayArray46[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass198_2.anIntArray376[arg0]];
			@Pc(34) int local34 = 0;
			while (local23.length > local34) {
				local23[local34] = local34++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)I")
	public int method5078() {
		if (!this.method5086()) {
			throw new IllegalStateException("");
		}
		return this.aClass198_2.anInt5589;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(BI)V")
	private void method5079(@OriginalArg(1) int arg0) {
		if (this.aBoolean393) {
			this.anObjectArray35[arg0] = this.aClass25_1.method889(arg0);
		} else {
			this.anObjectArray35[arg0] = Static6.method143(this.aClass25_1.method889(arg0));
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([IIII)[B")
	public byte[] method5080(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method5069(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(32) boolean local32 = this.method5074(arg1, arg2, arg0);
			if (!local32) {
				this.method5079(arg2);
				local32 = this.method5074(arg1, arg2, arg0);
				if (!local32) {
					return null;
				}
			}
		}
		@Pc(65) byte[] local65 = Static155.method2787(false, this.anObjectArrayArray1[arg2][arg1]);
		if (this.anInt5558 == 1) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass198_2.anIntArray377[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt5558 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local65;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)I")
	public int method5081(@OriginalArg(0) int arg0) {
		return this.method5102(arg0) ? this.aClass198_2.anIntArray377[arg0] : 0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[B")
	public byte[] method5082(@OriginalArg(0) int arg0) {
		if (!this.method5086()) {
			return null;
		} else if (this.aClass198_2.anIntArray377.length == 1) {
			return this.method5089(arg0, 0);
		} else if (!this.method5102(arg0)) {
			return null;
		} else if (this.aClass198_2.anIntArray377[arg0] == 1) {
			return this.method5089(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)V")
	private void method5083(@OriginalArg(0) int arg0) {
		this.aClass25_1.method885(arg0);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] method5084(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5086()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(28) int local28 = this.aClass198_2.aClass167_1.method4249(Static278.method4722(local12));
		if (this.method5102(local28)) {
			@Pc(46) int local46 = this.aClass198_2.aClass167Array1[local28].method4249(Static278.method4722(local15));
			return this.method5089(local46, local28);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/lang/String;B)I")
	public int method5085(@OriginalArg(0) String arg0) {
		if (this.method5086()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass198_2.aClass167_1.method4249(Static278.method4722(local12));
			return this.method5067(local21);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)Z")
	private boolean method5086() {
		if (this.aClass198_2 == null) {
			this.aClass198_2 = this.aClass25_1.method884();
			if (this.aClass198_2 == null) {
				return false;
			}
			this.anObjectArray35 = new Object[this.aClass198_2.anInt5592];
			this.anObjectArrayArray1 = new Object[this.aClass198_2.anInt5592][];
		}
		return true;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(BI)Z")
	public boolean method5087(@OriginalArg(1) int arg0) {
		if (!this.method5086()) {
			return false;
		} else if (this.aClass198_2.anIntArray377.length == 1) {
			return this.method5088(arg0, 0);
		} else if (!this.method5102(arg0)) {
			return false;
		} else if (this.aClass198_2.anIntArray377[arg0] == 1) {
			return this.method5088(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(III)Z")
	public boolean method5088(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5069(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray35[arg1] == null) {
			this.method5079(arg1);
			return this.anObjectArray35[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BII)[B")
	public byte[] method5089(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method5080(null, arg0, arg1);
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
	public void method5090() {
		if (this.anObjectArray35 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArray35.length; local14++) {
				this.anObjectArray35[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(B)I")
	public int method5091() {
		if (!this.method5086()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anObjectArray35.length; local25++) {
			if (this.aClass198_2.anIntArray376[local25] > 0) {
				local13 += 100;
				local23 += this.method5067(local25);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local23 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(B)I")
	public int method5092() {
		return this.method5086() ? this.aClass198_2.anIntArray377.length : -1;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(II)V")
	public void method5095(@OriginalArg(1) int arg0) {
		if (this.method5102(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IZ)I")
	public int method5097(@OriginalArg(0) int arg0) {
		if (this.method5086()) {
			@Pc(16) int local16 = this.aClass198_2.aClass167_1.method4249(arg0);
			return this.method5102(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Z")
	public boolean method5098(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5086()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass198_2.aClass167_1.method4249(Static278.method4722(local12));
		if (this.method5102(local24)) {
			@Pc(47) int local47 = this.aClass198_2.aClass167Array1[local24].method4249(Static278.method4722(local15));
			return this.method5088(local47, local24);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method5101(@OriginalArg(1) String arg0) {
		if (this.method5086()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass198_2.aClass167_1.method4249(Static278.method4722(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(II)Z")
	private boolean method5102(@OriginalArg(1) int arg0) {
		if (!this.method5086()) {
			return false;
		} else if (arg0 >= 0 && this.aClass198_2.anIntArray377.length > arg0 && this.aClass198_2.anIntArray377[arg0] != 0) {
			return true;
		} else if (Static97.aBoolean144) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}
}
