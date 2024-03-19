import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class124 {

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "[I")
	private int[] anIntArray295;

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "[I")
	public int[] anIntArray296;

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "J")
	private long aLong124;

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
	private int anInt4225;

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "[I")
	private int[] anIntArray297;

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
	public int anInt4226;

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "[I")
	private int[] anIntArray298;

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "Lclient!il;")
	private final Class1_Sub16 aClass1_Sub16_3 = new Class1_Sub16(null);

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
	public Class124() {
	}

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "([B)V")
	public Class124(@OriginalArg(0) byte[] arg0) {
		this.method3613(arg0);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "([B)V")
	public void method3613(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub16_3.aByteArray86 = arg0;
		this.aClass1_Sub16_3.anInt6813 = 10;
		@Pc(12) int local12 = this.aClass1_Sub16_3.method5749();
		this.anInt4226 = this.aClass1_Sub16_3.method5749();
		this.anInt4225 = 500000;
		this.anIntArray297 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub16_3.method5730();
			@Pc(38) int local38 = this.aClass1_Sub16_3.method5730();
			if (local33 == 1297379947) {
				this.anIntArray297[local27] = this.aClass1_Sub16_3.anInt6813;
				local27++;
			}
			this.aClass1_Sub16_3.anInt6813 += local38;
		}
		this.aLong124 = 0L;
		this.anIntArray298 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray298[local33] = this.anIntArray297[local33];
		}
		this.anIntArray296 = new int[local12];
		this.anIntArray295 = new int[local12];
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "()V")
	public void method3614() {
		this.aClass1_Sub16_3.aByteArray86 = null;
		this.anIntArray297 = null;
		this.anIntArray298 = null;
		this.anIntArray296 = null;
		this.anIntArray295 = null;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)I")
	private int method3616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static178.aByteArray41[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub16_3.method5761() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub16_3.method5761() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub16_3.method5761();
		local12 = this.aClass1_Sub16_3.method5745();
		if (local7 == 47) {
			this.aClass1_Sub16_3.anInt6813 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub16_3.method5755();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray296[arg0];
			this.aLong124 += (long) local38 * (long) (this.anInt4225 - local32);
			this.anInt4225 = local32;
			this.aClass1_Sub16_3.anInt6813 += local12;
			return 2;
		} else {
			this.aClass1_Sub16_3.anInt6813 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "()Z")
	public boolean method3617() {
		@Pc(3) int local3 = this.anIntArray298.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray298[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "()V")
	public void method3618() {
		this.aClass1_Sub16_3.anInt6813 = -1;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)J")
	public long method3619(@OriginalArg(0) int arg0) {
		return this.aLong124 + (long) arg0 * (long) this.anInt4225;
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "()Z")
	public boolean method3620() {
		return this.aClass1_Sub16_3.aByteArray86 != null;
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)I")
	public int method3621(@OriginalArg(0) int arg0) {
		return this.method3625(arg0);
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V")
	public void method3622(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub16_3.method5745();
		this.anIntArray296[arg0] += local4;
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V")
	public void method3623(@OriginalArg(0) int arg0) {
		this.anIntArray298[arg0] = this.aClass1_Sub16_3.anInt6813;
	}

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "()I")
	public int method3624() {
		return this.anIntArray298.length;
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)I")
	private int method3625(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub16_3.aByteArray86[this.aClass1_Sub16_3.anInt6813];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray295[arg0] = local13;
			this.aClass1_Sub16_3.anInt6813++;
		} else {
			local13 = this.anIntArray295[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method3616(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub16_3.method5745();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub16_3.aByteArray86[this.aClass1_Sub16_3.anInt6813] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub16_3.anInt6813++;
				this.anIntArray295[arg0] = local57;
				return this.method3616(arg0, local57);
			}
		}
		this.aClass1_Sub16_3.anInt6813 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "()I")
	public int method3626() {
		@Pc(3) int local3 = this.anIntArray298.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray298[local9] >= 0 && this.anIntArray296[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray296[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "(I)V")
	public void method3627(@OriginalArg(0) int arg0) {
		this.aClass1_Sub16_3.anInt6813 = this.anIntArray298[arg0];
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(J)V")
	public void method3628(@OriginalArg(0) long arg0) {
		this.aLong124 = arg0;
		@Pc(6) int local6 = this.anIntArray298.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray296[local8] = 0;
			this.anIntArray295[local8] = 0;
			this.aClass1_Sub16_3.anInt6813 = this.anIntArray297[local8];
			this.method3622(local8);
			this.anIntArray298[local8] = this.aClass1_Sub16_3.anInt6813;
		}
	}
}
