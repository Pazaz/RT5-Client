import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class MaterialManager {

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
	private int anInt2490 = 0;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
	private int anInt2491 = 0;

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "Lclient!kq;")
	private Class8 aClass8_1 = null;

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_14;

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "Lclient!fs;")
	private final Class76 aClass76_3;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "[Lclient!cd;")
	private final MaterialRenderer[] renderers;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!bf;)V")
	public MaterialManager(@OriginalArg(0) Class19_Sub1 arg0) {
		this.aClass19_Sub1_14 = arg0;
		this.aClass76_3 = new Class76(arg0);
		this.renderers = new MaterialRenderer[9];
		this.renderers[1] = new MaterialRenderer1(arg0);
		this.renderers[2] = new MaterialRenderer2(arg0, this.aClass76_3);
		this.renderers[4] = new MaterialRenderer4(arg0, this.aClass76_3);
		this.renderers[5] = new MaterialRenderer5(arg0, this.aClass76_3);
		this.renderers[6] = new MaterialRenderer6(arg0);
		this.renderers[7] = new MaterialRenderer7(arg0);
		this.renderers[3] = new MaterialRenderer3(arg0);
		this.renderers[8] = this.renderers[4];
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZI)V")
	public void method2504(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2490 != 0 & (arg1 != this.anInt2491 | arg0)) {
			this.renderers[Integer.MAX_VALUE & this.anInt2490].method5712(arg1);
			this.anInt2491 = arg1;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZIZI)V")
	public void method2505(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = arg0 & this.aClass19_Sub1_14.method2805();
		if (!local5 && (arg2 == 4 || arg2 == 8)) {
			arg2 = 2;
		}
		if (arg2 != 0 && arg1) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt2490) {
			if (this.anInt2490 != 0) {
				this.renderers[Integer.MAX_VALUE & this.anInt2490].method5715();
			}
			if (arg2 != 0) {
				this.renderers[Integer.MAX_VALUE & arg2].method5714(arg1);
				this.renderers[Integer.MAX_VALUE & arg2].method5713(arg1);
			}
			this.anInt2490 = arg2;
			this.aClass8_1 = null;
			this.anInt2491 = Integer.MIN_VALUE;
		} else if (this.anInt2490 != 0) {
			this.renderers[Integer.MAX_VALUE & this.anInt2490].method5713(arg1);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZ)Z")
	public boolean method2506() {
		return this.renderers[3].method5711();
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!kq;I)Z")
	public boolean method2507(@OriginalArg(0) Class8 arg0) {
		if (this.anInt2490 == 0) {
			return false;
		}
		if (arg0 != this.aClass8_1) {
			this.renderers[this.anInt2490 & Integer.MAX_VALUE].method5710(arg0);
			this.aClass8_1 = arg0;
		}
		return true;
	}
}
