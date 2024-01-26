import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class i extends Class114 implements Interface5 {

	@OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "Lclient!oa;")
	private final oa anOa2;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!ya;")
	private final ya aYa1;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "[Lclient!rv;")
	public Class328[] aClass328Array3;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "[Lclient!mn;")
	public Class249[] aClass249Array3;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;Lclient!ya;Lclient!dv;IIII)V")
	public i(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anOa2 = arg0;
		this.aYa1 = arg1;
		this.aClass328Array3 = arg2.aClass328Array1;
		this.aClass249Array3 = arg2.aClass249Array1;
		@Pc(24) int local24 = arg2.aClass328Array1 == null ? 0 : arg2.aClass328Array1.length;
		@Pc(34) int local34 = arg2.aClass249Array1 == null ? 0 : arg2.aClass249Array1.length;
		@Pc(36) int local36 = 0;
		@Pc(43) int[] local43 = new int[local24 * 3 + local34];
		for (@Pc(45) int local45 = 0; local45 < local24; local45++) {
			local43[local36++] = this.aClass328Array3[local45].anInt8514;
			local43[local36++] = this.aClass328Array3[local45].anInt8508;
			local43[local36++] = this.aClass328Array3[local45].anInt8505;
		}
		for (@Pc(79) int local79 = 0; local79 < local34; local79++) {
			local43[local36++] = this.aClass249Array3[local79].anInt6247;
		}
		@Pc(105) int local105 = arg2.aClass24Array1 == null ? 0 : arg2.aClass24Array1.length;
		@Pc(110) int[] local110 = new int[local105 * 8];
		@Pc(112) int local112 = 0;
		for (@Pc(114) int local114 = 0; local114 < local105; local114++) {
			@Pc(120) Class24 local120 = arg2.aClass24Array1[local114];
			@Pc(125) Class376 local125 = Static402.method5582(local120.anInt592);
			local110[local112++] = local120.anInt588;
			local110[local112++] = local125.anInt9696;
			local110[local112++] = local125.anInt9690;
			local110[local112++] = local125.anInt9693;
			local110[local112++] = local125.anInt9697;
			local110[local112++] = local125.anInt9689;
			local110[local112++] = local125.aBoolean747 ? -1 : 0;
		}
		for (@Pc(178) int local178 = 0; local178 < local105; local178++) {
			@Pc(184) Class24 local184 = arg2.aClass24Array1[local178];
			local110[local112++] = local184.anInt589;
		}
		this.R(this.anOa2, this.aYa1, arg2.anInt2372, arg2.anInt2363, arg2.anIntArray213, arg2.anIntArray205, arg2.anIntArray204, arg2.anIntArray209, arg2.aShortArray23, arg2.anInt2362, arg2.aShortArray27, arg2.aShortArray24, arg2.aShortArray26, arg2.aByteArray25, arg2.aByteArray26, arg2.aByteArray29, arg2.aByteArray28, arg2.aShortArray22, arg2.aShortArray25, arg2.anIntArray210, arg2.aByte45, arg2.aShortArray20, arg2.anInt2377, arg2.aByteArray24, arg2.aShortArray29, arg2.aShortArray21, arg2.aShortArray28, arg2.anIntArray211, arg2.anIntArray207, arg2.anIntArray208, arg2.aByteArray27, arg2.aByteArray23, arg2.anIntArray214, arg2.anIntArray212, arg2.anIntArray206, local43, local24, local34, arg3, arg4, arg5, arg6, local110);
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!oa;)V")
	public i(@OriginalArg(0) oa arg0) {
		this.anOa2 = arg0;
		this.aYa1 = null;
		this.oa(arg0);
	}

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public native void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(3) Class178 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
	public native void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
	public native void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
	public native int ua();

	@OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
	public native boolean F();

	@OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
	public native int fa();

	@OriginalMember(owner = "client!i", name = "g", descriptor = "()V")
	@Override
	protected void method7491() {
		if (this.anOa2.anInt6770 <= 1) {
			return;
		}
		synchronized (this) {
			while (super.aBoolean645) {
				try {
					this.wait();
				} catch (@Pc(13) InterruptedException local13) {
				}
			}
			super.aBoolean645 = true;
		}
	}

	@OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
	public native void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
	public native void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!tt;ZII)Z")
	@Override
	public boolean method7483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.anOa2.method6087().method5(this, arg0, arg1, arg2, arg3, arg5);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B[B)V")
	@Override
	public void method7498(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected native void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7499(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.l(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!tt;IZ)V")
	@Override
	public void method7492(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.J(((ja) arg0).nativeid, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!tt;ZI)Z")
	@Override
	public boolean method7486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.anOa2.method6087().method11(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
	public native int RA();

	@OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
	public native int da();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public native void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
	public native int V();

	@OriginalMember(owner = "client!i", name = "J", descriptor = "(JIZ)V")
	private native void J(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
	public native int na();

	@OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
	protected native void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!tt;)V")
	@Override
	public void method7476(@OriginalArg(0) Class73 arg0) {
		this.method3688(Static445.anIntArray537, arg0);
		@Pc(5) int local5 = 0;
		@Pc(10) int local10;
		if (this.aClass328Array3 != null) {
			for (local10 = 0; local10 < this.aClass328Array3.length; local10++) {
				@Pc(16) Class328 local16 = this.aClass328Array3[local10];
				local16.anInt8518 = Static445.anIntArray537[local5++];
				local16.anInt8502 = Static445.anIntArray537[local5++];
				local16.anInt8504 = Static445.anIntArray537[local5++];
				local16.anInt8516 = Static445.anIntArray537[local5++];
				local16.anInt8507 = Static445.anIntArray537[local5++];
				local16.anInt8509 = Static445.anIntArray537[local5++];
				local16.anInt8512 = Static445.anIntArray537[local5++];
				local16.anInt8503 = Static445.anIntArray537[local5++];
				local16.anInt8520 = Static445.anIntArray537[local5++];
			}
		}
		if (this.aClass249Array3 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass249Array3.length; local10++) {
			@Pc(89) Class249 local89 = this.aClass249Array3[local10];
			@Pc(91) Class249 local91 = local89;
			if (local89.aClass249_2 != null) {
				local91 = local89.aClass249_2;
			}
			if (local89.aClass73_6 == null) {
				local89.aClass73_6 = arg0.method7129();
			} else {
				local89.aClass73_6.method7128(arg0);
			}
			local91.anInt6252 = Static445.anIntArray537[local5++];
			local91.anInt6250 = Static445.anIntArray537[local5++];
			local91.anInt6249 = Static445.anIntArray537[local5++];
		}
	}

	@OriginalMember(owner = "client!i", name = "R", descriptor = "(Lclient!oa;Lclient!ya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
	private native void R(@OriginalArg(0) oa arg0, @OriginalArg(1) ya arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) short[] arg10, @OriginalArg(11) short[] arg11, @OriginalArg(12) short[] arg12, @OriginalArg(13) byte[] arg13, @OriginalArg(14) byte[] arg14, @OriginalArg(15) byte[] arg15, @OriginalArg(16) byte[] arg16, @OriginalArg(17) short[] arg17, @OriginalArg(18) short[] arg18, @OriginalArg(19) int[] arg19, @OriginalArg(20) byte arg20, @OriginalArg(21) short[] arg21, @OriginalArg(22) int arg22, @OriginalArg(23) byte[] arg23, @OriginalArg(24) short[] arg24, @OriginalArg(25) short[] arg25, @OriginalArg(26) short[] arg26, @OriginalArg(27) int[] arg27, @OriginalArg(28) int[] arg28, @OriginalArg(29) int[] arg29, @OriginalArg(30) byte[] arg30, @OriginalArg(31) byte[] arg31, @OriginalArg(32) int[] arg32, @OriginalArg(33) int[] arg33, @OriginalArg(34) int[] arg34, @OriginalArg(35) int[] arg35, @OriginalArg(36) int arg36, @OriginalArg(37) int arg37, @OriginalArg(38) int arg38, @OriginalArg(39) int arg39, @OriginalArg(40) int arg40, @OriginalArg(41) int arg41, @OriginalArg(42) int[] arg42);

	@OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()[Lclient!mn;")
	@Override
	public Class249[] method7480() {
		return this.aClass249Array3;
	}

	@OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
	public native int G();

	@OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
	public native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
	private native void l(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()[B")
	@Override
	public byte[] method7489() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
	public native void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
	protected native void wa();

	@OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
	@Override
	public void method7479() {
	}

	@OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
	public native int HA();

	@OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public native Class2_Sub2_Sub9 ba(@OriginalArg(0) Class2_Sub2_Sub9 arg0);

	@OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
	public native void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!tt;Lclient!ima;II)V")
	@Override
	public void method7484(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class8_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == null) {
			this.anOa2.method6087().method9(this, arg0, (int[]) null, arg2, arg3);
			return;
		}
		Static445.anIntArray542[5] = 0;
		this.anOa2.method6087().method9(this, arg0, Static445.anIntArray542, arg2, arg3);
		arg1.anInt4504 = Static445.anIntArray542[0];
		arg1.anInt4505 = Static445.anIntArray542[1];
		arg1.anInt4501 = Static445.anIntArray542[2];
		arg1.anInt4503 = Static445.anIntArray542[3];
		arg1.anInt4502 = Static445.anIntArray542[4];
		arg1.aBoolean352 = Static445.anIntArray542[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
	public native boolean r();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!tt;)V")
	private void method3688(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class73 arg1) {
		this.anOa2.method6087().method15(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
	@Override
	protected void method7494() {
		if (this.anOa2.anInt6770 > 1) {
			synchronized (this) {
				super.aBoolean645 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Lclient!i;Lclient!i;IZZ)V")
	public native void ZA(@OriginalArg(0) i arg0, @OriginalArg(1) i arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
	protected native boolean NA();

	@OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
	public native int WA();

	@OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
	public native void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class114 method7495(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return this.anOa2.method6087().method3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static307.method4477(this);
		}
	}

	@OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
	public native int EA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()Z")
	@Override
	public boolean method7474() {
		return true;
	}

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
	public native void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!tt;Lclient!ima;I)V")
	@Override
	public void method7473(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class8_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			this.anOa2.method6087().method8(this, arg0, (int[]) null, arg2);
			return;
		}
		Static445.anIntArray542[5] = 0;
		this.anOa2.method6087().method8(this, arg0, Static445.anIntArray542, arg2);
		arg1.anInt4504 = Static445.anIntArray542[0];
		arg1.anInt4505 = Static445.anIntArray542[1];
		arg1.anInt4501 = Static445.anIntArray542[2];
		arg1.anInt4503 = Static445.anIntArray542[3];
		arg1.anInt4502 = Static445.anIntArray542[4];
		arg1.aBoolean352 = Static445.anIntArray542[5] != 0;
	}

	@OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
	public native int ma();

	@OriginalMember(owner = "client!i", name = "oa", descriptor = "(Lclient!oa;)V")
	private native void oa(@OriginalArg(0) oa arg0);

	@OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
	public native void v();

	@OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
	public native void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method7481(@OriginalArg(0) Class114 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anOa2.method6087().method10(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "()[Lclient!rv;")
	@Override
	public Class328[] method7482() {
		return this.aClass328Array3;
	}
}
