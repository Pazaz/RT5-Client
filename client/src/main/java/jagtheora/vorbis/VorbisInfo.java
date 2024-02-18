package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/vorbis/VorbisInfo")
public final class VorbisInfo extends SimplePeer {

	@OriginalMember(owner = "client!jagtheora/vorbis/VorbisInfo", name = "rate", descriptor = "I")
	public int rate;

	@OriginalMember(owner = "client!jagtheora/vorbis/VorbisInfo", name = "channels", descriptor = "I")
	public int channels;

	static {
		initFields();
	}

	@OriginalMember(owner = "client!jagtheora/vorbis/VorbisInfo", name = "initFields", descriptor = "()V")
	private static native void initFields();

	@OriginalMember(owner = "client!jagtheora/vorbis/VorbisInfo", name = "<init>", descriptor = "()V")
	public VorbisInfo() {
		this.init();
		if (this.b()) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!jagtheora/vorbis/VorbisInfo", name = "clear", descriptor = "()V")
	protected native void clear();

	@OriginalMember(owner = "client!jagtheora/vorbis/VorbisInfo", name = "headerIn", descriptor = "(Lclient!jagtheora/vorbis/VorbisComment;Lclient!jagtheora/ogg/OggPacket;)I")
	public native int headerIn(@OriginalArg(0) VorbisComment arg0, @OriginalArg(1) OggPacket arg1);

	@OriginalMember(owner = "client!jagtheora/vorbis/VorbisInfo", name = "init", descriptor = "()V")
	protected native void init();
}
