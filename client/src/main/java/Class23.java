import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class Class23 {

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
	protected volatile int anInt1582 = 0;

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "[B")
	protected final byte[] aByteArray9 = new byte[5000];

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
	protected volatile int anInt1581 = 0;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "[F")
	protected final float[] aFloatArray4 = new float[5000];

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
	protected int anInt1583 = 0;

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
	protected int anInt1585 = 0;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray3 = new Object[5000];

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!pm;B)V")
	public abstract void method1373(@OriginalArg(0) Class154 arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)V")
	public abstract void method1374(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(IB)V")
	public abstract void method1375(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!gm;FZIB)V")
	public abstract void method1377(@OriginalArg(0) Class77 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!pm;)V")
	public abstract void method1378(@OriginalArg(1) Class154 arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLclient!pm;)V")
	public abstract void method1379(@OriginalArg(1) Class154 arg0);

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
	public abstract void method1380();

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
	public abstract void method1381();
}
