package jagtheora.ogg;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/ogg/OggStreamState")
public final class OggStreamState extends SimplePeer {

	@OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "<init>", descriptor = "(I)V")
	public OggStreamState(@OriginalArg(0) int arg0) {
		if (!this.init(arg0)) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "init", descriptor = "(I)Z")
	private native boolean init(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "packetOut", descriptor = "()I")
	public native int packetOut();

	@OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "isEOS", descriptor = "()Z")
	private native boolean isEOS();

	@OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "packetPeek", descriptor = "(Lclient!jagtheora/ogg/OggPacket;)I")
	public native int packetPeek(@OriginalArg(0) OggPacket arg0);

	@OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "clear", descriptor = "()V")
	protected native void clear();

	@OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "reset", descriptor = "()Z")
	private native boolean reset();

	@OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "packetOut", descriptor = "(Lclient!jagtheora/ogg/OggPacket;)I")
	public native int packetOut(@OriginalArg(0) OggPacket arg0);

	@OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "packetPeek", descriptor = "()I")
	private native int packetPeek();

	@OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "resetSerialNo", descriptor = "(I)Z")
	private native boolean resetSerialNo(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "pageIn", descriptor = "(Lclient!jagtheora/ogg/OggPage;)Z")
	public native boolean pageIn(@OriginalArg(0) OggPage arg0);
}
