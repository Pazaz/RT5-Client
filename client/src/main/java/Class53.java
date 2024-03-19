import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class Class53 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "[I")
	public int[] anIntArray536;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "I")
	public int anInt6564;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "I")
	public int anInt6565;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public abstract void method5600(@OriginalArg(3) Graphics arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIBLjava/awt/Graphics;II)V")
	public abstract void method5602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public abstract void method5603(@OriginalArg(0) Canvas arg0);
}
