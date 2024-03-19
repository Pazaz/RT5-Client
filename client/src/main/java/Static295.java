import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "F")
	public static float aFloat75;

	@OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
	public static int anInt6177 = -1;

	@OriginalMember(owner = "client!ta", name = "Ab", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)Lclient!tc;")
	public static Class191 method5207(@OriginalArg(1) int arg0) {
		@Pc(15) Class191 local15 = (Class191) Static145.aClass215_54.method6057((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static36.aClass162_50.method4636(arg0, 4);
		local15 = new Class191();
		if (local25 != null) {
			local15.method5240(new Class1_Sub16(local25), arg0);
		}
		local15.method5238(arg0);
		Static145.aClass215_54.method6050(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IJ)V")
	public static void method5212(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static238.method4513(arg0 - 1L);
			Static238.method4513(1L);
		} else {
			Static238.method4513(arg0);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;IZLjava/lang/String;I)V")
	public static void method5215(@OriginalArg(0) Color arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) String arg5) {
		try {
			@Pc(6) Graphics local6 = Static86.aCanvas2.getGraphics();
			if (Static109.aFont1 == null) {
				Static109.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg4) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static107.anInt2674, Static350.anInt7318);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			try {
				if (Static199.anImage1 == null) {
					Static199.anImage1 = Static86.aCanvas2.createImage(304, 34);
				}
				@Pc(63) Graphics local63 = Static199.anImage1.getGraphics();
				local63.setColor(arg1);
				local63.drawRect(0, 0, 303, 33);
				local63.setColor(arg0);
				local63.fillRect(2, 2, arg3 * 3, 30);
				local63.setColor(Color.black);
				local63.drawRect(1, 1, 301, 31);
				local63.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
				local63.setFont(Static109.aFont1);
				local63.setColor(arg2);
				local63.drawString(arg5, (304 - arg5.length() * 6) / 2, 22);
				local6.drawImage(Static199.anImage1, Static107.anInt2674 / 2 - 152, Static350.anInt7318 / 2 + -18, null);
			} catch (@Pc(143) Exception local143) {
				@Pc(149) int local149 = Static107.anInt2674 / 2 - 152;
				@Pc(155) int local155 = Static350.anInt7318 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg0);
				local6.fillRect(local149 + 2, local155 + 2, arg3 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local149 + 1, local155 + 1, 301, 31);
				local6.fillRect(local149 + arg3 * 3 + 2, local155 + 2, 300 - arg3 * 3, 30);
				local6.setFont(Static109.aFont1);
				local6.setColor(arg2);
				local6.drawString(arg5, (304 - arg5.length() * 6) / 2 + local149, local155 + 22);
			}
			if (Static185.aString160 != null) {
				local6.setFont(Static109.aFont1);
				local6.setColor(arg2);
				local6.drawString(Static185.aString160, Static107.anInt2674 / 2 - Static185.aString160.length() * 6 / 2, Static350.anInt7318 / 2 + -26);
			}
		} catch (@Pc(262) Exception local262) {
			Static86.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!qj;Lclient!qj;I)V")
	public static void method5216(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class162 arg1) {
		Static213.aClass162_70 = arg1;
		Static160.aClass162_241 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)I")
	public static int method5220(@OriginalArg(1) int arg0) {
		@Pc(20) double local20 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(29) double local29 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(36) double local36 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(38) double local38 = local20;
		if (local20 > local29) {
			local38 = local29;
		}
		if (local38 > local36) {
			local38 = local36;
		}
		@Pc(52) double local52 = local20;
		if (local20 < local29) {
			local52 = local29;
		}
		if (local36 > local52) {
			local52 = local36;
		}
		@Pc(66) double local66 = 0.0D;
		@Pc(68) double local68 = 0.0D;
		@Pc(74) double local74 = (local52 + local38) / 2.0D;
		if (local52 != local38) {
			if (local74 < 0.5D) {
				local68 = (local52 - local38) / (local38 + local52);
			}
			if (local74 >= 0.5D) {
				local68 = (local52 - local38) / (2.0D - local52 - local38);
			}
			if (local52 == local20) {
				local66 = (local29 - local36) / (local52 - local38);
			} else if (local29 == local52) {
				local66 = (local36 - local20) / (local52 - local38) + 2.0D;
			} else if (local36 == local52) {
				local66 = (local20 - local29) / (-local38 + local52) + 4.0D;
			}
		}
		local66 /= 6.0D;
		@Pc(161) int local161 = (int) (local66 * 256.0D);
		@Pc(166) int local166 = (int) (local68 * 256.0D);
		if (local166 < 0) {
			local166 = 0;
		} else if (local166 > 255) {
			local166 = 255;
		}
		@Pc(184) int local184 = (int) (local74 * 256.0D);
		if (local184 < 0) {
			local184 = 0;
		} else if (local184 > 255) {
			local184 = 255;
		}
		if (local184 > 243) {
			local166 >>= 0x4;
		} else if (local184 > 217) {
			local166 >>= 0x3;
		} else if (local184 > 192) {
			local166 >>= 0x2;
		} else if (local184 > 179) {
			local166 >>= 0x1;
		}
		return (local166 >> 5 << 7) + (((local161 & 0xFF) >> 2 << 10) + (local184 >> 1));
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	public static void method5221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		@Pc(11) Class2_Sub8 local11 = new Class2_Sub8();
		local11.anInt6842 = arg2;
		local11.aString260 = arg5;
		local11.anInt6844 = arg4;
		local11.anInt6841 = arg0;
		local11.anInt6839 = Static197.anInt4521 + arg1;
		local11.anInt6837 = arg3;
		Static44.aClass58_3.method1670(local11);
	}
}
