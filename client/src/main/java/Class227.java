import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class227 {

	@OriginalMember(owner = "client!u", name = "b", descriptor = "Z")
	public boolean aBoolean432 = true;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "I")
	private int anInt6399 = -1;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "I")
	private final int anInt6400;

	@OriginalMember(owner = "client!u", name = "h", descriptor = "Lclient!ic;")
	private final Class100 aClass100_2;

	@OriginalMember(owner = "client!u", name = "g", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_36;

	@OriginalMember(owner = "client!u", name = "i", descriptor = "I")
	private final int anInt6401;

	@OriginalMember(owner = "client!u", name = "j", descriptor = "I")
	private final int anInt6402;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Lclient!al;")
	private Class8_Sub1 aClass8_Sub1_5;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Lclient!fd;")
	private Interface4 anInterface4_5;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!ve;")
	private Class180_Sub2 aClass180_Sub2_2;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!bf;Lclient!ic;Lclient!ah;IIIII)V")
	public Class227(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) Class6_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt6400 = arg6;
		this.aClass100_2 = arg1;
		this.aClass19_Sub1_36 = arg0;
		this.anInt6401 = arg7;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(48) int local48;
		@Pc(50) int local50;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local48 = (local33 + local35) * arg2.anInt6320 + local29;
			for (local50 = 0; local50 < local23; local50++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray1[local48++];
				if (local59 != null) {
					local25 += local59.length;
				}
			}
		}
		this.anInt6402 = local25;
		if (local25 <= 0) {
			this.aClass8_Sub1_5 = null;
		} else {
			@Pc(91) Class2_Sub4 local91 = new Class2_Sub4(local25 * 2);
			@Pc(126) short[] local126;
			@Pc(131) int local131;
			@Pc(117) int local117;
			if (this.aClass19_Sub1_36.aBoolean53) {
				for (local48 = 0; local48 < local23; local48++) {
					local50 = arg2.anInt6320 * (local33 + local48) + local29;
					for (local117 = 0; local117 < local23; local117++) {
						local126 = arg2.aShortArrayArray1[local50++];
						if (local126 != null) {
							for (local131 = 0; local131 < local126.length; local131++) {
								local91.method4843(local126[local131] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local48 = 0; local48 < local23; local48++) {
					local50 = (local33 + local48) * arg2.anInt6320 + local29;
					for (local117 = 0; local117 < local23; local117++) {
						local126 = arg2.aShortArrayArray1[local50++];
						if (local126 != null) {
							for (local131 = 0; local131 < local126.length; local131++) {
								local91.method4845(local126[local131] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface4_5 = this.aClass19_Sub1_36.method839(local91.aByteArray73, local91.anInt5300, false);
			this.aClass180_Sub2_2 = new Class180_Sub2(this.aClass19_Sub1_36, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public void method5787() {
		this.method5788(this.anInterface4_5, this.anInt6402);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!fd;I)V")
	private void method5788(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method5790();
			this.aClass19_Sub1_36.method848(this.aClass8_Sub1_5);
			this.aClass19_Sub1_36.method811(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([BIII)V")
	public void method5789(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.aClass180_Sub2_2.method6067(arg0, this.aClass19_Sub1_36.method798(5123) * arg1);
		this.method5788(this.aClass180_Sub2_2, arg1);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	private void method5790() {
		if (!this.aBoolean432) {
			return;
		}
		this.aBoolean432 = false;
		@Pc(11) byte[] local11 = this.aClass100_2.aByteArray28;
		@Pc(13) byte[] local13 = Static345.aByteArray93;
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = this.aClass100_2.anInt2684;
		@Pc(30) int local30 = this.anInt6400 + this.aClass100_2.anInt2684 * this.anInt6401;
		@Pc(32) int local32;
		@Pc(43) int local43;
		for (local32 = -128; local32 < 0; local32++) {
			local15 = (local15 << 8) - local15;
			for (local43 = -128; local43 < 0; local43++) {
				if (local11[local30++] != 0) {
					local15++;
				}
			}
			local30 += local19 - 128;
		}
		if (this.aClass8_Sub1_5 != null && this.anInt6399 == local15) {
			this.aBoolean432 = false;
			return;
		}
		this.anInt6399 = local15;
		local30 = this.anInt6401 * local19 + this.anInt6400;
		local32 = 0;
		for (local43 = -128; local43 < 0; local43++) {
			for (@Pc(105) int local105 = -128; local105 < 0; local105++) {
				if (local11[local30] == 0) {
					@Pc(119) int local119 = 0;
					if (local11[local30 - 1] != 0) {
						local119++;
					}
					if (local11[local30 + 1] != 0) {
						local119++;
					}
					if (local11[local30 - local19] != 0) {
						local119++;
					}
					if (local11[local30 + local19] != 0) {
						local119++;
					}
					local13[local32++] = (byte) (local119 * 17);
				} else {
					local13[local32++] = 68;
				}
				local30++;
			}
			local30 += this.aClass100_2.anInt2684 - 128;
		}
		if (this.aClass8_Sub1_5 == null) {
			this.aClass8_Sub1_5 = new Class8_Sub1(this.aClass19_Sub1_36, 3553, 6406, 128, 128, false, Static345.aByteArray93, 6406, false);
			this.aClass8_Sub1_5.method3638(false, false);
			this.aClass8_Sub1_5.method6160(true);
		} else {
			this.aClass8_Sub1_5.method3635(128, 128, Static345.aByteArray93, 6406, false);
		}
	}
}
