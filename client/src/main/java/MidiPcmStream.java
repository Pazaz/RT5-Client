import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class MidiPcmStream extends PcmStream {

	@OriginalMember(owner = "client!od", name = "Lb", descriptor = "I")
	private int anInt4565;

	@OriginalMember(owner = "client!od", name = "Mb", descriptor = "I")
	private int anInt4566;

	@OriginalMember(owner = "client!od", name = "Nb", descriptor = "J")
	private long aLong135;

	@OriginalMember(owner = "client!od", name = "Ob", descriptor = "Z")
	private boolean aBoolean314;

	@OriginalMember(owner = "client!od", name = "Pb", descriptor = "J")
	private long aLong136;

	@OriginalMember(owner = "client!od", name = "Qb", descriptor = "Lclient!sl;")
	private Song aClass2_Sub34_2;

	@OriginalMember(owner = "client!od", name = "Rb", descriptor = "I")
	private int anInt4567;

	@OriginalMember(owner = "client!od", name = "Sb", descriptor = "Z")
	private boolean aBoolean315;

	@OriginalMember(owner = "client!od", name = "w", descriptor = "[I")
	private final int[] anIntArray295 = new int[16];

	@OriginalMember(owner = "client!od", name = "x", descriptor = "[I")
	private final int[] anIntArray296 = new int[16];

	@OriginalMember(owner = "client!od", name = "C", descriptor = "[I")
	public final int[] anIntArray297 = new int[16];

	@OriginalMember(owner = "client!od", name = "I", descriptor = "[[Lclient!ej;")
	private final MidiNote[][] aClass2_Sub11ArrayArray2 = new MidiNote[16][128];

	@OriginalMember(owner = "client!od", name = "S", descriptor = "[I")
	public final int[] anIntArray300 = new int[16];

	@OriginalMember(owner = "client!od", name = "A", descriptor = "[[Lclient!ej;")
	private final MidiNote[][] aClass2_Sub11ArrayArray1 = new MidiNote[16][128];

	@OriginalMember(owner = "client!od", name = "kb", descriptor = "I")
	private int anInt4548 = 256;

	@OriginalMember(owner = "client!od", name = "F", descriptor = "[I")
	private final int[] anIntArray298 = new int[16];

	@OriginalMember(owner = "client!od", name = "qb", descriptor = "[I")
	private final int[] anIntArray305 = new int[16];

	@OriginalMember(owner = "client!od", name = "hb", descriptor = "[I")
	private final int[] anIntArray303 = new int[16];

	@OriginalMember(owner = "client!od", name = "Q", descriptor = "[I")
	private final int[] anIntArray299 = new int[16];

	@OriginalMember(owner = "client!od", name = "pb", descriptor = "[I")
	private final int[] anIntArray304 = new int[16];

	@OriginalMember(owner = "client!od", name = "gb", descriptor = "[I")
	private final int[] anIntArray302 = new int[16];

	@OriginalMember(owner = "client!od", name = "Y", descriptor = "I")
	private final int anInt4540 = 1000000;

	@OriginalMember(owner = "client!od", name = "U", descriptor = "[I")
	private final int[] anIntArray301 = new int[16];

	@OriginalMember(owner = "client!od", name = "yb", descriptor = "[I")
	private final int[] anIntArray307 = new int[16];

	@OriginalMember(owner = "client!od", name = "zb", descriptor = "[I")
	public final int[] anIntArray308 = new int[16];

	@OriginalMember(owner = "client!od", name = "Db", descriptor = "[I")
	private final int[] anIntArray309 = new int[16];

	@OriginalMember(owner = "client!od", name = "tb", descriptor = "[I")
	private final int[] anIntArray306 = new int[16];

	@OriginalMember(owner = "client!od", name = "Jb", descriptor = "[I")
	private final int[] anIntArray310 = new int[16];

	@OriginalMember(owner = "client!od", name = "vb", descriptor = "Lclient!jp;")
	private final Class118 aClass118_1 = new Class118();

	@OriginalMember(owner = "client!od", name = "Kb", descriptor = "Lclient!ff;")
	private final MidiNoteStream nodeStream = new MidiNoteStream(this);

	@OriginalMember(owner = "client!od", name = "cb", descriptor = "Lclient!ad;")
	private final HashTable instruments = new HashTable(128);

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public MidiPcmStream() {
		this.method4301();
		this.reset(true);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)Z")
	public synchronized boolean isValid() {
		return this.aClass118_1.method3199();
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
	public synchronized void releaseInstruments() {
		for (@Pc(11) MidiInstrument local11 = (MidiInstrument) this.instruments.head(); local11 != null; local11 = (MidiInstrument) this.instruments.next()) {
			local11.release();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "()Lclient!ll;")
	@Override
	public synchronized PcmStream nextSubStream() {
		return null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZLclient!ej;)V")
	public void method4272(@OriginalArg(1) boolean arg0, @OriginalArg(2) MidiNote note) {
		@Pc(8) int local8 = note.sound.samples.length;
		@Pc(31) int local31;
		if (arg0 && note.sound.aBoolean219) {
			@Pc(41) int local41 = local8 + local8 - note.sound.start;
			local8 <<= 0x8;
			local31 = (int) ((long) this.anIntArray297[note.channel] * (long) local41 >> 6);
			if (local31 >= local8) {
				note.stream.method5004();
				local31 = local8 + local8 - local31 - 1;
			}
		} else {
			local31 = (int) ((long) local8 * (long) this.anIntArray297[note.channel] >> 6);
		}
		note.stream.method5015(local31);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!sl;ZI)V")
	public synchronized void method4273(@OriginalArg(0) Song arg0, @OriginalArg(1) boolean arg1) {
		this.method4283(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V")
	public synchronized void method4274() {
		this.method4293(true);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLclient!ej;)Z")
	public boolean method4275(@OriginalArg(1) MidiNote arg0) {
		if (arg0.stream != null) {
			return false;
		}
		if (arg0.anInt1791 >= 0) {
			arg0.unlink();
			if (arg0.anInt1788 > 0 && arg0 == this.aClass2_Sub11ArrayArray2[arg0.channel][arg0.anInt1788]) {
				this.aClass2_Sub11ArrayArray2[arg0.channel][arg0.anInt1788] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V")
	public synchronized void clearInstruments() {
		for (@Pc(7) MidiInstrument local7 = (MidiInstrument) this.instruments.head(); local7 != null; local7 = (MidiInstrument) this.instruments.next()) {
			local7.unlink();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZI[ILclient!ej;)Z")
	public boolean method4277(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) MidiNote note) {
		note.anInt1780 = AudioChannel.sampleRate / 100;
		if (note.anInt1791 >= 0 && (note.stream == null || note.stream.method5001())) {
			note.release();
			note.unlink();
			if (note.anInt1788 > 0 && this.aClass2_Sub11ArrayArray2[note.channel][note.anInt1788] == note) {
				this.aClass2_Sub11ArrayArray2[note.channel][note.anInt1788] = null;
			}
			return true;
		}
		@Pc(54) int local54 = note.anInt1794;
		if (local54 > 0) {
			local54 -= (int) (Math.pow(2.0D, (double) this.anIntArray306[note.channel] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local54 < 0) {
				local54 = 0;
			}
			note.anInt1794 = local54;
		}
		note.stream.method4991(this.method4294(note));
		@Pc(97) Class17 local97 = note.aClass17_1;
		@Pc(99) boolean local99 = false;
		note.anInt1782++;
		note.anInt1790 += local97.anInt547;
		@Pc(136) double local136 = (double) ((note.anInt1776 * note.anInt1794 >> 12) + (note.anInt1781 - 60 << 8)) * 5.086263020833333E-6D;
		if (local97.anInt544 > 0) {
			if (local97.anInt541 > 0) {
				note.anInt1786 += (int) (Math.pow(2.0D, local136 * (double) local97.anInt541) * 128.0D + 0.5D);
			} else {
				note.anInt1786 += 128;
			}
			if (local97.anInt544 * note.anInt1786 >= 819200) {
				local99 = true;
			}
		}
		if (local97.aByteArray3 != null) {
			if (local97.anInt546 > 0) {
				note.anInt1778 += (int) (Math.pow(2.0D, local136 * (double) local97.anInt546) * 128.0D + 0.5D);
			} else {
				note.anInt1778 += 128;
			}
			while (local97.aByteArray3.length - 2 > note.anInt1777 && (local97.aByteArray3[note.anInt1777 + 2] & 0xFF) << 8 < note.anInt1778) {
				note.anInt1777 += 2;
			}
			if (note.anInt1777 == local97.aByteArray3.length - 2 && local97.aByteArray3[note.anInt1777 + 1] == 0) {
				local99 = true;
			}
		}
		if (note.anInt1791 >= 0 && local97.aByteArray4 != null && (this.anIntArray308[note.channel] & 0x1) == 0 && (note.anInt1788 < 0 || this.aClass2_Sub11ArrayArray2[note.channel][note.anInt1788] != note)) {
			if (local97.anInt542 <= 0) {
				note.anInt1791 += 128;
			} else {
				note.anInt1791 += (int) (Math.pow(2.0D, (double) local97.anInt542 * local136) * 128.0D + 0.5D);
			}
			while (note.anInt1779 < local97.aByteArray4.length - 2 && note.anInt1791 > (local97.aByteArray4[note.anInt1779 + 2] & 0xFF) << 8) {
				note.anInt1779 += 2;
			}
			if (note.anInt1779 == local97.aByteArray4.length - 2) {
				local99 = true;
			}
		}
		if (!local99) {
			note.stream.method4994(note.anInt1780, this.method4298(note), this.method4292(note));
			return false;
		}
		note.stream.method4990(note.anInt1780);
		if (arg2 == null) {
			note.stream.skip(arg0);
		} else {
			note.stream.read(arg2, arg1, arg0);
		}
		if (note.stream.method4989()) {
			this.nodeStream.mixer.addSubStream(note.stream);
		}
		note.release();
		if (note.anInt1791 >= 0) {
			note.unlink();
			if (note.anInt1788 > 0 && note == this.aClass2_Sub11ArrayArray2[note.channel][note.anInt1788]) {
				this.aClass2_Sub11ArrayArray2[note.channel][note.anInt1788] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
	public synchronized void setVolume(@OriginalArg(0) int arg0) {
		this.anInt4548 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIII)V")
	private void method4279(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) MidiNote local14 = this.aClass2_Sub11ArrayArray1[arg0][arg1];
		if (local14 == null) {
			return;
		}
		this.aClass2_Sub11ArrayArray1[arg0][arg1] = null;
		if ((this.anIntArray308[arg0] & 0x2) == 0) {
			local14.anInt1791 = 0;
			return;
		}
		for (@Pc(41) MidiNote local41 = (MidiNote) this.nodeStream.aClass135_15.head(); local41 != null; local41 = (MidiNote) this.nodeStream.aClass135_15.next()) {
			if (local41.channel == local14.channel && local41.anInt1791 < 0 && local41 != local14) {
				local14.anInt1791 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!bk;Lclient!sl;Lclient!r;II)Z")
	public synchronized boolean method4281(@OriginalArg(0) SoundBank arg0, @OriginalArg(1) Song arg1, @OriginalArg(2) Js5 arg2) {
		arg1.method5449();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(34) ByteArrayNode local34 = (ByteArrayNode) arg1.programs.head(); local34 != null; local34 = (ByteArrayNode) arg1.programs.next()) {
			@Pc(40) int local40 = (int) local34.key;
			@Pc(48) MidiInstrument local48 = (MidiInstrument) this.instruments.get((long) local40);
			if (local48 == null) {
				local48 = Static294.method5062(local40, arg2);
				if (local48 == null) {
					local9 = false;
					continue;
				}
				this.instruments.put(local48, (long) local40);
			}
			if (!local48.method4018(local34.aByteArray99, arg0, local23)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method5447();
		}
		return local9;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IBI)V")
	private void method4282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray299[arg1] = arg0;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void skip(@OriginalArg(0) int arg0) {
		if (this.aClass118_1.method3199()) {
			@Pc(12) int local12 = this.anInt4540 * this.aClass118_1.anInt3194 / AudioChannel.sampleRate;
			do {
				@Pc(22) long local22 = this.aLong136 + (long) arg0 * (long) local12;
				if (this.aLong135 - local22 >= 0L) {
					this.aLong136 = local22;
					break;
				}
				@Pc(51) int local51 = (int) (((long) local12 + this.aLong135 - this.aLong136 - 1L) / (long) local12);
				this.aLong136 += (long) local51 * (long) local12;
				this.nodeStream.skip(local51);
				arg0 -= local51;
				this.method4289();
			} while (this.aClass118_1.method3199());
		}
		this.nodeStream.skip(arg0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void read(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass118_1.method3199()) {
			@Pc(14) int local14 = this.anInt4540 * this.aClass118_1.anInt3194 / AudioChannel.sampleRate;
			do {
				@Pc(23) long local23 = this.aLong136 + (long) arg2 * (long) local14;
				if (this.aLong135 - local23 >= 0L) {
					this.aLong136 = local23;
					break;
				}
				@Pc(53) int local53 = (int) (((long) local14 + this.aLong135 - this.aLong136 - 1L) / (long) local14);
				this.aLong136 += (long) local14 * (long) local53;
				this.nodeStream.read(arg0, arg1, local53);
				arg1 += local53;
				this.method4289();
				arg2 -= local53;
			} while (this.aClass118_1.method3199());
		}
		this.nodeStream.read(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BZZLclient!sl;)V")
	private synchronized void method4283(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Song arg2) {
		this.method4293(arg0);
		this.aClass118_1.method3203(arg2.aByteArray77);
		this.aBoolean314 = arg1;
		this.aLong136 = 0L;
		@Pc(29) int local29 = this.aClass118_1.method3193();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			this.aClass118_1.method3206(local31);
			this.aClass118_1.method3195(local31);
			this.aClass118_1.method3192(local31);
		}
		this.anInt4565 = this.aClass118_1.method3198();
		this.anInt4566 = this.aClass118_1.anIntArray195[this.anInt4565];
		this.aLong135 = this.aClass118_1.method3200(this.anInt4566);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZII)V")
	private void method4284(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(III)V")
	private void method4285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IB)V")
	private void method4286(@OriginalArg(0) int arg0) {
		for (@Pc(6) MidiNote local6 = (MidiNote) this.nodeStream.aClass135_15.head(); local6 != null; local6 = (MidiNote) this.nodeStream.aClass135_15.next()) {
			if (arg0 < 0 || arg0 == local6.channel) {
				if (local6.stream != null) {
					local6.stream.method4990(AudioChannel.sampleRate / 100);
					if (local6.stream.method4989()) {
						this.nodeStream.mixer.addSubStream(local6.stream);
					}
					local6.release();
				}
				if (local6.anInt1791 < 0) {
					this.aClass2_Sub11ArrayArray1[local6.channel][local6.anInt1781] = null;
				}
				local6.unlink();
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)V")
	private void method4287(@OriginalArg(0) int arg0) {
		if ((this.anIntArray308[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(13) MidiNote local13 = (MidiNote) this.nodeStream.aClass135_15.head(); local13 != null; local13 = (MidiNote) this.nodeStream.aClass135_15.next()) {
			if (local13.channel == arg0 && this.aClass2_Sub11ArrayArray1[arg0][local13.anInt1781] == null && local13.anInt1791 < 0) {
				local13.anInt1791 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)V")
	private void reset(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method4286(-1);
		} else {
			this.method4297(-1);
		}
		this.method4295(-1);
		for (@Pc(24) int local24 = 0; local24 < 16; local24++) {
			this.anIntArray295[local24] = this.anIntArray304[local24];
		}
		for (@Pc(41) int local41 = 0; local41 < 16; local41++) {
			this.anIntArray309[local41] = this.anIntArray304[local41] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V")
	private void method4289() {
		@Pc(6) int local6 = this.anInt4565;
		@Pc(9) int local9 = this.anInt4566;
		@Pc(12) long local12 = this.aLong135;
		if (this.aClass2_Sub34_2 != null && local9 == this.anInt4567) {
			this.method4283(this.aBoolean315, this.aBoolean314, this.aClass2_Sub34_2);
			this.method4289();
			return;
		}
		while (this.anInt4566 == local9) {
			while (local9 == this.aClass118_1.anIntArray195[local6]) {
				this.aClass118_1.method3206(local6);
				@Pc(45) int local45 = this.aClass118_1.method3205(local6);
				if (local45 == 1) {
					this.aClass118_1.method3194();
					this.aClass118_1.method3192(local6);
					if (this.aClass118_1.method3196()) {
						if (this.aClass2_Sub34_2 != null) {
							this.method4273(this.aClass2_Sub34_2, this.aBoolean314);
							this.method4289();
							return;
						}
						if (!this.aBoolean314 || local9 == 0) {
							this.reset(true);
							this.aClass118_1.method3207();
							return;
						}
						this.aClass118_1.method3204(local12);
					}
					break;
				}
				if ((local45 & 0x80) != 0) {
					this.method4290(local45);
				}
				this.aClass118_1.method3195(local6);
				this.aClass118_1.method3192(local6);
			}
			local6 = this.aClass118_1.method3198();
			local9 = this.aClass118_1.anIntArray195[local6];
			local12 = this.aClass118_1.method3200(local9);
		}
		this.anInt4565 = local6;
		this.aLong135 = local12;
		this.anInt4566 = local9;
		if (this.aClass2_Sub34_2 != null && local9 > this.anInt4567) {
			this.anInt4566 = this.anInt4567;
			this.anInt4565 = -1;
			this.aLong135 = this.aClass118_1.method3200(this.anInt4566);
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(II)V")
	private void method4290(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0xF0;
		@Pc(14) int local14;
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (local7 == 128) {
			local14 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			local26 = arg0 >> 16 & 0x7F;
			this.method4279(local14, local20, local26);
		} else if (local7 == 144) {
			local14 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			local26 = arg0 >> 16 & 0x7F;
			if (local26 <= 0) {
				this.method4279(local14, local20, 64);
			} else {
				this.method4300(local14, local20, local26);
			}
		} else if (local7 == 160) {
			local14 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			local26 = arg0 >> 16 & 0x7F;
			this.method4284(local14, local26, local20);
		} else if (local7 == 176) {
			local14 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			local26 = arg0 >> 16 & 0x7F;
			if (local20 == 0) {
				this.anIntArray309[local14] = (local26 << 14) + (this.anIntArray309[local14] & 0xFFE03FFF);
			}
			if (local20 == 32) {
				this.anIntArray309[local14] = (local26 << 7) + (this.anIntArray309[local14] & 0xFFFFC07F);
			}
			if (local20 == 1) {
				this.anIntArray301[local14] = (this.anIntArray301[local14] & 0xFFFFC07F) + (local26 << 7);
			}
			if (local20 == 33) {
				this.anIntArray301[local14] = local26 + (this.anIntArray301[local14] & 0xFFFFFF80);
			}
			if (local20 == 5) {
				this.anIntArray306[local14] = (local26 << 7) + (this.anIntArray306[local14] & 0xFFFFC07F);
			}
			if (local20 == 37) {
				this.anIntArray306[local14] = (this.anIntArray306[local14] & 0xFFFFFF80) + local26;
			}
			if (local20 == 7) {
				this.anIntArray296[local14] = (local26 << 7) + (this.anIntArray296[local14] & 0xFFFFC07F);
			}
			if (local20 == 39) {
				this.anIntArray296[local14] = (this.anIntArray296[local14] & 0xFFFFFF80) + local26;
			}
			if (local20 == 10) {
				this.anIntArray305[local14] = (this.anIntArray305[local14] & 0xFFFFC07F) + (local26 << 7);
			}
			if (local20 == 42) {
				this.anIntArray305[local14] = (this.anIntArray305[local14] & 0xFFFFFF80) + local26;
			}
			if (local20 == 11) {
				this.anIntArray298[local14] = (this.anIntArray298[local14] & 0xFFFFC07F) + (local26 << 7);
			}
			if (local20 == 43) {
				this.anIntArray298[local14] = (this.anIntArray298[local14] & 0xFFFFFF80) + local26;
			}
			if (local20 == 64) {
				if (local26 >= 64) {
					this.anIntArray308[local14] |= 0x1;
				} else {
					this.anIntArray308[local14] &= 0xFFFFFFFE;
				}
			}
			if (local20 == 65) {
				if (local26 >= 64) {
					this.anIntArray308[local14] |= 0x2;
				} else {
					this.method4287(local14);
					this.anIntArray308[local14] &= 0xFFFFFFFD;
				}
			}
			if (local20 == 99) {
				this.anIntArray310[local14] = (this.anIntArray310[local14] & 0x7F) + (local26 << 7);
			}
			if (local20 == 98) {
				this.anIntArray310[local14] = local26 + (this.anIntArray310[local14] & 0x3F80);
			}
			if (local20 == 101) {
				this.anIntArray310[local14] = (local26 << 7) + (this.anIntArray310[local14] & 0x7F) + 16384;
			}
			if (local20 == 100) {
				this.anIntArray310[local14] = local26 + (this.anIntArray310[local14] & 0x3F80) + 16384;
			}
			if (local20 == 120) {
				this.method4286(local14);
			}
			if (local20 == 121) {
				this.method4295(local14);
			}
			if (local20 == 123) {
				this.method4297(local14);
			}
			@Pc(497) int local497;
			if (local20 == 6) {
				local497 = this.anIntArray310[local14];
				if (local497 == 16384) {
					this.anIntArray307[local14] = (this.anIntArray307[local14] & 0xFFFFC07F) + (local26 << 7);
				}
			}
			if (local20 == 38) {
				local497 = this.anIntArray310[local14];
				if (local497 == 16384) {
					this.anIntArray307[local14] = (this.anIntArray307[local14] & 0xFFFFFF80) + local26;
				}
			}
			if (local20 == 16) {
				this.anIntArray297[local14] = (local26 << 7) + (this.anIntArray297[local14] & 0xFFFFC07F);
			}
			if (local20 == 48) {
				this.anIntArray297[local14] = (this.anIntArray297[local14] & 0xFFFFFF80) + local26;
			}
			if (local20 == 81) {
				if (local26 >= 64) {
					this.anIntArray308[local14] |= 0x4;
				} else {
					this.method4305(local14);
					this.anIntArray308[local14] &= 0xFFFFFFFB;
				}
			}
			if (local20 == 17) {
				this.method4306(local14, (this.anIntArray303[local14] & 0xFFFFC07F) + (local26 << 7));
			}
			if (local20 == 49) {
				this.method4306(local14, local26 + (this.anIntArray303[local14] & 0xFFFFFF80));
			}
		} else if (local7 == 192) {
			local14 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			this.method4291(local20 + this.anIntArray309[local14], local14);
		} else if (local7 == 208) {
			local14 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			this.method4285(local20, local14);
		} else if (local7 == 224) {
			local14 = arg0 & 0xF;
			local20 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method4282(local20, local14);
		} else {
			local7 = arg0 & 0xFF;
			if (local7 == 255) {
				this.reset(true);
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIB)V")
	private void method4291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.anIntArray295[arg1]) {
			this.anIntArray295[arg1] = arg0;
			for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
				this.aClass2_Sub11ArrayArray2[arg1][local16] = null;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ej;I)I")
	private int method4292(@OriginalArg(0) MidiNote arg0) {
		@Pc(9) int local9 = this.anIntArray305[arg0.channel];
		return local9 < 8192 ? local9 * arg0.anInt1775 + 32 >> 6 : 16384 - ((128 - arg0.anInt1775) * (-local9 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BZ)V")
	private synchronized void method4293(@OriginalArg(1) boolean arg0) {
		this.aClass118_1.method3207();
		this.aClass2_Sub34_2 = null;
		this.reset(arg0);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Lclient!ej;I)I")
	private int method4294(@OriginalArg(0) MidiNote arg0) {
		@Pc(14) int local14 = (arg0.anInt1794 * arg0.anInt1776 >> 12) + arg0.anInt1795;
		local14 += this.anIntArray307[arg0.channel] * (this.anIntArray299[arg0.channel] - 8192) >> 12;
		@Pc(40) Class17 local40 = arg0.aClass17_1;
		@Pc(63) int local63;
		if (local40.anInt547 > 0 && (local40.anInt540 > 0 || this.anIntArray301[arg0.channel] > 0)) {
			local63 = local40.anInt540 << 2;
			@Pc(68) int local68 = local40.anInt539 << 1;
			if (arg0.anInt1782 < local68) {
				local63 = local63 * arg0.anInt1782 / local68;
			}
			local63 += this.anIntArray301[arg0.channel] >> 7;
			@Pc(102) double local102 = Math.sin((double) (arg0.anInt1790 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local63 * local102);
		}
		local63 = (int) ((double) (arg0.sound.anInt3176 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) AudioChannel.sampleRate + 0.5D);
		return local63 < 1 ? 1 : local63;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(IB)V")
	private void method4295(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
				this.method4295(local7);
			}
			return;
		}
		this.anIntArray296[arg0] = 12800;
		this.anIntArray305[arg0] = 8192;
		this.anIntArray298[arg0] = 16383;
		this.anIntArray299[arg0] = 8192;
		this.anIntArray301[arg0] = 0;
		this.anIntArray306[arg0] = 8192;
		this.method4287(arg0);
		this.method4305(arg0);
		this.anIntArray308[arg0] = 0;
		this.anIntArray310[arg0] = 32767;
		this.anIntArray307[arg0] = 256;
		this.anIntArray297[arg0] = 0;
		this.method4306(arg0, 8192);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IIB)V")
	public synchronized void init() {
		this.method4304();
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IZ)V")
	private void method4297(@OriginalArg(0) int arg0) {
		for (@Pc(10) MidiNote local10 = (MidiNote) this.nodeStream.aClass135_15.head(); local10 != null; local10 = (MidiNote) this.nodeStream.aClass135_15.next()) {
			if ((arg0 < 0 || arg0 == local10.channel) && local10.anInt1791 < 0) {
				this.aClass2_Sub11ArrayArray1[local10.channel][local10.anInt1781] = null;
				local10.anInt1791 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "()Lclient!ll;")
	@Override
	public synchronized PcmStream method4978() {
		return this.nodeStream;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "()I")
	@Override
	public synchronized int method4977() {
		return 0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!ej;)I")
	private int method4298(@OriginalArg(1) MidiNote arg0) {
		if (this.anIntArray302[arg0.channel] == 0) {
			return 0;
		}
		@Pc(14) Class17 local14 = arg0.aClass17_1;
		@Pc(30) int local30 = this.anIntArray296[arg0.channel] * this.anIntArray298[arg0.channel] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = arg0.anInt1783 * local38 + 16384 >> 15;
		@Pc(56) int local56 = local47 * this.anInt4548 + 128 >> 8;
		local30 = this.anIntArray302[arg0.channel] * local56 + 128 >> 8;
		if (local14.anInt544 > 0) {
			local30 = (int) (Math.pow(0.5D, (double) arg0.anInt1786 * 1.953125E-5D * (double) local14.anInt544) * (double) local30 + 0.5D);
		}
		@Pc(95) int local95;
		@Pc(103) int local103;
		@Pc(125) int local125;
		@Pc(137) int local137;
		if (local14.aByteArray3 != null) {
			local95 = arg0.anInt1778;
			local103 = local14.aByteArray3[arg0.anInt1777 + 1];
			if (local14.aByteArray3.length - 2 > arg0.anInt1777) {
				local125 = (local14.aByteArray3[arg0.anInt1777] & 0xFF) << 8;
				local137 = (local14.aByteArray3[arg0.anInt1777 + 2] & 0xFF) << 8;
				local103 += (local95 - local125) * (-local103 + local14.aByteArray3[arg0.anInt1777 + 3]) / (local137 - local125);
			}
			local30 = local30 * local103 + 32 >> 6;
		}
		if (arg0.anInt1791 > 0 && local14.aByteArray4 != null) {
			local95 = arg0.anInt1791;
			local103 = local14.aByteArray4[arg0.anInt1779 + 1];
			if (local14.aByteArray4.length - 2 > arg0.anInt1779) {
				local125 = (local14.aByteArray4[arg0.anInt1779] & 0xFF) << 8;
				local137 = (local14.aByteArray4[arg0.anInt1779 + 2] & 0xFF) << 8;
				local103 += (local95 - local125) * (-local103 + local14.aByteArray4[arg0.anInt1779 + 3]) / (local137 - local125);
			}
			local30 = local103 * local30 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IBII)V")
	private void method4300(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method4279(arg0, arg1, 64);
		if ((this.anIntArray308[arg0] & 0x2) != 0) {
			for (@Pc(26) MidiNote local26 = (MidiNote) this.nodeStream.aClass135_15.tail(); local26 != null; local26 = (MidiNote) this.nodeStream.aClass135_15.method3547()) {
				if (local26.channel == arg0 && local26.anInt1791 < 0) {
					this.aClass2_Sub11ArrayArray1[arg0][local26.anInt1781] = null;
					this.aClass2_Sub11ArrayArray1[arg0][arg1] = local26;
					@Pc(60) int local60 = local26.anInt1795 + (local26.anInt1776 * local26.anInt1794 >> 12);
					local26.anInt1795 += arg1 - local26.anInt1781 << 8;
					local26.anInt1794 = 4096;
					local26.anInt1776 = local60 - local26.anInt1795;
					local26.anInt1781 = arg1;
					return;
				}
			}
		}
		@Pc(105) MidiInstrument local105 = (MidiInstrument) this.instruments.get((long) this.anIntArray295[arg0]);
		if (local105 == null) {
			return;
		}
		@Pc(113) PcmSound local113 = local105.aClass2_Sub21_Sub1Array1[arg1];
		if (local113 == null) {
			return;
		}
		@Pc(120) MidiNote local120 = new MidiNote();
		local120.channel = arg0;
		local120.sound = local113;
		local120.aClass2_Sub25_1 = local105;
		local120.aClass17_1 = local105.aClass17Array1[arg1];
		local120.anInt1788 = local105.aByteArray46[arg1];
		local120.anInt1781 = arg1;
		local120.anInt1783 = arg2 * arg2 * local105.anInt4064 * local105.aByteArray47[arg1] + 1024 >> 11;
		local120.anInt1775 = local105.aByteArray45[arg1] & 0xFF;
		local120.anInt1795 = (arg1 << 8) - (local105.aShortArray90[arg1] & 0x7FFF);
		local120.anInt1777 = 0;
		local120.anInt1778 = 0;
		local120.anInt1791 = -1;
		local120.anInt1786 = 0;
		local120.anInt1779 = 0;
		if (this.anIntArray297[arg0] == 0) {
			local120.stream = Static406.method4998(local113, this.method4294(local120), this.method4298(local120), this.method4292(local120));
		} else {
			local120.stream = Static406.method4998(local113, this.method4294(local120), 0, this.method4292(local120));
			this.method4272(local105.aShortArray90[arg1] < 0, local120);
		}
		if (local105.aShortArray90[arg1] < 0) {
			local120.stream.method4984(-1);
		}
		if (local120.anInt1788 >= 0) {
			@Pc(276) MidiNote local276 = this.aClass2_Sub11ArrayArray2[arg0][local120.anInt1788];
			if (local276 != null && local276.anInt1791 < 0) {
				this.aClass2_Sub11ArrayArray1[arg0][local276.anInt1781] = null;
				local276.anInt1791 = 0;
			}
			this.aClass2_Sub11ArrayArray2[arg0][local120.anInt1788] = local120;
		}
		this.nodeStream.aClass135_15.addTail(local120);
		this.aClass2_Sub11ArrayArray1[arg0][arg1] = local120;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(III)V")
	private synchronized void method4301() {
		for (@Pc(6) int local6 = 0; local6 < 16; local6++) {
			this.anIntArray302[local6] = 256;
		}
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(I)I")
	public int getVolume() {
		return this.anInt4548;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BII)V")
	private void method4304() {
		this.anIntArray304[9] = 128;
		this.anIntArray309[9] = 128;
		this.method4291(128, 9);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)V")
	private void method4305(@OriginalArg(1) int arg0) {
		if ((this.anIntArray308[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(17) MidiNote local17 = (MidiNote) this.nodeStream.aClass135_15.head(); local17 != null; local17 = (MidiNote) this.nodeStream.aClass135_15.next()) {
			if (arg0 == local17.channel) {
				local17.anInt1792 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(III)V")
	private void method4306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray303[arg0] = arg1;
		this.anIntArray300[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}
}
