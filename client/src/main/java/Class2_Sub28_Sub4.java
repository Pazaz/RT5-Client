import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class2_Sub28_Sub4 extends Class2_Sub28 {

	@OriginalMember(owner = "client!un", name = "J", descriptor = "Ljava/lang/String;")
	private String aString115;

	@OriginalMember(owner = "client!un", name = "D", descriptor = "Ljava/lang/String;")
	private String aString116;

	@OriginalMember(owner = "client!un", name = "w", descriptor = "I")
	private int anInt9757;

	@OriginalMember(owner = "client!un", name = "x", descriptor = "F")
	private float aFloat211;

	@OriginalMember(owner = "client!un", name = "s", descriptor = "Ljava/lang/String;")
	private String aString117;

	@OriginalMember(owner = "client!un", name = "F", descriptor = "F")
	private float aFloat212;

	@OriginalMember(owner = "client!un", name = "r", descriptor = "I")
	private int anInt9764;

	static {
		new Class377("game5", "Game 5", 4);
	}

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub28_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!un", name = "i", descriptor = "(I)F")
	public float method8561() {
		return this.aFloat212;
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)Ljava/lang/String;")
	public String method8563() {
		return this.aString116;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method8558(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt9753 > 0 && !"SUB".equals(this.aString117)) {
			return;
		}
		@Pc(31) Class2_Sub21 local31 = new Class2_Sub21(arg0.getData());
		@Pc(35) int local35 = local31.method7396();
		if (super.anInt9753 > 8) {
			if (local35 == 0) {
				@Pc(47) long local47 = local31.method7359();
				@Pc(51) long local51 = local31.method7359();
				@Pc(55) long local55 = local31.method7359();
				if (local47 < 0L || local51 < 0L || local55 < 0L || local47 < local55) {
					throw new IllegalStateException();
				}
				this.aFloat211 = (float) ((long) this.anInt9757 * (local47 + local51)) / (float) this.anInt9764;
				this.aFloat212 = (float) ((long) this.anInt9757 * local47) / (float) this.anInt9764;
				@Pc(121) int local121 = local31.method7351();
				if (local121 < 0 || local31.aByteArray93.length - local31.anInt8388 < local121) {
					throw new IllegalStateException();
				}
				this.aString115 = Static366.method5264(local121, local31.aByteArray93, local31.anInt8388);
			}
			if ((local35 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local35 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt9753 != 0) {
			return;
		}
		local31.anInt8388 += 23;
		this.anInt9764 = local31.method7351();
		this.anInt9757 = local31.method7351();
		if (this.anInt9764 == 0 || this.anInt9757 == 0) {
			throw new IllegalStateException();
		}
		@Pc(211) Class2_Sub21 local211 = new Class2_Sub21(16);
		local31.method7344(0, 16, local211.aByteArray93);
		this.aString116 = local211.method7358();
		local211.anInt8388 = 0;
		local31.method7344(0, 16, local211.aByteArray93);
		this.aString117 = local211.method7358();
	}

	@OriginalMember(owner = "client!un", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method8565() {
		return this.aString115;
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(I)F")
	public float method8566() {
		return this.aFloat211;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
	@Override
	public void method8560() {
	}
}
