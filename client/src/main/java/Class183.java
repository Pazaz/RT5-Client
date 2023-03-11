import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class183 {

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "Lclient!iu;")
	private Class111 aClass111_3;

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
	private int anInt5061;

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "J")
	private long aLong151;

	@OriginalMember(owner = "client!pp", name = "G", descriptor = "Lclient!jj;")
	private Class2_Sub2_Sub10_Sub1 aClass2_Sub2_Sub10_Sub1_2;

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "Lclient!wc;")
	private final Class246 aClass246_5 = new Class246();

	@OriginalMember(owner = "client!pp", name = "r", descriptor = "Lclient!wc;")
	private final Class246 aClass246_6 = new Class246();

	@OriginalMember(owner = "client!pp", name = "u", descriptor = "Lclient!wc;")
	private final Class246 aClass246_7 = new Class246();

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "Lclient!wc;")
	private final Class246 aClass246_8 = new Class246();

	@OriginalMember(owner = "client!pp", name = "B", descriptor = "Lclient!bt;")
	private final Buffer aClass2_Sub4_7 = new Buffer(4);

	@OriginalMember(owner = "client!pp", name = "E", descriptor = "B")
	private byte aByte55 = 0;

	@OriginalMember(owner = "client!pp", name = "F", descriptor = "I")
	public volatile int errors = 0;

	@OriginalMember(owner = "client!pp", name = "D", descriptor = "I")
	public volatile int response = 0;

	@OriginalMember(owner = "client!pp", name = "C", descriptor = "Lclient!bt;")
	private final Buffer aClass2_Sub4_8 = new Buffer(8);

	static {
		new Class79("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
	private void method4632() {
		if (this.aClass111_3 == null) {
			return;
		}
		try {
			this.aClass2_Sub4_7.position = 0;
			this.aClass2_Sub4_7.p1(6);
			this.aClass2_Sub4_7.method4846(3);
			this.aClass111_3.write(4, this.aClass2_Sub4_7.aByteArray73);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass111_3.close();
			} catch (@Pc(46) Exception local46) {
			}
			this.response = -2;
			this.errors++;
			this.aClass111_3 = null;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	public void method4633() {
		if (this.aClass111_3 != null) {
			this.aClass111_3.method2801();
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
	public void method4635() {
		if (this.aClass111_3 == null) {
			return;
		}
		try {
			this.aClass2_Sub4_7.position = 0;
			this.aClass2_Sub4_7.p1(7);
			this.aClass2_Sub4_7.method4846(0);
			this.aClass111_3.write(4, this.aClass2_Sub4_7.aByteArray73);
		} catch (@Pc(34) IOException local34) {
			try {
				this.aClass111_3.close();
			} catch (@Pc(40) Exception local40) {
			}
			this.response = -2;
			this.aClass111_3 = null;
			this.errors++;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)Z")
	public boolean method4636() {
		return this.method4646() >= 20;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)I")
	public int method4637() {
		return this.aClass246_5.method6338() + this.aClass246_6.method6338();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!iu;ZI)V")
	public void method4639(@OriginalArg(0) Class111 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass111_3 != null) {
			try {
				this.aClass111_3.close();
			} catch (@Pc(16) Exception local16) {
			}
			this.aClass111_3 = null;
		}
		this.aClass111_3 = arg0;
		this.method4632();
		this.method4647(arg1);
		this.aClass2_Sub4_8.position = 0;
		this.aClass2_Sub2_Sub10_Sub1_2 = null;
		while (true) {
			@Pc(44) Class2_Sub2_Sub10_Sub1 local44 = (Class2_Sub2_Sub10_Sub1) this.aClass246_6.method6339();
			if (local44 == null) {
				while (true) {
					local44 = (Class2_Sub2_Sub10_Sub1) this.aClass246_8.method6339();
					if (local44 == null) {
						if (this.aByte55 != 0) {
							try {
								this.aClass2_Sub4_7.position = 0;
								this.aClass2_Sub4_7.p1(4);
								this.aClass2_Sub4_7.p1(this.aByte55);
								this.aClass2_Sub4_7.method4843(0);
								this.aClass111_3.write(4, this.aClass2_Sub4_7.aByteArray73);
							} catch (@Pc(103) IOException local103) {
								try {
									this.aClass111_3.close();
								} catch (@Pc(111) Exception local111) {
								}
								this.aClass111_3 = null;
								this.response = -2;
								this.errors++;
							}
						}
						this.anInt5061 = 0;
						this.aLong151 = MonotonicClock.currentTimeMillis();
						return;
					}
					this.aClass246_7.method6341(local44);
				}
			}
			this.aClass246_5.method6341(local44);
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(Z)Z")
	public boolean method4640() {
		@Pc(18) int local18;
		if (this.aClass111_3 != null) {
			@Pc(11) long local11 = MonotonicClock.currentTimeMillis();
			local18 = (int) (local11 - this.aLong151);
			this.aLong151 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt5061 += local18;
			if (this.anInt5061 > 30000) {
				try {
					this.aClass111_3.close();
				} catch (@Pc(46) Exception local46) {
				}
				this.aClass111_3 = null;
			}
		}
		if (this.aClass111_3 == null) {
			return this.method4637() == 0 && this.method4646() == 0;
		}
		try {
			this.aClass111_3.method2792();
			for (@Pc(74) Class2_Sub2_Sub10_Sub1 local74 = (Class2_Sub2_Sub10_Sub1) this.aClass246_5.method6337(); local74 != null; local74 = (Class2_Sub2_Sub10_Sub1) this.aClass246_5.method6336()) {
				this.aClass2_Sub4_7.position = 0;
				this.aClass2_Sub4_7.p1(1);
				this.aClass2_Sub4_7.method4846((int) local74.aLong215);
				this.aClass111_3.write(4, this.aClass2_Sub4_7.aByteArray73);
				this.aClass246_6.method6341(local74);
			}
			for (@Pc(126) Class2_Sub2_Sub10_Sub1 local126 = (Class2_Sub2_Sub10_Sub1) this.aClass246_7.method6337(); local126 != null; local126 = (Class2_Sub2_Sub10_Sub1) this.aClass246_7.method6336()) {
				this.aClass2_Sub4_7.position = 0;
				this.aClass2_Sub4_7.p1(0);
				this.aClass2_Sub4_7.method4846((int) local126.aLong215);
				this.aClass111_3.write(4, this.aClass2_Sub4_7.aByteArray73);
				this.aClass246_8.method6341(local126);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(175) int local175 = this.aClass111_3.available();
				if (local175 < 0) {
					throw new IOException();
				}
				if (local175 == 0) {
					break;
				}
				this.anInt5061 = 0;
				@Pc(191) byte local191 = 0;
				if (this.aClass2_Sub2_Sub10_Sub1_2 == null) {
					local191 = 8;
				} else if (this.aClass2_Sub2_Sub10_Sub1_2.anInt3083 == 0) {
					local191 = 1;
				}
				@Pc(219) int local219;
				@Pc(243) int local243;
				@Pc(301) int local301;
				if (local191 > 0) {
					local219 = local191 - this.aClass2_Sub4_8.position;
					if (local175 < local219) {
						local219 = local175;
					}
					this.aClass111_3.read(this.aClass2_Sub4_8.aByteArray73, local219, this.aClass2_Sub4_8.position);
					if (this.aByte55 != 0) {
						for (local243 = 0; local243 < local219; local243++) {
							this.aClass2_Sub4_8.aByteArray73[this.aClass2_Sub4_8.position + local243] = (byte) (this.aClass2_Sub4_8.aByteArray73[this.aClass2_Sub4_8.position + local243] ^ this.aByte55);
						}
					}
					this.aClass2_Sub4_8.position += local219;
					if (this.aClass2_Sub4_8.position >= local191) {
						if (this.aClass2_Sub2_Sub10_Sub1_2 == null) {
							this.aClass2_Sub4_8.position = 0;
							local243 = this.aClass2_Sub4_8.g1();
							local301 = this.aClass2_Sub4_8.method4829();
							@Pc(306) int local306 = this.aClass2_Sub4_8.g1();
							@Pc(311) int local311 = this.aClass2_Sub4_8.g4();
							@Pc(315) int local315 = local306 & 0x7F;
							@Pc(326) boolean local326 = (local306 & 0x80) != 0;
							@Pc(333) long local333 = (long) ((local243 << 16) + local301);
							@Pc(343) Class2_Sub2_Sub10_Sub1 local343;
							if (local326) {
								for (local343 = (Class2_Sub2_Sub10_Sub1) this.aClass246_8.method6337(); local343 != null && local333 != local343.aLong215; local343 = (Class2_Sub2_Sub10_Sub1) this.aClass246_8.method6336()) {
								}
							} else {
								for (local343 = (Class2_Sub2_Sub10_Sub1) this.aClass246_6.method6337(); local343 != null && local343.aLong215 != local333; local343 = (Class2_Sub2_Sub10_Sub1) this.aClass246_6.method6336()) {
								}
							}
							if (local343 == null) {
								throw new IOException();
							}
							this.aClass2_Sub2_Sub10_Sub1_2 = local343;
							@Pc(399) int local399 = local315 == 0 ? 5 : 9;
							this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3 = new Buffer(local311 + local399 + this.aClass2_Sub2_Sub10_Sub1_2.aByte27);
							this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.p1(local315);
							this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.p4(local311);
							this.aClass2_Sub2_Sub10_Sub1_2.anInt3083 = 8;
							this.aClass2_Sub4_8.position = 0;
						} else if (this.aClass2_Sub2_Sub10_Sub1_2.anInt3083 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub4_8.aByteArray73[0] == -1) {
							this.aClass2_Sub2_Sub10_Sub1_2.anInt3083 = 1;
							this.aClass2_Sub4_8.position = 0;
						} else {
							this.aClass2_Sub2_Sub10_Sub1_2 = null;
						}
					}
				} else {
					local219 = this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.aByteArray73.length - this.aClass2_Sub2_Sub10_Sub1_2.aByte27;
					local243 = 512 - this.aClass2_Sub2_Sub10_Sub1_2.anInt3083;
					if (local219 - this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.position < local243) {
						local243 = local219 - this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.position;
					}
					if (local175 < local243) {
						local243 = local175;
					}
					this.aClass111_3.read(this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.aByteArray73, local243, this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.position);
					if (this.aByte55 != 0) {
						for (local301 = 0; local301 < local243; local301++) {
							this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.aByteArray73[local301 + this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.position] ^= this.aByte55;
						}
					}
					this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.position += local243;
					this.aClass2_Sub2_Sub10_Sub1_2.anInt3083 += local243;
					if (local219 == this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.position) {
						this.aClass2_Sub2_Sub10_Sub1_2.method6143();
						this.aClass2_Sub2_Sub10_Sub1_2.aBoolean416 = false;
						this.aClass2_Sub2_Sub10_Sub1_2 = null;
					} else if (this.aClass2_Sub2_Sub10_Sub1_2.anInt3083 == 512) {
						this.aClass2_Sub2_Sub10_Sub1_2.anInt3083 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(619) IOException local619) {
			try {
				this.aClass111_3.close();
			} catch (@Pc(625) Exception local625) {
			}
			this.aClass111_3 = null;
			this.errors++;
			this.response = -2;
			return this.method4637() == 0 && this.method4646() == 0;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZIBBI)Lclient!jj;")
	public Class2_Sub2_Sub10_Sub1 method4642(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) ((arg1 << 16) + arg3);
		@Pc(20) Class2_Sub2_Sub10_Sub1 local20 = new Class2_Sub2_Sub10_Sub1();
		local20.aBoolean418 = arg0;
		local20.aLong215 = local16;
		local20.aByte27 = arg2;
		if (arg0) {
			if (this.method4637() >= 20) {
				throw new RuntimeException();
			}
			this.aClass246_5.method6341(local20);
		} else if (this.method4646() < 20) {
			this.aClass246_7.method6341(local20);
		} else {
			throw new RuntimeException();
		}
		return local20;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)V")
	public void method4643() {
		try {
			this.aClass111_3.close();
		} catch (@Pc(9) Exception local9) {
		}
		this.response = -1;
		this.aClass111_3 = null;
		this.errors++;
		this.aByte55 = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)Z")
	public boolean method4644() {
		return this.method4637() >= 20;
	}

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "(I)V")
	public void method4645() {
		if (this.aClass111_3 != null) {
			this.aClass111_3.close();
		}
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(Z)I")
	private int method4646() {
		return this.aClass246_7.method6338() + this.aClass246_8.method6338();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZI)V")
	public void method4647(@OriginalArg(0) boolean arg0) {
		if (this.aClass111_3 == null) {
			return;
		}
		try {
			this.aClass2_Sub4_7.position = 0;
			this.aClass2_Sub4_7.p1(arg0 ? 2 : 3);
			this.aClass2_Sub4_7.method4846(0);
			this.aClass111_3.write(4, this.aClass2_Sub4_7.aByteArray73);
		} catch (@Pc(41) IOException local41) {
			try {
				this.aClass111_3.close();
			} catch (@Pc(49) Exception local49) {
			}
			this.response = -2;
			this.errors++;
			this.aClass111_3 = null;
		}
	}
}
