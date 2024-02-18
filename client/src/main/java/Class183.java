import com.ms.com.ComFailException;
import com.ms.com._Guid;
import com.ms.directX.DSBufferDesc;
import com.ms.directX.DSCursors;
import com.ms.directX.DirectSound;
import com.ms.directX.DirectSoundBuffer;
import com.ms.directX.WaveFormatEx;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class183 implements Interface7 {

	@OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
	private int anInt4569;

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
	private int anInt4570;

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
	private int anInt4571;

	@OriginalMember(owner = "client!ir", name = "k", descriptor = "[I")
	private int[] anIntArray354;

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
	private final DSBufferDesc[] aDSBufferDescArray1 = new DSBufferDesc[2];

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "[Z")
	private final boolean[] aBooleanArray12 = new boolean[2];

	@OriginalMember(owner = "client!ir", name = "l", descriptor = "[Lcom/ms/directX/DSCursors;")
	private final DSCursors[] aDSCursorsArray1 = new DSCursors[2];

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "[I")
	private final int[] anIntArray353 = new int[2];

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
	private final DirectSoundBuffer[] aDirectSoundBufferArray1 = new DirectSoundBuffer[2];

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "[I")
	private final int[] anIntArray355 = new int[2];

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "[[B")
	private final byte[][] aByteArrayArray15 = new byte[2][];

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "Lcom/ms/directX/DirectSound;")
	private final DirectSound aDirectSound1 = new DirectSound();

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "Lcom/ms/directX/WaveFormatEx;")
	private final WaveFormatEx aWaveFormatEx1 = new WaveFormatEx();

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V")
	private Class183() throws Exception {
		for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
			this.aDSBufferDescArray1[local41] = new DSBufferDesc();
		}
		for (@Pc(57) int local57 = 0; local57 < 2; local57++) {
			this.aDSCursorsArray1[local57] = new DSCursors();
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I[I)V")
	@Override
	public void method4098(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(2) int local2 = arg1.length;
		if (local2 != this.anInt4571 * 256) {
			throw new IllegalArgumentException();
		}
		@Pc(21) int local21 = this.anIntArray353[arg0] * this.anInt4570;
		for (@Pc(23) int local23 = 0; local23 < local2; local23++) {
			@Pc(28) int local28 = arg1[local23];
			if ((local28 + 8388608 & 0xFF000000) != 0) {
				local28 = local28 >> 31 ^ 0x7FFFFF;
			}
			this.aByteArrayArray15[arg0][local21 + local23 * 2] = (byte) (local28 >> 8);
			this.aByteArrayArray15[arg0][local21 + local23 * 2 + 1] = (byte) (local28 >> 16);
		}
		this.aDirectSoundBufferArray1[arg0].writeBuffer(local21, local2 * 2, this.aByteArrayArray15[arg0], 0);
		this.anIntArray353[arg0] = this.anIntArray353[arg0] + local2 / this.anInt4571 & 0xFFFF;
		if (!this.aBooleanArray12[arg0]) {
			this.aDirectSoundBufferArray1[arg0].play(1);
			this.aBooleanArray12[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)I")
	@Override
	public int method4094(@OriginalArg(0) int arg0) {
		if (!this.aBooleanArray12[arg0]) {
			return 0;
		}
		this.aDirectSoundBufferArray1[arg0].getCurrentPosition(this.aDSCursorsArray1[arg0]);
		@Pc(25) int local25 = this.aDSCursorsArray1[arg0].write / this.anInt4570;
		@Pc(35) int local35 = this.anIntArray353[arg0] - local25 & 0xFFFF;
		if (this.anIntArray355[arg0] < local35) {
			@Pc(63) int local63 = local25 - this.anIntArray353[arg0] & 0xFFFF;
			while (local63 > 0) {
				local63 -= 256;
				this.method4098(arg0, this.anIntArray354);
			}
			local35 = this.anIntArray353[arg0] - local25 & 0xFFFF;
		}
		return local35;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZLjava/awt/Component;B)V")
	@Override
	public void method4096(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) throws Exception {
		if (this.anInt4569 != 0) {
			return;
		}
		if (arg0 < 8000 || arg0 > 48000) {
			throw new IllegalArgumentException();
		}
		this.anInt4571 = arg1 ? 2 : 1;
		this.anInt4570 = arg1 ? 4 : 2;
		this.anIntArray354 = new int[this.anInt4571 * 256];
		this.aDirectSound1.initialize((_Guid) null);
		this.aDirectSound1.setCooperativeLevel(arg2, 2);
		for (@Pc(60) int local60 = 0; local60 < 2; local60++) {
			this.aDSBufferDescArray1[local60].flags = 16384;
		}
		this.aWaveFormatEx1.avgBytesPerSec = arg0 * this.anInt4570;
		this.aWaveFormatEx1.formatTag = 1;
		this.aWaveFormatEx1.channels = this.anInt4571;
		this.aWaveFormatEx1.blockAlign = this.anInt4570;
		this.aWaveFormatEx1.samplesPerSec = arg0;
		this.anInt4569 = arg0;
		this.aWaveFormatEx1.bitsPerSample = 16;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZ)V")
	@Override
	public void method4099(@OriginalArg(0) int arg0) {
		if (this.aDirectSoundBufferArray1[arg0] == null) {
			return;
		}
		try {
			this.aDirectSoundBufferArray1[arg0].stop();
		} catch (@Pc(12) ComFailException local12) {
		}
		this.aDirectSoundBufferArray1[arg0] = null;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)V")
	@Override
	public void method4095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception {
		if (this.anInt4569 == 0 || this.aDirectSoundBufferArray1[arg1] != null) {
			throw new IllegalStateException();
		}
		@Pc(22) int local22 = this.anInt4570 * 65536;
		if (this.aByteArrayArray15[arg1] == null || this.aByteArrayArray15[arg1].length != local22) {
			this.aByteArrayArray15[arg1] = new byte[local22];
			this.aDSBufferDescArray1[arg1].bufferBytes = local22;
		}
		this.aDirectSoundBufferArray1[arg1] = this.aDirectSound1.createSoundBuffer(this.aDSBufferDescArray1[arg1], this.aWaveFormatEx1);
		this.aBooleanArray12[arg1] = false;
		this.anIntArray353[arg1] = 0;
		this.anIntArray355[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IB)V")
	@Override
	public void method4097(@OriginalArg(0) int arg0) {
		this.aDirectSoundBufferArray1[arg0].stop();
		this.aBooleanArray12[arg0] = false;
		this.aDirectSoundBufferArray1[arg0].setCurrentPosition(0);
		this.anIntArray353[arg0] = 0;
	}
}
