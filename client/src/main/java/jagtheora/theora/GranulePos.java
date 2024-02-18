package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/theora/GranulePos")
public final class GranulePos extends SimplePeer {

	@OriginalMember(owner = "client!jagtheora/theora/GranulePos", name = "position", descriptor = "J")
	private long position;

	@OriginalMember(owner = "client!jagtheora/theora/GranulePos", name = "init", descriptor = "()V")
	protected native void init();

	@OriginalMember(owner = "client!jagtheora/theora/GranulePos", name = "clear", descriptor = "()V")
	protected native void clear();
}
