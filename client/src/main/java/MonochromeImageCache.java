import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class MonochromeImageCache {

	@OriginalMember(owner = "client!hl", name = "J", descriptor = "Lclient!se;")
	public static final MonochromeImageCacheEntry VALID = new MonochromeImageCacheEntry(0, 0);
	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	private int size = 0;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	private int singleRow = -1;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "Lclient!ld;")
	private LinkedList recentlyUsed = new LinkedList();

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Z")
	public boolean invalid = false;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	private final int capacity;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	private final int height;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "[[I")
	private int[][] pixels;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[Lclient!se;")
	private MonochromeImageCacheEntry[] entries;

	static {
		new LocalizedString("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(III)V")
	public MonochromeImageCache(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.capacity = arg0;
		this.height = arg1;
		this.pixels = new int[this.capacity][arg2];
		this.entries = new MonochromeImageCacheEntry[this.height];
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public void clear() {
		for (@Pc(3) int local3 = 0; local3 < this.capacity; local3++) {
			this.pixels[local3] = null;
		}
		this.entries = null;
		this.pixels = null;
		this.recentlyUsed.clear();
		this.recentlyUsed = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I")
	public int[] get(@OriginalArg(0) int row) {
		if (this.height == this.capacity) {
			this.invalid = this.entries[row] == null;
			this.entries[row] = VALID;
			return this.pixels[row];
		} else if (this.capacity == 1) {
			this.invalid = this.singleRow != row;
			this.singleRow = row;
			return this.pixels[0];
		} else {
			@Pc(27) MonochromeImageCacheEntry local27 = this.entries[row];
			if (local27 == null) {
				this.invalid = true;
				if (this.size >= this.capacity) {
					@Pc(52) MonochromeImageCacheEntry local52 = (MonochromeImageCacheEntry) this.recentlyUsed.tail();
					local27 = new MonochromeImageCacheEntry(row, local52.index);
					this.entries[local52.row] = null;
					local52.unlink();
				} else {
					local27 = new MonochromeImageCacheEntry(row, this.size);
					this.size++;
				}
				this.entries[row] = local27;
			} else {
				this.invalid = false;
			}
			this.recentlyUsed.addHead(local27);
			return this.pixels[local27.index];
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)[[I")
	public int[][] method3998() {
		if (this.capacity != this.height) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.capacity; local21++) {
			this.entries[local21] = VALID;
		}
		return this.pixels;
	}
}
