import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ala")
public final class Class18 {

	@OriginalMember(owner = "client!ala", name = "i", descriptor = "I")
	public int anInt262;

	@OriginalMember(owner = "client!ala", name = "h", descriptor = "I")
	public int anInt263;

	@OriginalMember(owner = "client!ala", name = "e", descriptor = "I")
	public int anInt267;

	@OriginalMember(owner = "client!ala", name = "c", descriptor = "I")
	public int anInt266 = 128;

	@OriginalMember(owner = "client!ala", name = "g", descriptor = "I")
	public int anInt268 = 128;

	@OriginalMember(owner = "client!ala", name = "f", descriptor = "I")
	public int anInt269;

	@OriginalMember(owner = "client!ala", name = "<init>", descriptor = "(I)V")
	public Class18(@OriginalArg(0) int arg0) {
		this.anInt269 = arg0;
	}

	@OriginalMember(owner = "client!ala", name = "<init>", descriptor = "(IIIIII)V")
	private Class18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt262 = arg3;
		this.anInt263 = arg4;
		this.anInt266 = arg2;
		this.anInt269 = arg0;
		this.anInt267 = arg5;
		this.anInt268 = arg1;
	}

	@OriginalMember(owner = "client!ala", name = "a", descriptor = "(B)Lclient!ala;")
	public Class18 method270() {
		return new Class18(this.anInt269, this.anInt268, this.anInt266, this.anInt262, this.anInt263, this.anInt267);
	}

	@OriginalMember(owner = "client!ala", name = "a", descriptor = "(ZLclient!ala;)V")
	public void method271(@OriginalArg(1) Class18 arg0) {
		this.anInt263 = arg0.anInt263;
		this.anInt269 = arg0.anInt269;
		this.anInt267 = arg0.anInt267;
		this.anInt268 = arg0.anInt268;
		this.anInt266 = arg0.anInt266;
		this.anInt262 = arg0.anInt262;
	}
}
