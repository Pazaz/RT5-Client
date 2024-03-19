import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class162 {

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!qj", name = "q", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray5;

	@OriginalMember(owner = "client!qj", name = "w", descriptor = "Lclient!wo;")
	private Class220 aClass220_2 = null;

	@OriginalMember(owner = "client!qj", name = "D", descriptor = "Lclient!bs;")
	private final Class26 aClass26_1;

	@OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
	public int anInt5438;

	@OriginalMember(owner = "client!qj", name = "L", descriptor = "Z")
	private final boolean aBoolean379;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!bs;ZI)V")
	public Class162(@OriginalArg(0) Class26 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass26_1 = arg0;
		this.anInt5438 = arg2;
		this.aBoolean379 = arg1;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)Z")
	public boolean method4615(@OriginalArg(1) int arg0) {
		if (!this.method4619()) {
			return false;
		} else if (this.aClass220_2.anIntArray598.length == 1) {
			return this.method4626(arg0, 0);
		} else if (!this.method4646(arg0)) {
			return false;
		} else if (this.aClass220_2.anIntArray598[arg0] == 1) {
			return this.method4626(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)V")
	public void method4616(@OriginalArg(0) int arg0) {
		if (this.method4646(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method4617(@OriginalArg(1) String arg0) {
		if (this.method4619()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass220_2.aClass136_1.method4126(Static130.method5742(local17));
			return this.method4639(local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)Z")
	private boolean method4619() {
		if (this.aClass220_2 == null) {
			this.aClass220_2 = this.aClass26_1.method3361();
			if (this.aClass220_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass220_2.anInt7330][];
			this.anObjectArray5 = new Object[this.aClass220_2.anInt7330];
		}
		return true;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZZ)V")
	public void method4620(@OriginalArg(2) boolean arg0) {
		if (!this.method4619()) {
			return;
		}
		if (arg0) {
			this.aClass220_2.anIntArray599 = null;
			this.aClass220_2.aClass136_1 = null;
		}
		this.aClass220_2.anIntArrayArray59 = null;
		this.aClass220_2.aClass136Array1 = null;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)[I")
	public int[] method4621(@OriginalArg(1) int arg0) {
		if (!this.method4646(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass220_2.anIntArrayArray60[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass220_2.anIntArray601[arg0]];
			@Pc(34) int local34 = 0;
			while (local34 < local23.length) {
				local23[local34] = local34++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(Z)Z")
	public boolean method4623() {
		if (!this.method4619()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass220_2.anIntArray600.length; local15++) {
			@Pc(23) int local23 = this.aClass220_2.anIntArray600[local15];
			if (this.anObjectArray5[local23] == null) {
				this.method4638(local23);
				if (this.anObjectArray5[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(II)V")
	private void method4624(@OriginalArg(1) int arg0) {
		this.aClass26_1.method3362(arg0);
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(BLjava/lang/String;)V")
	public void method4625(@OriginalArg(1) String arg0) {
		if (this.method4619()) {
			@Pc(21) String local21 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass220_2.aClass136_1.method4126(Static130.method5742(local21));
			this.method4624(local30);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)Z")
	public boolean method4626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method4637(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray5[arg1] == null) {
			this.method4638(arg1);
			return this.anObjectArray5[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)I")
	public int method4627() {
		if (!this.method4619()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray5.length; local17++) {
			if (this.aClass220_2.anIntArray601[local17] > 0) {
				local13 += 100;
				local15 += this.method4647(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(Z)V")
	public void method4628() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anObjectArrayArray1.length; local18++) {
				this.anObjectArrayArray1[local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "([IIII)Z")
	private boolean method4629(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method4646(arg2)) {
			return false;
		} else if (this.anObjectArray5[arg2] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass220_2.anIntArray601[arg2];
			@Pc(31) int[] local31 = this.aClass220_2.anIntArrayArray60[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass220_2.anIntArray598[arg2]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg2];
			@Pc(53) boolean local53 = true;
			for (@Pc(55) int local55 = 0; local55 < local25; local55++) {
				@Pc(63) int local63;
				if (local31 == null) {
					local63 = local55;
				} else {
					local63 = local31[local55];
				}
				if (local51[local63] == null) {
					local53 = false;
					break;
				}
			}
			if (local53) {
				return true;
			}
			@Pc(112) byte[] local112;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local112 = Static287.method5123(false, this.anObjectArray5[arg2]);
			} else {
				local112 = Static287.method5123(true, this.anObjectArray5[arg2]);
				@Pc(127) Class1_Sub16 local127 = new Class1_Sub16(local112);
				local127.method5763(local127.aByteArray86.length, arg0);
			}
			@Pc(147) byte[] local147;
			try {
				local147 = Static85.method1903(local112);
			} catch (@Pc(149) RuntimeException local149) {
				throw Static47.method1320(local149, "T3 - " + (arg0 != null) + "," + arg2 + "," + local112.length + "," + Static244.method2181(local112.length, local112) + "," + Static244.method2181(local112.length - 2, local112) + "," + this.aClass220_2.anIntArray603[arg2] + "," + this.aClass220_2.anInt7331);
			}
			if (this.aBoolean379) {
				this.anObjectArray5[arg2] = null;
			}
			@Pc(219) int local219;
			if (local25 <= 1) {
				if (local31 == null) {
					local219 = 0;
				} else {
					local219 = local31[0];
				}
				if (this.anInt5438 == 0) {
					local51[local219] = Static13.method5491(local147);
				} else {
					local51[local219] = local147;
				}
			} else {
				@Pc(262) int local262;
				@Pc(275) Class1_Sub16 local275;
				@Pc(282) int local282;
				@Pc(284) int local284;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(302) int local302;
				@Pc(349) int local349;
				@Pc(351) int local351;
				if (this.anInt5438 == 2) {
					local219 = local147.length;
					local219--;
					local262 = local147[local219] & 0xFF;
					local219 -= local262 * local25 * 4;
					local275 = new Class1_Sub16(local147);
					@Pc(277) int local277 = 0;
					local275.anInt6813 = local219;
					local282 = 0;
					for (local284 = 0; local284 < local262; local284++) {
						local288 = 0;
						for (local290 = 0; local290 < local25; local290++) {
							local288 += local275.method5730();
							if (local31 == null) {
								local302 = local290;
							} else {
								local302 = local31[local290];
							}
							if (arg1 == local302) {
								local277 += local288;
								local282 = local302;
							}
						}
					}
					if (local277 == 0) {
						return true;
					}
					@Pc(336) byte[] local336 = new byte[local277];
					local277 = 0;
					local275.anInt6813 = local219;
					local290 = 0;
					for (local302 = 0; local302 < local262; local302++) {
						local349 = 0;
						for (local351 = 0; local351 < local25; local351++) {
							local349 += local275.method5730();
							@Pc(365) int local365;
							if (local31 == null) {
								local365 = local351;
							} else {
								local365 = local31[local351];
							}
							if (local365 == arg1) {
								Static360.method2013(local147, local290, local336, local277, local349);
								local277 += local349;
							}
							local290 += local349;
						}
					}
					local51[local282] = local336;
				} else {
					local219 = local147.length;
					local219--;
					local262 = local147[local219] & 0xFF;
					local219 -= local262 * 4 * local25;
					local275 = new Class1_Sub16(local147);
					local275.anInt6813 = local219;
					@Pc(429) int[] local429 = new int[local25];
					for (local282 = 0; local282 < local262; local282++) {
						local284 = 0;
						for (local288 = 0; local288 < local25; local288++) {
							local284 += local275.method5730();
							local429[local288] += local284;
						}
					}
					@Pc(467) byte[][] local467 = new byte[local25][];
					for (local288 = 0; local288 < local25; local288++) {
						local467[local288] = new byte[local429[local288]];
						local429[local288] = 0;
					}
					local275.anInt6813 = local219;
					local290 = 0;
					for (local302 = 0; local302 < local262; local302++) {
						local349 = 0;
						for (local351 = 0; local351 < local25; local351++) {
							local349 += local275.method5730();
							Static360.method2013(local147, local290, local467[local351], local429[local351], local349);
							local290 += local349;
							local429[local351] += local349;
						}
					}
					for (local349 = 0; local349 < local25; local349++) {
						if (local31 == null) {
							local351 = local349;
						} else {
							local351 = local31[local349];
						}
						if (this.anInt5438 == 0) {
							local51[local351] = Static13.method5491(local467[local349]);
						} else {
							local51[local351] = local467[local349];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(II)[B")
	public byte[] method4630(@OriginalArg(0) int arg0) {
		if (!this.method4619()) {
			return null;
		} else if (this.aClass220_2.anIntArray598.length == 1) {
			return this.method4636(arg0, 0);
		} else if (!this.method4646(arg0)) {
			return null;
		} else if (this.aClass220_2.anIntArray598[arg0] == 1) {
			return this.method4636(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method4631(@OriginalArg(1) String arg0) {
		if (this.method4619()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass220_2.aClass136_1.method4126(Static130.method5742(local18));
			return this.method4646(local27) ? local27 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "([IIII)[B")
	public byte[] method4632(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method4637(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg2] == null) {
			@Pc(39) boolean local39 = this.method4629(arg0, arg2, arg1);
			if (!local39) {
				this.method4638(arg1);
				local39 = this.method4629(arg0, arg2, arg1);
				if (!local39) {
					return null;
				}
			}
		}
		@Pc(68) byte[] local68 = Static287.method5123(false, this.anObjectArrayArray1[arg1][arg2]);
		if (this.anInt5438 == 1) {
			this.anObjectArrayArray1[arg1][arg2] = null;
			if (this.aClass220_2.anIntArray598[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt5438 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local68;
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)I")
	public int method4633() {
		return this.method4619() ? this.aClass220_2.anIntArray598.length : -1;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method4634(@OriginalArg(0) String arg0) {
		if (this.method4619()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(25) int local25 = this.aClass220_2.aClass136_1.method4126(Static130.method5742(local12));
			return this.method4647(local25);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method4635(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4619()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass220_2.aClass136_1.method4126(Static130.method5742(local12));
		if (this.method4646(local24)) {
			@Pc(42) int local42 = this.aClass220_2.aClass136Array1[local24].method4126(Static130.method5742(local15));
			return this.method4626(local42, local24);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(III)[B")
	public byte[] method4636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method4632(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIB)Z")
	private boolean method4637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method4619()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass220_2.anIntArray598.length > arg1 && arg0 < this.aClass220_2.anIntArray598[arg1]) {
			return true;
		} else if (Static293.aBoolean426) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "(II)V")
	private void method4638(@OriginalArg(0) int arg0) {
		if (this.aBoolean379) {
			this.anObjectArray5[arg0] = this.aClass26_1.method3363(arg0);
		} else {
			this.anObjectArray5[arg0] = Static13.method5491(this.aClass26_1.method3363(arg0));
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)Z")
	public boolean method4639(@OriginalArg(0) int arg0) {
		if (!this.method4646(arg0)) {
			return false;
		} else if (this.anObjectArray5[arg0] == null) {
			this.method4638(arg0);
			return this.anObjectArray5[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(IB)I")
	public int method4640(@OriginalArg(0) int arg0) {
		return this.method4646(arg0) ? this.aClass220_2.anIntArray598[arg0] : 0;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)I")
	public int method4641() {
		if (!this.method4619()) {
			throw new IllegalStateException("");
		}
		return this.aClass220_2.anInt7331;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B")
	public byte[] method4642(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method4619()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass220_2.aClass136_1.method4126(Static130.method5742(local12));
		if (this.method4646(local24)) {
			@Pc(50) int local50 = this.aClass220_2.aClass136Array1[local24].method4126(Static130.method5742(local15));
			return this.method4636(local50, local24);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method4643(@OriginalArg(1) String arg0) {
		if (this.method4619()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass220_2.aClass136_1.method4126(Static130.method5742(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(BI)I")
	public int method4644(@OriginalArg(1) int arg0) {
		if (this.method4619()) {
			@Pc(24) int local24 = this.aClass220_2.aClass136_1.method4126(arg0);
			return this.method4646(local24) ? local24 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(Z)V")
	public void method4645() {
		if (this.anObjectArray5 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray5.length; local6++) {
				this.anObjectArray5[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)Z")
	private boolean method4646(@OriginalArg(0) int arg0) {
		if (!this.method4619()) {
			return false;
		} else if (arg0 >= 0 && this.aClass220_2.anIntArray598.length > arg0 && this.aClass220_2.anIntArray598[arg0] != 0) {
			return true;
		} else if (Static293.aBoolean426) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "(II)I")
	private int method4647(@OriginalArg(0) int arg0) {
		if (this.method4646(arg0)) {
			return this.anObjectArray5[arg0] == null ? this.aClass26_1.method3364(arg0) : 100;
		} else {
			return 0;
		}
	}
}
