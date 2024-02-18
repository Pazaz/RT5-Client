package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Buffer")
public interface Buffer {

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "getAddress", descriptor = "()J")
	long getAddress();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "getSize", descriptor = "()I")
	int getSize();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "a", descriptor = "([BIII)V")
	void a(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
