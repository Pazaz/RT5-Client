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

@OriginalClass("client!rt")
public final class Class327 {

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "[I")
	private static final int[] anIntArray679 = new int[256];

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
	private int anInt8496;

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
	private int anInt8498;

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "Z")
	private boolean aBoolean653 = false;

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "[I")
	private final int[] anIntArray680 = new int[4];

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "[Lclient!st;")
	private final Class23[] aClass23Array13;

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "[I")
	private final int[] anIntArray678;

	static {
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(31) int local31 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".indexOf(local24);
			if (local31 == -1) {
				local31 = 74;
			}
			anIntArray679[local24] = local31;
		}
	}

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lclient!ha;IZLjava/awt/Component;)V")
	public Class327(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Component arg3) {
		this.aBoolean653 = false;
		this.aClass23Array13 = new Class23[256];
		this.anIntArray678 = new int[256];
		@Pc(32) Font local32 = new Font("Helvetica", 1, arg1);
		@Pc(36) FontMetrics local36 = arg3.getFontMetrics(local32);
		for (@Pc(38) int local38 = 0; local38 < Static568.anInt8497; local38++) {
			this.method7541(arg0, local32, local36, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(local38), local38, false);
		}
		if (this.aBoolean653) {
			this.aBoolean653 = false;
			local32 = new Font("Helvetica", 0, arg1);
			local36 = arg3.getFontMetrics(local32);
			for (@Pc(78) int local78 = 0; local78 < Static568.anInt8497; local78++) {
				this.method7541(arg0, local32, local36, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(local78), local78, false);
			}
			if (!this.aBoolean653) {
				this.aBoolean653 = false;
				for (@Pc(103) int local103 = 0; local103 < Static568.anInt8497; local103++) {
					this.method7541(arg0, local32, local36, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(local103), local103, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "()I")
	public int method7536() {
		return this.anInt8498 - 1;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!ha;Ljava/lang/String;[IIIIZ)V")
	private void method7537(@OriginalArg(0) Class19 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (arg5 == 0) {
			arg6 = false;
		}
		@Pc(7) int local7 = arg5 | 0xFF000000;
		for (@Pc(9) int local9 = 0; local9 < arg1.length(); local9++) {
			@Pc(16) int local16 = anIntArray679[arg1.charAt(local9)];
			if (arg6) {
				this.aClass23Array13[local16].method8197(arg3 + 1, arg4 + 1, 0, -16777216, 1);
			}
			this.aClass23Array13[local16].method8197(arg3, arg4, 0, local7, 1);
			arg3 += this.anIntArray678[local16];
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "()I")
	public int method7538() {
		return this.anInt8496;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/lang/String;)I")
	public int method7539(@OriginalArg(0) String arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0.length(); local3++) {
			@Pc(10) int local10 = anIntArray679[arg0.charAt(local3)];
			local1 += this.anIntArray678[local10];
		}
		return local1;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!ha;Ljava/lang/String;IIIZ)V")
	public void method7540(@OriginalArg(0) Class19 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = this.method7539(arg1) / 2;
		arg0.K(this.anIntArray680);
		if (arg2 - local5 <= this.anIntArray680[2] && (arg2 + local5 >= this.anIntArray680[0] && (arg3 - this.anInt8496 <= this.anIntArray680[3] && arg3 + this.anInt8498 >= this.anIntArray680[1]))) {
			this.method7537(arg0, arg1, this.anIntArray680, arg2 - local5, arg3, arg4, true);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!ha;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V")
	private void method7541(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Font arg1, @OriginalArg(2) FontMetrics arg2, @OriginalArg(3) char arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
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
			} catch (@Pc(63) Exception local63) {
			}
		}
		@Pc(67) int local67 = arg2.getMaxAscent();
		@Pc(73) int local73 = arg2.getMaxAscent() + arg2.getMaxDescent();
		@Pc(76) int local76 = arg2.getHeight();
		@Pc(81) Image local81 = Static434.aCanvas7.createImage(local3, local73);
		@Pc(84) Graphics local84 = local81.getGraphics();
		local84.setColor(Color.black);
		local84.fillRect(0, 0, local3, local73);
		local84.setColor(Color.white);
		local84.setFont(arg1);
		local84.drawString(String.valueOf(arg3), 0, local67);
		if (arg5) {
			local84.drawString(String.valueOf(arg3), 1, local67);
		}
		@Pc(120) int[] local120 = new int[local3 * local73];
		@Pc(132) PixelGrabber local132 = new PixelGrabber(local81, 0, 0, local3, local73, local120, 0, local3);
		try {
			local132.grabPixels();
		} catch (@Pc(137) Exception local137) {
		}
		local81.flush();
		@Pc(143) int local143 = 0;
		@Pc(148) int local148;
		label66: for (@Pc(145) int local145 = 0; local145 < local73; local145++) {
			for (local148 = 0; local148 < local3; local148++) {
				@Pc(157) int local157 = local120[local148 + local145 * local3];
				if ((local157 & 0xFFFFFF) != 0) {
					local143 = local145;
					break label66;
				}
			}
		}
		for (local148 = 0; local148 < local120.length; local148++) {
			if ((local120[local148] & 0xFFFFFF) == 0) {
				local120[local148] = 0;
			}
		}
		this.anInt8496 = local67 - local143;
		this.anInt8498 = local76;
		this.anIntArray678[arg4] = local5;
		this.aClass23Array13[arg4] = arg0.method7946(local3, local3, local73, local120);
	}
}
