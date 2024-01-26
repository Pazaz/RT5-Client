import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class372 {

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
	private int anInt9613 = -1;

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
	private int anInt9615 = 0;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "Lclient!sia;")
	private Class339 aClass339_69 = new Class339();

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "Z")
	public boolean aBoolean737 = false;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
	private final int anInt9610;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
	private final int anInt9612;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "[Lclient!iia;")
	private Class2_Sub27[] aClass2_Sub27Array1;

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(III)V")
	public Class372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9610 = arg0;
		this.anInt9612 = arg1;
		this.aClass2_Sub27Array1 = new Class2_Sub27[this.anInt9612];
		this.anIntArrayArrayArray20 = new int[this.anInt9610][3][arg2];
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
	public void method8449() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt9610; local15++) {
			this.anIntArrayArrayArray20[local15][0] = null;
			this.anIntArrayArrayArray20[local15][1] = null;
			this.anIntArrayArrayArray20[local15][2] = null;
			this.anIntArrayArrayArray20[local15] = null;
		}
		this.anIntArrayArrayArray20 = null;
		this.aClass2_Sub27Array1 = null;
		this.aClass339_69.method7700();
		this.aClass339_69 = null;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[[I")
	public int[][] method8450(@OriginalArg(0) int arg0) {
		if (this.anInt9610 == this.anInt9612) {
			this.aBoolean737 = this.aClass2_Sub27Array1[arg0] == null;
			this.aClass2_Sub27Array1[arg0] = Static528.aClass2_Sub27_1;
			return this.anIntArrayArrayArray20[arg0];
		} else if (this.anInt9610 == 1) {
			this.aBoolean737 = this.anInt9613 != arg0;
			this.anInt9613 = arg0;
			return this.anIntArrayArrayArray20[0];
		} else {
			@Pc(78) Class2_Sub27 local78 = this.aClass2_Sub27Array1[arg0];
			if (local78 == null) {
				this.aBoolean737 = true;
				if (this.anInt9615 < this.anInt9610) {
					local78 = new Class2_Sub27(arg0, this.anInt9615);
					this.anInt9615++;
				} else {
					@Pc(111) Class2_Sub27 local111 = (Class2_Sub27) this.aClass339_69.method7708();
					local78 = new Class2_Sub27(arg0, local111.anInt4352);
					this.aClass2_Sub27Array1[local111.anInt4356] = null;
					local111.method9457();
				}
				this.aClass2_Sub27Array1[arg0] = local78;
			} else {
				this.aBoolean737 = false;
			}
			this.aClass339_69.method7697(local78);
			return this.anIntArrayArrayArray20[local78.anInt4352];
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)[[[I")
	public int[][][] method8451() {
		if (this.anInt9612 != this.anInt9610) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(20) int local20 = 0; local20 < this.anInt9610; local20++) {
			this.aClass2_Sub27Array1[local20] = Static528.aClass2_Sub27_1;
		}
		return this.anIntArrayArrayArray20;
	}
}
