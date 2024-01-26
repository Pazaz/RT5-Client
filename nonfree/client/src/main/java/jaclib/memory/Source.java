package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Source")
public interface Source {

	@OriginalMember(owner = "client!jaclib/memory/Source", name = "getSize", descriptor = "()I")
	int getSize();

	@OriginalMember(owner = "client!jaclib/memory/Source", name = "getAddress", descriptor = "()J")
	long getAddress();
}
