import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public abstract class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!cda", name = "p", descriptor = "I")
	public int anInt7050;

	@OriginalMember(owner = "client!cda", name = "n", descriptor = "[I")
	public int[] anIntArray567;

	@OriginalMember(owner = "client!cda", name = "o", descriptor = "I")
	public int anInt7053;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ZIILjava/awt/Canvas;)V")
	public abstract void method6332(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2);

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIIZLjava/awt/Graphics;III)V")
	public abstract void method6334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);
}
