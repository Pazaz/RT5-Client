import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class197 {

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "Z")
	public boolean aBoolean458 = false;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "Lclient!jp;")
	public Class1_Sub18 aClass1_Sub18_1 = null;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "Z")
	public boolean aBoolean459 = false;

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "I")
	public int anInt6397 = 0;

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "[S")
	public short[] aShortArray100;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "[S")
	public short[] aShortArray104;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "[S")
	public short[] aShortArray99;

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "[S")
	public short[] aShortArray103;

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "[S")
	public short[] aShortArray105;

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "[B")
	public byte[] aByteArray77;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "([BLclient!jp;)V")
	public Class197(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub18 arg1) {
		this.aClass1_Sub18_1 = arg1;
		try {
			@Pc(21) Class1_Sub16 local21 = new Class1_Sub16(arg0);
			@Pc(26) Class1_Sub16 local26 = new Class1_Sub16(arg0);
			local21.anInt6813 = 2;
			@Pc(33) int local33 = local21.method5761();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.anInt6813 = local21.anInt6813 + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass1_Sub18_1.anIntArray259[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method5761();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static306.aShortArray107[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static306.aShortArray98[local35] = local75;
					} else {
						Static306.aShortArray98[local35] = (short) local26.method5781();
					}
					if ((local62 & 0x2) == 0) {
						Static306.aShortArray106[local35] = local75;
					} else {
						Static306.aShortArray106[local35] = (short) local26.method5781();
					}
					if ((local62 & 0x4) == 0) {
						Static306.aShortArray101[local35] = local75;
					} else {
						Static306.aShortArray101[local35] = (short) local26.method5781();
					}
					Static306.aByteArray76[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static306.aShortArray98[local35] = (short) (((Static306.aShortArray98[local35] & 0xFF) << 3) + (Static306.aShortArray98[local35] >> 8 & 0x7));
						Static306.aShortArray106[local35] = (short) (((Static306.aShortArray106[local35] & 0xFF) << 3) + (Static306.aShortArray106[local35] >> 8 & 0x7));
						Static306.aShortArray101[local35] = (short) (((Static306.aShortArray101[local35] & 0xFF) << 3) + (Static306.aShortArray101[local35] >> 8 & 0x7));
						Static306.aShortArray98[local35] = (short) (Static306.aShortArray98[local35] << 3);
						Static306.aShortArray106[local35] = (short) (Static306.aShortArray106[local35] << 3);
						Static306.aShortArray101[local35] = (short) (Static306.aShortArray101[local35] << 3);
					}
					Static306.aShortArray102[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static306.aShortArray102[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.aBoolean458 = true;
					} else if (local54 == 7) {
						this.aBoolean459 = true;
					}
					local35++;
				}
			}
			if (local26.anInt6813 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt6397 = local35;
			this.aShortArray100 = new short[local35];
			this.aShortArray104 = new short[local35];
			this.aShortArray99 = new short[local35];
			this.aShortArray103 = new short[local35];
			this.aShortArray105 = new short[local35];
			this.aByteArray77 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray100[local54] = Static306.aShortArray107[local54];
				this.aShortArray104[local54] = Static306.aShortArray98[local54];
				this.aShortArray99[local54] = Static306.aShortArray106[local54];
				this.aShortArray103[local54] = Static306.aShortArray101[local54];
				this.aShortArray105[local54] = Static306.aShortArray102[local54];
				this.aByteArray77[local54] = Static306.aByteArray76[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt6397 = 0;
			this.aBoolean458 = false;
			this.aBoolean459 = false;
		}
	}
}
