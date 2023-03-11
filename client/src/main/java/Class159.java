import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class159 {

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
	public int anInt4048 = 0;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "Z")
	public boolean aBoolean267 = false;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Lclient!ib;")
	public Class2_Sub18 aClass2_Sub18_1 = null;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "Z")
	public boolean aBoolean266 = false;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "[S")
	public short[] aShortArray82;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "[S")
	public short[] aShortArray81;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "[S")
	public short[] aShortArray87;

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "[S")
	public short[] aShortArray88;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "[S")
	public short[] aShortArray89;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([BLclient!ib;)V")
	public Class159(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub18 arg1) {
		this.aClass2_Sub18_1 = arg1;
		try {
			@Pc(21) Class2_Sub4 local21 = new Class2_Sub4(arg0);
			@Pc(26) Class2_Sub4 local26 = new Class2_Sub4(arg0);
			local21.anInt5300 = 2;
			@Pc(33) int local33 = local21.method4815();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.anInt5300 = local21.anInt5300 + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.aClass2_Sub18_1.anIntArray168[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.method4815();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					Static229.aShortArray86[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						Static229.aShortArray83[local35] = local75;
					} else {
						Static229.aShortArray83[local35] = (short) local26.method4818();
					}
					if ((local62 & 0x2) == 0) {
						Static229.aShortArray84[local35] = local75;
					} else {
						Static229.aShortArray84[local35] = (short) local26.method4818();
					}
					if ((local62 & 0x4) == 0) {
						Static229.aShortArray85[local35] = local75;
					} else {
						Static229.aShortArray85[local35] = (short) local26.method4818();
					}
					Static229.aByteArray43[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						Static229.aShortArray83[local35] = (short) (((Static229.aShortArray83[local35] & 0xFF) << 3) + (Static229.aShortArray83[local35] >> 8 & 0x7));
						Static229.aShortArray84[local35] = (short) (((Static229.aShortArray84[local35] & 0xFF) << 3) + (Static229.aShortArray84[local35] >> 8 & 0x7));
						Static229.aShortArray85[local35] = (short) (((Static229.aShortArray85[local35] & 0xFF) << 3) + (Static229.aShortArray85[local35] >> 8 & 0x7));
						Static229.aShortArray83[local35] = (short) (Static229.aShortArray83[local35] << 3);
						Static229.aShortArray84[local35] = (short) (Static229.aShortArray84[local35] << 3);
						Static229.aShortArray85[local35] = (short) (Static229.aShortArray85[local35] << 3);
					}
					Static229.aShortArray80[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							Static229.aShortArray80[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.aBoolean267 = true;
					} else if (local54 == 7) {
						this.aBoolean266 = true;
					}
					local35++;
				}
			}
			if (local26.anInt5300 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt4048 = local35;
			this.aShortArray82 = new short[local35];
			this.aShortArray81 = new short[local35];
			this.aShortArray87 = new short[local35];
			this.aShortArray88 = new short[local35];
			this.aShortArray89 = new short[local35];
			this.aByteArray44 = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.aShortArray82[local54] = Static229.aShortArray86[local54];
				this.aShortArray81[local54] = Static229.aShortArray83[local54];
				this.aShortArray87[local54] = Static229.aShortArray84[local54];
				this.aShortArray88[local54] = Static229.aShortArray85[local54];
				this.aShortArray89[local54] = Static229.aShortArray80[local54];
				this.aByteArray44[local54] = Static229.aByteArray43[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.anInt4048 = 0;
			this.aBoolean267 = false;
			this.aBoolean266 = false;
		}
	}
}
