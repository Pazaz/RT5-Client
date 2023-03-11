import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class90_Sub1 extends Class90 implements Runnable {

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "Z")
	private boolean aBoolean483 = true;

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
	public int anInt7115 = -1;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "Lclient!bb;")
	private final Class15_Sub1 aClass15_Sub1_1;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!bb;)V")
	public Class90_Sub1(@OriginalArg(0) Class15_Sub1 arg0) {
		this.aClass15_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
	public void method6345() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
	public void method6346() {
		this.aBoolean483 = false;
	}

	@OriginalMember(owner = "client!wd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean483) {
			this.aClass15_Sub1_1.method553(this);
		}
	}
}
