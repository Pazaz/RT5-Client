import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class StockMarketOffer {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "I")
	public int item;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "I")
	public int completedCount;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "I")
	public int price;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "I")
	public int count;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "B")
	private byte statusAndType;

	@OriginalMember(owner = "client!q", name = "m", descriptor = "I")
	public int completedGold;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
	public StockMarketOffer() {
	}

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!bt;)V")
	public StockMarketOffer(@OriginalArg(0) Packet arg0) {
		this.statusAndType = arg0.g1b();
		this.item = arg0.g2();
		this.price = arg0.g4();
		this.count = arg0.g4();
		this.completedCount = arg0.g4();
		this.completedGold = arg0.g4();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)I")
	public int getStatus() {
		return this.statusAndType & 0x7;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(B)I")
	public int getType() {
		return (this.statusAndType & 0x8) == 8 ? 1 : 0;
	}
}
