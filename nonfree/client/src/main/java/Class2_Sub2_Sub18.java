import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class2_Sub2_Sub18 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rw", name = "t", descriptor = "[Lclient!nb;")
	public Class253[] aClass253Array1;

	@OriginalMember(owner = "client!rw", name = "E", descriptor = "[[B")
	private byte[][] aByteArrayArray32;

	@OriginalMember(owner = "client!rw", name = "x", descriptor = "I")
	private final int anInt8535;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(I)V")
	public Class2_Sub2_Sub18(@OriginalArg(0) int arg0) {
		this.anInt8535 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)Z")
	public boolean method7565() {
		if (this.aClass253Array1 != null) {
			return true;
		}
		@Pc(36) int[] local36;
		@Pc(43) int local43;
		if (this.aByteArrayArray32 == null) {
			@Pc(14) Class330 local14 = Static509.aClass330_96;
			synchronized (Static509.aClass330_96) {
				if (!Static509.aClass330_96.method7607(this.anInt8535)) {
					return false;
				}
				local36 = Static509.aClass330_96.method7603(this.anInt8535);
				this.aByteArrayArray32 = new byte[local36.length][];
				for (local43 = 0; local43 < local36.length; local43++) {
					this.aByteArrayArray32[local43] = Static509.aClass330_96.method7595(local36[local43], this.anInt8535);
				}
			}
		}
		@Pc(69) boolean local69 = true;
		for (@Pc(71) int local71 = 0; local71 < this.aByteArrayArray32.length; local71++) {
			@Pc(77) byte[] local77 = this.aByteArrayArray32[local71];
			@Pc(82) Class2_Sub21 local82 = new Class2_Sub21(local77);
			local82.anInt8388 = 1;
			local43 = local82.method7382();
			@Pc(91) Class330 local91 = Static269.aClass330_58;
			synchronized (Static269.aClass330_58) {
				local69 &= Static269.aClass330_58.method7581(local43);
			}
		}
		if (!local69) {
			return false;
		}
		@Pc(123) Class339 local123 = new Class339();
		@Pc(125) Class330 local125 = Static509.aClass330_96;
		synchronized (Static509.aClass330_96) {
			@Pc(133) int local133 = Static509.aClass330_96.method7608(this.anInt8535);
			this.aClass253Array1 = new Class253[local133];
			local36 = Static509.aClass330_96.method7603(this.anInt8535);
		}
		for (local43 = 0; local43 < local36.length; local43++) {
			@Pc(167) byte[] local167 = this.aByteArrayArray32[local43];
			@Pc(172) Class2_Sub21 local172 = new Class2_Sub21(local167);
			local172.anInt8388 = 1;
			@Pc(179) int local179 = local172.method7382();
			@Pc(181) Class2_Sub44 local181 = null;
			for (@Pc(188) Class2_Sub44 local188 = (Class2_Sub44) local123.method7699(65280); local188 != null; local188 = (Class2_Sub44) local123.method7706()) {
				if (local188.anInt7692 == local179) {
					local181 = local188;
					break;
				}
			}
			if (local181 == null) {
				@Pc(209) Class330 local209 = Static269.aClass330_58;
				synchronized (Static269.aClass330_58) {
					local181 = new Class2_Sub44(local179, Static269.aClass330_58.method7589(local179));
				}
				local123.method7711(local181);
			}
			this.aClass253Array1[local36[local43]] = new Class253(local167, local181);
		}
		this.aByteArrayArray32 = null;
		return true;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(BI)Z")
	public boolean method7568(@OriginalArg(1) int arg0) {
		return this.aClass253Array1[arg0].aBoolean470;
	}

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "(II)Z")
	public boolean method7569(@OriginalArg(1) int arg0) {
		return this.aClass253Array1[arg0].aBoolean471;
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(II)Z")
	public boolean method7570(@OriginalArg(0) int arg0) {
		return this.aClass253Array1[arg0].aBoolean469;
	}
}
