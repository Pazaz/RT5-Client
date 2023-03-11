import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class76 {

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "Lclient!vk;")
	public Class8_Sub4 aClass8_Sub4_1 = null;

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "[Lclient!al;")
	public Class8_Sub1[] aClass8_Sub1Array1 = null;

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "[Lclient!al;")
	public Class8_Sub1[] aClass8_Sub1Array2 = null;

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "Lclient!vk;")
	public Class8_Sub4 aClass8_Sub4_2 = null;

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "Z")
	public final boolean aBoolean160;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!bf;)V")
	public Class76(@OriginalArg(0) Class19_Sub1 arg0) {
		this.aBoolean160 = arg0.aBoolean55;
		Static104.method2182();
		@Pc(24) byte[] local24;
		if (this.aBoolean160) {
			local24 = new byte[524288];
			Static104.aByteBuffer1.get(local24);
			Static104.aByteBuffer1.position(0);
			this.aClass8_Sub4_2 = new Class8_Sub4(arg0, 6410, 128, 128, 16, local24, 6410);
			Static104.aByteBuffer2.get(local24);
			Static104.aByteBuffer2.position(0);
			this.aClass8_Sub4_1 = new Class8_Sub4(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass8_Sub1Array1 = new Class8_Sub1[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static104.aByteBuffer1.get(local24, 0, 32768);
				this.aClass8_Sub1Array1[local30] = new Class8_Sub1(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static104.aByteBuffer1.position(0);
			this.aClass8_Sub1Array2 = new Class8_Sub1[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static104.aByteBuffer2.get(local24, 0, 32768);
				this.aClass8_Sub1Array2[local30] = new Class8_Sub1(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static104.aByteBuffer2.position(0);
		}
	}
}
