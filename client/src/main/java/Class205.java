import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class205 {

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "J")
	private long aLong169;

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
	private int anInt5728;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
	private int anInt5724 = 0;

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "J")
	private long aLong170 = -1L;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "J")
	private long aLong171 = -1L;

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "Lclient!rl;")
	private final Class204 aClass204_4;

	@OriginalMember(owner = "client!rn", name = "n", descriptor = "J")
	private long aLong172;

	@OriginalMember(owner = "client!rn", name = "r", descriptor = "J")
	private long aLong173;

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "[B")
	private final byte[] aByteArray75;

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "[B")
	private final byte[] aByteArray74;

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "J")
	private long aLong168;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!rl;II)V")
	public Class205(@OriginalArg(0) Class204 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass204_4 = arg0;
		this.aLong173 = this.aLong172 = arg0.method5196();
		this.aByteArray75 = new byte[arg1];
		this.aByteArray74 = new byte[arg2];
		this.aLong168 = 0L;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(JB)V")
	public void method5214(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method5217());
		}
		this.aLong168 = arg0;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II[BI)V")
	public void method5215(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong168 > this.aLong173) {
				this.aLong173 = (long) arg2 + this.aLong168;
			}
			if (this.aLong171 != -1L && (this.aLong168 < this.aLong171 || (long) this.anInt5724 + this.aLong171 < this.aLong168)) {
				this.method5219();
			}
			if (this.aLong171 != -1L && this.aLong171 + (long) this.aByteArray74.length < this.aLong168 + (long) arg2) {
				@Pc(92) int local92 = (int) ((long) this.aByteArray74.length + this.aLong171 - this.aLong168);
				Static404.method4607(arg1, arg0, this.aByteArray74, (int) (this.aLong168 - this.aLong171), local92);
				arg0 += local92;
				arg2 -= local92;
				this.aLong168 += local92;
				this.anInt5724 = this.aByteArray74.length;
				this.method5219();
			}
			if (arg2 > this.aByteArray74.length) {
				if (this.aLong168 != this.aLong169) {
					this.aClass204_4.method5197(this.aLong168);
					this.aLong169 = this.aLong168;
				}
				this.aClass204_4.method5195(arg1, arg2, arg0);
				this.aLong169 += arg2;
				if (this.aLong169 > this.aLong172) {
					this.aLong172 = this.aLong169;
				}
				@Pc(181) long local181 = -1L;
				@Pc(183) long local183 = -1L;
				if (this.aLong168 >= this.aLong170 && this.aLong170 + (long) this.anInt5728 > this.aLong168) {
					local181 = this.aLong168;
				} else if (this.aLong168 <= this.aLong170 && this.aLong168 + (long) arg2 > this.aLong170) {
					local181 = this.aLong170;
				}
				if ((long) arg2 + this.aLong168 > this.aLong170 && this.aLong168 + (long) arg2 <= this.aLong170 + (long) this.anInt5728) {
					local183 = (long) arg2 + this.aLong168;
				} else if (this.aLong168 < (long) this.anInt5728 + this.aLong170 && this.aLong168 + (long) arg2 >= (long) this.anInt5728 + this.aLong170) {
					local183 = (long) this.anInt5728 + this.aLong170;
				}
				if (local181 > -1L && local183 > local181) {
					@Pc(319) int local319 = (int) (local183 - local181);
					Static404.method4607(arg1, (int) ((long) arg0 + local181 - this.aLong168), this.aByteArray75, (int) (local181 - this.aLong170), local319);
				}
				this.aLong168 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong171 == -1L) {
					this.aLong171 = this.aLong168;
				}
				Static404.method4607(arg1, arg0, this.aByteArray74, (int) (this.aLong168 - this.aLong171), arg2);
				this.aLong168 += arg2;
				if ((long) this.anInt5724 < this.aLong168 - this.aLong171) {
					this.anInt5724 = (int) (this.aLong168 - this.aLong171);
				}
			}
		} catch (@Pc(407) IOException local407) {
			this.aLong169 = -1L;
			throw local407;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
	private void method5216() throws IOException {
		this.anInt5728 = 0;
		if (this.aLong168 != this.aLong169) {
			this.aClass204_4.method5197(this.aLong168);
			this.aLong169 = this.aLong168;
		}
		this.aLong170 = this.aLong168;
		while (this.anInt5728 < this.aByteArray75.length) {
			@Pc(49) int local49 = this.aByteArray75.length - this.anInt5728;
			if (local49 > 200000000) {
				local49 = 200000000;
			}
			@Pc(66) int local66 = this.aClass204_4.method5194(local49, this.anInt5728, this.aByteArray75);
			if (local66 == -1) {
				break;
			}
			this.anInt5728 += local66;
			this.aLong169 += local66;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method5217() {
		return this.aClass204_4.method5198();
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)J")
	public long method5218() {
		return this.aLong173;
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(B)V")
	private void method5219() throws IOException {
		if (this.aLong171 == -1L) {
			return;
		}
		if (this.aLong169 != this.aLong171) {
			this.aClass204_4.method5197(this.aLong171);
			this.aLong169 = this.aLong171;
		}
		this.aClass204_4.method5195(this.aByteArray74, this.anInt5724, 0);
		this.aLong169 += this.anInt5724;
		if (this.aLong172 < this.aLong169) {
			this.aLong172 = this.aLong169;
		}
		@Pc(64) long local64 = -1L;
		@Pc(66) long local66 = -1L;
		if (this.aLong171 >= this.aLong170 && this.aLong171 < (long) this.anInt5728 + this.aLong170) {
			local64 = this.aLong171;
		} else if (this.aLong170 >= this.aLong171 && (long) this.anInt5724 + this.aLong171 > this.aLong170) {
			local64 = this.aLong170;
		}
		if (this.aLong170 < (long) this.anInt5724 + this.aLong171 && this.aLong170 + (long) this.anInt5728 >= (long) this.anInt5724 + this.aLong171) {
			local66 = this.aLong171 + (long) this.anInt5724;
		} else if ((long) this.anInt5728 + this.aLong170 > this.aLong171 && (long) this.anInt5728 + this.aLong170 <= this.aLong171 - -((long) this.anInt5724)) {
			local66 = (long) this.anInt5728 + this.aLong170;
		}
		if (local64 > -1L && local66 > local64) {
			@Pc(199) int local199 = (int) (local66 - local64);
			Static404.method4607(this.aByteArray74, (int) (local64 - this.aLong171), this.aByteArray75, (int) (local64 - this.aLong170), local199);
		}
		this.aLong171 = -1L;
		this.anInt5724 = 0;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "([BB)V")
	public void method5220(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method5222(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "([BZII)V")
	public void method5222(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong171 != -1L && this.aLong168 >= this.aLong171 && this.aLong168 + (long) arg2 <= this.aLong171 + (long) this.anInt5724) {
				Static404.method4607(this.aByteArray74, (int) (this.aLong168 - this.aLong171), arg0, 0, arg2);
				this.aLong168 += arg2;
				return;
			}
			@Pc(86) long local86 = this.aLong168;
			@Pc(90) int local90 = arg2;
			@Pc(119) int local119;
			if (this.aLong168 >= this.aLong170 && this.aLong168 < this.aLong170 + (long) this.anInt5728) {
				local119 = (int) ((long) this.anInt5728 + this.aLong170 - this.aLong168);
				if (local119 > arg2) {
					local119 = arg2;
				}
				Static404.method4607(this.aByteArray75, (int) (this.aLong168 - this.aLong170), arg0, 0, local119);
				arg1 = local119;
				this.aLong168 += local119;
				arg2 -= local119;
			}
			if (this.aByteArray75.length < arg2) {
				this.aClass204_4.method5197(this.aLong168);
				this.aLong169 = this.aLong168;
				while (arg2 > 0) {
					local119 = this.aClass204_4.method5194(arg2, arg1, arg0);
					if (local119 == -1) {
						break;
					}
					this.aLong168 += local119;
					arg2 -= local119;
					this.aLong169 += local119;
					arg1 += local119;
				}
			} else if (arg2 > 0) {
				this.method5216();
				local119 = arg2;
				if (arg2 > this.anInt5728) {
					local119 = this.anInt5728;
				}
				Static404.method4607(this.aByteArray75, 0, arg0, arg1, local119);
				arg1 += local119;
				this.aLong168 += local119;
				arg2 -= local119;
			}
			if (this.aLong171 != -1L) {
				if (this.aLong171 > this.aLong168 && arg2 > 0) {
					local119 = (int) (this.aLong171 - this.aLong168) + arg1;
					if (arg2 + arg1 < local119) {
						local119 = arg1 + arg2;
					}
					while (local119 > arg1) {
						arg2--;
						arg0[arg1++] = 0;
						this.aLong168++;
					}
				}
				@Pc(307) long local307 = -1L;
				@Pc(309) long local309 = -1L;
				if (local86 <= this.aLong171 && this.aLong171 < local86 + (long) local90) {
					local307 = this.aLong171;
				} else if (this.aLong171 <= local86 && local86 < this.aLong171 + (long) this.anInt5724) {
					local307 = local86;
				}
				if (this.aLong171 + (long) this.anInt5724 > local86 && (long) this.anInt5724 + this.aLong171 <= local86 - -((long) local90)) {
					local309 = this.aLong171 + (long) this.anInt5724;
				} else if ((long) local90 + local86 > this.aLong171 && (long) local90 + local86 <= this.aLong171 - -((long) this.anInt5724)) {
					local309 = local86 + (long) local90;
				}
				if (local307 > -1L && local307 < local309) {
					@Pc(431) int local431 = (int) (local309 - local307);
					Static404.method4607(this.aByteArray74, (int) (local307 - this.aLong171), arg0, (int) (local307 - local86), local431);
					if (this.aLong168 < local309) {
						arg2 = (int) ((long) arg2 + this.aLong168 - local309);
						this.aLong168 = local309;
					}
				}
			}
		} catch (@Pc(473) IOException local473) {
			this.aLong169 = -1L;
			throw local473;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}
}
