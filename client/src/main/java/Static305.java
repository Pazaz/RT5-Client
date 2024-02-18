import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "F")
	public static float aFloat86;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
	public static int anInt4883;

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "J")
	public static long aLong157;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_129 = new Class225(134, 1);

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
	public static int anInt4882 = 0;

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "Z")
	public static boolean aBoolean371 = false;

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_60 = new Class345(67, 3);

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "Z")
	public static boolean aBoolean372 = false;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!ge;B)Lclient!qba;")
	public static Class154_Sub4 method4437(@OriginalArg(0) Packet arg0) {
		return new Class154_Sub4(arg0.g2s(), arg0.g2s(), arg0.g2s(), arg0.g2s(), arg0.g3(), arg0.g1());
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;B)V")
	public static void method4439(@OriginalArg(0) int arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) String arg4) {
		try {
			@Pc(6) Graphics local6 = Static434.aCanvas7.getGraphics();
			if (Static589.aFont1 == null) {
				Static589.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			@Pc(73) int local73;
			try {
				if (Static103.anImage1 == null) {
					Static103.anImage1 = Static434.aCanvas7.createImage(Static680.anInt10289, Static380.anInt5979);
				}
				@Pc(58) Graphics local58 = Static103.anImage1.getGraphics();
				local58.setColor(Color.black);
				local58.fillRect(0, 0, Static680.anInt10289, Static380.anInt5979);
				local73 = Static680.anInt10289 / 2 - 152;
				@Pc(79) int local79 = Static380.anInt5979 / 2 - 18;
				local58.setColor(arg1);
				local58.drawRect(local73, local79, 303, 33);
				local58.setColor(arg3);
				local58.fillRect(local73 + 2, local79 + 2, arg0 * 3, 30);
				local58.setColor(Color.black);
				local58.drawRect(local73 + 1, local79 - -1, 301, 31);
				local58.fillRect(local73 + arg0 * 3 + 2, local79 + 2, 300 - arg0 * 3, 30);
				local58.setFont(Static589.aFont1);
				local58.setColor(arg2);
				local58.drawString(arg4, (304 - arg4.length() * 6) / 2 + local73, local79 + 22);
				if (Static484.aString85 != null) {
					local58.setFont(Static589.aFont1);
					local58.setColor(arg2);
					local58.drawString(Static484.aString85, Static680.anInt10289 / 2 - Static484.aString85.length() * 6 / 2, Static380.anInt5979 / 2 + -26);
				}
				local6.drawImage(Static103.anImage1, 0, 0, (ImageObserver) null);
			} catch (@Pc(205) Exception local205) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static680.anInt10289, Static380.anInt5979);
				@Pc(220) int local220 = Static680.anInt10289 / 2 - 152;
				local73 = Static380.anInt5979 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(local220, local73, 303, 33);
				local6.setColor(arg3);
				local6.fillRect(local220 + 2, local73 + 2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local220 + 1, local73 + 1, 301, 31);
				local6.fillRect(local220 + arg0 * 3 + 2, local73 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static589.aFont1);
				local6.setColor(arg2);
				if (Static484.aString85 != null) {
					local6.setFont(Static589.aFont1);
					local6.setColor(arg2);
					local6.drawString(Static484.aString85, Static680.anInt10289 / 2 - Static484.aString85.length() * 6 / 2, Static380.anInt5979 / 2 + -26);
				}
				local6.drawString(arg4, local220 + (304 - arg4.length() * 6) / 2, local73 + 22);
			}
		} catch (@Pc(336) Exception local336) {
			Static434.aCanvas7.repaint();
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
	public static void method4441() {
		for (@Pc(12) int local12 = 0; local12 < Static280.aByteArrayArrayArray3.length; local12++) {
			for (@Pc(15) int local15 = 0; local15 < Static280.aByteArrayArrayArray3[0].length; local15++) {
				for (@Pc(18) int local18 = 0; local18 < Static280.aByteArrayArrayArray3[0][0].length; local18++) {
					Static280.aByteArrayArrayArray3[local12][local15][local18] = 0;
				}
			}
		}
	}
}
