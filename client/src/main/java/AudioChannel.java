import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public class AudioChannel {

	@OriginalMember(owner = "client!up", name = "T", descriptor = "I")
	public static int sampleRate;

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "[I")
	public int[] samples;

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "Lclient!ll;")
	private PcmStream aClass2_Sub12_8;

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
	public int sampleRate2;

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
	private int anInt7098;

	@OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
	public int bufferCapacity;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
	private final int anInt7081 = 32;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "Z")
	private boolean aBoolean480 = false;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "J")
	private long aLong224 = MonotonicClock.currentTimeMillis();

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "Z")
	private boolean aBoolean481 = true;

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "J")
	private long aLong225 = 0L;

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "J")
	private long aLong226 = 0L;

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
	private int anInt7097 = 0;

	@OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
	private int anInt7100 = 0;

	@OriginalMember(owner = "client!tg", name = "E", descriptor = "[Lclient!ll;")
	private final PcmStream[] aClass2_Sub12Array6 = new PcmStream[8];

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "[Lclient!ll;")
	private final PcmStream[] aClass2_Sub12Array5 = new PcmStream[8];

	@OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
	private int anInt7102 = 0;

	@OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
	private int anInt7101 = 0;

	static {
		new LocalizedString("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BILclient!ml;Ljava/awt/Component;I)Lclient!tg;")
	public static AudioChannel create(@OriginalArg(1) int arg0, @OriginalArg(2) Signlink arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3) {
		if (sampleRate == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) AudioChannel local33 = (AudioChannel) Class.forName("JavaAudioChannel").getDeclaredConstructor().newInstance();
			local33.sampleRate2 = arg3;
			local33.samples = new int[(Static354.stereo ? 2 : 1) * 256];
			local33.init(arg2);
			local33.bufferCapacity = (arg3 & 0xFFFFFC00) + 1024;
			if (local33.bufferCapacity > 16384) {
				local33.bufferCapacity = 16384;
			}
			local33.method6332(local33.bufferCapacity);
			if (Static200.anInt3698 > 0 && Static67.aClass129_1 == null) {
				Static67.aClass129_1 = new Class129();
				Static67.aClass129_1.aClass152_3 = arg1;
				arg1.startThread(Static200.anInt3698, Static67.aClass129_1);
			}
			if (Static67.aClass129_1 != null) {
				if (Static67.aClass129_1.aClass221Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static67.aClass129_1.aClass221Array1[arg0] = local33;
			}
			return local33;
		} catch (@Pc(106) Throwable local106) {
			try {
				@Pc(112) SignlinkAudioChannel local112 = new SignlinkAudioChannel(arg1, arg0);
				local112.sampleRate2 = arg3;
				local112.samples = new int[(Static354.stereo ? 2 : 1) * 256];
				local112.init(arg2);
				local112.bufferCapacity = 16384;
				local112.method6332(local112.bufferCapacity);
				if (Static200.anInt3698 > 0 && Static67.aClass129_1 == null) {
					Static67.aClass129_1 = new Class129();
					Static67.aClass129_1.aClass152_3 = arg1;
					arg1.startThread(Static200.anInt3698, Static67.aClass129_1);
				}
				if (Static67.aClass129_1 != null) {
					if (Static67.aClass129_1.aClass221Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static67.aClass129_1.aClass221Array1[arg0] = local112;
				}
				return local112;
			} catch (@Pc(186) Throwable local186) {
				return new AudioChannel();
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZIIZ)V")
	public static void init(@OriginalArg(3) boolean arg0) {
		Static354.stereo = arg0;
		Static200.anInt3698 = 2;
		sampleRate = 22050;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public final synchronized void method6316() {
		if (this.aBoolean480) {
			return;
		}
		@Pc(12) long local12 = MonotonicClock.currentTimeMillis();
		try {
			if (local12 > this.aLong224 + 500000L) {
				this.aLong224 = local12 - 500000L;
			}
			while (this.aLong224 + 5000L < local12) {
				this.method6328();
				this.aLong224 += 256000 / sampleRate;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong224 = local12;
		}
		if (this.samples == null) {
			return;
		}
		try {
			if (this.aLong225 != 0L) {
				if (local12 < this.aLong225) {
					return;
				}
				this.method6332(this.bufferCapacity);
				this.aLong225 = 0L;
				this.aBoolean481 = true;
			}
			@Pc(83) int local83 = this.method6321();
			if (this.anInt7102 - local83 > this.anInt7097) {
				this.anInt7097 = this.anInt7102 - local83;
			}
			@Pc(103) int local103 = this.anInt7098 + this.sampleRate2;
			if (local103 + 256 > 16384) {
				local103 = 16128;
			}
			if (this.bufferCapacity < local103 + 256) {
				this.bufferCapacity += 1024;
				if (this.bufferCapacity > 16384) {
					this.bufferCapacity = 16384;
				}
				this.method6324();
				local83 = 0;
				this.method6332(this.bufferCapacity);
				if (this.bufferCapacity < local103 + 256) {
					local103 = this.bufferCapacity - 256;
					this.anInt7098 = local103 - this.sampleRate2;
				}
				this.aBoolean481 = true;
			}
			while (local103 > local83) {
				this.method6323(this.samples);
				this.method6329();
				local83 += 256;
			}
			if (local12 > this.aLong226) {
				if (this.aBoolean481) {
					this.aBoolean481 = false;
				} else if (this.anInt7097 == 0 && this.anInt7100 == 0) {
					this.method6324();
					this.aLong225 = local12 + 2000L;
					return;
				} else {
					this.anInt7098 = Math.min(this.anInt7100, this.anInt7097);
					this.anInt7100 = this.anInt7097;
				}
				this.anInt7097 = 0;
				this.aLong226 = local12 + 2000L;
			}
			this.anInt7102 = local83;
		} catch (@Pc(227) Exception local227) {
			this.method6324();
			this.aLong225 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	public final synchronized void method6317() {
		this.aBoolean481 = true;
		try {
			this.method6322();
		} catch (@Pc(16) Exception local16) {
			this.method6324();
			this.aLong225 = MonotonicClock.currentTimeMillis() + 2000L;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!ll;BI)V")
	private void method6320(@OriginalArg(0) PcmStream arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) PcmStream local12 = this.aClass2_Sub12Array5[local7];
		if (local12 == null) {
			this.aClass2_Sub12Array6[local7] = arg0;
		} else {
			local12.aClass2_Sub12_5 = arg0;
		}
		this.aClass2_Sub12Array5[local7] = arg0;
		arg0.anInt5476 = arg1;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "()I")
	protected int method6321() throws Exception {
		return this.bufferCapacity;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "()V")
	protected void method6322() throws Exception {
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "([II)V")
	private void method6323(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static354.stereo) {
			local1 = 512;
		}
		Static404.method4608(arg0, 0, local1);
		this.anInt7101 -= 256;
		if (this.aClass2_Sub12_8 != null && this.anInt7101 <= 0) {
			this.anInt7101 += sampleRate >> 4;
			Static56.method1613(this.aClass2_Sub12_8);
			this.method6320(this.aClass2_Sub12_8, this.aClass2_Sub12_8.method4976());
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = 255;
			@Pc(49) int local49 = 7;
			@Pc(56) int local56;
			label103: while (local47 != 0) {
				@Pc(61) int local61;
				if (local49 < 0) {
					local56 = local49 & 0x3;
					local61 = -(local49 >> 2);
				} else {
					local56 = local49;
					local61 = 0;
				}
				for (@Pc(72) int local72 = local47 >>> local56 & 0x11111111; local72 != 0; local72 >>>= 0x4) {
					if ((local72 & 0x1) != 0) {
						local47 &= ~(0x1 << local56);
						@Pc(88) PcmStream local88 = null;
						@Pc(93) PcmStream local93 = this.aClass2_Sub12Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub21 local97 = local93.aClass2_Sub21_5;
								if (local97 == null || local97.anInt3175 <= local61) {
									local93.aBoolean389 = true;
									@Pc(121) int local121 = local93.method4977();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3175 += local121;
									}
									if (local45 >= this.anInt7081) {
										break label103;
									}
									@Pc(140) PcmStream local140 = local93.method4978();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt5476;
										while (local140 != null) {
											this.method6320(local140, local145 * local140.method4976() >> 8);
											local140 = local93.nextSubStream();
										}
									}
									@Pc(164) PcmStream local164 = local93.aClass2_Sub12_5;
									local93.aClass2_Sub12_5 = null;
									if (local88 == null) {
										this.aClass2_Sub12Array6[local56] = local164;
									} else {
										local88.aClass2_Sub12_5 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub12Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub12_5;
								}
							}
						}
					}
					local56 += 4;
					local61++;
				}
				local49--;
			}
			for (local56 = 0; local56 < 8; local56++) {
				@Pc(207) PcmStream local207 = this.aClass2_Sub12Array6[local56];
				this.aClass2_Sub12Array6[local56] = this.aClass2_Sub12Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) PcmStream local221 = local207.aClass2_Sub12_5;
					local207.aClass2_Sub12_5 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt7101 < 0) {
			this.anInt7101 = 0;
		}
		if (this.aClass2_Sub12_8 != null) {
			this.aClass2_Sub12_8.read(arg0, 0, 256);
		}
		this.aLong224 = MonotonicClock.currentTimeMillis();
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "()V")
	protected void method6324() {
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)V")
	public final void method6325() {
		this.aBoolean481 = true;
	}

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V")
	public final synchronized void method6326() {
		if (Static67.aClass129_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static67.aClass129_1.aClass221Array1[local11] == this) {
					Static67.aClass129_1.aClass221Array1[local11] = null;
				}
				if (Static67.aClass129_1.aClass221Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static67.aClass129_1.aBoolean227 = true;
				while (Static67.aClass129_1.aBoolean226) {
					ThreadUtils.sleep(50L);
				}
				Static67.aClass129_1 = null;
			}
		}
		this.method6324();
		this.aBoolean480 = true;
		this.samples = null;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void init(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V")
	private void method6328() {
		this.anInt7101 -= 256;
		if (this.anInt7101 < 0) {
			this.anInt7101 = 0;
		}
		if (this.aClass2_Sub12_8 != null) {
			this.aClass2_Sub12_8.skip(256);
		}
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "()V")
	protected void method6329() throws Exception {
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!ll;)V")
	public final synchronized void setStream(@OriginalArg(1) PcmStream arg0) {
		this.aClass2_Sub12_8 = arg0;
	}

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)V")
	public void method6332(@OriginalArg(0) int arg0) throws Exception {
	}
}
