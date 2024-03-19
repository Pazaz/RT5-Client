import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public class Class37 {

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "Lclient!af;")
	private Class1_Sub3 aClass1_Sub3_8;

	@OriginalMember(owner = "client!wi", name = "v", descriptor = "[I")
	public int[] anIntArray558;

	@OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
	public int anInt6902;

	@OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
	public int anInt6905;

	@OriginalMember(owner = "client!wi", name = "L", descriptor = "I")
	private int anInt6907;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
	private final int anInt6883 = 32;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "Z")
	private boolean aBoolean494 = false;

	@OriginalMember(owner = "client!wi", name = "x", descriptor = "J")
	private long aLong217 = Static325.method5658();

	@OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
	private int anInt6901 = 0;

	@OriginalMember(owner = "client!wi", name = "B", descriptor = "J")
	private long aLong218 = 0L;

	@OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
	private int anInt6903 = 0;

	@OriginalMember(owner = "client!wi", name = "F", descriptor = "[Lclient!af;")
	private final Class1_Sub3[] aClass1_Sub3Array5 = new Class1_Sub3[8];

	@OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
	private int anInt6900 = 0;

	@OriginalMember(owner = "client!wi", name = "I", descriptor = "I")
	private int anInt6906 = 0;

	@OriginalMember(owner = "client!wi", name = "G", descriptor = "[Lclient!af;")
	private final Class1_Sub3[] aClass1_Sub3Array6 = new Class1_Sub3[8];

	@OriginalMember(owner = "client!wi", name = "C", descriptor = "J")
	private long aLong219 = 0L;

	@OriginalMember(owner = "client!wi", name = "K", descriptor = "Z")
	private boolean aBoolean495 = true;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
	public final synchronized void method5854() {
		if (this.aBoolean494) {
			return;
		}
		@Pc(12) long local12 = Static325.method5658();
		try {
			if (this.aLong217 + 500000L < local12) {
				this.aLong217 = local12 - 500000L;
			}
			while (this.aLong217 + 5000L < local12) {
				this.method5855();
				this.aLong217 += 256000 / Static80.anInt2184;
			}
		} catch (@Pc(56) Exception local56) {
			this.aLong217 = local12;
		}
		if (this.anIntArray558 == null) {
			return;
		}
		try {
			if (this.aLong219 != 0L) {
				if (this.aLong219 > local12) {
					return;
				}
				this.method5862(this.anInt6905);
				this.aLong219 = 0L;
				this.aBoolean495 = true;
			}
			@Pc(93) int local93 = this.method5857();
			if (this.anInt6901 < this.anInt6900 - local93) {
				this.anInt6901 = this.anInt6900 - local93;
			}
			@Pc(113) int local113 = this.anInt6907 + this.anInt6902;
			if (local113 + 256 > 16384) {
				local113 = 16128;
			}
			if (local113 + 256 > this.anInt6905) {
				this.anInt6905 += 1024;
				if (this.anInt6905 > 16384) {
					this.anInt6905 = 16384;
				}
				this.method5859();
				this.method5862(this.anInt6905);
				local93 = 0;
				if (local113 + 256 > this.anInt6905) {
					local113 = this.anInt6905 - 256;
					this.anInt6907 = local113 - this.anInt6902;
				}
				this.aBoolean495 = true;
			}
			while (local93 < local113) {
				this.method5860(this.anIntArray558);
				this.method5872();
				local93 += 256;
			}
			if (this.aLong218 < local12) {
				if (this.aBoolean495) {
					this.aBoolean495 = false;
				} else if (this.anInt6901 == 0 && this.anInt6903 == 0) {
					this.method5859();
					this.aLong219 = local12 + 2000L;
					return;
				} else {
					this.anInt6907 = Math.min(this.anInt6903, this.anInt6901);
					this.anInt6903 = this.anInt6901;
				}
				this.aLong218 = local12 + 2000L;
				this.anInt6901 = 0;
			}
			this.anInt6900 = local93;
		} catch (@Pc(265) Exception local265) {
			this.method5859();
			this.aLong219 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
	private void method5855() {
		this.anInt6906 -= 256;
		if (this.anInt6906 < 0) {
			this.anInt6906 = 0;
		}
		if (this.aClass1_Sub3_8 != null) {
			this.aClass1_Sub3_8.method4454(256);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "()I")
	protected int method5857() throws Exception {
		return this.anInt6905;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
	public final synchronized void method5858() {
		this.aBoolean495 = true;
		try {
			this.method5869();
		} catch (@Pc(18) Exception local18) {
			this.method5859();
			this.aLong219 = Static325.method5658() + 2000L;
		}
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "()V")
	protected void method5859() {
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "([II)V")
	private void method5860(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Class1_Sub2_Sub1_Sub1.lb) {
			local1 = 512;
		}
		Static360.method2017(arg0, 0, local1);
		this.anInt6906 -= 256;
		if (this.aClass1_Sub3_8 != null && this.anInt6906 <= 0) {
			this.anInt6906 += Static80.anInt2184 >> 4;
			Static120.method2590(this.aClass1_Sub3_8);
			this.method5863(this.aClass1_Sub3_8.method4455(), this.aClass1_Sub3_8);
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = 255;
			@Pc(49) int local49 = 7;
			@Pc(56) int local56;
			label103: while (local47 != 0) {
				@Pc(61) int local61;
				if (local49 < 0) {
					local56 = local49 & 0x3;
					local61 = -(local49 >> 2);
				} else {
					local56 = local49;
					local61 = 0;
				}
				for (@Pc(72) int local72 = local47 >>> local56 & 0x11111111; local72 != 0; local72 >>>= 0x4) {
					if ((local72 & 0x1) != 0) {
						local47 &= ~(0x1 << local56);
						@Pc(88) Class1_Sub3 local88 = null;
						@Pc(93) Class1_Sub3 local93 = this.aClass1_Sub3Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub13 local97 = local93.aClass1_Sub13_5;
								if (local97 == null || local97.anInt4948 <= local61) {
									local93.aBoolean361 = true;
									@Pc(121) int local121 = local93.method4456();
									local45 += local121;
									if (local97 != null) {
										local97.anInt4948 += local121;
									}
									if (local45 >= this.anInt6883) {
										break label103;
									}
									@Pc(140) Class1_Sub3 local140 = local93.method4453();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt5220;
										while (local140 != null) {
											this.method5863(local145 * local140.method4455() >> 8, local140);
											local140 = local93.method4451();
										}
									}
									@Pc(164) Class1_Sub3 local164 = local93.aClass1_Sub3_7;
									local93.aClass1_Sub3_7 = null;
									if (local88 == null) {
										this.aClass1_Sub3Array5[local56] = local164;
									} else {
										local88.aClass1_Sub3_7 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub3Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub3_7;
								}
							}
						}
					}
					local56 += 4;
					local61++;
				}
				local49--;
			}
			for (local56 = 0; local56 < 8; local56++) {
				@Pc(207) Class1_Sub3 local207 = this.aClass1_Sub3Array5[local56];
				this.aClass1_Sub3Array5[local56] = this.aClass1_Sub3Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub3 local221 = local207.aClass1_Sub3_7;
					local207.aClass1_Sub3_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6906 < 0) {
			this.anInt6906 = 0;
		}
		if (this.aClass1_Sub3_8 != null) {
			this.aClass1_Sub3_8.method4457(arg0, 0, 256);
		}
		this.aLong217 = Static325.method5658();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5861(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
	public void method5862(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILclient!af;)V")
	private void method5863(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		@Pc(15) int local15 = arg0 >> 5;
		@Pc(20) Class1_Sub3 local20 = this.aClass1_Sub3Array6[local15];
		if (local20 == null) {
			this.aClass1_Sub3Array5[local15] = arg1;
		} else {
			local20.aClass1_Sub3_7 = arg1;
		}
		this.aClass1_Sub3Array6[local15] = arg1;
		arg1.anInt5220 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V")
	public final synchronized void method5864() {
		if (Static328.aClass125_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static328.aClass125_1.aClass37Array1[local11] == this) {
					Static328.aClass125_1.aClass37Array1[local11] = null;
				}
				if (Static328.aClass125_1.aClass37Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static328.aClass125_1.aBoolean302 = true;
				while (Static328.aClass125_1.aBoolean303) {
					Static295.method5212(50L);
				}
				Static328.aClass125_1 = null;
			}
		}
		this.method5859();
		this.aBoolean494 = true;
		this.anIntArray558 = null;
	}

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V")
	public final void method5865() {
		this.aBoolean495 = true;
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "()V")
	protected void method5869() throws Exception {
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!af;I)V")
	public final synchronized void method5871(@OriginalArg(0) Class1_Sub3 arg0) {
		this.aClass1_Sub3_8 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "()V")
	protected void method5872() throws Exception {
	}
}
