import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class243 {

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "J")
	private long aLong197;

	@OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
	private int anInt6212;

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
	private int anInt6208 = 0;

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "J")
	private long aLong199 = -1L;

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "J")
	private long aLong200 = -1L;

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "Lclient!dm;")
	private final Class83 aClass83_1;

	@OriginalMember(owner = "client!mj", name = "t", descriptor = "J")
	private long aLong196;

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "J")
	private long aLong198;

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "J")
	private long aLong195;

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "[B")
	private final byte[] aByteArray66;

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "[B")
	private final byte[] aByteArray67;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!dm;II)V")
	public Class243(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass83_1 = arg0;
		this.aLong198 = this.aLong196 = arg0.method2161();
		this.aLong195 = 0L;
		this.aByteArray66 = new byte[arg1];
		this.aByteArray67 = new byte[arg2];
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method5558() {
		return this.aClass83_1.method2164();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II[BI)V")
	public void method5559(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg0) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong200 != -1L && this.aLong195 >= this.aLong200 && (long) arg0 + this.aLong195 <= (long) this.anInt6208 + this.aLong200) {
				Static734.method7694(this.aByteArray67, (int) (this.aLong195 - this.aLong200), arg1, 0, arg0);
				this.aLong195 += (long) arg0;
				return;
			}
			@Pc(92) long local92 = this.aLong195;
			@Pc(96) int local96 = arg0;
			@Pc(132) int local132;
			if (this.aLong195 >= this.aLong199 && this.aLong195 < this.aLong199 + (long) this.anInt6212) {
				local132 = (int) ((long) this.anInt6212 + this.aLong199 - this.aLong195);
				if (arg0 < local132) {
					local132 = arg0;
				}
				Static734.method7694(this.aByteArray66, (int) (this.aLong195 - this.aLong199), arg1, 0, local132);
				this.aLong195 += (long) local132;
				arg2 = local132;
				arg0 -= local132;
			}
			if (this.aByteArray66.length < arg0) {
				this.aClass83_1.method2160(this.aLong195);
				this.aLong197 = this.aLong195;
				while (arg0 > 0) {
					local132 = this.aClass83_1.method2163(arg0, arg1, arg2);
					if (local132 == -1) {
						break;
					}
					this.aLong195 += (long) local132;
					arg0 -= local132;
					arg2 += local132;
					this.aLong197 += (long) local132;
				}
			} else if (arg0 > 0) {
				this.method5563();
				local132 = arg0;
				if (this.anInt6212 < arg0) {
					local132 = this.anInt6212;
				}
				Static734.method7694(this.aByteArray66, 0, arg1, arg2, local132);
				arg2 += local132;
				this.aLong195 += (long) local132;
				arg0 -= local132;
			}
			if (this.aLong200 != -1L) {
				if (this.aLong200 > this.aLong195 && arg0 > 0) {
					local132 = (int) (this.aLong200 - this.aLong195) + arg2;
					if (local132 > arg0 + arg2) {
						local132 = arg2 + arg0;
					}
					while (local132 > arg2) {
						arg0--;
						arg1[arg2++] = 0;
						this.aLong195++;
					}
				}
				@Pc(323) long local323 = -1L;
				if (local92 <= this.aLong200 && this.aLong200 < local92 + (long) local96) {
					local323 = this.aLong200;
				} else if (this.aLong200 <= local92 && this.aLong200 + (long) this.anInt6208 > local92) {
					local323 = local92;
				}
				@Pc(373) long local373 = -1L;
				if (local92 < this.aLong200 + (long) this.anInt6208 && (long) local96 + local92 >= this.aLong200 + (long) this.anInt6208) {
					local373 = (long) this.anInt6208 + this.aLong200;
				} else if (this.aLong200 < local92 + (long) local96 && (long) this.anInt6208 + this.aLong200 >= local92 - -((long) local96)) {
					local373 = (long) local96 + local92;
				}
				if (local323 > -1L && local373 > local323) {
					@Pc(462) int local462 = (int) (local373 - local323);
					Static734.method7694(this.aByteArray67, (int) (local323 - this.aLong200), arg1, (int) (local323 - local92), local462);
					if (local373 > this.aLong195) {
						arg0 = (int) ((long) arg0 + this.aLong195 - local373);
						this.aLong195 = local373;
					}
				}
			}
		} catch (@Pc(500) IOException local500) {
			this.aLong197 = -1L;
			throw local500;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III[B)V")
	public void method5561(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong198 < (long) arg1 + this.aLong195) {
				this.aLong198 = (long) arg1 + this.aLong195;
			}
			if (this.aLong200 != -1L && (this.aLong200 > this.aLong195 || (long) this.anInt6208 + this.aLong200 < this.aLong195)) {
				this.method5567();
			}
			if (this.aLong200 != -1L && this.aLong200 + (long) this.aByteArray67.length < this.aLong195 + (long) arg1) {
				@Pc(95) int local95 = (int) (this.aLong200 + (long) this.aByteArray67.length - this.aLong195);
				Static734.method7694(arg2, arg0, this.aByteArray67, (int) (this.aLong195 - this.aLong200), local95);
				arg0 += local95;
				arg1 -= local95;
				this.aLong195 += (long) local95;
				this.anInt6208 = this.aByteArray67.length;
				this.method5567();
			}
			if (arg1 > this.aByteArray67.length) {
				if (this.aLong197 != this.aLong195) {
					this.aClass83_1.method2160(this.aLong195);
					this.aLong197 = this.aLong195;
				}
				this.aClass83_1.method2162(arg2, arg0, arg1);
				this.aLong197 += (long) arg1;
				if (this.aLong197 > this.aLong196) {
					this.aLong196 = this.aLong197;
				}
				@Pc(188) long local188 = -1L;
				if (this.aLong199 <= this.aLong195 && this.aLong195 < (long) this.anInt6212 + this.aLong199) {
					local188 = this.aLong195;
				} else if (this.aLong195 <= this.aLong199 && (long) arg1 + this.aLong195 > this.aLong199) {
					local188 = this.aLong199;
				}
				@Pc(239) long local239 = -1L;
				if (this.aLong199 < (long) arg1 + this.aLong195 && this.aLong199 + (long) this.anInt6212 >= this.aLong195 - -((long) arg1)) {
					local239 = (long) arg1 + this.aLong195;
				} else if (this.aLong195 < (long) this.anInt6212 + this.aLong199 && this.aLong195 + (long) arg1 >= (long) this.anInt6212 + this.aLong199) {
					local239 = this.aLong199 + (long) this.anInt6212;
				}
				if (local188 > -1L && local188 < local239) {
					@Pc(324) int local324 = (int) (local239 - local188);
					Static734.method7694(arg2, (int) (local188 + (long) arg0 - this.aLong195), this.aByteArray66, (int) (local188 - this.aLong199), local324);
				}
				this.aLong195 += (long) arg1;
			} else if (arg1 > 0) {
				if (this.aLong200 == -1L) {
					this.aLong200 = this.aLong195;
				}
				Static734.method7694(arg2, arg0, this.aByteArray67, (int) (this.aLong195 - this.aLong200), arg1);
				this.aLong195 += (long) arg1;
				if ((long) this.anInt6208 < this.aLong195 - this.aLong200) {
					this.anInt6208 = (int) (this.aLong195 - this.aLong200);
				}
			}
		} catch (@Pc(414) IOException local414) {
			this.aLong197 = -1L;
			throw local414;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
	private void method5563() throws IOException {
		this.anInt6212 = 0;
		if (this.aLong195 != this.aLong197) {
			this.aClass83_1.method2160(this.aLong195);
			this.aLong197 = this.aLong195;
		}
		this.aLong199 = this.aLong195;
		while (this.anInt6212 < this.aByteArray66.length) {
			@Pc(44) int local44 = this.aByteArray66.length - this.anInt6212;
			if (local44 > 200000000) {
				local44 = 200000000;
			}
			@Pc(61) int local61 = this.aClass83_1.method2163(local44, this.aByteArray66, this.anInt6212);
			if (local61 == -1) {
				break;
			}
			this.anInt6212 += local61;
			this.aLong197 += (long) local61;
		}
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)J")
	public long method5564() {
		return this.aLong198;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([BB)V")
	public void method5565(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method5559(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
	public void method5566() throws IOException {
		this.method5567();
		this.aClass83_1.method2158();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V")
	private void method5567() throws IOException {
		if (this.aLong200 == -1L) {
			return;
		}
		if (this.aLong200 != this.aLong197) {
			this.aClass83_1.method2160(this.aLong200);
			this.aLong197 = this.aLong200;
		}
		this.aClass83_1.method2162(this.aByteArray67, 0, this.anInt6208);
		this.aLong197 += (long) this.anInt6208;
		if (this.aLong197 > this.aLong196) {
			this.aLong196 = this.aLong197;
		}
		@Pc(71) long local71 = -1L;
		@Pc(73) long local73 = -1L;
		if (this.aLong199 <= this.aLong200 && this.aLong200 < this.aLong199 + (long) this.anInt6212) {
			local71 = this.aLong200;
		} else if (this.aLong199 >= this.aLong200 && (long) this.anInt6208 + this.aLong200 > this.aLong199) {
			local71 = this.aLong199;
		}
		if (this.aLong199 < this.aLong200 + (long) this.anInt6208 && (long) this.anInt6212 + this.aLong199 >= this.aLong200 - -((long) this.anInt6208)) {
			local73 = this.aLong200 + (long) this.anInt6208;
		} else if (this.aLong200 < this.aLong199 + (long) this.anInt6212 && (long) this.anInt6208 + this.aLong200 >= this.aLong199 - -((long) this.anInt6212)) {
			local73 = (long) this.anInt6212 + this.aLong199;
		}
		if (local71 > -1L && local73 > local71) {
			@Pc(228) int local228 = (int) (local73 - local71);
			Static734.method7694(this.aByteArray67, (int) (local71 - this.aLong200), this.aByteArray66, (int) (local71 - this.aLong199), local228);
		}
		this.anInt6208 = 0;
		this.aLong200 = -1L;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(JZ)V")
	public void method5568(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method5558());
		}
		this.aLong195 = arg0;
	}
}
