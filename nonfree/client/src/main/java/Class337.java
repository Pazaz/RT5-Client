import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class337 {

	@OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
	private int anInt8643;

	@OriginalMember(owner = "client!sh", name = "G", descriptor = "Lclient!gp;")
	private Class150 aClass150_2;

	@OriginalMember(owner = "client!sh", name = "r", descriptor = "Lclient!hv;")
	public Class8_Sub5 aClass8_Sub5_7;

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "Lclient!ka;")
	private Class114 aClass114_8;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "Lclient!r;")
	private Class2_Sub2_Sub9 aClass2_Sub2_Sub9_6;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "[Z")
	private boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!sh", name = "J", descriptor = "Z")
	private boolean aBoolean659 = false;

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
	private int anInt8652 = 0;

	@OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
	private int anInt8647 = -1;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "Z")
	private boolean aBoolean662 = false;

	@OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
	private int anInt8660 = 0;

	@OriginalMember(owner = "client!sh", name = "x", descriptor = "Z")
	private boolean aBoolean660 = false;

	@OriginalMember(owner = "client!sh", name = "q", descriptor = "B")
	private final byte aByte133;

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
	public final int anInt8663;

	@OriginalMember(owner = "client!sh", name = "F", descriptor = "B")
	private final byte aByte132;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
	public final int anInt8649;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
	public final int anInt8645;

	@OriginalMember(owner = "client!sh", name = "B", descriptor = "Lclient!eo;")
	private final Class8_Sub2 aClass8_Sub2_21;

	@OriginalMember(owner = "client!sh", name = "H", descriptor = "Z")
	private final boolean aBoolean661;

	@OriginalMember(owner = "client!sh", name = "v", descriptor = "Lclient!gu;")
	private final Class152 aClass152_9;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!ha;Lclient!c;IIIILclient!eo;ZI)V")
	public Class337(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8_Sub2 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.aByte133 = (byte) arg5;
		this.anInt8663 = arg3;
		this.aByte132 = (byte) arg4;
		this.aBoolean659 = arg8 != -1;
		this.anInt8649 = arg1.anInt1256;
		this.anInt8645 = arg2;
		this.aClass8_Sub2_21 = arg6;
		this.aBoolean660 = arg7;
		this.aBoolean661 = arg0.method8006() && arg1.aBoolean89 && !this.aBoolean660;
		this.aClass152_9 = new Class152_Sub2(arg6, false);
		this.method7676(1, arg8, false);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!ha;I)V")
	public void method7668(@OriginalArg(0) Class19 arg0) {
		this.method7678(arg0, true, true, true, 262144);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!ha;B)V")
	public void method7669(@OriginalArg(0) Class19 arg0) {
		if (this.aClass2_Sub2_Sub9_6 != null) {
			Static292.method4618(this.aClass2_Sub2_Sub9_6, this.aByte133, this.aClass8_Sub2_21.anInt10690, this.aClass8_Sub2_21.anInt10694, this.aBooleanArray27);
			this.aBooleanArray27 = null;
			this.aClass2_Sub2_Sub9_6 = null;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)I")
	public int method7671() {
		return this.anInt8660;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V")
	public void method7672(@OriginalArg(0) int arg0) {
		this.aBoolean659 = true;
		this.method7676(1, arg0, false);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)I")
	public int method7673(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method7678((Class19) null, false, false, false, 98);
		}
		return this.anInt8652;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)Z")
	public boolean method7675(@OriginalArg(0) int arg0) {
		if (arg0 != 10) {
			this.anInt8660 = 3;
		}
		return this.aBoolean661;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIBZ)V")
	private void method7676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg1;
		@Pc(12) boolean local12 = false;
		if (arg1 == -1) {
			@Pc(21) Class54 local21 = Static354.aClass142_4.method3063(this.anInt8649, 74);
			@Pc(23) Class54 local23 = local21;
			if (local21.anIntArray113 != null) {
				local21 = local21.method1301(13, Static1.anInt10798 == 3 ? Static298.anInterface23_2 : Static34.aClass304_1);
			}
			if (local21 == null) {
				return;
			}
			if (local23 == local21) {
				local23 = null;
			}
			if (local21.method1300()) {
				if (arg2 && this.aClass152_9.method9109() && local21.method1298(this.aClass152_9.method9114())) {
					return;
				}
				if (this.anInt8647 != local21.anInt1256) {
					local12 = local21.aBoolean94;
				}
				local10 = local21.method1307();
				if (local21.method1295()) {
					arg0 = 0;
				} else {
					arg0 = 1;
				}
			} else if (local23 != null && local23.method1300()) {
				if (arg2 && this.aClass152_9.method9109() && local23.method1298(this.aClass152_9.method9114())) {
					return;
				}
				if (this.anInt8647 != local21.anInt1256) {
					local12 = local23.aBoolean94;
				}
				local10 = local23.method1307();
				if (local23.method1295()) {
					arg0 = 0;
				} else {
					arg0 = 1;
				}
			}
		}
		if (local10 == -1) {
			this.aClass152_9.method9104(false, -1, 838828768);
		} else {
			this.aClass152_9.method9092(local10, 0, arg0, local12);
			this.aClass114_8 = null;
			this.aBoolean662 = false;
			this.anInt8643 = Static333.anInt5455;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!ha;ZZZI)Lclient!ka;")
	public Class114 method7678(@OriginalArg(0) Class19 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(11) Class54 local11 = Static354.aClass142_4.method3063(this.anInt8649, 119);
		if (local11.anIntArray113 != null) {
			local11 = local11.method1301(13, Static1.anInt10798 == 3 ? Static298.anInterface23_2 : Static34.aClass304_1);
		}
		if (local11 == null) {
			this.method7669(arg0);
			this.anInt8647 = -1;
			return null;
		}
		if (!this.aBoolean659 && this.anInt8647 != local11.anInt1256) {
			this.method7676(0, -1, true);
			this.aClass114_8 = null;
			this.aBoolean662 = false;
		}
		this.method7680(this.aClass8_Sub2_21, arg2);
		if (arg3) {
			arg3 &= this.aBoolean661 & !this.aBoolean662 & Static400.aClass2_Sub34_28.aClass57_Sub12_1.method4364() != 0;
		}
		if (arg1 && !arg3) {
			this.anInt8647 = local11.anInt1256;
			return null;
		}
		if (arg3) {
			Static292.method4618(this.aClass2_Sub2_Sub9_6, this.aByte133, this.aClass8_Sub2_21.anInt10690, this.aClass8_Sub2_21.anInt10694, this.aBooleanArray27);
			this.aBoolean662 = false;
		}
		@Pc(142) Class178 local142 = Static246.aClass178Array1[this.aByte133];
		@Pc(163) Class178 local163;
		if (this.aBoolean660) {
			local163 = Static706.aClass178Array3[0];
		} else {
			local163 = this.aByte133 >= 3 ? null : Static246.aClass178Array1[this.aByte133 + 1];
		}
		@Pc(171) Class114 local171 = null;
		if (this.aClass152_9.method9109()) {
			if (arg3) {
				arg4 |= 0x40000;
			}
			local171 = local11.method1311(this.anInt8645 == 11 ? this.anInt8663 + 4 : this.anInt8663, this.aClass8_Sub2_21.anInt10694, this.anInt8645 == 11 ? 10 : this.anInt8645, this.aClass8_Sub2_21.anInt10690, local163, this.aClass152_9, arg0, local142, this.aClass150_2, arg4, local142.method7878(this.aClass8_Sub2_21.anInt10694, this.aClass8_Sub2_21.anInt10690));
			if (local171 == null) {
				this.aBooleanArray27 = null;
				this.aClass2_Sub2_Sub9_6 = null;
				this.anInt8652 = 0;
				this.anInt8660 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray27 == null) {
						this.aBooleanArray27 = new boolean[4];
					}
					this.aClass2_Sub2_Sub9_6 = local171.ba(this.aClass2_Sub2_Sub9_6);
					Static630.method8357(this.aClass2_Sub2_Sub9_6, this.aByte133, this.aClass8_Sub2_21.anInt10690, this.aClass8_Sub2_21.anInt10694, this.aBooleanArray27);
					this.aBoolean662 = true;
				}
				this.anInt8660 = local171.fa();
				this.anInt8652 = local171.ma();
			}
			this.aClass114_8 = null;
		} else if (this.aClass114_8 != null && (arg4 & this.aClass114_8.ua()) == arg4 && local11.anInt1256 == this.anInt8647) {
			local171 = this.aClass114_8;
		} else {
			if (this.aClass114_8 != null) {
				arg4 |= this.aClass114_8.ua();
			}
			@Pc(389) Class272 local389 = local11.method1309(this.anInt8645 == 11 ? this.anInt8663 + 4 : this.anInt8663, this.aClass8_Sub2_21.anInt10694, this.aClass8_Sub2_21.anInt10690, local142, arg3, local142.method7878(this.aClass8_Sub2_21.anInt10694, this.aClass8_Sub2_21.anInt10690), this.anInt8645 == 11 ? 10 : this.anInt8645, arg0, this.aClass150_2, arg4, local163);
			if (local389 == null) {
				this.anInt8652 = 0;
				this.aBooleanArray27 = null;
				this.anInt8660 = 0;
				this.aClass2_Sub2_Sub9_6 = null;
				this.aClass114_8 = null;
			} else {
				local171 = local389.aClass114_7;
				this.aClass114_8 = local389.aClass114_7;
				if (arg3) {
					this.aClass2_Sub2_Sub9_6 = local389.aClass2_Sub2_Sub9_5;
					this.aBooleanArray27 = null;
					Static630.method8357(this.aClass2_Sub2_Sub9_6, this.aByte133, this.aClass8_Sub2_21.anInt10690, this.aClass8_Sub2_21.anInt10694, (boolean[]) null);
					this.aBoolean662 = true;
				}
				this.anInt8660 = local171.fa();
				this.anInt8652 = local171.ma();
			}
		}
		this.anInt8647 = local11.anInt1256;
		return local171;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!gp;I)V")
	public void method7679(@OriginalArg(0) Class150 arg0) {
		this.aClass150_2 = arg0;
		this.aClass114_8 = null;
	}

	@OriginalMember(owner = "client!sh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass8_Sub5_7 != null) {
			this.aClass8_Sub5_7.method3644();
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!eo;Z)V")
	private void method7680(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aClass152_9.method9109()) {
			this.method7676(0, -1, false);
		} else if (this.aClass152_9.method9112(Static333.anInt5455 - this.anInt8643)) {
			if (Static400.aClass2_Sub34_28.aClass57_Sub12_1.method4364() == 2) {
				this.aBoolean662 = false;
			}
			if (this.aClass152_9.method9102()) {
				this.aClass152_9.method9113(arg1, -1);
				this.aBoolean659 = false;
				this.method7676(0, -1, false);
			}
		}
		if (arg1) {
			this.anInt8643 = Static333.anInt5455;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!ka;ZILclient!ha;IIILclient!tt;)V")
	public void method7681(@OriginalArg(0) int arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class19 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class73 arg8) {
		if (arg3 != -9827) {
			return;
		}
		@Pc(11) Class328[] local11 = arg1.method7482();
		@Pc(14) Class249[] local14 = arg1.method7480();
		if ((this.aClass8_Sub5_7 == null || this.aClass8_Sub5_7.aBoolean324) && (local11 != null || local14 != null)) {
			@Pc(37) Class54 local37 = Static354.aClass142_4.method3063(this.anInt8649, 115);
			if (local37.anIntArray113 != null) {
				local37 = local37.method1301(arg3 + 9840, Static1.anInt10798 == 3 ? Static298.anInterface23_2 : Static34.aClass304_1);
			}
			if (local37 != null) {
				this.aClass8_Sub5_7 = Static257.method3654(Static333.anInt5455, true);
			}
		}
		if (this.aClass8_Sub5_7 == null) {
			return;
		}
		arg1.method7476(arg8);
		if (arg2) {
			this.aClass8_Sub5_7.method3643(arg4, (long) Static333.anInt5455, local11, local14);
		} else {
			this.aClass8_Sub5_7.method3649((long) Static333.anInt5455);
		}
		this.aClass8_Sub5_7.method3658(this.aByte132, arg6, arg5, arg7, arg0);
	}
}
