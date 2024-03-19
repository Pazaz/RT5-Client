import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class53_Sub1 extends Class53 implements ImageProducer {

	@OriginalMember(owner = "client!tp", name = "p", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!tp", name = "t", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!tp", name = "v", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!tp", name = "C", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIII)V")
	private synchronized void method5416(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg0, arg3, arg2, this.aColorModel1, super.anIntArray536, arg0 * super.anInt6565 + arg1, super.anInt6565);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIBLjava/awt/Graphics;II)V")
	@Override
	public void method5602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5416(arg4, arg3, arg0, arg1);
		@Pc(13) Shape local13 = arg2.getClip();
		arg2.clipRect(arg3, arg4, arg1, arg0);
		arg2.drawImage(this.anImage2, 0, 0, this.aCanvas4);
		arg2.setClip(local13);
	}

	@OriginalMember(owner = "client!tp", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!tp", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt6565, super.anInt6564);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!tp", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
	private synchronized void method5417() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt6565, super.anInt6564, this.aColorModel1, super.anIntArray536, 0, super.anInt6565);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!tp", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!tp", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method5600(@OriginalArg(3) Graphics arg0) {
		this.method5417();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas4);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method5603(@OriginalArg(0) Canvas arg0) {
		this.aCanvas4 = arg0;
		super.anInt6565 = this.aCanvas4.getSize().width;
		super.anInt6564 = this.aCanvas4.getSize().height;
		super.anIntArray536 = new int[super.anInt6565 * super.anInt6564];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas4.createImage(this);
		this.method5417();
		this.aCanvas4.prepareImage(this.anImage2, this.aCanvas4);
		this.method5417();
		this.aCanvas4.prepareImage(this.anImage2, this.aCanvas4);
		this.method5417();
		this.aCanvas4.prepareImage(this.anImage2, this.aCanvas4);
	}
}
