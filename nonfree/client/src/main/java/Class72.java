import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public abstract class Class72 implements Interface21 {

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
	private int anInt9726;

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
	private int anInt9733;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
	private int anInt9721 = -1;

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
	private int anInt9732 = 0;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "Z")
	private final boolean aBoolean751;

	@OriginalMember(owner = "client!cr", name = "t", descriptor = "I")
	private final int anInt9723;

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "Lclient!tca;")
	protected final Class19_Sub1_Sub2 aClass19_Sub1_Sub2_11;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!tca;IZ)V")
	protected Class72(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean751 = arg2;
		this.anInt9723 = arg1;
		this.aClass19_Sub1_Sub2_11 = arg0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)V")
	public void method8538() {
		if (this.anInt9721 > 0) {
			this.aClass19_Sub1_Sub2_11.method8164(this.anInt9721, this.anInt9726);
			this.anInt9721 = -1;
		}
	}

	@OriginalMember(owner = "client!cr", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8538();
		super.finalize();
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)J")
	public final long method8539() {
		return this.anInt9721 == 0 ? this.aNativeHeapBuffer7.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!jaclib/memory/Source;Z)Z")
	protected final boolean method8540(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1) {
		if (arg0 > this.anInt9733) {
			this.method8545();
			if (this.anInt9721 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt9723, this.anInt9721);
			OpenGL.glBufferDataARBa(this.anInt9723, arg0, arg1.getAddress(), this.aBoolean751 ? 35040 : 35044);
			this.aClass19_Sub1_Sub2_11.anInt9141 += arg0 - this.anInt9726;
			this.anInt9733 = arg0;
		} else if (this.anInt9721 > 0) {
			OpenGL.glBindBufferARB(this.anInt9723, this.anInt9721);
			OpenGL.glBufferSubDataARBa(this.anInt9723, 0, this.anInt9726, arg1.getAddress());
			this.aClass19_Sub1_Sub2_11.anInt9141 += arg0 - this.anInt9726;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt9726 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!jaggl/MapBuffer;)Z")
	protected final boolean method8541(@OriginalArg(1) MapBuffer arg0) {
		@Pc(13) boolean local13 = true;
		if (this.anInt9732 != 0) {
			if (this.anInt9721 > 0) {
				OpenGL.glBindBufferARB(this.anInt9723, this.anInt9721);
				if (this.anInt9732 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt9723, 0, this.anInt9733, this.aClass19_Sub1_Sub2_11.aNativeHeapBuffer6.getAddress());
				} else {
					local13 = arg0.b();
				}
			}
			this.anInt9732 = 0;
		}
		return local13;
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)V")
	public final void method8542() {
		if (this.aClass19_Sub1_Sub2_11.aBoolean704) {
			OpenGL.glBindBufferARB(this.anInt9723, this.anInt9721);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)V")
	public void method8543(@OriginalArg(1) int arg0) {
		if (arg0 > this.anInt9733) {
			this.method8545();
			if (this.anInt9721 > 0) {
				OpenGL.glBindBufferARB(this.anInt9723, this.anInt9721);
				OpenGL.glBufferDataARBub(this.anInt9723, arg0, (byte[]) null, 0, this.aBoolean751 ? 35040 : 35044);
				this.aClass19_Sub1_Sub2_11.anInt9141 += arg0 - this.anInt9733;
			} else {
				this.aNativeHeapBuffer7 = this.aClass19_Sub1_Sub2_11.method8106(false, arg0);
			}
			this.anInt9733 = arg0;
		}
		this.anInt9726 = arg0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZLclient!jaggl/MapBuffer;I)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method8544(@OriginalArg(1) MapBuffer arg0) {
		if (this.anInt9732 == 0) {
			this.method8545();
			if (this.anInt9721 <= 0) {
				this.anInt9732 = 2;
				return this.aNativeHeapBuffer7;
			}
			OpenGL.glBindBufferARB(this.anInt9723, this.anInt9721);
			OpenGL.glBufferDataARBub(this.anInt9723, this.anInt9733, (byte[]) null, 0, this.aBoolean751 ? 35040 : 35044);
			if (this.aClass19_Sub1_Sub2_11.aNativeHeapBuffer6.b >= this.anInt9726) {
				this.anInt9732 = 1;
				return this.aClass19_Sub1_Sub2_11.aNativeHeapBuffer6;
			}
			if (!arg0.a() && arg0.a(this.anInt9723, this.anInt9726, 35001)) {
				this.anInt9732 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)I")
	@Override
	public int method8536() {
		return this.anInt9726;
	}

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "(I)V")
	private void method8545() {
		if (this.anInt9721 >= 0) {
			return;
		}
		if (this.aClass19_Sub1_Sub2_11.aBoolean704) {
			OpenGL.glGenBuffersARB(1, Static581.anIntArray687, 0);
			this.anInt9721 = Static581.anIntArray687[0];
			OpenGL.glBindBufferARB(this.anInt9723, this.anInt9721);
		} else {
			this.anInt9721 = 0;
		}
	}
}
