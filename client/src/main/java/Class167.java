import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class167 {

	@OriginalMember(owner = "client!r", name = "p", descriptor = "J")
	private long aLong173;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "I")
	private int anInt5593;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "I")
	private int anInt5585 = 0;

	@OriginalMember(owner = "client!r", name = "b", descriptor = "J")
	private long aLong169 = -1L;

	@OriginalMember(owner = "client!r", name = "j", descriptor = "J")
	private long aLong172 = -1L;

	@OriginalMember(owner = "client!r", name = "h", descriptor = "Lclient!an;")
	private final Class10 aClass10_1;

	@OriginalMember(owner = "client!r", name = "i", descriptor = "J")
	private long aLong171;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "J")
	private long aLong170;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "J")
	private long aLong174;

	@OriginalMember(owner = "client!r", name = "o", descriptor = "[B")
	private final byte[] aByteArray71;

	@OriginalMember(owner = "client!r", name = "l", descriptor = "[B")
	private final byte[] aByteArray70;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!an;II)V")
	public Class167(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass10_1 = arg0;
		this.aLong170 = this.aLong171 = arg0.method355();
		this.aLong174 = 0L;
		this.aByteArray71 = new byte[arg2];
		this.aByteArray70 = new byte[arg1];
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IJ)V")
	public void method4761(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4766());
		}
		this.aLong174 = arg0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I[B)V")
	public void method4763(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method4767(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)J")
	public long method4764() {
		return this.aLong170;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method4766() {
		return this.aClass10_1.method359();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([BBII)V")
	public void method4767(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong169 != -1L && this.aLong169 <= this.aLong174 && (long) this.anInt5585 + this.aLong169 >= (long) arg2 + this.aLong174) {
				Static360.method2013(this.aByteArray71, (int) (this.aLong174 - this.aLong169), arg0, 0, arg2);
				this.aLong174 += arg2;
				return;
			}
			@Pc(87) long local87 = this.aLong174;
			@Pc(91) int local91 = arg2;
			@Pc(119) int local119;
			if (this.aLong172 <= this.aLong174 && this.aLong174 < (long) this.anInt5593 + this.aLong172) {
				local119 = (int) ((long) this.anInt5593 + this.aLong172 - this.aLong174);
				if (local119 > arg2) {
					local119 = arg2;
				}
				Static360.method2013(this.aByteArray70, (int) (this.aLong174 - this.aLong172), arg0, 0, local119);
				arg1 = local119;
				arg2 -= local119;
				this.aLong174 += local119;
			}
			if (arg2 > this.aByteArray70.length) {
				this.aClass10_1.method357(this.aLong174);
				this.aLong173 = this.aLong174;
				while (arg2 > 0) {
					local119 = this.aClass10_1.method354(arg2, arg0, arg1);
					if (local119 == -1) {
						break;
					}
					arg2 -= local119;
					arg1 += local119;
					this.aLong174 += local119;
					this.aLong173 += local119;
				}
			} else if (arg2 > 0) {
				this.method4769();
				local119 = arg2;
				if (this.anInt5593 < arg2) {
					local119 = this.anInt5593;
				}
				Static360.method2013(this.aByteArray70, 0, arg0, arg1, local119);
				arg1 += local119;
				arg2 -= local119;
				this.aLong174 += local119;
			}
			if (this.aLong169 != -1L) {
				if (this.aLong169 > this.aLong174 && arg2 > 0) {
					local119 = arg1 + (int) (this.aLong169 - this.aLong174);
					if (arg1 + arg2 < local119) {
						local119 = arg2 + arg1;
					}
					while (arg1 < local119) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong174++;
					}
				}
				@Pc(311) long local311 = -1L;
				if (this.aLong169 >= local87 && this.aLong169 < (long) local91 + local87) {
					local311 = this.aLong169;
				} else if (this.aLong169 <= local87 && local87 < (long) this.anInt5585 + this.aLong169) {
					local311 = local87;
				}
				@Pc(351) long local351 = -1L;
				if ((long) this.anInt5585 + this.aLong169 > local87 && (long) local91 + local87 >= (long) this.anInt5585 + this.aLong169) {
					local351 = (long) this.anInt5585 + this.aLong169;
				} else if ((long) local91 + local87 > this.aLong169 && (long) local91 + local87 <= (long) this.anInt5585 + this.aLong169) {
					local351 = local87 + (long) local91;
				}
				if (local311 > -1L && local351 > local311) {
					@Pc(435) int local435 = (int) (local351 - local311);
					Static360.method2013(this.aByteArray71, (int) (local311 - this.aLong169), arg0, (int) (local311 - local87), local435);
					if (local351 > this.aLong174) {
						arg2 = (int) ((long) arg2 + this.aLong174 - local351);
						this.aLong174 = local351;
					}
				}
			}
		} catch (@Pc(476) IOException local476) {
			this.aLong173 = -1L;
			throw local476;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([BIII)V")
	public void method4768(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if ((long) arg1 + this.aLong174 > this.aLong170) {
				this.aLong170 = (long) arg1 + this.aLong174;
			}
			if (this.aLong169 != -1L && (this.aLong169 > this.aLong174 || this.aLong174 > this.aLong169 + (long) this.anInt5585)) {
				this.method4770();
			}
			if (this.aLong169 != -1L && (long) this.aByteArray71.length + this.aLong169 < this.aLong174 - -((long) arg1)) {
				@Pc(100) int local100 = (int) (this.aLong169 + (long) this.aByteArray71.length - this.aLong174);
				Static360.method2013(arg0, arg2, this.aByteArray71, (int) (this.aLong174 - this.aLong169), local100);
				arg1 -= local100;
				this.aLong174 += local100;
				arg2 += local100;
				this.anInt5585 = this.aByteArray71.length;
				this.method4770();
			}
			if (this.aByteArray71.length < arg1) {
				if (this.aLong174 != this.aLong173) {
					this.aClass10_1.method357(this.aLong174);
					this.aLong173 = this.aLong174;
				}
				this.aClass10_1.method358(arg0, arg2, arg1);
				this.aLong173 += arg1;
				if (this.aLong171 < this.aLong173) {
					this.aLong171 = this.aLong173;
				}
				@Pc(183) long local183 = -1L;
				if (this.aLong174 >= this.aLong172 && this.aLong174 < this.aLong172 + (long) this.anInt5593) {
					local183 = this.aLong174;
				} else if (this.aLong174 <= this.aLong172 && this.aLong172 < this.aLong174 + (long) arg1) {
					local183 = this.aLong172;
				}
				@Pc(236) long local236 = -1L;
				if ((long) arg1 + this.aLong174 > this.aLong172 && this.aLong172 + (long) this.anInt5593 >= this.aLong174 - -((long) arg1)) {
					local236 = (long) arg1 + this.aLong174;
				} else if ((long) this.anInt5593 + this.aLong172 > this.aLong174 && (long) this.anInt5593 + this.aLong172 <= (long) arg1 + this.aLong174) {
					local236 = (long) this.anInt5593 + this.aLong172;
				}
				if (local183 > -1L && local236 > local183) {
					@Pc(333) int local333 = (int) (local236 - local183);
					Static360.method2013(arg0, (int) ((long) arg2 + local183 - this.aLong174), this.aByteArray70, (int) (local183 - this.aLong172), local333);
				}
				this.aLong174 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong169 == -1L) {
					this.aLong169 = this.aLong174;
				}
				Static360.method2013(arg0, arg2, this.aByteArray71, (int) (this.aLong174 - this.aLong169), arg1);
				this.aLong174 += arg1;
				if ((long) this.anInt5585 < this.aLong174 - this.aLong169) {
					this.anInt5585 = (int) (this.aLong174 - this.aLong169);
				}
			}
		} catch (@Pc(421) IOException local421) {
			this.aLong173 = -1L;
			throw local421;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
	private void method4769() throws IOException {
		this.anInt5593 = 0;
		if (this.aLong173 != this.aLong174) {
			this.aClass10_1.method357(this.aLong174);
			this.aLong173 = this.aLong174;
		}
		this.aLong172 = this.aLong174;
		while (this.aByteArray70.length > this.anInt5593) {
			@Pc(51) int local51 = this.aByteArray70.length - this.anInt5593;
			if (local51 > 200000000) {
				local51 = 200000000;
			}
			@Pc(68) int local68 = this.aClass10_1.method354(local51, this.aByteArray70, this.anInt5593);
			if (local68 == -1) {
				break;
			}
			this.aLong173 += local68;
			this.anInt5593 += local68;
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
	private void method4770() throws IOException {
		if (this.aLong169 == -1L) {
			return;
		}
		if (this.aLong169 != this.aLong173) {
			this.aClass10_1.method357(this.aLong169);
			this.aLong173 = this.aLong169;
		}
		this.aClass10_1.method358(this.aByteArray71, 0, this.anInt5585);
		this.aLong173 += this.anInt5585;
		if (this.aLong171 < this.aLong173) {
			this.aLong171 = this.aLong173;
		}
		@Pc(69) long local69 = -1L;
		if (this.aLong172 <= this.aLong169 && (long) this.anInt5593 + this.aLong172 > this.aLong169) {
			local69 = this.aLong169;
		} else if (this.aLong169 <= this.aLong172 && this.aLong172 < (long) this.anInt5585 + this.aLong169) {
			local69 = this.aLong172;
		}
		@Pc(123) long local123 = -1L;
		if (this.aLong172 < this.aLong169 + (long) this.anInt5585 && this.aLong169 + (long) this.anInt5585 <= (long) this.anInt5593 + this.aLong172) {
			local123 = (long) this.anInt5585 + this.aLong169;
		} else if ((long) this.anInt5593 + this.aLong172 > this.aLong169 && this.aLong169 + (long) this.anInt5585 >= (long) this.anInt5593 + this.aLong172) {
			local123 = (long) this.anInt5593 + this.aLong172;
		}
		if (local69 > -1L && local69 < local123) {
			@Pc(217) int local217 = (int) (local123 - local69);
			Static360.method2013(this.aByteArray71, (int) (local69 - this.aLong169), this.aByteArray70, (int) (local69 - this.aLong172), local217);
		}
		this.aLong169 = -1L;
		this.anInt5585 = 0;
	}
}
