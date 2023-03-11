import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class2_Sub2_Sub12 extends Class2_Sub2 {

	@OriginalMember(owner = "client!mn", name = "C", descriptor = "[I")
	public int[] anIntArray232;

	@OriginalMember(owner = "client!mn", name = "D", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!mn", name = "E", descriptor = "[I")
	public int[] anIntArray233;

	@OriginalMember(owner = "client!mn", name = "G", descriptor = "Ljava/lang/String;")
	public String aString37;

	@OriginalMember(owner = "client!mn", name = "M", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(B)V")
	public void method3793() {
		@Pc(10) int local10;
		if (this.anIntArray232 != null) {
			for (local10 = 0; local10 < this.anIntArray232.length; local10++) {
				this.anIntArray232[local10] |= 0x8000;
			}
		}
		if (this.anIntArray233 != null) {
			for (local10 = 0; local10 < this.anIntArray233.length; local10++) {
				this.anIntArray233[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(CZ)I")
	public int method3794(@OriginalArg(0) char arg0) {
		if (this.anIntArray233 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray233.length; local20++) {
			if (this.aCharArray4[local20] == arg0) {
				return this.anIntArray233[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BILclient!bt;)V")
	private void method3796(@OriginalArg(1) int arg0, @OriginalArg(2) Buffer arg1) {
		if (arg0 == 1) {
			this.aString37 = arg1.gjstr();
			return;
		}
		@Pc(16) int local16;
		@Pc(26) int local26;
		@Pc(39) byte local39;
		if (arg0 == 2) {
			local16 = arg1.g1();
			this.anIntArray233 = new int[local16];
			this.aCharArray4 = new char[local16];
			for (local26 = 0; local26 < local16; local26++) {
				this.anIntArray233[local26] = arg1.g2();
				local39 = arg1.g1b();
				this.aCharArray4[local26] = local39 == 0 ? 0 : Static78.method5698(local39);
			}
		} else if (arg0 == 3) {
			local16 = arg1.g1();
			this.aCharArray5 = new char[local16];
			this.anIntArray232 = new int[local16];
			for (local26 = 0; local26 < local16; local26++) {
				this.anIntArray232[local26] = arg1.g2();
				local39 = arg1.g1b();
				this.aCharArray5[local26] = local39 == 0 ? 0 : Static78.method5698(local39);
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!bt;B)V")
	public void method3797(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.method3796(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZC)I")
	public int method3798(@OriginalArg(1) char arg0) {
		if (this.anIntArray232 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray232.length; local17++) {
			if (this.aCharArray5[local17] == arg0) {
				return this.anIntArray232[local17];
			}
		}
		return -1;
	}
}
