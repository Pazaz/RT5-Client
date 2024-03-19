import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class64 implements Runnable {

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "Z")
	public boolean aBoolean155 = true;

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "Ljava/lang/Object;")
	public final Object anObject4 = new Object();

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "[I")
	public final int[] anIntArray147 = new int[500];

	@OriginalMember(owner = "client!fo", name = "k", descriptor = "[I")
	public final int[] anIntArray146 = new int[500];

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
	public int anInt2331 = 0;

	@OriginalMember(owner = "client!fo", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean155) {
			@Pc(10) Object local10 = this.anObject4;
			synchronized (this.anObject4) {
				if (this.anInt2331 < 500) {
					this.anIntArray147[this.anInt2331] = Static229.anInt5102;
					this.anIntArray146[this.anInt2331] = Static85.anInt2268;
					this.anInt2331++;
				}
			}
			Static295.method5212(50L);
		}
	}
}
