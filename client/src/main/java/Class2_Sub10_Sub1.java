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

@OriginalClass("client!ji")
public final class Class2_Sub10_Sub1 extends Class2_Sub10 implements ImageProducer {

	@OriginalMember(owner = "client!ji", name = "B", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!ji", name = "J", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!ji", name = "D", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!ji", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!ji", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIZLjava/awt/Graphics;III)V")
	@Override
	public void method6334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.method4383(arg1, arg6, arg4, arg0);
		@Pc(18) Shape local18 = arg3.getClip();
		arg3.clipRect(arg2, arg5, arg0, arg4);
		arg3.drawImage(this.anImage2, arg2 - arg1, -arg6 + arg5, this.aCanvas4);
		arg3.setClip(local18);
	}

	@OriginalMember(owner = "client!ji", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt7053, super.anInt7050);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZIILjava/awt/Canvas;)V")
	@Override
	public void method6332(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		super.anInt7050 = arg1;
		this.aCanvas4 = arg2;
		super.anInt7053 = arg0;
		super.anIntArray567 = new int[super.anInt7053 * super.anInt7050];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas4.createImage(this);
		this.method4384();
		this.aCanvas4.prepareImage(this.anImage2, this.aCanvas4);
		this.method4384();
		this.aCanvas4.prepareImage(this.anImage2, this.aCanvas4);
		this.method4384();
		this.aCanvas4.prepareImage(this.anImage2, this.aCanvas4);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIZI)V")
	private synchronized void method4383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg1, arg3, arg2, this.aColorModel1, super.anIntArray567, arg0 + arg1 * super.anInt7053, super.anInt7053);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ji", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	private synchronized void method4384() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt7053, super.anInt7050, this.aColorModel1, super.anIntArray567, 0, super.anInt7053);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ji", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!ji", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}
}
