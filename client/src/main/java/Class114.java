import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class114 implements Interface5 {

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
	private int anInt3974;

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
	private int anInt3976;

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
	private int anInt3977;

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "[Lclient!ur;")
	private final Interface9[] anInterface9Array1 = new Interface9[9];

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "Lclient!ih;")
	private final Class40_Sub2 aClass40_Sub2_20;

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
	private final int anInt3975;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class114(@OriginalArg(0) Class40_Sub2 arg0) {
		if (!arg0.aBoolean214) {
			throw new IllegalStateException("");
		}
		this.aClass40_Sub2_20 = arg0;
		this.aClass40_Sub2_20.anOpengl1.glGenFramebuffersEXT(1, Static163.anIntArray279, 0);
		this.anInt3975 = Static163.anIntArray279[0];
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "()V")
	@Override
	public void method3417() {
		this.aClass40_Sub2_20.anOpengl1.glBindFramebufferEXT(36160, this.anInt3975);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "()V")
	@Override
	public void method3416() {
		this.aClass40_Sub2_20.anOpengl1.glBindFramebufferEXT(36160, 0);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
	public void method3419(@OriginalArg(0) int arg0) {
		if (this.anInterface9Array1[arg0] != null) {
			this.anInterface9Array1[arg0].method6123();
		}
		this.anInt3974 &= ~(0x1 << arg0);
		this.anInterface9Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V")
	public void method3420(@OriginalArg(0) int arg0) {
		if (this.aClass40_Sub2_20.method2820() != this) {
			throw new RuntimeException();
		}
		this.aClass40_Sub2_20.anOpengl1.glDrawBuffer(Static163.anIntArray280[arg0]);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILclient!wk;)V")
	public void method3421(@OriginalArg(1) Class217 arg0) {
		if (this.aClass40_Sub2_20.method2820() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt3974 & 0xFFFFFEFF) == 0) {
			this.anInt3976 = arg0.anInt7315;
			this.anInt3977 = arg0.anInt7316;
		} else if (arg0.anInt7315 != this.anInt3976 || arg0.anInt7316 != this.anInt3977) {
			throw new RuntimeException();
		}
		arg0.method6125(Static163.anIntArray280[8]);
		this.anInterface9Array1[8] = arg0;
		this.anInt3974 |= 0x100;
	}

	@OriginalMember(owner = "client!kq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass40_Sub2_20.method2842(this.anInt3975);
		super.finalize();
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "()I")
	@Override
	public int method3418() {
		return this.anInt3977;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILclient!sg;I)V")
	public void method3422(@OriginalArg(1) Class44_Sub3 arg0, @OriginalArg(2) int arg1) {
		this.method3425(arg0, arg1);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILclient!eq;I)V")
	private void method3423(@OriginalArg(0) int arg0, @OriginalArg(1) Class44_Sub1 arg1) {
		if (this.aClass40_Sub2_20.method2820() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt3974 & ~local12) == 0) {
			this.anInt3976 = arg1.anInt4848;
			this.anInt3977 = arg1.anInt4847;
		} else if (arg1.anInt4848 != this.anInt3976 || arg1.anInt4847 != this.anInt3977) {
			throw new RuntimeException();
		}
		arg1.method4160(Static163.anIntArray280[arg0]);
		this.anInterface9Array1[arg0] = arg1;
		this.anInt3974 |= local12;
	}

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "()Z")
	public boolean method3424() {
		@Pc(5) int local5 = this.aClass40_Sub2_20.anOpengl1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILclient!sg;II)V")
	private void method3425(@OriginalArg(1) Class44_Sub3 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass40_Sub2_20.method2820() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt3974 & 0xFFFFFFFE) == 0) {
			this.anInt3976 = arg0.anInt5999;
			this.anInt3977 = arg0.anInt5999;
		} else if (arg0.anInt5999 != this.anInt3976 || arg0.anInt5999 != this.anInt3977) {
			throw new RuntimeException();
		}
		arg0.method5076(Static163.anIntArray280[0], arg1);
		this.anInterface9Array1[0] = arg0;
		this.anInt3974 |= 0x1;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILclient!eq;)V")
	public void method3426(@OriginalArg(0) int arg0, @OriginalArg(1) Class44_Sub1 arg1) {
		this.method3423(arg0, arg1);
	}
}
