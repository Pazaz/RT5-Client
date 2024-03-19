import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fq", name = "A", descriptor = "[C")
	public char[] aCharArray8;

	@OriginalMember(owner = "client!fq", name = "D", descriptor = "Ljava/lang/String;")
	public String aString88;

	@OriginalMember(owner = "client!fq", name = "K", descriptor = "[C")
	public char[] aCharArray9;

	@OriginalMember(owner = "client!fq", name = "O", descriptor = "[I")
	public int[] anIntArray148;

	@OriginalMember(owner = "client!fq", name = "P", descriptor = "[I")
	public int[] anIntArray149;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!il;I)V")
	public void method1965(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5761();
			if (local9 == 0) {
				return;
			}
			this.method1966(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BILclient!il;)V")
	private void method1966(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 1) {
			this.aString88 = arg1.method5776();
			return;
		}
		@Pc(25) int local25;
		@Pc(35) int local35;
		@Pc(48) byte local48;
		if (arg0 == 2) {
			local25 = arg1.method5761();
			this.aCharArray9 = new char[local25];
			this.anIntArray148 = new int[local25];
			for (local35 = 0; local35 < local25; local35++) {
				this.anIntArray148[local35] = arg1.method5749();
				local48 = arg1.method5772();
				this.aCharArray9[local35] = local48 == 0 ? 0 : Static344.method6059(local48);
			}
		} else if (arg0 == 3) {
			local25 = arg1.method5761();
			this.anIntArray149 = new int[local25];
			this.aCharArray8 = new char[local25];
			for (local35 = 0; local35 < local25; local35++) {
				this.anIntArray149[local35] = arg1.method5749();
				local48 = arg1.method5772();
				this.aCharArray8[local35] = local48 == 0 ? 0 : Static344.method6059(local48);
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "(B)V")
	public void method1970() {
		@Pc(6) int local6;
		if (this.anIntArray149 != null) {
			for (local6 = 0; local6 < this.anIntArray149.length; local6++) {
				this.anIntArray149[local6] |= 0x8000;
			}
		}
		if (this.anIntArray148 != null) {
			for (local6 = 0; local6 < this.anIntArray148.length; local6++) {
				this.anIntArray148[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(CI)I")
	public int method1971(@OriginalArg(0) char arg0) {
		if (this.anIntArray149 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray149.length; local12++) {
			if (arg0 == this.aCharArray8[local12]) {
				return this.anIntArray149[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(CB)I")
	public int method1974(@OriginalArg(0) char arg0) {
		if (this.anIntArray148 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray148.length; local12++) {
			if (arg0 == this.aCharArray9[local12]) {
				return this.anIntArray148[local12];
			}
		}
		return -1;
	}
}
