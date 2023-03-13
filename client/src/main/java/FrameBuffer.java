import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public abstract class FrameBuffer {

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
	public int anInt5654;

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "[I")
	public int[] anIntArray385;

	@OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
	public int anInt5658;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/awt/Canvas;I)Lclient!tr;")
	public static FrameBuffer create(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("BufferedImageFrameBuffer");
			@Pc(15) FrameBuffer local15 = (FrameBuffer) local11.getDeclaredConstructor().newInstance();
			local15.method5150(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) ImageProducerFrameBuffer local26 = new ImageProducerFrameBuffer();
			local26.method5150(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public abstract void method5150(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	public abstract void method5151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public abstract void method5152(@OriginalArg(0) Graphics arg0);
}
