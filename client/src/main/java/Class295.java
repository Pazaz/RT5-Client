import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pla")
public final class Class295 {

	@OriginalMember(owner = "client!pla", name = "y", descriptor = "Lclient!nk;")
	private Class263 aClass263_1;

	@OriginalMember(owner = "client!pla", name = "q", descriptor = "I")
	private int anInt7451;

	@OriginalMember(owner = "client!pla", name = "m", descriptor = "J")
	private long aLong238;

	@OriginalMember(owner = "client!pla", name = "B", descriptor = "Lclient!rja;")
	private Class2_Sub2_Sub17_Sub1 aClass2_Sub2_Sub17_Sub1_2;

	@OriginalMember(owner = "client!pla", name = "C", descriptor = "Lclient!jga;")
	private final Class192 aClass192_10 = new Class192();

	@OriginalMember(owner = "client!pla", name = "b", descriptor = "Lclient!jga;")
	private final Class192 aClass192_11 = new Class192();

	@OriginalMember(owner = "client!pla", name = "r", descriptor = "Lclient!jga;")
	private final Class192 aClass192_12 = new Class192();

	@OriginalMember(owner = "client!pla", name = "j", descriptor = "Lclient!jga;")
	private final Class192 aClass192_13 = new Class192();

	@OriginalMember(owner = "client!pla", name = "v", descriptor = "Lclient!ge;")
	private final Class2_Sub21 aClass2_Sub21_13 = new Class2_Sub21(4);

	@OriginalMember(owner = "client!pla", name = "w", descriptor = "I")
	public volatile int anInt7453 = 0;

	@OriginalMember(owner = "client!pla", name = "a", descriptor = "I")
	public volatile int anInt7452 = 0;

	@OriginalMember(owner = "client!pla", name = "s", descriptor = "B")
	private byte aByte120 = 0;

	@OriginalMember(owner = "client!pla", name = "x", descriptor = "Lclient!ge;")
	private final Class2_Sub21 aClass2_Sub21_14 = new Class2_Sub21(8);

