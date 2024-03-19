import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class125 implements Runnable {

	@OriginalMember(owner = "client!ls", name = "j", descriptor = "Lclient!ud;")
	public Class199 aClass199_10;

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "[Lclient!wi;")
	public final Class37[] aClass37Array1 = new Class37[2];

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "Z")
	public volatile boolean aBoolean302 = false;

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "Z")
	public volatile boolean aBoolean303 = false;

	@OriginalMember(owner = "client!ls", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean303 = true;
		try {
			while (!this.aBoolean302) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class37 local19 = this.aClass37Array1[local12];
					if (local19 != null) {
						local19.method5854();
					}
				}
				Static295.method5212(10L);
				Static37.method932(null, this.aClass199_10);
			}
		} catch (@Pc(41) Exception local41) {
			Static58.method1402(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean303 = false;
		}
	}
}
