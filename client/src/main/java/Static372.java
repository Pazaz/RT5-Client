import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
	public static void method6260() {
		if (GameShell.fullScreenFrame != null) {
			return;
		}
		@Pc(8) int local8 = GameShell.leftMargin;
		@Pc(15) int local15 = GameShell.topMargin;
		@Pc(22) int local22 = GameShell.frameWidth - local8 - GameShell.canvasWidth;
		@Pc(29) int local29 = GameShell.frameHeight - local15 - GameShell.canvasHeight;
		if (local8 <= 0 && local22 <= 0 && local15 <= 0 && local29 <= 0) {
			return;
		}
		try {
			@Pc(50) Container local50;
			if (GameShell.frame == null) {
				local50 = GameShell.signlink.applet;
			} else {
				local50 = GameShell.frame;
			}
			@Pc(57) int local57 = 0;
			@Pc(59) int local59 = 0;
			if (local50 == GameShell.frame) {
				@Pc(65) Insets local65 = GameShell.frame.getInsets();
				local59 = local65.top;
				local57 = local65.left;
			}
			@Pc(74) Graphics local74 = local50.getGraphics();
			local74.setColor(Color.black);
			if (local8 > 0) {
				local74.fillRect(local57, local59, local8, GameShell.frameHeight);
			}
			if (local15 > 0) {
				local74.fillRect(local57, local59, GameShell.frameWidth, local15);
			}
			if (local22 > 0) {
				local74.fillRect(local57 + GameShell.frameWidth - local22, local59, local22, GameShell.frameHeight);
			}
			if (local29 > 0) {
				local74.fillRect(local57, local59 + GameShell.frameHeight - local29, GameShell.frameWidth, local29);
				return;
			}
		} catch (@Pc(129) Exception local129) {
			return;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BII)V")
	public static void method6262(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) HashTable local10 = new HashTable(16);
		for (@Pc(15) Class2_Sub32 local15 = (Class2_Sub32) Static120.objStacks.head(); local15 != null; local15 = (Class2_Sub32) Static120.objStacks.next()) {
			local15.unlink();
			@Pc(26) int local26 = (int) (local15.key >> 28);
			@Pc(36) int local36 = (int) (local15.key >> 14 & 0x3FFFL) - arg0;
			@Pc(45) int local45 = (int) (local15.key & 0x3FFFL) - arg1;
			if (local45 >= 0 && local36 >= 0 && local45 < Static373.buildAreaLimitX && local36 < Static242.buildAreaLimitZ) {
				local10.put(local15, (long) (local26 << 28 | local36 << 14 | local45));
			}
		}
		Static120.objStacks = local10;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLclient!bt;)Lclient!rm;")
	public static Class173_Sub3 method6266(@OriginalArg(1) Buffer arg0) {
		return new Class173_Sub3(arg0.g2s(), arg0.g2s(), arg0.g2s(), arg0.g2s(), arg0.ig3(), arg0.ig3(), arg0.g1());
	}
}
