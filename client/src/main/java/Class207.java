import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class207 {

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "Lclient!rn;")
	private Class205 aClass205_3 = null;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
	private int anInt5776 = 65000;

	@OriginalMember(owner = "client!rq", name = "k", descriptor = "Lclient!rn;")
	private Class205 aClass205_4 = null;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
	private final int anInt5772;

	static {
		new Class79(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
		new Class79(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(ILclient!rn;Lclient!rn;I)V")
	public Class207(@OriginalArg(0) int arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) int arg3) {
		this.aClass205_3 = arg2;
		this.anInt5776 = arg3;
		this.aClass205_4 = arg1;
		this.anInt5772 = arg0;
	}

	@OriginalMember(owner = "client!rq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt5772;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I[BBI)Z")
	public boolean method5259(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class205 local6 = this.aClass205_4;
		synchronized (this.aClass205_4) {
			if (arg0 < 0 || this.anInt5776 < arg0) {
				throw new IllegalArgumentException();
			}
			@Pc(35) boolean local35 = this.method5260(true, arg0, arg2, arg1);
			if (!local35) {
				local35 = this.method5260(false, arg0, arg2, arg1);
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZIII[B)Z")
	private boolean method5260(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(13) Class205 local13 = this.aClass205_4;
		synchronized (this.aClass205_4) {
			try {
				@Pc(27) int local27;
				if (arg0) {
					if ((long) (arg2 * 6 + 6) > this.aClass205_3.method5218()) {
						return false;
					}
					this.aClass205_3.method5214((long) (arg2 * 6));
					this.aClass205_3.method5222(Static175.aByteArray35, 0, 6);
					local27 = (Static175.aByteArray35[5] & 0xFF) + ((Static175.aByteArray35[4] & 0xFF) << 8) + ((Static175.aByteArray35[3] & 0xFF) << 16);
					if (local27 <= 0 || (long) local27 > this.aClass205_4.method5218() / 520L) {
						return false;
					}
				} else {
					local27 = (int) ((this.aClass205_4.method5218() + 519L) / 520L);
					if (local27 == 0) {
						local27 = 1;
					}
				}
				Static175.aByteArray35[1] = (byte) (arg1 >> 8);
				Static175.aByteArray35[3] = (byte) (local27 >> 16);
				Static175.aByteArray35[2] = (byte) arg1;
				Static175.aByteArray35[0] = (byte) (arg1 >> 16);
				Static175.aByteArray35[4] = (byte) (local27 >> 8);
				Static175.aByteArray35[5] = (byte) local27;
				this.aClass205_3.method5214((long) (arg2 * 6));
				this.aClass205_3.method5215(0, Static175.aByteArray35, 6);
				@Pc(168) int local168 = 0;
				@Pc(170) int local170 = 0;
				while (local168 < arg1) {
					@Pc(174) int local174 = 0;
					@Pc(209) int local209;
					if (arg0) {
						this.aClass205_4.method5214((long) (local27 * 520));
						try {
							this.aClass205_4.method5222(Static175.aByteArray35, 0, 8);
						} catch (@Pc(193) EOFException local193) {
							return true;
						}
						local209 = (Static175.aByteArray35[1] & 0xFF) + ((Static175.aByteArray35[0] & 0xFF) << 8);
						@Pc(223) int local223 = (Static175.aByteArray35[3] & 0xFF) + ((Static175.aByteArray35[2] & 0xFF) << 8);
						local174 = ((Static175.aByteArray35[4] & 0xFF) << 16) + (((Static175.aByteArray35[5] & 0xFF) << 8) + (Static175.aByteArray35[6] & 0xFF));
						@Pc(252) int local252 = Static175.aByteArray35[7] & 0xFF;
						if (local209 != arg2 || local170 != local223 || this.anInt5772 != local252) {
							return false;
						}
						if (local174 < 0 || this.aClass205_4.method5218() / 520L < (long) local174) {
							return false;
						}
					}
					if (local174 == 0) {
						arg0 = false;
						local174 = (int) ((this.aClass205_4.method5218() + 519L) / 520L);
						if (local174 == 0) {
							local174++;
						}
						if (local174 == local27) {
							local174++;
						}
					}
					Static175.aByteArray35[3] = (byte) local170;
					if (arg1 - local168 <= 512) {
						local174 = 0;
					}
					Static175.aByteArray35[0] = (byte) (arg2 >> 8);
					Static175.aByteArray35[1] = (byte) arg2;
					Static175.aByteArray35[2] = (byte) (local170 >> 8);
					Static175.aByteArray35[7] = (byte) this.anInt5772;
					Static175.aByteArray35[4] = (byte) (local174 >> 16);
					Static175.aByteArray35[5] = (byte) (local174 >> 8);
					Static175.aByteArray35[6] = (byte) local174;
					this.aClass205_4.method5214((long) (local27 * 520));
					this.aClass205_4.method5215(0, Static175.aByteArray35, 8);
					local209 = arg1 - local168;
					if (local209 > 512) {
						local209 = 512;
					}
					this.aClass205_4.method5215(local168, arg3, local209);
					local168 += local209;
					local27 = local174;
					local170++;
				}
				return true;
			} catch (@Pc(433) IOException local433) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)[B")
	public byte[] method5261(@OriginalArg(1) int arg0) {
		@Pc(8) Class205 local8 = this.aClass205_4;
		synchronized (this.aClass205_4) {
			try {
				if (this.aClass205_3.method5218() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass205_3.method5214((long) (arg0 * 6));
				this.aClass205_3.method5222(Static175.aByteArray35, 0, 6);
				@Pc(65) int local65 = (Static175.aByteArray35[2] & 0xFF) + ((Static175.aByteArray35[0] & 0xFF) << 16) + ((Static175.aByteArray35[1] & 0xFF) << 8);
				@Pc(88) int local88 = ((Static175.aByteArray35[3] & 0xFF) << 16) - (-((Static175.aByteArray35[4] & 0xFF) << 8) - (Static175.aByteArray35[5] & 0xFF));
				if (local65 < 0 || local65 > this.anInt5776) {
					return null;
				} else if (local88 > 0 && this.aClass205_4.method5218() / 520L >= (long) local88) {
					@Pc(128) byte[] local128 = new byte[local65];
					@Pc(130) int local130 = 0;
					@Pc(140) int local140 = 0;
					while (local65 > local130) {
						if (local88 == 0) {
							return null;
						}
						this.aClass205_4.method5214((long) (local88 * 520));
						@Pc(163) int local163 = local65 - local130;
						if (local163 > 512) {
							local163 = 512;
						}
						this.aClass205_4.method5222(Static175.aByteArray35, 0, local163 + 8);
						@Pc(191) int local191 = (Static175.aByteArray35[1] & 0xFF) + ((Static175.aByteArray35[0] & 0xFF) << 8);
						@Pc(206) int local206 = ((Static175.aByteArray35[2] & 0xFF) << 8) + (Static175.aByteArray35[3] & 0xFF);
						@Pc(228) int local228 = (Static175.aByteArray35[6] & 0xFF) + ((Static175.aByteArray35[5] & 0xFF) << 8) + ((Static175.aByteArray35[4] & 0xFF) << 16);
						@Pc(234) int local234 = Static175.aByteArray35[7] & 0xFF;
						if (arg0 == local191 && local206 == local140 && this.anInt5772 == local234) {
							if (local228 >= 0 && this.aClass205_4.method5218() / 520L >= (long) local228) {
								for (@Pc(278) int local278 = 0; local278 < local163; local278++) {
									local128[local130++] = Static175.aByteArray35[local278 + 8];
								}
								local140++;
								local88 = local228;
								continue;
							}
							return null;
						}
						return null;
					}
					return local128;
				} else {
					return null;
				}
			} catch (@Pc(306) IOException local306) {
				return null;
			}
		}
	}
}
