import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class SignlinkAudioChannel extends AudioChannel {

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "Lclient!fc;")
	public static AudioSource audioSource;
	@OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
	private final int channel;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!ml;I)V")
	public SignlinkAudioChannel(@OriginalArg(0) Signlink arg0, @OriginalArg(1) int arg1) {
		audioSource = arg0.getAudioSource();
		this.channel = arg1;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void init(@OriginalArg(0) Component arg0) throws Exception {
		audioSource.method1993(AudioChannel.sampleRate, arg0, Static354.stereo);
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "()V")
	@Override
	protected void method6324() {
		audioSource.method1996(this.channel);
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "()V")
	@Override
	protected void method6329() {
		audioSource.method1994(this.channel, super.samples);
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
	@Override
	public void method6332(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		audioSource.method1992(this.channel, arg0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()I")
	@Override
	protected int method6321() {
		return audioSource.method1995(this.channel);
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "()V")
	@Override
	protected void method6322() {
		audioSource.method1997(this.channel);
	}
}
