import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public final class Class328 {

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
	public int anInt8502;

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
	public int anInt8503;

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
	public int anInt8504;

	@OriginalMember(owner = "client!rv", name = "x", descriptor = "I")
	public int anInt8507;

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "I")
	public int anInt8509;

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "I")
	public int anInt8512;

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "Lclient!rv;")
	public Class328 aClass328_2;

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "I")
	public int anInt8516;

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
	public int anInt8518;

	@OriginalMember(owner = "client!rv", name = "t", descriptor = "I")
	public int anInt8520;

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "B")
	public final byte aByte130;

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
	public final int anInt8514;

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
	public final int anInt8508;

	@OriginalMember(owner = "client!rv", name = "v", descriptor = "I")
	public final int anInt8505;

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "I")
	private final int anInt8506;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(IIIIB)V")
	public Class328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte130 = arg4;
		this.anInt8514 = arg1;
		this.anInt8508 = arg2;
		this.anInt8505 = arg3;
		this.anInt8506 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)Lclient!vaa;")
	public Class379 method7547() {
		return Static444.method5994(this.anInt8506);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZIII)Lclient!rv;")
	public Class328 method7554(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class328(this.anInt8506, arg0, arg1, arg2, this.aByte130);
	}
}
