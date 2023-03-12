import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "Ljava/lang/Object;")
	private final Object anObject1 = new Object();

	@OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
	private int anInt532 = 0;

	@OriginalMember(owner = "client!bb", name = "E", descriptor = "[Lclient!wd;")
	private Class90_Sub1[] aClass90_Sub1Array1 = new Class90_Sub1[0];

	@OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
	private int anInt533 = 0;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!f;)V")
	@Override
	public void method1584(@OriginalArg(1) Class67 arg0) {
		@Pc(11) Object local11 = this.anObject1;
		synchronized (this.anObject1) {
			super.anInt1410--;
			if (super.anInt1410 < 0) {
				super.anInt1410 = 4999;
			}
			super.aByteArray16[super.anInt1410] = 21;
			super.anObjectArray3[super.anInt1410] = arg0;
			super.anInt1413++;
			super.anInt1414++;
			if (this.anInt532 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)V")
	private void method552(@OriginalArg(1) int arg0) {
		super.aByteArray16[super.anInt1411] = (byte) arg0;
		super.anInt1411++;
		super.anInt1413++;
		super.anInt1414++;
		if (super.anInt1411 >= 5000) {
			super.anInt1411 = 0;
		}
		if (this.anInt532 > 0) {
			@Pc(51) Object local51 = this.anObject1;
			synchronized (this.anObject1) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!wd;I)V")
	public void method553(@OriginalArg(0) Class90_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject1;
			@Pc(45) byte local45;
			synchronized (this.anObject1) {
				while (super.anInt1413 == 0) {
					this.anInt532++;
					this.anObject1.wait();
					this.anInt532--;
				}
				local45 = super.aByteArray16[super.anInt1410];
				if (arg0.anInt7115 < 0) {
					if (local45 >= 0 && local45 <= 3) {
						local7 = true;
					}
				} else if (local45 < 0 || local45 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject7 = super.anObjectArray3[super.anInt1410];
					local11 = super.aFloatArray11[super.anInt1410];
					super.anObjectArray3[super.anInt1410] = null;
					super.anInt1410++;
					super.anInt1413--;
					if (super.anInt1410 >= 5000) {
						super.anInt1410 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt7115 < 0) {
				if (local45 >= 0 && local45 <= 3) {
					arg0.anInt7115 = local45;
					Static16.aClass19_10.method2893(local45);
				}
			} else if (local45 == 21) {
				Static90.method5950(arg0, (Class67) arg0.anObject7);
			} else if (local45 == 20) {
				@Pc(167) Class67 local167 = (Class67) arg0.anObject7;
				if (local167.aClass11_Sub1_3 != null) {
					local167.aClass11_Sub1_3.method6070(Static16.aClass19_10);
				}
				if (local167.aClass11_Sub1_2 != null) {
					local167.aClass11_Sub1_2.method6070(Static16.aClass19_10);
				}
				if (local167.aClass11_Sub3_2 != null) {
					local167.aClass11_Sub3_2.method6070(Static16.aClass19_10);
				}
				if (local167.aClass11_Sub3_3 != null) {
					local167.aClass11_Sub3_3.method6070(Static16.aClass19_10);
				}
				if (local167.aClass11_Sub2_2 != null) {
					local167.aClass11_Sub2_2.method6070(Static16.aClass19_10);
				}
				for (@Pc(210) Class22 local210 = local167.aClass22_2; local210 != null; local210 = local210.aClass22_1) {
					local210.aClass11_Sub5_1.method6070(Static16.aClass19_10);
				}
			} else if (local45 >= 30 && local45 <= 33) {
				Static16.aClass19_10.method2823(3000.0F, local11 * 1.5F);
				((Class6) arg0.anObject7).method5729(Static248.anInt4650, Static211.anInt3780, Scene.anInt3788, Scene.aBooleanArrayArray1, local45 - 30 == 0);
			} else if (local45 >= 40 && local45 <= 43) {
				Static16.aClass19_10.method2823(3000.0F, local11 * 1.5F);
				((Class6) arg0.anObject7).method5729(Static248.anInt4650, Static211.anInt3780, Scene.anInt3788, Scene.aBooleanArrayArray5, local45 - 40 == 0);
			} else if (local45 == 22) {
				Static16.aClass19_10.method2880();
			} else if (local45 == 23) {
				Static16.aClass19_10.method2882();
			} else if (local45 == 24) {
				Static16.aClass19_10.method2834(0, null);
			} else if (local45 >= 10 && local45 <= 13) {
				Static16.aClass19_10.method2865(arg0.anInt7115);
				arg0.anInt7115 = -1;
			}
		} catch (@Pc(335) Exception local335) {
		} finally {
			@Pc(341) Object local341 = null;
			if (local7) {
				@Pc(398) Object local398 = this.anObject1;
				synchronized (this.anObject1) {
					super.anInt1414--;
					if (super.anInt1414 == 0) {
						this.anObject1.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
	@Override
	public void method1586() {
		try {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				while (true) {
					if (super.anInt1414 == 0) {
						break;
					}
					this.anObject1.wait();
				}
			}
		} catch (@Pc(21) Exception local21) {
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)V")
	private void method554(@OriginalArg(0) int arg0) {
		super.aByteArray16[super.anInt1411] = (byte) (arg0 + 10);
		super.anInt1411++;
		super.anInt1413++;
		super.anInt1414++;
		if (super.anInt1411 >= 5000) {
			super.anInt1411 = 0;
		}
		if (this.anInt532 > 0) {
			@Pc(52) Object local52 = this.anObject1;
			synchronized (this.anObject1) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
	@Override
	public void method1578(@OriginalArg(0) int arg0) {
		@Pc(10) Object local10 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray16[super.anInt1411] = (byte) arg0;
			super.anInt1411++;
			if (super.anInt1411 >= 5000) {
				super.anInt1411 = 0;
			}
			super.anInt1414++;
			super.anInt1413++;
			if (this.anInt532 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!f;B)V")
	@Override
	public void method1579(@OriginalArg(0) Class67 arg0) {
		@Pc(2) Object local2 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray16[super.anInt1411] = 20;
			super.anObjectArray3[super.anInt1411] = arg0;
			super.anInt1411++;
			if (super.anInt1411 >= 5000) {
				super.anInt1411 = 0;
			}
			super.anInt1413++;
			super.anInt1414++;
			if (this.anInt532 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)V")
	@Override
	public void method1582(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject1;
		synchronized (this.anObject1) {
			@Pc(18) int local18;
			if (arg0 == this.anInt533) {
				for (local18 = 0; local18 < this.anInt533; local18++) {
					this.method552(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt533; local18++) {
					this.aClass90_Sub1Array1[local18].method6346();
				}
				this.anInt533 = arg0;
				this.aClass90_Sub1Array1 = new Class90_Sub1[this.anInt533];
				for (@Pc(74) int local74 = 0; local74 < this.anInt533; local74++) {
					this.aClass90_Sub1Array1[local74] = new Class90_Sub1(this);
					this.aClass90_Sub1Array1[local74].method6345();
					this.method552(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!tf;ZFII)V")
	@Override
	public void method1577(@OriginalArg(0) Class6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Object local6 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray16[super.anInt1411] = (byte) (arg1 ? arg3 + 40 : arg3 + 30);
			super.anObjectArray3[super.anInt1411] = arg0;
			super.aFloatArray11[super.anInt1411] = arg2;
			super.anInt1411++;
			super.anInt1414++;
			super.anInt1413++;
			if (super.anInt1411 >= 5000) {
				super.anInt1411 = 0;
			}
			if (this.anInt532 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	@Override
	public void method1585() {
		@Pc(8) Object local8 = this.anObject1;
		synchronized (this.anObject1) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt533; local12++) {
				if (this.aClass90_Sub1Array1[local12].anInt7115 >= 0) {
					this.method554(this.aClass90_Sub1Array1[local12].anInt7115);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!f;I)V")
	@Override
	public void method1583(@OriginalArg(0) Class67 arg0) {
		@Pc(2) Object local2 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray16[super.anInt1411] = 21;
			super.anObjectArray3[super.anInt1411] = arg0;
			super.anInt1411++;
			if (super.anInt1411 >= 5000) {
				super.anInt1411 = 0;
			}
			super.anInt1413++;
			super.anInt1414++;
			if (this.anInt532 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}
}
