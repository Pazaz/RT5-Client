import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class SoftwareModel extends Model {

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "[I")
	private static final int[] reciprical16 = new int[2048];

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "[I")
	private int[] anIntArray44;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "[I")
	private int[] anIntArray46;

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "[I")
	private int[] anIntArray48;

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "[Lclient!jf;")
	private Class114[] aClass114Array1;

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "[I")
	private int[] anIntArray49;

	@OriginalMember(owner = "client!cb", name = "C", descriptor = "[Lclient!bn;")
	private Class26[] aClass26Array1;

	@OriginalMember(owner = "client!cb", name = "D", descriptor = "[I")
	private int[] anIntArray50;

	@OriginalMember(owner = "client!cb", name = "E", descriptor = "S")
	private short aShort2;

	@OriginalMember(owner = "client!cb", name = "H", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!cb", name = "J", descriptor = "[I")
	private int[] anIntArray51;

	@OriginalMember(owner = "client!cb", name = "K", descriptor = "S")
	private short aShort3;

	@OriginalMember(owner = "client!cb", name = "M", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!cb", name = "N", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!cb", name = "O", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!cb", name = "P", descriptor = "Lclient!cb;")
	private SoftwareModel aClass31_Sub1_1;

	@OriginalMember(owner = "client!cb", name = "Q", descriptor = "Lclient!cb;")
	private SoftwareModel aClass31_Sub1_2;

	@OriginalMember(owner = "client!cb", name = "S", descriptor = "S")
	private short aShort4;

	@OriginalMember(owner = "client!cb", name = "T", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!cb", name = "U", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!cb", name = "V", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!cb", name = "W", descriptor = "Lclient!cb;")
	private SoftwareModel aClass31_Sub1_3;

	@OriginalMember(owner = "client!cb", name = "X", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!cb", name = "Z", descriptor = "[I")
	private int[] anIntArray58;

	@OriginalMember(owner = "client!cb", name = "ab", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!cb", name = "cb", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!cb", name = "db", descriptor = "[I")
	private int[] anIntArray61;

	@OriginalMember(owner = "client!cb", name = "eb", descriptor = "[Lclient!nm;")
	private Class163[] aClass163Array1;

	@OriginalMember(owner = "client!cb", name = "hb", descriptor = "[I")
	private int[] anIntArray62;

	@OriginalMember(owner = "client!cb", name = "ib", descriptor = "Lclient!cb;")
	private SoftwareModel aClass31_Sub1_4;

	@OriginalMember(owner = "client!cb", name = "jb", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!cb", name = "kb", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!cb", name = "lb", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!cb", name = "mb", descriptor = "[I")
	private int[] anIntArray63;

	@OriginalMember(owner = "client!cb", name = "nb", descriptor = "[I")
	private int[] anIntArray64;

	@OriginalMember(owner = "client!cb", name = "ob", descriptor = "[Lclient!um;")
	private Class234[] aClass234Array1;

	@OriginalMember(owner = "client!cb", name = "pb", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!cb", name = "qb", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!cb", name = "sb", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!cb", name = "ub", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!cb", name = "vb", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!cb", name = "wb", descriptor = "[I")
	private int[] anIntArray67;

	@OriginalMember(owner = "client!cb", name = "xb", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!cb", name = "yb", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!cb", name = "zb", descriptor = "[I")
	private int[] anIntArray69;

	@OriginalMember(owner = "client!cb", name = "Ab", descriptor = "Lclient!cb;")
	private SoftwareModel aClass31_Sub1_5;

	@OriginalMember(owner = "client!cb", name = "Bb", descriptor = "[I")
	private int[] anIntArray70;

	@OriginalMember(owner = "client!cb", name = "Cb", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!cb", name = "Db", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!cb", name = "Eb", descriptor = "[Lclient!bn;")
	private Class26[] aClass26Array2;

	@OriginalMember(owner = "client!cb", name = "Fb", descriptor = "Lclient!gf;")
	private Rasteriser aClass81_1;

	@OriginalMember(owner = "client!cb", name = "Gb", descriptor = "Lclient!cb;")
	private SoftwareModel aClass31_Sub1_6;

	@OriginalMember(owner = "client!cb", name = "Hb", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!cb", name = "Jb", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!cb", name = "Kb", descriptor = "Lclient!ba;")
	private Class14_Sub1 aClass14_Sub1_1;

	@OriginalMember(owner = "client!cb", name = "Lb", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!cb", name = "Mb", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!cb", name = "Ob", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!cb", name = "Pb", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!cb", name = "Qb", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!cb", name = "Rb", descriptor = "Lclient!wq;")
	private Class250 aClass250_1;

	@OriginalMember(owner = "client!cb", name = "Sb", descriptor = "[I")
	private int[] anIntArray74;

	@OriginalMember(owner = "client!cb", name = "Tb", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!cb", name = "Ub", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!cb", name = "Vb", descriptor = "Lclient!wq;")
	private Class250 aClass250_2;

	@OriginalMember(owner = "client!cb", name = "Wb", descriptor = "[Z")
	private boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!cb", name = "Xb", descriptor = "[Lclient!at;")
	private Class12_Sub1_Sub1[] aClass12_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!cb", name = "Yb", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!cb", name = "Zb", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!cb", name = "ac", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!cb", name = "bc", descriptor = "[I")
	private int[] anIntArray76;

	@OriginalMember(owner = "client!cb", name = "cc", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!cb", name = "dc", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!cb", name = "ec", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!cb", name = "fc", descriptor = "Lclient!cb;")
	private SoftwareModel aClass31_Sub1_7;

	@OriginalMember(owner = "client!cb", name = "gc", descriptor = "Lclient!cb;")
	private SoftwareModel aClass31_Sub1_8;

	@OriginalMember(owner = "client!cb", name = "hc", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!cb", name = "ic", descriptor = "[Z")
	private boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!cb", name = "jc", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!cb", name = "kc", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
	private int anInt979 = 0;

	@OriginalMember(owner = "client!cb", name = "G", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
	private int anInt981 = 0;

	@OriginalMember(owner = "client!cb", name = "gb", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!cb", name = "fb", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!cb", name = "rb", descriptor = "I")
	private int anInt986 = 0;

	@OriginalMember(owner = "client!cb", name = "Ib", descriptor = "I")
	private int anInt987 = 0;

	@OriginalMember(owner = "client!cb", name = "tb", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!cb", name = "F", descriptor = "B")
	private byte aByte4 = -1;

	@OriginalMember(owner = "client!cb", name = "bb", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
	private int anInt980 = 0;

	@OriginalMember(owner = "client!cb", name = "I", descriptor = "Lclient!j;")
	private final Class19_Sub2 aClass19_Sub2_3;

	static {
		for (@Pc(6) int local6 = 1; local6 < 2048; local6++) {
			reciprical16[local6] = 65536 / local6;
		}
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!j;)V")
	public SoftwareModel(@OriginalArg(0) Class19_Sub2 arg0) {
		this.aClass19_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!j;Lclient!pr;IIII)V")
	public SoftwareModel(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass19_Sub2_3 = arg0;
		this.anInt984 = arg2;
		this.anInt982 = arg3;
		this.anInt983 = arg4;
		this.anInt987 = arg1.anInt5075;
		this.anInt981 = arg1.anInt5087;
		this.anIntArray68 = arg1.anIntArray354;
		this.anIntArray56 = arg1.anIntArray355;
		this.anIntArray47 = arg1.anIntArray356;
		this.anInt986 = arg1.anInt5071;
		this.aShortArray10 = arg1.aShortArray97;
		this.aShortArray5 = arg1.aShortArray105;
		this.aShortArray6 = arg1.aShortArray102;
		this.aByte4 = arg1.aByte56;
		this.aByteArray8 = arg1.aByteArray61;
		this.aShortArray8 = arg1.aShortArray108;
		this.aByteArray11 = arg1.aByteArray63;
		this.aShortArray9 = arg1.aShortArray100;
		this.aByteArray10 = arg1.aByteArray64;
		this.aClass114Array1 = arg1.aClass114Array3;
		this.aClass163Array1 = arg1.aClass163Array3;
		this.aShortArray7 = arg1.aShortArray107;
		if (arg1.anIntArray358 != null && (this.anInt984 & 0x20) != 0) {
			this.anIntArrayArray10 = arg1.method4661();
		}
		if (arg1.anIntArray357 != null && (this.anInt984 & 0x180) != 0) {
			this.anIntArrayArray12 = arg1.method4653();
		}
		@Pc(156) int local156;
		if (arg1.aShortArray98 == null) {
			this.aShortArray11 = null;
		} else {
			this.aShortArray11 = new short[this.anInt986];
			@Pc(154) boolean local154 = false;
			for (local156 = 0; local156 < this.anInt986; local156++) {
				@Pc(162) short local162 = arg1.aShortArray98[local156];
				if (local162 == -1 || this.aClass19_Sub2_3.anInterface2_5.method2658(local162).aBoolean438) {
					this.aShortArray11[local156] = -1;
				} else {
					this.aShortArray11[local156] = local162;
					local154 = true;
				}
			}
			if (!local154) {
				this.aShortArray11 = null;
			}
		}
		if (this.aShortArray11 != null && arg1.anInt5072 > 0 && arg1.aByteArray70 != null) {
			@Pc(213) int[] local213 = new int[arg1.anInt5072];
			for (local156 = 0; local156 < this.anInt986; local156++) {
				if (arg1.aByteArray70[local156] != -1) {
					local213[arg1.aByteArray70[local156] & 0xFF]++;
				}
			}
			this.anInt980 = 0;
			for (@Pc(244) int local244 = 0; local244 < arg1.anInt5072; local244++) {
				if (local213[local244] > 0 && arg1.aByteArray67[local244] == 0) {
					this.anInt980++;
				}
			}
			this.anIntArray43 = new int[this.anInt980];
			this.anIntArray46 = new int[this.anInt980];
			this.anIntArray62 = new int[this.anInt980];
			@Pc(282) int local282 = 0;
			for (@Pc(284) int local284 = 0; local284 < arg1.anInt5072; local284++) {
				if (local213[local284] > 0 && arg1.aByteArray67[local284] == 0) {
					this.anIntArray43[local282] = arg1.aShortArray104[local284] & 0xFFFF;
					this.anIntArray46[local282] = arg1.aShortArray106[local284] & 0xFFFF;
					this.anIntArray62[local282] = arg1.aShortArray101[local284] & 0xFFFF;
					local213[local284] = local282++;
				} else {
					local213[local284] = -1;
				}
			}
			this.aByteArray9 = new byte[this.anInt986];
			for (@Pc(346) int local346 = 0; local346 < this.anInt986; local346++) {
				if (arg1.aByteArray70[local346] == -1) {
					this.aByteArray9[local346] = -1;
				} else {
					this.aByteArray9[local346] = (byte) local213[arg1.aByteArray70[local346] & 0xFF];
					if (this.aByteArray9[local346] == -1 && this.aShortArray11 != null) {
						this.aShortArray11[local346] = -1;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!j;[Lclient!cb;)V")
	public SoftwareModel(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) SoftwareModel[] arg1) {
		this.aClass19_Sub2_3 = arg0;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		@Pc(43) boolean local43 = false;
		@Pc(45) boolean local45 = false;
		this.anInt987 = 0;
		this.anInt986 = 0;
		this.anInt980 = 0;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		this.aByte4 = -1;
		for (@Pc(63) int local63 = 0; local63 < arg1.length; local63++) {
			@Pc(68) SoftwareModel local68 = arg1[local63];
			if (local68 != null) {
				this.anInt987 += local68.anInt987;
				this.anInt986 += local68.anInt986;
				this.anInt980 += local68.anInt980;
				if (local68.aByteArray8 == null) {
					if (this.aByte4 == -1) {
						this.aByte4 = local68.aByte4;
					}
					if (this.aByte4 != local68.aByte4) {
						local39 = true;
					}
				} else {
					local39 = true;
				}
				local41 |= local68.aByteArray11 != null;
				local43 |= local68.aShortArray11 != null;
				local45 |= local68.aByteArray9 != null;
				if (local68.aClass114Array1 != null) {
					local56 += local68.aClass114Array1.length;
				}
				if (local68.aClass163Array1 != null) {
					local58 += local68.aClass163Array1.length;
				}
			}
		}
		this.anIntArray68 = new int[this.anInt987];
		this.anIntArray56 = new int[this.anInt987];
		this.anIntArray47 = new int[this.anInt987];
		this.aShortArray10 = new short[this.anInt986];
		this.aShortArray5 = new short[this.anInt986];
		this.aShortArray6 = new short[this.anInt986];
		this.anIntArray76 = new int[this.anInt986];
		this.anIntArray74 = new int[this.anInt986];
		this.anIntArray52 = new int[this.anInt986];
		if (local39) {
			this.aByteArray8 = new byte[this.anInt986];
		}
		if (local41) {
			this.aByteArray11 = new byte[this.anInt986];
		}
		if (local43) {
			this.aShortArray11 = new short[this.anInt986];
		}
		if (local45) {
			this.aByteArray9 = new byte[this.anInt986];
		}
		if (this.anInt980 > 0) {
			this.anIntArray43 = new int[this.anInt980];
			this.anIntArray46 = new int[this.anInt980];
			this.anIntArray62 = new int[this.anInt980];
		}
		if (local56 > 0) {
			this.aClass114Array1 = new Class114[local56];
		}
		if (local58 > 0) {
			this.aClass163Array1 = new Class163[local58];
		}
		this.anInt987 = 0;
		@Pc(271) int local271 = this.anInt986;
		this.anInt986 = 0;
		this.anInt980 = 0;
		local58 = 0;
		local56 = 0;
		@Pc(305) int local305;
		@Pc(618) int local618;
		for (@Pc(283) int local283 = 0; local283 < arg1.length; local283++) {
			@Pc(288) SoftwareModel local288 = arg1[local283];
			if (local288 != null) {
				local288.method1257(false);
				if (local288.aShortArray8 != null && this.aShortArray8 == null) {
					this.aShortArray8 = new short[local271];
				}
				for (local305 = 0; local305 < local288.anInt986; local305++) {
					this.aShortArray10[this.anInt986] = (short) (local288.aShortArray10[local305] + this.anInt987);
					this.aShortArray5[this.anInt986] = (short) (local288.aShortArray5[local305] + this.anInt987);
					this.aShortArray6[this.anInt986] = (short) (local288.aShortArray6[local305] + this.anInt987);
					this.anIntArray76[this.anInt986] = local288.anIntArray76[local305];
					this.anIntArray74[this.anInt986] = local288.anIntArray74[local305];
					this.anIntArray52[this.anInt986] = local288.anIntArray52[local305];
					if (local288.aShortArray8 != null) {
						this.aShortArray8[this.anInt986] = local288.aShortArray8[local305];
					}
					if (local39) {
						if (local288.aByteArray8 != null) {
							this.aByteArray8[this.anInt986] = local288.aByteArray8[local305];
						} else if (local288.aByte4 == -1) {
							this.aByteArray8[this.anInt986] = 10;
						} else {
							this.aByteArray8[this.anInt986] = local288.aByte4;
						}
					}
					if (local41 && local288.aByteArray11 != null) {
						this.aByteArray11[this.anInt986] = local288.aByteArray11[local305];
					}
					if (local43) {
						if (local288.aShortArray11 == null) {
							this.aShortArray11[this.anInt986] = -1;
						} else {
							this.aShortArray11[this.anInt986] = local288.aShortArray11[local305];
						}
					}
					if (local45) {
						this.aByteArray9[this.anInt986] = (byte) (local288.aByteArray9 == null || local288.aByteArray9[local305] == -1 ? -1 : local288.aByteArray9[local305] + this.anInt980);
					}
					this.anInt986++;
				}
				@Pc(494) int local494;
				if (local288.aClass114Array1 != null) {
					for (local494 = 0; local494 < local288.aClass114Array1.length; local494++) {
						@Pc(500) Class114 local500 = local288.aClass114Array1[local494];
						this.aClass114Array1[local56] = new Class114(local500, this.anInt987);
						local56++;
					}
				}
				if (local288.aClass163Array1 != null) {
					for (local494 = 0; local494 < local288.aClass163Array1.length; local494++) {
						@Pc(528) Class163 local528 = local288.aClass163Array1[local494];
						this.aClass163Array1[local58] = new Class163(local528, this.anInt987);
						local58++;
					}
				}
				for (local494 = 0; local494 < local288.anInt980; local494++) {
					if (local288.anIntArray43[local494] < local288.anInt981) {
						this.anIntArray43[this.anInt980] = local288.anIntArray43[local494] + this.anInt987;
					}
					if (local288.anIntArray46[local494] < local288.anInt981) {
						this.anIntArray46[this.anInt980] = local288.anIntArray46[local494] + this.anInt987;
					}
					if (local288.anIntArray62[local494] < local288.anInt981) {
						this.anIntArray62[this.anInt980] = local288.anIntArray62[local494] + this.anInt987;
					}
					this.anInt980++;
				}
				for (local618 = 0; local618 < local288.anInt981; local618++) {
					this.anIntArray68[this.anInt987] = local288.anIntArray68[local618];
					this.anIntArray56[this.anInt987] = local288.anIntArray56[local618];
					this.anIntArray47[this.anInt987] = local288.anIntArray47[local618];
					this.anInt987++;
				}
			}
		}
		this.anInt979 = 2;
		@Pc(667) int local667 = 0;
		this.anInt981 = this.anInt987;
		for (local305 = 0; local305 < arg1.length; local305++) {
			@Pc(678) SoftwareModel local678 = arg1[local305];
			if (local678 != null) {
				for (local618 = 0; local618 < local678.anInt980; local618++) {
					if (local678.anIntArray43[local618] >= local678.anInt981) {
						this.anIntArray43[local667] = local678.anIntArray43[local618] + this.anInt987 - local678.anInt981;
					}
					if (local678.anIntArray46[local618] >= local678.anInt981) {
						this.anIntArray46[local667] = local678.anIntArray46[local618] + this.anInt987 - local678.anInt981;
					}
					if (local678.anIntArray62[local618] >= local678.anInt981) {
						this.anIntArray62[local667] = local678.anIntArray62[local618] + this.anInt987 - local678.anInt981;
					}
					local667++;
				}
				for (@Pc(755) int local755 = local678.anInt981; local755 < local678.anInt987; local755++) {
					this.anIntArray68[this.anInt987] = local678.anIntArray68[local755];
					this.anIntArray56[this.anInt987] = local678.anIntArray56[local755];
					this.anIntArray47[this.anInt987] = local678.anIntArray47[local755];
					this.anInt987++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "(I)V")
	private void method1237(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = this.aClass19_Sub2_3.anInt2843;
		@Pc(10) short local10 = this.aShortArray10[arg0];
		@Pc(15) short local15 = this.aShortArray5[arg0];
		@Pc(20) short local20 = this.aShortArray6[arg0];
		@Pc(25) int local25 = this.anIntArray61[local10];
		@Pc(30) int local30 = this.anIntArray61[local15];
		@Pc(35) int local35 = this.anIntArray61[local20];
		if (this.aByteArray11 == null) {
			this.aClass81_1.anInt2264 = 0;
		} else {
			this.aClass81_1.anInt2264 = this.aByteArray11[arg0] & 0xFF;
		}
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(100) int local100;
		@Pc(113) int local113;
		if (local25 >= local5) {
			this.anIntArray72[0] = this.anIntArray60[local10];
			this.anIntArray66[0] = this.anIntArray63[local10];
			local1++;
			this.anIntArray73[0] = this.anIntArray76[arg0] & 0xFFFF;
		} else {
			local88 = this.anIntArray51[local10];
			local93 = this.anIntArray64[local10];
			local100 = this.anIntArray76[arg0] & 0xFFFF;
			if (local35 >= local5) {
				local113 = (local5 - local25) * reciprical16[local35 - local25];
				this.anIntArray72[0] = this.aClass250_2.anInt7223 + (local88 + ((this.anIntArray51[local20] - local88) * local113 >> 16)) * this.aClass19_Sub2_3.anInt2851 / local5;
				this.anIntArray66[0] = this.aClass250_2.anInt7224 + (local93 + ((this.anIntArray64[local20] - local93) * local113 >> 16)) * this.aClass19_Sub2_3.anInt2841 / local5;
				local1++;
				this.anIntArray73[0] = local100 + (((this.anIntArray52[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local30 >= local5) {
				local113 = (local5 - local25) * reciprical16[local30 - local25];
				this.anIntArray72[local1] = this.aClass250_2.anInt7223 + (local88 + ((this.anIntArray51[local15] - local88) * local113 >> 16)) * this.aClass19_Sub2_3.anInt2851 / local5;
				this.anIntArray66[local1] = this.aClass250_2.anInt7224 + (local93 + ((this.anIntArray64[local15] - local93) * local113 >> 16)) * this.aClass19_Sub2_3.anInt2841 / local5;
				this.anIntArray73[local1++] = local100 + (((this.anIntArray74[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local30 >= local5) {
			this.anIntArray72[local1] = this.anIntArray60[local15];
			this.anIntArray66[local1] = this.anIntArray63[local15];
			this.anIntArray73[local1++] = this.anIntArray74[arg0] & 0xFFFF;
		} else {
			local88 = this.anIntArray51[local15];
			local93 = this.anIntArray64[local15];
			local100 = this.anIntArray74[arg0] & 0xFFFF;
			if (local25 >= local5) {
				local113 = (local5 - local30) * reciprical16[local25 - local30];
				this.anIntArray72[local1] = this.aClass250_2.anInt7223 + (local88 + ((this.anIntArray51[local10] - local88) * local113 >> 16)) * this.aClass19_Sub2_3.anInt2851 / local5;
				this.anIntArray66[local1] = this.aClass250_2.anInt7224 + (local93 + ((this.anIntArray64[local10] - local93) * local113 >> 16)) * this.aClass19_Sub2_3.anInt2841 / local5;
				this.anIntArray73[local1++] = local100 + (((this.anIntArray76[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local35 >= local5) {
				local113 = (local5 - local30) * reciprical16[local35 - local30];
				this.anIntArray72[local1] = this.aClass250_2.anInt7223 + (local88 + ((this.anIntArray51[local20] - local88) * local113 >> 16)) * this.aClass19_Sub2_3.anInt2851 / local5;
				this.anIntArray66[local1] = this.aClass250_2.anInt7224 + (local93 + ((this.anIntArray64[local20] - local93) * local113 >> 16)) * this.aClass19_Sub2_3.anInt2841 / local5;
				this.anIntArray73[local1++] = local100 + (((this.anIntArray52[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local35 >= local5) {
			this.anIntArray72[local1] = this.anIntArray60[local20];
			this.anIntArray66[local1] = this.anIntArray63[local20];
			this.anIntArray73[local1++] = this.anIntArray52[arg0] & 0xFFFF;
		} else {
			local88 = this.anIntArray51[local20];
			local93 = this.anIntArray64[local20];
			local100 = this.anIntArray52[arg0] & 0xFFFF;
			if (local30 >= local5) {
				local113 = (local5 - local35) * reciprical16[local30 - local35];
				this.anIntArray72[local1] = this.aClass250_2.anInt7223 + (local88 + ((this.anIntArray51[local15] - local88) * local113 >> 16)) * this.aClass19_Sub2_3.anInt2851 / local5;
				this.anIntArray66[local1] = this.aClass250_2.anInt7224 + (local93 + ((this.anIntArray64[local15] - local93) * local113 >> 16)) * this.aClass19_Sub2_3.anInt2841 / local5;
				this.anIntArray73[local1++] = local100 + (((this.anIntArray74[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local25 >= local5) {
				local113 = (local5 - local35) * reciprical16[local25 - local35];
				this.anIntArray72[local1] = this.aClass250_2.anInt7223 + (local88 + ((this.anIntArray51[local10] - local88) * local113 >> 16)) * this.aClass19_Sub2_3.anInt2851 / local5;
				this.anIntArray66[local1] = this.aClass250_2.anInt7224 + (local93 + ((this.anIntArray64[local10] - local93) * local113 >> 16)) * this.aClass19_Sub2_3.anInt2841 / local5;
				this.anIntArray73[local1++] = local100 + (((this.anIntArray76[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		local88 = this.anIntArray72[0];
		local93 = this.anIntArray72[1];
		local100 = this.anIntArray72[2];
		local113 = this.anIntArray66[0];
		@Pc(725) int local725 = this.anIntArray66[1];
		@Pc(730) int local730 = this.anIntArray66[2];
		this.aClass81_1.textX = false;
		@Pc(838) int local838;
		@Pc(843) int local843;
		@Pc(848) int local848;
		@Pc(833) int local833;
		if (local1 == 3) {
			if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > this.aClass250_2.anInt7222 || local93 > this.aClass250_2.anInt7222 || local100 > this.aClass250_2.anInt7222) {
				this.aClass81_1.textX = true;
			}
			if (this.aShortArray11 != null && this.aShortArray11[arg0] != -1) {
				if (this.aByteArray9 == null || this.aByteArray9[arg0] == -1) {
					local838 = local10;
					local843 = local15;
					local848 = local20;
				} else {
					local833 = this.aByteArray9[arg0] & 0xFF;
					local838 = this.anIntArray43[local833];
					local843 = this.anIntArray46[local833];
					local848 = this.anIntArray62[local833];
				}
				if (this.anIntArray52[arg0] == -1) {
					this.aClass81_1.method2288(local113, local725, local730, local88, local93, local100, this.anIntArray76[arg0], this.anIntArray76[arg0], this.anIntArray76[arg0], this.anIntArray51[local838], this.anIntArray51[local843], this.anIntArray51[local848], this.anIntArray64[local838], this.anIntArray64[local843], this.anIntArray64[local848], this.anIntArray61[local838], this.anIntArray61[local843], this.anIntArray61[local848], this.aShortArray11[arg0]);
				} else {
					this.aClass81_1.method2288(local113, local725, local730, local88, local93, local100, this.anIntArray73[0], this.anIntArray73[1], this.anIntArray73[2], this.anIntArray51[local838], this.anIntArray51[local843], this.anIntArray51[local848], this.anIntArray64[local838], this.anIntArray64[local843], this.anIntArray64[local848], this.anIntArray61[local838], this.anIntArray61[local843], this.anIntArray61[local848], this.aShortArray11[arg0]);
				}
			} else if (this.anIntArray52[arg0] == -1) {
				this.aClass81_1.method2282(local113, local725, local730, local88, local93, local100, Static181.anIntArray204[this.anIntArray76[arg0] & 0xFFFF]);
			} else {
				this.aClass81_1.method2286(local113, local725, local730, local88, local93, local100, this.anIntArray73[0], this.anIntArray73[1], this.anIntArray73[2]);
			}
		}
		if (local1 != 4) {
			return;
		}
		if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > this.aClass250_2.anInt7222 || local93 > this.aClass250_2.anInt7222 || local100 > this.aClass250_2.anInt7222 || this.anIntArray72[3] < 0 || this.anIntArray72[3] > this.aClass250_2.anInt7222) {
			this.aClass81_1.textX = true;
		}
		if (this.aShortArray11 == null || this.aShortArray11[arg0] == -1) {
			if (this.anIntArray52[arg0] == -1) {
				local838 = Static181.anIntArray204[this.anIntArray76[arg0] & 0xFFFF];
				this.aClass81_1.method2282(local113, local725, local730, local88, local93, local100, local838);
				this.aClass81_1.method2282(local113, local730, this.anIntArray66[3], local88, local100, this.anIntArray72[3], local838);
				return;
			}
			this.aClass81_1.method2286(local113, local725, local730, local88, local93, local100, this.anIntArray73[0], this.anIntArray73[1], this.anIntArray73[2]);
			this.aClass81_1.method2286(local113, local730, this.anIntArray66[3], local88, local100, this.anIntArray72[3], this.anIntArray73[0], this.anIntArray73[2], this.anIntArray73[3]);
			return;
		}
		if (this.aByteArray9 == null || this.aByteArray9[arg0] == -1) {
			local838 = local10;
			local843 = local15;
			local848 = local20;
		} else {
			local833 = this.aByteArray9[arg0] & 0xFF;
			local838 = this.anIntArray43[local833];
			local843 = this.anIntArray46[local833];
			local848 = this.anIntArray62[local833];
		}
		@Pc(1168) short local1168 = this.aShortArray11[arg0];
		if (this.anIntArray52[arg0] == -1) {
			this.aClass81_1.method2288(local113, local725, local730, local88, local93, local100, this.anIntArray76[arg0], this.anIntArray76[arg0], this.anIntArray76[arg0], this.anIntArray51[local838], this.anIntArray51[local843], this.anIntArray51[local848], this.anIntArray64[local838], this.anIntArray64[local843], this.anIntArray64[local848], this.anIntArray61[local838], this.anIntArray61[local843], this.anIntArray61[local848], local1168);
			this.aClass81_1.method2288(local113, local730, this.anIntArray66[3], local88, local100, this.anIntArray72[3], this.anIntArray76[arg0], this.anIntArray76[arg0], this.anIntArray76[arg0], this.anIntArray51[local838], this.anIntArray51[local843], this.anIntArray51[local848], this.anIntArray64[local838], this.anIntArray64[local843], this.anIntArray64[local848], this.anIntArray61[local838], this.anIntArray61[local843], this.anIntArray61[local848], local1168);
			return;
		}
		this.aClass81_1.method2288(local113, local725, local730, local88, local93, local100, this.anIntArray73[0], this.anIntArray73[1], this.anIntArray73[2], this.anIntArray51[local838], this.anIntArray51[local843], this.anIntArray51[local848], this.anIntArray64[local838], this.anIntArray64[local843], this.anIntArray64[local848], this.anIntArray61[local838], this.anIntArray61[local843], this.anIntArray61[local848], local1168);
		this.aClass81_1.method2288(local113, local730, this.anIntArray66[3], local88, local100, this.anIntArray72[3], this.anIntArray73[0], this.anIntArray73[2], this.anIntArray73[3], this.anIntArray51[local838], this.anIntArray51[local843], this.anIntArray51[local848], this.anIntArray64[local838], this.anIntArray64[local843], this.anIntArray64[local848], this.anIntArray61[local838], this.anIntArray61[local843], this.anIntArray61[local848], local1168);
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "()[Lclient!jf;")
	@Override
	public Class114[] method3808() {
		return this.aClass114Array1;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZZIZI)V")
	private void method1238(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (arg2 >= 2200) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < 2200; local5++) {
			this.anIntArray77[local5] = 0;
		}
		@Pc(17) int local17 = 0;
		@Pc(46) int local46;
		@Pc(51) int local51;
		@Pc(56) int local56;
		@Pc(72) int local72;
		@Pc(82) int local82;
		@Pc(87) int local87;
		@Pc(92) int local92;
		@Pc(97) int local97;
		@Pc(102) int local102;
		@Pc(107) int local107;
		@Pc(112) int local112;
		@Pc(152) int local152;
		for (@Pc(19) int local19 = 0; local19 < this.anInt986; local19++) {
			if (this.anIntArray52[local19] != -2) {
				@Pc(31) short local31 = this.aShortArray10[local19];
				@Pc(36) short local36 = this.aShortArray5[local19];
				@Pc(41) short local41 = this.aShortArray6[local19];
				local46 = this.anIntArray60[local31];
				local51 = this.anIntArray60[local36];
				local56 = this.anIntArray60[local41];
				@Pc(77) int local77;
				if (arg0 && (local46 == -5000 || local51 == -5000 || local56 == -5000)) {
					local72 = this.anIntArray51[local31];
					local77 = this.anIntArray51[local36];
					local82 = this.anIntArray51[local41];
					local87 = this.anIntArray64[local31];
					local92 = this.anIntArray64[local36];
					local97 = this.anIntArray64[local41];
					local102 = this.anIntArray61[local31];
					local107 = this.anIntArray61[local36];
					local112 = this.anIntArray61[local41];
					local72 -= local77;
					@Pc(120) int local120 = local82 - local77;
					@Pc(124) int local124 = local87 - local92;
					@Pc(128) int local128 = local97 - local92;
					@Pc(132) int local132 = local102 - local107;
					@Pc(136) int local136 = local112 - local107;
					@Pc(144) int local144 = local124 * local136 - local132 * local128;
					local152 = local132 * local120 - local72 * local136;
					@Pc(160) int local160 = local72 * local128 - local124 * local120;
					if (local77 * local144 + local92 * local152 + local107 * local160 > 0) {
						this.aBooleanArray9[local19] = true;
						@Pc(194) int local194 = (this.anIntArray71[local31] + this.anIntArray71[local36] + this.anIntArray71[local41]) / 3;
						if (this.anIntArray77[local194] < 64) {
							this.anIntArrayArray11[local194][this.anIntArray77[local194]++] = local19;
						} else {
							@Pc(221) int local221 = this.anIntArray77[local194];
							if (local221 == 64) {
								if (local17 == 512) {
									continue;
								}
								this.anIntArray65[local17] = 0;
								this.anIntArray77[local194] = local221 = local17++ + 65;
							}
							local221 -= 65;
							this.anIntArrayArray8[local221][this.anIntArray65[local221]++] = local19;
						}
					}
				} else if ((local46 - local51) * (this.anIntArray63[local41] - this.anIntArray63[local36]) - (this.anIntArray63[local31] - this.anIntArray63[local36]) * (local56 - local51) > 0) {
					this.aBooleanArray9[local19] = false;
					if (local46 >= 0 && local51 >= 0 && local56 >= 0 && local46 <= this.aClass250_2.anInt7222 && local51 <= this.aClass250_2.anInt7222 && local56 <= this.aClass250_2.anInt7222) {
						this.aBooleanArray8[local19] = false;
					} else {
						this.aBooleanArray8[local19] = true;
					}
					local72 = (this.anIntArray71[local31] + this.anIntArray71[local36] + this.anIntArray71[local41]) / 3;
					if (this.anIntArray77[local72] < 64) {
						this.anIntArrayArray11[local72][this.anIntArray77[local72]++] = local19;
					} else {
						local77 = this.anIntArray77[local72];
						if (local77 == 64) {
							if (local17 == 512) {
								continue;
							}
							this.anIntArray65[local17] = 0;
							this.anIntArray77[local72] = local77 = local17++ + 65;
						}
						local77 -= 65;
						this.anIntArrayArray8[local77][this.anIntArray65[local77]++] = local19;
					}
				}
			}
		}
		@Pc(416) int local416;
		@Pc(422) int local422;
		@Pc(458) int local458;
		if (arg3) {
			for (local416 = 0; local416 < arg4; local416++) {
				local422 = this.anIntArray55[local416];
				if (local422 >= 0 && local422 < 2200) {
					if (this.anIntArray77[local422] < 64) {
						this.anIntArrayArray11[local422][this.anIntArray77[local422]++] = local416 + 1 << 16;
					} else {
						local458 = this.anIntArray77[local422];
						if (local458 == 64) {
							if (local17 == 512) {
								continue;
							}
							this.anIntArray65[local17] = 0;
							this.anIntArray77[local422] = local458 = local17++ + 65;
						}
						local458 -= 65;
						this.anIntArrayArray8[local458][this.anIntArray65[local458]++] = local416 + 1 << 16;
					}
				}
			}
		}
		if (this.aByteArray8 == null) {
			@Pc(535) int[] local535;
			if (arg3) {
				@Pc(562) Class12_Sub1_Sub1 local562;
				if (arg1) {
					for (local416 = arg2 - 1; local416 >= 0; local416--) {
						local422 = this.anIntArray77[local416];
						if (local422 > 0) {
							local458 = local422 > 64 ? 64 : local422;
							local535 = this.anIntArrayArray11[local416];
							for (local51 = 0; local51 < local458; local51++) {
								local56 = local535[local51];
								if (local56 < 65536) {
									this.method1253(local535[local51]);
								} else {
									local72 = (local56 >> 16) - 1;
									local562 = this.aClass12_Sub1_Sub1Array1[local72];
									local82 = this.anIntArray59[local72];
									if (local82 == 0) {
										local82 = 1;
									}
									this.aClass19_Sub2_3.method2908(local562, this.anIntArray78[local72], this.anIntArray48[local72], (local562.anInt4472 >> 2) / local82);
								}
							}
						}
						if (local422 > 64) {
							local458 = this.anIntArray77[local416] - 64 - 1;
							local535 = this.anIntArrayArray8[local458];
							for (local51 = 0; local51 < this.anIntArray65[local458]; local51++) {
								local56 = local535[local51];
								if (local56 < 65536) {
									this.method1253(local535[local51]);
								} else {
									local72 = (local56 >> 16) - 1;
									local562 = this.aClass12_Sub1_Sub1Array1[local72];
									local82 = this.anIntArray59[local72];
									if (local82 == 0) {
										local82 = 1;
									}
									this.aClass19_Sub2_3.method2908(local562, this.anIntArray78[local72], this.anIntArray48[local72], (local562.anInt4472 >> 2) / local82);
								}
							}
						}
					}
				} else {
					for (local416 = arg2 - 1; local416 >= 0; local416--) {
						local422 = this.anIntArray77[local416];
						if (local422 > 0) {
							local458 = local422 > 64 ? 64 : local422;
							local535 = this.anIntArrayArray11[local416];
							for (local51 = 0; local51 < local458; local51++) {
								local56 = local535[local51];
								if (local56 < 65536) {
									this.method1250(local535[local51]);
								} else {
									local72 = (local56 >> 16) - 1;
									local562 = this.aClass12_Sub1_Sub1Array1[local72];
									local82 = this.anIntArray59[local72];
									if (local82 == 0) {
										local82 = 1;
									}
									this.aClass19_Sub2_3.method2908(local562, this.anIntArray78[local72], this.anIntArray48[local72], (local562.anInt4472 >> 2) / local82);
								}
							}
						}
						if (local422 > 64) {
							local458 = this.anIntArray77[local416] - 64 - 1;
							local535 = this.anIntArrayArray8[local458];
							for (local51 = 0; local51 < this.anIntArray65[local458]; local51++) {
								local56 = local535[local51];
								if (local56 < 65536) {
									this.method1250(local535[local51]);
								} else {
									local72 = (local56 >> 16) - 1;
									local562 = this.aClass12_Sub1_Sub1Array1[local72];
									local82 = this.anIntArray59[local72];
									if (local82 == 0) {
										local82 = 1;
									}
									this.aClass19_Sub2_3.method2908(local562, this.anIntArray78[local72], this.anIntArray48[local72], (local562.anInt4472 >> 2) / local82);
								}
							}
						}
					}
				}
			} else if (arg1) {
				for (local416 = arg2 - 1; local416 >= 0; local416--) {
					local422 = this.anIntArray77[local416];
					if (local422 > 0) {
						local458 = local422 > 64 ? 64 : local422;
						local535 = this.anIntArrayArray11[local416];
						for (local51 = 0; local51 < local458; local51++) {
							this.method1253(local535[local51]);
						}
					}
					if (local422 > 64) {
						local458 = this.anIntArray77[local416] - 64 - 1;
						local535 = this.anIntArrayArray8[local458];
						for (local51 = 0; local51 < this.anIntArray65[local458]; local51++) {
							this.method1253(local535[local51]);
						}
					}
				}
			} else {
				for (local416 = arg2 - 1; local416 >= 0; local416--) {
					local422 = this.anIntArray77[local416];
					if (local422 > 0) {
						local458 = local422 > 64 ? 64 : local422;
						local535 = this.anIntArrayArray11[local416];
						for (local51 = 0; local51 < local458; local51++) {
							this.method1250(local535[local51]);
						}
					}
					if (local422 > 64) {
						local458 = this.anIntArray77[local416] - 64 - 1;
						local535 = this.anIntArrayArray8[local458];
						for (local51 = 0; local51 < this.anIntArray65[local458]; local51++) {
							this.method1250(local535[local51]);
						}
					}
				}
			}
			return;
		}
		for (local416 = 0; local416 < 12; local416++) {
			this.anIntArray69[local416] = 0;
			this.anIntArray70[local416] = 0;
		}
		@Pc(1029) int[] local1029;
		@Pc(1044) byte local1044;
		if (arg3) {
			for (local422 = arg2 - 1; local422 >= 0; local422--) {
				local458 = this.anIntArray77[local422];
				if (local458 > 0) {
					if (local458 > 64) {
						local46 = 64;
					} else {
						local46 = local458;
					}
					local1029 = this.anIntArrayArray11[local422];
					for (local56 = 0; local56 < local46; local56++) {
						local72 = local1029[local56];
						if (local72 < 65536) {
							local1044 = this.aByteArray8[local72];
							local82 = this.anIntArray69[local1044]++;
							this.anIntArrayArray9[local1044][local82] = local72;
							if (local1044 < 10) {
								this.anIntArray70[local1044] += local422;
							} else if (local1044 == 10) {
								this.anIntArray75[local82] = local422;
							} else {
								this.anIntArray49[local82] = local422;
							}
						} else {
							local1044 = this.aClass12_Sub1_Sub1Array1[(local72 >> 16) - 1].aByte48;
							local82 = this.anIntArray69[local1044]++;
							this.anIntArrayArray9[local1044][local82] = local72;
							if (local1044 < 10) {
								this.anIntArray70[local1044] += local422;
							} else if (local1044 == 10) {
								this.anIntArray75[local82] = local422;
							} else {
								this.anIntArray49[local82] = local422;
							}
						}
					}
				}
				if (local458 > 64) {
					local46 = this.anIntArray77[local422] - 64 - 1;
					local1029 = this.anIntArrayArray8[local46];
					for (local56 = 0; local56 < this.anIntArray65[local46]; local56++) {
						local72 = local1029[local56];
						if (local72 < 65536) {
							local1044 = this.aByteArray8[local72];
							local82 = this.anIntArray69[local1044]++;
							this.anIntArrayArray9[local1044][local82] = local72;
							if (local1044 < 10) {
								this.anIntArray70[local1044] += local422;
							} else if (local1044 == 10) {
								this.anIntArray75[local82] = local422;
							} else {
								this.anIntArray49[local82] = local422;
							}
						} else {
							local1044 = this.aClass12_Sub1_Sub1Array1[(local72 >> 16) - 1].aByte48;
							local82 = this.anIntArray69[local1044]++;
							this.anIntArrayArray9[local1044][local82] = local72;
							if (local1044 < 10) {
								this.anIntArray70[local1044] += local422;
							} else if (local1044 == 10) {
								this.anIntArray75[local82] = local422;
							} else {
								this.anIntArray49[local82] = local422;
							}
						}
					}
				}
			}
		} else {
			for (local422 = arg2 - 1; local422 >= 0; local422--) {
				local458 = this.anIntArray77[local422];
				if (local458 > 0) {
					if (local458 > 64) {
						local46 = 64;
					} else {
						local46 = local458;
					}
					local1029 = this.anIntArrayArray11[local422];
					for (local56 = 0; local56 < local46; local56++) {
						local72 = local1029[local56];
						local1044 = this.aByteArray8[local72];
						local82 = this.anIntArray69[local1044]++;
						this.anIntArrayArray9[local1044][local82] = local72;
						if (local1044 < 10) {
							this.anIntArray70[local1044] += local422;
						} else if (local1044 == 10) {
							this.anIntArray75[local82] = local422;
						} else {
							this.anIntArray49[local82] = local422;
						}
					}
				}
				if (local458 > 64) {
					local46 = this.anIntArray77[local422] - 64 - 1;
					local1029 = this.anIntArrayArray8[local46];
					for (local56 = 0; local56 < this.anIntArray65[local46]; local56++) {
						local72 = local1029[local56];
						local1044 = this.aByteArray8[local72];
						local82 = this.anIntArray69[local1044]++;
						this.anIntArrayArray9[local1044][local82] = local72;
						if (local1044 < 10) {
							this.anIntArray70[local1044] += local422;
						} else if (local1044 == 10) {
							this.anIntArray75[local82] = local422;
						} else {
							this.anIntArray49[local82] = local422;
						}
					}
				}
			}
		}
		local422 = 0;
		if (this.anIntArray69[1] > 0 || this.anIntArray69[2] > 0) {
			local422 = (this.anIntArray70[1] + this.anIntArray70[2]) / (this.anIntArray69[1] + this.anIntArray69[2]);
		}
		local458 = 0;
		if (this.anIntArray69[3] > 0 || this.anIntArray69[4] > 0) {
			local458 = (this.anIntArray70[3] + this.anIntArray70[4]) / (this.anIntArray69[3] + this.anIntArray69[4]);
		}
		local46 = 0;
		if (this.anIntArray69[6] > 0 || this.anIntArray69[8] > 0) {
			local46 = (this.anIntArray70[6] + this.anIntArray70[8]) / (this.anIntArray69[6] + this.anIntArray69[8]);
		}
		local56 = 0;
		local72 = this.anIntArray69[10];
		@Pc(1559) int[] local1559 = this.anIntArrayArray9[10];
		@Pc(1562) int[] local1562 = this.anIntArray75;
		if (local72 == 0) {
			local56 = 0;
			local72 = this.anIntArray69[11];
			local1559 = this.anIntArrayArray9[11];
			local1562 = this.anIntArray49;
		}
		if (local72 > 0) {
			local51 = local1562[0];
		} else {
			local51 = -1000;
		}
		@Pc(1619) Class12_Sub1_Sub1 local1619;
		for (local87 = 0; local87 < 10; local87++) {
			if (arg1) {
				while (local87 == 0 && local51 > local422) {
					local92 = local1559[local56++];
					if (local92 < 65536) {
						this.method1253(local92);
					} else {
						local97 = (local92 >> 16) - 1;
						local1619 = this.aClass12_Sub1_Sub1Array1[local97];
						local107 = this.anIntArray59[local97];
						if (local107 == 0) {
							local107 = 1;
						}
						this.aClass19_Sub2_3.method2908(local1619, this.anIntArray78[local97], this.anIntArray48[local97], (local1619.anInt4472 >> 2) / local107);
					}
					if (local56 == local72 && local1559 != this.anIntArrayArray9[11]) {
						local56 = 0;
						local72 = this.anIntArray69[11];
						local1559 = this.anIntArrayArray9[11];
						local1562 = this.anIntArray49;
					}
					if (local56 < local72) {
						local51 = local1562[local56];
					} else {
						local51 = -1000;
					}
				}
				while (local87 == 3 && local51 > local458) {
					local92 = local1559[local56++];
					if (local92 < 65536) {
						this.method1253(local92);
					} else {
						local97 = (local92 >> 16) - 1;
						local1619 = this.aClass12_Sub1_Sub1Array1[local97];
						local107 = this.anIntArray59[local97];
						if (local107 == 0) {
							local107 = 1;
						}
						this.aClass19_Sub2_3.method2908(local1619, this.anIntArray78[local97], this.anIntArray48[local97], (local1619.anInt4472 >> 2) / local107);
					}
					if (local56 == local72 && local1559 != this.anIntArrayArray9[11]) {
						local56 = 0;
						local72 = this.anIntArray69[11];
						local1559 = this.anIntArrayArray9[11];
						local1562 = this.anIntArray49;
					}
					if (local56 < local72) {
						local51 = local1562[local56];
					} else {
						local51 = -1000;
					}
				}
				while (local87 == 5 && local51 > local46) {
					local92 = local1559[local56++];
					if (local92 < 65536) {
						this.method1253(local92);
					} else {
						local97 = (local92 >> 16) - 1;
						local1619 = this.aClass12_Sub1_Sub1Array1[local97];
						local107 = this.anIntArray59[local97];
						if (local107 == 0) {
							local107 = 1;
						}
						this.aClass19_Sub2_3.method2908(local1619, this.anIntArray78[local97], this.anIntArray48[local97], (local1619.anInt4472 >> 2) / local107);
					}
					if (local56 == local72 && local1559 != this.anIntArrayArray9[11]) {
						local56 = 0;
						local72 = this.anIntArray69[11];
						local1559 = this.anIntArrayArray9[11];
						local1562 = this.anIntArray49;
					}
					if (local56 < local72) {
						local51 = local1562[local56];
					} else {
						local51 = -1000;
					}
				}
			} else {
				while (local87 == 0 && local51 > local422) {
					local92 = local1559[local56++];
					if (local92 < 65536) {
						this.method1250(local92);
					} else {
						local97 = (local92 >> 16) - 1;
						local1619 = this.aClass12_Sub1_Sub1Array1[local97];
						local107 = this.anIntArray59[local97];
						if (local107 == 0) {
							local107 = 1;
						}
						this.aClass19_Sub2_3.method2908(local1619, this.anIntArray78[local97], this.anIntArray48[local97], (local1619.anInt4472 >> 2) / local107);
					}
					if (local56 == local72 && local1559 != this.anIntArrayArray9[11]) {
						local56 = 0;
						local72 = this.anIntArray69[11];
						local1559 = this.anIntArrayArray9[11];
						local1562 = this.anIntArray49;
					}
					if (local56 < local72) {
						local51 = local1562[local56];
					} else {
						local51 = -1000;
					}
				}
				while (local87 == 3 && local51 > local458) {
					local92 = local1559[local56++];
					if (local92 < 65536) {
						this.method1250(local92);
					} else {
						local97 = (local92 >> 16) - 1;
						local1619 = this.aClass12_Sub1_Sub1Array1[local97];
						local107 = this.anIntArray59[local97];
						if (local107 == 0) {
							local107 = 1;
						}
						this.aClass19_Sub2_3.method2908(local1619, this.anIntArray78[local97], this.anIntArray48[local97], (local1619.anInt4472 >> 2) / local107);
					}
					if (local56 == local72 && local1559 != this.anIntArrayArray9[11]) {
						local56 = 0;
						local72 = this.anIntArray69[11];
						local1559 = this.anIntArrayArray9[11];
						local1562 = this.anIntArray49;
					}
					if (local56 < local72) {
						local51 = local1562[local56];
					} else {
						local51 = -1000;
					}
				}
				while (local87 == 5 && local51 > local46) {
					local92 = local1559[local56++];
					if (local92 < 65536) {
						this.method1250(local92);
					} else {
						local97 = (local92 >> 16) - 1;
						local1619 = this.aClass12_Sub1_Sub1Array1[local97];
						local107 = this.anIntArray59[local97];
						if (local107 == 0) {
							local107 = 1;
						}
						this.aClass19_Sub2_3.method2908(local1619, this.anIntArray78[local97], this.anIntArray48[local97], (local1619.anInt4472 >> 2) / local107);
					}
					if (local56 == local72 && local1559 != this.anIntArrayArray9[11]) {
						local56 = 0;
						local72 = this.anIntArray69[11];
						local1559 = this.anIntArrayArray9[11];
						local1562 = this.anIntArray49;
					}
					if (local56 < local72) {
						local51 = local1562[local56];
					} else {
						local51 = -1000;
					}
				}
			}
			local92 = this.anIntArray69[local87];
			@Pc(2149) int[] local2149 = this.anIntArrayArray9[local87];
			if (arg3) {
				@Pc(2178) Class12_Sub1_Sub1 local2178;
				if (arg1) {
					for (local102 = 0; local102 < local92; local102++) {
						local107 = local2149[local102];
						if (local107 < 65536) {
							this.method1253(local107);
						} else {
							local112 = (local107 >> 16) - 1;
							local2178 = this.aClass12_Sub1_Sub1Array1[local112];
							local152 = this.anIntArray59[local112];
							if (local152 == 0) {
								local152 = 1;
							}
							this.aClass19_Sub2_3.method2908(local2178, this.anIntArray78[local112], this.anIntArray48[local112], (local2178.anInt4472 >> 2) / local152);
						}
					}
				} else {
					for (local102 = 0; local102 < local92; local102++) {
						local107 = local2149[local102];
						if (local107 < 65536) {
							this.method1250(local107);
						} else {
							local112 = (local107 >> 16) - 1;
							local2178 = this.aClass12_Sub1_Sub1Array1[local112];
							local152 = this.anIntArray59[local112];
							if (local152 == 0) {
								local152 = 1;
							}
							this.aClass19_Sub2_3.method2908(local2178, this.anIntArray78[local112], this.anIntArray48[local112], (local2178.anInt4472 >> 2) / local152);
						}
					}
				}
			} else if (arg1) {
				for (local102 = 0; local102 < local92; local102++) {
					this.method1253(local2149[local102]);
				}
			} else {
				for (local102 = 0; local102 < local92; local102++) {
					this.method1250(local2149[local102]);
				}
			}
		}
		if (arg3) {
			if (arg1) {
				while (local51 != -1000) {
					local92 = local1559[local56++];
					if (local92 < 65536) {
						this.method1253(local92);
					} else {
						local97 = (local92 >> 16) - 1;
						local1619 = this.aClass12_Sub1_Sub1Array1[local97];
						local107 = this.anIntArray59[local97];
						if (local107 == 0) {
							local107 = 1;
						}
						this.aClass19_Sub2_3.method2908(local1619, this.anIntArray78[local97], this.anIntArray48[local97], (local1619.anInt4472 >> 2) / local107);
					}
					if (local56 == local72 && local1559 != this.anIntArrayArray9[11]) {
						local56 = 0;
						local1559 = this.anIntArrayArray9[11];
						local72 = this.anIntArray69[11];
						local1562 = this.anIntArray49;
					}
					if (local56 < local72) {
						local51 = local1562[local56];
					} else {
						local51 = -1000;
					}
				}
			} else {
				while (local51 != -1000) {
					local92 = local1559[local56++];
					if (local92 < 65536) {
						this.method1250(local92);
					} else {
						local97 = (local92 >> 16) - 1;
						local1619 = this.aClass12_Sub1_Sub1Array1[local97];
						local107 = this.anIntArray59[local97];
						if (local107 == 0) {
							local107 = 1;
						}
						this.aClass19_Sub2_3.method2908(local1619, this.anIntArray78[local97], this.anIntArray48[local97], (local1619.anInt4472 >> 2) / local107);
					}
					if (local56 == local72 && local1559 != this.anIntArrayArray9[11]) {
						local56 = 0;
						local1559 = this.anIntArrayArray9[11];
						local72 = this.anIntArray69[11];
						local1562 = this.anIntArray49;
					}
					if (local56 < local72) {
						local51 = local1562[local56];
					} else {
						local51 = -1000;
					}
				}
			}
		} else if (arg1) {
			while (local51 != -1000) {
				this.method1253(local1559[local56++]);
				if (local56 == local72 && local1559 != this.anIntArrayArray9[11]) {
					local56 = 0;
					local1559 = this.anIntArrayArray9[11];
					local72 = this.anIntArray69[11];
					local1562 = this.anIntArray49;
				}
				if (local56 < local72) {
					local51 = local1562[local56];
				} else {
					local51 = -1000;
				}
			}
		} else {
			while (local51 != -1000) {
				this.method1250(local1559[local56++]);
				if (local56 == local72 && local1559 != this.anIntArrayArray9[11]) {
					local56 = 0;
					local1559 = this.anIntArrayArray9[11];
					local72 = this.anIntArray69[11];
					local1562 = this.anIntArray49;
				}
				if (local56 < local72) {
					local51 = local1562[local56];
				} else {
					local51 = -1000;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	@Override
	public void method3814(@OriginalArg(0) int arg0) {
		if ((this.anInt984 & 0x8000) == 32768 && (arg0 & 0x8000) == 0) {
			this.method1257(true);
		}
		this.anInt984 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "()V")
	private void method1239() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt987; local1++) {
			this.anIntArray68[local1] = -this.anIntArray68[local1];
			this.anIntArray47[local1] = -this.anIntArray47[local1];
		}
		this.method1261();
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "()V")
	@Override
	public void method3810() {
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!on;Lclient!au;Lclient!tp;II)V")
	private void method1240(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(2) Class224 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt981 < 1) {
			return;
		}
		this.aClass14_Sub1_1 = (Class14_Sub1) arg0;
		@Pc(12) Class14_Sub1 local12 = this.aClass19_Sub2_3.aClass14_Sub1_2;
		if (!this.aBoolean79) {
			this.method1251();
		}
		this.method1254(this.aClass14_Sub1_1);
		@Pc(23) boolean local23 = false;
		if (this.aClass14_Sub1_1.anInt505 == 32768 && this.aClass14_Sub1_1.anInt500 == 0 && this.aClass14_Sub1_1.anInt497 == 0 && this.aClass14_Sub1_1.anInt507 == 0 && this.aClass14_Sub1_1.anInt506 == 32768 && this.aClass14_Sub1_1.anInt499 == 0 && this.aClass14_Sub1_1.anInt504 == 0 && this.aClass14_Sub1_1.anInt502 == 0 && this.aClass14_Sub1_1.anInt503 == 32768) {
			local23 = true;
		}
		@Pc(90) int local90 = (local12.anInt501 << 15) + local12.anInt504 * this.aClass14_Sub1_1.anInt498 + local12.anInt502 * this.aClass14_Sub1_1.anInt496 + local12.anInt503 * this.aClass14_Sub1_1.anInt501;
		@Pc(95) int local95;
		if (local23) {
			local95 = local12.anInt502;
		} else {
			local95 = local12.anInt504 * this.aClass14_Sub1_1.anInt500 + local12.anInt502 * this.aClass14_Sub1_1.anInt506 + local12.anInt503 * this.aClass14_Sub1_1.anInt502 >> 15;
		}
		@Pc(128) int local128 = local90 + this.aShort2 * local95 >> 15;
		@Pc(137) int local137 = local90 + this.aShort6 * local95 >> 15;
		@Pc(145) int local145;
		@Pc(150) int local150;
		if (local128 > local137) {
			local145 = local137 - this.aShort5;
			local150 = local128 + this.aShort5;
		} else {
			local145 = local128 - this.aShort5;
			local150 = local137 + this.aShort5;
		}
		if (local145 >= this.aClass19_Sub2_3.anInt2847 || local150 <= this.aClass19_Sub2_3.anInt2843) {
			return;
		}
		@Pc(199) int local199 = (local12.anInt498 << 15) + local12.anInt505 * this.aClass14_Sub1_1.anInt498 + local12.anInt500 * this.aClass14_Sub1_1.anInt496 + local12.anInt497 * this.aClass14_Sub1_1.anInt501;
		@Pc(204) int local204;
		if (local23) {
			local204 = local12.anInt500;
		} else {
			local204 = local12.anInt505 * this.aClass14_Sub1_1.anInt500 + local12.anInt500 * this.aClass14_Sub1_1.anInt506 + local12.anInt497 * this.aClass14_Sub1_1.anInt502 >> 15;
		}
		@Pc(237) int local237 = local199 + this.aShort2 * local204 >> 15;
		@Pc(246) int local246 = local199 + this.aShort6 * local204 >> 15;
		@Pc(258) int local258;
		@Pc(267) int local267;
		if (local237 > local246) {
			local258 = (local246 - this.aShort5) * this.aClass19_Sub2_3.anInt2851;
			local267 = (local237 + this.aShort5) * this.aClass19_Sub2_3.anInt2851;
		} else {
			local258 = (local237 - this.aShort5) * this.aClass19_Sub2_3.anInt2851;
			local267 = (local246 + this.aShort5) * this.aClass19_Sub2_3.anInt2851;
		}
		if (local258 / local150 >= this.aClass19_Sub2_3.anInt2865 || local267 / local150 <= this.aClass19_Sub2_3.anInt2848) {
			return;
		}
		@Pc(328) int local328 = (local12.anInt496 << 15) + local12.anInt507 * this.aClass14_Sub1_1.anInt498 + local12.anInt506 * this.aClass14_Sub1_1.anInt496 + local12.anInt499 * this.aClass14_Sub1_1.anInt501;
		@Pc(333) int local333;
		if (local23) {
			local333 = local12.anInt506;
		} else {
			local333 = local12.anInt507 * this.aClass14_Sub1_1.anInt500 + local12.anInt506 * this.aClass14_Sub1_1.anInt506 + local12.anInt499 * this.aClass14_Sub1_1.anInt502 >> 15;
		}
		@Pc(366) int local366 = local328 + this.aShort2 * local333 >> 15;
		@Pc(375) int local375 = local328 + this.aShort6 * local333 >> 15;
		@Pc(387) int local387;
		@Pc(396) int local396;
		if (local366 > local375) {
			local387 = (local375 - this.aShort5) * this.aClass19_Sub2_3.anInt2841;
			local396 = (local366 + this.aShort5) * this.aClass19_Sub2_3.anInt2841;
		} else {
			local387 = (local366 - this.aShort5) * this.aClass19_Sub2_3.anInt2841;
			local396 = (local375 + this.aShort5) * this.aClass19_Sub2_3.anInt2841;
		}
		if (local387 / local150 >= this.aClass19_Sub2_3.anInt2862 || local396 / local150 <= this.aClass19_Sub2_3.anInt2844) {
			return;
		}
		@Pc(436) int local436;
		@Pc(439) int local439;
		@Pc(442) int local442;
		@Pc(445) int local445;
		@Pc(448) int local448;
		@Pc(451) int local451;
		if (local23) {
			local436 = local12.anInt505;
			local439 = local12.anInt507;
			local442 = local12.anInt504;
			local445 = local12.anInt497;
			local448 = local12.anInt499;
			local451 = local12.anInt503;
		} else {
			local436 = local12.anInt505 * this.aClass14_Sub1_1.anInt505 + local12.anInt500 * this.aClass14_Sub1_1.anInt507 + local12.anInt497 * this.aClass14_Sub1_1.anInt504 >> 15;
			local439 = local12.anInt507 * this.aClass14_Sub1_1.anInt505 + local12.anInt506 * this.aClass14_Sub1_1.anInt507 + local12.anInt499 * this.aClass14_Sub1_1.anInt504 >> 15;
			local442 = local12.anInt504 * this.aClass14_Sub1_1.anInt505 + local12.anInt502 * this.aClass14_Sub1_1.anInt507 + local12.anInt503 * this.aClass14_Sub1_1.anInt504 >> 15;
			local445 = local12.anInt505 * this.aClass14_Sub1_1.anInt497 + local12.anInt500 * this.aClass14_Sub1_1.anInt499 + local12.anInt497 * this.aClass14_Sub1_1.anInt503 >> 15;
			local448 = local12.anInt507 * this.aClass14_Sub1_1.anInt497 + local12.anInt506 * this.aClass14_Sub1_1.anInt499 + local12.anInt499 * this.aClass14_Sub1_1.anInt503 >> 15;
			local451 = local12.anInt504 * this.aClass14_Sub1_1.anInt497 + local12.anInt502 * this.aClass14_Sub1_1.anInt499 + local12.anInt503 * this.aClass14_Sub1_1.anInt503 >> 15;
		}
		if (this.aClass19_Sub2_3.anInt2846 > 1) {
			synchronized (this) {
				while (this.aBoolean78) {
					try {
						this.wait();
					} catch (@Pc(604) InterruptedException local604) {
					}
				}
				this.aBoolean78 = true;
			}
		}
		this.method1242(Thread.currentThread());
		@Pc(622) boolean local622 = false;
		@Pc(631) boolean local631 = local145 <= this.aClass19_Sub2_3.anInt2843;
		@Pc(646) boolean local646 = local631 || this.anInt980 > 0 || this.aClass114Array1 != null || this.aClass163Array1 != null;
		this.aClass250_2.anInt7222 = this.aClass81_1.width;
		this.aClass250_2.anInt7223 = this.aClass81_1.anInt2266;
		this.aClass250_2.anInt7224 = this.aClass81_1.anInt2263;
		@Pc(668) int local668 = this.aClass19_Sub2_3.anInt2851;
		@Pc(672) int local672 = this.aClass19_Sub2_3.anInt2841;
		@Pc(676) int local676 = this.aClass19_Sub2_3.anInt2843;
		@Pc(713) int local713;
		@Pc(729) int local729;
		@Pc(745) int local745;
		@Pc(687) int local687;
		@Pc(692) int local692;
		@Pc(697) int local697;
		@Pc(681) int local681;
		if (arg3 == -1) {
			for (local681 = 0; local681 < this.anInt987; local681++) {
				local687 = this.anIntArray68[local681];
				local692 = this.anIntArray56[local681];
				local697 = this.anIntArray47[local681];
				local713 = local199 + local436 * local687 + local204 * local692 + local445 * local697 >> 15;
				local729 = local328 + local439 * local687 + local333 * local692 + local448 * local697 >> 15;
				local745 = local90 + local442 * local687 + local95 * local692 + local451 * local697 >> 15;
				this.anIntArray71[local681] = local745 - local145;
				this.anIntArray67[local681] = local745;
				if (local745 >= local676) {
					this.anIntArray60[local681] = this.aClass250_2.anInt7223 + local713 * local668 / local745;
					this.anIntArray63[local681] = this.aClass250_2.anInt7224 + local729 * local672 / local745;
				} else {
					this.anIntArray60[local681] = -5000;
					local622 = true;
				}
				if (local646) {
					this.anIntArray51[local681] = local713;
					this.anIntArray64[local681] = local729;
					this.anIntArray61[local681] = local745;
				}
				if (this.aClass19_Sub2_3.aBoolean199) {
					this.anIntArray54[local681] = this.aClass14_Sub1_1.anInt496 + (this.aClass14_Sub1_1.anInt507 * local687 + this.aClass14_Sub1_1.anInt506 * local692 + this.aClass14_Sub1_1.anInt499 * local697 >> 15);
				}
			}
		} else {
			for (local681 = 0; local681 < this.anInt987; local681++) {
				local687 = this.anIntArray68[local681];
				local692 = this.anIntArray56[local681];
				local697 = this.anIntArray47[local681];
				local713 = local199 + local436 * local687 + local204 * local692 + local445 * local697 >> 15;
				local729 = local328 + local439 * local687 + local333 * local692 + local448 * local697 >> 15;
				local745 = local90 + local442 * local687 + local95 * local692 + local451 * local697 >> 15;
				this.anIntArray71[local681] = local745 - local145;
				this.anIntArray67[local681] = local745;
				if (local745 >= local676) {
					this.anIntArray60[local681] = this.aClass250_2.anInt7223 + local713 * local668 / arg3;
					this.anIntArray63[local681] = this.aClass250_2.anInt7224 + local729 * local672 / arg3;
				} else {
					this.anIntArray60[local681] = -5000;
					local622 = true;
				}
				if (local646) {
					this.anIntArray51[local681] = local713;
					this.anIntArray64[local681] = local729;
					this.anIntArray61[local681] = local745;
				}
				if (this.aClass19_Sub2_3.aBoolean199) {
					this.anIntArray54[local681] = this.aClass14_Sub1_1.anInt496 + (this.aClass14_Sub1_1.anInt507 * local687 + this.aClass14_Sub1_1.anInt506 * local692 + this.aClass14_Sub1_1.anInt499 * local697 >> 15);
				}
			}
		}
		local681 = 0;
		@Pc(1037) int local1037;
		@Pc(1042) int local1042;
		if (arg2 != null) {
			for (@Pc(1026) Class12_Sub1_Sub1 local1026 = (Class12_Sub1_Sub1) arg2.aClass191_1.method4890(); local1026 != null; local1026 = (Class12_Sub1_Sub1) arg2.aClass191_1.method4888()) {
				@Pc(1032) int local1032 = local1026.anInt4465 >> 12;
				local1037 = local1026.anInt4470 >> 12;
				local1042 = local1026.anInt4467 >> 12;
				local713 = local12.anInt498 + (local12.anInt505 * local1032 + local12.anInt500 * local1037 + local12.anInt497 * local1042 >> 15);
				local729 = local12.anInt496 + (local12.anInt507 * local1032 + local12.anInt506 * local1037 + local12.anInt499 * local1042 >> 15);
				local745 = local12.anInt501 + (local12.anInt504 * local1032 + local12.anInt502 * local1037 + local12.anInt503 * local1042 >> 15);
				if (local745 >= local676) {
					this.anIntArray78[local681] = this.aClass19_Sub2_3.anInt2855 + local713 * local668 / local745;
					this.anIntArray48[local681] = this.aClass19_Sub2_3.anInt2860 + local729 * local672 / local745;
					this.anIntArray59[local681] = local745;
					this.anIntArray55[local681] = local745 - local145;
					this.aClass12_Sub1_Sub1Array1[local681] = local1026;
				} else {
					this.anIntArray55[local681] = Integer.MIN_VALUE;
				}
				local681++;
			}
		}
		if (arg1 != null) {
			@Pc(1167) boolean local1167 = false;
			@Pc(1169) boolean local1169 = true;
			local1037 = this.aShort8 + this.aShort4 >> 1;
			local1042 = this.aShort7 + this.aShort3 >> 1;
			@Pc(1190) short local1190 = this.aShort2;
			local713 = local199 + local436 * local1037 + local204 * local1190 + local445 * local1042 >> 15;
			local729 = local328 + local439 * local1037 + local333 * local1190 + local448 * local1042 >> 15;
			local745 = local90 + local442 * local1037 + local95 * local1190 + local451 * local1042 >> 15;
			@Pc(1245) int local1245;
			if (local745 >= local676) {
				local1245 = local745;
				if (arg3 != -1) {
					local1245 = arg3;
				}
				arg1.anInt423 = this.aClass19_Sub2_3.anInt2855 + local713 * local668 / local1245;
				arg1.anInt424 = this.aClass19_Sub2_3.anInt2860 + local729 * local672 / local1245;
			} else {
				local1167 = true;
			}
			local1190 = this.aShort6;
			local1245 = local199 + local436 * local1037 + local204 * local1190 + local445 * local1042 >> 15;
			@Pc(1314) int local1314 = local328 + local439 * local1037 + local333 * local1190 + local448 * local1042 >> 15;
			@Pc(1330) int local1330 = local90 + local442 * local1037 + local95 * local1190 + local451 * local1042 >> 15;
			@Pc(1335) int local1335;
			if (local1330 >= local676) {
				local1335 = local1330;
				if (arg3 != -1) {
					local1335 = arg3;
				}
				arg1.anInt425 = this.aClass19_Sub2_3.anInt2855 + local1245 * local668 / local1335;
				arg1.anInt426 = this.aClass19_Sub2_3.anInt2860 + local1314 * local672 / local1335;
			} else {
				local1167 = true;
			}
			if (local1167) {
				if (local745 < local676 && local1330 < local676) {
					local1169 = false;
				} else {
					@Pc(1401) int local1401;
					@Pc(1411) int local1411;
					@Pc(1413) int local1413;
					if (local745 < local676) {
						local1335 = (local1330 - this.aClass19_Sub2_3.anInt2843 << 16) / (local1330 - local745);
						local1401 = local1245 + ((local1245 - local713) * local1335 >> 16);
						local1411 = local1314 + ((local1314 - local729) * local1335 >> 16);
						local1413 = local676;
						if (arg3 != -1) {
							local1413 = arg3;
						}
						arg1.anInt423 = this.aClass19_Sub2_3.anInt2855 + local1401 * local668 / local1413;
						arg1.anInt424 = this.aClass19_Sub2_3.anInt2860 + local1411 * local672 / local1413;
					} else if (local1330 < local676) {
						local1335 = (local745 - local676 << 16) / (local745 - local1330);
						local1401 = local713 + ((local713 - local1245) * local1335 >> 16);
						local1411 = local729 + ((local729 - local1314) * local1335 >> 16);
						local1413 = local676;
						if (arg3 != -1) {
							local1413 = arg3;
						}
						arg1.anInt423 = this.aClass19_Sub2_3.anInt2855 + local1401 * local668 / local1413;
						arg1.anInt424 = this.aClass19_Sub2_3.anInt2860 + local1411 * local672 / local1413;
					}
				}
			}
			if (local1169) {
				if (local745 > local1330) {
					local1335 = local745;
					if (arg3 != -1) {
						local1335 = arg3;
					}
					arg1.anInt427 = this.aClass19_Sub2_3.anInt2855 + (local713 + this.aShort5) * local668 / local1335 - arg1.anInt423;
				} else {
					local1335 = local1330;
					if (arg3 != -1) {
						local1335 = arg3;
					}
					arg1.anInt427 = this.aClass19_Sub2_3.anInt2855 + (local1245 + this.aShort5) * local668 / local1335 - arg1.anInt425;
				}
				arg1.aBoolean29 = true;
			}
		}
		this.method1257(true);
		this.aClass81_1.aBoolean168 = (arg4 & 0x1) == 0;
		try {
			this.method1238(local622, this.aClass19_Sub2_3.aBoolean198 && local150 > this.aClass19_Sub2_3.anInt2867 || this.aClass19_Sub2_3.aBoolean199, local150 + 2 - local145, arg2 != null, local681);
		} catch (@Pc(1605) Exception local1605) {
		}
		this.aClass81_1 = null;
		if (this.aClass19_Sub2_3.anInt2846 > 1) {
			synchronized (this) {
				this.aBoolean78 = false;
				this.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "()[Lclient!nm;")
	@Override
	public Class163[] method3840() {
		return this.aClass163Array1;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
	@Override
	public void method3815(@OriginalArg(0) int arg0) {
		if ((this.anInt984 & 0x3) != 3) {
			throw new IllegalStateException();
		}
		@Pc(13) int local13 = Class19.anIntArray178[arg0];
		@Pc(17) int local17 = Class19.anIntArray177[arg0];
		for (@Pc(19) int local19 = 0; local19 < this.anInt987; local19++) {
			@Pc(36) int local36 = this.anIntArray56[local19] * local13 + this.anIntArray68[local19] * local17 >> 15;
			this.anIntArray56[local19] = this.anIntArray56[local19] * local17 - this.anIntArray68[local19] * local13 >> 15;
			this.anIntArray68[local19] = local36;
		}
		this.method1261();
	}

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "(I)V")
	@Override
	public void method3845(@OriginalArg(0) int arg0) {
		if ((this.anInt984 & 0xD) != 13) {
			throw new IllegalStateException();
		} else if (this.aClass26Array2 == null) {
			this.method3833(arg0);
		} else if (arg0 == 4096) {
			this.method1255();
		} else if (arg0 == 8192) {
			this.method1248();
		} else if (arg0 == 12288) {
			this.method1256();
		} else {
			@Pc(34) int local34 = Class19.anIntArray178[arg0];
			@Pc(38) int local38 = Class19.anIntArray177[arg0];
			@Pc(57) int local57;
			for (@Pc(40) int local40 = 0; local40 < this.anInt981; local40++) {
				local57 = this.anIntArray47[local40] * local34 + this.anIntArray68[local40] * local38 >> 15;
				this.anIntArray47[local40] = this.anIntArray47[local40] * local38 - this.anIntArray68[local40] * local34 >> 15;
				this.anIntArray68[local40] = local57;
				if (this.aClass26Array2[local40] != null) {
					local57 = this.aClass26Array2[local40].anInt731 * local34 + this.aClass26Array2[local40].anInt733 * local38 >> 15;
					this.aClass26Array2[local40].anInt731 = this.aClass26Array2[local40].anInt731 * local38 - this.aClass26Array2[local40].anInt733 * local34 >> 15;
					this.aClass26Array2[local40].anInt733 = local57;
				}
			}
			@Pc(166) int local166;
			if (this.aClass234Array1 != null) {
				for (local57 = 0; local57 < this.anInt986; local57++) {
					if (this.aClass234Array1[local57] != null) {
						local166 = this.aClass234Array1[local57].anInt6563 * local34 + this.aClass234Array1[local57].anInt6564 * local38 >> 15;
						this.aClass234Array1[local57].anInt6563 = this.aClass234Array1[local57].anInt6563 * local38 - this.aClass234Array1[local57].anInt6564 * local34 >> 15;
						this.aClass234Array1[local57].anInt6564 = local166;
					}
				}
			}
			for (local57 = this.anInt981; local57 < this.anInt987; local57++) {
				local166 = this.anIntArray47[local57] * local34 + this.anIntArray68[local57] * local38 >> 15;
				this.anIntArray47[local57] = this.anIntArray47[local57] * local38 - this.anIntArray68[local57] * local34 >> 15;
				this.anIntArray68[local57] = local166;
			}
			this.anInt979 = 0;
			this.aBoolean79 = false;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!cb;Lclient!cb;IZZ)Lclient!gn;")
	private Model method1241(@OriginalArg(0) SoftwareModel arg0, @OriginalArg(1) SoftwareModel arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		arg0.aBoolean79 = this.aBoolean79;
		if (this.aBoolean79) {
			arg0.aShort4 = this.aShort4;
			arg0.aShort6 = this.aShort6;
			arg0.aShort3 = this.aShort3;
			arg0.aShort8 = this.aShort8;
			arg0.aShort2 = this.aShort2;
			arg0.aShort7 = this.aShort7;
			arg0.aShort5 = this.aShort5;
		}
		arg0.anInt982 = this.anInt982;
		arg0.anInt983 = this.anInt983;
		arg0.anInt987 = this.anInt987;
		arg0.anInt981 = this.anInt981;
		arg0.anInt986 = this.anInt986;
		@Pc(71) boolean local71 = (arg2 & 0x7) == 7 | (arg2 & 0x20) != 0;
		@Pc(81) boolean local81 = local71 || (arg2 & 0x1) != 0;
		@Pc(91) boolean local91 = local71 || (arg2 & 0x2) != 0;
		@Pc(105) boolean local105 = local71 || (arg2 & 0x4) != 0 || (arg2 & 0x10) != 0;
		@Pc(137) int local137;
		if (local81 || local91 || local105) {
			if (local81) {
				if (arg1.anIntArray68 == null || arg1.anIntArray68.length < this.anInt987) {
					arg0.anIntArray68 = arg1.anIntArray68 = new int[this.anInt987];
				} else {
					arg0.anIntArray68 = arg1.anIntArray68;
				}
				for (local137 = 0; local137 < this.anInt987; local137++) {
					arg0.anIntArray68[local137] = this.anIntArray68[local137];
				}
			} else {
				arg0.anIntArray68 = this.anIntArray68;
			}
			if (local91) {
				if (arg1.anIntArray56 == null || arg1.anIntArray56.length < this.anInt987) {
					arg0.anIntArray56 = arg1.anIntArray56 = new int[this.anInt987];
				} else {
					arg0.anIntArray56 = arg1.anIntArray56;
				}
				for (local137 = 0; local137 < this.anInt987; local137++) {
					arg0.anIntArray56[local137] = this.anIntArray56[local137];
				}
			} else {
				arg0.anIntArray56 = this.anIntArray56;
			}
			if (local105) {
				if (arg1.anIntArray47 == null || arg1.anIntArray47.length < this.anInt987) {
					arg0.anIntArray47 = arg1.anIntArray47 = new int[this.anInt987];
				} else {
					arg0.anIntArray47 = arg1.anIntArray47;
				}
				for (local137 = 0; local137 < this.anInt987; local137++) {
					arg0.anIntArray47[local137] = this.anIntArray47[local137];
				}
			} else {
				arg0.anIntArray47 = this.anIntArray47;
			}
		} else {
			arg0.anIntArray68 = this.anIntArray68;
			arg0.anIntArray56 = this.anIntArray56;
			arg0.anIntArray47 = this.anIntArray47;
		}
		if ((arg2 & 0x80) == 0 && (arg2 & 0x2000) == 0) {
			arg0.aShortArray8 = this.aShortArray8;
		} else {
			if (arg1.aShortArray8 == null || arg1.aShortArray8.length < this.anInt986) {
				local137 = this.anInt986;
				arg0.aShortArray8 = arg1.aShortArray8 = new short[local137];
			} else {
				arg0.aShortArray8 = arg1.aShortArray8;
			}
			for (local137 = 0; local137 < this.anInt986; local137++) {
				arg0.aShortArray8[local137] = this.aShortArray8[local137];
			}
		}
		if ((arg2 & 0xBA18) != 0) {
			arg0.anInt979 = 0;
			arg0.anIntArray76 = arg0.anIntArray74 = arg0.anIntArray52 = null;
		} else if ((arg2 & 0x80) == 0) {
			if (arg4) {
				this.method1257(false);
			}
			arg0.anIntArray76 = this.anIntArray76;
			arg0.anIntArray74 = this.anIntArray74;
			arg0.anIntArray52 = this.anIntArray52;
			arg0.anInt979 = this.anInt979;
		} else {
			if (arg4) {
				this.method1257(false);
			}
			if (this.anIntArray76 != null) {
				if (arg1.anIntArray76 == null || arg1.anIntArray76.length < this.anInt986) {
					local137 = this.anInt986;
					arg0.anIntArray76 = arg1.anIntArray76 = new int[local137];
					arg0.anIntArray74 = arg1.anIntArray74 = new int[local137];
					arg0.anIntArray52 = arg1.anIntArray52 = new int[local137];
				} else {
					arg0.anIntArray76 = arg1.anIntArray76;
					arg0.anIntArray74 = arg1.anIntArray74;
					arg0.anIntArray52 = arg1.anIntArray52;
				}
				for (local137 = 0; local137 < this.anInt986; local137++) {
					arg0.anIntArray76[local137] = this.anIntArray76[local137];
					arg0.anIntArray74[local137] = this.anIntArray74[local137];
					arg0.anIntArray52[local137] = this.anIntArray52[local137];
				}
			}
			arg0.anInt979 = this.anInt979;
		}
		if ((arg2 & 0x100) == 0) {
			arg0.aByteArray11 = this.aByteArray11;
		} else {
			if (arg1.aByteArray11 == null || arg1.aByteArray11.length < this.anInt986) {
				local137 = this.anInt986;
				arg0.aByteArray11 = arg1.aByteArray11 = new byte[local137];
			} else {
				arg0.aByteArray11 = arg1.aByteArray11;
			}
			if (this.aByteArray11 == null) {
				for (local137 = 0; local137 < this.anInt986; local137++) {
					arg0.aByteArray11[local137] = 0;
				}
			} else {
				for (local137 = 0; local137 < this.anInt986; local137++) {
					arg0.aByteArray11[local137] = this.aByteArray11[local137];
				}
			}
		}
		if ((arg2 & 0x8) == 0 && (arg2 & 0x10) == 0) {
			if (arg4) {
				this.method1252();
			}
			arg0.aClass26Array2 = this.aClass26Array2;
			arg0.aClass234Array1 = this.aClass234Array1;
		} else {
			if (arg1.aClass26Array2 == null || arg1.aClass26Array2.length < this.anInt981) {
				local137 = this.anInt981;
				arg0.aClass26Array2 = arg1.aClass26Array2 = new Class26[local137];
			} else {
				arg0.aClass26Array2 = arg1.aClass26Array2;
			}
			if (this.aClass26Array2 == null) {
				arg0.aClass26Array2 = null;
			} else {
				for (local137 = 0; local137 < this.anInt981; local137++) {
					arg0.aClass26Array2[local137] = new Class26(this.aClass26Array2[local137]);
				}
			}
			if (this.aClass234Array1 == null) {
				arg0.aClass234Array1 = null;
			} else {
				if (arg1.aClass234Array1 == null || arg1.aClass234Array1.length < this.anInt986) {
					local137 = this.anInt986;
					arg0.aClass234Array1 = arg1.aClass234Array1 = new Class234[local137];
				} else {
					arg0.aClass234Array1 = arg1.aClass234Array1;
				}
				for (local137 = 0; local137 < this.anInt986; local137++) {
					arg0.aClass234Array1[local137] = this.aClass234Array1[local137] == null ? null : new Class234(this.aClass234Array1[local137]);
				}
			}
		}
		if ((arg2 & 0x4000) == 0) {
			arg0.aShortArray11 = this.aShortArray11;
		} else if (this.aShortArray11 == null) {
			arg0.aShortArray11 = null;
		} else {
			if (arg1.aShortArray11 == null || arg1.aShortArray11.length < this.anInt986) {
				local137 = this.anInt986;
				arg0.aShortArray11 = arg1.aShortArray11 = new short[local137];
			} else {
				arg0.aShortArray11 = arg1.aShortArray11;
			}
			for (local137 = 0; local137 < this.anInt986; local137++) {
				arg0.aShortArray11[local137] = this.aShortArray11[local137];
			}
		}
		if ((arg2 & 0x8000) == 0) {
			arg0.aByteArray10 = this.aByteArray10;
		} else if (this.aByteArray10 == null) {
			arg0.aByteArray10 = null;
		} else {
			if (arg1.aByteArray10 == null || arg1.aByteArray10.length < this.anInt986) {
				local137 = arg3 ? this.anInt986 + 100 : this.anInt986;
				arg0.aByteArray10 = arg1.aByteArray10 = new byte[local137];
			} else {
				arg0.aByteArray10 = arg1.aByteArray10;
			}
			for (local137 = 0; local137 < this.anInt986; local137++) {
				arg0.aByteArray10[local137] = this.aByteArray10[local137];
			}
		}
		arg0.anIntArrayArray10 = this.anIntArrayArray10;
		arg0.anIntArrayArray12 = this.anIntArrayArray12;
		arg0.aShortArray7 = this.aShortArray7;
		arg0.aShortArray9 = this.aShortArray9;
		arg0.aByteArray9 = this.aByteArray9;
		arg0.aByteArray8 = this.aByteArray8;
		arg0.aByte4 = this.aByte4;
		arg0.anInt980 = this.anInt980;
		arg0.anIntArray43 = this.anIntArray43;
		arg0.anIntArray46 = this.anIntArray46;
		arg0.anIntArray62 = this.anIntArray62;
		arg0.aShortArray10 = this.aShortArray10;
		arg0.aShortArray5 = this.aShortArray5;
		arg0.aShortArray6 = this.aShortArray6;
		arg0.aClass114Array1 = this.aClass114Array1;
		arg0.aClass163Array1 = this.aClass163Array1;
		arg0.anInt984 = arg2;
		return arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method3821(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int local2 = arg1.length;
		@Pc(21) int local21;
		@Pc(67) int local67;
		@Pc(84) int local84;
		@Pc(89) int local89;
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(16) int local16;
		if (arg0 == 0) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			if (!this.aBoolean77) {
				for (local21 = 0; local21 < this.anInt987; local21++) {
					this.anIntArray68[local21] <<= 0x4;
					this.anIntArray56[local21] <<= 0x4;
					this.anIntArray47[local21] <<= 0x4;
				}
				this.aBoolean77 = true;
			}
			local21 = 0;
			this.anInt989 = 0;
			this.anInt985 = 0;
			this.anInt990 = 0;
			for (local67 = 0; local67 < local2; local67++) {
				@Pc(72) int local72 = arg1[local67];
				if (local72 < this.anIntArrayArray10.length) {
					@Pc(82) int[] local82 = this.anIntArrayArray10[local72];
					for (local84 = 0; local84 < local82.length; local84++) {
						local89 = local82[local84];
						this.anInt989 += this.anIntArray68[local89];
						this.anInt985 += this.anIntArray56[local89];
						this.anInt990 += this.anIntArray47[local89];
						local21++;
					}
				}
			}
			if (local21 > 0) {
				this.anInt989 = this.anInt989 / local21 + local8;
				this.anInt985 = this.anInt985 / local21 + local12;
				this.anInt990 = this.anInt990 / local21 + local16;
			} else {
				this.anInt989 = local8;
				this.anInt985 = local12;
				this.anInt990 = local16;
			}
			return;
		}
		@Pc(233) int[] local233;
		@Pc(235) int local235;
		if (arg0 == 1) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			if (!this.aBoolean77) {
				for (local21 = 0; local21 < this.anInt987; local21++) {
					this.anIntArray68[local21] <<= 0x4;
					this.anIntArray56[local21] <<= 0x4;
					this.anIntArray47[local21] <<= 0x4;
				}
				this.aBoolean77 = true;
			}
			for (local21 = 0; local21 < local2; local21++) {
				local67 = arg1[local21];
				if (local67 < this.anIntArrayArray10.length) {
					local233 = this.anIntArrayArray10[local67];
					for (local235 = 0; local235 < local233.length; local235++) {
						local84 = local233[local235];
						this.anIntArray68[local84] += local8;
						this.anIntArray56[local84] += local12;
						this.anIntArray47[local84] += local16;
					}
				}
			}
			return;
		}
		@Pc(342) int local342;
		@Pc(360) int local360;
		if (arg0 == 2) {
			for (local21 = 0; local21 < local2; local21++) {
				local67 = arg1[local21];
				if (local67 < this.anIntArrayArray10.length) {
					local233 = this.anIntArrayArray10[local67];
					if ((arg5 & 0x1) == 0) {
						for (local235 = 0; local235 < local233.length; local235++) {
							local84 = local233[local235];
							this.anIntArray68[local84] -= this.anInt989;
							this.anIntArray56[local84] -= this.anInt985;
							this.anIntArray47[local84] -= this.anInt990;
							if (arg4 != 0) {
								local89 = Class19.anIntArray178[arg4];
								local342 = Class19.anIntArray177[arg4];
								local360 = this.anIntArray56[local84] * local89 + this.anIntArray68[local84] * local342 + 32767 >> 15;
								this.anIntArray56[local84] = this.anIntArray56[local84] * local342 + 32767 - this.anIntArray68[local84] * local89 >> 15;
								this.anIntArray68[local84] = local360;
							}
							if (arg2 != 0) {
								local89 = Class19.anIntArray178[arg2];
								local342 = Class19.anIntArray177[arg2];
								local360 = this.anIntArray56[local84] * local342 + 32767 - this.anIntArray47[local84] * local89 >> 15;
								this.anIntArray47[local84] = this.anIntArray56[local84] * local89 + this.anIntArray47[local84] * local342 + 32767 >> 15;
								this.anIntArray56[local84] = local360;
							}
							if (arg3 != 0) {
								local89 = Class19.anIntArray178[arg3];
								local342 = Class19.anIntArray177[arg3];
								local360 = this.anIntArray47[local84] * local89 + this.anIntArray68[local84] * local342 + 32767 >> 15;
								this.anIntArray47[local84] = this.anIntArray47[local84] * local342 + 32767 - this.anIntArray68[local84] * local89 >> 15;
								this.anIntArray68[local84] = local360;
							}
							this.anIntArray68[local84] += this.anInt989;
							this.anIntArray56[local84] += this.anInt985;
							this.anIntArray47[local84] += this.anInt990;
						}
					} else {
						for (local235 = 0; local235 < local233.length; local235++) {
							local84 = local233[local235];
							this.anIntArray68[local84] -= this.anInt989;
							this.anIntArray56[local84] -= this.anInt985;
							this.anIntArray47[local84] -= this.anInt990;
							if (arg2 != 0) {
								local89 = Class19.anIntArray178[arg2];
								local342 = Class19.anIntArray177[arg2];
								local360 = this.anIntArray56[local84] * local342 + 32767 - this.anIntArray47[local84] * local89 >> 15;
								this.anIntArray47[local84] = this.anIntArray56[local84] * local89 + this.anIntArray47[local84] * local342 + 32767 >> 15;
								this.anIntArray56[local84] = local360;
							}
							if (arg4 != 0) {
								local89 = Class19.anIntArray178[arg4];
								local342 = Class19.anIntArray177[arg4];
								local360 = this.anIntArray56[local84] * local89 + this.anIntArray68[local84] * local342 + 32767 >> 15;
								this.anIntArray56[local84] = this.anIntArray56[local84] * local342 + 32767 - this.anIntArray68[local84] * local89 >> 15;
								this.anIntArray68[local84] = local360;
							}
							if (arg3 != 0) {
								local89 = Class19.anIntArray178[arg3];
								local342 = Class19.anIntArray177[arg3];
								local360 = this.anIntArray47[local84] * local89 + this.anIntArray68[local84] * local342 + 32767 >> 15;
								this.anIntArray47[local84] = this.anIntArray47[local84] * local342 + 32767 - this.anIntArray68[local84] * local89 >> 15;
								this.anIntArray68[local84] = local360;
							}
							this.anIntArray68[local84] += this.anInt989;
							this.anIntArray56[local84] += this.anInt985;
							this.anIntArray47[local84] += this.anInt990;
						}
					}
				}
			}
		} else if (arg0 == 3) {
			for (local21 = 0; local21 < local2; local21++) {
				local67 = arg1[local21];
				if (local67 < this.anIntArrayArray10.length) {
					local233 = this.anIntArrayArray10[local67];
					for (local235 = 0; local235 < local233.length; local235++) {
						local84 = local233[local235];
						this.anIntArray68[local84] -= this.anInt989;
						this.anIntArray56[local84] -= this.anInt985;
						this.anIntArray47[local84] -= this.anInt990;
						this.anIntArray68[local84] = this.anIntArray68[local84] * arg2 / 128;
						this.anIntArray56[local84] = this.anIntArray56[local84] * arg3 / 128;
						this.anIntArray47[local84] = this.anIntArray47[local84] * arg4 / 128;
						this.anIntArray68[local84] += this.anInt989;
						this.anIntArray56[local84] += this.anInt985;
						this.anIntArray47[local84] += this.anInt990;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray12 != null && this.aByteArray11 != null) {
				for (local21 = 0; local21 < local2; local21++) {
					local67 = arg1[local21];
					if (local67 < this.anIntArrayArray12.length) {
						local233 = this.anIntArrayArray12[local67];
						for (local235 = 0; local235 < local233.length; local235++) {
							local84 = local233[local235];
							local89 = (this.aByteArray11[local84] & 0xFF) + arg2 * 8;
							if (local89 < 0) {
								local89 = 0;
							} else if (local89 > 255) {
								local89 = 255;
							}
							this.aByteArray11[local84] = (byte) local89;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray12 != null) {
			for (local21 = 0; local21 < local2; local21++) {
				local67 = arg1[local21];
				if (local67 < this.anIntArrayArray12.length) {
					local233 = this.anIntArrayArray12[local67];
					for (local235 = 0; local235 < local233.length; local235++) {
						local84 = local233[local235];
						local89 = this.aShortArray8[local84] & 0xFFFF;
						local342 = local89 >> 10 & 0x3F;
						local360 = local89 >> 7 & 0x7;
						@Pc(1010) int local1010 = local89 & 0x7F;
						@Pc(1016) int local1016 = local342 + arg2 & 0x3F;
						local360 += arg3;
						if (local360 < 0) {
							local360 = 0;
						} else if (local360 > 7) {
							local360 = 7;
						}
						local1010 += arg4;
						if (local1010 < 0) {
							local1010 = 0;
						} else if (local1010 > 127) {
							local1010 = 127;
						}
						this.aShortArray8[local84] = (short) (local1016 << 10 | local360 << 7 | local1010);
					}
					this.aBoolean80 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/Thread;)V")
	private void method1242(@OriginalArg(0) Thread arg0) {
		@Pc(4) Class250 local4 = this.aClass19_Sub2_3.method2905(arg0);
		this.aClass81_1 = local4.aClass81_2;
		if (local4 == this.aClass250_2) {
			return;
		}
		this.aClass250_2 = local4;
		this.aBooleanArray8 = this.aClass250_2.aBooleanArray66;
		this.aBooleanArray9 = this.aClass250_2.aBooleanArray65;
		this.anIntArray54 = this.aClass250_2.anIntArray520;
		this.anIntArray51 = this.aClass250_2.anIntArray518;
		this.anIntArray64 = this.aClass250_2.anIntArray519;
		this.anIntArray61 = this.aClass250_2.anIntArray503;
		this.anIntArray60 = this.aClass250_2.anIntArray502;
		this.anIntArray63 = this.aClass250_2.anIntArray511;
		this.anIntArray67 = this.aClass250_2.anIntArray505;
		this.anIntArray50 = this.aClass250_2.anIntArray523;
		this.anIntArray58 = this.aClass250_2.anIntArray501;
		this.anIntArray44 = this.aClass250_2.anIntArray517;
		this.anIntArray78 = this.aClass250_2.anIntArray515;
		this.anIntArray48 = this.aClass250_2.anIntArray498;
		this.anIntArray59 = this.aClass250_2.anIntArray522;
		this.aClass12_Sub1_Sub1Array1 = this.aClass250_2.aClass12_Sub1_Sub1Array2;
		this.anIntArray55 = this.aClass250_2.anIntArray500;
		this.anIntArray71 = this.aClass250_2.anIntArray509;
		this.anIntArray77 = this.aClass250_2.anIntArray497;
		this.anIntArrayArray11 = this.aClass250_2.anIntArrayArray62;
		this.anIntArray65 = this.aClass250_2.anIntArray513;
		this.anIntArrayArray8 = this.aClass250_2.anIntArrayArray64;
		this.anIntArray69 = this.aClass250_2.anIntArray507;
		this.anIntArrayArray9 = this.aClass250_2.anIntArrayArray63;
		this.anIntArray75 = this.aClass250_2.anIntArray521;
		this.anIntArray49 = this.aClass250_2.anIntArray514;
		this.anIntArray70 = this.aClass250_2.anIntArray496;
		this.anIntArray72 = this.aClass250_2.anIntArray499;
		this.anIntArray66 = this.aClass250_2.anIntArray510;
		this.anIntArray73 = this.aClass250_2.anIntArray506;
		this.anIntArray57 = this.aClass250_2.anIntArray524;
		this.anIntArray53 = this.aClass250_2.anIntArray512;
	}

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "()I")
	@Override
	public int method3817() {
		if (!this.aBoolean79) {
			this.method1251();
		}
		return this.aShort6;
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V")
	@Override
	public void method3830(@OriginalArg(0) int arg0) {
		if ((this.anInt984 & 0x1000) != 4096) {
			throw new IllegalStateException();
		}
		this.anInt983 = arg0;
		this.anInt979 = 0;
	}

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "()I")
	@Override
	public int method3812() {
		if (!this.aBoolean79) {
			this.method1251();
		}
		return this.aShort7;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method3834(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(21) int local21;
		@Pc(67) int local67;
		@Pc(84) int local84;
		@Pc(89) int local89;
		@Pc(72) int local72;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			if (!this.aBoolean77) {
				for (local21 = 0; local21 < this.anInt987; local21++) {
					this.anIntArray68[local21] <<= 0x4;
					this.anIntArray56[local21] <<= 0x4;
					this.anIntArray47[local21] <<= 0x4;
				}
				this.aBoolean77 = true;
			}
			local21 = 0;
			this.anInt989 = 0;
			this.anInt985 = 0;
			this.anInt990 = 0;
			for (local67 = 0; local67 < local2; local67++) {
				local72 = arg1[local67];
				if (local72 < this.anIntArrayArray10.length) {
					@Pc(82) int[] local82 = this.anIntArrayArray10[local72];
					for (local84 = 0; local84 < local82.length; local84++) {
						local89 = local82[local84];
						if (this.aShortArray7 == null || (arg6 & this.aShortArray7[local89]) != 0) {
							this.anInt989 += this.anIntArray68[local89];
							this.anInt985 += this.anIntArray56[local89];
							this.anInt990 += this.anIntArray47[local89];
							local21++;
						}
					}
				}
			}
			if (local21 > 0) {
				this.anInt989 = this.anInt989 / local21 + arg2;
				this.anInt985 = this.anInt985 / local21 + arg3;
				this.anInt990 = this.anInt990 / local21 + arg4;
				this.aBoolean81 = true;
			} else {
				this.anInt989 = arg2;
				this.anInt985 = arg3;
				this.anInt990 = arg4;
			}
			return;
		}
		@Pc(320) int[] local320;
		@Pc(322) int local322;
		if (arg0 == 1) {
			if (arg7 != null) {
				local21 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 16384 >> 15;
				local67 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 16384 >> 15;
				local72 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 16384 >> 15;
				arg2 = local21;
				arg3 = local67;
				arg4 = local72;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			if (!this.aBoolean77) {
				for (local21 = 0; local21 < this.anInt987; local21++) {
					this.anIntArray68[local21] <<= 0x4;
					this.anIntArray56[local21] <<= 0x4;
					this.anIntArray47[local21] <<= 0x4;
				}
				this.aBoolean77 = true;
			}
			for (local21 = 0; local21 < local2; local21++) {
				local67 = arg1[local21];
				if (local67 < this.anIntArrayArray10.length) {
					local320 = this.anIntArrayArray10[local67];
					for (local322 = 0; local322 < local320.length; local322++) {
						local84 = local320[local322];
						if (this.aShortArray7 == null || (arg6 & this.aShortArray7[local84]) != 0) {
							this.anIntArray68[local84] += arg2;
							this.anIntArray56[local84] += arg3;
							this.anIntArray47[local84] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(478) int local478;
		@Pc(503) int local503;
		@Pc(528) int local528;
		@Pc(567) int local567;
		@Pc(571) int local571;
		@Pc(575) int local575;
		@Pc(579) int local579;
		@Pc(587) int local587;
		@Pc(595) int local595;
		@Pc(754) int local754;
		@Pc(782) int local782;
		@Pc(787) int local787;
		@Pc(797) int local797;
		@Pc(802) int local802;
		@Pc(805) int local805;
		@Pc(808) int local808;
		@Pc(810) int local810;
		@Pc(934) int[] local934;
		@Pc(936) int local936;
		@Pc(939) int local939;
		@Pc(942) int local942;
		@Pc(944) int local944;
		@Pc(1067) int local1067;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local21 = 0; local21 < local2; local21++) {
					local67 = arg1[local21];
					if (local67 < this.anIntArrayArray10.length) {
						local320 = this.anIntArrayArray10[local67];
						for (local322 = 0; local322 < local320.length; local322++) {
							local84 = local320[local322];
							if (this.aShortArray7 == null || (arg6 & this.aShortArray7[local84]) != 0) {
								this.anIntArray68[local84] -= this.anInt989;
								this.anIntArray56[local84] -= this.anInt985;
								this.anIntArray47[local84] -= this.anInt990;
								if (arg4 != 0) {
									local89 = Class19.anIntArray178[arg4];
									local478 = Class19.anIntArray177[arg4];
									local503 = this.anIntArray56[local84] * local89 + this.anIntArray68[local84] * local478 + 32767 >> 15;
									this.anIntArray56[local84] = this.anIntArray56[local84] * local478 + 32767 - this.anIntArray68[local84] * local89 >> 15;
									this.anIntArray68[local84] = local503;
								}
								if (arg2 != 0) {
									local89 = Class19.anIntArray178[arg2];
									local478 = Class19.anIntArray177[arg2];
									local503 = this.anIntArray56[local84] * local478 + 32767 - this.anIntArray47[local84] * local89 >> 15;
									this.anIntArray47[local84] = this.anIntArray56[local84] * local89 + this.anIntArray47[local84] * local478 + 32767 >> 15;
									this.anIntArray56[local84] = local503;
								}
								if (arg3 != 0) {
									local89 = Class19.anIntArray178[arg3];
									local478 = Class19.anIntArray177[arg3];
									local503 = this.anIntArray47[local84] * local89 + this.anIntArray68[local84] * local478 + 32767 >> 15;
									this.anIntArray47[local84] = this.anIntArray47[local84] * local478 + 32767 - this.anIntArray68[local84] * local89 >> 15;
									this.anIntArray68[local84] = local503;
								}
								this.anIntArray68[local84] += this.anInt989;
								this.anIntArray56[local84] += this.anInt985;
								this.anIntArray47[local84] += this.anInt990;
							}
						}
					}
				}
			} else {
				if (!this.aBoolean77) {
					for (local21 = 0; local21 < this.anInt987; local21++) {
						this.anIntArray68[local21] <<= 0x4;
						this.anIntArray56[local21] <<= 0x4;
						this.anIntArray47[local21] <<= 0x4;
					}
					this.aBoolean77 = true;
				}
				local21 = arg7[9] << 4;
				local67 = arg7[10] << 4;
				local72 = arg7[11] << 4;
				local322 = arg7[12] << 4;
				local84 = arg7[13] << 4;
				local89 = arg7[14] << 4;
				if (this.aBoolean81) {
					local478 = arg7[0] * this.anInt989 + arg7[3] * this.anInt985 + arg7[6] * this.anInt990 + 16384 >> 15;
					local503 = arg7[1] * this.anInt989 + arg7[4] * this.anInt985 + arg7[7] * this.anInt990 + 16384 >> 15;
					local528 = arg7[2] * this.anInt989 + arg7[5] * this.anInt985 + arg7[8] * this.anInt990 + 16384 >> 15;
					local478 += local322;
					local503 += local84;
					local528 += local89;
					this.anInt989 = local478;
					this.anInt985 = local503;
					this.anInt990 = local528;
					this.aBoolean81 = false;
				}
				@Pc(555) int[] local555 = new int[9];
				local503 = Class19.anIntArray177[arg2];
				local528 = Class19.anIntArray178[arg2];
				local567 = Class19.anIntArray177[arg3];
				local571 = Class19.anIntArray178[arg3];
				local575 = Class19.anIntArray177[arg4];
				local579 = Class19.anIntArray178[arg4];
				local587 = local528 * local575 + 16384 >> 15;
				local595 = local528 * local579 + 16384 >> 15;
				local555[0] = local567 * local575 + local571 * local595 + 16384 >> 15;
				local555[1] = -local567 * local579 + local571 * local587 + 16384 >> 15;
				local555[2] = local571 * local503 + 16384 >> 15;
				local555[3] = local503 * local579 + 16384 >> 15;
				local555[4] = local503 * local575 + 16384 >> 15;
				local555[5] = -local528;
				local555[6] = -local571 * local575 + local567 * local595 + 16384 >> 15;
				local555[7] = local571 * local579 + local567 * local587 + 16384 >> 15;
				local555[8] = local567 * local503 + 16384 >> 15;
				@Pc(726) int local726 = local555[0] * -this.anInt989 + local555[1] * -this.anInt985 + local555[2] * -this.anInt990 + 16384 >> 15;
				local754 = local555[3] * -this.anInt989 + local555[4] * -this.anInt985 + local555[5] * -this.anInt990 + 16384 >> 15;
				local782 = local555[6] * -this.anInt989 + local555[7] * -this.anInt985 + local555[8] * -this.anInt990 + 16384 >> 15;
				local787 = local726 + this.anInt989;
				@Pc(792) int local792 = local754 + this.anInt985;
				local797 = local782 + this.anInt990;
				@Pc(800) int[] local800 = new int[9];
				for (local802 = 0; local802 < 3; local802++) {
					for (local805 = 0; local805 < 3; local805++) {
						local808 = 0;
						for (local810 = 0; local810 < 3; local810++) {
							local808 += local555[local802 * 3 + local810] * arg7[local805 * 3 + local810];
						}
						local800[local802 * 3 + local805] = local808 + 16384 >> 15;
					}
				}
				local805 = local555[0] * local322 + local555[1] * local84 + local555[2] * local89 + 16384 >> 15;
				local808 = local555[3] * local322 + local555[4] * local84 + local555[5] * local89 + 16384 >> 15;
				local810 = local555[6] * local322 + local555[7] * local84 + local555[8] * local89 + 16384 >> 15;
				local805 += local787;
				local808 += local792;
				local810 += local797;
				local934 = new int[9];
				for (local936 = 0; local936 < 3; local936++) {
					for (local939 = 0; local939 < 3; local939++) {
						local942 = 0;
						for (local944 = 0; local944 < 3; local944++) {
							local942 += arg7[local936 * 3 + local944] * local800[local939 + local944 * 3];
						}
						local934[local936 * 3 + local939] = local942 + 16384 >> 15;
					}
				}
				local939 = arg7[0] * local805 + arg7[1] * local808 + arg7[2] * local810 + 16384 >> 15;
				local942 = arg7[3] * local805 + arg7[4] * local808 + arg7[5] * local810 + 16384 >> 15;
				local944 = arg7[6] * local805 + arg7[7] * local808 + arg7[8] * local810 + 16384 >> 15;
				local939 += local21;
				local942 += local67;
				local944 += local72;
				for (local1067 = 0; local1067 < local2; local1067++) {
					@Pc(1072) int local1072 = arg1[local1067];
					if (local1072 < this.anIntArrayArray10.length) {
						@Pc(1082) int[] local1082 = this.anIntArrayArray10[local1072];
						for (@Pc(1084) int local1084 = 0; local1084 < local1082.length; local1084++) {
							@Pc(1089) int local1089 = local1082[local1084];
							if (this.aShortArray7 == null || (arg6 & this.aShortArray7[local1089]) != 0) {
								@Pc(1130) int local1130 = local934[0] * this.anIntArray68[local1089] + local934[1] * this.anIntArray56[local1089] + local934[2] * this.anIntArray47[local1089] + 16384 >> 15;
								@Pc(1161) int local1161 = local934[3] * this.anIntArray68[local1089] + local934[4] * this.anIntArray56[local1089] + local934[5] * this.anIntArray47[local1089] + 16384 >> 15;
								@Pc(1192) int local1192 = local934[6] * this.anIntArray68[local1089] + local934[7] * this.anIntArray56[local1089] + local934[8] * this.anIntArray47[local1089] + 16384 >> 15;
								@Pc(1196) int local1196 = local1130 + local939;
								@Pc(1200) int local1200 = local1161 + local942;
								@Pc(1204) int local1204 = local1192 + local944;
								this.anIntArray68[local1089] = local1196;
								this.anIntArray56[local1089] = local1200;
								this.anIntArray47[local1089] = local1204;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (local21 = 0; local21 < local2; local21++) {
					local67 = arg1[local21];
					if (local67 < this.anIntArrayArray10.length) {
						local320 = this.anIntArrayArray10[local67];
						for (local322 = 0; local322 < local320.length; local322++) {
							local84 = local320[local322];
							if (this.aShortArray7 == null || (arg6 & this.aShortArray7[local84]) != 0) {
								this.anIntArray68[local84] -= this.anInt989;
								this.anIntArray56[local84] -= this.anInt985;
								this.anIntArray47[local84] -= this.anInt990;
								this.anIntArray68[local84] = this.anIntArray68[local84] * arg2 / 128;
								this.anIntArray56[local84] = this.anIntArray56[local84] * arg3 / 128;
								this.anIntArray47[local84] = this.anIntArray47[local84] * arg4 / 128;
								this.anIntArray68[local84] += this.anInt989;
								this.anIntArray56[local84] += this.anInt985;
								this.anIntArray47[local84] += this.anInt990;
							}
						}
					}
				}
			} else {
				if (!this.aBoolean77) {
					for (local21 = 0; local21 < this.anInt987; local21++) {
						this.anIntArray68[local21] <<= 0x4;
						this.anIntArray56[local21] <<= 0x4;
						this.anIntArray47[local21] <<= 0x4;
					}
					this.aBoolean77 = true;
				}
				local21 = arg7[9] << 4;
				local67 = arg7[10] << 4;
				local72 = arg7[11] << 4;
				local322 = arg7[12] << 4;
				local84 = arg7[13] << 4;
				local89 = arg7[14] << 4;
				if (this.aBoolean81) {
					local478 = arg7[0] * this.anInt989 + arg7[3] * this.anInt985 + arg7[6] * this.anInt990 + 16384 >> 15;
					local503 = arg7[1] * this.anInt989 + arg7[4] * this.anInt985 + arg7[7] * this.anInt990 + 16384 >> 15;
					local528 = arg7[2] * this.anInt989 + arg7[5] * this.anInt985 + arg7[8] * this.anInt990 + 16384 >> 15;
					local478 += local322;
					local503 += local84;
					local528 += local89;
					this.anInt989 = local478;
					this.anInt985 = local503;
					this.anInt990 = local528;
					this.aBoolean81 = false;
				}
				local478 = arg2 << 15 >> 7;
				local503 = arg3 << 15 >> 7;
				local528 = arg4 << 15 >> 7;
				local567 = local478 * -this.anInt989 + 16384 >> 15;
				local571 = local503 * -this.anInt985 + 16384 >> 15;
				local575 = local528 * -this.anInt990 + 16384 >> 15;
				local579 = local567 + this.anInt989;
				local587 = local571 + this.anInt985;
				local595 = local575 + this.anInt990;
				@Pc(1736) int[] local1736 = new int[] { local478 * arg7[0] + 16384 >> 15, local478 * arg7[3] + 16384 >> 15, local478 * arg7[6] + 16384 >> 15, local503 * arg7[1] + 16384 >> 15, local503 * arg7[4] + 16384 >> 15, local503 * arg7[7] + 16384 >> 15, local528 * arg7[2] + 16384 >> 15, local528 * arg7[5] + 16384 >> 15, local528 * arg7[8] + 16384 >> 15 };
				local754 = local478 * local322 + 16384 >> 15;
				local782 = local503 * local84 + 16384 >> 15;
				local787 = local528 * local89 + 16384 >> 15;
				@Pc(1872) int local1872 = local754 + local579;
				@Pc(1876) int local1876 = local782 + local587;
				@Pc(1880) int local1880 = local787 + local595;
				@Pc(1883) int[] local1883 = new int[9];
				@Pc(1888) int local1888;
				for (local797 = 0; local797 < 3; local797++) {
					for (local1888 = 0; local1888 < 3; local1888++) {
						local802 = 0;
						for (local805 = 0; local805 < 3; local805++) {
							local802 += arg7[local797 * 3 + local805] * local1736[local1888 + local805 * 3];
						}
						local1883[local797 * 3 + local1888] = local802 + 16384 >> 15;
					}
				}
				local1888 = arg7[0] * local1872 + arg7[1] * local1876 + arg7[2] * local1880 + 16384 >> 15;
				local802 = arg7[3] * local1872 + arg7[4] * local1876 + arg7[5] * local1880 + 16384 >> 15;
				local805 = arg7[6] * local1872 + arg7[7] * local1876 + arg7[8] * local1880 + 16384 >> 15;
				local1888 += local21;
				local802 += local67;
				local805 += local72;
				for (local808 = 0; local808 < local2; local808++) {
					local810 = arg1[local808];
					if (local810 < this.anIntArrayArray10.length) {
						local934 = this.anIntArrayArray10[local810];
						for (local936 = 0; local936 < local934.length; local936++) {
							local939 = local934[local936];
							if (this.aShortArray7 == null || (arg6 & this.aShortArray7[local939]) != 0) {
								local942 = local1883[0] * this.anIntArray68[local939] + local1883[1] * this.anIntArray56[local939] + local1883[2] * this.anIntArray47[local939] + 16384 >> 15;
								local944 = local1883[3] * this.anIntArray68[local939] + local1883[4] * this.anIntArray56[local939] + local1883[5] * this.anIntArray47[local939] + 16384 >> 15;
								local1067 = local1883[6] * this.anIntArray68[local939] + local1883[7] * this.anIntArray56[local939] + local1883[8] * this.anIntArray47[local939] + 16384 >> 15;
								@Pc(2145) int local2145 = local942 + local1888;
								@Pc(2149) int local2149 = local944 + local802;
								@Pc(2153) int local2153 = local1067 + local805;
								this.anIntArray68[local939] = local2145;
								this.anIntArray56[local939] = local2149;
								this.anIntArray47[local939] = local2153;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray12 != null && this.aByteArray11 != null) {
				for (local21 = 0; local21 < local2; local21++) {
					local67 = arg1[local21];
					if (local67 < this.anIntArrayArray12.length) {
						local320 = this.anIntArrayArray12[local67];
						for (local322 = 0; local322 < local320.length; local322++) {
							local84 = local320[local322];
							if (this.aShortArray9 == null || (arg6 & this.aShortArray9[local84]) != 0) {
								local89 = (this.aByteArray11[local84] & 0xFF) + arg2 * 8;
								if (local89 < 0) {
									local89 = 0;
								} else if (local89 > 255) {
									local89 = 255;
								}
								this.aByteArray11[local84] = (byte) local89;
							}
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray12 != null) {
			for (local21 = 0; local21 < local2; local21++) {
				local67 = arg1[local21];
				if (local67 < this.anIntArrayArray12.length) {
					local320 = this.anIntArrayArray12[local67];
					for (local322 = 0; local322 < local320.length; local322++) {
						local84 = local320[local322];
						if (this.aShortArray9 == null || (arg6 & this.aShortArray9[local84]) != 0) {
							local89 = this.aShortArray8[local84] & 0xFFFF;
							local478 = local89 >> 10 & 0x3F;
							local503 = local89 >> 7 & 0x7;
							local528 = local89 & 0x7F;
							@Pc(2461) int local2461 = local478 + arg2 & 0x3F;
							local503 += arg3;
							if (local503 < 0) {
								local503 = 0;
							} else if (local503 > 7) {
								local503 = 7;
							}
							local528 += arg4;
							if (local528 < 0) {
								local528 = 0;
							} else if (local528 > 127) {
								local528 = 127;
							}
							this.aShortArray8[local84] = (short) (local2461 << 10 | local503 << 7 | local528);
						}
					}
					this.aBoolean80 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "()I")
	@Override
	public int method3805() {
		return this.anInt982;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Ljava/lang/Thread;)V")
	private void method1244(@OriginalArg(0) Thread arg0) {
		@Pc(4) Class250 local4 = this.aClass19_Sub2_3.method2905(arg0);
		if (local4 == this.aClass250_1) {
			return;
		}
		this.aClass250_1 = local4;
		this.aClass31_Sub1_1 = this.aClass250_1.aClass31_Sub1_11;
		this.aClass31_Sub1_5 = this.aClass250_1.aClass31_Sub1_14;
		this.aClass31_Sub1_4 = this.aClass250_1.aClass31_Sub1_9;
		this.aClass31_Sub1_8 = this.aClass250_1.aClass31_Sub1_13;
		this.aClass31_Sub1_7 = this.aClass250_1.aClass31_Sub1_10;
		this.aClass31_Sub1_6 = this.aClass250_1.aClass31_Sub1_15;
		this.aClass31_Sub1_3 = this.aClass250_1.aClass31_Sub1_12;
		this.aClass31_Sub1_2 = this.aClass250_1.aClass31_Sub1_16;
	}

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "()I")
	@Override
	public int method3822() {
		if (!this.aBoolean79) {
			this.method1251();
		}
		return this.aShort4;
	}

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "(I)I")
	private int method1245(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "()V")
	private void method1246() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt987; local1++) {
			@Pc(7) int local7 = this.anIntArray68[local1];
			this.anIntArray68[local1] = this.anIntArray47[local1];
			this.anIntArray47[local1] = -local7;
		}
		this.method1261();
	}

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "()V")
	private void method1247() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt987; local1++) {
			@Pc(7) int local7 = this.anIntArray47[local1];
			this.anIntArray47[local1] = this.anIntArray68[local1];
			this.anIntArray68[local1] = -local7;
		}
		this.method1261();
	}

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "()I")
	@Override
	public int method3826() {
		return this.anInt983;
	}

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "()I")
	@Override
	public int method3827() {
		return this.anInt984;
	}

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "()V")
	private void method1248() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt981; local1++) {
			this.anIntArray68[local1] = -this.anIntArray68[local1];
			this.anIntArray47[local1] = -this.anIntArray47[local1];
			if (this.aClass26Array2[local1] != null) {
				this.aClass26Array2[local1].anInt733 = -this.aClass26Array2[local1].anInt733;
				this.aClass26Array2[local1].anInt731 = -this.aClass26Array2[local1].anInt731;
			}
		}
		@Pc(57) int local57;
		if (this.aClass234Array1 != null) {
			for (local57 = 0; local57 < this.anInt986; local57++) {
				if (this.aClass234Array1[local57] != null) {
					this.aClass234Array1[local57].anInt6564 = -this.aClass234Array1[local57].anInt6564;
					this.aClass234Array1[local57].anInt6563 = -this.aClass234Array1[local57].anInt6563;
				}
			}
		}
		for (local57 = this.anInt981; local57 < this.anInt987; local57++) {
			this.anIntArray68[local57] = -this.anIntArray68[local57];
			this.anIntArray47[local57] = -this.anIntArray47[local57];
		}
		this.anInt979 = 0;
		this.aBoolean79 = false;
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)V")
	@Override
	public void method3833(@OriginalArg(0) int arg0) {
		if ((this.anInt984 & 0x5) != 5) {
			throw new IllegalStateException();
		} else if (arg0 == 4096) {
			this.method1246();
		} else if (arg0 == 8192) {
			this.method1239();
		} else if (arg0 == 12288) {
			this.method1247();
		} else {
			@Pc(31) int local31 = Class19.anIntArray178[arg0];
			@Pc(35) int local35 = Class19.anIntArray177[arg0];
			for (@Pc(37) int local37 = 0; local37 < this.anInt987; local37++) {
				@Pc(54) int local54 = this.anIntArray47[local37] * local31 + this.anIntArray68[local37] * local35 >> 15;
				this.anIntArray47[local37] = this.anIntArray47[local37] * local35 - this.anIntArray68[local37] * local31 >> 15;
				this.anIntArray68[local37] = local54;
			}
			this.method1261();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
	@Override
	public void method3813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 != 0 && (this.anInt984 & 0x1) != 1) {
			throw new IllegalStateException();
		} else if (arg1 != 0 && (this.anInt984 & 0x2) != 2) {
			throw new IllegalStateException();
		} else if (arg2 == 0 || (this.anInt984 & 0x4) == 4) {
			for (@Pc(37) int local37 = 0; local37 < this.anInt987; local37++) {
				this.anIntArray68[local37] += arg0;
				this.anIntArray56[local37] += arg1;
				this.anIntArray47[local37] += arg2;
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIII)V")
	@Override
	protected void method3825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(14) int local14;
		if (arg0 == 0) {
			local3 = 0;
			this.anInt989 = 0;
			this.anInt985 = 0;
			this.anInt990 = 0;
			for (local14 = 0; local14 < this.anInt987; local14++) {
				this.anInt989 += this.anIntArray68[local14];
				this.anInt985 += this.anIntArray56[local14];
				this.anInt990 += this.anIntArray47[local14];
				local3++;
			}
			if (local3 > 0) {
				this.anInt989 = this.anInt989 / local3 + arg1;
				this.anInt985 = this.anInt985 / local3 + arg2;
				this.anInt990 = this.anInt990 / local3 + arg3;
			} else {
				this.anInt989 = arg1;
				this.anInt985 = arg2;
				this.anInt990 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt987; local3++) {
				this.anIntArray68[local3] += arg1;
				this.anIntArray56[local3] += arg2;
				this.anIntArray47[local3] += arg3;
			}
		} else {
			@Pc(164) int local164;
			@Pc(182) int local182;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt987; local3++) {
					this.anIntArray68[local3] -= this.anInt989;
					this.anIntArray56[local3] -= this.anInt985;
					this.anIntArray47[local3] -= this.anInt990;
					if (arg3 != 0) {
						local14 = Class19.anIntArray178[arg3];
						local164 = Class19.anIntArray177[arg3];
						local182 = this.anIntArray56[local3] * local14 + this.anIntArray68[local3] * local164 + 32767 >> 15;
						this.anIntArray56[local3] = this.anIntArray56[local3] * local164 + 32767 - this.anIntArray68[local3] * local14 >> 15;
						this.anIntArray68[local3] = local182;
					}
					if (arg1 != 0) {
						local14 = Class19.anIntArray178[arg1];
						local164 = Class19.anIntArray177[arg1];
						local182 = this.anIntArray56[local3] * local164 + 32767 - this.anIntArray47[local3] * local14 >> 15;
						this.anIntArray47[local3] = this.anIntArray56[local3] * local14 + this.anIntArray47[local3] * local164 + 32767 >> 15;
						this.anIntArray56[local3] = local182;
					}
					if (arg2 != 0) {
						local14 = Class19.anIntArray178[arg2];
						local164 = Class19.anIntArray177[arg2];
						local182 = this.anIntArray47[local3] * local14 + this.anIntArray68[local3] * local164 + 32767 >> 15;
						this.anIntArray47[local3] = this.anIntArray47[local3] * local164 + 32767 - this.anIntArray68[local3] * local14 >> 15;
						this.anIntArray68[local3] = local182;
					}
					this.anIntArray68[local3] += this.anInt989;
					this.anIntArray56[local3] += this.anInt985;
					this.anIntArray47[local3] += this.anInt990;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt987; local3++) {
					this.anIntArray68[local3] -= this.anInt989;
					this.anIntArray56[local3] -= this.anInt985;
					this.anIntArray47[local3] -= this.anInt990;
					this.anIntArray68[local3] = this.anIntArray68[local3] * arg1 / 128;
					this.anIntArray56[local3] = this.anIntArray56[local3] * arg2 / 128;
					this.anIntArray47[local3] = this.anIntArray47[local3] * arg3 / 128;
					this.anIntArray68[local3] += this.anInt989;
					this.anIntArray56[local3] += this.anInt985;
					this.anIntArray47[local3] += this.anInt990;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt986; local3++) {
					local14 = (this.aByteArray11[local3] & 0xFF) + arg1 * 8;
					if (local14 < 0) {
						local14 = 0;
					} else if (local14 > 255) {
						local14 = 255;
					}
					this.aByteArray11[local3] = (byte) local14;
				}
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt986; local3++) {
					local14 = this.aShortArray8[local3] & 0xFFFF;
					local164 = local14 >> 10 & 0x3F;
					local182 = local14 >> 7 & 0x7;
					@Pc(519) int local519 = local14 & 0x7F;
					@Pc(525) int local525 = local164 + arg1 & 0x3F;
					local182 += arg2;
					if (local182 < 0) {
						local182 = 0;
					} else if (local182 > 7) {
						local182 = 7;
					}
					local519 += arg3;
					if (local519 < 0) {
						local519 = 0;
					} else if (local519 > 127) {
						local519 = 127;
					}
					this.aShortArray8[local3] = (short) (local525 << 10 | local182 << 7 | local519);
				}
				this.aBoolean80 = true;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "()I")
	@Override
	public int method3831() {
		if (!this.aBoolean79) {
			this.method1251();
		}
		return this.aShort5;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!gn;IIIZ)V")
	@Override
	public void method3803(@OriginalArg(0) Model arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) SoftwareModel local2 = (SoftwareModel) arg0;
		if ((this.anInt984 & 0x8000) != 32768) {
			throw new IllegalStateException("");
		} else if ((local2.anInt984 & 0x8000) == 32768) {
			this.method1242(Thread.currentThread());
			this.method1251();
			this.method1252();
			local2.method1251();
			local2.method1252();
			Static38.anInt988++;
			@Pc(41) int local41 = 0;
			@Pc(44) int[] local44 = local2.anIntArray68;
			@Pc(47) int local47 = local2.anInt981;
			@Pc(65) int local65;
			for (@Pc(49) int local49 = 0; local49 < this.anInt981; local49++) {
				@Pc(55) Class26 local55 = this.aClass26Array2[local49];
				if (local55.anInt732 != 0) {
					local65 = this.anIntArray56[local49] - arg2;
					if (local65 >= local2.aShort2 && local65 <= local2.aShort6) {
						@Pc(81) int local81 = this.anIntArray68[local49] - arg1;
						if (local81 >= local2.aShort8 && local81 <= local2.aShort4) {
							@Pc(97) int local97 = this.anIntArray47[local49] - arg3;
							if (local97 >= local2.aShort7 && local97 <= local2.aShort3) {
								for (@Pc(108) int local108 = 0; local108 < local47; local108++) {
									@Pc(114) Class26 local114 = local2.aClass26Array2[local108];
									if (local81 == local44[local108] && local97 == local2.anIntArray47[local108] && local65 == local2.anIntArray56[local108] && local114.anInt732 != 0) {
										if (this.aClass26Array1 == null) {
											this.aClass26Array1 = new Class26[this.anInt981];
										}
										if (local2.aClass26Array1 == null) {
											local2.aClass26Array1 = new Class26[local47];
										}
										@Pc(154) Class26 local154 = this.aClass26Array1[local49];
										if (local154 == null) {
											local154 = this.aClass26Array1[local49] = new Class26(local55);
										}
										@Pc(171) Class26 local171 = local2.aClass26Array1[local108];
										if (local171 == null) {
											local171 = local2.aClass26Array1[local108] = new Class26(local114);
										}
										local154.anInt733 += local114.anInt733;
										local154.anInt730 += local114.anInt730;
										local154.anInt731 += local114.anInt731;
										local154.anInt732 += local114.anInt732;
										local171.anInt733 += local55.anInt733;
										local171.anInt730 += local55.anInt730;
										local171.anInt731 += local55.anInt731;
										local171.anInt732 += local55.anInt732;
										local41++;
										this.anIntArray57[local49] = Static38.anInt988;
										this.anIntArray53[local108] = Static38.anInt988;
									}
								}
							}
						}
					}
				}
			}
			if (local41 >= 3 && arg4) {
				for (@Pc(267) int local267 = 0; local267 < this.anInt986; local267++) {
					if (this.anIntArray57[this.aShortArray10[local267]] == Static38.anInt988 && this.anIntArray57[this.aShortArray5[local267]] == Static38.anInt988 && this.anIntArray57[this.aShortArray6[local267]] == Static38.anInt988) {
						if (this.aByteArray10 == null) {
							this.aByteArray10 = new byte[this.anInt986];
						}
						this.aByteArray10[local267] = 2;
					}
				}
				for (local65 = 0; local65 < local2.anInt986; local65++) {
					if (this.anIntArray53[local2.aShortArray10[local65]] == Static38.anInt988 && this.anIntArray53[local2.aShortArray5[local65]] == Static38.anInt988 && this.anIntArray53[local2.aShortArray6[local65]] == Static38.anInt988) {
						if (local2.aByteArray10 == null) {
							local2.aByteArray10 = new byte[local2.anInt986];
						}
						local2.aByteArray10[local65] = 2;
					}
				}
			}
		} else {
			throw new IllegalStateException("");
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!on;Lclient!au;Lclient!tp;I)V")
	public void method1249(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(2) Class224 arg2, @OriginalArg(3) int arg3) {
		this.method1240(arg0, arg1, arg2, -1, arg3);
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "()I")
	@Override
	public int method3802() {
		if (!this.aBoolean79) {
			this.method1251();
		}
		return this.aShort2;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(SS)V")
	@Override
	public void method3838(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt986; local1++) {
			if (this.aShortArray8[local1] == arg0) {
				this.aShortArray8[local1] = arg1;
			}
		}
		if (this.anInt979 == 2) {
			this.anInt979 = 1;
		}
	}

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "()I")
	@Override
	public int method3832() {
		if (!this.aBoolean79) {
			this.method1251();
		}
		return this.aShort3;
	}

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "(I)V")
	private void method1250(@OriginalArg(0) int arg0) {
		if (this.aBooleanArray9[arg0]) {
			this.method1237(arg0);
			return;
		}
		@Pc(13) short local13 = this.aShortArray10[arg0];
		@Pc(18) short local18 = this.aShortArray5[arg0];
		@Pc(23) short local23 = this.aShortArray6[arg0];
		this.aClass81_1.textX = this.aBooleanArray8[arg0];
		if (this.aByteArray11 == null) {
			this.aClass81_1.anInt2264 = 0;
		} else {
			this.aClass81_1.anInt2264 = this.aByteArray11[arg0] & 0xFF;
		}
		if (this.aShortArray11 != null && this.aShortArray11[arg0] != -1) {
			@Pc(165) int local165;
			@Pc(170) int local170;
			@Pc(175) int local175;
			if (this.aByteArray9 == null || this.aByteArray9[arg0] == -1) {
				local165 = local13;
				local170 = local18;
				local175 = local23;
			} else {
				@Pc(160) int local160 = this.aByteArray9[arg0] & 0xFF;
				local165 = this.anIntArray43[local160];
				local170 = this.anIntArray46[local160];
				local175 = this.anIntArray62[local160];
			}
			if (this.anIntArray52[arg0] == -1) {
				this.aClass81_1.method2288(this.anIntArray63[local13], this.anIntArray63[local18], this.anIntArray63[local23], this.anIntArray60[local13], this.anIntArray60[local18], this.anIntArray60[local23], this.anIntArray76[arg0], this.anIntArray76[arg0], this.anIntArray76[arg0], this.anIntArray51[local165], this.anIntArray51[local170], this.anIntArray51[local175], this.anIntArray64[local165], this.anIntArray64[local170], this.anIntArray64[local175], this.anIntArray61[local165], this.anIntArray61[local170], this.anIntArray61[local175], this.aShortArray11[arg0]);
			} else {
				this.aClass81_1.method2288(this.anIntArray63[local13], this.anIntArray63[local18], this.anIntArray63[local23], this.anIntArray60[local13], this.anIntArray60[local18], this.anIntArray60[local23], this.anIntArray76[arg0], this.anIntArray74[arg0], this.anIntArray52[arg0], this.anIntArray51[local165], this.anIntArray51[local170], this.anIntArray51[local175], this.anIntArray64[local165], this.anIntArray64[local170], this.anIntArray64[local175], this.anIntArray61[local165], this.anIntArray61[local170], this.anIntArray61[local175], this.aShortArray11[arg0]);
			}
		} else if (this.anIntArray52[arg0] == -1) {
			this.aClass81_1.method2282(this.anIntArray63[local13], this.anIntArray63[local18], this.anIntArray63[local23], this.anIntArray60[local13], this.anIntArray60[local18], this.anIntArray60[local23], Static181.anIntArray204[this.anIntArray76[arg0] & 0xFFFF]);
		} else {
			this.aClass81_1.method2286(this.anIntArray63[local13], this.anIntArray63[local18], this.anIntArray63[local23], this.anIntArray60[local13], this.anIntArray60[local18], this.anIntArray60[local23], this.anIntArray76[arg0] & 0xFFFF, this.anIntArray74[arg0] & 0xFFFF, this.anIntArray52[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "()V")
	private void method1251() {
		if (this.aBoolean79) {
			return;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = 32767;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = -32768;
		for (@Pc(21) int local21 = 0; local21 < this.anInt981; local21++) {
			@Pc(27) int local27 = this.anIntArray68[local21];
			@Pc(32) int local32 = this.anIntArray56[local21];
			@Pc(37) int local37 = this.anIntArray47[local21];
			if (local27 < local9) {
				local9 = local27;
			}
			if (local27 > local15) {
				local15 = local27;
			}
			if (local32 < local11) {
				local11 = local32;
			}
			if (local32 > local17) {
				local17 = local32;
			}
			if (local37 < local13) {
				local13 = local37;
			}
			if (local37 > local19) {
				local19 = local37;
			}
			@Pc(75) int local75 = local27 * local27 + local37 * local37;
			if (local75 > local5) {
				local5 = local75;
			}
			local75 += local32 * local32;
			if (local75 > local7) {
				local7 = local75;
			}
		}
		this.aShort8 = (short) local9;
		this.aShort4 = (short) local15;
		this.aShort2 = (short) local11;
		this.aShort6 = (short) local17;
		this.aShort7 = (short) local13;
		this.aShort3 = (short) local19;
		this.aShort5 = (short) (Math.sqrt((double) local5) + 0.99D);
		Math.sqrt((double) local7);
		this.aBoolean79 = true;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)V")
	@Override
	public void method3842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 != 128 && (this.anInt984 & 0x1) != 1) {
			throw new IllegalStateException();
		} else if (arg1 != 128 && (this.anInt984 & 0x2) != 2) {
			throw new IllegalStateException();
		} else if (arg2 == 128 || (this.anInt984 & 0x4) == 4) {
			for (@Pc(40) int local40 = 0; local40 < this.anInt987; local40++) {
				this.anIntArray68[local40] = this.anIntArray68[local40] * arg0 >> 7;
				this.anIntArray56[local40] = this.anIntArray56[local40] * arg1 >> 7;
				this.anIntArray47[local40] = this.anIntArray47[local40] * arg2 >> 7;
			}
			this.aBoolean79 = false;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "()Z")
	@Override
	protected boolean method3804() {
		if (this.anIntArrayArray10 == null) {
			return false;
		} else {
			this.anInt989 = 0;
			this.anInt985 = 0;
			this.anInt990 = 0;
			return true;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILclient!tf;Lclient!tf;III)V")
	@Override
	public void method3819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) Class6 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == 3) {
			if ((this.anInt984 & 0x7) != 7) {
				throw new IllegalStateException();
			}
		} else if ((this.anInt984 & 0x2) != 2) {
			throw new IllegalStateException();
		}
		if (!this.aBoolean79) {
			this.method1251();
		}
		@Pc(32) int local32 = arg4 + this.aShort8;
		@Pc(37) int local37 = arg4 + this.aShort4;
		@Pc(42) int local42 = arg6 + this.aShort7;
		@Pc(47) int local47 = arg6 + this.aShort3;
		if (arg0 != 4 && (local32 < 0 || local37 + 128 >> 7 >= arg2.anInt6320 || local42 < 0 || local47 + 128 >> 7 >= arg2.anInt6319)) {
			return;
		}
		@Pc(75) int[][] local75 = ((Class6_Sub2) arg2).anIntArrayArray54;
		@Pc(77) int[][] local77 = null;
		if (arg3 != null) {
			local77 = ((Class6_Sub2) arg3).anIntArrayArray54;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local32 < 0 || local37 + 128 >> 7 >= arg3.anInt6320 || local42 < 0 || local47 + 128 >> 7 >= arg3.anInt6319) {
				return;
			}
		} else {
			local32 >>= 0x7;
			local37 = local37 + 127 >> 7;
			local42 >>= 0x7;
			local47 = local47 + 127 >> 7;
			if (local75[local32][local42] == arg5 && local75[local37][local42] == arg5 && local75[local32][local47] == arg5 && local75[local37][local47] == arg5) {
				return;
			}
		}
		@Pc(167) int local167;
		@Pc(175) int local175;
		@Pc(182) int local182;
		@Pc(186) int local186;
		@Pc(190) int local190;
		@Pc(194) int local194;
		@Pc(198) int local198;
		@Pc(220) int local220;
		@Pc(246) int local246;
		@Pc(258) int local258;
		@Pc(388) int local388;
		if (arg0 == 1) {
			for (local167 = 0; local167 < this.anInt981; local167++) {
				local175 = this.anIntArray68[local167] + arg4;
				local182 = this.anIntArray47[local167] + arg6;
				local186 = local175 & 0x7F;
				local190 = local182 & 0x7F;
				local194 = local175 >> 7;
				local198 = local182 >> 7;
				local220 = local75[local194][local198] * (128 - local186) + local75[local194 + 1][local198] * local186 >> 7;
				local246 = local75[local194][local198 + 1] * (128 - local186) + local75[local194 + 1][local198 + 1] * local186 >> 7;
				local258 = local220 * (128 - local190) + local246 * local190 >> 7;
				this.anIntArray56[local167] = this.anIntArray56[local167] + local258 - arg5;
			}
			for (local175 = this.anInt981; local175 < this.anInt987; local175++) {
				local182 = this.anIntArray68[local175] + arg4;
				local186 = this.anIntArray47[local175] + arg6;
				local190 = local182 & 0x7F;
				local194 = local186 & 0x7F;
				local198 = local182 >> 7;
				local220 = local186 >> 7;
				if (local198 >= 0 && local198 < local75.length - 1 && local220 >= 0 && local220 < local75[0].length - 1) {
					local246 = local75[local198][local220] * (128 - local190) + local75[local198 + 1][local220] * local190 >> 7;
					local258 = local75[local198][local220 + 1] * (128 - local190) + local75[local198 + 1][local220 + 1] * local190 >> 7;
					local388 = local246 * (128 - local194) + local258 * local194 >> 7;
					this.anIntArray56[local175] = this.anIntArray56[local175] + local388 - arg5;
				}
			}
		} else {
			@Pc(671) int local671;
			if (arg0 == 2) {
				for (local167 = 0; local167 < this.anInt981; local167++) {
					local175 = (this.anIntArray56[local167] << 16) / this.aShort2;
					if (local175 < arg1) {
						local182 = this.anIntArray68[local167] + arg4;
						local186 = this.anIntArray47[local167] + arg6;
						local190 = local182 & 0x7F;
						local194 = local186 & 0x7F;
						local198 = local182 >> 7;
						local220 = local186 >> 7;
						local246 = local75[local198][local220] * (128 - local190) + local75[local198 + 1][local220] * local190 >> 7;
						local258 = local75[local198][local220 + 1] * (128 - local190) + local75[local198 + 1][local220 + 1] * local190 >> 7;
						local388 = local246 * (128 - local194) + local258 * local194 >> 7;
						this.anIntArray56[local167] += (local388 - arg5) * (arg1 - local175) / arg1;
					} else {
						this.anIntArray56[local167] = this.anIntArray56[local167];
					}
				}
				for (local175 = this.anInt981; local175 < this.anInt987; local175++) {
					local182 = (this.anIntArray56[local175] << 16) / this.aShort2;
					if (local182 < arg1) {
						local186 = this.anIntArray68[local175] + arg4;
						local190 = this.anIntArray47[local175] + arg6;
						local194 = local186 & 0x7F;
						local198 = local190 & 0x7F;
						local220 = local186 >> 7;
						local246 = local190 >> 7;
						if (local220 >= 0 && local220 < arg2.anInt6320 - 1 && local246 >= 0 && local246 < arg2.anInt6319 - 1) {
							local258 = local75[local220][local246] * (128 - local194) + local75[local220 + 1][local246] * local194 >> 7;
							local388 = local75[local220][local246 + 1] * (128 - local194) + local75[local220 + 1][local246 + 1] * local194 >> 7;
							local671 = local258 * (128 - local198) + local388 * local198 >> 7;
							this.anIntArray56[local175] += (local671 - arg5) * (arg1 - local182) / arg1;
						}
					} else {
						this.anIntArray56[local175] = this.anIntArray56[local175];
					}
				}
			} else if (arg0 == 3) {
				local167 = (arg1 & 0xFF) * 4;
				local175 = (arg1 >> 8 & 0xFF) * 4;
				if (arg4 - (local167 >> 1) < 0 || arg4 + (local167 >> 1) + 128 >= arg2.anInt6320 || arg6 - (local175 >> 1) < 0 || arg6 + (local175 >> 1) + 128 >= arg2.anInt6319) {
					return;
				}
				this.method3848(local167, arg6, local175, arg5, arg2, arg4);
			} else if (arg0 == 4) {
				local167 = this.aShort6 - this.aShort2;
				for (local175 = 0; local175 < this.anInt981; local175++) {
					local182 = this.anIntArray68[local175] + arg4;
					local186 = this.anIntArray47[local175] + arg6;
					local190 = local182 & 0x7F;
					local194 = local186 & 0x7F;
					local198 = local182 >> 7;
					local220 = local186 >> 7;
					local246 = local77[local198][local220] * (128 - local190) + local77[local198 + 1][local220] * local190 >> 7;
					local258 = local77[local198][local220 + 1] * (128 - local190) + local77[local198 + 1][local220 + 1] * local190 >> 7;
					local388 = local246 * (128 - local194) + local258 * local194 >> 7;
					this.anIntArray56[local175] = this.anIntArray56[local175] + local388 + local167 - arg5;
				}
				for (local182 = this.anInt981; local182 < this.anInt987; local182++) {
					local186 = this.anIntArray68[local182] + arg4;
					local190 = this.anIntArray47[local182] + arg6;
					local194 = local186 & 0x7F;
					local198 = local190 & 0x7F;
					local220 = local186 >> 7;
					local246 = local190 >> 7;
					if (local220 >= 0 && local220 < arg3.anInt6320 - 1 && local246 >= 0 && local246 < arg3.anInt6319 - 1) {
						local258 = local77[local220][local246] * (128 - local194) + local77[local220 + 1][local246] * local194 >> 7;
						local388 = local77[local220][local246 + 1] * (128 - local194) + local77[local220 + 1][local246 + 1] * local194 >> 7;
						local671 = local258 * (128 - local198) + local388 * local198 >> 7;
						this.anIntArray56[local182] = this.anIntArray56[local182] + local671 + local167 - arg5;
					}
				}
			} else if (arg0 == 5) {
				local167 = this.aShort6 - this.aShort2;
				@Pc(1182) int local1182;
				for (local175 = 0; local175 < this.anInt981; local175++) {
					local182 = this.anIntArray68[local175] + arg4;
					local186 = this.anIntArray47[local175] + arg6;
					local190 = local182 & 0x7F;
					local194 = local186 & 0x7F;
					local198 = local182 >> 7;
					local220 = local186 >> 7;
					local246 = local75[local198][local220] * (128 - local190) + local75[local198 + 1][local220] * local190 >> 7;
					local258 = local75[local198][local220 + 1] * (128 - local190) + local75[local198 + 1][local220 + 1] * local190 >> 7;
					local388 = local246 * (128 - local194) + local258 * local194 >> 7;
					local246 = local77[local198][local220] * (128 - local190) + local77[local198 + 1][local220] * local190 >> 7;
					local258 = local77[local198][local220 + 1] * (128 - local190) + local77[local198 + 1][local220 + 1] * local190 >> 7;
					local671 = local246 * (128 - local194) + local258 * local194 >> 7;
					local1182 = local388 - local671;
					this.anIntArray56[local175] = ((this.anIntArray56[local175] << 8) / local167 * local1182 >> 8) - (arg5 - local388);
				}
				for (local182 = this.anInt981; local182 < this.anInt987; local182++) {
					local186 = this.anIntArray68[local182] + arg4;
					local190 = this.anIntArray47[local182] + arg6;
					local194 = local186 & 0x7F;
					local198 = local190 & 0x7F;
					local220 = local186 >> 7;
					local246 = local190 >> 7;
					if (local220 >= 0 && local220 < arg2.anInt6320 - 1 && local220 < arg3.anInt6320 - 1 && local246 >= 0 && local246 < arg2.anInt6319 - 1 && local246 < arg3.anInt6319 - 1) {
						local258 = local75[local220][local246] * (128 - local194) + local75[local220 + 1][local246] * local194 >> 7;
						local388 = local75[local220][local246 + 1] * (128 - local194) + local75[local220 + 1][local246 + 1] * local194 >> 7;
						local671 = local258 * (128 - local198) + local388 * local198 >> 7;
						local258 = local77[local220][local246] * (128 - local194) + local77[local220 + 1][local246] * local194 >> 7;
						local388 = local77[local220][local246 + 1] * (128 - local194) + local77[local220 + 1][local246 + 1] * local194 >> 7;
						local1182 = local258 * (128 - local198) + local388 * local198 >> 7;
						@Pc(1394) int local1394 = local671 - local1182;
						this.anIntArray56[local182] = ((this.anIntArray56[local182] << 8) / local167 * local1394 >> 8) - (arg5 - local671);
					}
				}
			}
		}
		this.aBoolean79 = false;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!kb;)Lclient!kb;")
	@Override
	public Class2_Sub2_Sub4 method3839(@OriginalArg(0) Class2_Sub2_Sub4 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!on;Lclient!au;I)V")
	@Override
	public void method3835(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(2) int arg2) {
		this.method1240(arg0, arg1, null, -1, arg2);
	}

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "()V")
	private void method1252() {
		if (this.anInt979 != 0 || this.aClass26Array2 != null) {
			return;
		}
		this.aClass26Array2 = new Class26[this.anInt981];
		for (@Pc(13) int local13 = 0; local13 < this.anInt981; local13++) {
			this.aClass26Array2[local13] = new Class26();
		}
		for (@Pc(28) int local28 = 0; local28 < this.anInt986; local28++) {
			@Pc(34) short local34 = this.aShortArray10[local28];
			@Pc(39) short local39 = this.aShortArray5[local28];
			@Pc(44) short local44 = this.aShortArray6[local28];
			@Pc(54) int local54 = this.anIntArray68[local39] - this.anIntArray68[local34];
			@Pc(64) int local64 = this.anIntArray56[local39] - this.anIntArray56[local34];
			@Pc(74) int local74 = this.anIntArray47[local39] - this.anIntArray47[local34];
			@Pc(84) int local84 = this.anIntArray68[local44] - this.anIntArray68[local34];
			@Pc(94) int local94 = this.anIntArray56[local44] - this.anIntArray56[local34];
			@Pc(104) int local104 = this.anIntArray47[local44] - this.anIntArray47[local34];
			@Pc(112) int local112 = local64 * local104 - local94 * local74;
			@Pc(120) int local120 = local74 * local84 - local104 * local54;
			@Pc(128) int local128;
			for (local128 = local54 * local94 - local84 * local64; local112 > 8192 || local120 > 8192 || local128 > 8192 || local112 < -8192 || local120 < -8192 || local128 < -8192; local128 >>= 0x1) {
				local112 >>= 0x1;
				local120 >>= 0x1;
			}
			@Pc(174) int local174 = (int) Math.sqrt((double) (local112 * local112 + local120 * local120 + local128 * local128));
			if (local174 <= 0) {
				local174 = 1;
			}
			local112 = local112 * 256 / local174;
			local120 = local120 * 256 / local174;
			local128 = local128 * 256 / local174;
			@Pc(201) byte local201;
			if (this.aByteArray10 == null) {
				local201 = 0;
			} else {
				local201 = this.aByteArray10[local28];
			}
			if (local201 == 0) {
				@Pc(214) Class26 local214 = this.aClass26Array2[local34];
				local214.anInt733 += local112;
				local214.anInt730 += local120;
				local214.anInt731 += local128;
				local214.anInt732++;
				@Pc(243) Class26 local243 = this.aClass26Array2[local39];
				local243.anInt733 += local112;
				local243.anInt730 += local120;
				local243.anInt731 += local128;
				local243.anInt732++;
				@Pc(272) Class26 local272 = this.aClass26Array2[local44];
				local272.anInt733 += local112;
				local272.anInt730 += local120;
				local272.anInt731 += local128;
				local272.anInt732++;
			} else if (local201 == 1) {
				if (this.aClass234Array1 == null) {
					this.aClass234Array1 = new Class234[this.anInt986];
				}
				@Pc(317) Class234 local317 = this.aClass234Array1[local28] = new Class234();
				local317.anInt6564 = local112;
				local317.anInt6562 = local120;
				local317.anInt6563 = local128;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILclient!on;Z)Z")
	@Override
	public boolean method3820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) boolean arg3) {
		this.aClass14_Sub1_1 = (Class14_Sub1) arg2;
		@Pc(7) Class14_Sub1 local7 = this.aClass19_Sub2_3.aClass14_Sub1_2;
		@Pc(33) int local33 = local7.anInt498 + (local7.anInt505 * this.aClass14_Sub1_1.anInt498 + local7.anInt500 * this.aClass14_Sub1_1.anInt496 + local7.anInt497 * this.aClass14_Sub1_1.anInt501 >> 15);
		@Pc(59) int local59 = local7.anInt496 + (local7.anInt507 * this.aClass14_Sub1_1.anInt498 + local7.anInt506 * this.aClass14_Sub1_1.anInt496 + local7.anInt499 * this.aClass14_Sub1_1.anInt501 >> 15);
		@Pc(85) int local85 = local7.anInt501 + (local7.anInt504 * this.aClass14_Sub1_1.anInt498 + local7.anInt502 * this.aClass14_Sub1_1.anInt496 + local7.anInt503 * this.aClass14_Sub1_1.anInt501 >> 15);
		@Pc(108) int local108 = local7.anInt505 * this.aClass14_Sub1_1.anInt505 + local7.anInt500 * this.aClass14_Sub1_1.anInt507 + local7.anInt497 * this.aClass14_Sub1_1.anInt504 >> 15;
		@Pc(131) int local131 = local7.anInt505 * this.aClass14_Sub1_1.anInt500 + local7.anInt500 * this.aClass14_Sub1_1.anInt506 + local7.anInt497 * this.aClass14_Sub1_1.anInt502 >> 15;
		@Pc(154) int local154 = local7.anInt505 * this.aClass14_Sub1_1.anInt497 + local7.anInt500 * this.aClass14_Sub1_1.anInt499 + local7.anInt497 * this.aClass14_Sub1_1.anInt503 >> 15;
		@Pc(177) int local177 = local7.anInt507 * this.aClass14_Sub1_1.anInt505 + local7.anInt506 * this.aClass14_Sub1_1.anInt507 + local7.anInt499 * this.aClass14_Sub1_1.anInt504 >> 15;
		@Pc(200) int local200 = local7.anInt507 * this.aClass14_Sub1_1.anInt500 + local7.anInt506 * this.aClass14_Sub1_1.anInt506 + local7.anInt499 * this.aClass14_Sub1_1.anInt502 >> 15;
		@Pc(223) int local223 = local7.anInt507 * this.aClass14_Sub1_1.anInt497 + local7.anInt506 * this.aClass14_Sub1_1.anInt499 + local7.anInt499 * this.aClass14_Sub1_1.anInt503 >> 15;
		@Pc(246) int local246 = local7.anInt504 * this.aClass14_Sub1_1.anInt505 + local7.anInt502 * this.aClass14_Sub1_1.anInt507 + local7.anInt503 * this.aClass14_Sub1_1.anInt504 >> 15;
		@Pc(269) int local269 = local7.anInt504 * this.aClass14_Sub1_1.anInt500 + local7.anInt502 * this.aClass14_Sub1_1.anInt506 + local7.anInt503 * this.aClass14_Sub1_1.anInt502 >> 15;
		@Pc(292) int local292 = local7.anInt504 * this.aClass14_Sub1_1.anInt497 + local7.anInt502 * this.aClass14_Sub1_1.anInt499 + local7.anInt503 * this.aClass14_Sub1_1.anInt503 >> 15;
		@Pc(294) boolean local294 = false;
		@Pc(298) int local298 = this.aClass19_Sub2_3.anInt2855;
		@Pc(302) int local302 = this.aClass19_Sub2_3.anInt2860;
		@Pc(306) int local306 = this.aClass19_Sub2_3.anInt2851;
		@Pc(310) int local310 = this.aClass19_Sub2_3.anInt2841;
		@Pc(312) int local312 = Integer.MAX_VALUE;
		@Pc(314) int local314 = Integer.MIN_VALUE;
		@Pc(316) int local316 = Integer.MAX_VALUE;
		@Pc(318) int local318 = Integer.MIN_VALUE;
		this.method1242(Thread.currentThread());
		if (!this.aBoolean79) {
			this.method1251();
		}
		this.anIntArray50[0] = this.aShort8;
		this.anIntArray58[0] = this.aShort2;
		this.anIntArray44[0] = this.aShort7;
		this.anIntArray50[1] = this.aShort4;
		this.anIntArray58[1] = this.aShort2;
		this.anIntArray44[1] = this.aShort7;
		this.anIntArray50[2] = this.aShort8;
		this.anIntArray58[2] = this.aShort6;
		this.anIntArray44[2] = this.aShort7;
		this.anIntArray50[3] = this.aShort4;
		this.anIntArray58[3] = this.aShort6;
		this.anIntArray44[3] = this.aShort7;
		this.anIntArray50[4] = this.aShort8;
		this.anIntArray58[4] = this.aShort2;
		this.anIntArray44[4] = this.aShort3;
		this.anIntArray50[5] = this.aShort4;
		this.anIntArray58[5] = this.aShort2;
		this.anIntArray44[5] = this.aShort3;
		this.anIntArray50[6] = this.aShort8;
		this.anIntArray58[6] = this.aShort6;
		this.anIntArray44[6] = this.aShort3;
		this.anIntArray50[7] = this.aShort4;
		this.anIntArray58[7] = this.aShort6;
		this.anIntArray44[7] = this.aShort3;
		@Pc(504) int local504;
		@Pc(520) int local520;
		@Pc(536) int local536;
		@Pc(478) int local478;
		@Pc(483) int local483;
		@Pc(488) int local488;
		@Pc(549) int local549;
		@Pc(557) int local557;
		for (@Pc(472) int local472 = 0; local472 < 8; local472++) {
			local478 = this.anIntArray50[local472];
			local483 = this.anIntArray58[local472];
			local488 = this.anIntArray44[local472];
			local504 = local33 + (local108 * local478 + local131 * local483 + local154 * local488 >> 15);
			local520 = local59 + (local177 * local478 + local200 * local483 + local223 * local488 >> 15);
			local536 = local85 + (local246 * local478 + local269 * local483 + local292 * local488 >> 15);
			if (local536 >= this.aClass19_Sub2_3.anInt2843) {
				local549 = local298 + local504 * local306 / local536;
				local557 = local302 + local520 * local310 / local536;
				if (local549 < local312) {
					local312 = local549;
				}
				if (local549 > local314) {
					local314 = local549;
				}
				if (local557 < local316) {
					local316 = local557;
				}
				if (local557 > local318) {
					local318 = local557;
				}
				local294 = true;
			}
		}
		if (local294 && arg0 > local312 && arg0 < local314 && arg1 > local316 && arg1 < local318) {
			if (arg3) {
				return true;
			}
			for (local549 = 0; local549 < this.anInt987; local549++) {
				local478 = this.anIntArray68[local549];
				local483 = this.anIntArray56[local549];
				local488 = this.anIntArray47[local549];
				local504 = local33 + (local108 * local478 + local131 * local483 + local154 * local488 >> 15);
				local520 = local59 + (local177 * local478 + local200 * local483 + local223 * local488 >> 15);
				local536 = local85 + (local246 * local478 + local269 * local483 + local292 * local488 >> 15);
				if (local536 >= this.aClass19_Sub2_3.anInt2843) {
					this.anIntArray60[local549] = local298 + local504 * local306 / local536;
					this.anIntArray63[local549] = local302 + local520 * local310 / local536;
				} else {
					this.anIntArray60[local549] = -999999;
				}
			}
			for (local557 = 0; local557 < this.anInt986; local557++) {
				if (this.anIntArray60[this.aShortArray10[local557]] != -999999 && this.anIntArray60[this.aShortArray5[local557]] != -999999 && this.anIntArray60[this.aShortArray6[local557]] != -999999 && this.method1243(arg0, arg1, this.anIntArray63[this.aShortArray10[local557]], this.anIntArray63[this.aShortArray5[local557]], this.anIntArray63[this.aShortArray6[local557]], this.anIntArray60[this.aShortArray10[local557]], this.anIntArray60[this.aShortArray5[local557]], this.anIntArray60[this.aShortArray6[local557]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "(I)V")
	private void method1253(@OriginalArg(0) int arg0) {
		@Pc(8) short local8;
		@Pc(13) short local13;
		@Pc(18) short local18;
		@Pc(27) int local27;
		@Pc(46) int local46;
		@Pc(65) int local65;
		@Pc(81) int local81;
		@Pc(309) int local309;
		@Pc(314) int local314;
		@Pc(319) int local319;
		if (!this.aClass19_Sub2_3.aBoolean199) {
			local8 = this.aShortArray10[arg0];
			local13 = this.aShortArray5[arg0];
			local18 = this.aShortArray6[arg0];
			local27 = this.anIntArray67[local8] - this.aClass19_Sub2_3.anInt2867;
			if (local27 > 255) {
				local27 = 255;
			} else if (local27 < 0) {
				local27 = 0;
			}
			local46 = this.anIntArray67[local13] - this.aClass19_Sub2_3.anInt2867;
			if (local46 > 255) {
				local46 = 255;
			} else if (local46 < 0) {
				local46 = 0;
			}
			local65 = this.anIntArray67[local18] - this.aClass19_Sub2_3.anInt2867;
			if (local65 > 255) {
				local65 = 255;
			} else if (local65 < 0) {
				local65 = 0;
			}
			local81 = local27 + local46 + local65;
			if (local81 != 765) {
				if (local81 == 0) {
					this.method1250(arg0);
				} else {
					if (this.aByteArray11 == null) {
						this.aClass81_1.anInt2264 = 0;
					} else {
						this.aClass81_1.anInt2264 = this.aByteArray11[arg0] & 0xFF;
					}
					this.aClass81_1.textX = this.aBooleanArray8[arg0];
					if (this.aShortArray11 != null && this.aShortArray11[arg0] != -1) {
						if (this.aByteArray9 == null || this.aByteArray9[arg0] == -1) {
							local309 = local8;
							local314 = local13;
							local319 = local18;
						} else {
							@Pc(304) int local304 = this.aByteArray9[arg0] & 0xFF;
							local309 = this.anIntArray43[local304];
							local314 = this.anIntArray46[local304];
							local319 = this.anIntArray62[local304];
						}
						if (this.anIntArray52[arg0] == -1) {
							this.aClass81_1.method2280(this.anIntArray63[local8], this.anIntArray63[local13], this.anIntArray63[local18], this.anIntArray60[local8], this.anIntArray60[local13], this.anIntArray60[local18], this.aClass19_Sub2_3.anInt2853, local27, local46, local65, this.anIntArray76[arg0], this.anIntArray76[arg0], this.anIntArray76[arg0], this.anIntArray51[local309], this.anIntArray51[local314], this.anIntArray51[local319], this.anIntArray64[local309], this.anIntArray64[local314], this.anIntArray64[local319], this.anIntArray61[local309], this.anIntArray61[local314], this.anIntArray61[local319], this.aShortArray11[arg0]);
						} else {
							this.aClass81_1.method2280(this.anIntArray63[local8], this.anIntArray63[local13], this.anIntArray63[local18], this.anIntArray60[local8], this.anIntArray60[local13], this.anIntArray60[local18], this.aClass19_Sub2_3.anInt2853, local27, local46, local65, this.anIntArray76[arg0], this.anIntArray74[arg0], this.anIntArray52[arg0], this.anIntArray51[local309], this.anIntArray51[local314], this.anIntArray51[local319], this.anIntArray64[local309], this.anIntArray64[local314], this.anIntArray64[local319], this.anIntArray61[local309], this.anIntArray61[local314], this.anIntArray61[local319], this.aShortArray11[arg0]);
						}
					} else if (this.anIntArray52[arg0] == -1) {
						this.aClass81_1.method2289(this.anIntArray63[local8], this.anIntArray63[local13], this.anIntArray63[local18], this.anIntArray60[local8], this.anIntArray60[local13], this.anIntArray60[local18], Static231.method4024(Static181.anIntArray204[this.anIntArray76[arg0] & 0xFFFF], local27 << 24 | this.aClass19_Sub2_3.anInt2853), Static231.method4024(Static181.anIntArray204[this.anIntArray76[arg0] & 0xFFFF], local46 << 24 | this.aClass19_Sub2_3.anInt2853), Static231.method4024(Static181.anIntArray204[this.anIntArray76[arg0] & 0xFFFF], local65 << 24 | this.aClass19_Sub2_3.anInt2853));
					} else {
						this.aClass81_1.method2289(this.anIntArray63[local8], this.anIntArray63[local13], this.anIntArray63[local18], this.anIntArray60[local8], this.anIntArray60[local13], this.anIntArray60[local18], Static231.method4024(Static181.anIntArray204[this.anIntArray76[arg0] & 0xFFFF], local27 << 24 | this.aClass19_Sub2_3.anInt2853), Static231.method4024(Static181.anIntArray204[this.anIntArray74[arg0] & 0xFFFF], local46 << 24 | this.aClass19_Sub2_3.anInt2853), Static231.method4024(Static181.anIntArray204[this.anIntArray52[arg0] & 0xFFFF], local65 << 24 | this.aClass19_Sub2_3.anInt2853));
					}
				}
			}
		} else if (!this.aBooleanArray9[arg0]) {
			local8 = this.aShortArray10[arg0];
			local13 = this.aShortArray5[arg0];
			local18 = this.aShortArray6[arg0];
			local27 = 0;
			local46 = 0;
			local65 = 0;
			if (this.anIntArray54[local8] > this.aClass19_Sub2_3.anInt2870) {
				local27 = 255;
			} else if (this.anIntArray54[local8] > this.aClass19_Sub2_3.anInt2866) {
				local27 = (this.aClass19_Sub2_3.anInt2866 - this.anIntArray54[local8]) * 255 / (this.aClass19_Sub2_3.anInt2866 - this.aClass19_Sub2_3.anInt2870);
			}
			if (this.anIntArray54[local13] > this.aClass19_Sub2_3.anInt2870) {
				local46 = 255;
			} else if (this.anIntArray54[local13] > this.aClass19_Sub2_3.anInt2866) {
				local46 = (this.aClass19_Sub2_3.anInt2866 - this.anIntArray54[local13]) * 255 / (this.aClass19_Sub2_3.anInt2866 - this.aClass19_Sub2_3.anInt2870);
			}
			if (this.anIntArray54[local18] > this.aClass19_Sub2_3.anInt2870) {
				local65 = 255;
			} else if (this.anIntArray54[local18] > this.aClass19_Sub2_3.anInt2866) {
				local65 = (this.aClass19_Sub2_3.anInt2866 - this.anIntArray54[local18]) * 255 / (this.aClass19_Sub2_3.anInt2866 - this.aClass19_Sub2_3.anInt2870);
			}
			if (this.aByteArray11 == null) {
				this.aClass81_1.anInt2264 = 0;
			} else {
				this.aClass81_1.anInt2264 = this.aByteArray11[arg0] & 0xFF;
			}
			this.aClass81_1.textX = this.aBooleanArray8[arg0];
			if (this.aShortArray11 != null && this.aShortArray11[arg0] != -1) {
				if (this.aByteArray9 == null || this.aByteArray9[arg0] == -1) {
					local81 = local8;
					local309 = local13;
					local314 = local18;
				} else {
					local319 = this.aByteArray9[arg0] & 0xFF;
					local81 = this.anIntArray43[local319];
					local309 = this.anIntArray46[local319];
					local314 = this.anIntArray62[local319];
				}
				if (this.anIntArray52[arg0] == -1) {
					this.aClass81_1.method2280(this.anIntArray63[local8], this.anIntArray63[local13], this.anIntArray63[local18], this.anIntArray60[local8], this.anIntArray60[local13], this.anIntArray60[local18], this.aClass19_Sub2_3.anInt2853, local27, local46, local65, this.anIntArray76[arg0], this.anIntArray76[arg0], this.anIntArray76[arg0], this.anIntArray51[local81], this.anIntArray51[local309], this.anIntArray51[local314], this.anIntArray64[local81], this.anIntArray64[local309], this.anIntArray64[local314], this.anIntArray61[local81], this.anIntArray61[local309], this.anIntArray61[local314], this.aShortArray11[arg0]);
				} else {
					this.aClass81_1.method2280(this.anIntArray63[local8], this.anIntArray63[local13], this.anIntArray63[local18], this.anIntArray60[local8], this.anIntArray60[local13], this.anIntArray60[local18], this.aClass19_Sub2_3.anInt2853, local27, local46, local65, this.anIntArray76[arg0], this.anIntArray74[arg0], this.anIntArray52[arg0], this.anIntArray51[local81], this.anIntArray51[local309], this.anIntArray51[local314], this.anIntArray64[local81], this.anIntArray64[local309], this.anIntArray64[local314], this.anIntArray61[local81], this.anIntArray61[local309], this.anIntArray61[local314], this.aShortArray11[arg0]);
				}
			} else if (this.anIntArray52[arg0] == -1) {
				this.aClass81_1.method2289(this.anIntArray63[local8], this.anIntArray63[local13], this.anIntArray63[local18], this.anIntArray60[local8], this.anIntArray60[local13], this.anIntArray60[local18], Static231.method4024(Static181.anIntArray204[this.anIntArray76[arg0] & 0xFFFF], local27 << 24 | this.aClass19_Sub2_3.anInt2853), Static231.method4024(Static181.anIntArray204[this.anIntArray76[arg0] & 0xFFFF], local46 << 24 | this.aClass19_Sub2_3.anInt2853), Static231.method4024(Static181.anIntArray204[this.anIntArray76[arg0] & 0xFFFF], local65 << 24 | this.aClass19_Sub2_3.anInt2853));
			} else {
				this.aClass81_1.method2289(this.anIntArray63[local8], this.anIntArray63[local13], this.anIntArray63[local18], this.anIntArray60[local8], this.anIntArray60[local13], this.anIntArray60[local18], Static231.method4024(Static181.anIntArray204[this.anIntArray76[arg0] & 0xFFFF], local27 << 24 | this.aClass19_Sub2_3.anInt2853), Static231.method4024(Static181.anIntArray204[this.anIntArray74[arg0] & 0xFFFF], local46 << 24 | this.aClass19_Sub2_3.anInt2853), Static231.method4024(Static181.anIntArray204[this.anIntArray52[arg0] & 0xFFFF], local65 << 24 | this.aClass19_Sub2_3.anInt2853));
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(SS)V")
	@Override
	public void method3816(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray11 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt986; local5++) {
			if (this.aShortArray11[local5] == arg0) {
				this.aShortArray11[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
	@Override
	public void method3824(@OriginalArg(0) int arg0) {
		if ((this.anInt984 & 0x6) != 6) {
			throw new IllegalStateException();
		}
		@Pc(13) int local13 = Class19.anIntArray178[arg0];
		@Pc(17) int local17 = Class19.anIntArray177[arg0];
		for (@Pc(19) int local19 = 0; local19 < this.anInt987; local19++) {
			@Pc(36) int local36 = this.anIntArray56[local19] * local17 - this.anIntArray47[local19] * local13 >> 15;
			this.anIntArray47[local19] = this.anIntArray56[local19] * local13 + this.anIntArray47[local19] * local17 >> 15;
			this.anIntArray56[local19] = local36;
		}
		this.method1261();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ba;)V")
	private void method1254(@OriginalArg(0) Class14_Sub1 arg0) {
		@Pc(4) int local4;
		if (this.aClass114Array1 != null) {
			for (local4 = 0; local4 < this.aClass114Array1.length; local4++) {
				@Pc(10) Class114 local10 = this.aClass114Array1[local4];
				@Pc(12) Class114 local12 = local10;
				if (local10.aClass114_1 != null) {
					local12 = local10.aClass114_1;
				}
				local12.anInt2919 = arg0.anInt498 + (arg0.anInt505 * this.anIntArray68[local10.anInt2918] + arg0.anInt500 * this.anIntArray56[local10.anInt2918] + arg0.anInt497 * this.anIntArray47[local10.anInt2918] >> 15);
				local12.anInt2916 = arg0.anInt496 + (arg0.anInt507 * this.anIntArray68[local10.anInt2918] + arg0.anInt506 * this.anIntArray56[local10.anInt2918] + arg0.anInt499 * this.anIntArray47[local10.anInt2918] >> 15);
				local12.anInt2922 = arg0.anInt501 + (arg0.anInt504 * this.anIntArray68[local10.anInt2918] + arg0.anInt502 * this.anIntArray56[local10.anInt2918] + arg0.anInt503 * this.anIntArray47[local10.anInt2918] >> 15);
				local12.anInt2925 = arg0.anInt498 + (arg0.anInt505 * this.anIntArray68[local10.anInt2926] + arg0.anInt500 * this.anIntArray56[local10.anInt2926] + arg0.anInt497 * this.anIntArray47[local10.anInt2926] >> 15);
				local12.anInt2928 = arg0.anInt496 + (arg0.anInt507 * this.anIntArray68[local10.anInt2926] + arg0.anInt506 * this.anIntArray56[local10.anInt2926] + arg0.anInt499 * this.anIntArray47[local10.anInt2926] >> 15);
				local12.anInt2929 = arg0.anInt501 + (arg0.anInt504 * this.anIntArray68[local10.anInt2926] + arg0.anInt502 * this.anIntArray56[local10.anInt2926] + arg0.anInt503 * this.anIntArray47[local10.anInt2926] >> 15);
				local12.anInt2924 = arg0.anInt498 + (arg0.anInt505 * this.anIntArray68[local10.anInt2920] + arg0.anInt500 * this.anIntArray56[local10.anInt2920] + arg0.anInt497 * this.anIntArray47[local10.anInt2920] >> 15);
				local12.anInt2915 = arg0.anInt496 + (arg0.anInt507 * this.anIntArray68[local10.anInt2920] + arg0.anInt506 * this.anIntArray56[local10.anInt2920] + arg0.anInt499 * this.anIntArray47[local10.anInt2920] >> 15);
				local12.anInt2921 = arg0.anInt501 + (arg0.anInt504 * this.anIntArray68[local10.anInt2920] + arg0.anInt502 * this.anIntArray56[local10.anInt2920] + arg0.anInt503 * this.anIntArray47[local10.anInt2920] >> 15);
			}
		}
		if (this.aClass163Array1 == null) {
			return;
		}
		for (local4 = 0; local4 < this.aClass163Array1.length; local4++) {
			@Pc(332) Class163 local332 = this.aClass163Array1[local4];
			@Pc(334) Class163 local334 = local332;
			if (local332.aClass163_2 != null) {
				local334 = local332.aClass163_2;
			}
			if (local332.aClass14_5 == null) {
				local332.aClass14_5 = arg0.method531();
			} else {
				local332.aClass14_5.method3924(arg0);
			}
			local334.anInt4329 = arg0.anInt498 + (arg0.anInt505 * this.anIntArray68[local332.anInt4333] + arg0.anInt500 * this.anIntArray56[local332.anInt4333] + arg0.anInt497 * this.anIntArray47[local332.anInt4333] >> 15);
			local334.anInt4335 = arg0.anInt496 + (arg0.anInt507 * this.anIntArray68[local332.anInt4333] + arg0.anInt506 * this.anIntArray56[local332.anInt4333] + arg0.anInt499 * this.anIntArray47[local332.anInt4333] >> 15);
			local334.anInt4337 = arg0.anInt501 + (arg0.anInt504 * this.anIntArray68[local332.anInt4333] + arg0.anInt502 * this.anIntArray56[local332.anInt4333] + arg0.anInt503 * this.anIntArray47[local332.anInt4333] >> 15);
		}
	}

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "()V")
	private void method1255() {
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt981; local1++) {
			local7 = this.anIntArray68[local1];
			this.anIntArray68[local1] = this.anIntArray47[local1];
			this.anIntArray47[local1] = -local7;
			if (this.aClass26Array2[local1] != null) {
				local7 = this.aClass26Array2[local1].anInt733;
				this.aClass26Array2[local1].anInt733 = this.aClass26Array2[local1].anInt731;
				this.aClass26Array2[local1].anInt731 = -local7;
			}
		}
		@Pc(71) int local71;
		if (this.aClass234Array1 != null) {
			for (local7 = 0; local7 < this.anInt986; local7++) {
				if (this.aClass234Array1[local7] != null) {
					local71 = this.aClass234Array1[local7].anInt6564;
					this.aClass234Array1[local7].anInt6564 = this.aClass234Array1[local7].anInt6563;
					this.aClass234Array1[local7].anInt6563 = -local71;
				}
			}
		}
		for (local7 = this.anInt981; local7 < this.anInt987; local7++) {
			local71 = this.anIntArray68[local7];
			this.anIntArray68[local7] = this.anIntArray47[local7];
			this.anIntArray47[local7] = -local71;
		}
		this.anInt979 = 0;
		this.aBoolean79 = false;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!on;Lclient!au;II)V")
	@Override
	public void method3844(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(2) int arg2) {
		this.method1240(arg0, arg1, null, arg2, 1);
	}

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "()V")
	private void method1256() {
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt981; local1++) {
			local7 = this.anIntArray47[local1];
			this.anIntArray47[local1] = this.anIntArray68[local1];
			this.anIntArray68[local1] = -local7;
			if (this.aClass26Array2[local1] != null) {
				local7 = this.aClass26Array2[local1].anInt731;
				this.aClass26Array2[local1].anInt731 = this.aClass26Array2[local1].anInt733;
				this.aClass26Array2[local1].anInt733 = -local7;
			}
		}
		@Pc(71) int local71;
		if (this.aClass234Array1 != null) {
			for (local7 = 0; local7 < this.anInt986; local7++) {
				if (this.aClass234Array1[local7] != null) {
					local71 = this.aClass234Array1[local7].anInt6563;
					this.aClass234Array1[local7].anInt6563 = this.aClass234Array1[local7].anInt6564;
					this.aClass234Array1[local7].anInt6564 = -local71;
				}
			}
		}
		for (local7 = this.anInt981; local7 < this.anInt987; local7++) {
			local71 = this.anIntArray47[local7];
			this.anIntArray47[local7] = this.anIntArray68[local7];
			this.anIntArray68[local7] = -local71;
		}
		this.anInt979 = 0;
		this.aBoolean79 = false;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
	private void method1257(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (this.anInt979 == 1) {
				this.method1260();
			} else if (this.anInt979 == 2) {
				if ((this.anInt984 & 0xBA98) == 0) {
					this.aShortArray8 = null;
				}
				if (arg0) {
					this.aByteArray10 = null;
				}
			} else {
				this.method1252();
				@Pc(38) int local38 = this.aClass19_Sub2_3.anInt2845;
				@Pc(42) int local42 = this.aClass19_Sub2_3.anInt2840;
				@Pc(46) int local46 = this.aClass19_Sub2_3.anInt2850;
				@Pc(52) int local52 = this.aClass19_Sub2_3.anInt2852 >> 8;
				@Pc(61) int local61 = this.aClass19_Sub2_3.anInt2858 * 768 / this.anInt983;
				@Pc(70) int local70 = this.aClass19_Sub2_3.anInt2842 * 768 / this.anInt983;
				if (this.anIntArray76 == null) {
					this.anIntArray76 = new int[this.anInt986];
					this.anIntArray74 = new int[this.anInt986];
					this.anIntArray52 = new int[this.anInt986];
				}
				for (@Pc(90) int local90 = 0; local90 < this.anInt986; local90++) {
					@Pc(96) byte local96;
					if (this.aByteArray10 == null) {
						local96 = 0;
					} else {
						local96 = this.aByteArray10[local90];
					}
					@Pc(107) byte local107;
					if (this.aByteArray11 == null) {
						local107 = 0;
					} else {
						local107 = this.aByteArray11[local90];
					}
					@Pc(118) short local118;
					if (this.aShortArray11 == null) {
						local118 = -1;
					} else {
						local118 = this.aShortArray11[local90];
					}
					if (local107 == -2) {
						local96 = 3;
					}
					if (local107 == -1) {
						local96 = 2;
					}
					@Pc(155) int local155;
					if (local118 == -1) {
						@Pc(228) int local228;
						@Pc(211) int local211;
						@Pc(218) int local218;
						@Pc(146) int local146;
						@Pc(163) short local163;
						if (local96 == 0) {
							local146 = this.aShortArray8[local90] & 0xFFFF;
							local155 = (local146 & 0x7F) * this.anInt982 >> 7;
							local163 = Static26.method863(local146 & 0xFFFFFF80 | local155);
							@Pc(182) Class26 local182;
							if (this.aClass26Array1 == null || this.aClass26Array1[this.aShortArray10[local90]] == null) {
								local182 = this.aClass26Array2[this.aShortArray10[local90]];
							} else {
								local182 = this.aClass26Array1[this.aShortArray10[local90]];
							}
							local211 = (local38 * local182.anInt733 + local42 * local182.anInt730 + local46 * local182.anInt731) / local182.anInt732 >> 16;
							local218 = local211 > 256 ? local61 : local70;
							local228 = (local52 >> 1) + (local218 * local211 >> 17);
							this.anIntArray76[local90] = local228 << 17 | Static253.method4368(local163, local228);
							if (this.aClass26Array1 == null || this.aClass26Array1[this.aShortArray5[local90]] == null) {
								local182 = this.aClass26Array2[this.aShortArray5[local90]];
							} else {
								local182 = this.aClass26Array1[this.aShortArray5[local90]];
							}
							local211 = (local38 * local182.anInt733 + local42 * local182.anInt730 + local46 * local182.anInt731) / local182.anInt732 >> 16;
							local218 = local211 > 256 ? local61 : local70;
							local228 = (local52 >> 1) + (local218 * local211 >> 17);
							this.anIntArray74[local90] = local228 << 17 | Static253.method4368(local163, local228);
							if (this.aClass26Array1 == null || this.aClass26Array1[this.aShortArray6[local90]] == null) {
								local182 = this.aClass26Array2[this.aShortArray6[local90]];
							} else {
								local182 = this.aClass26Array1[this.aShortArray6[local90]];
							}
							local211 = (local38 * local182.anInt733 + local42 * local182.anInt730 + local46 * local182.anInt731) / local182.anInt732 >> 16;
							local218 = local211 > 256 ? local61 : local70;
							local228 = (local52 >> 1) + (local218 * local211 >> 17);
							this.anIntArray52[local90] = local228 << 17 | Static253.method4368(local163, local228);
						} else if (local96 == 1) {
							local146 = this.aShortArray8[local90] & 0xFFFF;
							local155 = (local146 & 0x7F) * this.anInt982 >> 7;
							local163 = Static26.method863(local146 & 0xFFFFFF80 | local155);
							@Pc(427) Class234 local427 = this.aClass234Array1[local90];
							local228 = local38 * local427.anInt6564 + local42 * local427.anInt6562 + local46 * local427.anInt6563 >> 16;
							local211 = local228 > 256 ? local61 : local70;
							local218 = (local52 >> 1) + (local211 * local228 >> 17);
							this.anIntArray76[local90] = local218 << 17 | Static253.method4368(local163, local218);
							this.anIntArray52[local90] = -1;
						} else if (local96 == 3) {
							this.anIntArray76[local90] = 128;
							this.anIntArray52[local90] = -1;
						} else {
							this.anIntArray52[local90] = -2;
						}
					} else {
						@Pc(549) int local549;
						@Pc(556) int local556;
						if (local96 == 0) {
							@Pc(520) Class26 local520;
							if (this.aClass26Array1 == null || this.aClass26Array1[this.aShortArray10[local90]] == null) {
								local520 = this.aClass26Array2[this.aShortArray10[local90]];
							} else {
								local520 = this.aClass26Array1[this.aShortArray10[local90]];
							}
							local549 = (local38 * local520.anInt733 + local42 * local520.anInt730 + local46 * local520.anInt731) / local520.anInt732 >> 16;
							local556 = local549 > 256 ? local61 : local70;
							local155 = (local52 >> 2) + (local556 * local549 >> 18);
							this.anIntArray76[local90] = this.method1245(local155);
							if (this.aClass26Array1 == null || this.aClass26Array1[this.aShortArray5[local90]] == null) {
								local520 = this.aClass26Array2[this.aShortArray5[local90]];
							} else {
								local520 = this.aClass26Array1[this.aShortArray5[local90]];
							}
							local549 = (local38 * local520.anInt733 + local42 * local520.anInt730 + local46 * local520.anInt731) / local520.anInt732 >> 16;
							local556 = local549 > 256 ? local61 : local70;
							local155 = (local52 >> 2) + (local556 * local549 >> 18);
							this.anIntArray74[local90] = this.method1245(local155);
							if (this.aClass26Array1 == null || this.aClass26Array1[this.aShortArray6[local90]] == null) {
								local520 = this.aClass26Array2[this.aShortArray6[local90]];
							} else {
								local520 = this.aClass26Array1[this.aShortArray6[local90]];
							}
							local549 = (local38 * local520.anInt733 + local42 * local520.anInt730 + local46 * local520.anInt731) / local520.anInt732 >> 16;
							local556 = local549 > 256 ? local61 : local70;
							local155 = (local52 >> 2) + (local556 * local549 >> 18);
							this.anIntArray52[local90] = this.method1245(local155);
						} else if (local96 == 1) {
							@Pc(726) Class234 local726 = this.aClass234Array1[local90];
							local155 = local38 * local726.anInt6564 + local42 * local726.anInt6562 + local46 * local726.anInt6563 >> 16;
							local549 = local155 > 256 ? local61 : local70;
							local556 = (local52 >> 2) + (local549 * local155 >> 18);
							this.anIntArray76[local90] = this.method1245(local556);
							this.anIntArray52[local90] = -1;
						} else {
							this.anIntArray52[local90] = -2;
						}
					}
				}
				this.aClass26Array2 = null;
				this.aClass26Array1 = null;
				this.aClass234Array1 = null;
				if ((this.anInt984 & 0xBA98) == 0) {
					this.aShortArray8 = null;
				}
				if (arg0) {
					this.aByteArray10 = null;
				}
				this.anInt979 = 2;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BIZ)Lclient!gn;")
	@Override
	public Model method3800(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.method1244(Thread.currentThread());
		@Pc(11) SoftwareModel local11;
		@Pc(8) SoftwareModel local8;
		if (arg0 == 1) {
			local8 = this.aClass31_Sub1_7;
			local11 = this.aClass31_Sub1_1;
		} else if (arg0 == 2) {
			local8 = this.aClass31_Sub1_6;
			local11 = this.aClass31_Sub1_5;
		} else if (arg0 == 3) {
			local8 = this.aClass31_Sub1_3;
			local11 = this.aClass31_Sub1_4;
		} else if (arg0 == 4) {
			local8 = this.aClass31_Sub1_2;
			local11 = this.aClass31_Sub1_8;
		} else {
			local11 = local8 = new SoftwareModel(this.aClass19_Sub2_3);
		}
		return this.method1241(local11, local8, arg1, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()Z")
	@Override
	public boolean method3801() {
		if (this.aShortArray11 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray11.length; local6++) {
			if (this.aShortArray11[local6] != -1 && !this.aClass19_Sub2_3.method2906(this.aShortArray11[local6])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cb", name = "A", descriptor = "()V")
	private void method1260() {
		if (this.anInt979 == 0) {
			this.method1257(false);
			return;
		}
		for (@Pc(8) int local8 = 0; local8 < this.anInt986; local8++) {
			@Pc(19) short local19 = this.aShortArray11 == null ? -1 : this.aShortArray11[local8];
			if (local19 == -1) {
				@Pc(29) int local29 = this.aShortArray8[local8] & 0xFFFF;
				@Pc(38) int local38 = (local29 & 0x7F) * this.anInt982 >> 7;
				@Pc(46) short local46 = Static26.method863(local29 & 0xFFFFFF80 | local38);
				@Pc(59) int local59;
				if (this.anIntArray52[local8] == -1) {
					local59 = this.anIntArray76[local8] & 0xFFFE0000;
					this.anIntArray76[local8] = local59 | Static253.method4368(local46, local59 >> 17);
				} else if (this.anIntArray52[local8] != -2) {
					local59 = this.anIntArray76[local8] & 0xFFFE0000;
					this.anIntArray76[local8] = local59 | Static253.method4368(local46, local59 >> 17);
					local59 = this.anIntArray74[local8] & 0xFFFE0000;
					this.anIntArray74[local8] = local59 | Static253.method4368(local46, local59 >> 17);
					local59 = this.anIntArray52[local8] & 0xFFFE0000;
					this.anIntArray52[local8] = local59 | Static253.method4368(local46, local59 >> 17);
				}
			}
		}
		this.anInt979 = 2;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	@Override
	public void method3807(@OriginalArg(0) int arg0) {
		if ((this.anInt984 & 0x800) != 2048) {
			throw new IllegalStateException();
		}
		this.anInt982 = arg0;
		this.anInt979 = 0;
	}

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "()V")
	@Override
	protected void method3836() {
		if (this.aBoolean77) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt987; local4++) {
				this.anIntArray68[local4] = this.anIntArray68[local4] + 7 >> 4;
				this.anIntArray56[local4] = this.anIntArray56[local4] + 7 >> 4;
				this.anIntArray47[local4] = this.anIntArray47[local4] + 7 >> 4;
			}
			this.aBoolean77 = false;
		}
		if (this.aBoolean80) {
			this.method1260();
			this.aBoolean80 = false;
		}
		this.aBoolean79 = false;
	}

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "()V")
	private void method1261() {
		this.aClass26Array2 = null;
		this.aClass26Array1 = null;
		this.aClass234Array1 = null;
		this.aBoolean79 = false;
	}

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "()V")
	@Override
	public void method3837() {
		if ((this.anInt984 & 0x10) != 16) {
			throw new IllegalStateException();
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt987; local11++) {
			this.anIntArray47[local11] = -this.anIntArray47[local11];
		}
		@Pc(31) int local31;
		if (this.aClass26Array2 != null) {
			for (local31 = 0; local31 < this.anInt981; local31++) {
				if (this.aClass26Array2[local31] != null) {
					this.aClass26Array2[local31].anInt731 = -this.aClass26Array2[local31].anInt731;
				}
			}
		}
		if (this.aClass26Array1 != null) {
			for (local31 = 0; local31 < this.anInt981; local31++) {
				if (this.aClass26Array1[local31] != null) {
					this.aClass26Array1[local31].anInt731 = -this.aClass26Array1[local31].anInt731;
				}
			}
		}
		if (this.aClass234Array1 != null) {
			for (local31 = 0; local31 < this.anInt986; local31++) {
				if (this.aClass234Array1[local31] != null) {
					this.aClass234Array1[local31].anInt6563 = -this.aClass234Array1[local31].anInt6563;
				}
			}
		}
		@Pc(110) short[] local110 = this.aShortArray10;
		this.aShortArray10 = this.aShortArray6;
		this.aShortArray6 = local110;
		this.aBoolean79 = false;
		this.anInt979 = 0;
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "()I")
	@Override
	public int method3806() {
		if (!this.aBoolean79) {
			this.method1251();
		}
		return this.aShort8;
	}
}
