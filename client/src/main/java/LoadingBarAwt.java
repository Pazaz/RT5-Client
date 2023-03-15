import org.openrs2.deob.annotation.OriginalMember;

import java.awt.*;

public class LoadingBarAwt {

	@OriginalMember(owner = "client!et", name = "m", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;
	@OriginalMember(owner = "client!eu", name = "B", descriptor = "Ljava/awt/Font;")
	public static Font aFont3;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
	public static void clear() {
		anImage1 = null;
		aFont3 = null;
	}

}
