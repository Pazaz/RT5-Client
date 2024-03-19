import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class154 {

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "Lclient!de;")
	public Class7_Sub3 aClass7_Sub3_1;

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "Lclient!pm;")
	public Class154 aClass154_1;

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "Z")
	public boolean aBoolean369;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "B")
	public byte aByte42;

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "Lclient!lc;")
	public Class117 aClass117_1;

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "Lclient!is;")
	public Class93 aClass93_3;

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "B")
	public byte aByte43;

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "B")
	public byte aByte44;

	@OriginalMember(owner = "client!pm", name = "v", descriptor = "S")
	public short aShort64;

	@OriginalMember(owner = "client!pm", name = "x", descriptor = "Lclient!br;")
	public Class7_Sub2 aClass7_Sub2_1;

	@OriginalMember(owner = "client!pm", name = "y", descriptor = "Z")
	public boolean aBoolean370;

	@OriginalMember(owner = "client!pm", name = "z", descriptor = "B")
	public byte aByte47;

	@OriginalMember(owner = "client!pm", name = "A", descriptor = "Lclient!br;")
	public Class7_Sub2 aClass7_Sub2_2;

	@OriginalMember(owner = "client!pm", name = "B", descriptor = "Lclient!hl;")
	public Class7_Sub4 aClass7_Sub4_1;

	@OriginalMember(owner = "client!pm", name = "C", descriptor = "Z")
	public boolean aBoolean371;

	@OriginalMember(owner = "client!pm", name = "D", descriptor = "Lclient!de;")
	public Class7_Sub3 aClass7_Sub3_2;

	@OriginalMember(owner = "client!pm", name = "E", descriptor = "Lclient!s;")
	public Class7_Sub5 aClass7_Sub5_1;

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "B")
	public byte aByte41 = 0;

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "S")
	public final short aShort62;

	@OriginalMember(owner = "client!pm", name = "t", descriptor = "B")
	public byte aByte45;

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "B")
	public byte aByte46;

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "S")
	public final short aShort63;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(III)V")
	public Class154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort62 = (short) arg1;
		this.aByte46 = this.aByte45 = (byte) arg0;
		this.aShort63 = (short) arg2;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
	public void method4505() {
		while (this.aClass93_3 != null) {
			@Pc(16) Class93 local16 = this.aClass93_3.aClass93_2;
			this.aClass93_3.method3030();
			this.aClass93_3 = local16;
		}
		this.aByte41 = 0;
	}
}
