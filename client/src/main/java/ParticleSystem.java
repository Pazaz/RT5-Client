import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class ParticleSystem extends ParticleNode {

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
	public int anInt4675;

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
	public int anInt4676;

	@OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
	public int anInt4677;

	@OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
	public int anInt4679;

	@OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
	public int anInt4680;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "Z")
	public boolean aBoolean322 = false;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "Z")
	private boolean aBoolean323 = false;

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
	public int anInt4673 = 0;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "Lclient!cm;")
	private Class36 aClass36_5 = new Class36();

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
	private int anInt4674 = 0;

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "Lclient!ld;")
	public LinkedList aClass135_29 = new LinkedList();

	@OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
	private int anInt4678 = 0;

	@OriginalMember(owner = "client!oh", name = "x", descriptor = "Z")
	private boolean aBoolean324 = false;

	@OriginalMember(owner = "client!oh", name = "w", descriptor = "Lclient!tp;")
	public final Class224 aClass224_2 = new Class224();

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "[Lclient!ns;")
	public Class12_Sub1_Sub1_Sub1[] aClass12_Sub1_Sub1_Sub1Array2 = new Class12_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "J")
	private long aLong138;

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "J")
	private long aLong137;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(I)V")
	public ParticleSystem(@OriginalArg(0) int arg0) {
		Static131.aClass36_4.method1418(this);
		this.aLong138 = arg0;
		this.aLong137 = arg0;
		this.aBoolean324 = true;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "()V")
	public void method4350() {
		this.aClass224_2.aClass191_1.method4892();
		for (@Pc(10) Class12_Sub8 local10 = (Class12_Sub8) this.aClass36_5.method1415(); local10 != null; local10 = (Class12_Sub8) this.aClass36_5.method1420()) {
			local10.method5688(this.aLong137);
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "()V")
	private void method4351() {
		this.aBoolean323 = false;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!wm;J)Z")
	public boolean method4352(@OriginalArg(0) RasteriserBase arg0, @OriginalArg(1) long arg1) {
		if (this.aLong138 == this.aLong137) {
			this.method4351();
		} else {
			this.method4354();
		}
		if (arg1 - this.aLong138 > 750L) {
			this.method4356();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong137);
		@Pc(36) Class12_Sub8 local36;
		if (this.aBoolean324) {
			for (local36 = (Class12_Sub8) this.aClass36_5.method1415(); local36 != null; local36 = (Class12_Sub8) this.aClass36_5.method1420()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass235_1.anInt6604; local39++) {
					local36.method5686(arg1, arg0, 1, !this.aBoolean323);
				}
			}
			this.aBoolean324 = false;
		}
		for (local36 = (Class12_Sub8) this.aClass36_5.method1415(); local36 != null; local36 = (Class12_Sub8) this.aClass36_5.method1420()) {
			local36.method5686(arg1, arg0, local27, !this.aBoolean323);
		}
		this.aLong137 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!wm;[Lclient!jf;Z)V")
	private void method4353(@OriginalArg(0) RasteriserBase arg0, @OriginalArg(1) Class114[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static251.aBooleanArray39[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class12_Sub8 local16 = (Class12_Sub8) this.aClass36_5.method1415(); local16 != null; local16 = (Class12_Sub8) this.aClass36_5.method1420()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass114_2 == arg1[local21] || local16.aClass114_2 == arg1[local21].aClass114_1) {
						Static251.aBooleanArray39[local21] = true;
						local16.method5689();
						local16.aBoolean422 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt6253 == 0) {
				local16.method5684();
				this.anInt4674--;
			} else {
				local16.aBoolean422 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt4674 != 8; local21++) {
			if (!Static251.aBooleanArray39[local21]) {
				@Pc(101) Class12_Sub8 local101 = new Class12_Sub8(arg0, arg1[local21], this, this.aLong138);
				this.aClass36_5.method1418(local101);
				this.anInt4674++;
				Static251.aBooleanArray39[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "()V")
	public void method4354() {
		this.aBoolean323 = true;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(J)V")
	public void method4355(@OriginalArg(0) long arg0) {
		this.aLong138 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "()V")
	public void method4356() {
		this.aBoolean322 = true;
		for (@Pc(8) Class2_Sub2_Sub5 local8 = (Class2_Sub2_Sub5) this.aClass135_29.head(); local8 != null; local8 = (Class2_Sub2_Sub5) this.aClass135_29.next()) {
			if (local8.aClass28_1.anInt737 == 1) {
				local8.unlinkSecondary();
			}
		}
		this.aClass12_Sub1_Sub1_Sub1Array2 = new Class12_Sub1_Sub1_Sub1[8192];
		this.anInt4673 = 0;
		this.aClass36_5 = new Class36();
		this.anInt4674 = 0;
		this.aClass135_29 = new LinkedList();
		this.anInt4678 = 0;
		this.method5684();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!wm;J[Lclient!jf;[Lclient!nm;Z)V")
	public void method4357(@OriginalArg(0) RasteriserBase arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class114[] arg2, @OriginalArg(3) Class163[] arg3) {
		if (!this.aBoolean322) {
			this.method4353(arg0, arg2);
			this.method4362(arg3);
			this.aLong138 = arg1;
		}
	}

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "()Lclient!tp;")
	public Class224 method4358() {
		return this.aClass224_2;
	}

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "()V")
	public void method4359() {
		this.aBoolean324 = true;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIII)V")
	public void method4361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4679 = arg0;
		this.anInt4677 = arg1;
		this.anInt4676 = arg2;
		this.anInt4680 = arg3;
		this.anInt4675 = arg4;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "([Lclient!nm;Z)V")
	private void method4362(@OriginalArg(0) Class163[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static251.aBooleanArray38[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class2_Sub2_Sub5 local16 = (Class2_Sub2_Sub5) this.aClass135_29.head(); local16 != null; local16 = (Class2_Sub2_Sub5) this.aClass135_29.next()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass163_1 == arg0[local21] || local16.aClass163_1 == arg0[local21].aClass163_2) {
						Static251.aBooleanArray38[local21] = true;
						local16.method1564();
						continue label68;
					}
				}
			}
			local16.unlink();
			this.anInt4678--;
			if (local16.islinkedSecondary()) {
				local16.unlinkSecondary();
				Static201.anInt3701--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt4678 != 8; local21++) {
			if (!Static251.aBooleanArray38[local21]) {
				@Pc(93) Class2_Sub2_Sub5 local93 = null;
				if (Static314.method5367(arg0[local21].anInt4330).anInt737 == 1 && Static201.anInt3701 < 32) {
					local93 = new Class2_Sub2_Sub5(arg0[local21], this);
					Static141.aClass115_1.method2978((long) arg0[local21].anInt4330, local93);
					Static201.anInt3701++;
				}
				if (local93 == null) {
					local93 = new Class2_Sub2_Sub5(arg0[local21], this);
				}
				this.aClass135_29.addTail(local93);
				this.anInt4678++;
				Static251.aBooleanArray38[local21] = true;
			}
		}
	}
}
