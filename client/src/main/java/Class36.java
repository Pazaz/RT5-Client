import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class36 {

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "Lclient!ss;")
	private ParticleNode aClass12_10;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "Lclient!ss;")
	private final ParticleNode aClass12_9 = new ParticleNode();

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
	public Class36() {
		this.aClass12_9.next = this.aClass12_9;
		this.aClass12_9.prev = this.aClass12_9;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Z")
	public boolean method1414() {
		return this.aClass12_9.next == this.aClass12_9;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)Lclient!ss;")
	public ParticleNode method1415() {
		@Pc(15) ParticleNode local15 = this.aClass12_9.next;
		if (local15 == this.aClass12_9) {
			this.aClass12_10 = null;
			return null;
		} else {
			this.aClass12_10 = local15.next;
			return local15;
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V")
	public void method1416() {
		while (true) {
			@Pc(9) ParticleNode local9 = this.aClass12_9.next;
			if (this.aClass12_9 == local9) {
				this.aClass12_10 = null;
				return;
			}
			local9.method5684();
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)Lclient!ss;")
	public ParticleNode method1417() {
		@Pc(7) ParticleNode local7 = this.aClass12_9.prev;
		if (this.aClass12_9 == local7) {
			this.aClass12_10 = null;
			return null;
		} else {
			this.aClass12_10 = local7.prev;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!ss;)V")
	public void method1418(@OriginalArg(1) ParticleNode arg0) {
		if (arg0.prev != null) {
			arg0.method5684();
		}
		arg0.prev = this.aClass12_9.prev;
		arg0.next = this.aClass12_9;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(B)I")
	public int method1419() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) ParticleNode local16 = this.aClass12_9.next; local16 != this.aClass12_9; local16 = local16.next) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)Lclient!ss;")
	public ParticleNode method1420() {
		@Pc(6) ParticleNode local6 = this.aClass12_10;
		if (this.aClass12_9 == local6) {
			this.aClass12_10 = null;
			return null;
		} else {
			this.aClass12_10 = local6.next;
			return local6;
		}
	}

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "(B)Lclient!ss;")
	public ParticleNode method1424() {
		@Pc(13) ParticleNode local13 = this.aClass12_9.next;
		if (this.aClass12_9 == local13) {
			return null;
		} else {
			local13.method5684();
			return local13;
		}
	}
}
