import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public final class Class144_Sub1 extends Class144 implements Runnable {

	@OriginalMember(owner = "client!pr", name = "s", descriptor = "I")
	public int anInt5358 = -1;

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "Z")
	private boolean aBoolean375 = true;

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "Lclient!bk;")
	private final Class23_Sub1 aClass23_Sub1_1;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!bk;)V")
	public Class144_Sub1(@OriginalArg(0) Class23_Sub1 arg0) {
		this.aClass23_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!pr", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean375) {
			this.aClass23_Sub1_1.method577(this);
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
	public void method4555() {
		this.aBoolean375 = false;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)V")
	public void method4556() {
		(new Thread(this, "a")).start();
	}
}
