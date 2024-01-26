import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class353 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "Z")
	public boolean aBoolean716;

	@OriginalMember(owner = "client!th", name = "t", descriptor = "I")
	public int anInt9369;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "I")
	private int anInt9370;

	@OriginalMember(owner = "client!th", name = "h", descriptor = "I")
	private int anInt9371;

	@OriginalMember(owner = "client!th", name = "r", descriptor = "Lclient!lca;")
	public Class2_Sub7 aClass2_Sub7_3;

	@OriginalMember(owner = "client!th", name = "v", descriptor = "Z")
	public boolean aBoolean717;

	@OriginalMember(owner = "client!th", name = "k", descriptor = "I")
	private int anInt9377;

	@OriginalMember(owner = "client!th", name = "u", descriptor = "[S")
	public short[] aShortArray131;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "I")
	private int anInt9378;

	@OriginalMember(owner = "client!th", name = "l", descriptor = "I")
	private int anInt9379;

	@OriginalMember(owner = "client!th", name = "g", descriptor = "I")
	public int anInt9380;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	private Class353() {
		if (Static695.anIntArray868 == null) {
			Static344.method5043();
		}
		this.method8247();
	}

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!ha;Lclient!ge;I)V")
	public Class353(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2) {
		if (Static695.anIntArray868 == null) {
			Static344.method5043();
		}
		this.anInt9369 = arg1.method7396();
		this.aBoolean716 = (this.anInt9369 & 0x10) != 0;
		this.aBoolean717 = (this.anInt9369 & 0x8) != 0;
		this.anInt9369 &= 0x7;
		@Pc(47) int local47 = arg1.method7382() << arg2;
		@Pc(53) int local53 = arg1.method7382() << arg2;
		@Pc(59) int local59 = arg1.method7382() << arg2;
		@Pc(63) int local63 = arg1.method7396();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray131 = new short[local69];
		@Pc(85) int local85;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray131.length; local75++) {
			@Pc(81) short local81 = (short) arg1.method7382();
			local85 = local81 >>> 8;
			if (local85 >= local69) {
				local85 = local69 - 1;
			}
			@Pc(100) int local100 = local81 & 0xFF;
			if (local100 > local69 - local85) {
				local100 = local69 - local85;
			}
			this.aShortArray131[local75] = (short) (local100 | local85 << 8);
		}
		local63 = (local63 << Static52.anInt1066) + Static247.anInt3993;
		@Pc(160) int local160 = Static154.anIntArray237 == null ? Static323.anIntArray389[Static105.method2043(arg1.method7382()) & 0xFFFF] : Static154.anIntArray237[arg1.method7382()];
		local85 = arg1.method7396();
		this.anInt9371 = (local85 & 0xE0) << 3;
		this.anInt9380 = local85 & 0x1F;
		if (this.anInt9380 != 31) {
			this.method8247();
		}
		this.method8246(arg0, local53, local59, local47, local160, local63);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZIB)V")
	public void method8241(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(71) int local71;
		if (arg0) {
			local71 = 2048;
		} else {
			@Pc(27) int local27 = arg1 * this.anInt9377 / 50 + this.anInt9371 & 0x7FF;
			@Pc(30) int local30 = this.anInt9379;
			if (local30 == 1) {
				local71 = (Class361.anIntArray741[local27 << 3] >> 4) + 1024;
			} else if (local30 == 3) {
				local71 = Static695.anIntArray868[local27] >> 1;
			} else if (local30 == 4) {
				local71 = local27 >> 10 << 11;
			} else if (local30 == 2) {
				local71 = local27;
			} else if (local30 == 5) {
				local71 = (local27 < 1024 ? local27 : 2048 - local27) << 1;
			} else {
				local71 = 2048;
			}
		}
		this.aClass2_Sub7_3.method8433((float) ((this.anInt9370 * local71 >> 11) + this.anInt9378) / 2048.0F);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IBIII)V")
	public void method8244(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt9377 = arg3;
		this.anInt9378 = arg0;
		this.anInt9379 = arg1;
		this.anInt9370 = arg2;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	private void method8246(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass2_Sub7_3 = arg0.method7941(arg3, arg2, arg1, arg5, arg4, (float) 1);
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
	private void method8247() {
		@Pc(9) int local9 = this.anInt9380;
		if (local9 == 2) {
			this.anInt9377 = 2048;
			this.anInt9370 = 2048;
			this.anInt9379 = 1;
			this.anInt9378 = 0;
		} else if (local9 == 3) {
			this.anInt9377 = 4096;
			this.anInt9378 = 0;
			this.anInt9370 = 2048;
			this.anInt9379 = 1;
		} else if (local9 == 4) {
			this.anInt9378 = 0;
			this.anInt9379 = 4;
			this.anInt9370 = 2048;
			this.anInt9377 = 2048;
		} else if (local9 == 5) {
			this.anInt9377 = 8192;
			this.anInt9379 = 4;
			this.anInt9378 = 0;
			this.anInt9370 = 2048;
		} else if (local9 == 12) {
			this.anInt9379 = 2;
			this.anInt9370 = 2048;
			this.anInt9377 = 2048;
			this.anInt9378 = 0;
		} else if (local9 == 13) {
			this.anInt9370 = 2048;
			this.anInt9379 = 2;
			this.anInt9378 = 0;
			this.anInt9377 = 8192;
		} else if (local9 == 10) {
			this.anInt9370 = 512;
			this.anInt9378 = 1536;
			this.anInt9377 = 2048;
			this.anInt9379 = 3;
		} else if (local9 == 11) {
			this.anInt9377 = 4096;
			this.anInt9379 = 3;
			this.anInt9378 = 1536;
			this.anInt9370 = 512;
		} else if (local9 == 6) {
			this.anInt9378 = 1280;
			this.anInt9377 = 2048;
			this.anInt9379 = 3;
			this.anInt9370 = 768;
		} else if (local9 == 7) {
			this.anInt9379 = 3;
			this.anInt9378 = 1280;
			this.anInt9370 = 768;
			this.anInt9377 = 4096;
		} else if (local9 == 8) {
			this.anInt9377 = 2048;
			this.anInt9378 = 1024;
			this.anInt9379 = 3;
			this.anInt9370 = 1024;
		} else if (local9 == 9) {
			this.anInt9377 = 4096;
			this.anInt9378 = 1024;
			this.anInt9370 = 1024;
			this.anInt9379 = 3;
		} else if (local9 == 14) {
			this.anInt9379 = 1;
			this.anInt9370 = 768;
			this.anInt9377 = 2048;
			this.anInt9378 = 1280;
		} else if (local9 == 15) {
			this.anInt9379 = 1;
			this.anInt9370 = 512;
			this.anInt9378 = 1536;
			this.anInt9377 = 4096;
		} else if (local9 == 16) {
			this.anInt9379 = 1;
			this.anInt9377 = 8192;
			this.anInt9378 = 1792;
			this.anInt9370 = 256;
		} else {
			this.anInt9378 = 0;
			this.anInt9370 = 2048;
			this.anInt9379 = 0;
			this.anInt9377 = 2048;
		}
	}
}
