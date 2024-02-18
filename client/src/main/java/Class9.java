import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class9 {

	@OriginalMember(owner = "client!af", name = "c", descriptor = "Lclient!mj;")
	private Class243 aClass243_2 = null;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Lclient!mj;")
	private Class243 aClass243_3 = null;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "I")
	private int anInt114 = 65000;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "I")
	private final int anInt118;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(ILclient!mj;Lclient!mj;I)V")
	public Class9(@OriginalArg(0) int arg0, @OriginalArg(1) Class243 arg1, @OriginalArg(2) Class243 arg2, @OriginalArg(3) int arg3) {
		this.aClass243_3 = arg2;
		this.anInt118 = arg0;
		this.anInt114 = arg3;
		this.aClass243_2 = arg1;
	}

	@OriginalMember(owner = "client!af", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt118;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I[BIZ)Z")
	public boolean method125(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class243 local6 = this.aClass243_2;
		synchronized (this.aClass243_2) {
			if (arg0 < 0 || arg0 > this.anInt114) {
				throw new IllegalArgumentException();
			}
			@Pc(30) boolean local30 = this.method128(arg1, arg2, arg0, true);
			if (!local30) {
				local30 = this.method128(arg1, arg2, arg0, false);
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[B")
	public byte[] method126(@OriginalArg(0) int arg0) {
		@Pc(6) Class243 local6 = this.aClass243_2;
		synchronized (this.aClass243_2) {
			try {
				if (this.aClass243_3.method5564() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass243_3.method5568((long) (arg0 * 6));
				this.aClass243_3.method5559(6, Static294.aByteArray49, 0);
				@Pc(67) int local67 = ((Static294.aByteArray49[1] & 0xFF) << 8) + ((Static294.aByteArray49[0] & 0xFF) << 16) + (Static294.aByteArray49[2] & 0xFF);
				@Pc(89) int local89 = (Static294.aByteArray49[5] & 0xFF) + ((Static294.aByteArray49[4] & 0xFF) << 8) + ((Static294.aByteArray49[3] & 0xFF) << 16);
				if (local67 < 0 || local67 > this.anInt114) {
					return null;
				} else if (local89 > 0 && this.aClass243_2.method5564() / 520L >= (long) local89) {
					@Pc(129) byte[] local129 = new byte[local67];
					@Pc(131) int local131 = 0;
					@Pc(140) int local140 = 0;
					while (local67 > local131) {
						if (local89 == 0) {
							return null;
						}
						this.aClass243_2.method5568((long) (local89 * 520));
						@Pc(161) int local161 = local67 - local131;
						if (local161 > 512) {
							local161 = 512;
						}
						this.aClass243_2.method5559(local161 + 8, Static294.aByteArray49, 0);
						@Pc(191) int local191 = ((Static294.aByteArray49[0] & 0xFF) << 8) + (Static294.aByteArray49[1] & 0xFF);
						@Pc(205) int local205 = (Static294.aByteArray49[3] & 0xFF) + ((Static294.aByteArray49[2] & 0xFF) << 8);
						@Pc(227) int local227 = ((Static294.aByteArray49[5] & 0xFF) << 8) + (Static294.aByteArray49[4] << 16 & 0xFF0000) + (Static294.aByteArray49[6] & 0xFF);
						@Pc(233) int local233 = Static294.aByteArray49[7] & 0xFF;
						if (arg0 == local191 && local140 == local205 && local233 == this.anInt118) {
							if (local227 >= 0 && (long) local227 <= this.aClass243_2.method5564() / 520L) {
								local140++;
								for (@Pc(291) int local291 = 0; local291 < local161; local291++) {
									local129[local131++] = Static294.aByteArray49[local291 + 8];
								}
								local89 = local227;
								continue;
							}
							return null;
						}
						return null;
					}
					return local129;
				} else {
					return null;
				}
			} catch (@Pc(321) IOException local321) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([BIIIZ)Z")
	private boolean method128(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class243 local8 = this.aClass243_2;
		synchronized (this.aClass243_2) {
			try {
				@Pc(84) int local84;
				if (arg3) {
					if (this.aClass243_3.method5564() < (long) (arg1 * 6 + 6)) {
						return false;
					}
					this.aClass243_3.method5568((long) (arg1 * 6));
					this.aClass243_3.method5559(6, Static294.aByteArray49, 0);
					local84 = (Static294.aByteArray49[5] & 0xFF) + (((Static294.aByteArray49[3] & 0xFF) << 16) + ((Static294.aByteArray49[4] & 0xFF) << 8));
					if (local84 <= 0 || this.aClass243_2.method5564() / 520L < (long) local84) {
						return false;
					}
				} else {
					local84 = (int) ((this.aClass243_2.method5564() + 519L) / 520L);
					if (local84 == 0) {
						local84 = 1;
					}
				}
				Static294.aByteArray49[3] = (byte) (local84 >> 16);
				Static294.aByteArray49[2] = (byte) arg2;
				Static294.aByteArray49[0] = (byte) (arg2 >> 16);
				Static294.aByteArray49[1] = (byte) (arg2 >> 8);
				Static294.aByteArray49[5] = (byte) local84;
				Static294.aByteArray49[4] = (byte) (local84 >> 8);
				this.aClass243_3.method5568((long) (arg1 * 6));
				this.aClass243_3.method5561(0, 6, Static294.aByteArray49);
				@Pc(173) int local173 = 0;
				@Pc(175) int local175 = 0;
				while (true) {
					if (local173 < arg2) {
						label102: {
							@Pc(181) int local181 = 0;
							@Pc(217) int local217;
							if (arg3) {
								this.aClass243_2.method5568((long) (local84 * 520));
								try {
									this.aClass243_2.method5559(8, Static294.aByteArray49, 0);
								} catch (@Pc(201) EOFException local201) {
									break label102;
								}
								local217 = (Static294.aByteArray49[1] & 0xFF) + ((Static294.aByteArray49[0] & 0xFF) << 8);
								@Pc(231) int local231 = (Static294.aByteArray49[3] & 0xFF) + ((Static294.aByteArray49[2] & 0xFF) << 8);
								local181 = (Static294.aByteArray49[6] & 0xFF) + (((Static294.aByteArray49[4] & 0xFF) << 16) + ((Static294.aByteArray49[5] & 0xFF) << 8));
								@Pc(260) int local260 = Static294.aByteArray49[7] & 0xFF;
								if (arg1 != local217 || local175 != local231 || local260 != this.anInt118) {
									return false;
								}
								if (local181 < 0 || this.aClass243_2.method5564() / 520L < (long) local181) {
									return false;
								}
							}
							if (local181 == 0) {
								arg3 = false;
								local181 = (int) ((this.aClass243_2.method5564() + 519L) / 520L);
								if (local181 == 0) {
									local181++;
								}
								if (local181 == local84) {
									local181++;
								}
							}
							if (arg2 - local173 <= 512) {
								local181 = 0;
							}
							Static294.aByteArray49[3] = (byte) local175;
							Static294.aByteArray49[2] = (byte) (local175 >> 8);
							Static294.aByteArray49[1] = (byte) arg1;
							Static294.aByteArray49[0] = (byte) (arg1 >> 8);
							Static294.aByteArray49[4] = (byte) (local181 >> 16);
							Static294.aByteArray49[5] = (byte) (local181 >> 8);
							Static294.aByteArray49[6] = (byte) local181;
							Static294.aByteArray49[7] = (byte) this.anInt118;
							this.aClass243_2.method5568((long) (local84 * 520));
							this.aClass243_2.method5561(0, 8, Static294.aByteArray49);
							local217 = arg2 - local173;
							if (local217 > 512) {
								local217 = 512;
							}
							this.aClass243_2.method5561(local173, local217, arg0);
							local84 = local181;
							local173 += local217;
							local175++;
							continue;
						}
					}
					@Pc(463) boolean local463 = true;
					return true;
				}
			} catch (@Pc(468) IOException local468) {
				return false;
			}
		}
	}
}
