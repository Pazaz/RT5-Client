import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public final class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "()V")
	private Class13_Sub2() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)J")
	@Override
	public long method5161() {
		return System.nanoTime();
	}
}
