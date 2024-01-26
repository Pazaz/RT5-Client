import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public class Class56 {

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "[I")
	public int[] anIntArray315;

	@OriginalMember(owner = "client!cd", name = "A", descriptor = "Lclient!dea;")
	private Class2_Sub6 aClass2_Sub6_6;

	@OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
	public int anInt4097;

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
	public int anInt4098;

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
	private int anInt4103;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	private final int anInt4087 = 32;

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "Z")
	private boolean aBoolean319 = false;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "J")
	private long aLong128 = Static588.method7715();

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "J")
	private long aLong129 = 0L;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
	private int anInt4099 = 0;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "[Lclient!dea;")
	private final Class2_Sub6[] aClass2_Sub6Array5 = new Class2_Sub6[8];

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
	private int anInt4101 = 0;

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
	private int anInt4100 = 0;

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "J")
	private long aLong130 = 0L;

	@OriginalMember(owner = "client!cd", name = "y", descriptor = "Z")
	private boolean aBoolean320 = true;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "[Lclient!dea;")
	private final Class2_Sub6[] aClass2_Sub6Array6 = new Class2_Sub6[8];

	@OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
	private int anInt4102 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!dea;)V")
	public final synchronized void method3582(@OriginalArg(1) Class2_Sub6 arg0) {
		this.aClass2_Sub6_6 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "()V")
	protected void method3583() throws Exception {
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V")
	private void method3584() {
		this.anInt4099 -= 256;
		if (this.anInt4099 < 0) {
			this.anInt4099 = 0;
		}
		if (this.aClass2_Sub6_6 != null) {
			this.aClass2_Sub6_6.method9130(256);
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
	public final synchronized void method3586() {
		if (Static232.aClass119_1 != null) {
			@Pc(11) boolean local11 = true;
			for (@Pc(13) int local13 = 0; local13 < 2; local13++) {
				if (Static232.aClass119_1.aClass56Array1[local13] == this) {
					Static232.aClass119_1.aClass56Array1[local13] = null;
				}
				if (Static232.aClass119_1.aClass56Array1[local13] != null) {
					local11 = false;
				}
			}
			if (local11) {
				Static232.aClass119_1.aBoolean241 = true;
				while (Static232.aClass119_1.aBoolean242) {
					Static638.method8395(50L);
				}
				Static232.aClass119_1 = null;
			}
		}
		this.method3596();
		this.anIntArray315 = null;
		this.aBoolean319 = true;
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "()I")
	protected int method3587() throws Exception {
		return this.anInt4097;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
	public void method3588(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "()V")
	protected void method3590() throws Exception {
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZILclient!dea;)V")
	private void method3591(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub6 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class2_Sub6 local12 = this.aClass2_Sub6Array5[local7];
		if (local12 == null) {
			this.aClass2_Sub6Array6[local7] = arg1;
		} else {
			local12.aClass2_Sub6_9 = arg1;
		}
		this.aClass2_Sub6Array5[local7] = arg1;
		arg1.anInt10517 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
	public final synchronized void method3592() {
		this.aBoolean320 = true;
		try {
			this.method3583();
		} catch (@Pc(19) Exception local19) {
			this.method3596();
			this.aLong129 = Static588.method7715() + 2000L;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method3593(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
	public final synchronized void method3594() {
		if (this.aBoolean319) {
			return;
		}
		@Pc(11) long local11 = Static588.method7715();
		try {
			if (this.aLong128 + 6000L < local11) {
				this.aLong128 = local11 - 6000L;
			}
			while (local11 > this.aLong128 + 5000L) {
				this.method3584();
				this.aLong128 += (long) (256000 / Static686.anInt8944);
				local11 = Static588.method7715();
			}
		} catch (@Pc(54) Exception local54) {
			this.aLong128 = local11;
		}
		if (this.anIntArray315 == null) {
			return;
		}
		try {
			if (this.aLong129 != 0L) {
				if (this.aLong129 > local11) {
					return;
				}
				this.method3588(this.anInt4097);
				this.aLong129 = 0L;
				this.aBoolean320 = true;
			}
			@Pc(95) int local95 = this.method3587();
			if (this.anInt4100 - local95 > this.anInt4101) {
				this.anInt4101 = this.anInt4100 - local95;
			}
			@Pc(118) int local118 = this.anInt4098 + this.anInt4103;
			if (local118 + 256 > 16384) {
				local118 = 16128;
			}
			if (this.anInt4097 < local118 + 256) {
				this.anInt4097 += 1024;
				if (this.anInt4097 > 16384) {
					this.anInt4097 = 16384;
				}
				this.method3596();
				this.method3588(this.anInt4097);
				local95 = 0;
				if (this.anInt4097 < local118 + 256) {
					local118 = this.anInt4097 - 256;
					this.anInt4103 = local118 - this.anInt4098;
				}
				this.aBoolean320 = true;
			}
			while (local118 > local95) {
				this.method3595(this.anIntArray315);
				local95 += 256;
				this.method3590();
			}
			if (local11 > this.aLong130) {
				if (this.aBoolean320) {
					this.aBoolean320 = false;
				} else if (this.anInt4101 == 0 && this.anInt4102 == 0) {
					this.method3596();
					this.aLong129 = local11 + 2000L;
					return;
				} else {
					this.anInt4103 = Math.min(this.anInt4102, this.anInt4101);
					this.anInt4102 = this.anInt4101;
				}
				this.aLong130 = local11 + 2000L;
				this.anInt4101 = 0;
			}
			this.anInt4100 = local95;
		} catch (@Pc(268) Exception local268) {
			this.method3596();
			this.aLong129 = local11 + 2000L;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([II)V")
	private void method3595(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static316.aBoolean644) {
			local1 = 512;
		}
		Static734.method7688(arg0, 0, local1);
		this.anInt4099 -= 256;
		if (this.aClass2_Sub6_6 != null && this.anInt4099 <= 0) {
			this.anInt4099 += Static686.anInt8944 >> 4;
			Static440.method5964(this.aClass2_Sub6_6);
			this.method3591(this.aClass2_Sub6_6.method9136(), this.aClass2_Sub6_6);
			@Pc(47) int local47 = 0;
			@Pc(49) int local49 = 255;
			@Pc(51) int local51 = 7;
			@Pc(58) int local58;
			label103: while (local49 != 0) {
				@Pc(63) int local63;
				if (local51 < 0) {
					local58 = local51 & 0x3;
					local63 = -(local51 >> 2);
				} else {
					local58 = local51;
					local63 = 0;
				}
				for (@Pc(74) int local74 = local49 >>> local58 & 0x11111111; local74 != 0; local74 >>>= 0x4) {
					if ((local74 & 0x1) != 0) {
						local49 &= ~(0x1 << local58);
						@Pc(92) Class2_Sub6 local92 = null;
						@Pc(97) Class2_Sub6 local97 = this.aClass2_Sub6Array6[local58];
						label97: while (true) {
							while (true) {
								if (local97 == null) {
									break label97;
								}
								@Pc(101) Class2_Sub49 local101 = local97.aClass2_Sub49_6;
								if (local101 == null || local101.anInt8817 <= local63) {
									local97.aBoolean793 = true;
									@Pc(127) int local127 = local97.method9132();
									local47 += local127;
									if (local101 != null) {
										local101.anInt8817 += local127;
									}
									if (local47 >= this.anInt4087) {
										break label103;
									}
									@Pc(148) Class2_Sub6 local148 = local97.method9133();
									if (local148 != null) {
										@Pc(153) int local153 = local97.anInt10517;
										while (local148 != null) {
											this.method3591(local153 * local148.method9136() >> 8, local148);
											local148 = local97.method9135();
										}
									}
									@Pc(172) Class2_Sub6 local172 = local97.aClass2_Sub6_9;
									local97.aClass2_Sub6_9 = null;
									if (local92 == null) {
										this.aClass2_Sub6Array6[local58] = local172;
									} else {
										local92.aClass2_Sub6_9 = local172;
									}
									if (local172 == null) {
										this.aClass2_Sub6Array5[local58] = local92;
									}
									local97 = local172;
								} else {
									local49 |= 0x1 << local58;
									local92 = local97;
									local97 = local97.aClass2_Sub6_9;
								}
							}
						}
					}
					local58 += 4;
					local63++;
				}
				local51--;
			}
			for (local58 = 0; local58 < 8; local58++) {
				@Pc(218) Class2_Sub6 local218 = this.aClass2_Sub6Array6[local58];
				this.aClass2_Sub6Array6[local58] = this.aClass2_Sub6Array5[local58] = null;
				while (local218 != null) {
					@Pc(232) Class2_Sub6 local232 = local218.aClass2_Sub6_9;
					local218.aClass2_Sub6_9 = null;
					local218 = local232;
				}
			}
		}
		if (this.anInt4099 < 0) {
			this.anInt4099 = 0;
		}
		if (this.aClass2_Sub6_6 != null) {
			this.aClass2_Sub6_6.method9131(arg0, 0, 256);
		}
		this.aLong128 = Static588.method7715();
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "()V")
	protected void method3596() {
	}
}
