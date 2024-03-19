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

@OriginalClass("client!uk")
public final class Class53_Sub2 extends Class53 {

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!uk", name = "o", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIBLjava/awt/Graphics;II)V")
	@Override
	public void method5602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg2.getClip();
		this.aRectangle1.height = arg0;
		this.aRectangle1.y = arg4;
		this.aRectangle1.x = arg3;
		this.aRectangle1.width = arg1;
		arg2.setClip(this.aRectangle1);
		arg2.drawImage(this.anImage3, 0, 0, this.aCanvas5);
		arg2.setClip(this.aShape1);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method5603(@OriginalArg(0) Canvas arg0) {
		this.aCanvas5 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt6565 = this.aCanvas5.getSize().width;
		this.anInt6564 = this.aCanvas5.getSize().height;
		this.anIntArray536 = new int[this.anInt6564 * this.anInt6565];
		@Pc(36) DataBufferInt local36 = new DataBufferInt(this.anIntArray536, this.anIntArray536.length);
		@Pc(52) DirectColorModel local52 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(62) WritableRaster local62 = Raster.createWritableRaster(local52.createCompatibleSampleModel(this.anInt6565, this.anInt6564), local36, null);
		this.anImage3 = new BufferedImage(local52, local62, false, new Hashtable());
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method5600(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas5);
	}
}
