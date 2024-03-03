import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class FloType {

	@OriginalMember(owner = "client!mg", name = "A", descriptor = "[B")
	public static final byte[] aByteArray39;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "Lclient!fl;")
	public FloTypeList aClass72_4;

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
	public int anInt3764 = 127;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "Z")
	public boolean aBoolean246 = true;

	@OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
	public int waterOpacity = 16;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "Z")
	public boolean occludeUnderlay = true;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
	public int anInt3759 = -1;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
	public int anInt3763 = 128;

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
	public int waterColor = 1190717;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Z")
	public boolean blendTexture = false;

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
	public int baseColor = 0;

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
	public int textureBrightness = 8;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
	public int secondaryColor = -1;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
	public int texture = -1;

	static {
		@Pc(20) int local20 = 0;
		aByteArray39 = new byte[32896];
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			for (@Pc(28) int local28 = 0; local28 <= local25; local28++) {
				aByteArray39[local20++] = (byte) (255.0D / Math.sqrt((double) ((float) (local25 * local25 + local28 * local28 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)I")
	public static int method2101(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : ColorUtils.rgbToHsl(arg0);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!bt;Z)V")
	private void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Packet buf) {
		if (arg0 == 1) {
			this.baseColor = method2101(buf.g3());
		} else if (arg0 == 2) {
			this.texture = buf.g1();
		} else if (arg0 == 3) {
			this.texture = buf.g2();
			if (this.texture == 65535) {
				this.texture = -1;
			}
		} else if (arg0 == 5) {
			this.occludeUnderlay = false;
		} else if (arg0 == 7) {
			this.secondaryColor = method2101(buf.g3());
		} else if (arg0 == 8) {
			this.aClass72_4.anInt2060 = this.id;
		} else if (arg0 == 9) {
			this.anInt3763 = buf.g2();
		} else if (arg0 == 10) {
			this.aBoolean246 = false;
		} else if (arg0 == 11) {
			this.textureBrightness = buf.g1();
		} else if (arg0 == 12) {
			this.blendTexture = true;
		} else if (arg0 == 13) {
			this.waterColor = buf.g3();
		} else if (arg0 == 14) {
			this.waterOpacity = buf.g1();
		} else if (arg0 == 15) {
			this.anInt3759 = buf.g2();
			if (this.anInt3759 == 65535) {
				this.anInt3759 = -1;
			}
		} else if (arg0 == 16) {
			this.anInt3764 = buf.g1();
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public void method3716() {
		if (this.anInt3759 == -1) {
			this.anInt3759 = this.texture;
		}
		this.textureBrightness = this.id | this.textureBrightness << 8;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!bt;)V")
	public void decode(@OriginalArg(1) Packet arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.decode(local5, arg0);
		}
	}
}
