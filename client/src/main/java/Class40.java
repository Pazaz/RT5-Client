import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bha")
public final class Class40 {

	@OriginalMember(owner = "client!bha", name = "e", descriptor = "[I")
	public int[] anIntArray70;

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!bha", name = "d", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!bha", name = "g", descriptor = "I")
	public int anInt988;

	@OriginalMember(owner = "client!bha", name = "f", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!bha", name = "i", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!bha", name = "h", descriptor = "Lclient!ge;")
	private final Packet aPacket_3 = new Packet((byte[]) null);

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "()V")
	public Class40() {
	}

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "([B)V")
	public Class40(@OriginalArg(0) byte[] arg0) {
		this.method1061(arg0);
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "()Z")
	public boolean method1055() {
		return this.aPacket_3.data != null;
	}

	@OriginalMember(owner = "client!bha", name = "c", descriptor = "(I)J")
	public long method1056(@OriginalArg(0) int arg0) {
		return this.aLong31 + (long) arg0 * (long) this.anInt989;
	}

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "(I)I")
	public int method1057(@OriginalArg(0) int arg0) {
		return this.method1067(arg0);
	}

	@OriginalMember(owner = "client!bha", name = "f", descriptor = "(I)V")
	public void method1058(@OriginalArg(0) int arg0) {
		this.anIntArray72[arg0] = this.aPacket_3.pos;
	}

	@OriginalMember(owner = "client!bha", name = "f", descriptor = "()V")
	public void method1059() {
		this.aPacket_3.data = null;
		this.anIntArray71 = null;
		this.anIntArray72 = null;
		this.anIntArray70 = null;
		this.anIntArray73 = null;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(II)I")
	private int method1060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static43.aByteArray11[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aPacket_3.g1() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aPacket_3.g1() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aPacket_3.g1();
		local12 = this.aPacket_3.gVarInt();
		if (local7 == 47) {
			this.aPacket_3.pos += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aPacket_3.g3();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray70[arg0];
			this.aLong31 += (long) local38 * (long) (this.anInt989 - local32);
			this.anInt989 = local32;
			this.aPacket_3.pos += local12;
			return 2;
		} else {
			this.aPacket_3.pos += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "([B)V")
	public void method1061(@OriginalArg(0) byte[] arg0) {
		this.aPacket_3.data = arg0;
		this.aPacket_3.pos = 10;
		@Pc(12) int local12 = this.aPacket_3.g2();
		this.anInt988 = this.aPacket_3.g2();
		this.anInt989 = 500000;
		this.anIntArray71 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aPacket_3.g4();
			@Pc(38) int local38 = this.aPacket_3.g4();
			if (local33 == 1297379947) {
				this.anIntArray71[local27] = this.aPacket_3.pos;
				local27++;
			}
			this.aPacket_3.pos += local38;
		}
		this.aLong31 = 0L;
		this.anIntArray72 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray72[local33] = this.anIntArray71[local33];
		}
		this.anIntArray70 = new int[local12];
		this.anIntArray73 = new int[local12];
	}

	@OriginalMember(owner = "client!bha", name = "c", descriptor = "()I")
	public int method1062() {
		@Pc(3) int local3 = this.anIntArray72.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray72[local9] >= 0 && this.anIntArray70[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray70[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(I)V")
	public void method1063(@OriginalArg(0) int arg0) {
		this.aPacket_3.pos = this.anIntArray72[arg0];
	}

	@OriginalMember(owner = "client!bha", name = "d", descriptor = "()V")
	public void method1064() {
		this.aPacket_3.pos = -1;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(J)V")
	public void method1066(@OriginalArg(0) long arg0) {
		this.aLong31 = arg0;
		@Pc(6) int local6 = this.anIntArray72.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray70[local8] = 0;
			this.anIntArray73[local8] = 0;
			this.aPacket_3.pos = this.anIntArray71[local8];
			this.method1069(local8);
			this.anIntArray72[local8] = this.aPacket_3.pos;
		}
	}

	@OriginalMember(owner = "client!bha", name = "d", descriptor = "(I)I")
	private int method1067(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aPacket_3.data[this.aPacket_3.pos];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray73[arg0] = local13;
			this.aPacket_3.pos++;
		} else {
			local13 = this.anIntArray73[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1060(arg0, local13);
		}
		@Pc(42) int local42 = this.aPacket_3.gVarInt();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aPacket_3.data[this.aPacket_3.pos] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aPacket_3.pos++;
				this.anIntArray73[arg0] = local57;
				return this.method1060(arg0, local57);
			}
		}
		this.aPacket_3.pos += local42;
		return 0;
	}

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "()Z")
	public boolean method1068() {
		@Pc(3) int local3 = this.anIntArray72.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray72[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bha", name = "e", descriptor = "(I)V")
	public void method1069(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aPacket_3.gVarInt();
		this.anIntArray70[arg0] += local4;
	}

	@OriginalMember(owner = "client!bha", name = "g", descriptor = "()I")
	public int method1070() {
		return this.anIntArray72.length;
	}
}
