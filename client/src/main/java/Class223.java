import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public final class Class223 {

	@OriginalMember(owner = "client!lfa", name = "o", descriptor = "I")
	public int anInt5800;

	@OriginalMember(owner = "client!lfa", name = "n", descriptor = "I")
	public int anInt5803;

	@OriginalMember(owner = "client!lfa", name = "f", descriptor = "I")
	public int anInt5807;

	@OriginalMember(owner = "client!lfa", name = "j", descriptor = "I")
	public int anInt5802 = 128;

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
	public int anInt5809 = 128;

	@OriginalMember(owner = "client!lfa", name = "h", descriptor = "I")
	public int anInt5805;

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(I)V")
	public Class223(@OriginalArg(0) int arg0) {
		this.anInt5805 = arg0;
	}

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(IIIIII)V")
	private Class223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5800 = arg4;
		this.anInt5809 = arg1;
		this.anInt5807 = arg3;
		this.anInt5805 = arg0;
		this.anInt5802 = arg2;
		this.anInt5803 = arg5;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Z)Lclient!lfa;")
	public Class223 method5227() {
		return new Class223(this.anInt5805, this.anInt5809, this.anInt5802, this.anInt5807, this.anInt5800, this.anInt5803);
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(BLclient!lfa;)V")
	public void method5229(@OriginalArg(1) Class223 arg0) {
		this.anInt5803 = arg0.anInt5803;
		this.anInt5802 = arg0.anInt5802;
		this.anInt5805 = arg0.anInt5805;
		this.anInt5807 = arg0.anInt5807;
		this.anInt5800 = arg0.anInt5800;
		this.anInt5809 = arg0.anInt5809;
	}
}
