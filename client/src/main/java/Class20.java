import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ama")
public final class Class20 {

	@OriginalMember(owner = "client!ama", name = "b", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!ama", name = "e", descriptor = "I")
	private int anInt519 = -1;

	@OriginalMember(owner = "client!ama", name = "g", descriptor = "Lclient!sia;")
	private final Class339 aClass339_4 = new Class339();

	@OriginalMember(owner = "client!ama", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class20(@OriginalArg(0) Packet arg0) {
		this.method585(arg0);
	}

	@OriginalMember(owner = "client!ama", name = "a", descriptor = "(Lclient!ge;B)V")
	private void method585(@OriginalArg(0) Packet arg0) {
		this.aLong15 = arg0.g8();
		this.anInt519 = arg0.g4();
		for (@Pc(28) int local28 = arg0.g1(); local28 != 0; local28 = arg0.g1()) {
			if (Static148.aBoolean215) {
				System.out.println("t:" + local28);
			}
			@Pc(61) Class2_Sub14 local61;
			if (local28 == 3) {
				local61 = new Class2_Sub14_Sub4();
			} else if (local28 == 1) {
				local61 = new Class2_Sub14_Sub2();
			} else if (local28 == 13) {
				local61 = new Class2_Sub14_Sub7();
			} else if (local28 == 4) {
				local61 = new Class2_Sub14_Sub6();
			} else if (local28 == 6) {
				local61 = new Class2_Sub14_Sub13();
			} else if (local28 == 5) {
				local61 = new Class2_Sub14_Sub8();
			} else if (local28 == 2) {
				local61 = new Class2_Sub14_Sub5();
			} else if (local28 == 7) {
				local61 = new Class2_Sub14_Sub10();
			} else if (local28 == 8) {
				local61 = new Class2_Sub14_Sub11();
			} else if (local28 == 9) {
				local61 = new Class2_Sub14_Sub1();
			} else if (local28 == 10) {
				local61 = new Class2_Sub14_Sub12();
			} else if (local28 == 11) {
				local61 = new Class2_Sub14_Sub9();
			} else if (local28 == 12) {
				local61 = new Class2_Sub14_Sub3();
			} else {
				throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
			}
			local61.method8615(arg0);
			this.aClass339_4.method7711(local61);
		}
	}

	@OriginalMember(owner = "client!ama", name = "a", descriptor = "(ILclient!hi;)V")
	public void method587(@OriginalArg(1) Class164 arg0) {
		if (this.aLong15 != arg0.aLong125 || this.anInt519 != arg0.anInt3950) {
			throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + Static287.method4154(arg0.aLong125) + " updateNum:" + arg0.anInt3950 + " delta.owner:" + Static287.method4154(this.aLong15) + " updateNum:" + this.anInt519);
		}
		for (@Pc(82) Class2_Sub14 local82 = (Class2_Sub14) this.aClass339_4.method7699(65280); local82 != null; local82 = (Class2_Sub14) this.aClass339_4.method7706()) {
			local82.method8617(arg0);
		}
		arg0.anInt3950++;
	}
}
