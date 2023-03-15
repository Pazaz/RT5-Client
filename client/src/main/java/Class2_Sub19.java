import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class2_Sub19 extends Node {

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "Lclient!nh;")
	public Player aClass11_Sub5_Sub2_Sub1_2;

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
	public int anInt2894;

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
	public int anInt2896;

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
	public int anInt2897;

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "Lclient!qn;")
	public Class2_Sub12_Sub4 aClass2_Sub12_Sub4_2;

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "Z")
	public boolean aBoolean204;

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
	public int anInt2899;

	@OriginalMember(owner = "client!jc", name = "B", descriptor = "Lclient!oe;")
	public Npc aClass11_Sub5_Sub2_Sub2_1;

	@OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
	public int anInt2901;

	@OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
	public int anInt2903;

	@OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
	public int anInt2904;

	@OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
	public int anInt2905;

	@OriginalMember(owner = "client!jc", name = "K", descriptor = "Lclient!qn;")
	public Class2_Sub12_Sub4 aClass2_Sub12_Sub4_3;

	@OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
	public int anInt2906;

	@OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
	public int anInt2907;

	@OriginalMember(owner = "client!jc", name = "O", descriptor = "Lclient!ct;")
	public LocType aClass41_1;

	@OriginalMember(owner = "client!jc", name = "P", descriptor = "[I")
	public int[] anIntArray181;

	@OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
	public int anInt2910;

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
	public int anInt2900 = 0;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V")
	public void method2941() {
		@Pc(8) int local8 = this.anInt2894;
		if (this.aClass41_1 != null) {
			@Pc(88) LocType local88 = this.aClass41_1.method1533(Static214.aClass226_1);
			if (local88 == null) {
				this.anInt2894 = -1;
				this.anInt2903 = 0;
				this.anInt2906 = 0;
				this.anIntArray181 = null;
				this.anInt2901 = 0;
				this.anInt2897 = 0;
			} else {
				this.anInt2903 = local88.anInt1334;
				this.anInt2897 = local88.anInt1315;
				this.anInt2906 = local88.anInt1320;
				this.anInt2901 = local88.anInt1307 * 128;
				this.anInt2894 = local88.anInt1325;
				this.anIntArray181 = local88.anIntArray93;
			}
		} else if (this.aClass11_Sub5_Sub2_Sub2_1 != null) {
			@Pc(42) int local42 = Static340.method5764(this.aClass11_Sub5_Sub2_Sub2_1);
			if (local42 != local8) {
				this.anInt2894 = local42;
				@Pc(52) NpcType local52 = this.aClass11_Sub5_Sub2_Sub2_1.type;
				if (local52.multiNpcs != null) {
					local52 = local52.getMultiNpc(Static214.aClass226_1);
				}
				if (local52 == null) {
					this.anInt2906 = this.anInt2901 = 0;
				} else {
					this.anInt2901 = local52.anInt2022 * 128;
					this.anInt2906 = local52.anInt2051;
				}
			}
		} else if (this.aClass11_Sub5_Sub2_Sub1_2 != null) {
			this.anInt2894 = Static384.method6415(this.aClass11_Sub5_Sub2_Sub1_2);
			this.anInt2901 = this.aClass11_Sub5_Sub2_Sub1_2.soundRadius * 128;
			this.anInt2906 = this.aClass11_Sub5_Sub2_Sub1_2.soundVolume;
		}
		if (this.anInt2894 != local8 && this.aClass2_Sub12_Sub4_3 != null) {
			client.soundStream.method2081(this.aClass2_Sub12_Sub4_3);
			this.aClass2_Sub12_Sub4_3 = null;
		}
	}
}
