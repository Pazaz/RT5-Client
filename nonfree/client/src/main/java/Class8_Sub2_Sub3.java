import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public abstract class Class8_Sub2_Sub3 extends Class8_Sub2 {

	@OriginalMember(owner = "client!kp", name = "D", descriptor = "S")
	public short aShort58;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(IIIIII)V")
	protected Class8_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort58 = (short) arg5;
		super.anInt10691 = arg1;
		super.aByte144 = (byte) arg3;
		super.anInt10694 = arg2;
		super.anInt10690 = arg0;
		super.aByte143 = (byte) arg4;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BLclient!ha;)Z")
	@Override
	public final boolean method9284(@OriginalArg(0) byte arg0, @OriginalArg(1) Class19 arg1) {
		if (arg0 != 59) {
			this.aShort58 = -17;
		}
		return Static73.method9308(super.anInt10690 >> Static52.anInt1066, super.anInt10694 >> Static52.anInt1066, this, super.aByte143);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "([Lclient!lca;I)I")
	@Override
	public final int method9288(@OriginalArg(0) Class2_Sub7[] arg0) {
		@Pc(10) int local10 = super.anInt10690 >> Static52.anInt1066;
		@Pc(21) int local21 = super.anInt10694 >> Static52.anInt1066;
		@Pc(23) int local23 = 0;
		if (Static403.anInt6246 == local10) {
			local23++;
		} else if (Static403.anInt6246 < local10) {
			local23 += 2;
		}
		if (local21 == Static550.anInt8271) {
			local23 += 3;
		} else if (Static550.anInt8271 > local21) {
			local23 += 6;
		}
		@Pc(71) int local71 = Static4.anIntArray15[local23];
		if ((this.aShort58 & local71) != 0) {
			return this.method9277(arg0, local21, local10);
		} else if (this.aShort58 == 1 && local10 > 0) {
			return this.method9277(arg0, local21, local10 - 1);
		} else if (this.aShort58 == 4 && Static619.anInt1566 >= local10) {
			return this.method9277(arg0, local21, local10 + 1);
		} else if (this.aShort58 == 8 && local21 > 0) {
			return this.method9277(arg0, local21 - 1, local10);
		} else if (this.aShort58 == 2 && Static662.anInt9843 >= local21) {
			return this.method9277(arg0, local21 + 1, local10);
		} else if (this.aShort58 == 16 && local10 > 0 && local21 <= Static662.anInt9843) {
			return this.method9277(arg0, local21 + 1, local10 + -1);
		} else if (this.aShort58 == 32 && local10 <= Static619.anInt1566 && Static662.anInt9843 >= local21) {
			return this.method9277(arg0, local21 + 1, local10 + 1);
		} else if (this.aShort58 == 128 && local10 > 0 && local21 > 0) {
			return this.method9277(arg0, local21 - 1, local10 + -1);
		} else if (this.aShort58 == 64 && Static619.anInt1566 >= local10 && local21 > 0) {
			return this.method9277(arg0, local21 - 1, local10 + 1);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method9275() {
		return Static258.aBooleanArrayArray3[(super.anInt10690 >> Static52.anInt1066) + Static35.anInt813 - Static403.anInt6246][Static35.anInt813 + (super.anInt10694 >> Static52.anInt1066) - Static550.anInt8271];
	}
}
