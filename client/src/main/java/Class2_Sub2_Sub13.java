import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class2_Sub2_Sub13 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ip", name = "J", descriptor = "I")
	public int anInt4552 = 0;

	@OriginalMember(owner = "client!ip", name = "L", descriptor = "I")
	public int anInt4559 = 12800;

	@OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
	public int anInt4560 = 12800;

	@OriginalMember(owner = "client!ip", name = "B", descriptor = "Z")
	public boolean aBoolean354 = true;

	@OriginalMember(owner = "client!ip", name = "I", descriptor = "I")
	public int anInt4562 = 0;

	@OriginalMember(owner = "client!ip", name = "N", descriptor = "I")
	public int anInt4561 = -1;

	@OriginalMember(owner = "client!ip", name = "w", descriptor = "I")
	public int anInt4564 = -1;

	@OriginalMember(owner = "client!ip", name = "H", descriptor = "Ljava/lang/String;")
	public final String aString48;

	@OriginalMember(owner = "client!ip", name = "C", descriptor = "I")
	public final int anInt4556;

	@OriginalMember(owner = "client!ip", name = "A", descriptor = "I")
	public final int anInt4563;

	@OriginalMember(owner = "client!ip", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString49;

	@OriginalMember(owner = "client!ip", name = "t", descriptor = "Lclient!sia;")
	public final Class339 aClass339_26;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class2_Sub2_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString48 = arg1;
		this.anInt4561 = arg4;
		this.anInt4556 = arg3;
		this.anInt4564 = arg6;
		this.anInt4563 = arg0;
		this.aBoolean354 = arg5;
		this.aString49 = arg2;
		if (this.anInt4564 == 255) {
			this.anInt4564 = 0;
		}
		this.aClass339_26 = new Class339();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(III[I)Z")
	public boolean method4085(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(23) Class2_Sub56 local23 = (Class2_Sub56) this.aClass339_26.method7699(65280); local23 != null; local23 = (Class2_Sub56) this.aClass339_26.method7706()) {
			if (local23.method8914(arg0, arg1)) {
				local23.method8907(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BII)Z")
	public boolean method4086(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(17) Class2_Sub56 local17 = (Class2_Sub56) this.aClass339_26.method7699(65280); local17 != null; local17 = (Class2_Sub56) this.aClass339_26.method7706()) {
			if (local17.method8914(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I[IIII)Z")
	public boolean method4088(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class2_Sub56 local15 = (Class2_Sub56) this.aClass339_26.method7699(65280); local15 != null; local15 = (Class2_Sub56) this.aClass339_26.method7706()) {
			if (local15.method8912(arg1, arg2, arg3)) {
				local15.method8907(arg0, arg3, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
	public void method4090() {
		this.anInt4562 = 0;
		this.anInt4560 = 12800;
		this.anInt4559 = 12800;
		this.anInt4552 = 0;
		for (@Pc(28) Class2_Sub56 local28 = (Class2_Sub56) this.aClass339_26.method7699(65280); local28 != null; local28 = (Class2_Sub56) this.aClass339_26.method7706()) {
			if (local28.anInt10275 < this.anInt4559) {
				this.anInt4559 = local28.anInt10275;
			}
			if (this.anInt4552 < local28.anInt10270) {
				this.anInt4552 = local28.anInt10270;
			}
			if (this.anInt4562 < local28.anInt10265) {
				this.anInt4562 = local28.anInt10265;
			}
			if (this.anInt4560 > local28.anInt10266) {
				this.anInt4560 = local28.anInt10266;
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBI[I)Z")
	public boolean method4091(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(9) Class2_Sub56 local9 = (Class2_Sub56) this.aClass339_26.method7699(65280); local9 != null; local9 = (Class2_Sub56) this.aClass339_26.method7706()) {
			if (local9.method8910(arg0, arg1)) {
				local9.method8913(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}
}
