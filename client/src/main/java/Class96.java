import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class96 {

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Lclient!r;")
	private Class167 aClass167_2 = null;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Lclient!r;")
	private Class167 aClass167_3 = null;

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
	private int anInt3410 = 65000;

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
	private final int anInt3413;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(ILclient!r;Lclient!r;I)V")
	public Class96(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(2) Class167 arg2, @OriginalArg(3) int arg3) {
		this.anInt3410 = arg3;
		this.aClass167_3 = arg1;
		this.anInt3413 = arg0;
		this.aClass167_2 = arg2;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[BI)Z")
	public boolean method3042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(6) Class167 local6 = this.aClass167_3;
		synchronized (this.aClass167_3) {
			if (arg1 < 0 || this.anInt3410 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(33) boolean local33 = this.method3044(arg2, true, arg0, arg1);
			if (!local33) {
				local33 = this.method3044(arg2, false, arg0, arg1);
			}
			return local33;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BBZII)Z")
	private boolean method3044(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class167 local8 = this.aClass167_3;
		synchronized (this.aClass167_3) {
			try {
				@Pc(22) int local22;
				if (arg1) {
					if (this.aClass167_2.method4764() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass167_2.method4761((long) (arg2 * 6));
					this.aClass167_2.method4767(Static21.aByteArray3, 0, 6);
					local22 = ((Static21.aByteArray3[4] & 0xFF) << 8) + (((Static21.aByteArray3[3] & 0xFF) << 16) + (Static21.aByteArray3[5] & 0xFF));
					if (local22 <= 0 || (long) local22 > this.aClass167_3.method4764() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass167_3.method4764() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static21.aByteArray3[2] = (byte) arg3;
				Static21.aByteArray3[0] = (byte) (arg3 >> 16);
				Static21.aByteArray3[3] = (byte) (local22 >> 16);
				Static21.aByteArray3[1] = (byte) (arg3 >> 8);
				Static21.aByteArray3[5] = (byte) local22;
				Static21.aByteArray3[4] = (byte) (local22 >> 8);
				this.aClass167_2.method4761((long) (arg2 * 6));
				this.aClass167_2.method4768(Static21.aByteArray3, 6, 0);
				@Pc(166) int local166 = 0;
				@Pc(168) int local168 = 0;
				while (local166 < arg3) {
					@Pc(172) int local172 = 0;
					@Pc(207) int local207;
					if (arg1) {
						this.aClass167_3.method4761((long) (local22 * 520));
						try {
							this.aClass167_3.method4767(Static21.aByteArray3, 0, 8);
						} catch (@Pc(191) EOFException local191) {
							return true;
						}
						local207 = ((Static21.aByteArray3[0] & 0xFF) << 8) + (Static21.aByteArray3[1] & 0xFF);
						local172 = ((Static21.aByteArray3[4] & 0xFF) << 16) + (((Static21.aByteArray3[5] & 0xFF) << 8) + (Static21.aByteArray3[6] & 0xFF));
						@Pc(244) int local244 = (Static21.aByteArray3[3] & 0xFF) + ((Static21.aByteArray3[2] & 0xFF) << 8);
						@Pc(250) int local250 = Static21.aByteArray3[7] & 0xFF;
						if (arg2 != local207 || local244 != local168 || this.anInt3413 != local250) {
							return false;
						}
						if (local172 < 0 || this.aClass167_3.method4764() / 520L < (long) local172) {
							return false;
						}
					}
					if (local172 == 0) {
						local172 = (int) ((this.aClass167_3.method4764() + 519L) / 520L);
						arg1 = false;
						if (local172 == 0) {
							local172++;
						}
						if (local22 == local172) {
							local172++;
						}
					}
					Static21.aByteArray3[2] = (byte) (local168 >> 8);
					if (arg3 - local166 <= 512) {
						local172 = 0;
					}
					Static21.aByteArray3[1] = (byte) arg2;
					Static21.aByteArray3[3] = (byte) local168;
					Static21.aByteArray3[0] = (byte) (arg2 >> 8);
					Static21.aByteArray3[6] = (byte) local172;
					Static21.aByteArray3[7] = (byte) this.anInt3413;
					Static21.aByteArray3[5] = (byte) (local172 >> 8);
					Static21.aByteArray3[4] = (byte) (local172 >> 16);
					this.aClass167_3.method4761((long) (local22 * 520));
					this.aClass167_3.method4768(Static21.aByteArray3, 8, 0);
					local207 = arg3 - local166;
					if (local207 > 512) {
						local207 = 512;
					}
					this.aClass167_3.method4768(arg0, local207, local166);
					local166 += local207;
					local168++;
					local22 = local172;
				}
				return true;
			} catch (@Pc(433) IOException local433) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(BI)[B")
	public byte[] method3045(@OriginalArg(1) int arg0) {
		@Pc(8) Class167 local8 = this.aClass167_3;
		synchronized (this.aClass167_3) {
			try {
				if (this.aClass167_2.method4764() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass167_2.method4761((long) (arg0 * 6));
				this.aClass167_2.method4767(Static21.aByteArray3, 0, 6);
				@Pc(80) int local80 = ((Static21.aByteArray3[0] & 0xFF) << 16) + ((Static21.aByteArray3[1] & 0xFF) << 8) + (Static21.aByteArray3[2] & 0xFF);
				@Pc(102) int local102 = (Static21.aByteArray3[5] & 0xFF) + ((Static21.aByteArray3[4] & 0xFF) << 8) + ((Static21.aByteArray3[3] & 0xFF) << 16);
				if (local80 < 0 || local80 > this.anInt3410) {
					return null;
				} else if (local102 > 0 && (long) local102 <= this.aClass167_3.method4764() / 520L) {
					@Pc(144) byte[] local144 = new byte[local80];
					@Pc(146) int local146 = 0;
					@Pc(148) int local148 = 0;
					label55: while (local146 < local80) {
						if (local102 == 0) {
							return null;
						}
						this.aClass167_3.method4761((long) (local102 * 520));
						@Pc(174) int local174 = local80 - local146;
						if (local174 > 512) {
							local174 = 512;
						}
						this.aClass167_3.method4767(Static21.aByteArray3, 0, local174 + 8);
						@Pc(202) int local202 = ((Static21.aByteArray3[0] & 0xFF) << 8) + (Static21.aByteArray3[1] & 0xFF);
						@Pc(216) int local216 = (Static21.aByteArray3[3] & 0xFF) + ((Static21.aByteArray3[2] & 0xFF) << 8);
						@Pc(238) int local238 = (Static21.aByteArray3[6] & 0xFF) + ((Static21.aByteArray3[5] & 0xFF) << 8) + ((Static21.aByteArray3[4] & 0xFF) << 16);
						@Pc(244) int local244 = Static21.aByteArray3[7] & 0xFF;
						if (local202 == arg0 && local148 == local216 && local244 == this.anInt3413) {
							if (local238 >= 0 && this.aClass167_3.method4764() / 520L >= (long) local238) {
								local148++;
								local102 = local238;
								@Pc(302) int local302 = 0;
								while (true) {
									if (local174 <= local302) {
										continue label55;
									}
									local144[local146++] = Static21.aByteArray3[local302 + 8];
									local302++;
								}
							}
							return null;
						}
						return null;
					}
					return local144;
				} else {
					return null;
				}
			} catch (@Pc(335) IOException local335) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt3413;
	}
}
