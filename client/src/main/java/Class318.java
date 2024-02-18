import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class318 {

	@OriginalMember(owner = "client!re", name = "e", descriptor = "Lclient!ef;")
	public Class96 aClass96_5;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "I")
	public int anInt8253;

	@OriginalMember(owner = "client!re", name = "s", descriptor = "I")
	public int anInt8249 = 0;

	@OriginalMember(owner = "client!re", name = "j", descriptor = "I")
	public int anInt8250 = 512;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Z")
	public boolean aBoolean626 = true;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	public int anInt8248 = -1;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "I")
	public int anInt8252 = 64;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "Z")
	public boolean aBoolean627 = true;

	@OriginalMember(owner = "client!re", name = "p", descriptor = "I")
	public int anInt8251 = 8;

	@OriginalMember(owner = "client!re", name = "m", descriptor = "I")
	public int anInt8256 = 127;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "I")
	public int anInt8255 = -1;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Z")
	public boolean aBoolean628 = false;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "I")
	public int anInt8260 = 1190717;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public void method7254() {
		this.anInt8251 = this.anInt8253 | this.anInt8251 << 8;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLclient!ge;)V")
	public void method7256(@OriginalArg(1) Packet arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.g1();
			if (local7 == 0) {
				return;
			}
			this.method7257(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLclient!ge;I)V")
	private void method7257(@OriginalArg(1) Packet arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8249 = Static579.method7633(arg0.g3());
		} else if (arg1 == 2) {
			this.anInt8255 = arg0.g1();
		} else if (arg1 == 3) {
			this.anInt8255 = arg0.g2();
			if (this.anInt8255 == 65535) {
				this.anInt8255 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean626 = false;
		} else if (arg1 == 7) {
			this.anInt8248 = Static579.method7633(arg0.g3());
		} else if (arg1 == 8) {
			this.aClass96_5.anInt2509 = this.anInt8253;
		} else if (arg1 == 9) {
			this.anInt8250 = arg0.g2() << 2;
		} else if (arg1 == 10) {
			this.aBoolean627 = false;
		} else if (arg1 == 11) {
			this.anInt8251 = arg0.g1();
		} else if (arg1 == 12) {
			this.aBoolean628 = true;
		} else if (arg1 == 13) {
			this.anInt8260 = arg0.g3();
		} else if (arg1 == 14) {
			this.anInt8252 = arg0.g1() << 2;
		} else if (arg1 == 16) {
			this.anInt8256 = arg0.g1();
		}
	}
}
