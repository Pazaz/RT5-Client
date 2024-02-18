package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/NativeBuffer")
public class NativeBuffer implements Buffer, Source {

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "b", descriptor = "J")
	private long b;

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "I")
	private int a = -1;

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "([BIII)V")
	@Override
	public void a(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < 0 | arg0 == null | this.b == 0L | arg1 < 0 | arg0.length < arg1 + arg3 | arg2 + arg3 > this.a) {
			throw new RuntimeException();
		}
		this.put(this.b, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "(JI)V")
	protected final void a(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.b = arg0;
		this.a = arg1;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "getAddress", descriptor = "()J")
	@Override
	public final long getAddress() {
		return this.b;
	}

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "put", descriptor = "(J[BIII)V")
	private native void put(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "get", descriptor = "(J[BIII)V")
	private native void get(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "getSize", descriptor = "()I")
	@Override
	public final int getSize() {
		return this.a;
	}
}
