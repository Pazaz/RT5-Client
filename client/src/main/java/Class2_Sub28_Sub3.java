import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class2_Sub28_Sub3 extends Class2_Sub28 {

	@OriginalMember(owner = "client!mda", name = "X", descriptor = "Lclient!jagtheora/theora/DecoderContext;")
	private DecoderContext aDecoderContext1;

	@OriginalMember(owner = "client!mda", name = "G", descriptor = "I")
	private int anInt6115;

	@OriginalMember(owner = "client!mda", name = "V", descriptor = "Z")
	private boolean aBoolean460;

	@OriginalMember(owner = "client!mda", name = "D", descriptor = "Lclient!st;")
	private Class23 aClass23_29;

	@OriginalMember(owner = "client!mda", name = "J", descriptor = "Z")
	private boolean aBoolean461;

	@OriginalMember(owner = "client!mda", name = "A", descriptor = "J")
	private long aLong188;

	@OriginalMember(owner = "client!mda", name = "L", descriptor = "Z")
	private boolean aBoolean462;

	@OriginalMember(owner = "client!mda", name = "w", descriptor = "I")
	private int anInt6119;

	@OriginalMember(owner = "client!mda", name = "S", descriptor = "D")
	private double aDouble19;

	@OriginalMember(owner = "client!mda", name = "T", descriptor = "Lclient!jagtheora/theora/Frame;")
	private Frame aFrame7;

	@OriginalMember(owner = "client!mda", name = "I", descriptor = "Lclient!jagtheora/theora/GranulePos;")
	private GranulePos aGranulePos1;

	@OriginalMember(owner = "client!mda", name = "Q", descriptor = "Z")
	private boolean aBoolean463;

	@OriginalMember(owner = "client!mda", name = "N", descriptor = "Lclient!jagtheora/theora/SetupInfo;")
	private final SetupInfo aSetupInfo1 = new SetupInfo();

	@OriginalMember(owner = "client!mda", name = "R", descriptor = "Lclient!jagtheora/theora/TheoraInfo;")
	private final TheoraInfo aTheoraInfo1 = new TheoraInfo();

	@OriginalMember(owner = "client!mda", name = "y", descriptor = "Lclient!jagtheora/theora/TheoraComment;")
	private final TheoraComment aTheoraComment1 = new TheoraComment();

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub28_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mda", name = "g", descriptor = "(I)F")
	public float method5488() {
		return this.aBoolean463 && !this.aTheoraInfo1.b() ? (float) this.aTheoraInfo1.fpsNumerator / (float) this.aTheoraInfo1.fpsDenominator : 0.0F;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(BI)V")
	private void method5490(@OriginalArg(1) int arg0) {
		this.anInt6119 = arg0;
		if (!this.aBoolean463) {
			return;
		}
		if (this.anInt6119 > this.anInt6115) {
			this.anInt6119 = this.anInt6115;
		}
		if (this.anInt6119 < 0) {
			this.anInt6119 = 0;
		}
		this.aDecoderContext1.setPostProcessingLevel(this.anInt6119);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!ha;I)Lclient!st;")
	public Class23 method5491(@OriginalArg(0) Class19 arg0) {
		if (this.aFrame7 == null) {
			return null;
		} else if (this.aBoolean462 || this.aClass23_29 == null) {
			this.aClass23_29 = arg0.method7958(this.aFrame7.pixels, this.aFrame7.b, this.aFrame7.b, this.aFrame7.a, false);
			this.aBoolean462 = false;
			return this.aClass23_29;
		} else {
			return this.aClass23_29;
		}
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)V")
	@Override
	public void method8560() {
		if (this.aFrame7 != null) {
			this.aFrame7.a();
		}
		if (this.aDecoderContext1 != null) {
			this.aDecoderContext1.a();
			this.aDecoderContext1 = null;
		}
		if (this.aGranulePos1 != null) {
			this.aGranulePos1.a();
			this.aGranulePos1 = null;
		}
		this.aTheoraInfo1.a();
		this.aTheoraComment1.a();
		this.aSetupInfo1.a();
	}

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "(I)J")
	public long method5496() {
		return this.aLong188;
	}

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "(I)D")
	public double method5497() {
		return this.aDouble19;
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(B)Z")
	public boolean method5498() {
		return this.aBoolean463;
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method8558(@OriginalArg(1) OggPacket arg0) {
		@Pc(19) int local19;
		if (!this.aBoolean463) {
			local19 = this.aSetupInfo1.decodeHeader(this.aTheoraInfo1, this.aTheoraComment1, arg0);
			if (local19 == 0) {
				this.aBoolean463 = true;
				if (this.aTheoraInfo1.frameWidth > 2048 || this.aTheoraInfo1.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				this.aDecoderContext1 = new DecoderContext(this.aTheoraInfo1, this.aSetupInfo1);
				this.aGranulePos1 = new GranulePos();
				this.aFrame7 = new Frame(this.aTheoraInfo1.frameWidth, this.aTheoraInfo1.frameHeight);
				this.anInt6115 = this.aDecoderContext1.getMaxPostProcessingLevel();
				this.method5490(this.anInt6119);
			} else if (local19 < 0) {
				throw new IllegalStateException(String.valueOf(local19));
			}
			return;
		}
		this.aLong188 = Static588.method7715();
		local19 = this.aDecoderContext1.decodePacketIn(arg0, this.aGranulePos1);
		if (local19 < 0) {
			throw new IllegalStateException(String.valueOf(local19));
		}
		this.aDecoderContext1.granuleFrame(this.aGranulePos1);
		this.aDouble19 = this.aDecoderContext1.granuleTime(this.aGranulePos1);
		if (this.aBoolean460) {
			@Pc(60) boolean local60 = arg0.isKeyFrame() == 1;
			if (!local60) {
				return;
			}
			this.aBoolean460 = false;
		}
		if (!this.aBoolean461 || arg0.isKeyFrame() == 1) {
			if (this.aDecoderContext1.decodeFrame(this.aFrame7) != 0) {
				throw new IllegalStateException(String.valueOf(local19));
			}
			this.aBoolean462 = true;
		}
	}
}
