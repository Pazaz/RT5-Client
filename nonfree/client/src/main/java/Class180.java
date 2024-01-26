import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ija")
public final class Class180 {

	@OriginalMember(owner = "client!ija", name = "h", descriptor = "I")
	private int anInt4368 = -1;

	@OriginalMember(owner = "client!ija", name = "t", descriptor = "I")
	private int anInt4369 = 0;

	@OriginalMember(owner = "client!ija", name = "c", descriptor = "Lclient!sia;")
	private Class339 aClass339_25 = new Class339();

	@OriginalMember(owner = "client!ija", name = "o", descriptor = "Z")
	public boolean aBoolean338 = false;

	@OriginalMember(owner = "client!ija", name = "f", descriptor = "I")
	private final int anInt4373;

	@OriginalMember(owner = "client!ija", name = "p", descriptor = "I")
	private final int anInt4372;

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "[Lclient!v;")
	private Class2_Sub54[] aClass2_Sub54Array1;

	@OriginalMember(owner = "client!ija", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray104;

	@OriginalMember(owner = "client!ija", name = "<init>", descriptor = "(III)V")
	public Class180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4373 = arg0;
		this.anInt4372 = arg1;
		this.aClass2_Sub54Array1 = new Class2_Sub54[this.anInt4372];
		this.anIntArrayArray104 = new int[this.anInt4373][arg2];
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(B)[[I")
	public int[][] method3932() {
		if (this.anInt4373 != this.anInt4372) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(32) int local32 = 0; local32 < this.anInt4373; local32++) {
			this.aClass2_Sub54Array1[local32] = Static405.aClass2_Sub54_1;
		}
		return this.anIntArrayArray104;
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(I)V")
	public void method3934() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4373; local3++) {
			this.anIntArrayArray104[local3] = null;
		}
		if (-113 < -119) {
			this.method3932();
		}
		this.aClass2_Sub54Array1 = null;
		this.anIntArrayArray104 = null;
		this.aClass339_25.method7700();
		this.aClass339_25 = null;
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(II)[I")
	public int[] method3935(@OriginalArg(1) int arg0) {
		if (this.anInt4373 == this.anInt4372) {
			this.aBoolean338 = this.aClass2_Sub54Array1[arg0] == null;
			this.aClass2_Sub54Array1[arg0] = Static405.aClass2_Sub54_1;
			return this.anIntArrayArray104[arg0];
		} else if (this.anInt4373 == 1) {
			this.aBoolean338 = this.anInt4368 != arg0;
			this.anInt4368 = arg0;
			return this.anIntArrayArray104[0];
		} else {
			@Pc(34) Class2_Sub54 local34 = this.aClass2_Sub54Array1[arg0];
			if (local34 == null) {
				this.aBoolean338 = true;
				if (this.anInt4369 >= this.anInt4373) {
					@Pc(59) Class2_Sub54 local59 = (Class2_Sub54) this.aClass339_25.method7708();
					local34 = new Class2_Sub54(arg0, local59.anInt9846);
					this.aClass2_Sub54Array1[local59.anInt9844] = null;
					local59.method9457();
				} else {
					local34 = new Class2_Sub54(arg0, this.anInt4369);
					this.anInt4369++;
				}
				this.aClass2_Sub54Array1[arg0] = local34;
			} else {
				this.aBoolean338 = false;
			}
			this.aClass339_25.method7697(local34);
			return this.anIntArrayArray104[local34.anInt9846];
		}
	}
}
