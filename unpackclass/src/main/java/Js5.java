import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!aa")
public abstract class Js5 {

	@OriginalMember(owner = "unpackclass!aa", name = "q", descriptor = "Z")
	private static boolean aBoolean501;

	@OriginalMember(owner = "unpackclass!aa", name = "r", descriptor = "I")
	private static int anInt7311;

	@OriginalMember(owner = "unpackclass!aa", name = "m", descriptor = "Lunpackclass!k;")
	private static final GzipDecompressor aClass270_2 = new GzipDecompressor();

	@OriginalMember(owner = "unpackclass!aa", name = "a", descriptor = "I")
	protected int anInt7309;

	@OriginalMember(owner = "unpackclass!aa", name = "b", descriptor = "[I")
	protected int[] anIntArray543;

	@OriginalMember(owner = "unpackclass!aa", name = "c", descriptor = "[I")
	private int[] anIntArray544;

	@OriginalMember(owner = "unpackclass!aa", name = "d", descriptor = "[I")
	private int[] anIntArray545;

	@OriginalMember(owner = "unpackclass!aa", name = "e", descriptor = "[I")
	private int[] anIntArray546;

	@OriginalMember(owner = "unpackclass!aa", name = "f", descriptor = "[I")
	private int[] anIntArray547;

	@OriginalMember(owner = "unpackclass!aa", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray71;

	@OriginalMember(owner = "unpackclass!aa", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray72;

	@OriginalMember(owner = "unpackclass!aa", name = "i", descriptor = "[Lunpackclass!i;")
	private IntHashTable[] aClass268Array2;

	@OriginalMember(owner = "unpackclass!aa", name = "j", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray37;

	@OriginalMember(owner = "unpackclass!aa", name = "k", descriptor = "[I")
	private int[] anIntArray548;

	@OriginalMember(owner = "unpackclass!aa", name = "l", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray3;

	@OriginalMember(owner = "unpackclass!aa", name = "n", descriptor = "I")
	private int anInt7310;

	@OriginalMember(owner = "unpackclass!aa", name = "o", descriptor = "Z")
	protected final boolean aBoolean499;

	@OriginalMember(owner = "unpackclass!aa", name = "p", descriptor = "Z")
	private final boolean aBoolean500;

	@OriginalMember(owner = "unpackclass!aa", name = "b", descriptor = "([B)[B")
	private static byte[] method6606(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Buffer local4 = new Buffer(arg0);
		@Pc(7) int local7 = local4.method6585();
		@Pc(10) int local10 = local4.method6588();
		if (local10 < 0 || anInt7311 != 0 && local10 > anInt7311) {
			throw new RuntimeException();
		} else if (local7 == 0) {
			@Pc(26) byte[] local26 = new byte[local10];
			local4.method6589(local26, local10);
			return local26;
		} else {
			@Pc(36) int local36 = local4.method6588();
			if (local36 < 0 || anInt7311 != 0 && local36 > anInt7311) {
				throw new RuntimeException();
			}
			@Pc(50) byte[] local50 = new byte[local36];
			if (local7 == 1) {
				BZip2InputStream.method6611(local50, local36, arg0, local10);
			} else {
				aClass270_2.method6596(local4, local50);
			}
			return local50;
		}
	}

	@OriginalMember(owner = "unpackclass!aa", name = "<init>", descriptor = "(ZZ)V")
	protected Js5(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean499 = arg0;
		this.aBoolean500 = arg1;
	}

	@OriginalMember(owner = "unpackclass!aa", name = "a", descriptor = "([B)V")
	protected final void method6598(@OriginalArg(0) byte[] arg0) {
		this.anInt7310 = Buffer.method6579(arg0, arg0.length);
		@Pc(13) Buffer local13 = new Buffer(method6606(arg0));
		@Pc(16) int local16 = local13.method6585();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local16);
		}
		if (local16 >= 6) {
			local13.method6588();
		}
		@Pc(42) int local42 = local13.method6585();
		this.anInt7309 = local13.method6586();
		@Pc(48) int local48 = 0;
		@Pc(50) int local50 = -1;
		this.anIntArray543 = new int[this.anInt7309];
		for (@Pc(57) int local57 = 0; local57 < this.anInt7309; local57++) {
			this.anIntArray543[local57] = local48 += local13.method6586();
			if (this.anIntArray543[local57] > local50) {
				local50 = this.anIntArray543[local57];
			}
		}
		this.anIntArray545 = new int[local50 + 1];
		this.anIntArray546 = new int[local50 + 1];
		this.anIntArray547 = new int[local50 + 1];
		this.anIntArrayArray71 = new int[local50 + 1][];
		this.anObjectArray37 = new Object[local50 + 1];
		this.anIntArray548 = new int[local50 + 1];
		this.anObjectArrayArray3 = new Object[local50 + 1][];
		@Pc(142) int local142;
		@Pc(157) int local157;
		if (local42 != 0) {
			this.anIntArray544 = new int[local50 + 1];
			for (local142 = 0; local142 < local50 + 1; local142++) {
				this.anIntArray544[local142] = -1;
			}
			for (local157 = 0; local157 < this.anInt7309; local157++) {
				this.anIntArray544[this.anIntArray543[local157]] = local13.method6588();
			}
			new IntHashTable(this.anIntArray544);
		}
		for (local142 = 0; local142 < this.anInt7309; local142++) {
			this.anIntArray545[this.anIntArray543[local142]] = local13.method6588();
		}
		for (local157 = 0; local157 < this.anInt7309; local157++) {
			this.anIntArray546[this.anIntArray543[local157]] = local13.method6588();
		}
		for (@Pc(215) int local215 = 0; local215 < this.anInt7309; local215++) {
			this.anIntArray547[this.anIntArray543[local215]] = local13.method6586();
		}
		@Pc(240) int local240;
		@Pc(245) int local245;
		@Pc(249) int local249;
		@Pc(257) int local257;
		@Pc(273) int local273;
		for (@Pc(233) int local233 = 0; local233 < this.anInt7309; local233++) {
			local240 = this.anIntArray543[local233];
			local245 = this.anIntArray547[local240];
			local48 = 0;
			local249 = -1;
			this.anIntArrayArray71[local240] = new int[local245];
			for (local257 = 0; local257 < local245; local257++) {
				local273 = this.anIntArrayArray71[local240][local257] = local48 += local13.method6586();
				if (local273 > local249) {
					local249 = local273;
				}
			}
			this.anIntArray548[local240] = local249 + 1;
			if (local249 + 1 == local245) {
				this.anIntArrayArray71[local240] = null;
			}
		}
		if (local42 == 0) {
			return;
		}
		this.anIntArrayArray72 = new int[local50 + 1][];
		this.aClass268Array2 = new IntHashTable[local50 + 1];
		for (local240 = 0; local240 < this.anInt7309; local240++) {
			local245 = this.anIntArray543[local240];
			local249 = this.anIntArray547[local245];
			this.anIntArrayArray72[local245] = new int[this.anIntArray548[local245]];
			for (local257 = 0; local257 < this.anIntArray548[local245]; local257++) {
				this.anIntArrayArray72[local245][local257] = -1;
			}
			for (local273 = 0; local273 < local249; local273++) {
				@Pc(375) int local375;
				if (this.anIntArrayArray71[local245] == null) {
					local375 = local273;
				} else {
					local375 = this.anIntArrayArray71[local245][local273];
				}
				this.anIntArrayArray72[local245][local375] = local13.method6588();
			}
			this.aClass268Array2[local245] = new IntHashTable(this.anIntArrayArray72[local245]);
		}
	}

	@OriginalMember(owner = "unpackclass!aa", name = "a", descriptor = "(I)Z")
	private boolean method6599(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < this.anIntArray548.length && this.anIntArray548[arg0] != 0) {
			return true;
		} else if (aBoolean501) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "unpackclass!aa", name = "a", descriptor = "(II)Z")
	private boolean method6600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.anIntArray548.length && arg1 < this.anIntArray548[arg0]) {
			return true;
		} else if (aBoolean501) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "unpackclass!aa", name = "b", descriptor = "(II)[B")
	public final byte[] method6601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method6602(arg0, arg1, null);
	}

	@OriginalMember(owner = "unpackclass!aa", name = "a", descriptor = "(II[I)[B")
	private byte[] method6602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method6600(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray3[arg0] == null || this.anObjectArrayArray3[arg0][arg1] == null) {
			@Pc(23) boolean local23 = this.method6605(arg0, arg2);
			if (!local23) {
				this.method6603(arg0);
				local23 = this.method6605(arg0, arg2);
				if (!local23) {
					return null;
				}
			}
		}
		@Pc(46) byte[] local46 = ByteArray.method6560(this.anObjectArrayArray3[arg0][arg1], false);
		if (this.aBoolean500) {
			this.anObjectArrayArray3[arg0][arg1] = null;
			if (this.anIntArray548[arg0] == 1) {
				this.anObjectArrayArray3[arg0] = null;
			}
		}
		return local46;
	}

	@OriginalMember(owner = "unpackclass!aa", name = "b", descriptor = "(I)V")
	private void method6603(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "unpackclass!aa", name = "c", descriptor = "(I)I")
	public final int method6604() {
		return this.method6599(0) ? this.anIntArray548[0] : 0;
	}

	@OriginalMember(owner = "unpackclass!aa", name = "a", descriptor = "(I[I)Z")
	private boolean method6605(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (!this.method6599(arg0)) {
			return false;
		} else if (this.anObjectArray37[arg0] == null) {
			return false;
		} else {
			@Pc(19) int local19 = this.anIntArray547[arg0];
			@Pc(24) int[] local24 = this.anIntArrayArray71[arg0];
			if (this.anObjectArrayArray3[arg0] == null) {
				this.anObjectArrayArray3[arg0] = new Object[this.anIntArray548[arg0]];
			}
			@Pc(43) Object[] local43 = this.anObjectArrayArray3[arg0];
			@Pc(45) boolean local45 = true;
			for (@Pc(47) int local47 = 0; local47 < local19; local47++) {
				@Pc(53) int local53;
				if (local24 == null) {
					local53 = local47;
				} else {
					local53 = local24[local47];
				}
				if (local43[local53] == null) {
					local45 = false;
					break;
				}
			}
			if (local45) {
				return true;
			}
			@Pc(100) byte[] local100;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local100 = ByteArray.method6560(this.anObjectArray37[arg0], false);
			} else {
				local100 = ByteArray.method6560(this.anObjectArray37[arg0], true);
				@Pc(105) Buffer local105 = new Buffer(local100);
				local105.method6592(arg1, local105.aByteArray100.length);
			}
			@Pc(124) byte[] local124;
			try {
				local124 = method6606(local100);
			} catch (@Pc(126) RuntimeException local126) {
				System.out.println("T3 - " + (arg1 != null) + "," + arg0 + "," + local100.length + "," + Buffer.method6579(local100, local100.length) + "," + Buffer.method6579(local100, local100.length - 2) + "," + this.anIntArray545[arg0] + "," + this.anInt7310);
				local124 = new byte[] { 0 };
			}
			if (this.aBoolean499) {
				this.anObjectArray37[arg0] = null;
			}
			@Pc(191) int local191;
			if (local19 > 1) {
				local191 = local124.length;
				@Pc(193) int local193 = local191 - 1;
				@Pc(198) int local198 = local124[local193] & 0xFF;
				@Pc(206) int local206 = local193 - local19 * local198 * 4;
				@Pc(211) Buffer local211 = new Buffer(local124);
				@Pc(214) int[] local214 = new int[local19];
				local211.anInt7287 = local206;
				@Pc(225) int local225;
				for (@Pc(219) int local219 = 0; local219 < local198; local219++) {
					@Pc(223) int local223 = 0;
					for (local225 = 0; local225 < local19; local225++) {
						local223 += local211.method6588();
						local214[local225] += local223;
					}
				}
				@Pc(250) byte[][] local250 = new byte[local19][];
				for (local225 = 0; local225 < local19; local225++) {
					local250[local225] = new byte[local214[local225]];
					local214[local225] = 0;
				}
				local211.anInt7287 = local206;
				@Pc(274) int local274 = 0;
				@Pc(280) int local280;
				@Pc(282) int local282;
				for (@Pc(276) int local276 = 0; local276 < local198; local276++) {
					local280 = 0;
					for (local282 = 0; local282 < local19; local282++) {
						local280 += local211.method6588();
						ArrayUtils.method6597(local124, local274, local250[local282], local214[local282], local280);
						local214[local282] += local280;
						local274 += local280;
					}
				}
				for (local280 = 0; local280 < local19; local280++) {
					if (local24 == null) {
						local282 = local280;
					} else {
						local282 = local24[local280];
					}
					if (this.aBoolean500) {
						local43[local282] = local250[local280];
					} else {
						local43[local282] = ByteArray.method6559(local250[local280]);
					}
				}
			} else {
				if (local24 == null) {
					local191 = 0;
				} else {
					local191 = local24[0];
				}
				if (this.aBoolean500) {
					local43[local191] = local124;
				} else {
					local43[local191] = ByteArray.method6559(local124);
				}
			}
			return true;
		}
	}
}
