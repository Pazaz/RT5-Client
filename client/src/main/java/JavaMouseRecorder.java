import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public final class JavaMouseRecorder extends MouseRecorder {

	@OriginalMember(owner = "client!rp", name = "D", descriptor = "J")
	public long aLong175;

	@OriginalMember(owner = "client!rp", name = "E", descriptor = "I")
	public int anInt5764;

	@OriginalMember(owner = "client!rp", name = "H", descriptor = "I")
	public int anInt5766;

	@OriginalMember(owner = "client!rp", name = "M", descriptor = "I")
	public int anInt5770;

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(Z)I")
	@Override
	public int method5247() {
		return this.anInt5764;
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(B)I")
	@Override
	public int getX() {
		return this.anInt5766;
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)I")
	@Override
	public int getY() {
		return this.anInt5770;
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(B)J")
	@Override
	public long getTime() {
		return this.aLong175;
	}
}
