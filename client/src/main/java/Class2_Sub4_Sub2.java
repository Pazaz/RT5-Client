import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class2_Sub4_Sub2 extends Buffer {

	@OriginalMember(owner = "client!qg", name = "Mb", descriptor = "I")
	private int anInt5340;

	@OriginalMember(owner = "client!qg", name = "Qb", descriptor = "Lclient!sq;")
	private Class217 aClass217_1;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(I)V")
	public Class2_Sub4_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "(I)I")
	public int method4864() {
		@Pc(22) int local22 = super.data[super.pos++] - this.aClass217_1.method5534() & 0xFF;
		return local22 < 128 ? local22 : (super.data[super.pos++] - this.aClass217_1.method5534() & 0xFF) + (local22 - 128 << 8);
	}

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "(B)V")
	public void method4865() {
		super.pos = (this.anInt5340 + 7) / 8;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "([BIII)V")
	public void method4866(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			arg0[local12] = (byte) (super.data[super.pos++] - this.aClass217_1.method5534());
		}
	}

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "(II)V")
	public void method4867(@OriginalArg(0) int arg0) {
		super.data[super.pos++] = (byte) (this.aClass217_1.method5534() + arg0);
	}

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "(BI)I")
	public int method4868(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt5340 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt5340 & 0x7);
		this.anInt5340 += arg0;
		@Pc(32) int local32 = 0;
		while (local17 < arg0) {
			local32 += (super.data[local10++] & Static31.anIntArray39[local17]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (arg0 == local17) {
			local32 += Static31.anIntArray39[local17] & super.data[local10];
		} else {
			local32 += super.data[local10] >> local17 - arg0 & Static31.anIntArray39[arg0];
		}
		return local32;
	}

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "(I)V")
	public void method4869() {
		this.anInt5340 = super.pos * 8;
	}

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "(B)Z")
	public boolean method4870() {
		@Pc(17) int local17 = super.data[super.pos] - this.aClass217_1.method5533() & 0xFF;
		return local17 >= 128;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([IB)V")
	public void method4871(@OriginalArg(0) int[] arg0) {
		this.aClass217_1 = new Class217(arg0);
	}

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "(BI)I")
	public int method4873(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt5340;
	}
}
