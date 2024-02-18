import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!bq", name = "x", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!bq", name = "w", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!bq", name = "v", descriptor = "[I")
	public int[] anIntArray93;

	@OriginalMember(owner = "client!bq", name = "y", descriptor = "[I")
	public int[] anIntArray94;

	@OriginalMember(owner = "client!bq", name = "B", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!ge;Z)V")
	public void method1180(@OriginalArg(0) Class2_Sub21 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method7396();
			if (local3 == 0) {
				return;
			}
			this.method1181(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILclient!ge;I)V")
	private void method1181(@OriginalArg(1) Class2_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString4 = arg0.method7358();
			return;
		}
		@Pc(22) int local22;
		@Pc(32) int local32;
		@Pc(44) byte local44;
		if (arg1 == 2) {
			local22 = arg0.method7396();
			this.anIntArray93 = new int[local22];
			this.aCharArray2 = new char[local22];
			for (local32 = 0; local32 < local22; local32++) {
				this.anIntArray93[local32] = arg0.method7382();
				local44 = arg0.method7377();
				this.aCharArray2[local32] = local44 == 0 ? 0 : Static346.method5084(local44);
			}
		} else if (arg1 == 3) {
			local22 = arg0.method7396();
			this.aCharArray3 = new char[local22];
			this.anIntArray94 = new int[local22];
			for (local32 = 0; local32 < local22; local32++) {
				this.anIntArray94[local32] = arg0.method7382();
				local44 = arg0.method7377();
				this.aCharArray3[local32] = local44 == 0 ? 0 : Static346.method5084(local44);
			}
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(CI)I")
	public int method1184(@OriginalArg(0) char arg0) {
		if (this.anIntArray94 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray94.length; local11++) {
			if (this.aCharArray3[local11] == arg0) {
				return this.anIntArray94[local11];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BC)I")
	public int method1185(@OriginalArg(1) char arg0) {
		if (this.anIntArray93 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray93.length; local11++) {
			if (this.aCharArray2[local11] == arg0) {
				return this.anIntArray93[local11];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(B)V")
	public void method1186() {
		@Pc(8) int local8;
		if (this.anIntArray94 != null) {
			for (local8 = 0; local8 < this.anIntArray94.length; local8++) {
				this.anIntArray94[local8] |= 0x8000;
			}
		}
		if (this.anIntArray93 != null) {
			for (local8 = 0; local8 < this.anIntArray93.length; local8++) {
				this.anIntArray93[local8] |= 0x8000;
			}
		}
	}
}
