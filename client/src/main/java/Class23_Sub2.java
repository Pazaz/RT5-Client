import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class23_Sub2 extends Class23 {

	@OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
	private int anInt1593 = 0;

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "Lclient!oq;")
	private final Class144 aClass144_1 = new Class144();

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V")
	private void method1382() {
		@Pc(8) int local8 = super.anInt1585++;
		if (super.anInt1585 >= 5000) {
			super.anInt1585 = 0;
		}
		this.anInt1593 = super.aByteArray9[local8];
		@Pc(38) Object local38 = super.anObjectArray3[local8];
		super.anObjectArray3[local8] = null;
		if (this.anInt1593 == 21) {
			Static183.method3713(this.aClass144_1, (Class154) local38);
		} else if (this.anInt1593 == 20) {
			@Pc(56) Class154 local56 = (Class154) local38;
			if (local56.aClass7_Sub2_1 != null) {
				local56.aClass7_Sub2_1.method5957(Static332.aClass40_8);
			}
			if (local56.aClass7_Sub2_2 != null) {
				local56.aClass7_Sub2_2.method5957(Static332.aClass40_8);
			}
			if (local56.aClass7_Sub3_2 != null) {
				local56.aClass7_Sub3_2.method5957(Static332.aClass40_8);
			}
			if (local56.aClass7_Sub3_1 != null) {
				local56.aClass7_Sub3_1.method5957(Static332.aClass40_8);
			}
			if (local56.aClass7_Sub5_1 != null) {
				local56.aClass7_Sub5_1.method5957(Static332.aClass40_8);
			}
			for (@Pc(99) Class93 local99 = local56.aClass93_3; local99 != null; local99 = local99.aClass93_2) {
				local99.aClass7_Sub1_1.method5957(Static332.aClass40_8);
			}
		} else if (this.anInt1593 >= 30 && this.anInt1593 <= 33) {
			Static332.aClass40_8.method2796(3000.0F, super.aFloatArray4[local8] * 1.5F);
			((Class77) local38).method3985(Static328.anInt6714, Static61.anInt1677, Static292.anInt6117, Static100.aBooleanArrayArray7, this.anInt1593 - 30 == 0);
		} else if (this.anInt1593 >= 40 && this.anInt1593 <= 43) {
			Static332.aClass40_8.method2796(3000.0F, super.aFloatArray4[local8] * 1.5F);
			((Class77) local38).method3985(Static328.anInt6714, Static61.anInt1677, Static292.anInt6117, Static161.aBooleanArrayArray5, this.anInt1593 - 40 == 0);
		} else if (this.anInt1593 == 22) {
			Static332.aClass40_8.method2777();
		} else if (this.anInt1593 == 23) {
			Static332.aClass40_8.method2795();
		} else if (this.anInt1593 == 24) {
			Static332.aClass40_8.method2761(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!gm;FZIB)V")
	@Override
	public void method1377(@OriginalArg(0) Class77 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		super.aByteArray9[super.anInt1583] = (byte) (arg2 ? arg3 + 40 : arg3 + 30);
		super.anObjectArray3[super.anInt1583] = arg0;
		super.aFloatArray4[super.anInt1583] = arg1;
		super.anInt1583++;
		if (super.anInt1583 >= 5000) {
			super.anInt1583 = 0;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!pm;)V")
	@Override
	public void method1378(@OriginalArg(1) Class154 arg0) {
		super.anInt1585--;
		if (super.anInt1585 < 0) {
			super.anInt1585 = 4999;
		}
		super.aByteArray9[super.anInt1585] = 21;
		super.anObjectArray3[super.anInt1585] = arg0;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)V")
	@Override
	public void method1374(@OriginalArg(0) int arg0) {
		super.aByteArray9[super.anInt1583] = (byte) arg0;
		super.anInt1583++;
		if (super.anInt1583 >= 5000) {
			super.anInt1583 = 0;
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
	@Override
	public void method1380() {
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!pm;B)V")
	@Override
	public void method1373(@OriginalArg(0) Class154 arg0) {
		super.aByteArray9[super.anInt1583] = 20;
		super.anObjectArray3[super.anInt1583] = arg0;
		super.anInt1583++;
		if (super.anInt1583 >= 5000) {
			super.anInt1583 = 0;
		}
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V")
	@Override
	public void method1381() {
		while (super.anInt1585 != super.anInt1583) {
			this.method1382();
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLclient!pm;)V")
	@Override
	public void method1379(@OriginalArg(1) Class154 arg0) {
		super.aByteArray9[super.anInt1583] = 21;
		super.anObjectArray3[super.anInt1583] = arg0;
		super.anInt1583++;
		if (super.anInt1583 >= 5000) {
			super.anInt1583 = 0;
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(IB)V")
	@Override
	public void method1375(@OriginalArg(0) int arg0) {
	}
}
