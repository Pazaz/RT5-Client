import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class MidiNoteStream extends PcmStream {

	@OriginalMember(owner = "client!ff", name = "I", descriptor = "Lclient!ld;")
	public final LinkedList aClass135_15 = new LinkedList();

	@OriginalMember(owner = "client!ff", name = "J", descriptor = "Lclient!fi;")
	public final MixerPcmStream mixer = new MixerPcmStream();

	@OriginalMember(owner = "client!ff", name = "z", descriptor = "Lclient!od;")
	private final MidiPcmStream aClass2_Sub12_Sub3_2;

	static {
		new LocalizedString("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!od;)V")
	public MidiNoteStream(@OriginalArg(0) MidiPcmStream arg0) {
		this.aClass2_Sub12_Sub3_2 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "()Lclient!ll;")
	@Override
	public PcmStream method4978() {
		@Pc(9) MidiNote local9 = (MidiNote) this.aClass135_15.head();
		if (local9 == null) {
			return null;
		} else if (local9.stream == null) {
			return this.nextSubStream();
		} else {
			return local9.stream;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ej;II)V")
	private void method2041(@OriginalArg(0) MidiNote arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass2_Sub12_Sub3_2.anIntArray308[arg0.channel] & 0x4) != 0 && arg0.anInt1791 < 0) {
			@Pc(23) int local23 = this.aClass2_Sub12_Sub3_2.anIntArray300[arg0.channel] / AudioChannel.sampleRate;
			@Pc(33) int local33 = (local23 + 1048575 - arg0.anInt1792) / local23;
			arg0.anInt1792 = arg1 * local23 + arg0.anInt1792 & 0xFFFFF;
			if (arg1 >= local33) {
				if (this.aClass2_Sub12_Sub3_2.anIntArray297[arg0.channel] == 0) {
					arg0.stream = Static406.method4998(arg0.sound, arg0.stream.method4982(), arg0.stream.method4997(), arg0.stream.method4986());
				} else {
					arg0.stream = Static406.method4998(arg0.sound, arg0.stream.method4982(), 0, arg0.stream.method4986());
					this.aClass2_Sub12_Sub3_2.method4272(arg0.aClass2_Sub25_1.aShortArray90[arg0.anInt1781] < 0, arg0);
				}
				if (arg0.aClass2_Sub25_1.aShortArray90[arg0.anInt1781] < 0) {
					arg0.stream.method4984(-1);
				}
				arg1 = arg0.anInt1792 / local23;
			}
		}
		arg0.stream.skip(arg1);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "()Lclient!ll;")
	@Override
	public PcmStream nextSubStream() {
		@Pc(9) MidiNote local9;
		do {
			local9 = (MidiNote) this.aClass135_15.next();
			if (local9 == null) {
				return null;
			}
		} while (local9.stream == null);
		return local9.stream;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "()I")
	@Override
	public int method4977() {
		return 0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([III)V")
	@Override
	public void read(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.mixer.read(arg0, arg1, arg2);
		for (@Pc(17) MidiNote local17 = (MidiNote) this.aClass135_15.head(); local17 != null; local17 = (MidiNote) this.aClass135_15.next()) {
			if (!this.aClass2_Sub12_Sub3_2.method4275(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt1780 >= local27) {
						this.method2043(local29, local27 + local29, arg0, local27, local17);
						local17.anInt1780 -= local27;
						break;
					}
					this.method2043(local29, local27 + local29, arg0, local17.anInt1780, local17);
					local29 += local17.anInt1780;
					local27 -= local17.anInt1780;
				} while (!this.aClass2_Sub12_Sub3_2.method4277(local27, local29, arg0, local17));
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II[IIBLclient!ej;)V")
	private void method2043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) MidiNote arg4) {
		if ((this.aClass2_Sub12_Sub3_2.anIntArray308[arg4.channel] & 0x4) != 0 && arg4.anInt1791 < 0) {
			@Pc(34) int local34 = this.aClass2_Sub12_Sub3_2.anIntArray300[arg4.channel] / AudioChannel.sampleRate;
			while (true) {
				@Pc(43) int local43 = (local34 + 1048575 - arg4.anInt1792) / local34;
				if (arg3 < local43) {
					arg4.anInt1792 += local34 * arg3;
					break;
				}
				arg4.stream.read(arg2, arg0, local43);
				arg0 += local43;
				arg4.anInt1792 += local43 * local34 - 1048576;
				arg3 -= local43;
				@Pc(74) int local74 = AudioChannel.sampleRate / 100;
				@Pc(78) int local78 = 262144 / local34;
				if (local74 > local78) {
					local74 = local78;
				}
				@Pc(90) Class2_Sub12_Sub4 local90 = arg4.stream;
				if (this.aClass2_Sub12_Sub3_2.anIntArray297[arg4.channel] == 0) {
					arg4.stream = Static406.method4998(arg4.sound, local90.method4982(), local90.method4997(), local90.method4986());
				} else {
					arg4.stream = Static406.method4998(arg4.sound, local90.method4982(), 0, local90.method4986());
					this.aClass2_Sub12_Sub3_2.method4272(arg4.aClass2_Sub25_1.aShortArray90[arg4.anInt1781] < 0, arg4);
					arg4.stream.method4981(local74, local90.method4997());
				}
				if (arg4.aClass2_Sub25_1.aShortArray90[arg4.anInt1781] < 0) {
					arg4.stream.method4984(-1);
				}
				local90.method4990(local74);
				local90.read(arg2, arg0, arg1 - arg0);
				if (local90.method4989()) {
					this.mixer.addSubStream(local90);
				}
			}
		}
		arg4.stream.read(arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
	@Override
	public void skip(@OriginalArg(0) int arg0) {
		this.mixer.skip(arg0);
		for (@Pc(13) MidiNote local13 = (MidiNote) this.aClass135_15.head(); local13 != null; local13 = (MidiNote) this.aClass135_15.next()) {
			if (!this.aClass2_Sub12_Sub3_2.method4275(local13)) {
				@Pc(22) int local22 = arg0;
				do {
					if (local13.anInt1780 >= local22) {
						this.method2041(local13, local22);
						local13.anInt1780 -= local22;
						break;
					}
					this.method2041(local13, local13.anInt1780);
					local22 -= local13.anInt1780;
				} while (!this.aClass2_Sub12_Sub3_2.method4277(local22, 0, null, local13));
			}
		}
	}
}
