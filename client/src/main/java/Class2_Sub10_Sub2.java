import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class2_Sub10_Sub2 extends Class2_Sub10 {

	@OriginalMember(owner = "client!on", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!on", name = "t", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!on", name = "q", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!on", name = "s", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V")
	private Class2_Sub10_Sub2() {
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIZLjava/awt/Graphics;III)V")
	@Override
	public void method6334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.height = arg4;
		this.aRectangle1.x = arg2;
		this.aRectangle1.y = arg5;
		this.aRectangle1.width = arg0;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage3, arg2 - arg1, arg5 - arg6, this.aCanvas8);
		arg3.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ZIILjava/awt/Canvas;)V")
	@Override
	public void method6332(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		this.aCanvas8 = arg2;
		this.aRectangle1 = new Rectangle();
		this.anInt7050 = arg1;
		this.anInt7053 = arg0;
		this.anIntArray567 = new int[this.anInt7050 * this.anInt7053];
		@Pc(39) DataBufferInt local39 = new DataBufferInt(this.anIntArray567, this.anIntArray567.length);
		@Pc(47) DirectColorModel local47 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(57) WritableRaster local57 = Raster.createWritableRaster(local47.createCompatibleSampleModel(this.anInt7053, this.anInt7050), local39, (Point) null);
		this.anImage3 = new BufferedImage(local47, local57, false, new Hashtable());
	}
}
