import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class MelType {

	@OriginalMember(owner = "client!np", name = "a", descriptor = "I")
	private int anInt4404;

	@OriginalMember(owner = "client!np", name = "d", descriptor = "I")
	private int anInt4407;

	@OriginalMember(owner = "client!np", name = "h", descriptor = "Lclient!ki;")
	public MelTypeList aClass125_2;

	@OriginalMember(owner = "client!np", name = "j", descriptor = "[I")
	public int[] anIntArray290;

	@OriginalMember(owner = "client!np", name = "n", descriptor = "I")
	public int anInt4414;

	@OriginalMember(owner = "client!np", name = "r", descriptor = "I")
	public int anInt4417;

	@OriginalMember(owner = "client!np", name = "t", descriptor = "Lclient!ad;")
	private HashTable aClass4_89;

	@OriginalMember(owner = "client!np", name = "x", descriptor = "Ljava/lang/String;")
	public String aString48;

	@OriginalMember(owner = "client!np", name = "y", descriptor = "I")
	public int anInt4422;

	@OriginalMember(owner = "client!np", name = "E", descriptor = "I")
	private int anInt4427;

	@OriginalMember(owner = "client!np", name = "H", descriptor = "I")
	public int anInt4430;

	@OriginalMember(owner = "client!np", name = "I", descriptor = "I")
	public int anInt4431;

	@OriginalMember(owner = "client!np", name = "N", descriptor = "Ljava/lang/String;")
	public String aString49;

	@OriginalMember(owner = "client!np", name = "Q", descriptor = "I")
	public int anInt4437;

	@OriginalMember(owner = "client!np", name = "S", descriptor = "I")
	private int anInt4439;

	@OriginalMember(owner = "client!np", name = "c", descriptor = "I")
	public int anInt4406 = -1;

	@OriginalMember(owner = "client!np", name = "s", descriptor = "I")
	public int anInt4418 = 0;

	@OriginalMember(owner = "client!np", name = "i", descriptor = "I")
	private int anInt4410 = -1;

	@OriginalMember(owner = "client!np", name = "e", descriptor = "Z")
	public boolean aBoolean302 = true;

	@OriginalMember(owner = "client!np", name = "u", descriptor = "I")
	public int anInt4419 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!np", name = "q", descriptor = "Z")
	public boolean aBoolean303 = true;

	@OriginalMember(owner = "client!np", name = "m", descriptor = "I")
	private int anInt4413 = -1;

	@OriginalMember(owner = "client!np", name = "v", descriptor = "I")
	public int anInt4420 = -1;

	@OriginalMember(owner = "client!np", name = "A", descriptor = "I")
	public int anInt4424 = -1;

	@OriginalMember(owner = "client!np", name = "C", descriptor = "Z")
	public boolean aBoolean304 = false;

	@OriginalMember(owner = "client!np", name = "J", descriptor = "I")
	public int anInt4432 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!np", name = "L", descriptor = "I")
	private int anInt4433 = -1;

	@OriginalMember(owner = "client!np", name = "k", descriptor = "I")
	private int anInt4411 = -1;

	@OriginalMember(owner = "client!np", name = "K", descriptor = "Z")
	public boolean aBoolean305 = true;

	@OriginalMember(owner = "client!np", name = "O", descriptor = "I")
	private int anInt4435 = -1;

	@OriginalMember(owner = "client!np", name = "M", descriptor = "I")
	public int anInt4434 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!np", name = "F", descriptor = "I")
	public int anInt4428 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!np", name = "R", descriptor = "I")
	public int anInt4438 = -1;

	@OriginalMember(owner = "client!np", name = "T", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray41 = new String[5];

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!wl;B)Z")
	public boolean method4180(@OriginalArg(0) Interface11 arg0) {
		@Pc(16) int local16;
		if (this.anInt4410 == -1) {
			if (this.anInt4433 == -1) {
				return true;
			}
			local16 = arg0.method5778(this.anInt4433);
		} else {
			local16 = arg0.method5777(this.anInt4410);
		}
		if (local16 < this.anInt4407 || local16 > this.anInt4404) {
			return false;
		}
		@Pc(57) int local57;
		if (this.anInt4411 == -1) {
			if (this.anInt4435 == -1) {
				return true;
			}
			local57 = arg0.method5778(this.anInt4435);
		} else {
			local57 = arg0.method5777(this.anInt4411);
		}
		return this.anInt4427 <= local57 && this.anInt4439 >= local57;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BLclient!bt;)V")
	public void decode(@OriginalArg(1) Buffer arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.decode(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BLclient!wm;)Lclient!jd;")
	public Sprite method4183(@OriginalArg(1) TextureProvider arg0) {
		@Pc(28) Sprite local28 = (Sprite) this.aClass125_2.aClass98_27.get((long) (this.anInt4413 | 0x20000 | arg0.anInt2836 << 29));
		if (local28 != null) {
			return local28;
		}
		this.aClass125_2.aClass197_50.isFileReady(this.anInt4413);
		@Pc(48) Class48 local48 = Static396.method1682(this.aClass125_2.aClass197_50, this.anInt4413, 0);
		if (local48 != null) {
			local28 = arg0.method2891(local48);
			this.aClass125_2.aClass98_27.put((long) (this.anInt4413 | 0x20000 | arg0.anInt2836 << 29), local28);
		}
		return local28;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BILjava/lang/String;)Ljava/lang/String;")
	public String method4185(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass4_89 == null) {
			return arg1;
		} else {
			@Pc(22) Class2_Sub40 local22 = (Class2_Sub40) this.aClass4_89.get((long) arg0);
			return local22 == null ? arg1 : local22.aString65;
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IILclient!bt;)V")
	private void decode(@OriginalArg(0) int arg0, @OriginalArg(2) Buffer arg1) {
		if (arg0 == 1) {
			this.anInt4420 = arg1.g2();
		} else if (arg0 == 2) {
			this.anInt4438 = arg1.g2();
		} else if (arg0 == 3) {
			this.aString48 = arg1.gjstr();
		} else if (arg0 == 4) {
			this.anInt4431 = arg1.ig3();
		} else if (arg0 == 5) {
			this.anInt4406 = arg1.ig3();
		} else if (arg0 == 6) {
			this.anInt4418 = arg1.g1();
		} else {
			@Pc(57) int local57;
			if (arg0 == 7) {
				local57 = arg1.g1();
				if ((local57 & 0x1) == 0) {
					this.aBoolean305 = false;
				}
				if ((local57 & 0x2) == 2) {
					this.aBoolean304 = true;
				}
			} else if (arg0 == 8) {
				this.aBoolean303 = arg1.g1() == 1;
			} else if (arg0 == 9) {
				this.anInt4433 = arg1.g2();
				if (this.anInt4433 == 65535) {
					this.anInt4433 = -1;
				}
				this.anInt4410 = arg1.g2();
				if (this.anInt4410 == 65535) {
					this.anInt4410 = -1;
				}
				this.anInt4407 = arg1.g4();
				this.anInt4404 = arg1.g4();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray41[arg0 - 10] = arg1.gjstr();
			} else {
				@Pc(196) int local196;
				if (arg0 == 15) {
					local57 = arg1.g1();
					this.anIntArray290 = new int[local57 * 2];
					for (local196 = 0; local196 < local57 * 2; local196++) {
						this.anIntArray290[local196] = arg1.g2s();
					}
					this.anInt4422 = arg1.g4();
					this.anInt4414 = arg1.g4();
				} else if (arg0 == 16) {
					this.aBoolean302 = false;
				} else if (arg0 == 17) {
					this.aString49 = arg1.gjstr();
				} else if (arg0 == 18) {
					this.anInt4413 = arg1.g2();
				} else if (arg0 == 19) {
					this.anInt4424 = arg1.g2();
				} else if (arg0 == 20) {
					this.anInt4435 = arg1.g2();
					if (this.anInt4435 == 65535) {
						this.anInt4435 = -1;
					}
					this.anInt4411 = arg1.g2();
					if (this.anInt4411 == 65535) {
						this.anInt4411 = -1;
					}
					this.anInt4427 = arg1.g4();
					this.anInt4439 = arg1.g4();
				} else if (arg0 == 21) {
					this.anInt4417 = arg1.g4();
				} else if (arg0 == 22) {
					this.anInt4437 = arg1.g4();
				} else if (arg0 == 249) {
					local57 = arg1.g1();
					if (this.aClass4_89 == null) {
						local196 = Static162.method2977(local57);
						this.aClass4_89 = new HashTable(local196);
					}
					for (local196 = 0; local196 < local57; local196++) {
						@Pc(215) boolean local215 = arg1.g1() == 1;
						@Pc(219) int local219 = arg1.ig3();
						@Pc(228) Node local228;
						if (local215) {
							local228 = new Class2_Sub40(arg1.gjstr());
						} else {
							local228 = new Class2_Sub39(arg1.g4());
						}
						this.aClass4_89.put(local228, (long) local219);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
	public void method4187() {
		if (this.anIntArray290 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray290.length; local19 += 2) {
			if (this.anIntArray290[local19] < this.anInt4434) {
				this.anInt4434 = this.anIntArray290[local19];
			} else if (this.anIntArray290[local19] > this.anInt4419) {
				this.anInt4419 = this.anIntArray290[local19];
			}
			if (this.anIntArray290[local19 + 1] < this.anInt4432) {
				this.anInt4432 = this.anIntArray290[local19 + 1];
			} else if (this.anIntArray290[local19 + 1] > this.anInt4428) {
				this.anInt4428 = this.anIntArray290[local19 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIZ)I")
	public int method4188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass4_89 == null) {
			return arg0;
		} else {
			@Pc(25) Class2_Sub39 local25 = (Class2_Sub39) this.aClass4_89.get((long) arg1);
			return local25 == null ? arg0 : local25.anInt6818;
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!wm;ZZ)Lclient!jd;")
	public Sprite method4189(@OriginalArg(0) TextureProvider arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) int local17 = arg1 ? this.anInt4438 : this.anInt4420;
		@Pc(24) int local24 = local17 | arg0.anInt2836 << 29;
		@Pc(33) Sprite local33 = (Sprite) this.aClass125_2.aClass98_27.get((long) local24);
		if (local33 != null) {
			return local33;
		} else if (this.aClass125_2.aClass197_50.isFileReady(local17)) {
			@Pc(53) Class48 local53 = Static396.method1682(this.aClass125_2.aClass197_50, local17, 0);
			if (local53 != null) {
				local33 = arg0.method2891(local53);
				this.aClass125_2.aClass98_27.put((long) local24, local33);
			}
			return local33;
		} else {
			return null;
		}
	}
}
