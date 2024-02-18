import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class2_Sub47 extends Class2 {

	@OriginalMember(owner = "client!rfa", name = "x", descriptor = "B")
	public byte aByte127;

	@OriginalMember(owner = "client!rfa", name = "k", descriptor = "[Lclient!bca;")
	public Class34[] aClass34Array1;

	@OriginalMember(owner = "client!rfa", name = "p", descriptor = "[I")
	private int[] anIntArray644;

	@OriginalMember(owner = "client!rfa", name = "D", descriptor = "J")
	public long aLong256;

	@OriginalMember(owner = "client!rfa", name = "C", descriptor = "B")
	public byte aByte128;

	@OriginalMember(owner = "client!rfa", name = "m", descriptor = "Z")
	private boolean aBoolean632;

	@OriginalMember(owner = "client!rfa", name = "A", descriptor = "Z")
	private boolean aBoolean633 = true;

	@OriginalMember(owner = "client!rfa", name = "t", descriptor = "I")
	public int anInt8286 = 0;

	@OriginalMember(owner = "client!rfa", name = "s", descriptor = "Ljava/lang/String;")
	public String aString101 = null;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class2_Sub47(@OriginalArg(0) Packet arg0) {
		this.method7274(arg0);
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)[I")
	public int[] method7272() {
		if (this.anIntArray644 == null) {
			this.anIntArray644 = new int[this.anInt8286];
			@Pc(17) String[] local17 = new String[this.anInt8286];
			@Pc(19) int local19 = 0;
			while (this.anInt8286 > local19) {
				local17[local19] = this.aClass34Array1[local19].aString2;
				this.anIntArray644[local19] = local19++;
			}
			Static351.method5137(this.anIntArray644, local17);
		}
		return this.anIntArray644;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BLclient!bca;)V")
	public void method7273(@OriginalArg(1) Class34 arg0) {
		if (this.aClass34Array1 == null || this.aClass34Array1.length <= this.anInt8286) {
			this.method7275(this.anInt8286 + 5);
		}
		this.aClass34Array1[this.anInt8286++] = arg0;
		this.anIntArray644 = null;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILclient!ge;)V")
	private void method7274(@OriginalArg(1) Packet arg0) {
		@Pc(9) int local9 = arg0.g1();
		if ((local9 & 0x2) != 0) {
			this.aBoolean633 = true;
		}
		if ((local9 & 0x1) != 0) {
			this.aBoolean632 = true;
		}
		super.aLong328 = arg0.g8();
		this.aLong256 = arg0.g8();
		this.aString101 = arg0.gjstr();
		arg0.g1();
		this.aByte127 = arg0.g1b();
		this.aByte128 = arg0.g1b();
		this.anInt8286 = arg0.g2();
		if (this.anInt8286 <= 0) {
			return;
		}
		this.aClass34Array1 = new Class34[this.anInt8286];
		for (@Pc(82) int local82 = 0; local82 < this.anInt8286; local82++) {
			@Pc(88) Class34 local88 = new Class34();
			if (this.aBoolean632) {
				arg0.g8();
			}
			if (this.aBoolean633) {
				local88.aString2 = arg0.gjstr();
			}
			local88.aByte9 = arg0.g1b();
			local88.anInt783 = arg0.g2();
			this.aClass34Array1[local82] = local88;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BI)V")
	private void method7275(@OriginalArg(1) int arg0) {
		if (this.aClass34Array1 == null) {
			this.aClass34Array1 = new Class34[arg0];
		} else {
			Static734.method7691(this.aClass34Array1, 0, this.aClass34Array1 = new Class34[arg0], 0, this.anInt8286);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)V")
	public void method7277(@OriginalArg(0) int arg0) {
		this.anInt8286--;
		if (this.anInt8286 == 0) {
			this.aClass34Array1 = null;
		} else {
			Static734.method7691(this.aClass34Array1, arg0 + 1, this.aClass34Array1, arg0, this.anInt8286 - arg0);
		}
		this.anIntArray644 = null;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method7278(@OriginalArg(0) String arg0) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt8286; local13++) {
			if (this.aClass34Array1[local13].aString2.equalsIgnoreCase(arg0)) {
				return local13;
			}
		}
		return -1;
	}
}
