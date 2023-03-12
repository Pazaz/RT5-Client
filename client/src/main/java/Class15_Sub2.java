import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!db", name = "k", descriptor = "I")
	private int anInt1415 = 0;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "Lclient!hc;")
	private final Class90 aClass90_1 = new Class90();

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!f;)V")
	@Override
	public void method1584(@OriginalArg(1) Class67 arg0) {
		super.anInt1410--;
		if (super.anInt1410 < 0) {
			super.anInt1410 = 4999;
		}
		super.aByteArray16[super.anInt1410] = 21;
		super.anObjectArray3[super.anInt1410] = arg0;
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
	private void method1587() {
		@Pc(8) int local8 = super.anInt1410++;
		if (super.anInt1410 >= 5000) {
			super.anInt1410 = 0;
		}
		this.anInt1415 = super.aByteArray16[local8];
		@Pc(34) Object local34 = super.anObjectArray3[local8];
		super.anObjectArray3[local8] = null;
		if (this.anInt1415 == 21) {
			Static90.method5950(this.aClass90_1, (Class67) local34);
		} else if (this.anInt1415 == 20) {
			@Pc(57) Class67 local57 = (Class67) local34;
			if (local57.aClass11_Sub1_3 != null) {
				local57.aClass11_Sub1_3.method6070(Static16.aClass19_10);
			}
			if (local57.aClass11_Sub1_2 != null) {
				local57.aClass11_Sub1_2.method6070(Static16.aClass19_10);
			}
			if (local57.aClass11_Sub3_2 != null) {
				local57.aClass11_Sub3_2.method6070(Static16.aClass19_10);
			}
			if (local57.aClass11_Sub3_3 != null) {
				local57.aClass11_Sub3_3.method6070(Static16.aClass19_10);
			}
			if (local57.aClass11_Sub2_2 != null) {
				local57.aClass11_Sub2_2.method6070(Static16.aClass19_10);
			}
			for (@Pc(100) Class22 local100 = local57.aClass22_2; local100 != null; local100 = local100.aClass22_1) {
				local100.aClass11_Sub5_1.method6070(Static16.aClass19_10);
			}
		} else if (this.anInt1415 >= 30 && this.anInt1415 <= 33) {
			Static16.aClass19_10.method2823(3000.0F, super.aFloatArray11[local8] * 1.5F);
			((Class6) local34).method5729(Static248.anInt4650, Static211.anInt3780, Scene.anInt3788, Scene.aBooleanArrayArray1, this.anInt1415 - 30 == 0);
		} else if (this.anInt1415 >= 40 && this.anInt1415 <= 43) {
			Static16.aClass19_10.method2823(3000.0F, super.aFloatArray11[local8] * 1.5F);
			((Class6) local34).method5729(Static248.anInt4650, Static211.anInt3780, Scene.anInt3788, Scene.aBooleanArrayArray5, this.anInt1415 - 40 == 0);
		} else if (this.anInt1415 == 22) {
			Static16.aClass19_10.method2880();
		} else if (this.anInt1415 == 23) {
			Static16.aClass19_10.method2882();
		} else if (this.anInt1415 == 24) {
			Static16.aClass19_10.method2834(0, null);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!f;B)V")
	@Override
	public void method1579(@OriginalArg(0) Class67 arg0) {
		super.aByteArray16[super.anInt1411] = 20;
		super.anObjectArray3[super.anInt1411] = arg0;
		super.anInt1411++;
		if (super.anInt1411 >= 5000) {
			super.anInt1411 = 0;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)V")
	@Override
	public void method1582(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!f;I)V")
	@Override
	public void method1583(@OriginalArg(0) Class67 arg0) {
		super.aByteArray16[super.anInt1411] = 21;
		super.anObjectArray3[super.anInt1411] = arg0;
		super.anInt1411++;
		if (super.anInt1411 >= 5000) {
			super.anInt1411 = 0;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
	@Override
	public void method1578(@OriginalArg(0) int arg0) {
		super.aByteArray16[super.anInt1411] = (byte) arg0;
		super.anInt1411++;
		if (super.anInt1411 >= 5000) {
			super.anInt1411 = 0;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!tf;ZFII)V")
	@Override
	public void method1577(@OriginalArg(0) Class6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		super.aByteArray16[super.anInt1411] = (byte) (arg1 ? arg3 + 40 : arg3 + 30);
		super.anObjectArray3[super.anInt1411] = arg0;
		super.aFloatArray11[super.anInt1411] = arg2;
		super.anInt1411++;
		if (super.anInt1411 >= 5000) {
			super.anInt1411 = 0;
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
	@Override
	public void method1586() {
		while (super.anInt1410 != super.anInt1411) {
			this.method1587();
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	@Override
	public void method1585() {
	}
}
