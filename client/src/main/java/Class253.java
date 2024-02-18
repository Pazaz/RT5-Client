import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class253 {

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "Z")
	public boolean aBoolean469 = false;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "Lclient!qda;")
	public Class2_Sub44 aClass2_Sub44_1 = null;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Z")
	public boolean aBoolean470 = false;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
	public int anInt6359 = 0;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "Z")
	public boolean aBoolean471 = false;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "[S")
	public short[] aShortArray87;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "[S")
	public short[] aShortArray93;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "[S")
	public short[] aShortArray94;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "[S")
	public short[] aShortArray89;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "[S")
	public short[] aShortArray86;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "[B")
	public byte[] aByteArray70;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "([BLclient!qda;)V")
	public Class253(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub44 arg1) {
		this.aClass2_Sub44_1 = arg1;
		try {
			@Pc(24) Class2_Sub21 local24 = new Class2_Sub21(arg0);
			@Pc(29) Class2_Sub21 local29 = new Class2_Sub21(arg0);
			local24.method7396();
			local24.anInt8388 += 2;
			@Pc(43) int local43 = local24.method7396();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt8388 = local24.anInt8388 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass2_Sub44_1.anIntArray619[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method7396();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static413.aShortArray92[local45] = (short) local57;
					@Pc(87) short local87 = 0;
					if (local64 == 3 || local64 == 10) {
						local87 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static413.aShortArray91[local45] = local87;
					} else {
						Static413.aShortArray91[local45] = (short) local29.method7360();
					}
					if ((local72 & 0x2) == 0) {
						Static413.aShortArray88[local45] = local87;
					} else {
						Static413.aShortArray88[local45] = (short) local29.method7360();
					}
					if ((local72 & 0x4) == 0) {
						Static413.aShortArray90[local45] = local87;
					} else {
						Static413.aShortArray90[local45] = (short) local29.method7360();
					}
					Static413.aByteArray69[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static413.aShortArray91[local45] = (short) (Static413.aShortArray91[local45] << 2 & 0x3FFF);
						Static413.aShortArray88[local45] = (short) (Static413.aShortArray88[local45] << 2 & 0x3FFF);
						Static413.aShortArray90[local45] = (short) (Static413.aShortArray90[local45] << 2 & 0x3FFF);
					}
					Static413.aShortArray95[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static413.aShortArray95[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean470 = true;
					} else if (local64 == 7) {
						this.aBoolean469 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean471 = true;
					}
					local45++;
				}
			}
			if (local29.anInt8388 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt6359 = local45;
			this.aShortArray87 = new short[local45];
			this.aShortArray93 = new short[local45];
			this.aShortArray94 = new short[local45];
			this.aShortArray89 = new short[local45];
			this.aShortArray86 = new short[local45];
			this.aByteArray70 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray87[local64] = Static413.aShortArray92[local64];
				this.aShortArray93[local64] = Static413.aShortArray91[local64];
				this.aShortArray94[local64] = Static413.aShortArray88[local64];
				this.aShortArray89[local64] = Static413.aShortArray90[local64];
				this.aShortArray86[local64] = Static413.aShortArray95[local64];
				this.aByteArray70[local64] = Static413.aByteArray69[local64];
			}
		} catch (@Pc(359) Exception local359) {
			this.anInt6359 = 0;
			this.aBoolean470 = false;
			this.aBoolean469 = false;
		}
	}
}
