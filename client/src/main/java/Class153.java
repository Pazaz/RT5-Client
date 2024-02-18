import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class153 {

	@OriginalMember(owner = "client!gw", name = "s", descriptor = "Lclient!vn;")
	public Class348 aClass348_1;

	@OriginalMember(owner = "client!gw", name = "r", descriptor = "Lclient!oba;")
	public Class270 aClass270_1;

	@OriginalMember(owner = "client!gw", name = "l", descriptor = "Lclient!iv;")
	public Class186 aClass186_1;

	@OriginalMember(owner = "client!gw", name = "t", descriptor = "I")
	public int anInt3643;

	@OriginalMember(owner = "client!gw", name = "z", descriptor = "Lclient!lga;")
	public Class225 aClass225_91;

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "Lclient!lga;")
	public Class225 aClass225_92;

	@OriginalMember(owner = "client!gw", name = "B", descriptor = "I")
	public int anInt3644;

	@OriginalMember(owner = "client!gw", name = "A", descriptor = "I")
	public int anInt3645;

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "Lclient!lga;")
	public Class225 aClass225_94;

	@OriginalMember(owner = "client!gw", name = "w", descriptor = "I")
	private int anInt3649;

	@OriginalMember(owner = "client!gw", name = "h", descriptor = "Lclient!sia;")
	private final Class339 aClass339_17 = new Class339();

	@OriginalMember(owner = "client!gw", name = "x", descriptor = "I")
	private int anInt3640 = 0;

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "Lclient!ge;")
	private final Class2_Sub21 aClass2_Sub21_6 = new Class2_Sub21(1350);

	@OriginalMember(owner = "client!gw", name = "y", descriptor = "Lclient!rka;")
	public final Class2_Sub21_Sub2 aClass2_Sub21_Sub2_2 = new Class2_Sub21_Sub2(15000);

	@OriginalMember(owner = "client!gw", name = "j", descriptor = "Lclient!lga;")
	public Class225 aClass225_93 = null;

	@OriginalMember(owner = "client!gw", name = "u", descriptor = "I")
	public int anInt3648 = 0;

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
	public int anInt3647 = 0;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "Z")
	public boolean aBoolean278 = false;

	@OriginalMember(owner = "client!gw", name = "q", descriptor = "Z")
	public boolean aBoolean279 = true;

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "I")
	public int anInt3646 = 0;

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V")
	public void method3271() {
		if (Static333.anInt5455 % 50 == 0) {
			this.anInt3643 = this.anInt3649;
			this.anInt3645 = this.anInt3644;
			this.anInt3649 = 0;
			this.anInt3644 = 0;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V")
	public void method3272() {
		this.aClass339_17.method7700();
		this.anInt3640 = 0;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(B)V")
	public void method3273() throws IOException {
		if (this.aClass348_1 == null || this.anInt3640 <= 0) {
			return;
		}
		this.aClass2_Sub21_6.anInt8388 = 0;
		while (true) {
			@Pc(23) Class2_Sub19 local23 = (Class2_Sub19) this.aClass339_17.method7699(65280);
			if (local23 == null || local23.anInt2989 > this.aClass2_Sub21_6.aByteArray93.length - this.aClass2_Sub21_6.anInt8388) {
				this.aClass348_1.method7931(this.aClass2_Sub21_6.aByteArray93, this.aClass2_Sub21_6.anInt8388);
				this.anInt3647 = 0;
				this.anInt3649 += this.aClass2_Sub21_6.anInt8388;
				break;
			}
			this.aClass2_Sub21_6.method7386(local23.anInt2989, local23.aClass2_Sub21_Sub2_1.aByteArray93, 0);
			this.anInt3640 -= local23.anInt2989;
			local23.method9457();
			local23.aClass2_Sub21_Sub2_1.method7365();
			local23.method2768();
		}
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)V")
	public void method3274() {
		if (this.aClass348_1 != null) {
			this.aClass348_1.method7926();
			this.aClass348_1 = null;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILclient!fk;)V")
	public void method3275(@OriginalArg(1) Class2_Sub19 arg0) {
		this.aClass339_17.method7711(arg0);
		arg0.anInt2989 = arg0.aClass2_Sub21_Sub2_1.anInt8388;
		arg0.aClass2_Sub21_Sub2_1.anInt8388 = 0;
		this.anInt3640 += arg0.anInt2989;
	}
}
