import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class37_Sub2 extends Class37 {

	@OriginalMember(owner = "client!vk", name = "J", descriptor = "Ljavax/sound/sampled/AudioFormat;")
	private AudioFormat anAudioFormat1;

	@OriginalMember(owner = "client!vk", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	private SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
	private int anInt6908;

	@OriginalMember(owner = "client!vk", name = "O", descriptor = "[B")
	private byte[] aByteArray87;

	@OriginalMember(owner = "client!vk", name = "P", descriptor = "Z")
	private boolean aBoolean496 = false;

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
	@Override
	public void method5862(@OriginalArg(0) int arg0) throws LineUnavailableException {
		try {
			@Pc(20) Info local20 = new Info(SourceDataLine.class, this.anAudioFormat1, arg0 << (Class1_Sub2_Sub1_Sub1.lb ? 2 : 1));
			this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local20);
			this.aSourceDataLine1.open();
			this.aSourceDataLine1.start();
			this.anInt6908 = arg0;
		} catch (@Pc(36) LineUnavailableException local36) {
			if (Static176.method3566(arg0) == 1) {
				this.aSourceDataLine1 = null;
				throw local36;
			} else {
				this.method5862(Static162.method3414(arg0));
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "()I")
	@Override
	protected int method5857() {
		return this.anInt6908 - (this.aSourceDataLine1.available() >> (Class1_Sub2_Sub1_Sub1.lb ? 2 : 1));
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "()V")
	@Override
	protected void method5869() throws LineUnavailableException {
		this.aSourceDataLine1.flush();
		if (!this.aBoolean496) {
			return;
		}
		this.aSourceDataLine1.close();
		this.aSourceDataLine1 = null;
		@Pc(34) Info local34 = new Info(SourceDataLine.class, this.anAudioFormat1, this.anInt6908 << (Class1_Sub2_Sub1_Sub1.lb ? 2 : 1));
		this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local34);
		this.aSourceDataLine1.open();
		this.aSourceDataLine1.start();
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "()V")
	@Override
	protected void method5859() {
		if (this.aSourceDataLine1 != null) {
			this.aSourceDataLine1.close();
			this.aSourceDataLine1 = null;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5861(@OriginalArg(0) Component arg0) {
		@Pc(1) javax.sound.sampled.Mixer.Info[] local1 = AudioSystem.getMixerInfo();
		if (local1 != null) {
			for (@Pc(8) int local8 = 0; local8 < local1.length; local8++) {
				@Pc(16) javax.sound.sampled.Mixer.Info local16 = local1[local8];
				if (local16 != null) {
					@Pc(23) String local23 = local16.getName();
					if (local23 != null && local23.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBoolean496 = true;
					}
				}
			}
		}
		this.anAudioFormat1 = new AudioFormat((float) Static80.anInt2184, 16, Class1_Sub2_Sub1_Sub1.lb ? 2 : 1, true, false);
		this.aByteArray87 = new byte[0x100 << (Class1_Sub2_Sub1_Sub1.lb ? 2 : 1)];
	}

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "()V")
	@Override
	protected void method5872() {
		@Pc(1) short local1 = 256;
		if (Class1_Sub2_Sub1_Sub1.lb) {
			local1 = 512;
		}
		for (@Pc(9) int local9 = 0; local9 < local1; local9++) {
			@Pc(17) int local17 = this.anIntArray558[local9];
			if ((local17 + 8388608 & 0xFF000000) != 0) {
				local17 = local17 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArray87[local9 * 2] = (byte) (local17 >> 8);
			this.aByteArray87[local9 * 2 + 1] = (byte) (local17 >> 16);
		}
		this.aSourceDataLine1.write(this.aByteArray87, 0, local1 << 1);
	}
}
