package jaclib.memory.heap;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeap")
public final class NativeHeap {

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "a", descriptor = "I")
	private final int a;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "b", descriptor = "Z")
	private boolean b;

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "<init>", descriptor = "(I)V")
	public NativeHeap(@OriginalArg(0) int arg0) {
		this.a = arg0;
		this.allocateHeap(this.a);
		this.b = true;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "allocateHeap", descriptor = "(I)V")
	private native void allocateHeap(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "finalize", descriptor = "()V")
	@Override
	public synchronized void finalize() throws Throwable {
		super.finalize();
		this.b();
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "deallocateBuffer", descriptor = "(I)V")
	public synchronized native void deallocateBuffer(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "allocateBuffer", descriptor = "(IZ)I")
	private synchronized native int allocateBuffer(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "deallocateHeap", descriptor = "()V")
	private native void deallocateHeap();

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	public NativeHeapBuffer a(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.b) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "put", descriptor = "(I[BIII)V")
	public synchronized native void put(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "get", descriptor = "(I[BIII)V")
	private synchronized native void get(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "a", descriptor = "()Z")
	public synchronized boolean a() {
		return this.b;
	}

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "getBufferAddress", descriptor = "(I)J")
	public synchronized native long getBufferAddress(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/memory/heap/NativeHeap", name = "b", descriptor = "()V")
	public synchronized void b() {
		if (this.b) {
			this.deallocateHeap();
		}
		this.b = false;
	}
}
