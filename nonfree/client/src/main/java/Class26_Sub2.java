import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class26_Sub2 extends Class26 {

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "F")
	private float aFloat33 = 0.0F;

	@OriginalMember(owner = "client!cs", name = "t", descriptor = "Lclient!ae;")
	private final Class7 aClass7_3;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!am;Lclient!ae;)V")
	public Class26_Sub2(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Class7 arg1) {
		super(arg0);
		this.aClass7_3 = arg1;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8290(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.aClass19_Sub1_21.method8138(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass19_Sub1_21.method8088((Interface17) null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass7_3.aBoolean7) {
				this.aFloat33 = (float) (super.aClass19_Sub1_21.anInt9164 % 4000) / 4000.0F;
				super.aClass19_Sub1_21.method8088(this.aClass7_3.anInterface2_2);
			} else {
				@Pc(37) int local37 = super.aClass19_Sub1_21.anInt9164 % 4000 * 16 / 4000;
				super.aClass19_Sub1_21.method8088(this.aClass7_3.anInterface18Array2[local37]);
			}
		} else if (this.aClass7_3.aBoolean7) {
			super.aClass19_Sub1_21.method8088(this.aClass7_3.anInterface2_2);
		} else {
			super.aClass19_Sub1_21.method8088(this.aClass7_3.anInterface18Array2[0]);
		}
		super.aClass19_Sub1_21.method8138(0);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!mw;IB)V")
	@Override
	public void method8294(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) int arg1) {
		super.aClass19_Sub1_21.method8088(arg0);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8297(@OriginalArg(1) boolean arg0) {
		super.aClass19_Sub1_21.method8138(1);
		super.aClass19_Sub1_21.method8094(Static185.aClass121_3, Static438.aClass121_5);
		super.aClass19_Sub1_21.method8125(Static189.aClass168_2, true, false, 0);
		super.aClass19_Sub1_21.method8142(Static188.aClass168_1, 0);
		super.aClass19_Sub1_21.method8055(0);
		super.aClass19_Sub1_21.method8138(0);
		super.aClass19_Sub1_21.method8112(-16777216);
		super.aClass19_Sub1_21.method8142(Static454.aClass168_5, 0);
		this.method8296();
	}

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "(I)V")
	@Override
	public void method8286() {
		super.aClass19_Sub1_21.method8138(1);
		super.aClass19_Sub1_21.method8094(Static209.aClass121_4, Static209.aClass121_4);
		super.aClass19_Sub1_21.method8080(0, Static189.aClass168_2);
		super.aClass19_Sub1_21.method8142(Static189.aClass168_2, 0);
		super.aClass19_Sub1_21.method8055(1);
		super.aClass19_Sub1_21.method8088((Interface17) null);
		super.aClass19_Sub1_21.method8138(0);
		super.aClass19_Sub1_21.method8142(Static189.aClass168_2, 0);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)V")
	@Override
	public void method8296() {
		if (super.aClass19_Sub1_21.method8026() != 0) {
			return;
		}
		@Pc(9) Class73_Sub1 local9 = super.aClass19_Sub1_21.method8066();
		super.aClass19_Sub1_21.method8138(1);
		@Pc(19) Class73_Sub1 local19 = super.aClass19_Sub1_21.method8082();
		local19.method7128(local9);
		local19.method1896(0.125F, 0.125F, 1.0F);
		local19.method1882(this.aFloat33, 0.0F, 0.0F);
		super.aClass19_Sub1_21.method8073(Static104.aClass370_1);
		super.aClass19_Sub1_21.method8138(0);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8292(@OriginalArg(0) boolean arg0) {
		super.aClass19_Sub1_21.method8094(Static185.aClass121_3, Static209.aClass121_4);
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8289() {
		return this.aClass7_3.method116();
	}
}
