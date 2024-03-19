import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class182 {

	@OriginalMember(owner = "client!se", name = "x", descriptor = "I")
	private int anInt5976;

	@OriginalMember(owner = "client!se", name = "z", descriptor = "J")
	private long aLong182;

	@OriginalMember(owner = "client!se", name = "A", descriptor = "Lclient!db;")
	private Class42 aClass42_6;

	@OriginalMember(owner = "client!se", name = "F", descriptor = "Lclient!ag;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!se", name = "r", descriptor = "Lclient!rr;")
	private final Class179 aClass179_7 = new Class179();

	@OriginalMember(owner = "client!se", name = "t", descriptor = "Lclient!rr;")
	private final Class179 aClass179_8 = new Class179();

	@OriginalMember(owner = "client!se", name = "v", descriptor = "Lclient!rr;")
	private final Class179 aClass179_9 = new Class179();

	@OriginalMember(owner = "client!se", name = "w", descriptor = "Lclient!rr;")
	private final Class179 aClass179_10 = new Class179();

	@OriginalMember(owner = "client!se", name = "y", descriptor = "Lclient!il;")
	private final Class1_Sub16 aClass1_Sub16_6 = new Class1_Sub16(4);

	@OriginalMember(owner = "client!se", name = "B", descriptor = "B")
	private byte aByte57 = 0;

	@OriginalMember(owner = "client!se", name = "C", descriptor = "I")
	public volatile int anInt5977 = 0;

	@OriginalMember(owner = "client!se", name = "E", descriptor = "I")
	public volatile int anInt5978 = 0;

	@OriginalMember(owner = "client!se", name = "D", descriptor = "Lclient!il;")
	private final Class1_Sub16 aClass1_Sub16_7 = new Class1_Sub16(8);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)I")
	private int method5031() {
		return this.aClass179_9.method4925() + this.aClass179_10.method4925();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZI)V")
	public void method5032(@OriginalArg(0) boolean arg0) {
		if (this.aClass42_6 == null) {
			return;
		}
		try {
			this.aClass1_Sub16_6.anInt6813 = 0;
			this.aClass1_Sub16_6.method5771(arg0 ? 2 : 3);
			this.aClass1_Sub16_6.method5732(0);
			this.aClass42_6.method1273(4, this.aClass1_Sub16_6.aByteArray86);
		} catch (@Pc(41) IOException local41) {
			try {
				this.aClass42_6.method1271();
			} catch (@Pc(47) Exception local47) {
			}
			this.anInt5978 = -2;
			this.aClass42_6 = null;
			this.anInt5977++;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Z")
	public boolean method5033() {
		@Pc(13) int local13;
		if (this.aClass42_6 != null) {
			@Pc(7) long local7 = Static325.method5658();
			local13 = (int) (local7 - this.aLong182);
			this.aLong182 = local7;
			if (local13 > 200) {
				local13 = 200;
			}
			this.anInt5976 += local13;
			if (this.anInt5976 > 30000) {
				try {
					this.aClass42_6.method1271();
				} catch (@Pc(39) Exception local39) {
				}
				this.aClass42_6 = null;
			}
		}
		if (this.aClass42_6 == null) {
			return this.method5041() == 0 && this.method5031() == 0;
		}
		try {
			this.aClass42_6.method1267();
			for (@Pc(77) Class1_Sub1_Sub2_Sub1 local77 = (Class1_Sub1_Sub2_Sub1) this.aClass179_7.method4935(); local77 != null; local77 = (Class1_Sub1_Sub2_Sub1) this.aClass179_7.method4932()) {
				this.aClass1_Sub16_6.anInt6813 = 0;
				this.aClass1_Sub16_6.method5771(1);
				this.aClass1_Sub16_6.method5732((int) local77.aLong234);
				this.aClass42_6.method1273(4, this.aClass1_Sub16_6.aByteArray86);
				this.aClass179_8.method4927(local77);
			}
			for (@Pc(131) Class1_Sub1_Sub2_Sub1 local131 = (Class1_Sub1_Sub2_Sub1) this.aClass179_9.method4935(); local131 != null; local131 = (Class1_Sub1_Sub2_Sub1) this.aClass179_9.method4932()) {
				this.aClass1_Sub16_6.anInt6813 = 0;
				this.aClass1_Sub16_6.method5771(0);
				this.aClass1_Sub16_6.method5732((int) local131.aLong234);
				this.aClass42_6.method1273(4, this.aClass1_Sub16_6.aByteArray86);
				this.aClass179_10.method4927(local131);
			}
			for (local13 = 0; local13 < 100; local13++) {
				@Pc(180) int local180 = this.aClass42_6.method1269();
				if (local180 < 0) {
					throw new IOException();
				}
				if (local180 == 0) {
					break;
				}
				this.anInt5976 = 0;
				@Pc(196) byte local196 = 0;
				if (this.aClass1_Sub1_Sub2_Sub1_2 == null) {
					local196 = 8;
				} else if (this.aClass1_Sub1_Sub2_Sub1_2.anInt284 == 0) {
					local196 = 1;
				}
				@Pc(222) int local222;
				@Pc(228) int local228;
				@Pc(272) int local272;
				if (local196 <= 0) {
					local222 = this.aClass1_Sub1_Sub2_Sub1_2.aClass1_Sub16_1.aByteArray86.length - this.aClass1_Sub1_Sub2_Sub1_2.aByte1;
					local228 = 512 - this.aClass1_Sub1_Sub2_Sub1_2.anInt284;
					if (local222 - this.aClass1_Sub1_Sub2_Sub1_2.aClass1_Sub16_1.anInt6813 < local228) {
						local228 = local222 - this.aClass1_Sub1_Sub2_Sub1_2.aClass1_Sub16_1.anInt6813;
					}
					if (local180 < local228) {
						local228 = local180;
					}
					this.aClass42_6.method1270(this.aClass1_Sub1_Sub2_Sub1_2.aClass1_Sub16_1.anInt6813, this.aClass1_Sub1_Sub2_Sub1_2.aClass1_Sub16_1.aByteArray86, local228);
					if (this.aByte57 != 0) {
						for (local272 = 0; local272 < local228; local272++) {
							this.aClass1_Sub1_Sub2_Sub1_2.aClass1_Sub16_1.aByteArray86[this.aClass1_Sub1_Sub2_Sub1_2.aClass1_Sub16_1.anInt6813 + local272] = (byte) (this.aClass1_Sub1_Sub2_Sub1_2.aClass1_Sub16_1.aByteArray86[this.aClass1_Sub1_Sub2_Sub1_2.aClass1_Sub16_1.anInt6813 + local272] ^ this.aByte57);
						}
					}
					this.aClass1_Sub1_Sub2_Sub1_2.anInt284 += local228;
					this.aClass1_Sub1_Sub2_Sub1_2.aClass1_Sub16_1.anInt6813 += local228;
					if (local222 == this.aClass1_Sub1_Sub2_Sub1_2.aClass1_Sub16_1.anInt6813) {
						this.aClass1_Sub1_Sub2_Sub1_2.method6158();
						this.aClass1_Sub1_Sub2_Sub1_2.aBoolean300 = false;
						this.aClass1_Sub1_Sub2_Sub1_2 = null;
					} else if (this.aClass1_Sub1_Sub2_Sub1_2.anInt284 == 512) {
						this.aClass1_Sub1_Sub2_Sub1_2.anInt284 = 0;
					}
				} else {
					local222 = local196 - this.aClass1_Sub16_7.anInt6813;
					if (local222 > local180) {
						local222 = local180;
					}
					this.aClass42_6.method1270(this.aClass1_Sub16_7.anInt6813, this.aClass1_Sub16_7.aByteArray86, local222);
					if (this.aByte57 != 0) {
						for (local228 = 0; local228 < local222; local228++) {
							this.aClass1_Sub16_7.aByteArray86[local228 + this.aClass1_Sub16_7.anInt6813] ^= this.aByte57;
						}
					}
					this.aClass1_Sub16_7.anInt6813 += local222;
					if (this.aClass1_Sub16_7.anInt6813 >= local196) {
						if (this.aClass1_Sub1_Sub2_Sub1_2 == null) {
							this.aClass1_Sub16_7.anInt6813 = 0;
							local228 = this.aClass1_Sub16_7.method5761();
							local272 = this.aClass1_Sub16_7.method5749();
							@Pc(447) int local447 = this.aClass1_Sub16_7.method5761();
							@Pc(452) int local452 = this.aClass1_Sub16_7.method5730();
							@Pc(456) int local456 = local447 & 0x7F;
							@Pc(464) boolean local464 = (local447 & 0x80) != 0;
							@Pc(471) long local471 = (long) (local272 + (local228 << 16));
							@Pc(481) Class1_Sub1_Sub2_Sub1 local481;
							if (local464) {
								for (local481 = (Class1_Sub1_Sub2_Sub1) this.aClass179_10.method4935(); local481 != null && local481.aLong234 != local471; local481 = (Class1_Sub1_Sub2_Sub1) this.aClass179_10.method4932()) {
								}
							} else {
								for (local481 = (Class1_Sub1_Sub2_Sub1) this.aClass179_8.method4935(); local481 != null && local481.aLong234 != local471; local481 = (Class1_Sub1_Sub2_Sub1) this.aClass179_8.method4932()) {
								}
							}
							if (local481 == null) {
								throw new IOException();
							}
							this.aClass1_Sub1_Sub2_Sub1_2 = local481;
							@Pc(541) int local541 = local456 == 0 ? 5 : 9;
							this.aClass1_Sub1_Sub2_Sub1_2.aClass1_Sub16_1 = new Class1_Sub16(this.aClass1_Sub1_Sub2_Sub1_2.aByte1 + local452 + local541);
							this.aClass1_Sub1_Sub2_Sub1_2.aClass1_Sub16_1.method5771(local456);
							this.aClass1_Sub1_Sub2_Sub1_2.aClass1_Sub16_1.method5768(local452);
							this.aClass1_Sub1_Sub2_Sub1_2.anInt284 = 8;
							this.aClass1_Sub16_7.anInt6813 = 0;
						} else if (this.aClass1_Sub1_Sub2_Sub1_2.anInt284 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub16_7.aByteArray86[0] == -1) {
							this.aClass1_Sub1_Sub2_Sub1_2.anInt284 = 1;
							this.aClass1_Sub16_7.anInt6813 = 0;
						} else {
							this.aClass1_Sub1_Sub2_Sub1_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(619) IOException local619) {
			try {
				this.aClass42_6.method1271();
			} catch (@Pc(625) Exception local625) {
			}
			this.anInt5977++;
			this.aClass42_6 = null;
			this.anInt5978 = -2;
			return this.method5041() == 0 && this.method5031() == 0;
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
	public void method5035() {
		try {
			this.aClass42_6.method1271();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt5977++;
		this.aClass42_6 = null;
		this.aByte57 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt5978 = -1;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(Z)V")
	private void method5036() {
		if (this.aClass42_6 == null) {
			return;
		}
		try {
			this.aClass1_Sub16_6.anInt6813 = 0;
			this.aClass1_Sub16_6.method5771(6);
			this.aClass1_Sub16_6.method5732(3);
			this.aClass42_6.method1273(4, this.aClass1_Sub16_6.aByteArray86);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass42_6.method1271();
			} catch (@Pc(42) Exception local42) {
			}
			this.anInt5977++;
			this.aClass42_6 = null;
			this.anInt5978 = -2;
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	public void method5038() {
		if (this.aClass42_6 != null) {
			this.aClass42_6.method1274();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IZBII)Lclient!ag;")
	public Class1_Sub1_Sub2_Sub1 method5039(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		@Pc(10) long local10 = (long) ((arg3 << 16) + arg0);
		@Pc(14) Class1_Sub1_Sub2_Sub1 local14 = new Class1_Sub1_Sub2_Sub1();
		local14.aLong234 = local10;
		local14.aBoolean299 = arg1;
		local14.aByte1 = arg2;
		if (arg1) {
			if (this.method5041() >= 20) {
				throw new RuntimeException();
			}
			this.aClass179_7.method4927(local14);
		} else if (this.method5031() < 20) {
			this.aClass179_9.method4927(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(I)Z")
	public boolean method5040() {
		return this.method5041() >= 20;
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(I)I")
	public int method5041() {
		return this.aClass179_7.method4925() + this.aClass179_8.method4925();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)Z")
	public boolean method5042() {
		return this.method5031() >= 20;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!db;Z)V")
	public void method5043(@OriginalArg(1) Class42 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass42_6 != null) {
			try {
				this.aClass42_6.method1271();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass42_6 = null;
		}
		this.aClass42_6 = arg0;
		this.method5036();
		this.method5032(arg1);
		this.aClass1_Sub16_7.anInt6813 = 0;
		this.aClass1_Sub1_Sub2_Sub1_2 = null;
		while (true) {
			@Pc(40) Class1_Sub1_Sub2_Sub1 local40 = (Class1_Sub1_Sub2_Sub1) this.aClass179_8.method4926();
			if (local40 == null) {
				while (true) {
					local40 = (Class1_Sub1_Sub2_Sub1) this.aClass179_10.method4926();
					if (local40 == null) {
						if (this.aByte57 != 0) {
							try {
								this.aClass1_Sub16_6.anInt6813 = 0;
								this.aClass1_Sub16_6.method5771(4);
								this.aClass1_Sub16_6.method5771(this.aByte57);
								this.aClass1_Sub16_6.method5757(0);
								this.aClass42_6.method1273(4, this.aClass1_Sub16_6.aByteArray86);
							} catch (@Pc(101) IOException local101) {
								try {
									this.aClass42_6.method1271();
								} catch (@Pc(107) Exception local107) {
								}
								this.anInt5978 = -2;
								this.aClass42_6 = null;
								this.anInt5977++;
							}
						}
						this.anInt5976 = 0;
						this.aLong182 = Static325.method5658();
						return;
					}
					this.aClass179_9.method4927(local40);
				}
			}
			this.aClass179_7.method4927(local40);
		}
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V")
	public void method5046() {
		if (this.aClass42_6 == null) {
			return;
		}
		try {
			this.aClass1_Sub16_6.anInt6813 = 0;
			this.aClass1_Sub16_6.method5771(7);
			this.aClass1_Sub16_6.method5732(0);
			this.aClass42_6.method1273(4, this.aClass1_Sub16_6.aByteArray86);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass42_6.method1271();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass42_6 = null;
			this.anInt5978 = -2;
			this.anInt5977++;
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
	public void method5047() {
		if (this.aClass42_6 != null) {
			this.aClass42_6.method1271();
		}
	}
}
