import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public final class Class2_Sub13_Sub2 extends Class2_Sub13 {

	@OriginalMember(owner = "client!dia", name = "p", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap3;

	@OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(I)V")
	public Class2_Sub13_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap3 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(B)V")
	public void method2101() {
		this.aNativeHeap3.b();
	}
}
