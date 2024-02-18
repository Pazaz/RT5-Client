import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pha")
public final class Class291 {

	@OriginalMember(owner = "client!pha", name = "n", descriptor = "Lclient!kp;")
	public Class8_Sub2_Sub3 aClass8_Sub2_Sub3_1;

	@OriginalMember(owner = "client!pha", name = "c", descriptor = "Lclient!pha;")
	public Class291 aClass291_1;

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "Lclient!pba;")
	public Class286 aClass286_2;

	@OriginalMember(owner = "client!pha", name = "h", descriptor = "S")
	public short aShort83;

	@OriginalMember(owner = "client!pha", name = "o", descriptor = "Lclient!kp;")
	public Class8_Sub2_Sub3 aClass8_Sub2_Sub3_2;

	@OriginalMember(owner = "client!pha", name = "q", descriptor = "Lclient!tla;")
	public Class8_Sub2_Sub4 aClass8_Sub2_Sub4_1;

	@OriginalMember(owner = "client!pha", name = "g", descriptor = "Lclient!nda;")
	public Class8_Sub2_Sub5 aClass8_Sub2_Sub5_1;

	@OriginalMember(owner = "client!pha", name = "f", descriptor = "Lclient!eia;")
	public Class8_Sub2_Sub2 aClass8_Sub2_Sub2_1;

	@OriginalMember(owner = "client!pha", name = "p", descriptor = "S")
	public short aShort84;

	@OriginalMember(owner = "client!pha", name = "d", descriptor = "Lclient!tla;")
	public Class8_Sub2_Sub4 aClass8_Sub2_Sub4_2;

	@OriginalMember(owner = "client!pha", name = "j", descriptor = "S")
	public short aShort85;

	@OriginalMember(owner = "client!pha", name = "l", descriptor = "S")
	public short aShort86;

	@OriginalMember(owner = "client!pha", name = "i", descriptor = "B")
	public byte aByte116;

	@OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(I)V")
	public Class291(@OriginalArg(0) int arg0) {
		this.aByte116 = (byte) arg0;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(I)V")
	public void method6550() {
		while (this.aClass286_2 != null) {
			@Pc(11) Class286 local11 = this.aClass286_2.aClass286_1;
			this.aClass286_2.method6459();
			this.aClass286_2 = local11;
		}
	}
}
