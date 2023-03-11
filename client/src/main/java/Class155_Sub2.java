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

@OriginalClass("client!rg")
public final class Class155_Sub2 extends Class155 {

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "Ljava/awt/Rectangle;")
	private Rectangle aRectangle1;

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "Ljava/awt/Shape;")
	private Shape aShape1;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	@Override
	public void method5150(@OriginalArg(0) Canvas arg0) {
		this.aCanvas5 = arg0;
		this.aRectangle1 = new Rectangle();
		this.anInt5654 = this.aCanvas5.getSize().width;
		this.anInt5658 = this.aCanvas5.getSize().height;
		this.anIntArray385 = new int[this.anInt5654 * this.anInt5658];
		@Pc(44) DataBufferInt local44 = new DataBufferInt(this.anIntArray385, this.anIntArray385.length);
		@Pc(52) DirectColorModel local52 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(62) WritableRaster local62 = Raster.createWritableRaster(local52.createCompatibleSampleModel(this.anInt5654, this.anInt5658), local44, null);
		this.anImage3 = new BufferedImage(local52, local62, false, new Hashtable());
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	@Override
	public void method5152(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas5);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public void method5151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		this.aShape1 = arg3.getClip();
		this.aRectangle1.width = arg4;
		this.aRectangle1.x = arg1;
		this.aRectangle1.y = arg2;
		this.aRectangle1.height = arg0;
		arg3.setClip(this.aRectangle1);
		arg3.drawImage(this.anImage3, 0, 0, this.aCanvas5);
		arg3.setClip(this.aShape1);
	}
}
