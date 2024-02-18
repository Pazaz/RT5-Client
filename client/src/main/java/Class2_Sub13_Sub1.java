import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cla")
public final class Class2_Sub13_Sub1 extends Class2_Sub13 {

	@OriginalMember(owner = "client!cla", name = "n", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!cla", name = "<init>", descriptor = "(I)V")
	public Class2_Sub13_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap2 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!cla", name = "a", descriptor = "(Z)V")
	public void method1609() {
		this.aNativeHeap2.b();
	}
}
