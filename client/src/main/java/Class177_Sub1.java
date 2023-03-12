import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class177_Sub1 extends Class177 {

	@OriginalMember(owner = "client!pe", name = "O", descriptor = "Z")
	public boolean aBoolean365 = false;

	@OriginalMember(owner = "client!pe", name = "S", descriptor = "Z")
	public boolean aBoolean366 = false;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Class177_Sub1(@OriginalArg(0) Signlink arg0) {
		super.anInt4879 = 3;
		this.method4493(true);
		super.anInt4888 = 127;
		super.aBoolean364 = true;
		super.anInt4885 = 0;
		super.anInt4882 = 127;
		super.aBoolean361 = true;
		super.anInt4895 = 1;
		super.anInt4884 = 0;
		super.ot = true;
		super.aBoolean353 = true;
		super.anInt4886 = 2;
		super.anInt4891 = 0;
		super.anInt4893 = 0;
		super.aBoolean358 = true;
		super.aBoolean348 = true;
		super.anInt4889 = 255;
		super.stereo = true;
		super.aBoolean350 = true;
		super.aBoolean359 = true;
		super.aBoolean349 = true;
		if (Static309.anInt5802 < 96) {
			Static26.method864(0);
		} else {
			Static26.method864(2);
		}
		super.aBoolean363 = true;
		super.gb = true;
		super.aBoolean362 = false;
		super.anInt4894 = 2;
		super.anInt4883 = 0;
		super.anInt4881 = Static201.anInt3699 == 1 ? 2 : 4;
		super.aBoolean356 = false;
		super.anInt4878 = 2;
		super.anInt4887 = 0;
		super.aBoolean351 = false;
		@Pc(125) FileOnDisk local125 = null;
		try {
			@Pc(129) PrivilegedRequest local129 = arg0.openPreferences();
			while (local129.status == 0) {
				ThreadUtils.sleep(1L);
			}
			if (local129.status == 1) {
				local125 = (FileOnDisk) local129.result;
				@Pc(153) byte[] local153 = new byte[(int) local125.length()];
				@Pc(168) int local168;
				for (@Pc(155) int local155 = 0; local155 < local153.length; local155 += local168) {
					local168 = local125.read(local153.length - local155, local155, local153);
					if (local168 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method4499(new Buffer(local153));
			}
		} catch (@Pc(193) Exception local193) {
		}
		try {
			if (local125 != null) {
				local125.close();
			}
		} catch (@Pc(200) Exception local200) {
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)I")
	public int method4492(@OriginalArg(1) int arg0) {
		if (this.aBoolean366) {
			return 0;
		} else if (this.method4495(arg0)) {
			return super.aBoolean349 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)V")
	public void method4493(@OriginalArg(0) boolean arg0) {
		super.aBoolean354 = arg0;
		if (client.LocTypes != null) {
			client.LocTypes.method5160(!this.method4495(Static77.anInt1762));
		}
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)Lclient!bt;")
	public Buffer encode() {
		@Pc(8) Buffer local8 = new Buffer(39);
		local8.p1(16);
		local8.p1(super.anInt4879);
		local8.p1(super.aBoolean354 ? 1 : 0);
		local8.p1(super.aBoolean349 ? 1 : 0);
		local8.p1(super.aBoolean359 ? 1 : 0);
		local8.p1(super.aBoolean350 ? 1 : 0);
		local8.p1(0);
		local8.p1(super.aBoolean353 ? 1 : 0);
		local8.p1(super.ot ? 1 : 0);
		local8.p1(super.aBoolean358 ? 1 : 0);
		local8.p1(super.anInt4886);
		local8.p1(super.aBoolean364 ? 1 : 0);
		local8.p1(super.aBoolean361 ? 1 : 0);
		local8.p1(super.aBoolean348 ? 1 : 0);
		local8.p1(super.anInt4891);
		local8.p1(super.stereo ? 1 : 0);
		local8.p1(super.anInt4888);
		local8.p1(super.anInt4889);
		local8.p1(super.anInt4882);
		local8.p2(super.anInt4884);
		local8.p2(super.anInt4893);
		local8.p1(Static184.method3391());
		local8.p4(super.anInt4887);
		local8.p1(super.anInt4894);
		local8.p1(super.aBoolean362 ? 1 : 0);
		local8.p1(super.aBoolean351 ? 1 : 0);
		local8.p1(super.anInt4883);
		local8.p1(super.aBoolean356 ? 1 : 0);
		local8.p1(super.aBoolean363 ? 1 : 0);
		local8.p1(super.anInt4895);
		local8.p1(super.gb ? 1 : 0);
		local8.p1(super.anInt4878);
		local8.p1(super.anInt4881);
		local8.p1(super.aBoolean360 ? 0 : 1);
		return local8;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Z")
	public boolean method4495(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean365 ? super.aBoolean354 : true;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)Z")
	public boolean method4496(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean354 : true;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!ml;)V")
	public void method4497(@OriginalArg(1) Signlink arg0) {
		@Pc(7) FileOnDisk local7 = null;
		try {
			@Pc(17) PrivilegedRequest local17 = arg0.openPreferences();
			while (local17.status == 0) {
				ThreadUtils.sleep(1L);
			}
			if (local17.status == 1) {
				local7 = (FileOnDisk) local17.result;
				@Pc(39) Buffer local39 = this.encode();
				local7.write(local39.data, local39.pos, 0);
			}
		} catch (@Pc(49) Exception local49) {
		}
		try {
			if (local7 != null) {
				local7.close();
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!bt;)V")
	private void method4499(@OriginalArg(1) Buffer arg0) {
		if (arg0.data.length - arg0.pos < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.g1();
		if (local21 < 0 || local21 > 16) {
			return;
		}
		@Pc(34) byte local34;
		if (local21 == 16) {
			local34 = 38;
		} else if (local21 == 15) {
			local34 = 37;
		} else if (local21 == 14) {
			local34 = 36;
		} else if (local21 == 13) {
			local34 = 35;
		} else if (local21 == 12) {
			local34 = 34;
		} else if (local21 == 11) {
			local34 = 33;
		} else if (local21 == 10) {
			local34 = 32;
		} else if (local21 == 9) {
			local34 = 31;
		} else if (local21 == 8) {
			local34 = 30;
		} else if (local21 == 7) {
			local34 = 29;
		} else if (local21 == 6) {
			local34 = 28;
		} else if (local21 == 5) {
			local34 = 28;
		} else if (local21 == 4) {
			local34 = 24;
		} else if (local21 == 3) {
			local34 = 23;
		} else if (local21 == 2) {
			local34 = 22;
		} else if (local21 == 1) {
			local34 = 23;
		} else {
			local34 = 19;
		}
		if (local34 > arg0.data.length - arg0.pos) {
			return;
		}
		super.anInt4879 = arg0.g1();
		if (super.anInt4879 < 1) {
			super.anInt4879 = 1;
		} else if (super.anInt4879 > 4) {
			super.anInt4879 = 4;
		}
		this.method4493(arg0.g1() == 1);
		super.aBoolean349 = arg0.g1() == 1;
		super.aBoolean359 = arg0.g1() == 1;
		super.aBoolean350 = arg0.g1() == 1;
		super.anInt4895 = arg0.g1() == 1 ? 1 : 0;
		super.aBoolean353 = arg0.g1() == 1;
		super.ot = arg0.g1() == 1;
		super.aBoolean358 = arg0.g1() == 1;
		super.anInt4886 = arg0.g1();
		if (super.anInt4886 > 2) {
			super.anInt4886 = 2;
		}
		if (local21 < 2) {
			super.aBoolean364 = arg0.g1() == 1;
			arg0.g1();
		} else {
			super.aBoolean364 = arg0.g1() == 1;
		}
		super.aBoolean361 = arg0.g1() == 1;
		super.aBoolean348 = arg0.g1() == 1;
		super.anInt4891 = arg0.g1();
		if (super.anInt4891 > 2) {
			super.anInt4891 = 2;
		}
		super.anInt4885 = super.anInt4891;
		super.stereo = arg0.g1() == 1;
		super.anInt4888 = arg0.g1();
		if (super.anInt4888 > 127) {
			super.anInt4888 = 127;
		}
		super.anInt4889 = arg0.g1();
		super.anInt4882 = arg0.g1();
		if (super.anInt4882 > 127) {
			super.anInt4882 = 127;
		}
		if (local21 >= 1) {
			super.anInt4884 = arg0.g2();
			super.anInt4893 = arg0.g2();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.g1();
		}
		@Pc(437) int local437;
		if (local21 >= 4) {
			local437 = arg0.g1();
			if (local437 < 0 || local437 > 2) {
				local437 = 0;
			}
			if (Static309.anInt5802 < 96) {
				local437 = 0;
			}
			Static26.method864(local437);
		}
		if (local21 >= 5) {
			super.anInt4887 = arg0.g4();
		}
		local437 = 0;
		if (local21 >= 6) {
			super.anInt4894 = local437 = arg0.g1();
		}
		if (super.anInt4894 != 1 && super.anInt4894 != 2) {
			super.anInt4894 = 2;
		}
		if (local21 >= 7) {
			super.aBoolean362 = arg0.g1() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean351 = arg0.g1() == 1;
		}
		if (local21 >= 9) {
			super.anInt4883 = arg0.g1();
		}
		if (super.anInt4883 < 0 || super.anInt4883 > Static289.method5019(Static309.anInt5802)) {
			super.anInt4883 = 0;
		}
		if (local21 >= 10) {
			super.aBoolean356 = arg0.g1() != 0;
		}
		if (local21 >= 11) {
			super.aBoolean363 = arg0.g1() != 0;
		}
		if (local21 >= 12) {
			super.anInt4895 = arg0.g1();
		}
		if (super.anInt4895 < 0 || super.anInt4895 > 2) {
			super.anInt4895 = 1;
		}
		if (local21 >= 13) {
			super.gb = arg0.g1() == 1;
		}
		if (local21 >= 14) {
			super.anInt4878 = arg0.g1();
		} else if (local437 == 0) {
			super.anInt4878 = 2;
		} else {
			super.anInt4878 = 1;
		}
		if (super.anInt4878 < 0 || super.anInt4878 > 3) {
			super.anInt4878 = 2;
		}
		if (local21 >= 15) {
			super.anInt4881 = arg0.g1();
			if (super.anInt4881 < 0 || super.anInt4881 > 4) {
				super.anInt4881 = Static201.anInt3699 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean360 = arg0.g1() != 1;
		}
	}
}
