import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class2_Sub2_Sub12 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ih", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray101;

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "Lclient!gba;")
	public Class139 aClass139_1;

	@OriginalMember(owner = "client!ih", name = "F", descriptor = "[I")
	private int[] anIntArray331;

	@OriginalMember(owner = "client!ih", name = "G", descriptor = "[I")
	public int[] anIntArray333;

	@OriginalMember(owner = "client!ih", name = "E", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray23;

	@OriginalMember(owner = "client!ih", name = "I", descriptor = "Z")
	public boolean aBoolean334 = true;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)Lclient!it;")
	public Class184 method3898(@OriginalArg(1) int arg0) {
		return this.anIntArray331 == null || arg0 < 0 || arg0 > this.anIntArray331.length ? null : Static446.method6091(this.anIntArray331[arg0]);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method3899(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.method3907(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZI)I")
	public int method3900(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray331 == null || arg0 < 0 || arg0 > this.anIntArray331.length) {
			return -1;
		} else if (this.anIntArrayArray101[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray101[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray101[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)I")
	public int method3901() {
		return this.anIntArray331 == null ? 0 : this.anIntArray331.length;
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V")
	public void method3902() {
		if (this.anIntArray333 != null) {
			for (@Pc(8) int local8 = 0; local8 < this.anIntArray333.length; local8++) {
				this.anIntArray333[local8] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLclient!ge;)Ljava/lang/String;")
	public String method3903(@OriginalArg(1) Packet arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray331 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray331.length; local15++) {
				local10.append(this.aStringArray23[local15]);
				local10.append(this.aClass139_1.method2948(this.method3898(local15), arg0.gVarLong(Static446.method6091(this.anIntArray331[local15]).anInt4577), this.anIntArrayArray101[local15]));
			}
		}
		local10.append(this.aStringArray23[this.aStringArray23.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ge;[II)V")
	public void method3904(@OriginalArg(0) Packet arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray331 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray331.length; local15++) {
			if (arg1.length <= local15) {
				return;
			}
			@Pc(22) int local22 = this.method3898(local15).anInt4576;
			if (local22 > 0) {
				arg0.pVarLong(local22, (long) arg1[local15]);
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method3906() {
		@Pc(8) StringBuffer local8 = new StringBuffer(80);
		if (this.aStringArray23 == null) {
			return "";
		}
		local8.append(this.aStringArray23[0]);
		for (@Pc(30) int local30 = 1; local30 < this.aStringArray23.length; local30++) {
			local8.append("...");
			local8.append(this.aStringArray23[local30]);
		}
		return local8.toString();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ge;II)V")
	private void method3907(@OriginalArg(0) Packet arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray23 = Static189.method2861(arg0.gjstr(), '<');
			return;
		}
		@Pc(21) int local21;
		@Pc(27) int local27;
		if (arg1 == 2) {
			local21 = arg0.g1();
			this.anIntArray333 = new int[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.anIntArray333[local27] = arg0.g2();
			}
		} else if (arg1 == 3) {
			local21 = arg0.g1();
			this.anIntArrayArray101 = new int[local21][];
			this.anIntArray331 = new int[local21];
			for (local27 = 0; local27 < local21; local27++) {
				@Pc(71) int local71 = arg0.g2();
				@Pc(75) Class184 local75 = Static446.method6091(local71);
				if (local75 != null) {
					this.anIntArray331[local27] = local71;
					this.anIntArrayArray101[local27] = new int[local75.anInt4573];
					for (@Pc(91) int local91 = 0; local91 < local75.anInt4573; local91++) {
						this.anIntArrayArray101[local27][local91] = arg0.g2();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean334 = false;
		}
	}
}
