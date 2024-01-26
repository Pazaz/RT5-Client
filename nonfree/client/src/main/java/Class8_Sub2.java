import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public abstract class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "B")
	public byte aByte143;

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "B")
	public byte aByte144;

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
	public int anInt10690;

	@OriginalMember(owner = "client!eo", name = "q", descriptor = "Z")
	public boolean aBoolean812;

	@OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
	public int anInt10691;

	@OriginalMember(owner = "client!eo", name = "u", descriptor = "I")
	public int anInt10692;

	@OriginalMember(owner = "client!eo", name = "v", descriptor = "I")
	public int anInt10694;

	@OriginalMember(owner = "client!eo", name = "t", descriptor = "Lclient!eo;")
	public Class8_Sub2 aClass8_Sub2_25;

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "I")
	public int anInt10697;

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
	public int anInt10698;

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "Z")
	public boolean aBoolean813 = false;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V")
	protected Class8_Sub2() {
	}

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "(I)Z")
	public abstract boolean method9275();

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILclient!ha;)Lclient!pea;")
	public abstract Class8_Sub7 method9276(@OriginalArg(1) Class19 arg0);

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[Lclient!lca;II)I")
	protected final int method9277(@OriginalArg(1) Class2_Sub7[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) long local21 = Static161.aLongArrayArrayArray1[this.aByte144][arg2][arg1];
		@Pc(23) long local23 = 0L;
		@Pc(25) int local25 = 0;
		@Pc(35) int local35;
		while (local23 <= 48L) {
			local35 = (int) (local21 >> (int) local23 & 0xFFFFL);
			if (local35 <= 0) {
				break;
			}
			arg0[local25++] = Static265.aClass353Array1[local35 - 1].aClass2_Sub7_3;
			local23 += 16L;
		}
		for (local35 = local25; local35 < 4; local35++) {
			arg0[local35] = null;
		}
		return local25;
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(Lclient!ha;I)Lclient!ke;")
	public abstract Class205 method9278(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIZLclient!ha;)Z")
	public abstract boolean method9279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class19 arg3);

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "(I)V")
	public abstract void method9280(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "(I)Z")
	public abstract boolean method9282(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)Z")
	public abstract boolean method9283();

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BLclient!ha;)Z")
	public abstract boolean method9284(@OriginalArg(0) byte arg0, @OriginalArg(1) Class19 arg1);

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZLclient!ha;IBILclient!eo;)V")
	public abstract void method9285(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8_Sub2 arg6);

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "(I)I")
	public abstract int method9286(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "(B)I")
	public int method9287() {
		return 0;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "([Lclient!lca;I)I")
	public abstract int method9288(@OriginalArg(0) Class2_Sub7[] arg0);

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "(Lclient!ha;I)V")
	public abstract void method9289(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "(I)Z")
	public abstract boolean method9290(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(B)I")
	public abstract int method9292(@OriginalArg(0) byte arg0);
}
