import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class113 {

	@OriginalMember(owner = "client!je", name = "g", descriptor = "[I")
	private static final int[] anIntArray184 = new int[256];

	@OriginalMember(owner = "client!je", name = "a", descriptor = "I")
	private int anInt2912;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "I")
	private int anInt2914;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "[I")
	private final int[] anIntArray182 = new int[4];

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "[Lclient!jd;")
	private final Sprite[] aClass13Array14;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "[I")
	private final int[] anIntArray183;

	static {
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(12) int local12 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".indexOf(local7);
			if (local12 == -1) {
				local12 = 74;
			}
			anIntArray184[local7] = local12;
		}
	}

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!wm;IZLjava/awt/Component;)V")
	public Class113(@OriginalArg(0) TextureProvider arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Component arg3) {
		this.aBoolean205 = false;
		this.aClass13Array14 = new Sprite[256];
		this.anIntArray183 = new int[256];
		@Pc(30) Font local30 = new Font("Helvetica", 1, arg1);
		@Pc(34) FontMetrics local34 = arg3.getFontMetrics(local30);
		for (@Pc(36) int local36 = 0; local36 < Static159.anInt2913; local36++) {
			this.method2949(arg0, local30, local34, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(local36), local36, false);
		}
		if (this.aBoolean205) {
			this.aBoolean205 = false;
			local30 = new Font("Helvetica", 0, arg1);
			local34 = arg3.getFontMetrics(local30);
			for (@Pc(72) int local72 = 0; local72 < Static159.anInt2913; local72++) {
				this.method2949(arg0, local30, local34, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(local72), local72, false);
			}
			if (!this.aBoolean205) {
				this.aBoolean205 = false;
				for (@Pc(95) int local95 = 0; local95 < Static159.anInt2913; local95++) {
					this.method2949(arg0, local30, local34, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(local95), local95, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!wm;Ljava/lang/String;[IIIIZ)V")
	private void method2946(@OriginalArg(0) TextureProvider arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (arg5 == 0) {
			arg6 = false;
		}
		@Pc(7) int local7 = arg5 | 0xFF000000;
		for (@Pc(9) int local9 = 0; local9 < arg1.length(); local9++) {
			@Pc(16) int local16 = anIntArray184[arg1.charAt(local9)];
			if (arg6) {
				this.aClass13Array14[local16].method6401(arg3 + 1, arg4 + 1, 1, -16777216);
			}
			this.aClass13Array14[local16].method6401(arg3, arg4, 1, local7);
			arg3 += this.anIntArray183[local16];
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "()I")
	public int method2947() {
		return this.anInt2914;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "()I")
	public int method2948() {
		return this.anInt2912 - 1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!wm;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V")
	private void method2949(@OriginalArg(0) TextureProvider arg0, @OriginalArg(1) Font arg1, @OriginalArg(2) FontMetrics arg2, @OriginalArg(3) char arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) int local3 = arg2.charWidth(arg3);
		@Pc(5) int local5 = local3;
		if (arg5) {
			try {
				if (arg3 == '/') {
					arg5 = false;
				}
				if (arg3 == 'f' || arg3 == 't' || arg3 == 'w' || arg3 == 'v' || arg3 == 'k' || arg3 == 'x' || arg3 == 'y' || arg3 == 'A' || arg3 == 'V' || arg3 == 'W') {
					local3++;
				}
			} catch (@Pc(45) Exception local45) {
			}
		}
		@Pc(49) int local49 = arg2.getMaxAscent();
		@Pc(55) int local55 = arg2.getMaxAscent() + arg2.getMaxDescent();
		@Pc(58) int local58 = arg2.getHeight();
		@Pc(63) Image local63 = GameShell.canvas.createImage(local3, local55);
		@Pc(66) Graphics local66 = local63.getGraphics();
		local66.setColor(Color.black);
		local66.fillRect(0, 0, local3, local55);
		local66.setColor(Color.white);
		local66.setFont(arg1);
		local66.drawString(String.valueOf(arg3), 0, local49);
		if (arg5) {
			local66.drawString(String.valueOf(arg3), 1, local49);
		}
		@Pc(100) int[] local100 = new int[local3 * local55];
		@Pc(112) PixelGrabber local112 = new PixelGrabber(local63, 0, 0, local3, local55, local100, 0, local3);
		try {
			local112.grabPixels();
		} catch (@Pc(117) Exception local117) {
		}
		local63.flush();
		@Pc(123) int local123 = 0;
		@Pc(128) int local128;
		label66: for (@Pc(125) int local125 = 0; local125 < local55; local125++) {
			for (local128 = 0; local128 < local3; local128++) {
				@Pc(137) int local137 = local100[local128 + local125 * local3];
				if ((local137 & 0xFFFFFF) != 0) {
					local123 = local125;
					break label66;
				}
			}
		}
		for (local128 = 0; local128 < local100.length; local128++) {
			if ((local100[local128] & 0xFFFFFF) == 0) {
				local100[local128] = 0;
			}
		}
		this.anInt2914 = local49 - local123;
		this.anInt2912 = local58;
		this.anIntArray183[arg4] = local5;
		this.aClass13Array14[arg4] = arg0.method2884(local100, local3, local3, local55);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;)I")
	public int method2950(@OriginalArg(0) String arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0.length(); local3++) {
			@Pc(10) int local10 = anIntArray184[arg0.charAt(local3)];
			local1 += this.anIntArray183[local10];
		}
		return local1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!wm;Ljava/lang/String;IIIZ)V")
	public void method2951(@OriginalArg(0) TextureProvider arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = this.method2950(arg1) / 2;
		arg0.method2851(this.anIntArray182);
		if (arg2 - local5 <= this.anIntArray182[2] && (arg2 + local5 >= this.anIntArray182[0] && (arg3 - this.anInt2914 <= this.anIntArray182[3] && arg3 + this.anInt2912 >= this.anIntArray182[1]))) {
			this.method2946(arg0, arg1, this.anIntArray182, arg2 - local5, arg3, arg4, true);
		}
	}
}
