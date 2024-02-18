import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class94 {

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "S")
	public final short aShort29;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "B")
	public final byte aByte47;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "B")
	public byte aByte46;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Lclient!jc;")
	public Interface12 anInterface12_2;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!jc;III)V")
	public Class94(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aShort29 = (short) arg1;
		this.aByte47 = (byte) arg2;
		this.aByte46 = (byte) arg3;
		this.anInterface12_2 = arg0;
	}
}
