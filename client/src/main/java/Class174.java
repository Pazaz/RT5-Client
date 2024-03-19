import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class174 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "Lclient!oa;")
	public Class44_Sub2 aClass44_Sub2_1 = null;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "Lclient!oa;")
	public Class44_Sub2 aClass44_Sub2_2 = null;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "[Lclient!eq;")
	public Class44_Sub1[] aClass44_Sub1Array3 = null;

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "[Lclient!eq;")
	public Class44_Sub1[] aClass44_Sub1Array4 = null;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "Z")
	public final boolean aBoolean397;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class174(@OriginalArg(0) Class40_Sub2 arg0) {
		this.aBoolean397 = arg0.aBoolean208;
		Static269.method4855();
		@Pc(24) byte[] local24;
		if (this.aBoolean397) {
			local24 = new byte[524288];
			Static269.aByteBuffer5.get(local24);
			Static269.aByteBuffer5.position(0);
			this.aClass44_Sub2_2 = new Class44_Sub2(arg0, 6410, 128, 128, 16, local24, 6410);
			Static269.aByteBuffer6.get(local24);
			Static269.aByteBuffer6.position(0);
			this.aClass44_Sub2_1 = new Class44_Sub2(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass44_Sub1Array3 = new Class44_Sub1[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static269.aByteBuffer5.get(local24, 0, 32768);
				this.aClass44_Sub1Array3[local30] = new Class44_Sub1(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static269.aByteBuffer5.position(0);
			this.aClass44_Sub1Array4 = new Class44_Sub1[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static269.aByteBuffer6.get(local24, 0, 32768);
				this.aClass44_Sub1Array4[local30] = new Class44_Sub1(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static269.aByteBuffer6.position(0);
		}
	}
}
