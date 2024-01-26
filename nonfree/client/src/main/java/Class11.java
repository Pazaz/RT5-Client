import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.lh;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class11 implements Interface20 {

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
	private int anInt134;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
	private int anInt135;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "Z")
	private boolean aBoolean12 = false;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "Lclient!wda;")
	private final Class397 aClass397_1;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "Lclient!kea;")
	private final Class19_Sub1_Sub1 aClass19_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "Z")
	private final boolean aBoolean11;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!kea;Lclient!wda;Z)V")
	public Class11(@OriginalArg(0) Class19_Sub1_Sub1 arg0, @OriginalArg(1) Class397 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass397_1 = arg1;
		this.aClass19_Sub1_Sub1_1 = arg0;
		this.aBoolean11 = arg2;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method8547() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(21) boolean local21 = this.aBoolean11 & true;
		if (!this.aBoolean12 && lh.a((byte) 86, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt135, local21 ? 8192 : 0, this.aClass19_Sub1_Sub1_1.aGeometryBuffer1))) {
			this.aBoolean12 = true;
			return this.aClass19_Sub1_Sub1_1.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)I")
	@Override
	public int method8536() {
		return this.anInt134;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
	@Override
	public void method8543(@OriginalArg(1) int arg0) {
		this.anInt134 = arg0 * this.aClass397_1.anInt10568;
		if (this.anInt135 >= this.anInt134) {
			return;
		}
		@Pc(27) short local27 = 8;
		@Pc(32) byte local32;
		if (this.aBoolean11) {
			local27 = 520;
			local32 = 0;
		} else {
			local32 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(110);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass19_Sub1_Sub1_1.anIDirect3DDevice1.a(this.anInt134, local27, this.aClass397_1 == Static702.aClass397_17 ? 101 : 102, local32, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt135 = this.anInt134;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)Lclient!wda;")
	@Override
	public Class397 method8548() {
		return this.aClass397_1;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8546() {
		if (this.aBoolean12 && lh.a((byte) 61, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean12 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
	@Override
	public void method8538() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(39);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt135 = 0;
		this.anInt134 = 0;
	}
}
