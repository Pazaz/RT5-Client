import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public abstract class Class44 implements Interface9 {

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "Z")
	private boolean aBoolean468 = false;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "Lclient!ih;")
	protected final Class40_Sub2 aClass40_Sub2_37;

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
	public final int anInt6479;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
	protected final int anInt6476;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "Z")
	private boolean aBoolean469;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
	private final int anInt6477;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
	protected int anInt6478;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!ih;IIIZ)V")
	protected Class44(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass40_Sub2_37 = arg0;
		this.anInt6479 = arg1;
		this.anInt6476 = arg2;
		this.aBoolean469 = arg4;
		this.anInt6477 = arg3;
		this.aClass40_Sub2_37.anOpengl1.glGenTextures(1, Static48.anIntArray497, 0);
		this.anInt6478 = Static48.anIntArray497[0];
		this.method5452(0);
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "()I")
	public final int method5449() {
		return this.anInt6478;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "()V")
	public final void method5451() {
		if (this.anInt6478 > 0) {
			this.aClass40_Sub2_37.method2879(this.anInt6478, this.method5459());
			this.anInt6478 = 0;
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
	private void method5452(@OriginalArg(0) int arg0) {
		this.aClass40_Sub2_37.anInt3201 -= arg0;
		this.aClass40_Sub2_37.anInt3201 += this.method5459();
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "()Z")
	public final boolean method5453() {
		@Pc(3) opengl local3 = this.aClass40_Sub2_37.anOpengl1;
		if (!this.aClass40_Sub2_37.aBoolean214) {
			return false;
		}
		@Pc(10) int local10 = this.method5459();
		this.aClass40_Sub2_37.method2882(this);
		local3.glGenerateMipmapEXT(this.anInt6479);
		this.aBoolean469 = true;
		this.method5454();
		this.method5452(local10);
		return true;
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "()V")
	private void method5454() {
		@Pc(3) opengl local3 = this.aClass40_Sub2_37.anOpengl1;
		this.aClass40_Sub2_37.method2882(this);
		if (this.aBoolean468) {
			local3.glTexParameteri(this.anInt6479, 10241, this.aBoolean469 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt6479, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt6479, 10241, this.aBoolean469 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt6479, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!dg", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5451();
		super.finalize();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
	public final void method5455(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean468 != arg0) {
			this.aBoolean468 = arg0;
			this.method5454();
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)V")
	protected final void method5458(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean469 != arg0) {
			@Pc(6) int local6 = this.method5459();
			this.aBoolean469 = true;
			this.method5454();
			this.method5452(local6);
		}
	}

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "()I")
	private int method5459() {
		@Pc(8) int local8 = this.aClass40_Sub2_37.method2826(this.anInt6476) * this.anInt6477;
		return this.aBoolean469 ? local8 * 4 / 3 : local8;
	}
}
