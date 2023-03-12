import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!ju", name = "R", descriptor = "I")
	public static int anInt3298;

	@OriginalMember(owner = "client!ju", name = "S", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(BIIIII)V")
	public static void method3284(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = Static25.method861(Static365.anInt6832, arg3, Static161.anInt2954);
		@Pc(22) int local22 = Static25.method861(Static365.anInt6832, arg2, Static161.anInt2954);
		@Pc(28) int local28 = Static25.method861(Static28.anInt675, arg4, Static82.anInt1837);
		@Pc(34) int local34 = Static25.method861(Static28.anInt675, arg1, Static82.anInt1837);
		for (@Pc(36) int local36 = local16; local36 <= local22; local36++) {
			Static101.method2163(local34, Static357.anIntArrayArray58[local36], arg0, local28);
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(BIJI)V")
	public static void method3285(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg1 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg1 >> 20 & 0x3;
		@Pc(29) int local29 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static322.method5482(true, local10, arg0, 0, 0, arg2, 0, local22);
			return;
		}
		@Pc(59) LocType local59 = client.LocTypes.method5163(local29);
		@Pc(75) int local75;
		@Pc(72) int local72;
		if (local22 == 0 || local22 == 2) {
			local72 = local59.anInt1327;
			local75 = local59.anInt1356;
		} else {
			local72 = local59.anInt1356;
			local75 = local59.anInt1327;
		}
		@Pc(86) int local86 = local59.anInt1342;
		if (local22 != 0) {
			local86 = (local86 << local22 & 0xF) + (local86 >> 4 - local22);
		}
		Static322.method5482(true, 0, arg0, local86, local72, arg2, local75, 0);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ICI)I")
	public static int method3288(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local7 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(JIZZI)Ljava/lang/String;")
	public static String method3289(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg1 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg1 == 2) {
			local9 = ' ';
		}
		@Pc(25) boolean local25 = false;
		if (arg0 < 0L) {
			arg0 = -arg0;
			local25 = true;
		}
		@Pc(39) StringBuffer local39 = new StringBuffer(26);
		@Pc(46) int local46;
		@Pc(51) int local51;
		if (arg3 > 0) {
			for (local46 = 0; local46 < arg3; local46++) {
				local51 = (int) arg0;
				arg0 /= 10L;
				local39.append((char) (local51 + 48 - (int) arg0 * 10));
			}
			local39.append(local7);
		}
		local46 = 0;
		while (true) {
			local51 = (int) arg0;
			arg0 /= 10L;
			local39.append((char) (local51 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local25) {
					local39.append('-');
				}
				return local39.reverse().toString();
			}
			if (arg2) {
				local46++;
				if (local46 % 3 == 0) {
					local39.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Ljava/awt/Color;IZILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;)V")
	public static void method3290(@OriginalArg(0) Color arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) Color arg4, @OriginalArg(6) Color arg5) {
		try {
			@Pc(6) Graphics local6 = GameShell.canvas.getGraphics();
			if (Static90.aFont3 == null) {
				Static90.aFont3 = new Font("Helvetica", 1, 13);
			}
			if (arg1) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, GameShell.canvasWidth, GameShell.canvasHeight);
			}
			if (arg5 == null) {
				arg5 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(255, 255, 255);
			}
			try {
				if (Static89.anImage1 == null) {
					Static89.anImage1 = GameShell.canvas.createImage(304, 34);
				}
				@Pc(68) Graphics local68 = Static89.anImage1.getGraphics();
				local68.setColor(arg0);
				local68.drawRect(0, 0, 303, 33);
				local68.setColor(arg5);
				local68.fillRect(2, 2, arg2 * 3, 30);
				local68.setColor(Color.black);
				local68.drawRect(1, 1, 301, 31);
				local68.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local68.setFont(Static90.aFont3);
				local68.setColor(arg4);
				local68.drawString(arg3, (304 - arg3.length() * 6) / 2, 22);
				local6.drawImage(Static89.anImage1, GameShell.canvasWidth / 2 - 152, GameShell.canvasHeight / 2 + -18, null);
			} catch (@Pc(146) Exception local146) {
				@Pc(152) int local152 = GameShell.canvasWidth / 2 - 152;
				@Pc(158) int local158 = GameShell.canvasHeight / 2 - 18;
				local6.setColor(arg0);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg5);
				local6.fillRect(local152 + 2, local158 - -2, arg2 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local152 + 1, local158 + 1, 301, 31);
				local6.fillRect(arg2 * 3 + local152 + 2, local158 + 2, 300 - arg2 * 3, 30);
				local6.setFont(Static90.aFont3);
				local6.setColor(arg4);
				local6.drawString(arg3, local152 + (304 - arg3.length() * 6) / 2, local158 + 22);
			}
			if (Static290.aString56 != null) {
				local6.setFont(Static90.aFont3);
				local6.setColor(arg4);
				local6.drawString(Static290.aString56, GameShell.canvasWidth / 2 - Static290.aString56.length() * 6 / 2, GameShell.canvasHeight / 2 + -26);
			}
		} catch (@Pc(267) Exception local267) {
			GameShell.canvas.repaint();
		}
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(B)Lclient!hi;")
	public static Class93 method3291() {
		try {
			return (Class93) Class.forName("Class93_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
