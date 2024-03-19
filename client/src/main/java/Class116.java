import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public final class Class116 {

	@OriginalMember(owner = "client!la", name = "c", descriptor = "Lclient!ao;")
	public Class11 aClass11_8;

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Lclient!la;")
	public Class116 aClass116_1;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "I")
	public int anInt4038;

	@OriginalMember(owner = "client!la", name = "j", descriptor = "I")
	public int anInt4040;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "I")
	public int anInt4043;

	@OriginalMember(owner = "client!la", name = "e", descriptor = "I")
	public final int anInt4036;

	@OriginalMember(owner = "client!la", name = "i", descriptor = "I")
	public final int anInt4039;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(II)V")
	public Class116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4036 = arg0;
		this.anInt4039 = arg1;
	}

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!la;I)V")
	public Class116(@OriginalArg(0) Class116 arg0, @OriginalArg(1) int arg1) {
		this.aClass116_1 = arg0;
		this.anInt4036 = this.aClass116_1.anInt4036;
		this.aClass11_8 = this.aClass116_1.aClass11_8;
		this.anInt4039 = arg1 + this.aClass116_1.anInt4039;
	}
}
