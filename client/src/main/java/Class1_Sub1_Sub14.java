import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kj", name = "F", descriptor = "[Lclient!tn;")
	public Class197[] aClass197Array1;

	@OriginalMember(owner = "client!kj", name = "L", descriptor = "[[B")
	private byte[][] aByteArrayArray33;

	@OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
	private final int anInt3898;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(I)V")
	public Class1_Sub1_Sub14(@OriginalArg(0) int arg0) {
		this.anInt3898 = arg0;
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)Z")
	public boolean method3354(@OriginalArg(1) int arg0) {
		return this.aClass197Array1[arg0].aBoolean459;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)Z")
	public boolean method3357(@OriginalArg(1) int arg0) {
		return this.aClass197Array1[arg0].aBoolean458;
	}

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)Z")
	public boolean method3358() {
		if (this.aClass197Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray33 == null) {
			if (!Static213.aClass162_70.method4639(this.anInt3898)) {
				return false;
			}
			@Pc(27) int[] local27 = Static213.aClass162_70.method4621(this.anInt3898);
			this.aByteArrayArray33 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray33[local34] = Static213.aClass162_70.method4636(local27[local34], this.anInt3898);
			}
		}
		@Pc(59) boolean local59 = true;
		@Pc(82) int local82;
		for (local34 = 0; local34 < this.aByteArrayArray33.length; local34++) {
			@Pc(68) byte[] local68 = this.aByteArrayArray33[local34];
			local82 = local68[1] & 0xFF | (local68[0] & 0xFF) << 8;
			local59 &= Static160.aClass162_241.method4615(local82);
		}
		if (!local59) {
			return false;
		}
		@Pc(108) Class130 local108 = new Class130();
		local82 = Static213.aClass162_70.method4640(this.anInt3898);
		this.aClass197Array1 = new Class197[local82];
		@Pc(124) int[] local124 = Static213.aClass162_70.method4621(this.anInt3898);
		for (@Pc(126) int local126 = 0; local126 < local124.length; local126++) {
			@Pc(133) byte[] local133 = this.aByteArrayArray33[local126];
			@Pc(147) int local147 = (local133[0] & 0xFF) << 8 | local133[1] & 0xFF;
			@Pc(149) Class1_Sub18 local149 = null;
			for (@Pc(154) Class1_Sub18 local154 = (Class1_Sub18) local108.method3749(); local154 != null; local154 = (Class1_Sub18) local108.method3756()) {
				if (local147 == local154.anInt3662) {
					local149 = local154;
					break;
				}
			}
			if (local149 == null) {
				local149 = new Class1_Sub18(local147, Static160.aClass162_241.method4630(local147));
				local108.method3760(local149);
			}
			this.aClass197Array1[local124[local126]] = new Class197(local133, local149);
		}
		this.aByteArrayArray33 = null;
		return true;
	}
}
