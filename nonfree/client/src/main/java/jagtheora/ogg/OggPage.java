package jagtheora.ogg;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/ogg/OggPage")
public final class OggPage extends SimplePeer {

	@OriginalMember(owner = "client!jagtheora/ogg/OggPage", name = "getGranulePos", descriptor = "()J")
	private native long getGranulePos();

	@OriginalMember(owner = "client!jagtheora/ogg/OggPage", name = "isBOS", descriptor = "()Z")
	public native boolean isBOS();

	@OriginalMember(owner = "client!jagtheora/ogg/OggPage", name = "getVersion", descriptor = "()I")
	private native int getVersion();

	@OriginalMember(owner = "client!jagtheora/ogg/OggPage", name = "getCompletedPackets", descriptor = "()I")
	private native int getCompletedPackets();

	@OriginalMember(owner = "client!jagtheora/ogg/OggPage", name = "getSerialNumber", descriptor = "()I")
	public native int getSerialNumber();

	@OriginalMember(owner = "client!jagtheora/ogg/OggPage", name = "isEOS", descriptor = "()Z")
	private native boolean isEOS();

	@OriginalMember(owner = "client!jagtheora/ogg/OggPage", name = "clear", descriptor = "()V")
	protected native void clear();

	@OriginalMember(owner = "client!jagtheora/ogg/OggPage", name = "isContinued", descriptor = "()Z")
	private native boolean isContinued();

	@OriginalMember(owner = "client!jagtheora/ogg/OggPage", name = "getPageNumber", descriptor = "()J")
	private native long getPageNumber();
}
