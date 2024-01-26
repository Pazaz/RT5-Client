import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mka")
public final class Class245 {

	@OriginalMember(owner = "client!mka", name = "l", descriptor = "I")
	public int anInt6220;

	@OriginalMember(owner = "client!mka", name = "i", descriptor = "I")
	public int anInt6221;

	@OriginalMember(owner = "client!mka", name = "p", descriptor = "I")
	public int anInt6222;

	@OriginalMember(owner = "client!mka", name = "g", descriptor = "I")
	public int anInt6224;

	@OriginalMember(owner = "client!mka", name = "n", descriptor = "I")
	public int anInt6227;

	@OriginalMember(owner = "client!mka", name = "c", descriptor = "I")
	public int anInt6229;

	@OriginalMember(owner = "client!mka", name = "k", descriptor = "I")
	public int anInt6231;

	@OriginalMember(owner = "client!mka", name = "o", descriptor = "I")
	public int anInt6232;

	@OriginalMember(owner = "client!mka", name = "b", descriptor = "I")
	public int anInt6223 = 128;

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "I")
	public int anInt6226 = 128;

	@OriginalMember(owner = "client!mka", name = "h", descriptor = "I")
	public int anInt6225;

	@OriginalMember(owner = "client!mka", name = "<init>", descriptor = "(I)V")
	public Class245(@OriginalArg(0) int arg0) {
		this.anInt6225 = arg0;
	}

	@OriginalMember(owner = "client!mka", name = "<init>", descriptor = "(IIIIII)V")
	private Class245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6222 = arg3;
		this.anInt6226 = arg2;
		this.anInt6229 = arg4;
		this.anInt6223 = arg1;
		this.anInt6225 = arg0;
		this.anInt6231 = arg5;
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(Lclient!mka;I)V")
	public void method5573(@OriginalArg(0) Class245 arg0) {
		this.anInt6229 = arg0.anInt6229;
		this.anInt6222 = arg0.anInt6222;
		this.anInt6223 = arg0.anInt6223;
		this.anInt6226 = arg0.anInt6226;
		this.anInt6225 = arg0.anInt6225;
		this.anInt6231 = arg0.anInt6231;
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(B)Lclient!mka;")
	public Class245 method5574() {
		return new Class245(this.anInt6225, this.anInt6223, this.anInt6226, this.anInt6222, this.anInt6229, this.anInt6231);
	}
}
