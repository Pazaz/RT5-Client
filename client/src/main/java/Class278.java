import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class278 {

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
	public int anInt6973;

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
	public int anInt6975;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
	public int anInt6976;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "J")
	public long aLong221;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
	public int anInt6979;

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
	public int anInt6980;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
	public int anInt6982;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
	public int anInt6985;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
	public int anInt6986;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
	public int anInt6987;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
	private int anInt6988;

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
	public int anInt6978 = 0;

	@OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
	public int anInt6984 = 0;

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "Z")
	private boolean aBoolean530 = false;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!ge;II)V")
	private void method6271(@OriginalArg(0) Class2_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6988 = arg0.method7382();
		} else if (arg1 == 2) {
			arg0.method7396();
		} else if (arg1 == 3) {
			this.anInt6979 = arg0.method7349();
			this.anInt6987 = arg0.method7349();
			this.anInt6975 = arg0.method7349();
		} else if (arg1 == 4) {
			this.anInt6985 = arg0.method7396();
			this.anInt6973 = arg0.method7349();
		} else if (arg1 == 6) {
			this.anInt6982 = arg0.method7396();
		} else if (arg1 == 8) {
			this.anInt6978 = 1;
		} else if (arg1 == 9) {
			this.anInt6984 = 1;
		} else if (arg1 == 10) {
			this.aBoolean530 = true;
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V")
	public void method6273() {
		this.anInt6976 = Class361.anIntArray740[this.anInt6988 << 3];
		@Pc(15) long local15 = (long) this.anInt6979;
		@Pc(19) long local19 = (long) this.anInt6987;
		@Pc(23) long local23 = (long) this.anInt6975;
		this.anInt6986 = (int) Math.sqrt((double) (local15 * local15 + local19 * local19 + local23 * local23));
		if (this.anInt6973 == 0) {
			this.anInt6973 = 1;
		}
		if (this.anInt6985 == 0) {
			this.aLong221 = 2147483647L;
		} else if (this.anInt6985 == 1) {
			this.aLong221 = (long) (this.anInt6986 * 8 / this.anInt6973);
			this.aLong221 *= this.aLong221;
		} else if (this.anInt6985 == 2) {
			this.aLong221 = (long) (this.anInt6986 * 8 / this.anInt6973);
		}
		if (this.aBoolean530) {
			this.anInt6986 *= -1;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLclient!ge;)V")
	public void method6274(@OriginalArg(1) Class2_Sub21 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method7396();
			if (local17 == 0) {
				return;
			}
			this.method6271(arg0, local17);
		}
	}
}
