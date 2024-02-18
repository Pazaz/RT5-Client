import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public abstract class Class8_Sub2_Sub1 extends Class8_Sub2 {

	@OriginalMember(owner = "client!qf", name = "y", descriptor = "S")
	public short aShort132;

	@OriginalMember(owner = "client!qf", name = "E", descriptor = "S")
	public short aShort133;

	@OriginalMember(owner = "client!qf", name = "z", descriptor = "Z")
	public final boolean aBoolean815;

	@OriginalMember(owner = "client!qf", name = "I", descriptor = "B")
	public final byte aByte145;

	@OriginalMember(owner = "client!qf", name = "w", descriptor = "S")
	public short aShort134;

	@OriginalMember(owner = "client!qf", name = "A", descriptor = "S")
	public short aShort131;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class8_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aShort132 = (short) arg7;
		super.anInt10691 = arg3;
		super.aByte144 = (byte) arg0;
		this.aShort133 = (short) arg8;
		super.aByte143 = (byte) arg1;
		super.anInt10694 = arg4;
		super.anInt10690 = arg2;
		this.aBoolean815 = arg9;
		this.aByte145 = arg10;
		this.aShort134 = (short) arg6;
		this.aShort131 = (short) arg5;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([Lclient!lca;I)I")
	@Override
	public final int method9288(@OriginalArg(0) Class2_Sub7[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(21) int local21;
		@Pc(44) int local44;
		@Pc(57) int local57;
		label112: for (@Pc(16) int local16 = this.aShort131; local16 <= this.aShort134; local16++) {
			label110: for (local21 = this.aShort132; local21 <= this.aShort133; local21++) {
				@Pc(32) long local32 = Static161.aLongArrayArrayArray1[super.aByte144][local16][local21];
				@Pc(34) long local34 = 0L;
				while (true) {
					label105: while (true) {
						if (local34 > 48L) {
							continue label110;
						}
						local44 = (int) (local32 >>> (int) local34 & 0xFFFFL);
						if (local44 <= 0) {
							continue label110;
						}
						@Pc(55) Class353 local55 = Static265.aClass353Array1[local44 - 1];
						for (local57 = 0; local57 < local7; local57++) {
							if (arg0[local57] == local55.aClass2_Sub7_3) {
								local34 += 16L;
								continue label105;
							}
						}
						arg0[local7++] = local55.aClass2_Sub7_3;
						if (local7 == 4) {
							break label112;
						}
						local34 += 16L;
					}
				}
			}
		}
		for (local21 = local7; local21 < 4; local21++) {
			arg0[local21] = null;
		}
		if (this.aByte145 != 0) {
			local44 = this.aShort131 - Static403.anInt6246;
			@Pc(163) int local163 = this.aShort132 - Static550.anInt8271;
			@Pc(188) int local188;
			@Pc(191) short local191;
			@Pc(183) short local183;
			@Pc(180) int local180;
			if (this.aByte145 == 1) {
				if (local44 >= local163) {
					local188 = this.aShort132 + 1;
					local183 = this.aShort131;
					local180 = this.aShort131 - 1;
					local191 = this.aShort132;
				} else {
					local188 = this.aShort132 - 1;
					local183 = this.aShort131;
					local191 = this.aShort132;
					local180 = this.aShort131 + 1;
				}
			} else if (local163 > -local44) {
				local180 = this.aShort131 - 1;
				local183 = this.aShort131;
				local188 = this.aShort132 - 1;
				local191 = this.aShort132;
			} else {
				local180 = this.aShort131 + 1;
				local183 = this.aShort131;
				local188 = this.aShort132 + 1;
				local191 = this.aShort132;
			}
			label76: for (local57 = 0; local57 < local7; local57++) {
				@Pc(267) long local267 = Static161.aLongArrayArrayArray1[super.aByte144][local183][local188];
				@Pc(278) Class353 local278;
				while (local267 != 0L) {
					local278 = Static265.aClass353Array1[(int) ((local267 & 0xFFFFL) - 1L)];
					local267 >>>= 0x10;
					if (arg0[local57] == local278.aClass2_Sub7_3) {
						continue label76;
					}
				}
				local267 = Static161.aLongArrayArrayArray1[super.aByte144][local180][local191];
				while (local267 != 0L) {
					local278 = Static265.aClass353Array1[(int) ((local267 & 0xFFFFL) - 1L)];
					local267 >>>= 0x10;
					if (local278.aClass2_Sub7_3 == arg0[local57]) {
						continue label76;
					}
				}
				for (@Pc(342) int local342 = local57; local342 < local7 - 1; local342++) {
					arg0[local342] = arg0[local342 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLclient!ha;)Z")
	@Override
	public final boolean method9284(@OriginalArg(0) byte arg0, @OriginalArg(1) Class19 arg1) {
		if (arg0 != 59) {
			this.method9284((byte) -4, (Class19) null);
		}
		return Static15.method188(this.aShort132, this.aShort134, this.method9278(arg1, -115), this.aShort133, this.aShort131, super.aByte143);
	}

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method9275() {
		for (@Pc(16) int local16 = this.aShort131; local16 <= this.aShort134; local16++) {
			for (@Pc(23) int local23 = this.aShort132; local23 <= this.aShort133; local23++) {
				@Pc(32) int local32 = Static35.anInt813 + local16 - Static403.anInt6246;
				if (local32 >= 0 && local32 < Static258.aBooleanArrayArray3.length) {
					@Pc(58) int local58 = Static35.anInt813 + local23 - Static550.anInt8271;
					if (local58 >= 0 && local58 < Static258.aBooleanArrayArray3.length && Static258.aBooleanArrayArray3[local32][local58]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "(I)V")
	public void method9294() {
	}
}
