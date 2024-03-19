import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "[I")
	public int[] anIntArray233;

	@OriginalMember(owner = "client!ie", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!ie", name = "P", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray20;

	@OriginalMember(owner = "client!ie", name = "Q", descriptor = "[I")
	private int[] anIntArray235;

	@OriginalMember(owner = "client!ie", name = "I", descriptor = "Z")
	public boolean aBoolean205 = true;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLclient!il;)V")
	public void method2683(@OriginalArg(1) Class1_Sub16 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5761();
			if (local11 == 0) {
				return;
			}
			this.method2689(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(Z)I")
	public int method2685() {
		return this.anIntArray235 == null ? 0 : this.anIntArray235.length;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BII)I")
	public int method2686(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray235 == null || arg1 < 0 || arg1 > this.anIntArray235.length) {
			return -1;
		} else if (this.anIntArrayArray17[arg1] == null || arg0 < 0 || this.anIntArrayArray17[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray17[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)I")
	public int method2687(@OriginalArg(1) int arg0) {
		return this.anIntArray235 == null || arg0 < 0 || this.anIntArray235.length < arg0 ? -1 : this.anIntArray235[arg0];
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!il;IB)V")
	private void method2689(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray20 = Static355.method3607(arg0.method5776(), '<');
			return;
		}
		@Pc(36) int local36;
		@Pc(46) int local46;
		if (arg1 == 2) {
			local36 = arg0.method5761();
			this.anIntArray233 = new int[local36];
			for (local46 = 0; local46 < local36; local46++) {
				this.anIntArray233[local46] = arg0.method5749();
			}
		} else if (arg1 == 3) {
			local36 = arg0.method5761();
			this.anIntArrayArray17 = new int[local36][];
			this.anIntArray235 = new int[local36];
			for (local46 = 0; local46 < local36; local46++) {
				@Pc(54) int local54 = arg0.method5749();
				this.anIntArray235[local46] = local54;
				this.anIntArrayArray17[local46] = new int[Static345.anIntArray586[local54]];
				for (@Pc(69) int local69 = 0; local69 < Static345.anIntArray586[local54]; local69++) {
					this.anIntArrayArray17[local46][local69] = arg0.method5749();
				}
			}
			return;
		} else if (arg1 == 4) {
			this.aBoolean205 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(Z)V")
	public void method2690() {
		if (this.anIntArray233 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray233.length; local14++) {
				this.anIntArray233[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([IILclient!il;)V")
	public void method2691(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (this.anIntArray235 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray235.length && arg0.length > local11; local11++) {
			@Pc(20) int local20 = Static90.anIntArray150[this.method2687(local11)];
			if (local20 > 0) {
				arg1.method5731((long) arg0[local11], local20);
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!il;I)Ljava/lang/String;")
	public String method2692(@OriginalArg(0) Class1_Sub16 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray235 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray235.length; local15++) {
				local10.append(this.aStringArray20[local15]);
				local10.append(Static89.method1962(arg0.method5723(Static245.anIntArray229[this.anIntArray235[local15]]), this.anIntArrayArray17[local15], this.anIntArray235[local15]));
			}
		}
		local10.append(this.aStringArray20[this.aStringArray20.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)Ljava/lang/String;")
	public String method2693() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray20 == null) {
			return "";
		}
		local10.append(this.aStringArray20[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray20.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray20[local24]);
		}
		return local10.toString();
	}
}
