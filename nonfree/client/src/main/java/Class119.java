import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class119 implements Runnable {

	@OriginalMember(owner = "client!faa", name = "g", descriptor = "Lclient!vq;")
	public Class390 aClass390_2;

	@OriginalMember(owner = "client!faa", name = "f", descriptor = "[Lclient!cd;")
	public final Class56[] aClass56Array1 = new Class56[2];

	@OriginalMember(owner = "client!faa", name = "h", descriptor = "Z")
	public volatile boolean aBoolean241 = false;

	@OriginalMember(owner = "client!faa", name = "e", descriptor = "Z")
	public volatile boolean aBoolean242 = false;

	@OriginalMember(owner = "client!faa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean242 = true;
		try {
			while (!this.aBoolean241) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(21) Class56 local21 = this.aClass56Array1[local12];
					if (local21 != null) {
						local21.method3594();
					}
				}
				Static638.method8395(10L);
				Static61.method1312(this.aClass390_2, (Object) null);
			}
		} catch (@Pc(49) Exception local49) {
			Static240.method3496(local49, (String) null);
		} finally {
			@Pc(59) Object local59 = null;
			this.aBoolean242 = false;
		}
	}
}
