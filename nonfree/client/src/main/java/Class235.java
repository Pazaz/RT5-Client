import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public final class Class235 implements Interface10 {

	@OriginalMember(owner = "client!lv", name = "o", descriptor = "I")
	public final int anInt5970;

	@OriginalMember(owner = "client!lv", name = "j", descriptor = "I")
	public final int anInt5971;

	@OriginalMember(owner = "client!lv", name = "g", descriptor = "Lclient!ek;")
	public final Class103 aClass103_11;

	@OriginalMember(owner = "client!lv", name = "m", descriptor = "I")
	public final int anInt5977;

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
	public final int anInt5972;

	@OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
	public final int anInt5976;

	@OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
	public final int anInt5974;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "Lclient!wk;")
	public final Class403 aClass403_11;

	@OriginalMember(owner = "client!lv", name = "l", descriptor = "I")
	public final int anInt5978;

	@OriginalMember(owner = "client!lv", name = "i", descriptor = "Z")
	public final boolean aBoolean454;

	@OriginalMember(owner = "client!lv", name = "h", descriptor = "I")
	public final int anInt5975;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(ILclient!wk;Lclient!ek;IIIIIIIZ)V")
	public Class235(@OriginalArg(0) int arg0, @OriginalArg(1) Class403 arg1, @OriginalArg(2) Class103 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt5970 = arg6;
		this.anInt5971 = arg7;
		this.aClass103_11 = arg2;
		this.anInt5977 = arg3;
		this.anInt5972 = arg9;
		this.anInt5976 = arg5;
		this.anInt5974 = arg4;
		this.aClass403_11 = arg1;
		this.anInt5978 = arg0;
		this.aBoolean454 = arg10;
		this.anInt5975 = arg8;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)Lclient!kda;")
	@Override
	public Class204 method5357() {
		return Static166.aClass204_6;
	}
}
