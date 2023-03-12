import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class AnimFrame {

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "[S")
	public static final short[] tempIndices = new short[500];
	@OriginalMember(owner = "client!nd", name = "d", descriptor = "[S")
	public static final short[] tempX = new short[500];
	@OriginalMember(owner = "client!nd", name = "e", descriptor = "[S")
	public static final short[] tempY = new short[500];
	@OriginalMember(owner = "client!nd", name = "f", descriptor = "[S")
	public static final short[] tempZ = new short[500];
	@OriginalMember(owner = "client!nd", name = "h", descriptor = "[B")
	public static final byte[] tempFlags = new byte[500];
	@OriginalMember(owner = "client!nd", name = "a", descriptor = "[S")
	public static final short[] tempPrevOriginIndices = new short[500];
	@OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
	public int length = 0;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "Z")
	public boolean transformsAlpha = false;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Lclient!ib;")
	public AnimBase base = null;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "Z")
	public boolean transformsColor = false;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "[S")
	public short[] indices;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "[S")
	public short[] x;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "[S")
	public short[] y;

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "[S")
	public short[] z;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "[S")
	public short[] prevOriginIndices;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "[B")
	public byte[] flags;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([BLclient!ib;)V")
	public AnimFrame(@OriginalArg(0) byte[] arg0, @OriginalArg(1) AnimBase arg1) {
		this.base = arg1;
		try {
			@Pc(21) Buffer local21 = new Buffer(arg0);
			@Pc(26) Buffer local26 = new Buffer(arg0);
			local21.pos = 2;
			@Pc(33) int local33 = local21.g1();
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = -1;
			@Pc(39) int local39 = -1;
			local26.pos = local21.pos + local33;
			@Pc(54) int local54;
			for (@Pc(47) int local47 = 0; local47 < local33; local47++) {
				local54 = this.base.types[local47];
				if (local54 == 0) {
					local37 = local47;
				}
				@Pc(62) int local62 = local21.g1();
				if (local62 > 0) {
					if (local54 == 0) {
						local39 = local47;
					}
					tempIndices[local35] = (short) local47;
					@Pc(75) short local75 = 0;
					if (local54 == 3) {
						local75 = 128;
					}
					if ((local62 & 0x1) == 0) {
						tempX[local35] = local75;
					} else {
						tempX[local35] = (short) local26.gsmarts();
					}
					if ((local62 & 0x2) == 0) {
						tempY[local35] = local75;
					} else {
						tempY[local35] = (short) local26.gsmarts();
					}
					if ((local62 & 0x4) == 0) {
						tempZ[local35] = local75;
					} else {
						tempZ[local35] = (short) local26.gsmarts();
					}
					tempFlags[local35] = (byte) (local62 >>> 3 & 0x3);
					if (local54 == 2) {
						tempX[local35] = (short) (((tempX[local35] & 0xFF) << 3) + (tempX[local35] >> 8 & 0x7));
						tempY[local35] = (short) (((tempY[local35] & 0xFF) << 3) + (tempY[local35] >> 8 & 0x7));
						tempZ[local35] = (short) (((tempZ[local35] & 0xFF) << 3) + (tempZ[local35] >> 8 & 0x7));
						tempX[local35] = (short) (tempX[local35] << 3);
						tempY[local35] = (short) (tempY[local35] << 3);
						tempZ[local35] = (short) (tempZ[local35] << 3);
					}
					tempPrevOriginIndices[local35] = -1;
					if (local54 == 1 || local54 == 2 || local54 == 3) {
						if (local37 > local39) {
							tempPrevOriginIndices[local35] = (short) local37;
							local39 = local37;
						}
					} else if (local54 == 5) {
						this.transformsAlpha = true;
					} else if (local54 == 7) {
						this.transformsColor = true;
					}
					local35++;
				}
			}
			if (local26.pos != arg0.length) {
				throw new RuntimeException();
			}
			this.length = local35;
			this.indices = new short[local35];
			this.x = new short[local35];
			this.y = new short[local35];
			this.z = new short[local35];
			this.prevOriginIndices = new short[local35];
			this.flags = new byte[local35];
			for (local54 = 0; local54 < local35; local54++) {
				this.indices[local54] = tempIndices[local54];
				this.x[local54] = tempX[local54];
				this.y[local54] = tempY[local54];
				this.z[local54] = tempZ[local54];
				this.prevOriginIndices[local54] = tempPrevOriginIndices[local54];
				this.flags[local54] = tempFlags[local54];
			}
		} catch (@Pc(350) Exception local350) {
			this.length = 0;
			this.transformsAlpha = false;
			this.transformsColor = false;
		}
	}
}
