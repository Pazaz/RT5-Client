import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class48 {

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "[I")
	private int[] anIntArray100;

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!dl", name = "m", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!dl", name = "n", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!dl", name = "p", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!dl", name = "o", descriptor = "Z")
	public boolean aBoolean105 = false;

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
	public int anInt1578 = -1;

	@OriginalMember(owner = "client!dl", name = "r", descriptor = "[I")
	private final int[] anIntArray102 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!il;Z)V")
	public void method1365(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5761();
			if (local5 == 0) {
				return;
			}
			this.method1371(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)Z")
	public boolean method1366() {
		if (this.anIntArray100 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(14) Class162 local14 = Static140.aClass162_122;
		synchronized (Static140.aClass162_122) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray100.length; local18++) {
				if (!Static140.aClass162_122.method4626(0, this.anIntArray100[local18])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)Lclient!m;")
	public Class126 method1367() {
		@Pc(8) Class126[] local8 = new Class126[5];
		@Pc(10) int local10 = 0;
		@Pc(12) Class162 local12 = Static140.aClass162_122;
		synchronized (Static140.aClass162_122) {
			for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
				if (this.anIntArray102[local16] != -1) {
					local8[local10++] = Static216.method4218(this.anIntArray102[local16], Static140.aClass162_122);
				}
			}
		}
		@Pc(59) Class126 local59 = new Class126(local8, local10);
		@Pc(64) int local64;
		if (this.aShortArray20 != null) {
			for (local64 = 0; local64 < this.aShortArray20.length; local64++) {
				local59.method3643(this.aShortArray18[local64], this.aShortArray20[local64]);
			}
		}
		if (this.aShortArray17 != null) {
			for (local64 = 0; local64 < this.aShortArray17.length; local64++) {
				local59.method3640(this.aShortArray17[local64], this.aShortArray19[local64]);
			}
		}
		return local59;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)Z")
	public boolean method1368() {
		@Pc(7) boolean local7 = true;
		@Pc(9) Class162 local9 = Static140.aClass162_122;
		synchronized (Static140.aClass162_122) {
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray102[local13] != -1 && !Static140.aClass162_122.method4626(0, this.anIntArray102[local13])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)Lclient!m;")
	public Class126 method1369() {
		if (this.anIntArray100 == null) {
			return null;
		}
		@Pc(15) Class126[] local15 = new Class126[this.anIntArray100.length];
		@Pc(17) Class162 local17 = Static140.aClass162_122;
		synchronized (Static140.aClass162_122) {
			@Pc(21) int local21 = 0;
			while (true) {
				if (local21 >= this.anIntArray100.length) {
					break;
				}
				local15[local21] = Static216.method4218(this.anIntArray100[local21], Static140.aClass162_122);
				local21++;
			}
		}
		@Pc(67) Class126 local67;
		if (local15.length == 1) {
			local67 = local15[0];
		} else {
			local67 = new Class126(local15, local15.length);
		}
		if (local67 == null) {
			return null;
		}
		@Pc(81) int local81;
		if (this.aShortArray20 != null) {
			for (local81 = 0; local81 < this.aShortArray20.length; local81++) {
				local67.method3643(this.aShortArray18[local81], this.aShortArray20[local81]);
			}
		}
		if (this.aShortArray17 != null) {
			for (local81 = 0; local81 < this.aShortArray17.length; local81++) {
				local67.method3640(this.aShortArray17[local81], this.aShortArray19[local81]);
			}
		}
		return local67;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILclient!il;I)V")
	private void method1371(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub16 arg1) {
		if (arg0 == 1) {
			this.anInt1578 = arg1.method5761();
			return;
		}
		@Pc(58) int local58;
		@Pc(68) int local68;
		if (arg0 == 2) {
			local58 = arg1.method5761();
			this.anIntArray100 = new int[local58];
			for (local68 = 0; local68 < local58; local68++) {
				this.anIntArray100[local68] = arg1.method5749();
			}
		} else if (arg0 == 3) {
			this.aBoolean105 = true;
		} else if (arg0 == 40) {
			local58 = arg1.method5761();
			this.aShortArray18 = new short[local58];
			this.aShortArray20 = new short[local58];
			for (local68 = 0; local68 < local58; local68++) {
				this.aShortArray20[local68] = (short) arg1.method5749();
				this.aShortArray18[local68] = (short) arg1.method5749();
			}
		} else if (arg0 == 41) {
			local58 = arg1.method5761();
			this.aShortArray19 = new short[local58];
			this.aShortArray17 = new short[local58];
			for (local68 = 0; local68 < local58; local68++) {
				this.aShortArray17[local68] = (short) arg1.method5749();
				this.aShortArray19[local68] = (short) arg1.method5749();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray102[arg0 - 60] = arg1.method5749();
			return;
		}
	}
}