	@OriginalMember(owner = "client!pla", name = "b", descriptor = "(B)V")
	public void method6619() {
		try {
			this.aClass263_1.method5830();
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass263_1 = null;
		this.anInt7452 = -1;
		this.aByte120 = (byte) (int) (Math.random() * 255.0D + 1.0D);
		this.anInt7453++;
	}

	@OriginalMember(owner = "client!pla", name = "c", descriptor = "(B)V")
	private void method6620() {
		if (this.aClass263_1 == null) {
			return;
		}
		try {
			this.aClass2_Sub21_13.anInt8388 = 0;
			this.aClass2_Sub21_13.method7389(6);
			this.aClass2_Sub21_13.method7388(3);
			this.aClass263_1.method5829(4, this.aClass2_Sub21_13.aByteArray93);
		} catch (@Pc(33) IOException local33) {
			try {
				this.aClass263_1.method5830();
			} catch (@Pc(39) Exception local39) {
			}
			this.anInt7453++;
			this.anInt7452 = -2;
			this.aClass263_1 = null;
		}
	}

	@OriginalMember(owner = "client!pla", name = "a", descriptor = "(Z)V")
	public void method6621() {
		if (this.aClass263_1 != null) {
			this.aClass263_1.method5830();
		}
	}

	@OriginalMember(owner = "client!pla", name = "e", descriptor = "(I)I")
	public int method6622() {
		return this.aClass192_10.method4349() + this.aClass192_11.method4349();
	}

	@OriginalMember(owner = "client!pla", name = "d", descriptor = "(B)Z")
	public boolean method6624() {
		@Pc(14) int local14;
		if (this.aClass263_1 != null) {
			@Pc(7) long local7 = Static588.method7715();
			local14 = (int) (local7 - this.aLong238);
			this.aLong238 = local7;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt7451 += local14;
			if (this.anInt7451 > 30000) {
				try {
					this.aClass263_1.method5830();
				} catch (@Pc(42) Exception local42) {
				}
				this.aClass263_1 = null;
			}
		}
		if (this.aClass263_1 == null) {
			return this.method6622() == 0 && this.method6632() == 0;
		}
		try {
			this.aClass263_1.method5823();
			for (@Pc(84) Class2_Sub2_Sub17_Sub1 local84 = (Class2_Sub2_Sub17_Sub1) this.aClass192_10.method4352(); local84 != null; local84 = (Class2_Sub2_Sub17_Sub1) this.aClass192_10.method4350()) {
				this.aClass2_Sub21_13.anInt8388 = 0;
				this.aClass2_Sub21_13.method7389(1);
				this.aClass2_Sub21_13.method7388((int) local84.aLong325);
				this.aClass263_1.method5829(4, this.aClass2_Sub21_13.aByteArray93);
				this.aClass192_11.method4348(local84);
			}
			for (@Pc(142) Class2_Sub2_Sub17_Sub1 local142 = (Class2_Sub2_Sub17_Sub1) this.aClass192_12.method4352(); local142 != null; local142 = (Class2_Sub2_Sub17_Sub1) this.aClass192_12.method4350()) {
				this.aClass2_Sub21_13.anInt8388 = 0;
				this.aClass2_Sub21_13.method7389(0);
				this.aClass2_Sub21_13.method7388((int) local142.aLong325);
				this.aClass263_1.method5829(4, this.aClass2_Sub21_13.aByteArray93);
				this.aClass192_13.method4348(local142);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(199) int local199 = this.aClass263_1.method5828();
				if (local199 < 0) {
					throw new IOException();
				}
				if (local199 == 0) {
					break;
				}
				this.anInt7451 = 0;
				@Pc(212) byte local212 = 0;
				if (this.aClass2_Sub2_Sub17_Sub1_2 == null) {
					local212 = 8;
				} else if (this.aClass2_Sub2_Sub17_Sub1_2.anInt8331 == 0) {
					local212 = 1;
				}
				@Pc(236) int local236;
				@Pc(260) int local260;
				@Pc(328) int local328;
				if (local212 > 0) {
					local236 = local212 - this.aClass2_Sub21_14.anInt8388;
					if (local199 < local236) {
						local236 = local199;
					}
					this.aClass263_1.method5825(local236, this.aClass2_Sub21_14.anInt8388, this.aClass2_Sub21_14.aByteArray93);
					if (this.aByte120 != 0) {
						for (local260 = 0; local260 < local236; local260++) {
							this.aClass2_Sub21_14.aByteArray93[this.aClass2_Sub21_14.anInt8388 + local260] = (byte) (this.aClass2_Sub21_14.aByteArray93[this.aClass2_Sub21_14.anInt8388 + local260] ^ this.aByte120);
						}
					}
					this.aClass2_Sub21_14.anInt8388 += local236;
					if (local212 <= this.aClass2_Sub21_14.anInt8388) {
						if (this.aClass2_Sub2_Sub17_Sub1_2 == null) {
							this.aClass2_Sub21_14.anInt8388 = 0;
							local260 = this.aClass2_Sub21_14.method7396();
							local328 = this.aClass2_Sub21_14.method7382();
							@Pc(333) int local333 = this.aClass2_Sub21_14.method7396();
							@Pc(338) int local338 = this.aClass2_Sub21_14.method7349();
							@Pc(342) int local342 = local333 & 0x7F;
							@Pc(354) boolean local354 = (local333 & 0x80) != 0;
							@Pc(361) long local361 = (long) (local328 + (local260 << 16));
							@Pc(371) Class2_Sub2_Sub17_Sub1 local371;
							if (local354) {
								for (local371 = (Class2_Sub2_Sub17_Sub1) this.aClass192_13.method4352(); local371 != null && local371.aLong325 != local361; local371 = (Class2_Sub2_Sub17_Sub1) this.aClass192_13.method4350()) {
								}
							} else {
								for (local371 = (Class2_Sub2_Sub17_Sub1) this.aClass192_11.method4352(); local371 != null && local371.aLong325 != local361; local371 = (Class2_Sub2_Sub17_Sub1) this.aClass192_11.method4350()) {
								}
							}
							if (local371 == null) {
								throw new IOException();
							}
							this.aClass2_Sub2_Sub17_Sub1_2 = local371;
							@Pc(454) int local454 = local342 == 0 ? 5 : 9;
							this.aClass2_Sub2_Sub17_Sub1_2.aClass2_Sub21_15 = new Class2_Sub21(local454 + local338 + this.aClass2_Sub2_Sub17_Sub1_2.aByte129);
							this.aClass2_Sub2_Sub17_Sub1_2.aClass2_Sub21_15.method7389(local342);
							this.aClass2_Sub2_Sub17_Sub1_2.aClass2_Sub21_15.method7342(local338);
							this.aClass2_Sub2_Sub17_Sub1_2.anInt8331 = 8;
							this.aClass2_Sub21_14.anInt8388 = 0;
						} else if (this.aClass2_Sub2_Sub17_Sub1_2.anInt8331 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub21_14.aByteArray93[0] == -1) {
							this.aClass2_Sub21_14.anInt8388 = 0;
							this.aClass2_Sub2_Sub17_Sub1_2.anInt8331 = 1;
						} else {
							this.aClass2_Sub2_Sub17_Sub1_2 = null;
						}
					}
				} else {
					local236 = this.aClass2_Sub2_Sub17_Sub1_2.aClass2_Sub21_15.aByteArray93.length - this.aClass2_Sub2_Sub17_Sub1_2.aByte129;
					local260 = 512 - this.aClass2_Sub2_Sub17_Sub1_2.anInt8331;
					if (local260 > local236 - this.aClass2_Sub2_Sub17_Sub1_2.aClass2_Sub21_15.anInt8388) {
						local260 = local236 - this.aClass2_Sub2_Sub17_Sub1_2.aClass2_Sub21_15.anInt8388;
					}
					if (local260 > local199) {
						local260 = local199;
					}
					this.aClass263_1.method5825(local260, this.aClass2_Sub2_Sub17_Sub1_2.aClass2_Sub21_15.anInt8388, this.aClass2_Sub2_Sub17_Sub1_2.aClass2_Sub21_15.aByteArray93);
					if (this.aByte120 != 0) {
						for (local328 = 0; local328 < local260; local328++) {
							this.aClass2_Sub2_Sub17_Sub1_2.aClass2_Sub21_15.aByteArray93[this.aClass2_Sub2_Sub17_Sub1_2.aClass2_Sub21_15.anInt8388 + local328] = (byte) (this.aClass2_Sub2_Sub17_Sub1_2.aClass2_Sub21_15.aByteArray93[this.aClass2_Sub2_Sub17_Sub1_2.aClass2_Sub21_15.anInt8388 + local328] ^ this.aByte120);
						}
					}
					this.aClass2_Sub2_Sub17_Sub1_2.aClass2_Sub21_15.anInt8388 += local260;
					this.aClass2_Sub2_Sub17_Sub1_2.anInt8331 += local260;
					if (local236 == this.aClass2_Sub2_Sub17_Sub1_2.aClass2_Sub21_15.anInt8388) {
						this.aClass2_Sub2_Sub17_Sub1_2.method9260();
						this.aClass2_Sub2_Sub17_Sub1_2.aBoolean778 = false;
						this.aClass2_Sub2_Sub17_Sub1_2 = null;
					} else if (this.aClass2_Sub2_Sub17_Sub1_2.anInt8331 == 512) {
						this.aClass2_Sub2_Sub17_Sub1_2.anInt8331 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(694) IOException local694) {
			try {
				this.aClass263_1.method5830();
			} catch (@Pc(702) Exception local702) {
			}
			this.aClass263_1 = null;
			this.anInt7453++;
			this.anInt7452 = -2;
			return this.method6622() == 0 && this.method6632() == 0;
		}
	}

	@OriginalMember(owner = "client!pla", name = "b", descriptor = "(I)Z")
	public boolean method6625() {
		return this.method6632() >= 20;
	}

	@OriginalMember(owner = "client!pla", name = "a", descriptor = "(ZI)V")
	public void method6626(@OriginalArg(0) boolean arg0) {
		if (this.aClass263_1 == null) {
			return;
		}
		try {
			this.aClass2_Sub21_13.anInt8388 = 0;
			this.aClass2_Sub21_13.method7389(arg0 ? 2 : 3);
			this.aClass2_Sub21_13.method7388(0);
			this.aClass263_1.method5829(4, this.aClass2_Sub21_13.aByteArray93);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass263_1.method5830();
			} catch (@Pc(44) Exception local44) {
			}
			this.aClass263_1 = null;
			this.anInt7452 = -2;
			this.anInt7453++;
		}
	}

	@OriginalMember(owner = "client!pla", name = "a", descriptor = "(ZILclient!nk;)V")
	public void method6627(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class263 arg1) {
		if (this.aClass263_1 != null) {
			try {
				this.aClass263_1.method5830();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass263_1 = null;
		}
		this.aClass263_1 = arg1;
		this.method6620();
		this.method6626(arg0);
		this.aClass2_Sub2_Sub17_Sub1_2 = null;
		this.aClass2_Sub21_14.anInt8388 = 0;
		while (true) {
			@Pc(48) Class2_Sub2_Sub17_Sub1 local48 = (Class2_Sub2_Sub17_Sub1) this.aClass192_11.method4346();
			if (local48 == null) {
				while (true) {
					local48 = (Class2_Sub2_Sub17_Sub1) this.aClass192_13.method4346();
					if (local48 == null) {
						if (this.aByte120 != 0) {
							try {
								this.aClass2_Sub21_13.anInt8388 = 0;
								this.aClass2_Sub21_13.method7389(4);
								this.aClass2_Sub21_13.method7389(this.aByte120);
								this.aClass2_Sub21_13.method7373(0);
								this.aClass263_1.method5829(4, this.aClass2_Sub21_13.aByteArray93);
							} catch (@Pc(117) IOException local117) {
								try {
									this.aClass263_1.method5830();
								} catch (@Pc(123) Exception local123) {
								}
								this.anInt7453++;
								this.aClass263_1 = null;
								this.anInt7452 = -2;
							}
						}
						this.anInt7451 = 0;
						this.aLong238 = Static588.method7715();
						return;
					}
					this.aClass192_12.method4348(local48);
				}
			}
			this.aClass192_10.method4348(local48);
		}
	}

	@OriginalMember(owner = "client!pla", name = "c", descriptor = "(I)V")
	public void method6628() {
		if (this.aClass263_1 == null) {
			return;
		}
		try {
			this.aClass2_Sub21_13.anInt8388 = 0;
			this.aClass2_Sub21_13.method7389(7);
			this.aClass2_Sub21_13.method7388(0);
			this.aClass263_1.method5829(4, this.aClass2_Sub21_13.aByteArray93);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass263_1.method5830();
			} catch (@Pc(48) Exception local48) {
			}
			this.aClass263_1 = null;
			this.anInt7452 = -2;
			this.anInt7453++;
		}
	}

	@OriginalMember(owner = "client!pla", name = "a", descriptor = "(I)Z")
	public boolean method6630() {
		return this.method6622() >= 20;
	}

	@OriginalMember(owner = "client!pla", name = "d", descriptor = "(I)V")
	public void method6631() {
		if (this.aClass263_1 != null) {
			this.aClass263_1.method5826();
		}
	}

	@OriginalMember(owner = "client!pla", name = "a", descriptor = "(B)I")
	private int method6632() {
		return this.aClass192_12.method4349() + this.aClass192_13.method4349();
	}

	@OriginalMember(owner = "client!pla", name = "a", descriptor = "(IIBZB)Lclient!rja;")
	public Class2_Sub2_Sub17_Sub1 method6633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte arg3) {
		@Pc(19) long local19 = (long) ((arg0 << 16) + arg1);
		@Pc(23) Class2_Sub2_Sub17_Sub1 local23 = new Class2_Sub2_Sub17_Sub1();
		local23.aBoolean777 = arg2;
		local23.aByte129 = arg3;
		local23.aLong325 = local19;
		if (arg2) {
			if (this.method6622() >= 20) {
				throw new RuntimeException();
			}
			this.aClass192_10.method4348(local23);
		} else if (this.method6632() < 20) {
			this.aClass192_12.method4348(local23);
		} else {
			throw new RuntimeException();
		}
		return local23;
	}
}
