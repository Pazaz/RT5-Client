import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class139 {

	@OriginalMember(owner = "client!gba", name = "j", descriptor = "I")
	public int anInt3261 = 0;

	@OriginalMember(owner = "client!gba", name = "d", descriptor = "I")
	public int anInt3264 = 0;

	@OriginalMember(owner = "client!gba", name = "e", descriptor = "Lclient!dla;")
	private final Class82 aClass82_70 = new Class82(64);

	@OriginalMember(owner = "client!gba", name = "f", descriptor = "Lclient!raa;")
	private Interface19 anInterface19_1 = null;

	@OriginalMember(owner = "client!gba", name = "i", descriptor = "Lclient!sb;")
	private final Class330 aClass330_40;

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "Lclient!sb;")
	private final Class330 aClass330_41;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(ILclient!sb;Lclient!sb;Lclient!raa;)V")
	public Class139(@OriginalArg(0) int arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) Class330 arg2, @OriginalArg(3) Interface19 arg3) {
		this.anInterface19_1 = arg3;
		this.aClass330_40 = arg1;
		this.aClass330_41 = arg2;
		if (this.aClass330_40 != null) {
			this.anInt3264 = this.aClass330_40.method7608(1);
		}
		if (this.aClass330_41 != null) {
			this.anInt3261 = this.aClass330_41.method7608(1);
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!it;J[II)Ljava/lang/String;")
	public String method2948(@OriginalArg(0) Class184 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int[] arg2) {
		if (this.anInterface19_1 != null) {
			@Pc(22) String local22 = this.anInterface19_1.method5631(arg1, arg0, arg2);
			if (local22 != null) {
				return local22;
			}
		}
		return Long.toString(arg1);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IZ)Lclient!ih;")
	public Class2_Sub2_Sub12 method2950(@OriginalArg(0) int arg0) {
		@Pc(11) Class2_Sub2_Sub12 local11 = (Class2_Sub2_Sub12) this.aClass82_70.method2156((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(28) byte[] local28;
		if (arg0 >= 32768) {
			local28 = this.aClass330_41.method7595(arg0 & 0x7FFF, 1);
		} else {
			local28 = this.aClass330_40.method7595(arg0, 1);
		}
		local11 = new Class2_Sub2_Sub12();
		local11.aClass139_1 = this;
		if (local28 != null) {
			local11.method3899(new Packet(local28));
		}
		if (arg0 >= 32768) {
			local11.method3902();
		}
		this.aClass82_70.method2150(local11, (long) arg0);
		return local11;
	}
}
