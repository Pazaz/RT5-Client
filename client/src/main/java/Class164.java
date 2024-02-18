import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class164 {

	@OriginalMember(owner = "client!hi", name = "O", descriptor = "B")
	public byte aByte65;

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
	public int anInt3939;

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "Lclient!av;")
	private Class28 aClass28_19;

	@OriginalMember(owner = "client!hi", name = "J", descriptor = "[I")
	public int[] anIntArray308;

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "B")
	public byte aByte66;

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
	public int anInt3941;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray18;

	@OriginalMember(owner = "client!hi", name = "Q", descriptor = "Z")
	private boolean aBoolean306;

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "J")
	public long aLong125;

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "B")
	public byte aByte67;

	@OriginalMember(owner = "client!hi", name = "D", descriptor = "Z")
	public boolean aBoolean307;

	@OriginalMember(owner = "client!hi", name = "N", descriptor = "B")
	public byte aByte68;

	@OriginalMember(owner = "client!hi", name = "z", descriptor = "[J")
	private long[] aLongArray7;

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "[I")
	private int[] anIntArray309;

	@OriginalMember(owner = "client!hi", name = "P", descriptor = "Z")
	private boolean aBoolean308;

	@OriginalMember(owner = "client!hi", name = "B", descriptor = "[J")
	private long[] aLongArray8;

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray19;

	@OriginalMember(owner = "client!hi", name = "K", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!hi", name = "V", descriptor = "[I")
	private int[] anIntArray310;

	@OriginalMember(owner = "client!hi", name = "X", descriptor = "I")
	public int anInt3947 = -1;

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
	public int anInt3950 = 0;

	@OriginalMember(owner = "client!hi", name = "R", descriptor = "I")
	private int anInt3944 = 0;

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "Ljava/lang/String;")
	public String aString45 = null;

	@OriginalMember(owner = "client!hi", name = "M", descriptor = "I")
	public int anInt3956 = -1;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class164(@OriginalArg(0) Class2_Sub21 arg0) {
		this.method3494(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	private Class164() {
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(IIIII)I")
	public int method3475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15 = (0x1 << arg3) - 1;
		@Pc(31) int local31 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
		@Pc(35) int local35 = local15 ^ local31;
		@Pc(39) int local39 = arg0 << arg3;
		@Pc(43) int local43 = local39 & local35;
		@Pc(48) int local48 = this.anIntArray309[arg1];
		if (local43 == (local35 & local48)) {
			return -1;
		} else {
			local48 &= ~local35;
			this.anIntArray309[arg1] = local48 | local43;
			return arg1;
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(BI)V")
	private void method3476(@OriginalArg(1) int arg0) {
		if (this.aBoolean308) {
			if (this.aLongArray8 == null) {
				this.aLongArray8 = new long[arg0];
			} else {
				Static734.method7693(this.aLongArray8, 0, this.aLongArray8 = new long[arg0], 0, this.anInt3939);
			}
		}
		if (this.aBoolean306) {
			if (this.aStringArray18 == null) {
				this.aStringArray18 = new String[arg0];
			} else {
				Static734.method7691(this.aStringArray18, 0, this.aStringArray18 = new String[arg0], 0, this.anInt3939);
			}
		}
		if (this.aByteArray40 == null) {
			this.aByteArray40 = new byte[arg0];
		} else {
			Static734.method7694(this.aByteArray40, 0, this.aByteArray40 = new byte[arg0], 0, this.anInt3939);
		}
		if (this.anIntArray309 == null) {
			this.anIntArray309 = new int[arg0];
		} else {
			Static734.method7695(this.anIntArray309, 0, this.anIntArray309 = new int[arg0], 0, this.anInt3939);
		}
		if (this.anIntArray308 == null) {
			this.anIntArray308 = new int[arg0];
		} else {
			Static734.method7695(this.anIntArray308, 0, this.anIntArray308 = new int[arg0], 0, this.anInt3939);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/lang/String;JI)V")
	public void method3477(@OriginalArg(1) String arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		if (arg0 != null && arg0.length() == 0) {
			arg0 = null;
		}
		if (this.aBoolean308 != arg1 > 0L) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean308 + " but userhash:" + arg1);
		} else if (this.aBoolean306 == (arg0 == null)) {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean306 + " but displayname:" + arg0);
		} else {
			if (arg1 > 0L && (this.aLongArray8 == null || this.anInt3939 >= this.aLongArray8.length) || arg0 != null && (this.aStringArray18 == null || this.aStringArray18.length <= this.anInt3939)) {
				this.method3476(this.anInt3939 + 5);
			}
			if (this.aLongArray8 != null) {
				this.aLongArray8[this.anInt3939] = arg1;
			}
			if (this.aStringArray18 != null) {
				this.aStringArray18[this.anInt3939] = arg0;
			}
			if (this.anInt3956 == -1) {
				this.anInt3956 = this.anInt3939;
				this.aByteArray40[this.anInt3939] = 126;
			} else {
				this.aByteArray40[this.anInt3939] = 0;
			}
			this.anIntArray309[this.anInt3939] = 0;
			this.anIntArray308[this.anInt3939] = arg2;
			this.anIntArray310 = null;
			this.anInt3939++;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)Ljava/lang/Long;")
	public Long method3478(@OriginalArg(1) int arg0) {
		if (this.aClass28_19 == null) {
			return null;
		} else {
			@Pc(16) Class2 local16 = this.aClass28_19.method738((long) arg0);
			return local16 != null && local16 instanceof Class2_Sub48 ? Long.valueOf(((Class2_Sub48) local16).aLong264) : null;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method3479(@OriginalArg(0) String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt3939; local18++) {
			if (this.aStringArray18[local18].equals(arg0)) {
				return local18;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;IZ)Z")
	public boolean method3481(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			arg0 = "";
		} else if (arg0.length() > 80) {
			arg0 = arg0.substring(0, 80);
		}
		if (this.aClass28_19 == null) {
			this.aClass28_19 = new Class28(4);
		} else {
			@Pc(32) Class2 local32 = this.aClass28_19.method738((long) arg1);
			if (local32 != null) {
				if (local32 instanceof Class2_Sub24) {
					@Pc(42) Class2_Sub24 local42 = (Class2_Sub24) local32;
					if (local42.aString46.equals(arg0)) {
						return false;
					}
					local42.aString46 = arg0;
					return true;
				}
				local32.method9457();
			}
		}
		this.aClass28_19.method735((long) arg1, new Class2_Sub24(arg0));
		return true;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
	private void method3482() {
		if (this.anInt3939 == 0) {
			this.anInt3947 = -1;
			this.anInt3956 = -1;
			return;
		}
		this.anInt3947 = -1;
		this.anInt3956 = -1;
		@Pc(32) int local32 = 0;
		@Pc(37) byte local37 = this.aByteArray40[0];
		for (@Pc(39) int local39 = 1; local39 < this.anInt3939; local39++) {
			if (local37 < this.aByteArray40[local39]) {
				if (local37 == 125) {
					this.anInt3947 = local32;
				}
				local32 = local39;
				local37 = this.aByteArray40[local39];
			} else if (this.anInt3947 == -1 && this.aByteArray40[local39] == 125) {
				this.anInt3947 = local39;
			}
		}
		this.anInt3956 = local32;
		if (this.anInt3956 != -1) {
			this.aByteArray40[this.anInt3956] = 126;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method3484(@OriginalArg(1) int arg0) {
		if (this.aClass28_19 == null) {
			return null;
		} else {
			@Pc(24) Class2 local24 = this.aClass28_19.method738((long) arg0);
			return local24 != null && local24 instanceof Class2_Sub24 ? ((Class2_Sub24) local24).aString46 : null;
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)V")
	public void method3485(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || this.anInt3939 <= arg0) {
			throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg0 + " memberCount:" + this.anInt3939);
		}
		this.anInt3939--;
		this.anIntArray310 = null;
		if (this.anInt3939 == 0) {
			this.anIntArray309 = null;
			this.aStringArray18 = null;
			this.aByteArray40 = null;
			this.anInt3947 = -1;
			this.aLongArray8 = null;
			this.anIntArray308 = null;
			this.anInt3956 = -1;
			return;
		}
		Static734.method7694(this.aByteArray40, arg0 + 1, this.aByteArray40, arg0, this.anInt3939 - arg0);
		Static734.method7695(this.anIntArray309, arg0 + 1, this.anIntArray309, arg0, this.anInt3939 - arg0);
		Static734.method7695(this.anIntArray308, arg0 + 1, this.anIntArray308, arg0, this.anInt3939 - arg0);
		if (this.aLongArray8 != null) {
			Static734.method7693(this.aLongArray8, arg0 + 1, this.aLongArray8, arg0, this.anInt3939 - arg0);
		}
		if (this.aStringArray18 != null) {
			Static734.method7691(this.aStringArray18, arg0 + 1, this.aStringArray18, arg0, this.anInt3939 - arg0);
		}
		if (this.anInt3956 == arg0 || this.anInt3947 == arg0) {
			this.method3482();
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;JI)V")
	public void method3486(@OriginalArg(0) String arg0, @OriginalArg(1) long arg1) {
		if (arg0 != null && arg0.length() == 0) {
			arg0 = null;
		}
		if (arg1 > 0L != this.aBoolean308) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.aBoolean308 + " but userhash:" + arg1);
		} else if (this.aBoolean306 == (arg0 == null)) {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.aBoolean306 + " but displayname:" + arg0);
		} else {
			if (arg1 > 0L && (this.aLongArray7 == null || this.aLongArray7.length <= this.anInt3941) || arg0 != null && (this.aStringArray19 == null || this.anInt3941 >= this.aStringArray19.length)) {
				this.method3492(this.anInt3941 + 5);
			}
			if (this.aLongArray7 != null) {
				this.aLongArray7[this.anInt3941] = arg1;
			}
			if (this.aStringArray19 != null) {
				this.aStringArray19[this.anInt3941] = arg0;
			}
			this.anInt3941++;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)[I")
	public int[] method3487() {
		if (this.anIntArray310 == null) {
			@Pc(14) String[] local14 = new String[this.anInt3939];
			this.anIntArray310 = new int[this.anInt3939];
			@Pc(21) int local21 = 0;
			while (this.anInt3939 > local21) {
				local14[local21] = this.aStringArray18[local21];
				this.anIntArray310[local21] = local21++;
			}
			Static351.method5137(this.anIntArray310, local14);
		}
		return this.anIntArray310;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BIJ)Z")
	public boolean method3488(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		if (this.aClass28_19 == null) {
			this.aClass28_19 = new Class28(4);
		} else {
			@Pc(29) Class2 local29 = this.aClass28_19.method738((long) arg0);
			if (local29 != null) {
				if (local29 instanceof Class2_Sub48) {
					@Pc(39) Class2_Sub48 local39 = (Class2_Sub48) local29;
					if (local39.aLong264 == arg1) {
						return false;
					}
					local39.aLong264 = arg1;
					return true;
				}
				local29.method9457();
			}
		}
		this.aClass28_19.method735((long) arg0, new Class2_Sub48(arg1));
		return true;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BBI)I")
	public int method3489(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 126 || arg0 == 127) {
			return -1;
		} else if (this.anInt3956 == arg1 && (this.anInt3947 == -1 || this.aByteArray40[this.anInt3947] < 125)) {
			return -1;
		} else if (arg0 == this.aByteArray40[arg1]) {
			return -1;
		} else {
			this.aByteArray40[arg1] = arg0;
			this.method3482();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(II)Ljava/lang/Integer;")
	public Integer method3490(@OriginalArg(0) int arg0) {
		if (this.aClass28_19 == null) {
			return null;
		} else {
			@Pc(24) Class2 local24 = this.aClass28_19.method738((long) arg0);
			return local24 != null && local24 instanceof Class2_Sub38 ? Integer.valueOf(((Class2_Sub38) local24).anInt6379) : null;
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(IB)V")
	public void method3491(@OriginalArg(0) int arg0) {
		this.anInt3941--;
		if (this.anInt3941 == 0) {
			this.aStringArray19 = null;
			this.aLongArray7 = null;
			return;
		}
		if (this.aLongArray7 != null) {
			Static734.method7693(this.aLongArray7, arg0 + 1, this.aLongArray7, arg0, this.anInt3941 - arg0);
		}
		if (this.aStringArray19 != null) {
			Static734.method7691(this.aStringArray19, arg0 + 1, this.aStringArray19, arg0, this.anInt3941 - arg0);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)V")
	private void method3492(@OriginalArg(0) int arg0) {
		if (this.aBoolean308) {
			if (this.aLongArray7 == null) {
				this.aLongArray7 = new long[arg0];
			} else {
				Static734.method7693(this.aLongArray7, 0, this.aLongArray7 = new long[arg0], 0, this.anInt3941);
			}
		}
		if (!this.aBoolean306) {
			return;
		}
		if (this.aStringArray19 == null) {
			this.aStringArray19 = new String[arg0];
		} else {
			Static734.method7691(this.aStringArray19, 0, this.aStringArray19 = new String[arg0], 0, this.anInt3941);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)Z")
	public boolean method3493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9 = (0x1 << arg1) - 1;
		@Pc(23) int local23 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
		@Pc(35) int local35 = local9 ^ local23;
		@Pc(39) int local39 = arg2 << arg1;
		@Pc(43) int local43 = local39 & local35;
		if (this.aClass28_19 == null) {
			this.aClass28_19 = new Class28(4);
		} else {
			@Pc(63) Class2 local63 = this.aClass28_19.method738((long) arg3);
			if (local63 != null) {
				if (local63 instanceof Class2_Sub38) {
					@Pc(73) Class2_Sub38 local73 = (Class2_Sub38) local63;
					if ((local35 & local73.anInt6379) == local43) {
						return false;
					}
					local73.anInt6379 &= ~local35;
					local73.anInt6379 |= local43;
					return true;
				}
				local63.method9457();
			}
		}
		this.aClass28_19.method735((long) arg3, new Class2_Sub38(local43));
		return true;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!ge;)V")
	private void method3494(@OriginalArg(1) Class2_Sub21 arg0) {
		@Pc(9) int local9 = arg0.method7396();
		if (local9 < 1 || local9 > 5) {
			throw new RuntimeException("Unsupported ClanSettings version: " + local9);
		}
		@Pc(37) int local37 = arg0.method7396();
		if ((local37 & 0x2) != 0) {
			this.aBoolean306 = true;
		}
		if ((local37 & 0x1) != 0) {
			this.aBoolean308 = true;
		}
		if (!this.aBoolean306) {
			this.aStringArray18 = null;
			this.aStringArray19 = null;
		}
		if (!this.aBoolean308) {
			this.aLongArray7 = null;
			this.aLongArray8 = null;
		}
		this.anInt3950 = arg0.method7349();
		this.anInt3944 = arg0.method7349();
		if (local9 <= 3 && this.anInt3944 != 0) {
			this.anInt3944 += 16912800;
		}
		this.anInt3939 = arg0.method7382();
		this.anInt3941 = arg0.method7396();
		this.aString45 = arg0.method7358();
		if (local9 >= 4) {
			arg0.method7349();
		}
		this.aBoolean307 = arg0.method7396() == 1;
		this.aByte68 = arg0.method7377();
		this.aByte67 = arg0.method7377();
		this.aByte66 = arg0.method7377();
		this.aByte65 = arg0.method7377();
		@Pc(282) int local282;
		if (this.anInt3939 > 0) {
			if (this.aBoolean308 && (this.aLongArray8 == null || this.aLongArray8.length < this.anInt3939)) {
				this.aLongArray8 = new long[this.anInt3939];
			}
			if (this.aBoolean306 && (this.aStringArray18 == null || this.anInt3939 > this.aStringArray18.length)) {
				this.aStringArray18 = new String[this.anInt3939];
			}
			if (this.aByteArray40 == null || this.aByteArray40.length < this.anInt3939) {
				this.aByteArray40 = new byte[this.anInt3939];
			}
			if (this.anIntArray309 == null || this.anInt3939 > this.anIntArray309.length) {
				this.anIntArray309 = new int[this.anInt3939];
			}
			if (this.anIntArray308 == null || this.anInt3939 > this.anIntArray308.length) {
				this.anIntArray308 = new int[this.anInt3939];
			}
			for (local282 = 0; local282 < this.anInt3939; local282++) {
				if (this.aBoolean308) {
					this.aLongArray8[local282] = arg0.method7398();
				}
				if (this.aBoolean306) {
					this.aStringArray18[local282] = arg0.method7403();
				}
				this.aByteArray40[local282] = arg0.method7377();
				if (local9 >= 2) {
					this.anIntArray309[local282] = arg0.method7349();
				}
				if (local9 >= 5) {
					this.anIntArray308[local282] = arg0.method7382();
				} else {
					this.anIntArray308[local282] = 0;
				}
			}
			this.method3482();
		}
		if (this.anInt3941 > 0) {
			if (this.aBoolean308 && (this.aLongArray7 == null || this.aLongArray7.length < this.anInt3941)) {
				this.aLongArray7 = new long[this.anInt3941];
			}
			if (this.aBoolean306 && (this.aStringArray19 == null || this.aStringArray19.length < this.anInt3941)) {
				this.aStringArray19 = new String[this.anInt3941];
			}
			for (local282 = 0; local282 < this.anInt3941; local282++) {
				if (this.aBoolean308) {
					this.aLongArray7[local282] = arg0.method7398();
				}
				if (this.aBoolean306) {
					this.aStringArray19[local282] = arg0.method7403();
				}
			}
		}
		if (local9 < 3) {
			return;
		}
		local282 = arg0.method7382();
		if (local282 <= 0) {
			return;
		}
		this.aClass28_19 = new Class28(local282 >= 16 ? 16 : Static440.method5962(local282));
		while (local282-- > 0) {
			@Pc(493) int local493 = arg0.method7349();
			@Pc(497) int local497 = local493 & 0x3FFFFFFF;
			@Pc(501) int local501 = local493 >>> 30;
			if (local501 == 0) {
				@Pc(510) int local510 = arg0.method7349();
				this.aClass28_19.method735((long) local497, new Class2_Sub38(local510));
			} else if (local501 == 1) {
				@Pc(533) long local533 = arg0.method7398();
				this.aClass28_19.method735((long) local497, new Class2_Sub48(local533));
			} else if (local501 == 2) {
				@Pc(556) String local556 = arg0.method7358();
				this.aClass28_19.method735((long) local497, new Class2_Sub24(local556));
			}
		}
		return;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BIII)Ljava/lang/Integer;")
	public Integer method3495(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass28_19 == null) {
			return null;
		}
		@Pc(16) Class2 local16 = this.aClass28_19.method738((long) arg0);
		if (local16 != null && local16 instanceof Class2_Sub38) {
			@Pc(50) int local50 = arg1 == 31 ? -1 : (0x1 << arg1 + 1) - 1;
			return Integer.valueOf((((Class2_Sub38) local16).anInt6379 & local50) >>> arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)I")
	public int method3497(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(27) int local27 = arg1 == 31 ? -1 : (0x1 << arg1 + 1) - 1;
		return (local27 & this.anIntArray309[arg2]) >>> arg0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)Z")
	public boolean method3498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass28_19 == null) {
			this.aClass28_19 = new Class28(4);
		} else {
			@Pc(35) Class2 local35 = this.aClass28_19.method738((long) arg1);
			if (local35 != null) {
				if (local35 instanceof Class2_Sub38) {
					@Pc(45) Class2_Sub38 local45 = (Class2_Sub38) local35;
					if (local45.anInt6379 == arg0) {
						return false;
					}
					local45.anInt6379 = arg0;
					return true;
				}
				local35.method9457();
			}
		}
		this.aClass28_19.method735((long) arg1, new Class2_Sub38(arg0));
		return true;
	}
}
