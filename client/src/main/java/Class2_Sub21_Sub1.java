import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public final class Class2_Sub21_Sub1 extends Class2_Sub21 {

	@OriginalMember(owner = "client!jn", name = "w", descriptor = "Z")
	public boolean aBoolean219;

	@OriginalMember(owner = "client!jn", name = "t", descriptor = "I")
	public int anInt3176;

	@OriginalMember(owner = "client!jn", name = "x", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!jn", name = "v", descriptor = "I")
	public int anInt3178;

	@OriginalMember(owner = "client!jn", name = "u", descriptor = "I")
	public int anInt3177;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub21_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3176 = arg0;
		this.aByteArray31 = arg1;
		this.anInt3178 = arg2;
		this.anInt3177 = arg3;
	}

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub21_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3176 = arg0;
		this.aByteArray31 = arg1;
		this.anInt3178 = arg2;
		this.anInt3177 = arg3;
		this.aBoolean219 = arg4;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!wp;)Lclient!jn;")
	public Class2_Sub21_Sub1 method3179(@OriginalArg(0) PcmResampler arg0) {
		this.aByteArray31 = arg0.method6446(this.aByteArray31);
		this.anInt3176 = arg0.method6445(this.anInt3176);
		if (this.anInt3178 == this.anInt3177) {
			this.anInt3178 = this.anInt3177 = arg0.method6447(this.anInt3178);
		} else {
			this.anInt3178 = arg0.method6447(this.anInt3178);
			this.anInt3177 = arg0.method6447(this.anInt3177);
			if (this.anInt3178 == this.anInt3177) {
				this.anInt3178--;
			}
		}
		return this;
	}
}
