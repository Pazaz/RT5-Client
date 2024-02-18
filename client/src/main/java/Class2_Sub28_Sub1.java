import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class2_Sub28_Sub1 extends Class2_Sub28 {

	@OriginalMember(owner = "client!ik", name = "C", descriptor = "Lclient!wc;")
	private Class2_Sub6_Sub5 aClass2_Sub6_Sub5_1;

	@OriginalMember(owner = "client!ik", name = "O", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
	private int anInt4396;

	@OriginalMember(owner = "client!ik", name = "Q", descriptor = "Lclient!lg;")
	private Class224 aClass224_1;

	@OriginalMember(owner = "client!ik", name = "N", descriptor = "D")
	private double aDouble14;

	@OriginalMember(owner = "client!ik", name = "K", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!ik", name = "v", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!ik", name = "E", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub28_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
	@Override
	public void method8560() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.a();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.a();
		}
		this.aVorbisComment1.a();
		this.aVorbisInfo1.a();
		if (this.aClass2_Sub6_Sub5_1 != null) {
			this.aClass2_Sub6_Sub5_1.method9141();
		}
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)Lclient!wc;")
	public Class2_Sub6_Sub5 method3960() {
		return this.aClass2_Sub6_Sub5_1;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method8558(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt9753 < 3) {
			@Pc(137) int local137 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local137 < 0) {
				throw new IllegalStateException(String.valueOf(local137));
			}
			if (super.anInt9753 == 2) {
				if (this.aVorbisInfo1.channels > 2 || this.aVorbisInfo1.channels < 1) {
					throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass224_1 = new Class224(this.aVorbisInfo1.rate, Static686.anInt8944);
				this.aClass2_Sub6_Sub5_1 = new Class2_Sub6_Sub5(this.aVorbisInfo1.channels);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(35) float[][] local35 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble14 = this.aDSPState1.granuleTime();
		if (this.aDouble14 == -1.0D) {
			this.aDouble14 = (double) ((float) this.anInt4396 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local35[0].length);
		this.anInt4396 += local35[0].length;
		@Pc(85) Class2_Sub2_Sub8 local85 = this.aClass2_Sub6_Sub5_1.method9142(local35[0].length, this.aDouble14);
		Static373.method5300(local35, local85.aShortArrayArray3);
		for (@Pc(93) int local93 = 0; local93 < this.aVorbisInfo1.channels; local93++) {
			local85.aShortArrayArray3[local93] = this.aClass224_1.method5237(local85.aShortArrayArray3[local93]);
		}
		this.aClass2_Sub6_Sub5_1.method9143(local85);
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)D")
	public double method3963() {
		@Pc(13) double local13 = this.aDouble14;
		if (this.aClass2_Sub6_Sub5_1 != null) {
			local13 = this.aClass2_Sub6_Sub5_1.method9137(false);
			if (local13 < 0.0D) {
				local13 = this.aDouble14;
			}
		}
		return (double) -(256.0F / (float) Static686.anInt8944) + local13;
	}

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "(I)I")
	public int method3965() {
		return this.aClass2_Sub6_Sub5_1 == null ? 0 : this.aClass2_Sub6_Sub5_1.method9140();
	}
}
