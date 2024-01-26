package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/vorbis/DSPState")
public final class DSPState extends SimplePeer {

	@OriginalMember(owner = "client!jagtheora/vorbis/DSPState", name = "<init>", descriptor = "(Lclient!jagtheora/vorbis/VorbisInfo;)V")
	public DSPState(@OriginalArg(0) VorbisInfo arg0) {
		this.init(arg0);
		if (this.b()) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!jagtheora/vorbis/DSPState", name = "pcmOut", descriptor = "(I)[[F")
	public native float[][] pcmOut(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jagtheora/vorbis/DSPState", name = "init", descriptor = "(Lclient!jagtheora/vorbis/VorbisInfo;)V")
	private native void init(@OriginalArg(0) VorbisInfo arg0);

	@OriginalMember(owner = "client!jagtheora/vorbis/DSPState", name = "granuleTime", descriptor = "()D")
	public native double granuleTime();

	@OriginalMember(owner = "client!jagtheora/vorbis/DSPState", name = "clear", descriptor = "()V")
	protected native void clear();

	@OriginalMember(owner = "client!jagtheora/vorbis/DSPState", name = "blockIn", descriptor = "(Lclient!jagtheora/vorbis/VorbisBlock;)V")
	public native void blockIn(@OriginalArg(0) VorbisBlock arg0);

	@OriginalMember(owner = "client!jagtheora/vorbis/DSPState", name = "read", descriptor = "(I)V")
	public native void read(@OriginalArg(0) int arg0);
}
