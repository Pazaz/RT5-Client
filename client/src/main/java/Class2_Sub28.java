import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public abstract class Class2_Sub28 extends Class2 {

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "[B")
	public static final byte[] aByteArray103;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
	public int anInt9753;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "Lclient!jagtheora/ogg/OggStreamState;")
	public final OggStreamState anOggStreamState5;

	static {
		@Pc(46) int local46 = 0;
		aByteArray103 = new byte[32896];
		for (@Pc(51) int local51 = 0; local51 < 256; local51++) {
			for (@Pc(54) int local54 = 0; local54 <= local51; local54++) {
				aByteArray103[local46++] = (byte) (int) (255.0D / Math.sqrt((double) ((float) (local51 * local51 + local54 * local54 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub28(@OriginalArg(0) OggStreamState arg0) {
		this.anOggStreamState5 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	public final void method8556(@OriginalArg(1) OggPacket arg0) {
		this.method8558(arg0);
		this.anInt9753++;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	protected abstract void method8558(@OriginalArg(1) OggPacket arg0);

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public abstract void method8560();
}
