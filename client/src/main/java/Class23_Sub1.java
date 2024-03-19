import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!bk", name = "t", descriptor = "Ljava/lang/Object;")
	private final Object anObject2 = new Object();

	@OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
	private int anInt789 = 0;

	@OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
	private int anInt788 = 0;

	@OriginalMember(owner = "client!bk", name = "C", descriptor = "[Lclient!pr;")
	private Class144_Sub1[] aClass144_Sub1Array1 = new Class144_Sub1[0];

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(IB)V")
	private void method574(@OriginalArg(0) int arg0) {
		super.aByteArray9[super.anInt1583] = (byte) (arg0 + 10);
		super.anInt1583++;
		super.anInt1582++;
		if (super.anInt1583 >= 5000) {
			super.anInt1583 = 0;
		}
		super.anInt1581++;
		if (this.anInt788 > 0) {
			@Pc(47) Object local47 = this.anObject2;
			synchronized (this.anObject2) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLclient!pm;)V")
	@Override
	public void method1379(@OriginalArg(1) Class154 arg0) {
		@Pc(2) Object local2 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray9[super.anInt1583] = 21;
			super.anObjectArray3[super.anInt1583] = arg0;
			super.anInt1583++;
			super.anInt1581++;
			super.anInt1582++;
			if (super.anInt1583 >= 5000) {
				super.anInt1583 = 0;
			}
			if (this.anInt788 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!pm;B)V")
	@Override
	public void method1373(@OriginalArg(0) Class154 arg0) {
		@Pc(6) Object local6 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray9[super.anInt1583] = 20;
			super.anObjectArray3[super.anInt1583] = arg0;
			super.anInt1583++;
			if (super.anInt1583 >= 5000) {
				super.anInt1583 = 0;
			}
			super.anInt1582++;
			super.anInt1581++;
			if (this.anInt788 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V")
	private void method575(@OriginalArg(1) int arg0) {
		super.aByteArray9[super.anInt1583] = (byte) arg0;
		super.anInt1583++;
		if (super.anInt1583 >= 5000) {
			super.anInt1583 = 0;
		}
		super.anInt1582++;
		super.anInt1581++;
		if (this.anInt788 > 0) {
			@Pc(43) Object local43 = this.anObject2;
			synchronized (this.anObject2) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
	@Override
	public void method1380() {
		@Pc(4) Object local4 = this.anObject2;
		synchronized (this.anObject2) {
			for (@Pc(8) int local8 = 0; local8 < this.anInt789; local8++) {
				if (this.aClass144_Sub1Array1[local8].anInt5358 >= 0) {
					this.method574(this.aClass144_Sub1Array1[local8].anInt5358);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!gm;FZIB)V")
	@Override
	public void method1377(@OriginalArg(0) Class77 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Object local6 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray9[super.anInt1583] = (byte) (arg2 ? arg3 + 40 : arg3 + 30);
			super.anObjectArray3[super.anInt1583] = arg0;
			super.aFloatArray4[super.anInt1583] = arg1;
			super.anInt1583++;
			if (super.anInt1583 >= 5000) {
				super.anInt1583 = 0;
			}
			super.anInt1582++;
			super.anInt1581++;
			if (this.anInt788 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!pm;)V")
	@Override
	public void method1378(@OriginalArg(1) Class154 arg0) {
		@Pc(6) Object local6 = this.anObject2;
		synchronized (this.anObject2) {
			super.anInt1585--;
			if (super.anInt1585 < 0) {
				super.anInt1585 = 4999;
			}
			super.aByteArray9[super.anInt1585] = 21;
			super.anObjectArray3[super.anInt1585] = arg0;
			super.anInt1581++;
			super.anInt1582++;
			if (this.anInt788 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
	@Override
	public void method1381() {
		try {
			@Pc(8) Object local8 = this.anObject2;
			synchronized (this.anObject2) {
				while (true) {
					if (super.anInt1581 == 0) {
						break;
					}
					this.anObject2.wait();
				}
			}
		} catch (@Pc(25) Exception local25) {
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!pr;B)V")
	public void method577(@OriginalArg(0) Class144_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject2;
			@Pc(52) byte local52;
			synchronized (this.anObject2) {
				while (super.anInt1582 == 0) {
					this.anInt788++;
					this.anObject2.wait();
					this.anInt788--;
				}
				local52 = super.aByteArray9[super.anInt1585];
				if (arg0.anInt5358 >= 0) {
					if (local52 < 0 || local52 > 3) {
						local7 = true;
					}
				} else if (local52 >= 0 && local52 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject8 = super.anObjectArray3[super.anInt1585];
					local11 = super.aFloatArray4[super.anInt1585];
					super.anObjectArray3[super.anInt1585] = null;
					super.anInt1585++;
					if (super.anInt1585 >= 5000) {
						super.anInt1585 = 0;
					}
					super.anInt1582--;
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt5358 < 0) {
				if (local52 >= 0 && local52 <= 3) {
					arg0.anInt5358 = local52;
					Static332.aClass40_8.method2727(local52);
				}
			} else if (local52 == 21) {
				Static183.method3713(arg0, (Class154) arg0.anObject8);
			} else if (local52 == 20) {
				@Pc(168) Class154 local168 = (Class154) arg0.anObject8;
				if (local168.aClass7_Sub2_1 != null) {
					local168.aClass7_Sub2_1.method5957(Static332.aClass40_8);
				}
				if (local168.aClass7_Sub2_2 != null) {
					local168.aClass7_Sub2_2.method5957(Static332.aClass40_8);
				}
				if (local168.aClass7_Sub3_2 != null) {
					local168.aClass7_Sub3_2.method5957(Static332.aClass40_8);
				}
				if (local168.aClass7_Sub3_1 != null) {
					local168.aClass7_Sub3_1.method5957(Static332.aClass40_8);
				}
				if (local168.aClass7_Sub5_1 != null) {
					local168.aClass7_Sub5_1.method5957(Static332.aClass40_8);
				}
				for (@Pc(215) Class93 local215 = local168.aClass93_3; local215 != null; local215 = local215.aClass93_2) {
					local215.aClass7_Sub1_1.method5957(Static332.aClass40_8);
				}
			} else if (local52 >= 30 && local52 <= 33) {
				Static332.aClass40_8.method2796(3000.0F, local11 * 1.5F);
				((Class77) arg0.anObject8).method3985(Static328.anInt6714, Static61.anInt1677, Static292.anInt6117, Static100.aBooleanArrayArray7, local52 - 30 == 0);
			} else if (local52 >= 40 && local52 <= 43) {
				Static332.aClass40_8.method2796(3000.0F, local11 * 1.5F);
				((Class77) arg0.anObject8).method3985(Static328.anInt6714, Static61.anInt1677, Static292.anInt6117, Static161.aBooleanArrayArray5, local52 - 40 == 0);
			} else if (local52 == 22) {
				Static332.aClass40_8.method2777();
			} else if (local52 == 23) {
				Static332.aClass40_8.method2795();
			} else if (local52 == 24) {
				Static332.aClass40_8.method2761(0, null);
			} else if (local52 >= 10 && local52 <= 13) {
				Static332.aClass40_8.method2731(arg0.anInt5358);
				arg0.anInt5358 = -1;
			}
		} catch (@Pc(343) Exception local343) {
		} finally {
			@Pc(349) Object local349 = null;
			if (local7) {
				@Pc(409) Object local409 = this.anObject2;
				synchronized (this.anObject2) {
					super.anInt1581--;
					if (super.anInt1581 == 0) {
						this.anObject2.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)V")
	@Override
	public void method1374(@OriginalArg(0) int arg0) {
		@Pc(6) Object local6 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray9[super.anInt1583] = (byte) arg0;
			super.anInt1583++;
			super.anInt1582++;
			super.anInt1581++;
			if (super.anInt1583 >= 5000) {
				super.anInt1583 = 0;
			}
			if (this.anInt788 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(IB)V")
	@Override
	public void method1375(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject2;
		synchronized (this.anObject2) {
			@Pc(22) int local22;
			if (this.anInt789 == arg0) {
				for (local22 = 0; local22 < this.anInt789; local22++) {
					this.method575(local7++);
				}
			} else {
				for (local22 = 0; local22 < this.anInt789; local22++) {
					this.aClass144_Sub1Array1[local22].method4555();
				}
				this.anInt789 = arg0;
				this.aClass144_Sub1Array1 = new Class144_Sub1[this.anInt789];
				for (@Pc(74) int local74 = 0; local74 < this.anInt789; local74++) {
					this.aClass144_Sub1Array1[local74] = new Class144_Sub1(this);
					this.aClass144_Sub1Array1[local74].method4556();
					this.method575(local7++);
				}
			}
		}
	}
}
