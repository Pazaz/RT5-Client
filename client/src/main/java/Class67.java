import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class67 {

	@OriginalMember(owner = "client!f", name = "c", descriptor = "Z")
	public boolean aBoolean136;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "Lclient!cj;")
	public Class11_Sub3 aClass11_Sub3_2;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "Lclient!el;")
	public Class11_Sub2 aClass11_Sub2_2;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "B")
	public byte aByte9;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "Lclient!bi;")
	public Class22 aClass22_2;

	@OriginalMember(owner = "client!f", name = "l", descriptor = "Lclient!gq;")
	public Class11_Sub1 aClass11_Sub1_2;

	@OriginalMember(owner = "client!f", name = "n", descriptor = "Lclient!cj;")
	public Class11_Sub3 aClass11_Sub3_3;

	@OriginalMember(owner = "client!f", name = "o", descriptor = "S")
	public short aShort21;

	@OriginalMember(owner = "client!f", name = "q", descriptor = "B")
	public byte aByte11;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "Lclient!tp;")
	public Class224 aClass224_1;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "Lclient!da;")
	public Class11_Sub4 aClass11_Sub4_1;

	@OriginalMember(owner = "client!f", name = "v", descriptor = "B")
	public byte aByte12;

	@OriginalMember(owner = "client!f", name = "w", descriptor = "Z")
	public boolean aBoolean137;

	@OriginalMember(owner = "client!f", name = "z", descriptor = "B")
	public byte aByte13;

	@OriginalMember(owner = "client!f", name = "B", descriptor = "Lclient!f;")
	public Class67 aClass67_1;

	@OriginalMember(owner = "client!f", name = "C", descriptor = "Z")
	public boolean aBoolean138;

	@OriginalMember(owner = "client!f", name = "D", descriptor = "Lclient!gq;")
	public Class11_Sub1 aClass11_Sub1_3;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "B")
	public byte aByte8 = 0;

	@OriginalMember(owner = "client!f", name = "m", descriptor = "B")
	public byte aByte10;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "B")
	public byte aByte7;

	@OriginalMember(owner = "client!f", name = "s", descriptor = "S")
	public final short aShort22;

	@OriginalMember(owner = "client!f", name = "y", descriptor = "S")
	public final short aShort23;

	static {
		new Class79("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(III)V")
	public Class67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte7 = this.aByte10 = (byte) arg0;
		this.aShort22 = (short) arg2;
		this.aShort23 = (short) arg1;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	public void method1964() {
		while (this.aClass22_2 != null) {
			@Pc(17) Class22 local17 = this.aClass22_2.aClass22_1;
			this.aClass22_2.method857();
			this.aClass22_2 = local17;
		}
		this.aByte8 = 0;
	}
}
